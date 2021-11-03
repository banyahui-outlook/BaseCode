package com.ban.rule;

import com.alibaba.cloud.nacos.NacosDiscoveryProperties;
import com.alibaba.cloud.nacos.NacosServiceManager;
import com.alibaba.nacos.api.naming.NamingService;
import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.BaseLoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.Server;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Properties;

public class NacosWeightLoadBalancerRule extends AbstractLoadBalancerRule {
    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    @Autowired
    private NacosDiscoveryProperties nacosDiscoveryProperties;
    @Autowired
    private NacosServiceManager nacosServiceManager;
    @Override
    public Server choose(Object o) {
        String serviceName = nacosDiscoveryProperties.getService();

        return new Server("", 80);
    }
}
