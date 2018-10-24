package com.zwj.springbootdive.service;

/**
 * 计算服务
 */
public interface CalculateService {
    /**
     * 对多个整数求和
     * @param values
     * @return
     */
    Integer sum(Integer... values);
}
