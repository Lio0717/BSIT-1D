public class StudentScore {
    public static void main(String[] args) {
        char[] Anskey = {'D','B','D','C','C','D','A','E','A','D'};
        char[] [] StudAns = { {'A','B','A','C','C','D','E','E','A','D'},
        {'D','B','A','B','C','A','C','E','A','D'},
        {'E','D','D','A','C','B','E','E','A','D'},
        {'C','B','A','E','D','C','C','E','A','D'},
		{'A','B','D','C','C','D','E','E','A','D'},
		{'B','B','E','C','C','D','E','E','A','D'},
		{'B','B','A','C','C','D','E','E','A','D'},
		{'E','B','E','C','C','D','E','E','A','D'} };

        for(int i=0; i<StudAns.length;i++)
        {
            int score = 0;
            for(int j=0; j<Anskey.length;j++){

                if (StudAns[i][j] == Anskey[j]){

                    score ++;
                }
            }
            System.out.println("Student " + i + "score" + ":" + score);

        }

    }
    
}
