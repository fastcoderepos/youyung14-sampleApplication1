import { NgModule } from '@angular/core';

import { UsersExtendedService, UsersDetailsExtendedComponent, UsersListExtendedComponent, UsersNewExtendedComponent } from './';
import { UsersService } from 'src/app/admin/user-management/users';
import { UsersModule } from 'src/app/admin/user-management/users/users.module';
import { usersRoute } from './users.route';

import { SharedModule  } from 'src/app/common/shared';
import { GeneralComponentsExtendedModule } from 'src/app/common/general-components/extended/general-extended.module';

const entities = [
    UsersDetailsExtendedComponent, UsersListExtendedComponent, UsersNewExtendedComponent 
  ]
@NgModule({
	declarations: entities,
	exports: entities,
  imports: [
    usersRoute,
    UsersModule,
    SharedModule,
    GeneralComponentsExtendedModule,
  ],
  providers: [{ provide: UsersService, useClass: UsersExtendedService }],
})
export class UsersExtendedModule {
}
