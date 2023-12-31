package io.jpress.module.article.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseArticleMetaRecord<M extends BaseArticleMetaRecord<M>> extends JbootModel<M> implements IBean {

	public void setId(Long id) {
		set("id", id);
	}
	
	public Long getId() {
		return getLong("id");
	}

	public void setArticleId(Long articleId) {
		set("article_id", articleId);
	}
	
	public Long getArticleId() {
		return getLong("article_id");
	}

	public void setFieldName(String fieldName) {
		set("field_name", fieldName);
	}
	
	public String getFieldName() {
		return getStr("field_name");
	}

	public void setValue(String value) {
		set("value", value);
	}
	
	public String getValue() {
		return getStr("value");
	}

}
