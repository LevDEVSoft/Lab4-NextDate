package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv2 {

	@Test(timeout = 4000)
	public void testCreatesNextDate1() throws Throwable {
	    NextDate nextDate0 = new NextDate(910, 910, 910);
	    String string0 = nextDate0.run(5, 31, 1998);
	    assertEquals("6/1/1998", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate0() throws Throwable {
	    NextDate nextDate0 = new NextDate(1892, 1892, 1892);
	    String string0 = nextDate0.run(8, 8, 1892);
	    assertEquals("8/9/1892", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate3() throws Throwable {
	    NextDate nextDate0 = new NextDate(1875, 1875, 1875);
	    String string0 = nextDate0.run(1, 1, 1875);
	    assertEquals("1/2/1875", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate2() throws Throwable {
	    NextDate nextDate0 = new NextDate(1875, 1875, 1875);
	    String string0 = nextDate0.run(3, 3, 1875);
	    assertEquals("3/4/1875", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate5() throws Throwable {
	    NextDate nextDate0 = new NextDate(1933, 1933, 1933);
	    String string0 = nextDate0.run(2, 30, 1933);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate4() throws Throwable {
	    NextDate nextDate0 = new NextDate(1932, 1932, 1932);
	    String string0 = nextDate0.run(2, 29, 1932);
	    assertEquals("3/1/1932", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate(884, 884, 884);
	    String string0 = nextDate0.run((-473), 1862, 884);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate14() throws Throwable {
	    NextDate nextDate0 = new NextDate((-460), (-460), (-460));
	    String string0 = nextDate0.run(11, 11, 1976);
	    assertEquals("11/12/1976", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate13() throws Throwable {
	    NextDate nextDate0 = new NextDate(31, 4, 4);
	    String string0 = nextDate0.run(4, 31, 2018);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate16() throws Throwable {
	    NextDate nextDate0 = new NextDate(0, 0, 8);
	    String string0 = nextDate0.run(5, 1113, 5487);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate15() throws Throwable {
	    NextDate nextDate0 = new NextDate(1964, 1964, 1964);
	    String string0 = nextDate0.run(2, 28, 1964);
	    assertEquals("2/29/1964", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate18() throws Throwable {
	    NextDate nextDate0 = new NextDate(2021, 1932, 2021);
	    String string0 = nextDate0.run(1932, 371, 2019);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate17() throws Throwable {
	    NextDate nextDate0 = new NextDate(1964, 1964, 1964);
	    String string0 = nextDate0.run(2, 1, 2);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate19() throws Throwable {
	    NextDate nextDate0 = new NextDate(30, 4, 4);
	    String string0 = nextDate0.run(4, 30, 2018);
	    assertEquals("5/1/2018", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate7() throws Throwable {
	    NextDate nextDate0 = new NextDate(1922, 1922, 1922);
	    String string0 = nextDate0.run(2, 29, 1922);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate6() throws Throwable {
	    NextDate nextDate0 = new NextDate(1937, 1937, 1937);
	    String string0 = nextDate0.run(2, 28, 1937);
	    assertEquals("3/1/1937", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate9() throws Throwable {
	    NextDate nextDate0 = new NextDate(1901, 1901, 1901);
	    String string0 = nextDate0.run(7, 7, 1901);
	    assertEquals("7/7/1901", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate8() throws Throwable {
	    NextDate nextDate0 = new NextDate(1933, 1933, 1933);
	    String string0 = nextDate0.run(2, 2, 1933);
	    assertEquals("2/3/1933", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate10() throws Throwable {
	    NextDate nextDate0 = new NextDate(910, 910, 910);
	    String string0 = nextDate0.run(12, 31, 1989);
	    assertEquals("1/1/1990", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate12() throws Throwable {
	    NextDate nextDate0 = new NextDate(2021, 1932, 2021);
	    String string0 = nextDate0.run(12, 31, 2021);
	    assertEquals("Invalid Next Year", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate11() throws Throwable {
	    NextDate nextDate0 = new NextDate(884, 884, 884);
	    String string0 = nextDate0.run(12, 1, 2021);
	    assertEquals("12/2/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateAndCallsRun() throws Throwable {
	    NextDate nextDate0 = new NextDate((-473), 1801, (-473));
	    String string0 = nextDate0.run(6, 1, 2005);
	    assertEquals("6/2/2005", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NextDate nextDate0 = new NextDate((-473), 1801, (-473));
	    String string0 = nextDate0.run(6, 1, 2005);
	    assertEquals("6/2/2005", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate(893, 893, 893);
	    String string0 = nextDate0.run(1, 893, 1801);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithZeroAndNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate(1964, 1964, 1964);
	    String string0 = nextDate0.run(0, (-601), 2);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, (-473), 1875);
	    String string0 = nextDate0.run(10, 12, 1875);
	    assertEquals("10/13/1875", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
	    NextDate nextDate0 = new NextDate(1934, 1934, 1934);
	    String string0 = nextDate0.run(9, 9, 1934);
	    assertEquals("9/10/1934", string0);
	}

}