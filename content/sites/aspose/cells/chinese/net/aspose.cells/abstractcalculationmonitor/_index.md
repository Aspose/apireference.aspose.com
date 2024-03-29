---
title: AbstractCalculationMonitor
second_title: Aspose.Cells for .NET API 参考
description: 监控用户跟踪公式计算的进度
type: docs
weight: 30
url: /zh/net/aspose.cells/abstractcalculationmonitor/
---
## AbstractCalculationMonitor class

监控用户跟踪公式计算的进度。

```csharp
public abstract class AbstractCalculationMonitor
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| [CalculatedValue](../../aspose.cells/abstractcalculationmonitor/calculatedvalue) { get; } | 获取单元格的新计算值。 应该只用于[`AfterCalculate`](./aftercalculate). |
| [OriginalValue](../../aspose.cells/abstractcalculationmonitor/originalvalue) { get; } | 获取计算单元格的旧值。 应该只用于[`BeforeCalculate`](./beforecalculate)和[`AfterCalculate`](./aftercalculate). |
| [ValueChanged](../../aspose.cells/abstractcalculationmonitor/valuechanged) { get; } | 计算后单元格的值是否发生变化。 应该只用于[`AfterCalculate`](./aftercalculate). |

## 方法

| 姓名 | 描述 |
| --- | --- |
| virtual [AfterCalculate](../../aspose.cells/abstractcalculationmonitor/aftercalculate)(int, int, int) | 计算一个单元格后执行此方法进行业务。 |
| virtual [BeforeCalculate](../../aspose.cells/abstractcalculationmonitor/beforecalculate)(int, int, int) | 实现这个方法先做生意再计算一个cell。 |
| virtual [OnCircular](../../aspose.cells/abstractcalculationmonitor/oncircular)(IEnumerator) | 在计算循环引用的公式时实现这个方法做生意。 |

### 例子

```csharp
[C#]
//自定义监视器以检查 StackOverflowException 的可能性
public class MyCalculationMonitor : AbstractCalculationMonitor
{
    public override void BeforeCalculate(int sheetIndex, int rowIndex, int colIndex)
    {
        if(new StackTrace(false).FrameCount > 1000)
        {
            throw new Exception("Stop the formula calculation because risk of StackOverflowException");
        }
    }
}
```

### 也可以看看

* 命名空间 [Aspose.Cells](../../aspose.cells)
* 部件 [Aspose.Cells](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Cells.dll -->
