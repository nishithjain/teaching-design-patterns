class CacheManager{
	
	private static CacheManager instance;
	
	private CacheManager(){}
	
	 public static CacheManager getInstance() {

        if (instance == null) {
            instance = new CacheManager();
        } else {
            System.out.println("Reusing CacheManager");
        }
        return instance;
    }
}

class Main {
	
	public static void main(String[] args){
	    
		CacheManager.getInstance();
		System.out.println(CacheManager.getInstance());
	}
}