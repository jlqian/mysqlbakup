package com.yuanheng100.backup;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class MySQLBackupTest{
	
	@Test
	public void test(){
		//MySQLBackup.backupAndSave("root", "123456", "xiaodai", "127.0.0.1", "3306" , "UTF8", "/usr/local/mysql/", "/home/jlqian/backup/mysql/");
		MySQLBackup.backupAndSave("context-dao.xml");
	}

}
