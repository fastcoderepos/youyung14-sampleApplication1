import { Component, Inject } from '@angular/core';
import {MAT_DIALOG_DATA} from '@angular/material/dialog';
import {MatDialogRef} from '@angular/material';

@Component({
  selector: 'app-update-dashboard',
  templateUrl: './update-dashboard.component.html',
  styleUrls: ['./update-dashboard.component.scss']
})
export class UpdateDashboardComponent  {

  choosedashboard = 'new';
  dashboard = {
    title: '',
    description: ''
  }
  response = {}
  constructor(
    public dialogRef: MatDialogRef<UpdateDashboardComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any) {
      this.dashboard.title = data.title;
      this.dashboard.description = data.description;
     }

  onNoClick(): void {
    this.dialogRef.close({
      type: "close",
      dashboardTitle: this.dashboard.title,
      dashboarddescription: this.dashboard.description
    });
  }

  save(){
    this.response = {
      type: this.choosedashboard,
      dashboardTitle: this.dashboard.title,
      dashboarddescription: this.dashboard.description
    }
    this.dialogRef.close(this.response);
  }

}
