---
title: GeographicDatum.GeographicDatum
second_title: Aspose.GIS for .NET API リファレンス
description: GeographicDatum コンストラクタ. 新しいインスタンスを作成します
type: docs
weight: 10
url: /ja/net/aspose.gis.spatialreferencing/geographicdatum/geographicdatum/
---
## GeographicDatum constructor

新しいインスタンスを作成します。

```csharp
public GeographicDatum(string name, Ellipsoid ellipsoid, 
    BursaWolfParameters toWgs84Parameters = null, Identifier identifier = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| name | String | このデータムの名前。 |
| ellipsoid | Ellipsoid | このデータムの楕円体。 null にすることはできません。 |
| toWgs84Parameters | BursaWolfParameters | このデータムの座標を WGS84 データムの座標に変換するためにブルサ ウルフ式に与えることができるパラメーター。 null、ToWgs84 が設定されます[`IsNull`](../../bursawolfparameters/isnull/)parameters. |
| identifier | Identifier | このデータムの識別子。 |

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | ellipsoid無効である。 |

### 関連項目

* class [Ellipsoid](../../ellipsoid/)
* class [BursaWolfParameters](../../bursawolfparameters/)
* class [Identifier](../../identifier/)
* class [GeographicDatum](../)
* 名前空間 [Aspose.Gis.SpatialReferencing](../../geographicdatum/)
* 組み立て [Aspose.GIS](../../../)


