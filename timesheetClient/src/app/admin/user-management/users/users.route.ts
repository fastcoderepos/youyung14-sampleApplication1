
import { RouterModule, Routes } from '@angular/router';
import { ModuleWithProviders } from "@angular/core";
// import { CanDeactivateGuard } from 'src/app/common/shared';
// import { AuthGuard } from 'src/app/core/auth-guard';

// import { UsersDetailsComponent, UsersListComponent, UsersNewComponent } from './';

const routes: Routes = [
	// { path: '', component: UsersListComponent, canDeactivate: [CanDeactivateGuard], canActivate: [ AuthGuard ] },
	// { path: ':id', component: UsersDetailsComponent, canDeactivate: [CanDeactivateGuard], canActivate: [ AuthGuard ] },
	// { path: 'new', component: UsersNewComponent, canActivate: [ AuthGuard ] },
];

export const usersRoute: ModuleWithProviders = RouterModule.forChild(routes);