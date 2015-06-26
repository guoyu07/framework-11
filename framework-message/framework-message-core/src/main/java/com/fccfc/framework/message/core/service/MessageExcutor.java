/**************************************************************************************** 
 Copyright © 2003-2012 ZTEsoft Corporation. All rights reserved. Reproduction or       <br>
 transmission in whole or in part, in any form or by any means, electronic, mechanical <br>
 or otherwise, is prohibited without the prior written consent of the copyright owner. <br>
 ****************************************************************************************/
package com.fccfc.framework.message.core.service;

import java.util.List;

import com.fccfc.framework.common.ServiceException;
import com.fccfc.framework.message.api.Attachment;

/**
 * <Description> <br>
 * 
 * @author 王伟 <br>
 * @version 1.0 <br>
 * @CreateDate 2014年12月11日 <br>
 * @see com.fccfc.framework.message.service <br>
 */
public interface MessageExcutor {
    String sendMessage(String title, String content, String sender, String[] receiver, List<Attachment> attachments)
        throws ServiceException;
}