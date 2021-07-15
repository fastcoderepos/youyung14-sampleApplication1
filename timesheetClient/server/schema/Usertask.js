cube(`Usertask`, {
  sql: `SELECT * FROM timesheet.usertask`,
  
  joins: {
    Users: {
      sql: `${CUBE}.userid = ${Users}.id`,
      relationship: `belongsTo`
    },
    
    Task: {
      sql: `${CUBE}.taskid = ${Task}.id`,
      relationship: `belongsTo`
    }
  },
  
  measures: {

  },
  
  dimensions: {
    id: {
      sql: `CONCAT(${CUBE}.userid, ${CUBE}.taskid)`,
      type: `number`,
      primaryKey: true,
    },
  }
});