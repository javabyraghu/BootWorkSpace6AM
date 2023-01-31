package com.app.raghu.generator;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class MyCustGen implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {

		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyy");
		String dte = sdf.format(new Date());
		int rand = Math.abs(new Random().nextInt());

		return "EMP:" + dte + "-" + rand;
	}
}
