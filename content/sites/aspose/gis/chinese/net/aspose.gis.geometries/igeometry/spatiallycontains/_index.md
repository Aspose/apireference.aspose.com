---
title: IGeometry.SpatiallyContains
second_title: Aspose.GIS for .NET API 参考
description: IGeometry 方法. 确定此几何图形在空间上是否包含指定的几何图形
type: docs
weight: 310
url: /zh/net/aspose.gis.geometries/igeometry/spatiallycontains/
---
## IGeometry.SpatiallyContains method

确定此几何图形在空间上是否包含指定的几何图形。

```csharp
public bool SpatiallyContains(IGeometry other)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| other | IGeometry | 一个几何。 |

### 返回值

`true`如果此几何图形“在空间上包含”另一个几何图形。`false`否则.

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 参数是`null`. |
| ArgumentException | 其中一个几何图形无效，无法完成操作。 |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/)几何形状不等价。 您可以使用[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/)为了将几何图形转换为相同的 spatial 参考系统。 |

### 评论

此方法根据 DE-9IM 交集矩阵测试一个几何体是否包含另一个几何体。 这个方法等同于：

```csharp
other.Within(this);
```

### 也可以看看

* method [Within](../within/)
* method [Covers](../covers/)
* interface [IGeometry](../)
* 命名空间 [Aspose.Gis.Geometries](../../igeometry/)
* 部件 [Aspose.GIS](../../../)


