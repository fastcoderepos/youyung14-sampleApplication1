
import { RouterModule, Routes } from '@angular/router';
import { ModuleWithProviders } from '@angular/core';
import { AuthGuard } from 'src/app/core/auth-guard';


const routes: Routes = [
	{
		path: 'rolepermission',
		loadChildren: './user-management/rolepermission/rolepermission.module#RolepermissionExtendedModule',
		canActivate: [AuthGuard]
	},
	{
		path: 'role',
		loadChildren: './user-management/role/role.module#RoleExtendedModule',
		canActivate: [AuthGuard]
	},
	{
		path: 'permission',
		loadChildren: './user-management/permission/permission.module#PermissionExtendedModule',
		canActivate: [AuthGuard]
	},
	{
		path: 'usersrole',
		loadChildren: './user-management/usersrole/usersrole.module#UsersroleExtendedModule',
		canActivate: [AuthGuard]
	},
	{
		path: 'users',
		loadChildren: './user-management/users/users.module#UsersExtendedModule',
		canActivate: [AuthGuard]
	},
	{
		path: 'userspermission',
		loadChildren: './user-management/userspermission/userspermission.module#UserspermissionExtendedModule',
		canActivate: [AuthGuard]
	},
];

export const routingModule: ModuleWithProviders = RouterModule.forChild(routes);