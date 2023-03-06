---
title: TopoJsonDriver.SupportsSpatialReferenceSystem
second_title: Aspose.GIS for .NET API リファレンス
description: TopoJsonDriver 方法. 指定された空間参照系がドライバーでサポートされているかどうかを判断します
type: docs
weight: 60
url: /ja/net/aspose.gis.formats.topojson/topojsondriver/supportsspatialreferencesystem/
---
## TopoJsonDriver.SupportsSpatialReferenceSystem method

指定された空間参照系がドライバーでサポートされているかどうかを判断します。

```csharp
public override bool SupportsSpatialReferenceSystem(SpatialReferenceSystem spatialReferenceSystem)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| spatialReferenceSystem | SpatialReferenceSystem | 空間参照系。 |

### 戻り値

指定された空間参照系がドライバーでサポートされているかどうかを示すブール値。

### 備考

TopoJSON の場合、サポートされている唯一の空間参照系は「null」です。これは、 空間参照系情報を TopoJSON ファイルに格納する方法がなく、TopoJSON 仕様で、 が TopoJSON ファイル内のジオメトリの空間参照系であると指定されていないためです.

### 関連項目

* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [TopoJsonDriver](../)
* 名前空間 [Aspose.Gis.Formats.TopoJson](../../topojsondriver/)
* 組み立て [Aspose.GIS](../../../)


