
export interface IGlobalPermissionService {
	hasPermissionOnEntity(entity:string, crudType:string):Boolean;
}