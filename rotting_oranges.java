public static int minTimeToRot(int[][] grid, int n, int m) {
		// Write your code here.
		int count=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(grid[i][j]==1) count++;
			}
		}
		if(count == 0) return 0;
		int min=0;
		boolean flag=true;
		while(flag){
			flag=false;
			int[][] newgrid=new int[n][m];
			for(int i=0;i<n;i++){
				System.arraycopy(grid[i],0,newgrid[i],0,m);
			}
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					// newgrid[i][j]=grid[i][j];

					if(grid[i][j]==1){
						if(i>0 && grid[i-1][j]==2 ||
						i<n-1 && grid[i+1][j]==2 ||
						j>0 && grid[i][j-1]==2 ||
						j<m-1 && grid[i][j+1]==2
						){
							newgrid[i][j]=2;
							count--;
							flag=true;
						}
					}
				}
			}
			grid=newgrid;
			if(flag) min++;
		}
		return count==0?min:-1;
	}


}
