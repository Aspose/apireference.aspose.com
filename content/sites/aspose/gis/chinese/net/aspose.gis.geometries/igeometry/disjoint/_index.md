---
title: IGeometry.Disjoint
second_title: Aspose.GIS for .NET API 参考
description: IGeometry 方法. 确定此几何是否与指定几何不相交
type: docs
weight: 180
url: /zh/net/aspose.gis.geometries/igeometry/disjoint/
---
## IGeometry.Disjoint method

确定此几何是否与指定几何不相交。

```csharp
public bool Disjoint(IGeometry other)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| other | IGeometry | 一个几何。 |

### 返回值

`true`如果此几何与另一个几何“在空间上不相交”。`false`否则.

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 参数是`null`. |
| ArgumentException | 其中一个几何图形无效，无法完成操作。 |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/)几何形状不等价。 您可以使用[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/)为了将几何图形转换为相同的 spatial 参考系统。 |

### 评论

此方法测试几何图形在 DE-9IM 交集矩阵方面是否不相交。 基本上，它测试两个几何图形没有公共点。 这个方法等同于： 有关 DE-9IM 的更多详细信息，请参阅 OpenGIS 简单功能规范。

```csharp
this.Relate(other, "FF*FF****");
```

### 也可以看看

* method [Intersects](../intersects/)
* interface [IGeometry](../)
* 命名空间 [Aspose.Gis.Geometries](../../igeometry/)
* 部件 [Aspose.GIS](../../../)


