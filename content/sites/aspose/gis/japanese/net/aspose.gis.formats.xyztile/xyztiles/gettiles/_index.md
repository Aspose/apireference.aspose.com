---
title: XyzTiles.GetTiles
second_title: Aspose.GIS for .NET API リファレンス
description: XyzTiles 方法. 空間バウンディング ボックスとズーム レベルでタイルを読み込みます
type: docs
weight: 40
url: /ja/net/aspose.gis.formats.xyztile/xyztiles/gettiles/
---
## XyzTiles.GetTiles method

空間バウンディング ボックスとズーム レベルでタイルを読み込みます。

```csharp
public IEnumerable<WebTile> GetTiles(int zoom, Extent extent)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| zoom | Int32 | タイルをロードするためのズーム レベル。最高のズーム レベルは 0 です。ほとんどのタイル プロバイダーには、約 22 の最大ズーム レベルがあります。 |
| extent | Extent | タイルを読み込む境界ボックス。見つからない場合は、Wgs84 空間参照が使用されます。 |

### 戻り値

Web タイル。

### 関連項目

* class [WebTile](../../../aspose.gis.raster.web/webtile/)
* class [Extent](../../../aspose.gis/extent/)
* class [XyzTiles](../)
* 名前空間 [Aspose.Gis.Formats.XyzTile](../../xyztiles/)
* 組み立て [Aspose.GIS](../../../)


