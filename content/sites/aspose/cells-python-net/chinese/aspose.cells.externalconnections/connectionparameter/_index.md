---
title: ConnectionParameter类
second_title: Aspose.Cells for Python via .NET API 参考文献
description:
type: docs
weight: 10
url: /zh/aspose.cells.externalconnections/connectionparameter/
is_root: false
---
## ConnectionParameter类
指定与外部数据连接一起使用的任何参数的属性
参数对于 ODBC 和 Web 查询有效。



ConnectionParameter 类型公开以下成员：

### 属性
|属性|描述|
| :- | :- |
| [sql_type](/cells/python-net/zh/aspose.cells.externalconnections/connectionparameter/sql_type) |参数的 SQL 数据类型。仅对 ODBC 源有效。|
| [refresh_on_change](/cells/python-net/zh/aspose.cells.externalconnections/connectionparameter/refresh_on_change) |标志指示查询是否应在内容<br/>提供参数值的单元格发生变化。如果为 true，则刷新外部数据<br/>每次发生更改时都使用新的参数值。如果为 false，则外部数据<br/>仅在用户请求时刷新，或者某些其他事件触发刷新（例如，工作簿打开）。|
| [prompt](/cells/python-net/zh/aspose.cells.externalconnections/connectionparameter/prompt) |参数的提示字符串。与输入 UI 一起呈现给电子表格用户<br/>在刷新外部数据之前收集参数值。仅用于<br/>参数类型 = 提示。|
| [type](/cells/python-net/zh/aspose.cells.externalconnections/connectionparameter/type) |使用的参数类型。<br/>如果 parameterType=value，则值为 boolean、double、integer，<br/>或字符串将被使用。在这种情况下，预计只有一个<br/>将指定{boolean、double、integer 或 string}。|
| [name](/cells/python-net/zh/aspose.cells.externalconnections/connectionparameter/name) |参数的名称。|
| [cell_reference](/cells/python-net/zh/aspose.cells.externalconnections/connectionparameter/cell_reference) | Cell 引用，指示要使用哪个单元格的值作为查询参数。仅当 parameterType 为 cell 时使用。|
| [value](/cells/python-net/zh/aspose.cells.externalconnections/connectionparameter/value) |非整数数值、整数值、字符串值或布尔值<br/>用作查询参数。仅当 parameterType 为 value 时使用。|



### 也可以看看
* 模块[`aspose.cells.externalconnections`](..)
