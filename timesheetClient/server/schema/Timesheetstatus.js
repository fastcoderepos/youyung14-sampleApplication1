cube(`Timesheetstatus`, {
  sql: `SELECT * FROM timesheet.timesheetstatus`,
  
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
		count_statusname: {
			sql: 'statusname',
			type: 'count'
		},
		countDistinct_statusname: {
			sql: 'statusname',
			type: 'countDistinct'
		},
		countDistinctApprox_statusname: {
			sql: 'statusname',
			type: 'countDistinctApprox'
		}
  },
  
  dimensions: {
    id: {
      sql: `id`,
      type: `number`,
      primaryKey: true
    },
    
    statusname: {
      sql: `statusname`,
      type: `string`
    }
  }
});
