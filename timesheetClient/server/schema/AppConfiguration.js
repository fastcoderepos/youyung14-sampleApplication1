cube(`AppConfiguration`, {
  sql: `SELECT * FROM timesheet.app_configuration`,
  
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
		count_type: {
			sql: 'type',
			type: 'count'
		},
		countDistinct_type: {
			sql: 'type',
			type: 'countDistinct'
		},
		countDistinctApprox_type: {
			sql: 'type',
			type: 'countDistinctApprox'
		},
		count_value: {
			sql: 'value',
			type: 'count'
		},
		countDistinct_value: {
			sql: 'value',
			type: 'countDistinct'
		},
		countDistinctApprox_value: {
			sql: 'value',
			type: 'countDistinctApprox'
		}
  },
  
  dimensions: {
    id: {
      sql: `id`,
      type: `number`,
      primaryKey: true
    },
    
    type: {
      sql: `type`,
      type: `string`
    },
    
    value: {
      sql: `value`,
      type: `string`
    }
  }
});
