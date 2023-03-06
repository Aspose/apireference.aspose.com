---
title: Extent.GetTransformed
second_title: Aspose.GIS for .NET API 参考
description: Extent 方法. 返回指定的新范围SpatialReferenceSystem包含这个范围.
type: docs
weight: 150
url: /zh/net/aspose.gis/extent/gettransformed/
---
## Extent.GetTransformed method

返回指定的新范围[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)包含这个范围.

```csharp
public Extent GetTransformed(SpatialReferenceSystem targetSrs)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| targetSrs | SpatialReferenceSystem | [`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)转变为。 |

### 返回值

转换此范围到指定 SRS. 的结果

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 参数是`null`. |
| NotSupportedException | 不支持转换为提供的 SRS。 |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | 转型失败。 |
| InvalidOperationException | [`SpatialReferenceSystem`](../spatialreferencesystem/)这个程度是`null`. |

### 也可以看看

* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Extent](../)
* 命名空间 [Aspose.Gis](../../extent/)
* 部件 [Aspose.GIS](../../../)


