---
title: SpatialReferenceSystem.CreateProjected
second_title: Aspose.GIS for .NET API 参考
description: SpatialReferenceSystem 方法. 从自定义参数创建预计 SRS
type: docs
weight: 380
url: /zh/net/aspose.gis.spatialreferencing/spatialreferencesystem/createprojected/
---
## SpatialReferenceSystem.CreateProjected method

从自定义参数创建预计 SRS。

```csharp
public static ProjectedSpatialReferenceSystem CreateProjected(
    ProjectedSpatialReferenceSystemParameters parameters, Identifier identifier = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| parameters | ProjectedSpatialReferenceSystemParameters | 从中创建的参数。 |
| identifier | Identifier | 标识符，将附加到 SRS。附加标识符不会修改其他 SRS 参数。 确保标识符和 SRS 参数的一致性取决于您。 |

### 返回值

新的预计 SRS。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| InvalidOperationException | 参数中的基本 SRS 是`null`. 参数中的投影方法是`null`. |

### 也可以看看

* class [ProjectedSpatialReferenceSystem](../../projectedspatialreferencesystem/)
* class [ProjectedSpatialReferenceSystemParameters](../../projectedspatialreferencesystemparameters/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* 命名空间 [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* 部件 [Aspose.GIS](../../../)


