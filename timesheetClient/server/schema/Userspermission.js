cube(`Userspermission`, {
  sql: `SELECT * FROM timesheet.userspermission`,
  
  joins: {
    Permission: {
      sql: `${CUBE}.permission_id = ${Permission}.id`,
      relationship: `belongsTo`
    },
    
    Users: {
      sql: `${CUBE}.users_id = ${Users}.id`,
      relationship: `belongsTo`
    }
  },
  
  measures: {
		count_revoked: {
			sql: 'revoked',
			type: 'count'
		},
		countDistinct_revoked: {
			sql: 'revoked',
			type: 'countDistinct'
		},
		countDistinctApprox_revoked: {
			sql: 'revoked',
			type: 'countDistinctApprox'
		}
  },
  
  dimensions: {
    revoked: {
      sql: `revoked`,
      type: `string`
    },
    id: {
      sql: `CONCAT(${CUBE}.users_id, ${CUBE}.permission_id)`,
      type: `number`,
      primaryKey: true,
    },
  }
});
