---
title: IGeometry.Overlaps
second_title: Aspose.GIS for .NET API 参考
description: IGeometry 方法. 确定此几何是否与指定几何重叠
type: docs
weight: 280
url: /zh/net/aspose.gis.geometries/igeometry/overlaps/
---
## IGeometry.Overlaps method

确定此几何是否与指定几何重叠。

```csharp
public bool Overlaps(IGeometry other)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| other | IGeometry | 一个几何。 |

### 返回值

`true`如果此几何图形“在空间上重叠”另一个几何图形。`false`否则.

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 参数是`null`. |
| ArgumentException | 其中一个几何图形无效，无法完成操作。 |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/)几何形状不等价。 您可以使用[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/)为了将几何图形转换为相同的 spatial 参考系统。 |

### 评论

此方法根据 DE-9IM 交集矩阵测试几何图形是否重叠。 如果两个几何图形有一些但不是所有的内部点相同，并且几何图形 的交点与几何图形本身具有相同的维度，则两个几何图形重叠。 两个Point几何或两个Surface几何 this 方法等同于： 两个Line几何图形此方法等效于： 对于两个不相等的几何图形[`Dimension`](../dimension/)这个方法总是返回`false`. 有关 DE-9IM 和“空间重叠”关系的更多详细信息，请参阅 OpenGIS 简单特征规范。

```csharp
this.Relate(other, "T*T***T**");
```

```csharp
this.Relate(other, "1*T***T**");
```

### 也可以看看

* interface [IGeometry](../)
* 命名空间 [Aspose.Gis.Geometries](../../igeometry/)
* 部件 [Aspose.GIS](../../../)


