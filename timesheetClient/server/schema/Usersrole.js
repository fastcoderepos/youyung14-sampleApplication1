cube(`Usersrole`, {
  sql: `SELECT * FROM timesheet.usersrole`,
  
  joins: {
    Role: {
      sql: `${CUBE}.role_id = ${Role}.id`,
      relationship: `belongsTo`
    },
    
    Users: {
      sql: `${CUBE}.users_id = ${Users}.id`,
      relationship: `belongsTo`
    }
  },
  
  measures: {

  },
  
  dimensions: {
    id: {
      sql: `CONCAT(${CUBE}.users_id, ${CUBE}.role_id)`,
      type: `number`,
      primaryKey: true,
    },
  }
});
