package exam3;
public class E3_10 {
	private static final String ATTENDANNCE = "◦";
	public static void main(String[] args) {
		String[][] attendanceData = {{"◦","／","◦","◦","◦"},{"◦","◦","◦","◦","◦","◦"},{"◦","◦","◦","◦","×"},{"◦","◦","◦","◦","◦"},{"×","×","×","×","◦"}};
		for (int i=0;i<attendanceData.length;i++) {
			boolean prefectAttendanceFlg = true;
			for(int j=0;j<attendanceData[i].length;j++) {
				if(prefectAttendanceFlg&&ATTENDANNCE.equals(attendanceData[i][j])) {
					prefectAttendanceFlg=false;
					break;
				}
		}
		if (prefectAttendanceFlg) {
			System.out.print((i+1)+",");
		}
		
	}
}
}
