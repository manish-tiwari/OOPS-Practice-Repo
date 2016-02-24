package manish.criti.practice;

public class Split {

	private static boolean includeFingerPrintTemplate;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String displayValue="2DBARCODE,Y";
//		String[] updatedDisplayValue =displayValue.split(",", displayValue.indexOf(",")+1);
//		System.out.println(updatedDisplayValue);
		
		
		
		
		System.out.println("capturedImage is found null in ApplicantFingerPrintsInfo which is unexpected ... !!!\nbarcode will not be appended to the generated 2DBarcode String");
		String displayValue="2DBARCODE";
		String containsComma=displayValue.contains(",")?displayValue.substring(0, displayValue.indexOf(',')):displayValue;
		System.out.println("containsComma="+containsComma+" new line\n");
		System.out.println(displayValue.contains(","));;
		
		System.out.println("if it contains  , --->"+displayValue.charAt(displayValue.length()-2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		String processedDisplayValue = null;
		System.out.println(displayValue.substring(displayValue.indexOf(",")+1));
		
//		int count=0;
//		for (String str : displayValue.split(",")) {
//			switch (count) {
//			case 0:processedDisplayValue=str;
//					count++;
//				break;
//			case 1:if (str.equalsIgnoreCase("Y")) {
//				includeFingerPrintTemplate=true;
//			} else {
//				includeFingerPrintTemplate=false;
//			}
//			count=0;
//			default:
//				break;
//			}
//			
//		}
//		System.out.println("processedDisplayValue-->"+processedDisplayValue);
//		System.out.println("includeFingerPrintTemplate-->"+includeFingerPrintTemplate);
	}

}
