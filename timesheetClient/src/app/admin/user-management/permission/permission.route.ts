
import { RouterModule, Routes } from '@angular/router';
import { ModuleWithProviders } from "@angular/core";
// import { CanDeactivateGuard } from 'src/app/common/shared';
// import { AuthGuard } from 'src/app/core/auth-guard';

// import { PermissionDetailsComponent, PermissionListComponent, PermissionNewComponent } from './';

const routes: Routes = [
	// { path: '', component: PermissionListComponent, canDeactivate: [CanDeactivateGuard], canActivate: [ AuthGuard ] },
	// { path: ':id', component: PermissionDetailsComponent, canDeactivate: [CanDeactivateGuard], canActivate: [ AuthGuard ] },
	// { path: 'new', component: PermissionNewComponent, canActivate: [ AuthGuard ] },
];

export const permissionRoute: ModuleWithProviders = RouterModule.forChild(routes);