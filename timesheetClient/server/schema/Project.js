cube(`Project`, {
  sql: `SELECT * FROM timesheet.project`,
  
  joins: {
    Customer: {
      sql: `${CUBE}.customerid = ${Customer}.customerid`,
      relationship: `belongsTo`
    }
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
		count_name: {
			sql: 'name',
			type: 'count'
		},
		countDistinct_name: {
			sql: 'name',
			type: 'countDistinct'
		},
		countDistinctApprox_name: {
			sql: 'name',
			type: 'countDistinctApprox'
		},
		count_description: {
			sql: 'description',
			type: 'count'
		},
		countDistinct_description: {
			sql: 'description',
			type: 'countDistinct'
		},
		countDistinctApprox_description: {
			sql: 'description',
			type: 'countDistinctApprox'
		},
		min_startdate: {
			sql: 'startdate',
			type: 'min'
		},
		max_startdate: {
			sql: 'startdate',
			type: 'max'
		},
		count_startdate: {
			sql: 'startdate',
			type: 'count'
		},
		countDistinct_startdate: {
			sql: 'startdate',
			type: 'countDistinct'
		},
		countDistinctApprox_startdate: {
			sql: 'startdate',
			type: 'countDistinctApprox'
		},
		min_enddate: {
			sql: 'enddate',
			type: 'min'
		},
		max_enddate: {
			sql: 'enddate',
			type: 'max'
		},
		count_enddate: {
			sql: 'enddate',
			type: 'count'
		},
		countDistinct_enddate: {
			sql: 'enddate',
			type: 'countDistinct'
		},
		countDistinctApprox_enddate: {
			sql: 'enddate',
			type: 'countDistinctApprox'
		}
  },
  
  dimensions: {
    id: {
      sql: `customerid`,
      type: `number`,
      primaryKey: true
    },
    
    name: {
      sql: `name`,
      type: `string`
    },
    
    description: {
      sql: `description`,
      type: `string`
    },
    
    startdate: {
      sql: `startdate`,
      type: `time`
    },
    
    enddate: {
      sql: `enddate`,
      type: `time`
    }
  }
});
