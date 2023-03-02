---
title: TopoJsonDriver.SupportsSpatialReferenceSystem
second_title: Aspose.GIS for .NET API 参考
description: TopoJsonDriver 方法. 确定驱动程序是否支持指定的空间参考系统
type: docs
weight: 60
url: /zh/net/aspose.gis.formats.topojson/topojsondriver/supportsspatialreferencesystem/
---
## TopoJsonDriver.SupportsSpatialReferenceSystem method

确定驱动程序是否支持指定的空间参考系统。

```csharp
public override bool SupportsSpatialReferenceSystem(SpatialReferenceSystem spatialReferenceSystem)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| spatialReferenceSystem | SpatialReferenceSystem | 空间参考系统。 |

### 返回值

布尔值，表示驱动是否支持指定的空间参照系。

### 评论

对于 TopoJSON，唯一支持的空间参考系统是“空”，因为无法在 TopoJSON 文件中存储 空间参考系统信息，并且 TopoJSON 规范未指定什么 是 TopoJSON 文件中几何的空间参考系统。

### 也可以看看

* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [TopoJsonDriver](../)
* 命名空间 [Aspose.Gis.Formats.TopoJson](../../topojsondriver/)
* 部件 [Aspose.GIS](../../../)


