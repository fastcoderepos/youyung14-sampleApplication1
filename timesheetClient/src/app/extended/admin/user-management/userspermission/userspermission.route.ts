
import { RouterModule, Routes } from '@angular/router';
import { ModuleWithProviders } from "@angular/core";
import { CanDeactivateGuard } from 'src/app/common/shared';
import { AuthGuard } from 'src/app/core/auth-guard';
import { UserspermissionDetailsExtendedComponent, UserspermissionListExtendedComponent , UserspermissionNewExtendedComponent } from './';

const routes: Routes = [
	{ path: '', component: UserspermissionListExtendedComponent, canDeactivate: [CanDeactivateGuard], canActivate: [ AuthGuard ] },
	{ path: ':id', component: UserspermissionDetailsExtendedComponent, canDeactivate: [CanDeactivateGuard], canActivate: [ AuthGuard ] },
	{ path: 'new', component: UserspermissionNewExtendedComponent, canActivate: [ AuthGuard ] },
];

export const userspermissionRoute: ModuleWithProviders = RouterModule.forChild(routes);