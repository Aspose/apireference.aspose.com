---
title: OnCircular
second_title: Aspose.Cells for .NET API 参考
description: 在计算循环引用的公式时实现这个方法做生意
type: docs
weight: 60
url: /zh/net/aspose.cells/abstractcalculationmonitor/oncircular/
---
## AbstractCalculationMonitor.OnCircular method

在计算循环引用的公式时实现这个方法做生意。

```csharp
public virtual bool OnCircular(IEnumerator circularCellsData)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| circularCellsData | IEnumerator | 带有 CalculationCell 项的 IEnumerator 表示 依赖于循环引用的单元格。 |

### 返回值

调用后公式引擎是否需要循环计算这些单元格。 True 让公式引擎继续为它们进行计算。 False 让公式引擎将这些单元格标记为已计算。

### 评论

在实现中，用户还可以将预期值设置为部分/所有单元格的计算结果 ，因此公式引擎不会递归计算它们。

### 也可以看看

* class [AbstractCalculationMonitor](../../abstractcalculationmonitor)
* 命名空间 [Aspose.Cells](../../abstractcalculationmonitor)
* 部件 [Aspose.Cells](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Cells.dll -->
