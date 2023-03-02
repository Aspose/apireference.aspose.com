---
title: IGeometry.Touches
second_title: Aspose.GIS for .NET API 参考
description: IGeometry 方法. 确定此几何体和指定的几何体是否接触
type: docs
weight: 360
url: /zh/net/aspose.gis.geometries/igeometry/touches/
---
## IGeometry.Touches method

确定此几何体和指定的几何体是否接触。

```csharp
public bool Touches(IGeometry other)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| other | IGeometry | 一个几何。 |

### 返回值

`true`如果此几何体“空间接触”另一个几何体。`false`否则.

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 参数是`null`. |
| ArgumentException | 其中一个几何图形无效，无法完成操作。 |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/)几何形状不等价。 您可以使用[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/)为了将几何图形转换为相同的 spatial 参考系统。 |

### 评论

此方法根据 DE-9IM 交集矩阵测试几何图形是否相互接触。 如果两个几何图形至少有一个共同的边界点，但没有内部点，则它们相互接触。 即：两个[`LineString`](../../linestring/)如果它们共享一个端点但不共享一个线段，则它们会相互接触， 如果两个多边形共享外环或内环的一部分，但它们的内部不重叠，则它们会相互接触。 这个方法等同于： 有关 DE-9IM 和“空间接触”关系的更多详细信息，请参阅 OpenGIS 简单特征规范。

```csharp
this.Relate(other, "FT*******") || this.Relate(other, "F**T*****") || this.Relate(other, "F***T****");
```

### 也可以看看

* interface [IGeometry](../)
* 命名空间 [Aspose.Gis.Geometries](../../igeometry/)
* 部件 [Aspose.GIS](../../../)


