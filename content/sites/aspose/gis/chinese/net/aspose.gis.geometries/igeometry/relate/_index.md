---
title: IGeometry.Relate
second_title: Aspose.GIS for .NET API 参考
description: IGeometry 方法. 确定此几何和指定几何的 DE9IM 交集矩阵是否与提供的模式匹配
type: docs
weight: 290
url: /zh/net/aspose.gis.geometries/igeometry/relate/
---
## IGeometry.Relate method

确定此几何和指定几何的 DE-9IM 交集矩阵是否与提供的模式匹配。

```csharp
public bool Relate(IGeometry other, string intersectionPatternMatrix)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| other | IGeometry | 一个几何。 |
| intersectionPatternMatrix | String | 要匹配的模式。 这应该是长度等于 9 的字符串。 字符串的每个字符代表交集的预期维度： 字符 0 - 在几何体的内部之间。字符 1 - 在此几何体的内部和另一个几何体的边界之间。字符 2 - 在此几何体的内部和另一个几何体的外部之间。字符 3 - 在此几何体的边界和另一个几何体的内部之间。字符 4 - 在几何图形的边界之间。字符 5 - 在此几何体的边界与另一个几何体的外部之间。字符 6 - 在此几何体的外部和另一个几何体的内部之间。字符 7 - 在此几何体的外部和另一个几何体的边界之间。字符 8 - 在几何体的外部之间。 每个字符的可能值为： * - 任何值；F——无交点；T——任意路口；0 - 点交点（例如共享点）；1 - 线交点（例如线的共享段）；2 - 区域交集（例如多边形的共享部分）； 例如，相交模式“F0*********”表示几何内部 之间不应有交集，几何边界之间的交点必须是一个点。 有关相交矩阵的更多详细信息，请参阅 OpenGIS 简单要素规范模式. |

### 返回值

`true`如果这个交集矩阵匹配模式；`false`否则.

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | *other*是`null`. |
| ArgumentException | 其中一个几何图形无效，无法完成操作。 |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/)几何形状不等价。 您可以使用[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/)为了将几何图形转换为相同的 spatial 参考系统。 |

### 评论

此方法构建 DE-9IM 交集矩阵并将其与模式匹配 有关 DE-9IM 交集矩阵的更多详细信息，请参阅 OpenGIS 简单要素规范。

### 例子

以下代码：  将检测几何图形在空间上是否相等。

```csharp
geometry.Relate(other, "T*F**FFF*");
```

### 也可以看看

* interface [IGeometry](../)
* 命名空间 [Aspose.Gis.Geometries](../../igeometry/)
* 部件 [Aspose.GIS](../../../)


