---
title: LightCellsDataHandler
second_title: Aspose.Cells for .NET API 参考
description: 表示用于以轻量级模式读取大型电子表格文件的单元格数据处理程序
type: docs
weight: 3950
url: /zh/net/aspose.cells/lightcellsdatahandler/
---
## LightCellsDataHandler interface

表示用于以轻量级模式读取大型电子表格文件的单元格数据处理程序。

```csharp
public interface LightCellsDataHandler
```

## 方法

| 姓名 | 描述 |
| --- | --- |
| [ProcessCell](../../aspose.cells/lightcellsdatahandler/processcell)(Cell) | 开始处理一个单元格。 |
| [ProcessRow](../../aspose.cells/lightcellsdatahandler/processrow)(Row) | 开始处理一行。 |
| [StartCell](../../aspose.cells/lightcellsdatahandler/startcell)(int) | 准备处理一个单元格。 |
| [StartRow](../../aspose.cells/lightcellsdatahandler/startrow)(int) | 准备处理一行。 |
| [StartSheet](../../aspose.cells/lightcellsdatahandler/startsheet)(Worksheet) | 开始处理工作表。 |

### 评论

在这种模式下阅读工作簿时，[`StartSheet`](./startsheet)将在阅读工作簿中的每个工作表时进行检查。 对于一张工作表，如果[`StartSheet`](./startsheet)给出 true，则此工作表的行/单元格的所有数据和属性将被检查 并由此接口的实现处理。对于每一行，[`StartRow`](./startrow)会调用它来检查它是否需要处理。 如果需要处理一行，将首先读取该行的属性，用户可以通过以下方式访问其属性[`ProcessRow`](./processrow). 如果行的单元格也需要处理，那么[`ProcessRow`](./processrow)应该返回 true 然后[`StartCell`](./startcell)将为该行中的每个现有单元格调用 be 以检查是否需要处理一个单元格。如果需要处理一个单元格， 则[`ProcessCell`](./processcell)将通过此接口的实现调用来处理单元格。

### 也可以看看

* 命名空间 [Aspose.Cells](../../aspose.cells)
* 部件 [Aspose.Cells](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Cells.dll -->
