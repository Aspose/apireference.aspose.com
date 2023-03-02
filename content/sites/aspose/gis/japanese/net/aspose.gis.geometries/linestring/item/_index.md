---
title: LineString.Item
second_title: Aspose.GIS for .NET API リファレンス
description: LineString 財産. を取得または設定しますIPoint指定されたインデックスで.
type: docs
weight: 80
url: /ja/net/aspose.gis.geometries/linestring/item/
---
## LineString indexer

を取得または設定します[`IPoint`](../../ipoint/)指定されたインデックスで.

```csharp
public IPoint this[int index] { get; set; }
```

| パラメータ | 説明 |
| --- | --- |
| index | インデックス。 |

### プロパティ値

[`IPoint`](../../ipoint/) .

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentOutOfRangeException | インデックスが範囲外です。 |
| ArgumentNullException | 値は`null`. |
| ArgumentException | ポイントは空です。 |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/)このジオメトリの[`SpatialReferenceSystem`](../spatialreferencesystem/)の引数はどちらもありません`null` と等しくない. |

### 関連項目

* interface [IPoint](../../ipoint/)
* class [LineString](../)
* 名前空間 [Aspose.Gis.Geometries](../../linestring/)
* 組み立て [Aspose.GIS](../../../)


