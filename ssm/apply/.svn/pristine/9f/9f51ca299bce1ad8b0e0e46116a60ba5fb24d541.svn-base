package org.ssm.apply.web.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.core.convert.converter.Converter;

/******************************
 * 
 * @author xiaoyi
 * 自定义全局类型转换器
 *
 */
public class DateTypeConverter implements Converter<String, Date> {

	
	private Logger logger = Logger.getLogger(DateTypeConverter.class);
	
	@Override
	public Date convert(String source) {
		logger.info("====自定义类型转换===convert====");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date mydata = new Date();
		try {
			mydata = dateFormat.parse(source);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mydata;
	}

	
	
	
	
}
