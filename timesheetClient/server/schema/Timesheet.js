cube(`Timesheet`, {
  sql: `SELECT * FROM timesheet.timesheet`,
  
  joins: {
    Users: {
      sql: `${CUBE}.userid = ${Users}.id`,
      relationship: `belongsTo`
    },
    
    Timesheetstatus: {
      sql: `${CUBE}.timesheetstatusid = ${Timesheetstatus}.id`,
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
		count_notes: {
			sql: 'notes',
			type: 'count'
		},
		countDistinct_notes: {
			sql: 'notes',
			type: 'countDistinct'
		},
		countDistinctApprox_notes: {
			sql: 'notes',
			type: 'countDistinctApprox'
		},
		min_periodendingdate: {
			sql: 'periodendingdate',
			type: 'min'
		},
		max_periodendingdate: {
			sql: 'periodendingdate',
			type: 'max'
		},
		count_periodendingdate: {
			sql: 'periodendingdate',
			type: 'count'
		},
		countDistinct_periodendingdate: {
			sql: 'periodendingdate',
			type: 'countDistinct'
		},
		countDistinctApprox_periodendingdate: {
			sql: 'periodendingdate',
			type: 'countDistinctApprox'
		},
		min_periodstartingdate: {
			sql: 'periodstartingdate',
			type: 'min'
		},
		max_periodstartingdate: {
			sql: 'periodstartingdate',
			type: 'max'
		},
		count_periodstartingdate: {
			sql: 'periodstartingdate',
			type: 'count'
		},
		countDistinct_periodstartingdate: {
			sql: 'periodstartingdate',
			type: 'countDistinct'
		},
		countDistinctApprox_periodstartingdate: {
			sql: 'periodstartingdate',
			type: 'countDistinctApprox'
		}
  },
  
  dimensions: {
    id: {
      sql: `id`,
      type: `number`,
      primaryKey: true
    },
    
    notes: {
      sql: `notes`,
      type: `string`
    },
    
    periodendingdate: {
      sql: `periodendingdate`,
      type: `time`
    },
    
    periodstartingdate: {
      sql: `periodstartingdate`,
      type: `time`
    }
  }
});
