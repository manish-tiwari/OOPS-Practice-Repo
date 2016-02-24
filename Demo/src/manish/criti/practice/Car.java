package manish.criti.practice;

public enum Car {
	AUDI {
		@Override
		public int getPrice() {
			return 25000;
		}
		
//		@Override
//		public String getName() {
//			// TODO Auto-generated method stub
//			return null;
//		}
		
	},
	MERCEDES {
		@Override
		public int getPrice() {
			return 30000;
		}
//		@Override
//		public String getName() {
//			// TODO Auto-generated method stub
//			return null;
//		}
	},
	BMW {
		@Override
		public int getPrice() {
			return 20000;
		}
//		@Override
//		public String getName() {
//			// TODO Auto-generated method stub
//			return null;
//		}
	};
	
	public String toString() {
		switch (this) {
		case AUDI:
			return "Audi Description";
			
		case BMW:
			return "BMW Description";
		
		case MERCEDES:
			return "MERCEDES Description";
		default:
			return "No Car ? go by local dude... !!!";
		}
		
	}
	
	public abstract int getPrice();

	
}
