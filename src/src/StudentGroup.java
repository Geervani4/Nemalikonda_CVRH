import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
                 Student[] result = new Student[students.length];

           for (int i = 0, j = result.length - 1; i < students.length; i++, j--) {
                result[j] = students[i];
             }
         return result;
             
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here

      
           this.students=students;

	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here

             if(index>students.length || index<0)
              throw new IllegalArgumentException("llegalArgumentException");
             else
               return students[index]; 
		//return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
             if(index>students.length || index<0 || this.students[index]==null)
              throw new IllegalArgumentException(" ");
             else
             {
                this.students[index]=students[index];
                     
               }
	}

	@Override
	public void addFirst(Student student) {

               	if(student==null)
	               throw new IllegalArgumentException("llegalArgumentException");
                 else
                    {
                       new StudentGroup(students.length+1);
                        this.students[0]=student;

                         for(int i=1;i<students.length;i++)
                          this.students[i]=students[i-1];
                    }
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here

                if(student==null)
	               throw new IllegalArgumentException("llegalArgumentException");
                 else
                    {
                       new StudentGroup(students.length+1);
                       // this.students[]=student;

                         for(int i=0;i<students.length-1;i++)
                          this.students[i]=students[i-1];

                        this.students[students.length-1]=student;
                    }

	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here


              if(student==null)
	               throw new IllegalArgumentException("llegalArgumentException");
                 else
                    {
                       new StudentGroup(students.length+1);
                      
                         for(int i=0;i<index;i++)
                          this.students[i]=students[i];

                     this.students[index]=student;

                         for(int i=index+1;i<students.length;i++)
                        this.students[i]=students[i-1];
                    }
	}

	@Override
	public void remove(int index) {
		// Add your implementation here

                
                 
                    {
                       new StudentGroup(students.length-1);
                      
                         for(int i=0;i<index;i++)
                          this.students[i]=students[i];

                     //this.students[index]=student;

                         for(int i=index+1;i<students.length;i++)
                        this.students[i-1]=students[i];
                    }

                
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
              int i,flag=1;
           if(student==null)
                throw new IllegalArgumentException("llegalArgumentException");

          else
            {  for(i=0;i<students.length;i++)
             {
                if(students[i]==student)
                  {
                  flag=0;
                  break;
                     }
             }
              if(flag==1)
                   throw new IllegalArgumentException("Student not exist");
else{
            new StudentGroup(students.length-1);
                      
                         for(int j=0;j<i;j++)
                          this.students[j]=students[j];

                     //this.students[index]=student;

                         for(int j=i+1;j<students.length;j++)
                        this.students[j-1]=students[j];
    }}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here

              if(index>students.length || index<0)
              throw new IllegalArgumentException("llegalArgumentException");

             else
             {
                new StudentGroup(students.length-index);
                      
                         for(int j=0;j<=index;j++)
                          this.students[j]=students[j];

                     
              }
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
           int i,flag=1;
                if(student==null)
                throw new IllegalArgumentException("llegalArgumentException");
 
                  else
            {  for(i=0;i<students.length;i++)
             {
                if(students[i]==student)
                  {
                  flag=0;
                  break;
                     }
             }
              if(flag==1)
                   throw new IllegalArgumentException("Student not exist");
else{
            new StudentGroup(students.length-i);
                      
                         for(int j=0;j<=i;j++)
                          this.students[j]=students[j];

                     
    }}

                 
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here

          if(index>students.length || index<0)
              throw new IllegalArgumentException("llegalArgumentException");

             else
             {
                new StudentGroup(students.length-index);
                      
                        for(int j=index;j<students.length;j++)
                          this.students[j]=students[j];

                     
              }


	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here

          int i,flag=1;
                if(student==null)
                throw new IllegalArgumentException("llegalArgumentException");
 
                  else
            {  for(i=0;i<students.length;i++)
             {
                if(students[i]==student)
                  {
                  flag=0;
                  break;
                     }
             }
              if(flag==1)
                   throw new IllegalArgumentException("Student not exist");
        else{
            new StudentGroup(students.length-i);
                      
                         for(int j=i;j<students.length;j++)
                          this.students[j]=students[j];

                     
    }}


	}

	@Override
	public void bubbleSort() {
/*		// Add your implementation here

          int n = students.length;  
         Student temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(students[j-1]>students[j]){  
                                 //swap elements  
                                 temp = students[j-1];  
                                 students[j-1] = students[j];  
                                 students[j] = temp;  
                         }  
                          
                 }  
         }  
	*/ return null;}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here

             
}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
