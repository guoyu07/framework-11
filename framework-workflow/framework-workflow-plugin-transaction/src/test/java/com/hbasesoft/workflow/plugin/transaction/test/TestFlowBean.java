/**************************************************************************************** 
 Copyright © 2003-2012 hbasesoft Corporation. All rights reserved. Reproduction or       <br>
 transmission in whole or in part, in any form or by any means, electronic, mechanical <br>
 or otherwise, is prohibited without the prior written consent of the copyright owner. <br>
 ****************************************************************************************/
package com.hbasesoft.workflow.plugin.transaction.test;

import com.hbasesoft.framework.workflow.core.FlowBean;

/**
 * <Description> <br>
 * 
 * @author 王伟<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2017年9月5日 <br>
 * @since V1.0<br>
 * @see com.hbasesoft.workflow.plugin.transaction.test <br>
 */
public class TestFlowBean extends FlowBean {

    /**
     * serialVersionUID <br>
     */
    private static final long serialVersionUID = 2579195569747862978L;

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
