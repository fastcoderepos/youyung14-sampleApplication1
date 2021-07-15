
import { RouterModule, Routes } from '@angular/router';
import { ModuleWithProviders } from "@angular/core";
import { CanDeactivateGuard } from 'src/app/common/shared';
import { AuthGuard } from 'src/app/core/auth-guard';
import { ProjectDetailsExtendedComponent, ProjectListExtendedComponent , ProjectNewExtendedComponent } from './';

const routes: Routes = [
	{ path: '', component: ProjectListExtendedComponent, canDeactivate: [CanDeactivateGuard], canActivate: [ AuthGuard ] },
	{ path: ':id', component: ProjectDetailsExtendedComponent, canDeactivate: [CanDeactivateGuard], canActivate: [ AuthGuard ] },
	{ path: 'new', component: ProjectNewExtendedComponent, canActivate: [ AuthGuard ] },
];

export const projectRoute: ModuleWithProviders = RouterModule.forChild(routes);