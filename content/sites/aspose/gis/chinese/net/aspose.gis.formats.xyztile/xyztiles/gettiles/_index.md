---
title: XyzTiles.GetTiles
second_title: Aspose.GIS for .NET API 参考
description: XyzTiles 方法. 通过空间边界框和缩放级别加载图块
type: docs
weight: 40
url: /zh/net/aspose.gis.formats.xyztile/xyztiles/gettiles/
---
## XyzTiles.GetTiles method

通过空间边界框和缩放级别加载图块。

```csharp
public IEnumerable<WebTile> GetTiles(int zoom, Extent extent)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| zoom | Int32 | 加载图块的缩放级别。最高缩放级别为 0。大多数磁贴提供程序有大约 22 个最大缩放级别。 |
| extent | Extent | 加载图块的边界框。如果遗漏，将使用 Wgs84 空间参考。 |

### 返回值

Web 磁贴。

### 也可以看看

* class [WebTile](../../../aspose.gis.raster.web/webtile/)
* class [Extent](../../../aspose.gis/extent/)
* class [XyzTiles](../)
* 命名空间 [Aspose.Gis.Formats.XyzTile](../../xyztiles/)
* 部件 [Aspose.GIS](../../../)


