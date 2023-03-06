---
title: SpatialReferenceSystem.IsCompound
second_title: Aspose.GIS for .NET API 参考
description: SpatialReferenceSystem 财产. 返回此 SRS 是否为复合两个 SRS 的并集 复合 SRS 中的以下 SRS 组合被视为有效 地理 SRS  垂直 SRS在这种情况下复合 SRS 的类型将为Geographic. Projected SRS  Vertical SRS在这种情况下复合 SRS 的类型将为Projected. 如果 SRS 的组合不同复合 SRS 的类型将是Unknown.
type: docs
weight: 130
url: /zh/net/aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/
---
## SpatialReferenceSystem.IsCompound property

返回此 SRS 是否为复合（两个 SRS 的并集）。 复合 SRS 中的以下 SRS 组合被视为有效： 地理 SRS + 垂直 SRS，在这种情况下，复合 SRS 的类型将为Geographic. Projected SRS + Vertical SRS，在这种情况下，复合 SRS 的类型将为Projected. 如果 SRS 的组合不同，复合 SRS 的类型将是Unknown.

```csharp
public virtual bool IsCompound { get; }
```

### 评论

在 WKT 中这是 COMPD_CS.

### 也可以看看

* class [SpatialReferenceSystem](../)
* 命名空间 [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* 部件 [Aspose.GIS](../../../)


