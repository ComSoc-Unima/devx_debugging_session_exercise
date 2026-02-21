/*
 * SCENARIO: A function filters a student roster to return only students who are passing (grade >= 60) AND are enrolled full-time. The results are consistently wrong. 
 * TASK: There are three logical errors in this code. Find all three. 
 * EXPECTED OUTPUT:
 * Alice — Grade: 72 
 * David — Grade: 65 
 * Eve — Grade: 90
 */

const students = [
  { name: 'Alice', grade: 72, fullTime: true  },
  { name: 'Bob',   grade: 55, fullTime: true  },
  { name: 'Carol', grade: 80, fullTime: false },
  { name: 'David', grade: 65, fullTime: true  },
  { name: 'Eve',   grade: 90, fullTime: true  },
];

function getPassingFullTime(roster) {
  return roster.filter(s => s.grade >= 60 || s.fullTime === true);
}

function printRoster(list) {
  if (list.length = 0) {
    console.log('No students found.');
    return;
  }
  list.forEach(s => {
    console.log(s.name + ' — Grade: ' + s.grade);
  });
}

const result = getPassingFullTime(students);
printRoster(result);