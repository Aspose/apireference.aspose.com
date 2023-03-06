---
title: Enum SpatialReferenceSystemType
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.SpatialReferencing.SpatialReferenceSystemType 列挙. 空間参照系のタイプを表します
type: docs
weight: 2270
url: /ja/net/aspose.gis.spatialreferencing/spatialreferencesystemtype/
---
## SpatialReferenceSystemType enumeration

空間参照系のタイプを表します。

```csharp
public enum SpatialReferenceSystemType
```

### 値

| 名前 | 価値 | 説明 |
| --- | --- | --- |
| Unknown | `0` | デフォルト値。 から返すことができます[`Type`](../spatialreferencesystem/type/)これが、基になる SRS の の組み合わせが無効な複合 SRS である場合。見る[`IsCompound`](../spatialreferencesystem/iscompound/) . |
| Geographic | `1` | 地理的 SRS は角経度と角緯度に基づいています。 地理的 SRS は次のように変換できます。[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) 経由[`AsGeographic`](../spatialreferencesystem/asgeographic/)method. |
| Geocentric | `2` | Geocentric SRS は、地球の中心を原点とする 3 次元デカルト SRS です。 Geocentric SRS は次のように変換できます。[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) 経由[`AsGeocentric`](../spatialreferencesystem/asgeocentric/)method. |
| Projected | `3` | 投影 SRS は、線形 X と線形 Y に基づいています。Geographic SRS. 投影された SRS は次のように変換できます[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) 経由[`AsProjected`](../spatialreferencesystem/asprojected/)method. |
| Vertical | `4` | 垂直 SRS は線形高さ座標を表します。 垂直 SRS は次のように変換できます。[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) 経由[`AsVertical`](../spatialreferencesystem/asvertical/)method. |
| Local | `5` | ローカル SRS は座標を何らかのオブジェクトに関連付けます。他のオブジェクトは地球です。 ローカル SRS は次のオブジェクトに変換できます。[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) 経由[`AsLocal`](../spatialreferencesystem/aslocal/)method. |

### 関連項目

* 名前空間 [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* 組み立て [Aspose.GIS](../../)


