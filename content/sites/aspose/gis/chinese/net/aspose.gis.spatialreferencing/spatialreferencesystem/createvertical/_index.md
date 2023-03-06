---
title: SpatialReferenceSystem.CreateVertical
second_title: Aspose.GIS for .NET API 参考
description: SpatialReferenceSystem 方法. 创建垂直 SRS.
type: docs
weight: 390
url: /zh/net/aspose.gis.spatialreferencing/spatialreferencesystem/createvertical/
---
## SpatialReferenceSystem.CreateVertical method

创建垂直 SRS.

```csharp
public static VerticalSpatialReferenceSystem CreateVertical(string name, 
    VerticalDatum verticalDatum, Unit verticalUnit = null, Axis verticalAxis = null, 
    Identifier identifier = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| name | String | SRS 的名称。如果`null`. |
| verticalDatum | VerticalDatum | 在 SRS 中使用的基准。 |
| verticalUnit | Unit | SRS 中使用的单位。如果`null`,[`Meter`](../../unit/meter/)将被使用. |
| verticalAxis | Axis | 具有“向上”或“向下”方向的轴，用于 SRS。如果`null`，将使用向上方向的轴。 |
| identifier | Identifier | 标识符，将附加到 SRS。附加标识符不会修改其他 SRS 参数。 确保标识符和 SRS 参数的一致性取决于您。 |

### 返回值

新的垂直 SRS。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| InvalidOperationException | *verticalAxis*方向不是向上或向下。 |
| ArgumentNullException | 某些必需参数为空。 |

### 也可以看看

* class [VerticalSpatialReferenceSystem](../../verticalspatialreferencesystem/)
* class [VerticalDatum](../../verticaldatum/)
* class [Unit](../../unit/)
* class [Axis](../../axis/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* 命名空间 [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* 部件 [Aspose.GIS](../../../)


