package com.ban.thread;

// 线程池
public class TThreadPool {
    //FixedThreadPool	核心线程数与最大线程数相同
    //SingleThreadExecutor	一个线程的线程池
    //CachedThreadPool	核心线程为0，最大线程数为Integer. MAX_VALUE
    //ScheduledThreadPool	指定核心线程数的定时线程池
    //SingleThreadScheduledExecutor	单例的定时线程池
    //ForkJoinPool	JDK 7 新加入的一种线程池

    // FixedThreadPool 核心线程数和最大线程数一样   使用 ThreadPoolExecutor
    //这种线程池我们可以看作是固定线程数的线程池，它只有在开始初始化的时候线程数会从0开始创建，但是创建好后就不再销毁，而是全部作为常驻线程池
    //对于这种线程池他的第三个和第四个参数是没意义，它们是空闲线程存活时间，这里都是常驻不存在销毁，当线程处理不了时会加入到阻塞队列，这是一个链表结构的有界阻塞队列，最大长度是Integer. MAX_VALUE

    // SingleThreadExecutor 核心线程数和最大线程数均为1
    //有一个重载函数，传入了一个ThreadFactory 的参数，一般在我们开发中会传入我们自定义的线程创建工厂，如果不传入则会调用默认的线程工厂
    //我们可以看到它与 FixedThreadPool 线程池的区别仅仅是核心线程数和最大线程数改为了1，也就是说不管任务多少，它只会有唯一的一个线程去执行
    //如果在执行过程中发生异常等导致线程销毁，线程池也会重新创建一个线程来执行后续的任务
    //这种线程池非常适合所有任务都需要按被提交的顺序来执行的场景，是个单线程的串行。

    // CachedThreadPool  常驻核心线程数为0
    //最大线程数为 Integer.MAX_VALUE , 意味着他的线程数几乎可以无限增加。
    //因为创建的线程都是临时线程，所以他们都会被销毁，这里空闲 线程销毁时间是60秒，也就是说当线程在60秒内没有任务执行则销毁
    //这里我们需要注意点，它使用了 SynchronousQueue 的一个阻塞队列来存储任务，这个队列是无法存储的，因为他的容量为0，它只负责对任务的传递和中转，效率会更高，因为核心线程都为0，这个队列如果存储任务不存在意义

    // ScheduledThreadPool  支持定时或者周期性执行任务
    // SingleThreadScheduledExecutor  内部只有一个线程，它只是将 ScheduledThreadPool 的核心线程数设置为了 1

    // ForkJoinPool JDK7 引入的新新线程池，它的主要特点是可以充分利用多核CPU , 可以把一个任务拆分为多个子任务，这些子任务放在不同的处理器上并行执行，当这些子任务执行结束后再把这些结果合并起来，这是一种分治思想。
    // 通过 ForkJoinPool 可以极大的发挥多核处理器的优势，尤其非常适合用于递归的场景，例如树的遍历、最优路径搜索等场景。




    // Executors 线程池工具类  线程池工厂，提供了很多的工厂方法
    //// 创建单一线程的线程池
    //public static ExecutorService newSingleThreadExecutor();
    //// 创建固定数量的线程池
    //public static ExecutorService newFixedThreadPool(int nThreads);
    //// 创建带缓存的线程池
    //public static ExecutorService newCachedThreadPool();
    //// 创建定时调度的线程池
    //public static ScheduledExecutorService newScheduledThreadPool(int corePoolSize);
    //// 创建流式（fork-join）线程池
    //public static ExecutorService newWorkStealingPool();


    // ThreadPoolExecutor 底层创建线程池
    // 参数 ：
    //corePoolSize，线程池中的核心线程数
    //maximumPoolSize，线程池中的最大线程数
    //keepAliveTime，空闲时间，当线程池数量超过核心线程数时，多余的空闲线程存活的时间，即：这些线程多久被销毁。
    //unit，空闲时间的单位，可以是毫秒、秒、分钟、小时和天，等等
    //workQueue，等待队列，线程池中的线程数超过核心线程数时，任务将放在等待队列，它是一个BlockingQueue类型的对象
    //threadFactory，线程工厂，我们可以使用它来创建一个线程
    //handler，拒绝策略，当线程池和等待队列都满了之后，需要通过该对象的回调函数进行回调处理

