package com.jd.easyflow.flow.ext.cases.model.action;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jd.easyflow.flow.engine.FlowParam;
import com.jd.easyflow.flow.engine.FlowResult;
import com.jd.easyflow.flow.engine.impl.FlowEngineImpl;

/**
 * 
 * @author liyuliang5
 *
 */
public class JavaScriptNodeActionTest {
    
    private static final Logger logger = LoggerFactory.getLogger(JavaScriptNodeActionTest.class);

    /**
     * Test customize action.
     */
    @Test
    public void testLoop001() {
        FlowEngineImpl flowEngine = new FlowEngineImpl();
        flowEngine.setFlowPath("classpath:flow/cases/model/action/javascript_test_001.json");
        flowEngine.init();
        FlowParam param = new FlowParam("javascript_test_001", null);
        FlowResult result = flowEngine.execute(param);
        logger.info("javascript result:" + (result.getContext().getEndNodes()).get(0).getActionResult());
    }
    
}
