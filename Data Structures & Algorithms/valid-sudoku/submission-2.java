class Solution {
    public boolean isValidSudoku(char[][] grid) {
        Set<Character> box[]=new HashSet[9];
        Set<Character> rows[]=new HashSet[9];
        Set<Character> cols[]=new HashSet[9];
        for(int i=0;i<9;i++){
            box[i]=new HashSet<>();
            rows[i]=new HashSet<>();
            cols[i]=new HashSet<>();
        }

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(grid[i][j]!='.'){
                    if(rows[i].contains(grid[i][j])){
                        return false;
                    }
                    else{
                        rows[i].add(grid[i][j]);
                    }
                    if(cols[j].contains(grid[i][j])){
                        return false;
                    }
                    else{
                        cols[j].add(grid[i][j]);
                    }
                    int x=(i/3)*3 +(j/3);
                    if(box[x].contains(grid[i][j])){
                        return false;
                    }
                    else{
                        box[x].add(grid[i][j]);
                    }
                }
            }
        }
        return true;
    }
}
