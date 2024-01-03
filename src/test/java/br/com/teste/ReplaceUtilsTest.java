/**
 * 
 */
package test.java.br.com.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.br.com.utils.ReplaceUtils;
public class ReplaceUtilsTest {

	@Test
	public void replaceCPF() {
		String cpf = "782.092.292-88";
		String newCpf = ReplaceUtils.replace(cpf, ".", "-");
		
		assertEquals(newCpf, "222245678");
	}
	
	@Test
	public void replaceTel() {
		String tel = "(11) 99999-9999";
		String newtel = ReplaceUtils.replace(tel, "(", ")", " ", "-");
		
		assertEquals(newtel, "1199999999");
	}
}
