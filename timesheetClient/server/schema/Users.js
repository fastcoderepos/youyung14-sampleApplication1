cube(`Users`, {
  sql: `SELECT * FROM timesheet.users`,
  
  joins: {
    
  },
  
  measures: {
		sum_id: {
			sql: 'id',
			type: 'sum'
		},
		avg_id: {
			sql: 'id',
			type: 'avg'
		},
		min_id: {
			sql: 'id',
			type: 'min'
		},
		max_id: {
			sql: 'id',
			type: 'max'
		},
		runningTotal_id: {
			sql: 'id',
			type: 'runningTotal'
		},
		count_id: {
			sql: 'id',
			type: 'count'
		},
		countDistinct_id: {
			sql: 'id',
			type: 'countDistinct'
		},
		countDistinctApprox_id: {
			sql: 'id',
			type: 'countDistinctApprox'
		},
		count_emailaddress: {
			sql: 'emailaddress',
			type: 'count'
		},
		countDistinct_emailaddress: {
			sql: 'emailaddress',
			type: 'countDistinct'
		},
		countDistinctApprox_emailaddress: {
			sql: 'emailaddress',
			type: 'countDistinctApprox'
		},
		count_firstname: {
			sql: 'firstname',
			type: 'count'
		},
		countDistinct_firstname: {
			sql: 'firstname',
			type: 'countDistinct'
		},
		countDistinctApprox_firstname: {
			sql: 'firstname',
			type: 'countDistinctApprox'
		},
		count_isactive: {
			sql: 'isactive',
			type: 'count'
		},
		countDistinct_isactive: {
			sql: 'isactive',
			type: 'countDistinct'
		},
		countDistinctApprox_isactive: {
			sql: 'isactive',
			type: 'countDistinctApprox'
		},
		count_isemailconfirmed: {
			sql: 'isemailconfirmed',
			type: 'count'
		},
		countDistinct_isemailconfirmed: {
			sql: 'isemailconfirmed',
			type: 'countDistinct'
		},
		countDistinctApprox_isemailconfirmed: {
			sql: 'isemailconfirmed',
			type: 'countDistinctApprox'
		},
		count_lastname: {
			sql: 'lastname',
			type: 'count'
		},
		countDistinct_lastname: {
			sql: 'lastname',
			type: 'countDistinct'
		},
		countDistinctApprox_lastname: {
			sql: 'lastname',
			type: 'countDistinctApprox'
		},
		count_password: {
			sql: 'password',
			type: 'count'
		},
		countDistinct_password: {
			sql: 'password',
			type: 'countDistinct'
		},
		countDistinctApprox_password: {
			sql: 'password',
			type: 'countDistinctApprox'
		},
		count_username: {
			sql: 'username',
			type: 'count'
		},
		countDistinct_username: {
			sql: 'username',
			type: 'countDistinct'
		},
		countDistinctApprox_username: {
			sql: 'username',
			type: 'countDistinctApprox'
		},
		count_trigger_name: {
			sql: 'trigger_name',
			type: 'count'
		},
		countDistinct_trigger_name: {
			sql: 'trigger_name',
			type: 'countDistinct'
		},
		countDistinctApprox_trigger_name: {
			sql: 'trigger_name',
			type: 'countDistinctApprox'
		},
		count_trigger_group: {
			sql: 'trigger_group',
			type: 'count'
		},
		countDistinct_trigger_group: {
			sql: 'trigger_group',
			type: 'countDistinct'
		},
		countDistinctApprox_trigger_group: {
			sql: 'trigger_group',
			type: 'countDistinctApprox'
		},
		min_join_date: {
			sql: 'join_date',
			type: 'min'
		},
		max_join_date: {
			sql: 'join_date',
			type: 'max'
		},
		count_join_date: {
			sql: 'join_date',
			type: 'count'
		},
		countDistinct_join_date: {
			sql: 'join_date',
			type: 'countDistinct'
		},
		countDistinctApprox_join_date: {
			sql: 'join_date',
			type: 'countDistinctApprox'
		}
  },
  
  dimensions: {
    id: {
      sql: `id`,
      type: `number`,
      primaryKey: true
    },
    
    emailaddress: {
      sql: `emailaddress`,
      type: `string`
    },
    
    firstname: {
      sql: `firstname`,
      type: `string`
    },
    
    isactive: {
      sql: `isactive`,
      type: `string`
    },
    
    isemailconfirmed: {
      sql: `isemailconfirmed`,
      type: `string`
    },
    
    lastname: {
      sql: `lastname`,
      type: `string`
    },
    
    password: {
      sql: `password`,
      type: `string`
    },
    
    username: {
      sql: `username`,
      type: `string`
    },
    
    triggerName: {
      sql: `trigger_name`,
      type: `string`
    },
    
    triggerGroup: {
      sql: `trigger_group`,
      type: `string`
    },
    
    joinDate: {
      sql: `join_date`,
      type: `time`
    }
  }
});
