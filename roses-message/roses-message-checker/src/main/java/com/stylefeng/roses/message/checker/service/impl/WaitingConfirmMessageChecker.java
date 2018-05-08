package com.stylefeng.roses.message.checker.service.impl;

import com.stylefeng.roses.api.common.page.PageQuery;
import com.stylefeng.roses.api.common.page.PageResult;
import com.stylefeng.roses.api.message.model.ReliableMessage;
import com.stylefeng.roses.message.checker.consumer.MessageServiceConsumer;
import com.stylefeng.roses.message.checker.service.AbstractMessageChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 处理状态为“待确认”但已超时的消息
 *
 * @author fengshuonan
 * @date 2018-05-08 23:07
 */
@Service
public class WaitingConfirmMessageChecker extends AbstractMessageChecker {

    @Autowired
    private MessageServiceConsumer messageServiceConsumer;

    @Override
    protected void processWaitingConfirmTimeOutMessages(Map<String, ReliableMessage> messages) {

    }

    @Override
    protected PageResult<ReliableMessage> getPageResult(PageQuery pageQuery) {
        return messageServiceConsumer.listPagetWaitConfimTimeOutMessages(pageQuery);
    }

}
