cube(`Userspreference`, {
  sql: `SELECT * FROM timesheet.userspreference`,
  
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
		count_language: {
			sql: 'language',
			type: 'count'
		},
		countDistinct_language: {
			sql: 'language',
			type: 'countDistinct'
		},
		countDistinctApprox_language: {
			sql: 'language',
			type: 'countDistinctApprox'
		},
		count_theme: {
			sql: 'theme',
			type: 'count'
		},
		countDistinct_theme: {
			sql: 'theme',
			type: 'countDistinct'
		},
		countDistinctApprox_theme: {
			sql: 'theme',
			type: 'countDistinctApprox'
		}
  },
  
  dimensions: {
    id: {
      sql: `id`,
      type: `number`,
      primaryKey: true
    },
    
    language: {
      sql: `language`,
      type: `string`
    },
    
    theme: {
      sql: `theme`,
      type: `string`
    }
  }
});
