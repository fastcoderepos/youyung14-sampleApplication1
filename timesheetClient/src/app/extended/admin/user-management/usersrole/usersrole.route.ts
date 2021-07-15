
import { RouterModule, Routes } from '@angular/router';
import { ModuleWithProviders } from "@angular/core";
import { CanDeactivateGuard } from 'src/app/common/shared';
import { AuthGuard } from 'src/app/core/auth-guard';
import { UsersroleDetailsExtendedComponent, UsersroleListExtendedComponent , UsersroleNewExtendedComponent } from './';

const routes: Routes = [
	{ path: '', component: UsersroleListExtendedComponent, canDeactivate: [CanDeactivateGuard], canActivate: [ AuthGuard ] },
	{ path: ':id', component: UsersroleDetailsExtendedComponent, canDeactivate: [CanDeactivateGuard], canActivate: [ AuthGuard ] },
	{ path: 'new', component: UsersroleNewExtendedComponent, canActivate: [ AuthGuard ] },
];

export const usersroleRoute: ModuleWithProviders = RouterModule.forChild(routes);