package com.spycesoftware.bonzi;

public class Main {
	
		public static void main(String args[]){
			
			Bonzi bonzi = new Bonzi();
			bonzi.init();
				if(args.length >= 1){
					if(args[0].equalsIgnoreCase("instant")){
						bonzi.expandDong();
			
					}
				}
		}
}
