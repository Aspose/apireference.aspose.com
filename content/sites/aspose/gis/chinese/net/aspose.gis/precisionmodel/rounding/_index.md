---
title: PrecisionModel.Rounding
second_title: Aspose.GIS for .NET API 参考
description: PrecisionModel 方法. 返回舍入精度模型 根据舍入精度模型只有有限数量的数字是重要的
type: docs
weight: 20
url: /zh/net/aspose.gis/precisionmodel/rounding/
---
## PrecisionModel.Rounding method

返回舍入精度模型。 根据舍入精度模型，只有有限数量的数字是重要的。

```csharp
public static PrecisionModel Rounding(int significantDigits)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| significantDigits | Int32 | 有效数字的数目。 |

### 返回值

舍入精度模型。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentOutOfRangeException | 有效位数小于0或大于15. |

### 评论

当应用于坐标时，以下代码用于降低精度：

```csharp
double rounded = Math.Round(value, significantDigits);
```

### 也可以看看

* class [PrecisionModel](../)
* 命名空间 [Aspose.Gis](../../precisionmodel/)
* 部件 [Aspose.GIS](../../../)


