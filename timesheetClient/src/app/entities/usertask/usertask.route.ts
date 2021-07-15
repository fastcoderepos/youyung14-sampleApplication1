
import { RouterModule, Routes } from '@angular/router';
import { ModuleWithProviders } from "@angular/core";
// import { CanDeactivateGuard } from 'src/app/common/shared';
// import { AuthGuard } from 'src/app/core/auth-guard';

// import { UsertaskDetailsComponent, UsertaskListComponent, UsertaskNewComponent } from './';

const routes: Routes = [
	// { path: '', component: UsertaskListComponent, canDeactivate: [CanDeactivateGuard], canActivate: [ AuthGuard ] },
	// { path: ':id', component: UsertaskDetailsComponent, canDeactivate: [CanDeactivateGuard], canActivate: [ AuthGuard ] },
	// { path: 'new', component: UsertaskNewComponent, canActivate: [ AuthGuard ] },
];

export const usertaskRoute: ModuleWithProviders = RouterModule.forChild(routes);