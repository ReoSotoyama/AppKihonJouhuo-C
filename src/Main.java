import java.util.Scanner;

public class Main {

	private static Scanner scan;

	/**
	 * メイン処理
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		// スキャナーの初期化
		scan = new Scanner(System.in);

		// 回答結果
		int[] ansers = new int[6];
		ansers[0] = toi1();// 問1の回答結果
		ansers[1] = toi2();// 問2の回答結果
		ansers[2] = toi3();// 問3の回答結果
		ansers[3] = toi4();// 問4の回答結果
		ansers[4] = toi5();// 問5の回答結果
		ansers[5] = toi6();// 問6の回答結果

		// それぞれの回答結果のまとめ処理

	}

	/**
	 * 問1
	 *
	 * @return
	 */
	public static int toi1() {
		// 回答番号
		int answer = 0;
		// 解答欄
		String[] kaitouList = new String[] { "犬派", "猫派", "サーバルキャット派" };

		// 質問内容を表示
		System.out.println("問1");
		System.out.println("あなたは犬派ですか？それとも猫派ですか？");

		// 解答欄を表示
		for (int i = 0; i < kaitouList.length; i++) {
			System.out.println("" + i + ":" + kaitouList[i]);
		}

		// ユーザーが答えを入力
		System.out.println("回答：");
		answer = Integer.valueOf(scan.next());

		// 回答結果を出力
		System.out.println("「" + kaitouList[answer] + "」が選択されました。");
		return answer;
	}

	/**
	 * 問2
	 *
	 * @return
	 */
	public static int toi2() {
		// 回答番号
		int answer = 0;

		return answer;
	}

	/**
	 * 問3
	 *
	 * @return
	 */
	public static int toi3() {
		// 回答番号
		int answer = 0;

		return answer;
	}

	/**
	 * 問4
	 *
	 * @return
	 */
	public static int toi4() {
		// 回答番号
		int answer = 0;

		return answer;
	}

	/**
	 * 問5
	 *
	 * @return
	 */
	public static int toi5() {
		// 回答番号
		int answer = 0;

		String[] kaitouList = new String[] { "委託先から定期的に受領している業務報告及びその検証結果を示している資料", "成果物の検収方法を明確にしている資料" };

		// 質問内容を表示
		System.out.println("問5");
		System.out.println("システム開発を外部委託している部門が，委託先に対する進捗管理についてシステム監査を受ける場合，提出すべき資料はどれか。");

		// 解答欄を表示
		for (int i = 0; i < kaitouList.length; i++) {
			System.out.println("" + i + ":" + kaitouList[i]);
		}

		// ユーザーが答えを入力
		System.out.println("回答：");
		answer = Integer.valueOf(scan.next());

		// 回答結果を出力
		System.out.println("「" + kaitouList[answer] + "」が選択されました。");
		if(answer == 0){
			System.out.print("正解！！");
			return 20;
		}
		else{
			System.out.print("不正解！！");
			return 0;
		}
	}

	/**
	 * 問6
	 *
	 * @return
	 */
	public static int toi6() {
		// 回答番号
		int answer = 0;

		return answer;
	}
}
