// 'use strict';

const express = require('express');
const app = express();
app.use(express.json());

// Your code starts here. Placeholders for .get and .post are provided for
//  your convenience.

/* Student note:

I still didn't have any API lessons nor classes, so right here I'm researching as I go. I (most probably) won't be able to complete the solution in time, but let's see how much I can do in a few mins.

*/

app.post('/candidates', function(req, res) {
  // ...
  pool.query('INSERT INTO candidates SET ?', req.body, (error, result) => {
    if (error) throw error;

    response.status(201).send(`User added with NAME: ${result.insertName}, SKILLS: ${result.insertSkill}`)
  })

});

app.get('/candidates/search', function(req, res) {
  // ...
  const skill = req.params.skill;

  pool.query('SELECT * FROM candidates WHERE skills=?', skill, (error, result) => {
    if (error) throw error;

    response.send(result);
  })
});

app.listen(process.env.HTTP_PORT || 3000);

/* STUDENT NOTES

As of now, I'll just try to create a class for the candidates that's able to create new candidate objects in the required format.
*/

class Candidate {
  constructor(id, name, skills) {
    this._id = id;
    this._name = name;
    this._skills = skills;
  }
  get id() {
    return this._id;
  }
  get name() {
    return this._name;
  }
  get skills() {
    return this._skills;
  }
  set id(newId) {
    this._id = newId
  }
  set name(newName) {
    this._name = newName;
  }
  set skills(newSkill) {
    this._skills = newSkill;
  }
}

const cand1 = new Candidate(0001, "Candidato 1", ["javascript", "python", "nodejs"]);

console.table(cand1);