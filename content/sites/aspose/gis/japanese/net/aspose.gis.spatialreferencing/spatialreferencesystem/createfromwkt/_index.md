---
title: SpatialReferenceSystem.CreateFromWkt
second_title: Aspose.GIS for .NET API リファレンス
description: SpatialReferenceSystem 方法. 新しい空間参照システムWKT WellKnown Text 文字列に基づく.
type: docs
weight: 20
url: /ja/net/aspose.gis.spatialreferencing/spatialreferencesystem/createfromwkt/
---
## SpatialReferenceSystem.CreateFromWkt method

新しい`空間参照システム`WKT (Well-Known Text) 文字列に基づく.

```csharp
public static SpatialReferenceSystem CreateFromWkt(string wkt)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| wkt | String | WKT 文字列。 |

### 戻り値

新しい`空間参照システム`.

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数は`null`. |
| FormatException | wkt 値の階層、順序または型が間違っています。 |
| NotSupportedException | WKT ルート要素はサポートされていません (たとえば、FITTED_CS です)。 |

### 関連項目

* method [TryCreateFromWkt](../trycreatefromwkt/)
* class [SpatialReferenceSystem](../)
* 名前空間 [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* 組み立て [Aspose.GIS](../../../)


