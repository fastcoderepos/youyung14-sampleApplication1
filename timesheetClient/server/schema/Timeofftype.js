cube(`Timeofftype`, {
  sql: `SELECT * FROM timesheet.timeofftype`,
  
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
		count_typename: {
			sql: 'typename',
			type: 'count'
		},
		countDistinct_typename: {
			sql: 'typename',
			type: 'countDistinct'
		},
		countDistinctApprox_typename: {
			sql: 'typename',
			type: 'countDistinctApprox'
		}
  },
  
  dimensions: {
    id: {
      sql: `id`,
      type: `number`,
      primaryKey: true
    },
    
    typename: {
      sql: `typename`,
      type: `string`
    }
  }
});
