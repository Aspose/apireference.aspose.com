---
title: SpatialReferenceSystem.Validate
second_title: Aspose.GIS for .NET API 参考
description: SpatialReferenceSystem 方法. 确定此 SRS 是否有效
type: docs
weight: 240
url: /zh/net/aspose.gis.spatialreferencing/spatialreferencesystem/validate/
---
## SpatialReferenceSystem.Validate method

确定此 SRS 是否有效。

```csharp
public abstract bool Validate(out string errorMessage)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| errorMessage | String& | 如果方法返回`false`，那么这就是无效性的描述。 |

### 返回值

`true`如果 SRS 有效，`false`否则。

### 评论

Valid SRS must have valid ellipsoid. - 地理 SRS 必须恰好有一个东/西轴，恰好有一个北/南轴，以及可选的上/下轴 （当地理 SRS 是二维地理 SRS 和vertical SRS). - 投影的 SRS 必须有一个东/西轴，一个北/南轴，以及可选的上/下轴 （当投影的 SRS 是 2D 地理 SRS 和垂直 SRS 的组合时，存在可选轴）。 - 地心 SRS 必须有一个东/西轴，一个北/南轴和一个其他轴。 - 垂直 SRS 必须有一个上/下轴。 - 本地 SRS 必须至少有一个轴。轴方向不计量。 - 复合 SRS 必须是有效地理/投影和有效垂直 SRS 的组合。

### 也可以看看

* class [SpatialReferenceSystem](../)
* 命名空间 [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* 部件 [Aspose.GIS](../../../)


