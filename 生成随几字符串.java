for (int i=0;i<2;i++) {
	    	                               
	    			int s=(int)(Math.random()*(74)+48);
	    			
	    			if (s<57|(65<s&s<90)|(s>96&s<122)) {
	    	      //  d=(char)s;
	    			d[i] = (char)s;
	    			
	    			}
	    		//	System.out.print((char)s);
	    			else {
	    				i--;
	    			}
	    		
	    			}
	    		ch [l]=String.valueOf(new char[] {d[0],d[1]});
