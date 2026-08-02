class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> studentQ = new LinkedList<>();
        Stack<Integer> sandwich = new Stack<>();
        for(int i = 0; i < students.length; i++){
            studentQ.offer(students[i]);
        }
        for(int i = sandwiches.length - 1; i >= 0 ; i--){
            sandwich.push(sandwiches[i]);
        }
        int count = 0;
        while(!studentQ.isEmpty() && count != studentQ.size()){
            int stu = studentQ.peek();
            int sand = sandwich.peek();
            if(stu == sand){
                studentQ.poll();
                sandwich.pop();
                count = 0;
            }
            else{
                studentQ.offer(studentQ.poll());
                count++;
            }
        }
        return studentQ.size();

    }
}