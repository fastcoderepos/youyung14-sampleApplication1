cube(`Timesheetdetails`, {
  sql: `SELECT * FROM timesheet.timesheetdetails`,
  
  joins: {
    Task: {
      sql: `${CUBE}.taskid = ${Task}.id`,
      relationship: `belongsTo`
    },
    
    Timesheet: {
      sql: `${CUBE}.timesheetid = ${Timesheet}.id`,
      relationship: `belongsTo`
    },
    
    Timeofftype: {
      sql: `${CUBE}.timeofftypeid = ${Timeofftype}.id`,
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
		min_workdate: {
			sql: 'workdate',
			type: 'min'
		},
		max_workdate: {
			sql: 'workdate',
			type: 'max'
		},
		count_workdate: {
			sql: 'workdate',
			type: 'count'
		},
		countDistinct_workdate: {
			sql: 'workdate',
			type: 'countDistinct'
		},
		countDistinctApprox_workdate: {
			sql: 'workdate',
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
    
    workdate: {
      sql: `workdate`,
      type: `time`
    }
  }
});
