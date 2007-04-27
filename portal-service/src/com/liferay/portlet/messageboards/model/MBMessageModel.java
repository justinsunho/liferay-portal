/**
 * Copyright (c) 2000-2007 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portlet.messageboards.model;

import com.liferay.portal.model.BaseModel;

import com.liferay.portlet.messageboards.service.persistence.MBMessagePK;

import java.util.Date;

/**
 * <a href="MBMessageModel.java.html"><b><i>View Source</i></b></a>
 *
 * <p>
 * ServiceBuilder generated this class. Modifications in this class will be overwritten
 * the next time is generated.
 * </p>
 *
 * <p>
 * This interface is a model that represents the <code>MBMessage</code> table in
 * the database.
 * </p>
 *
 * @author Brian Wing Shun Chan
 *
 * @see com.liferay.portlet.messageboards.service.model.MBMessage
 * @see com.liferay.portlet.messageboards.service.model.impl.MBMessageImpl
 * @see com.liferay.portlet.messageboards.service.model.impl.MBMessageModelImpl
 *
 */
public interface MBMessageModel extends BaseModel {
	public MBMessagePK getPrimaryKey();

	public void setPrimaryKey(MBMessagePK pk);

	public String getTopicId();

	public void setTopicId(String topicId);

	public String getMessageId();

	public void setMessageId(String messageId);

	public long getCompanyId();

	public void setCompanyId(long companyId);

	public long getUserId();

	public void setUserId(long userId);

	public String getUserName();

	public void setUserName(String userName);

	public Date getCreateDate();

	public void setCreateDate(Date createDate);

	public Date getModifiedDate();

	public void setModifiedDate(Date modifiedDate);

	public String getCategoryId();

	public void setCategoryId(String categoryId);

	public String getThreadId();

	public void setThreadId(String threadId);

	public String getParentMessageId();

	public void setParentMessageId(String parentMessageId);

	public String getSubject();

	public void setSubject(String subject);

	public String getBody();

	public void setBody(String body);

	public boolean getAttachments();

	public boolean isAttachments();

	public void setAttachments(boolean attachments);

	public boolean getAnonymous();

	public boolean isAnonymous();

	public void setAnonymous(boolean anonymous);
}