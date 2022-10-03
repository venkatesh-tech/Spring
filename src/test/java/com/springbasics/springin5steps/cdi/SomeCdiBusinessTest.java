package com.springbasics.springin5steps.cdi;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;

//@ExtendWith(MockitoExtension.class)
@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {

	@InjectMocks
	SomeCdiBusiness business;

	@Mock
	SomeCdiDao daoMock;

	@Test
	public void testBasicScenario() {

//		SomeCdiDao daoMock = mock(SomeCdiDao.class);
		// given
		when(daoMock.getData()).thenReturn(new int[] { 5, 9 });
		// when
		int actualResult = business.findGreatest();

		// then
		assertEquals(9, actualResult);

	}

}
