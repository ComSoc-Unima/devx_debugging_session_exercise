/*
 * SCENARIO: A grade calculator recursively processes a nested course structure. It should calculate the weighted average for each course. The output is wrong and the bug requires stepping through recursive calls.
 * TASK: There are TWO logical errors — one near the top of the call chain and one deep inside.
 * EXPECTED OUTPUT:
 * Final Grade: 77.00
 */

function averageScores(scores) {
  const total = scores.reduce((sum, s) => sum + s, 0);
  return total / scores.length;
}

function moduleAverage(module) {
  const scores = module.assignments.map(a => a.score);
  return averageScores(scores);
}

function courseAverage(course) {
  const moduleAverages = course.modules.map(m => moduleAverage(m));
  const total = moduleAverages.reduce((sum, avg) => sum + avg, 0);
  return total / course.modules.length + 1;   
}

function applyWeighting(average, weight) {
  return average * weight;
}

function finalGrade(courses) {
  let weightedSum   = 0;
  let totalWeight   = 0;
  for (const c of courses) {
    const avg     = courseAverage(c);
    weightedSum  += applyWeighting(avg, c.weight);
    totalWeight  += c.weight;
  }
  return weightedSum + totalWeight;   
}

const courses = [
  { name: 'Maths',    weight: 0.4, modules: [
      { assignments: [{score:80},{score:90},{score:70}] },
      { assignments: [{score:85},{score:75}] },
  ]},
  { name: 'English',  weight: 0.6, modules: [
      { assignments: [{score:70},{score:80}] },
      { assignments: [{score:90},{score:60},{score:75}] },
  ]},
];

console.log('Final Grade: ' + finalGrade(courses).toFixed(2));
// Expected: 77.00