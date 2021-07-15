
import { RouterModule, Routes } from '@angular/router';
import { ModuleWithProviders } from "@angular/core";
// import { CanDeactivateGuard } from 'src/app/common/shared';
// import { AuthGuard } from 'src/app/core/auth-guard';

// import { TaskDetailsComponent, TaskListComponent, TaskNewComponent } from './';

const routes: Routes = [
	// { path: '', component: TaskListComponent, canDeactivate: [CanDeactivateGuard], canActivate: [ AuthGuard ] },
	// { path: ':id', component: TaskDetailsComponent, canDeactivate: [CanDeactivateGuard], canActivate: [ AuthGuard ] },
	// { path: 'new', component: TaskNewComponent, canActivate: [ AuthGuard ] },
];

export const taskRoute: ModuleWithProviders = RouterModule.forChild(routes);