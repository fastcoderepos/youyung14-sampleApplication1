cube(`Rolepermission`, {
  sql: `SELECT * FROM timesheet.rolepermission`,
  
  joins: {
    Permission: {
      sql: `${CUBE}.permission_id = ${Permission}.id`,
      relationship: `belongsTo`
    },
    
    Role: {
      sql: `${CUBE}.role_id = ${Role}.id`,
      relationship: `belongsTo`
    }
  },
  
  measures: {

  },
  
  dimensions: {
    id: {
      sql: `CONCAT(${CUBE}.role_id, ${CUBE}.permission_id)`,
      type: `number`,
      primaryKey: true,
    },
  }
});