package com.ban.git;

// ssh/git相关
public class TGit {
    // git 生成密钥
    //      ssh-keygen -t rsa -C ""

    // ssh 远程访问
    //      ssh公钥添加至目标服务器，后续直接可授权访问目标服务器

    // git status
    // git add
    // git commit -m ""
    // git remote add origin ""
    // git remote remove origin
    // git push -u origin master

    // git branch -a
    // git branch aaa / git branch -d aaa
    // git checkout aaa

    // git merge （一股脑）使用merge命令合并分支，解决完冲突，执行git add .和git commit -m'fix conflict'。这个时候会产生一个commit。
    // git rebase 交互式）使用rebase命令合并分支，解决完冲突，执行git add .和git rebase --continue，不会产生额外的commit。这样的好处是，‘干净’，分支上不会有无意义的解决分支的commit；坏处，如果合并的分支中存在多个commit，需要重复处理多次冲突。

    // git pull和git pull --rebase区别：git pull做了两个操作分别是‘获取’和合并。所以加了rebase就是以rebase的方式进行合并分支，默认为merge。
}
