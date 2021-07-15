#!/bin/bash
set -e

POSTGRES="psql --username postgres"

echo "Creating database: timesheet"
 
echo "Creating timesheet tables..."
psql -d timesheet -a -U postgres -f /timesheet.sql