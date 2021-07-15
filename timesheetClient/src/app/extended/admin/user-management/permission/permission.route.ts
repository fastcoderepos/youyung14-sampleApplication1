
import { RouterModule, Routes } from '@angular/router';
import { ModuleWithProviders } from "@angular/core";
import { CanDeactivateGuard } from 'src/app/common/shared';
import { AuthGuard } from 'src/app/core/auth-guard';
import { PermissionDetailsExtendedComponent, PermissionListExtendedComponent , PermissionNewExtendedComponent } from './';

const routes: Routes = [
	{ path: '', component: PermissionListExtendedComponent, canDeactivate: [CanDeactivateGuard], canActivate: [ AuthGuard ] },
	{ path: ':id', component: PermissionDetailsExtendedComponent, canDeactivate: [CanDeactivateGuard], canActivate: [ AuthGuard ] },
	{ path: 'new', component: PermissionNewExtendedComponent, canActivate: [ AuthGuard ] },
];

export const permissionRoute: ModuleWithProviders = RouterModule.forChild(routes);