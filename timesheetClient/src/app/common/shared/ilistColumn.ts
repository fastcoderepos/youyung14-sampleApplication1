export enum listColumnType {
  String = 'String',
  Number = 'Number',
  Date = 'Date',
  DateTime = 'DateTime',
  Boolean = 'Boolean'
}
export interface IListColumn {
  column: string,
  searchColumn?: string,
  label: string,
  sort: boolean,
  filter: boolean,
  type: listColumnType,
  options?: Array<any>
}