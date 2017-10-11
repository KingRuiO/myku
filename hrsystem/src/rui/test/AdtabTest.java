package rui.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import rui.bean.Adtab;
import rui.dao.AdminDao;

public class AdtabTest {
	AdminDao adminDao;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAdminDao() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAdminByUserName() {
		Adtab adt = new Adtab();
		adt.setAduser("aaa");
		System.out.println(adminDao.getAdminByUserName(adt));
	}

	@Test
	public void testGetAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddadtab() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleadtab() {
		fail("Not yet implemented");
	}

}
