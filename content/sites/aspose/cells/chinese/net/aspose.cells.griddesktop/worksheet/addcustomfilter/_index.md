---
title: AddCustomFilter
second_title: Aspose.Cells for .NET API 参考
description: 为从开始行到结束行的指定行范围添加自定义过滤器
type: docs
weight: 450
url: /zh/net/aspose.cells.griddesktop/worksheet/addcustomfilter/
---
## AddCustomFilter(int, int, object[], GridFilterOperatorType[]) {#addcustomfilter}

为从开始行到结束行的指定行范围添加自定义过滤器。

```csharp
public void AddCustomFilter(int startrow, int startcolumn, object[] critiras, 
    GridFilterOperatorType[] filterOperatorTypes)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| startrow | Int32 | 过滤器范围的起始行 |
| startcolumn | Int32 | 过滤器范围的起始列 |
| critiras | Object[] | 列的critira数组，每个都适用于每一列 |
| filterOperatorTypes | GridFilterOperatorType[] | 列的过滤器操作类型数组，每一个适用于每一列 |

### 也可以看看

* enum [GridFilterOperatorType](../../../aspose.cells.griddesktop.data/gridfilteroperatortype)
* class [Worksheet](../../worksheet)
* 命名空间 [Aspose.Cells.GridDesktop](../../worksheet)
* 部件 [Aspose.Cells.GridDesktop](../../../)

---

## AddCustomFilter(int, string) {#addcustomfilter_1}

为指定行添加自定义过滤器。

```csharp
public void AddCustomFilter(int row, string critira)
```

### 评论

过滤条件字符串。注意我们使用 , 和 ;作为拆分字符，因此单元格值不应包含那些拆分 char 以下是标准字符串示例： //列 0 与值 12.3 CELL0 = 12.3 //列 1 与值 ABC CELL1 = ABC //列 0 与值为 123 或 456 或 ABC 和第 1 列的值为 ABC CELL0 = 123,456,ABC； CELL1 = ABC

### 也可以看看

* class [Worksheet](../../worksheet)
* 命名空间 [Aspose.Cells.GridDesktop](../../worksheet)
* 部件 [Aspose.Cells.GridDesktop](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Cells.GridDesktop.dll -->
