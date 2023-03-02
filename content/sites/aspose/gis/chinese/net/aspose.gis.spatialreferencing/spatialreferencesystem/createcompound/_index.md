---
title: SpatialReferenceSystem.CreateCompound
second_title: Aspose.GIS for .NET API 参考
description: SpatialReferenceSystem 方法. 创建复合 SRS.
type: docs
weight: 340
url: /zh/net/aspose.gis.spatialreferencing/spatialreferencesystem/createcompound/
---
## SpatialReferenceSystem.CreateCompound method

创建复合 SRS.

```csharp
public static CompoundSpatialReferenceSystem CreateCompound(string name, 
    SpatialReferenceSystem head, SpatialReferenceSystem tail, Identifier identifier = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| name | String | 新 SRS 的名称。 |
| head | SpatialReferenceSystem | 新 SRS 的负责人。 |
| tail | SpatialReferenceSystem | 新 SRS 的尾部 SRS。 |
| identifier | Identifier | 标识符，将附加到 SRS。附加标识符不会修改其他 SRS 参数。 确保标识符和 SRS 参数的一致性取决于您。 |

### 返回值

新化合物 SRS。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 除了*identifier*是`null`. |
| InvalidOperationException | *head*或者*tail*本身就是复合 SRS。 |

### 也可以看看

* class [CompoundSpatialReferenceSystem](../../compoundspatialreferencesystem/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* 命名空间 [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* 部件 [Aspose.GIS](../../../)


