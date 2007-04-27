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

package com.liferay.portal.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.persistence.LayoutPK;

/**
 * <a href="LayoutModel.java.html"><b><i>View Source</i></b></a>
 *
 * <p>
 * ServiceBuilder generated this class. Modifications in this class will be overwritten
 * the next time is generated.
 * </p>
 *
 * <p>
 * This interface is a model that represents the <code>Layout</code> table in the
 * database.
 * </p>
 *
 * @author Brian Wing Shun Chan
 *
 * @see com.liferay.portal.service.model.Layout
 * @see com.liferay.portal.service.model.impl.LayoutImpl
 * @see com.liferay.portal.service.model.impl.LayoutModelImpl
 *
 */
public interface LayoutModel extends BaseModel {
	public LayoutPK getPrimaryKey();

	public void setPrimaryKey(LayoutPK pk);

	public String getLayoutId();

	public void setLayoutId(String layoutId);

	public String getOwnerId();

	public void setOwnerId(String ownerId);

	public long getCompanyId();

	public void setCompanyId(long companyId);

	public String getParentLayoutId();

	public void setParentLayoutId(String parentLayoutId);

	public String getName();

	public void setName(String name);

	public String getTitle();

	public void setTitle(String title);

	public String getType();

	public void setType(String type);

	public String getTypeSettings();

	public void setTypeSettings(String typeSettings);

	public boolean getHidden();

	public boolean isHidden();

	public void setHidden(boolean hidden);

	public String getFriendlyURL();

	public void setFriendlyURL(String friendlyURL);

	public boolean getIconImage();

	public boolean isIconImage();

	public void setIconImage(boolean iconImage);

	public String getThemeId();

	public void setThemeId(String themeId);

	public String getColorSchemeId();

	public void setColorSchemeId(String colorSchemeId);

	public String getCss();

	public void setCss(String css);

	public int getPriority();

	public void setPriority(int priority);
}