cube(`Permission`, {
  sql: `SELECT * FROM timesheet.permission`,
  
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
		count_display_name: {
			sql: 'display_name',
			type: 'count'
		},
		countDistinct_display_name: {
			sql: 'display_name',
			type: 'countDistinct'
		},
		countDistinctApprox_display_name: {
			sql: 'display_name',
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
		}
  },
  
  dimensions: {
    id: {
      sql: `id`,
      type: `number`,
      primaryKey: true
    },
    
    displayName: {
      sql: `display_name`,
      type: `string`
    },
    
    name: {
      sql: `name`,
      type: `string`
    }
  }
});
