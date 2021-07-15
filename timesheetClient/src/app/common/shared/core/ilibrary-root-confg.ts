//import { ITokenDetail } from "src/app/core/itoken-detail";
//import { ,ITokenDetail } from '';
import { IGlobalPermissionService } from "./iglobal-permission.service";
import { ITokenDetail } from "./itoken-detail";

export interface ILibraryRootConfg {
    xApiKey: string;
    apiPath?: string;
    decodedAccessToken?:ITokenDetail;
    permissionService?:IGlobalPermissionService
  }