/**
 * @��Ŀ����ytec-mdm-ecif
 * @������com.ytec.mdm.plugins.synchelper.util
 * @�ļ�����SyncDate.java
 * @�汾��Ϣ��1.0.0
 * @���ڣ�2013-12-18-����2:59:17
 * @Copyright (c) 2013���������׳ϿƼ����޹�˾-��Ȩ����
 * 
 */
package com.ytec.mdm.plugins.synchelper.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ytec.mdm.plugins.synchelper.ISyncXmlFun;

/**
 * @��Ŀ���ƣ�ytec-mdm-ecif 
 * @�����ƣ�SyncDate
 * @����������������ʱ��ӹ�
 * @��������:
 * @�����ˣ�wangzy1@yuchengtech.com
 * @����ʱ�䣺2013-12-18 ����2:59:17   
 * @�޸��ˣ�wangzy1@yuchengtech.com
 * @�޸�ʱ�䣺2013-12-18 ����2:59:17
 * @�޸ı�ע��
 * @�޸�����		�޸���Ա		�޸�ԭ��
 * --------    --------		----------------------------------------
 * @version 1.0.0
 * @Copyright (c) 2013���������׳ϿƼ����޹�˾-��Ȩ����
 * 
 */
public class SyncDate implements ISyncXmlFun {
	private Logger log = LoggerFactory.getLogger(SyncDate.class);

	/**
	 *@���캯�� 
	 */
	public SyncDate() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @��������:��������ʱ��ӹ�
	 * @��������:ȡ��ǰ����ʱ�䣬�����ʽ��Ϊ�����еĸ�ʽ
	 * @�����뷵��˵��:
	 * 		@param Object[] arg arg[0]��ʽ���ַ���
	 * 		@return Object ʱ���ַ���
	 * @�㷨����:
	 */
	@Override
	public Object getValueByFun(Object[] arg) {
		// TODO Auto-generated method stub
		if(arg!=null && arg.length==1){
			try{
				SimpleDateFormat df = new SimpleDateFormat(arg[0].toString());
				return df.format(new Date());
			}catch(Exception e){
				log.error("����ʱ�亯���쳣",e);
			}
			return "";
		}else{
			log.warn("����ʱ�亯������Ϊ��");
			return "";
		}
	}

}