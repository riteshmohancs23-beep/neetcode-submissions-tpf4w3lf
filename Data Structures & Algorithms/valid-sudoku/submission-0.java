class Solution {

    public boolean isValidSudoku(char[][] grid) {
        Set<Character> box[]=new HashSet[9];
        Set<Character> rows[]=new HashSet[9];
        Set<Character> cols[]=new HashSet[9];
        // Arrays.fill(box,new HashSet<>());
        //---> should not be done ---> all the indices will point to the same object 
        // Arrays.fill(rows,new HashSet<>());
        // Arrays.fill(cols,new HashSet<>());
        for(int i=0;i<9;i++){
            box[i]=new HashSet<>();
            rows[i]=new HashSet<>();
            cols[i]=new HashSet<>();
        }
        // fill the rows 
        for(int i=0;i<9;i++){
            for(char x:grid[i]){
                if(x!='.'){
                    if(rows[i].contains(x)){
                        return false;
                    }
                    rows[i].add(x);
                }
            }
        }

        // fill the columns 
        for(int j=0;j<9;j++){
            for(int i=0;i<9;i++){
                if(grid[i][j]!='.'){
                    if(cols[j].contains(grid[i][j])){
                        return false;
                    }
                    cols[j].add(grid[i][j]);
                }
            }
        }

        // filling the boxes 
        // box 1
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(grid[i][j]!='.'){
                    if(box[0].contains(grid[i][j])){
                        return false;
                    }
                    box[0].add(grid[i][j]);
                }
            }
        }
        // box 2
        for(int i=0;i<3;i++){
            for(int j=3;j<6;j++){
                if(grid[i][j]!='.'){
                   if(box[1].contains(grid[i][j])){
                        return false;
                    }
                    box[1].add(grid[i][j]);
                }
            }
        }
        // box 3
        for(int i=0;i<3;i++){
            for(int j=6;j<9;j++){
                if(grid[i][j]!='.'){
                    if(box[2].contains(grid[i][j])){
                        return false;
                    }
                    box[2].add(grid[i][j]);
                }
            }
        }

        // box 4
        for(int i=3;i<6;i++){
            for(int j=0;j<3;j++){
                if(grid[i][j]!='.'){
                   if(box[3].contains(grid[i][j])){
                        return false;
                    }
                    box[3].add(grid[i][j]);
                }
            }
        }

        // box 5
        for(int i=3;i<6;i++){
            for(int j=3;j<6;j++){
                if(grid[i][j]!='.'){
                    if(box[4].contains(grid[i][j])){
                        return false;
                    }
                    box[4].add(grid[i][j]);
                }
            }
        }
        
        // box 6
        for(int i=3;i<6;i++){
            for(int j=6;j<9;j++){
                if(grid[i][j]!='.'){
                    if(box[5].contains(grid[i][j])){
                        return false;
                    }
                    box[5].add(grid[i][j]);
                }
            }
        }
        // box 7
        for(int i=6;i<9;i++){
            for(int j=0;j<3;j++){
                if(grid[i][j]!='.'){
                    if(box[6].contains(grid[i][j])){
                        return false;
                    }
                    box[6].add(grid[i][j]);
                }
            }
        }

        // box 8
        for(int i=6;i<9;i++){
            for(int j=3;j<6;j++){
                if(grid[i][j]!='.'){
                    if(box[7].contains(grid[i][j])){
                        return false;
                    }
                    box[7].add(grid[i][j]);
                }
            }
        }
        
        // box 9
        for(int i=6;i<9;i++){
            for(int j=6;j<9;j++){
                if(grid[i][j]!='.'){
                    if(box[8].contains(grid[i][j])){
                        return false;
                    }
                    box[8].add(grid[i][j]);
                }
            }
        }

        // // staring filling the suduko from each box
        
        // // box 1
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         if(grid[i][j]=='\0'){

        //         }
        //     }
        // }
        // // box 2
        // for(int i=0;i<3;i++){
        //     for(int j=3;j<6;j++){
        //         if(grid[i][j]!='\0'){
        //             box[1].add(Integer.parseInt(grid[i][j]+""));
        //         }
        //     }
        // }
        // // box 3
        // for(int i=0;i<3;i++){
        //     for(int j=6;j<9;j++){
        //         if(grid[i][j]!='\0'){
        //             box[2].add(Integer.parseInt(grid[i][j]+""));
        //         }
        //     }
        // }

        // // box 4
        // for(int i=3;i<6;i++){
        //     for(int j=0;j<3;j++){
        //         if(grid[i][j]!='\0'){
        //             box[3].add(Integer.parseInt(grid[i][j]+""));
        //         }
        //     }
        // }

        // // box 5
        // for(int i=3;i<6;i++){
        //     for(int j=3;j<6;j++){
        //         if(grid[i][j]!='\0'){
        //             box[4].add(Integer.parseInt(grid[i][j]+""));
        //         }
        //     }
        // }
        
        // // box 6
        // for(int i=3;i<6;i++){
        //     for(int j=6;j<9;j++){
        //         if(grid[i][j]!='\0'){
        //             box[5].add(Integer.parseInt(grid[i][j]+""));
        //         }
        //     }
        // }
        // // box 7
        // for(int i=6;i<9;i++){
        //     for(int j=0;j<3;j++){
        //         if(grid[i][j]!='\0'){
        //             box[6].add(Integer.parseInt(grid[i][j]+""));
        //         }
        //     }
        // }

        // // box 8
        // for(int i=6;i<9;i++){
        //     for(int j=3;j<6;j++){
        //         if(grid[i][j]!='\0'){
        //             box[7].add(Integer.parseInt(grid[i][j]+""));
        //         }
        //     }
        // }
        
        // // box 9
        // for(int i=6;i<9;i++){
        //     for(int j=6;j<9;j++){
        //         if(grid[i][j]!='\0'){
        //             box[8].add(Integer.parseInt(grid[i][j]+""));
        //         }
        //     }
        // }
        return true;

    }
}
