package src.main.test;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import src.main.java.Sample;

import static org.junit.jupiter.api.Assertions.*;

/**
 * {@link Sample}のテストクラス
 *
 * @author yk
 */
@Nested
public class SampleTest {
	@Nested
	public class printMsgのテストクラス {
		@Test
		public void 引数で渡したString文字列が返却されること() {
			// テスト対象クラス準備
			Sample testSample = new Sample();
			// 期待結果
			String expectedMsg = "期待結果";
			// テスト実行
			String actualMsg = testSample.printMsg(expectedMsg);
			// 検証
			assertEquals(expectedMsg, actualMsg);
		}
	}
}