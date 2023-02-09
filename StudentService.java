package karenAssignment4;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class StudentService {
	public void work(Student[] students) {

		Student[] compSci = new Student[35];
		Student[] statStudent = new Student[33];
		Student[] apMath = new Student[34];

		int scienceAdd = 0;
		int statAdd = 0;
		int mathAdd = 0;

		for (Student student : students) {
			if (student.getCourseName().contains("COMPSCI")) {

			compSci[scienceAdd] = student;
			scienceAdd++;
		}

			if (student.getCourseName().contains("STAT")) {

				statStudent[statAdd] = student;
				statAdd++;

			}
			if (student.getCourseName().contains("APMTH")) {
				apMath[mathAdd] = student;
				mathAdd++;

			}
		}
			for (Student s : compSci) {
				System.out.println(s);
			}
			if (null != compSci) {
				Arrays.sort(compSci);
				 
			}
			
			if (statStudent != null) {
				Arrays.sort(statStudent);
			}
			if (apMath != null) {
				Arrays.sort(apMath);
			}

			try (FileWriter fw = new FileWriter("compSci.txt")) {
				for (Student sCs : compSci) {
					if (sCs != null) {
						fw.write(sCs.toString());
						fw.write(System.lineSeparator());
					}
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
			try (FileWriter fw = new FileWriter("statStudent.txt")) {
				for (Student sSs : statStudent) {
					if (sSs != null) {
						fw.write(sSs.toString());
						fw.write(System.lineSeparator());

					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try (FileWriter fw = new FileWriter("apMath.txt")) {
				for (Student saPm : apMath) {
					if (saPm != null) {
						fw.write(saPm.toString());
						fw.write(System.lineSeparator());
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

	}
}
