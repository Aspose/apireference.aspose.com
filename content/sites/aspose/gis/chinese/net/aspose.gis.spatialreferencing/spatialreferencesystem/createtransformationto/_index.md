---
title: SpatialReferenceSystem.CreateTransformationTo
second_title: Aspose.GIS for .NET API 参考
description: SpatialReferenceSystem 方法. 从中创建转换空间参考系统给另一个空间参考系统.
type: docs
weight: 180
url: /zh/net/aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/
---
## SpatialReferenceSystem.CreateTransformationTo method

从中创建转换`空间参考系统`给另一个`空间参考系统`.

```csharp
public SpatialReferenceSystemTransformation CreateTransformationTo(SpatialReferenceSystem targetSrs)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| targetSrs | SpatialReferenceSystem | 其他`空间参考系统`. |

### 返回值

由此改造`空间参考系统`给另一个`空间参考系统`.

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| NotSupportedException | 这之间的转换`空间参考系统`并且不支持参数。 这可能会发生，因为不支持其中一个投影，或者其中一个系统是[`VerticalSpatialReferenceSystem`](../../verticalspatialreferencesystem/)or [`LocalSpatialReferenceSystem`](../../localspatialreferencesystem/). |
| [TransformationException](../../transformationexception/) | 由于内部参数错误，无法创建转换`空间参考系统`. |

### 也可以看看

* method [TryCreateTransformationTo](../trycreatetransformationto/)
* class [SpatialReferenceSystemTransformation](../../spatialreferencesystemtransformation/)
* class [SpatialReferenceSystem](../)
* 命名空间 [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* 部件 [Aspose.GIS](../../../)


