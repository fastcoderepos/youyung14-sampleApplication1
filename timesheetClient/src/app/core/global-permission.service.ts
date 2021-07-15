import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { IGlobalPermissionService, ITokenDetail } from 'src/app/common/shared';
import { AuthenticationService } from './authentication.service';

@Injectable({
  providedIn: "root"
})
export class GlobalPermissionService implements IGlobalPermissionService {

  public authUrl = environment.apiUrl;
  constructor(public authService: AuthenticationService) {
  }

  hasPermissionOnEntity(entity: string, crudType: string): Boolean {
    if (!entity) {
      return false;
    }
    let permission = `${entity}ENTITY_${crudType}`.toUpperCase(); 
    return this.hasPermission(permission);
  }

  hasPermission(permission: string) {
    let tokenDetails: ITokenDetail = this.authService.decodeToken();
		if (!tokenDetails) {
      return false;
    }
    return tokenDetails.scopes.indexOf(permission) > - 1;
  }

}