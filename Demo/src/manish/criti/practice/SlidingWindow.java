package manish.criti.practice;


public class SlidingWindow {
	
	private int [] arrayElements ={ 7, 9, 3, 2, 6, 5,8,6,45,98,70,89,58 };
	
	public void checkMaxNumber(int windowSize){
		for(int i=0;i<=(arrayElements.length)-windowSize;i++){
			int value =0;
			for(int j=1; j<windowSize+i;j++){
				if(arrayElements[i]<=arrayElements[j]){
					value= arrayElements[j];
					if(value<=arrayElements[j]){
						value=arrayElements[j];
					}
				}else{
					if(value<arrayElements[1]){
						value=arrayElements[i];
					}
				}
			}
			System.out.println("Max value for Given Windows are :"+" "+value);
		}
	}
	
	public static void main(String [] args){
		SlidingWindow windowInstance = new SlidingWindow();
		windowInstance.checkMaxNumber(3);
	}

}

