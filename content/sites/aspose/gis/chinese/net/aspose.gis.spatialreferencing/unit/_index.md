---
title: Class Unit
second_title: Aspose.GIS for .NET API 参考
description: Aspose.Gis.SpatialReferencing.Unit 班级. 表示计量单位
type: docs
weight: 2290
url: /zh/net/aspose.gis.spatialreferencing/unit/
---
## Unit class

表示计量单位。

```csharp
public class Unit : IdentifiableObject
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [Unit](unit/)(string, double, Identifier) | 创建新实例. |

## 特性

| 姓名 | 描述 |
| --- | --- |
| static [Degree](../../aspose.gis.spatialreferencing/unit/degree/) { get; } | 获取代表度数的单位。 |
| static [Meter](../../aspose.gis.spatialreferencing/unit/meter/) { get; } | 获取代表米的单位。 |
| static [Radian](../../aspose.gis.spatialreferencing/unit/radian/) { get; } | 获取代表弧度的单位。 |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | 如果此对象标识符是 EPSG 标识符 - 返回其代码。否则 - 返回 -1. |
| [Factor](../../aspose.gis.spatialreferencing/unit/factor/) { get; } | 米的系数，如果这是长度单位，弧度的系数，如果这是角度单位。 |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | 此可识别对象的标识符。 |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | 此对象的名称。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [Apply](../../aspose.gis.spatialreferencing/unit/apply/)(double) | 将参数转换为单位，由此实例描述。 |
| [Deapply](../../aspose.gis.spatialreferencing/unit/deapply/)(double) | 将此实例描述的单位参数转换为弧度或米。 |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | 返回表示当前对象的字符串。 |

### 也可以看看

* class [IdentifiableObject](../identifiableobject/)
* 命名空间 [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* 部件 [Aspose.GIS](../../)


