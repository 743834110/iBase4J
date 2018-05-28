package org.ibase4j.service.impl;

import org.ibase4j.mapper.SysNoticeMapper;
import org.ibase4j.model.SysNotice;
import org.ibase4j.service.SysNoticeService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import top.ibase4j.core.base.BaseServiceImpl;

/**
 * @author ShenHuaJie
 *
 */
@Service
@CacheConfig(cacheNames = "sysNotice")
public class SysNoticeServiceImpl extends BaseServiceImpl<SysNotice, SysNoticeMapper> implements SysNoticeService {

}
