package com.demo.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import com.demo.commands.ContentForm;
import com.demo.domain.Content;

@Component
public class ContentDataToContentForm implements Converter<Content,ContentForm> {

	@Override
	public ContentForm	 convert(Content data) {
	
		ContentForm frm = new ContentForm();
		frm.setId(data.getId());	
		
		frm.setAdd_section(data.getAdd_section());
		frm.setContent_details(data.getContent_details());
		frm.setContent_summary(data.getContent_summary());
		frm.setContentType(data.getContentType());
		frm.setDrugUpdateType(data.getDrugUpdateType());
		frm.setExpireDate(data.getExpireDate());
		frm.setHeader(data.getHeader());
		frm.setId(data.getId());
		frm.setImage(data.getImage());		

		return frm;
	}

}