    //1. 等待队列-workQueue
    //等待队列是BlockingQueue类型的，
    //ArrayBlockingQueue，队列是有界的，基于数组实现的阻塞队列
    //LinkedBlockingQueue，队列可以有界，也可以无界。基于链表实现的阻塞队列
    //SynchronousQueue，不存储元素的阻塞队列，每个插入操作必须等到另一个线程调用移除操作，否则插入操作将一直处于阻塞状态。该队列也是Executors.newCachedThreadPool()的默认队列
    //PriorityBlockingQueue，带优先级的无界阻塞队列
    //通常情况下，我们需要指定阻塞队列的上界（比如1024）。另外，如果执行的任务很多，我们可能需要将任务进行分类，然后将不同分类的任务放到不同的线程池中执行。
    //2. 线程工厂-threadFactory
    //ThreadFactory是一个接口，只有一个方法。既然是线程工厂，那么我们就可以用它生产一个线程对象。来看看这个接口的定义。
    // Executors的实现使用了默认的线程工厂-DefaultThreadFactory。它的实现主要用于创建一个线程，线程的名字为pool-{poolNum}-thread-{threadNum}。
    //3. 拒绝策略-handler
    //所谓拒绝策略，就是当线程池满了、队列也满了的时候，我们对任务采取的措施。或者丢弃、或者执行、或者其他...
    //CallerRunsPolicy // 在调用者线程执行
    //AbortPolicy // 直接抛出RejectedExecutionException异常
    //DiscardPolicy // 任务直接丢弃，不做任何处理
    //DiscardOldestPolicy // 丢弃队列里最旧的那个任务，再尝试执行当前任务
    //这四种策略各有优劣，比较常用的是DiscardPolicy，但是这种策略有一个弊端就是任务执行的轨迹不会被记录下来。所以，我们往往需要实现自定义的拒绝策略， 通过实现RejectedExecutionHandler接口的方式。



    // 往线程池中提交任务，主要有两种方法，execute()和submit()。
    // execute()用于提交不需要返回结果的任务
    // submit()用于提交一个需要返回果的任务。该方法返回一个Future对象，通过调用这个对象的get()方法，我们就能获得返回结果。get()方法会一直阻塞，直到返回结果返回。另外，我们也可以使用它的重载方法get(long timeout, TimeUnit unit)，这个方法也会阻塞，但是在超时时间内仍然没有返回结果时，将抛出异常TimeoutException。


    //调用线程池对象的shutdown()和shutdownNow()方法来关闭线程池
    // shutdown()会将线程池状态置为SHUTDOWN，不再接受新的任务，同时会等待线程池中已有的任务执行完成再结束。
    // shutdownNow()会将线程池状态置为SHUTDOWN，对所有线程执行interrupt()操作，清空队列，并将队列中的任务返回回来。


    // ThreadPoolExecutor 方法
    //long getTaskCount()，获取已经执行或正在执行的任务数
    //long getCompletedTaskCount()，获取已经执行的任务数
    //int getLargestPoolSize()，获取线程池曾经创建过的最大线程数，根据这个参数，我们可以知道线程池是否满过
    //int getPoolSize()，获取线程池线程数
    //int getActiveCount()，获取活跃线程数（正在执行任务的线程数）
    // ThreadPoolExecutor 定义函数
    //protected void beforeExecute(Thread t, Runnable r) // 任务执行前被调用
    //protected void afterExecute(Runnable r, Throwable t) // 任务执行后被调用
    //protected void terminated() // 线程池结束后被调用



    // 任务属于IO密集型，我们可以将线程池数量设置得更多一些，比如CPU个数*2
    // Runtime.getRuntime().availableProcessors()来获取CPU的个数
    // 在使用submit()的时候一定要注意它的返回对象Future，为了避免任务执行异常被吞掉的问题，我们需要调用Future.get()方法。另外，使用execute()将不会出现这种问题。



    //https://www.cnblogs.com/i-code/p/13917733.html
}
