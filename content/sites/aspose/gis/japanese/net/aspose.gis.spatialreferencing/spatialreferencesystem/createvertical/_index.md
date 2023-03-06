---
title: SpatialReferenceSystem.CreateVertical
second_title: Aspose.GIS for .NET API リファレンス
description: SpatialReferenceSystem 方法. 垂直 SRS を作成します
type: docs
weight: 390
url: /ja/net/aspose.gis.spatialreferencing/spatialreferencesystem/createvertical/
---
## SpatialReferenceSystem.CreateVertical method

垂直 SRS を作成します。

```csharp
public static VerticalSpatialReferenceSystem CreateVertical(string name, 
    VerticalDatum verticalDatum, Unit verticalUnit = null, Axis verticalAxis = null, 
    Identifier identifier = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| name | String | SRSの名前。もしも`null`. |
| verticalDatum | VerticalDatum | SRS で使用するデータム。 |
| verticalUnit | Unit | SRS で使用される単位。もしも`null`、[`Meter`](../../unit/meter/)使用されます. |
| verticalAxis | Axis | SRS で使用される「上」または「下」方向の軸。もしも`null`、上方向の軸が使用されます。 |
| identifier | Identifier | SRS に添付される識別子。識別子をアタッチしても、他の SRS パラメータは変更されません. 識別子と SRS パラメータの一貫性を確保するのはあなた次第です. |

### 戻り値

新しいバーティカル SRS。

### 例外

| 例外 | 調子 |
| --- | --- |
| InvalidOperationException | *verticalAxis*方向は上でも下でもありません。 |
| ArgumentNullException | 必須パラメーターの一部が null です。 |

### 関連項目

* class [VerticalSpatialReferenceSystem](../../verticalspatialreferencesystem/)
* class [VerticalDatum](../../verticaldatum/)
* class [Unit](../../unit/)
* class [Axis](../../axis/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* 名前空間 [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* 組み立て [Aspose.GIS](../../../)


