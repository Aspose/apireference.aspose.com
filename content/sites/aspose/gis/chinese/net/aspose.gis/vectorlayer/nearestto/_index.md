---
title: VectorLayer.NearestTo
second_title: Aspose.GIS for .NET API 参考
description: VectorLayer 方法. 获取距离提供的坐标最近的要素
type: docs
weight: 150
url: /zh/net/aspose.gis/vectorlayer/nearestto/
---
## NearestTo(double, double) {#nearestto_1}

获取距离提供的坐标最近的要素。

```csharp
public Feature NearestTo(double x, double y)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| x | Double | 坐标的 X。 |
| y | Double | 坐标的 Y。 |

### 返回值

离提供的坐标最近的要素。

### 也可以看看

* class [Feature](../../feature/)
* class [VectorLayer](../)
* 命名空间 [Aspose.Gis](../../vectorlayer/)
* 部件 [Aspose.GIS](../../../)

---

## NearestTo(IPoint) {#nearestto}

获取离提供的点最近的要素。

```csharp
public Feature NearestTo(IPoint point)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| point | IPoint | 重点。 |

### 返回值

离提供的点最近的要素。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 重点是`null`. |
| ArgumentException | 点为空或无效。 |

### 也可以看看

* class [Feature](../../feature/)
* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [VectorLayer](../)
* 命名空间 [Aspose.Gis](../../vectorlayer/)
* 部件 [Aspose.GIS](../../../)


