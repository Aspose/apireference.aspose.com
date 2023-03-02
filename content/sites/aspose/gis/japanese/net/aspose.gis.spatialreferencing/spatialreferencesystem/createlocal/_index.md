---
title: SpatialReferenceSystem.CreateLocal
second_title: Aspose.GIS for .NET API リファレンス
description: SpatialReferenceSystem 方法. ローカル SRS を作成します
type: docs
weight: 370
url: /ja/net/aspose.gis.spatialreferencing/spatialreferencesystem/createlocal/
---
## SpatialReferenceSystem.CreateLocal method

ローカル SRS を作成します。

```csharp
public static LocalSpatialReferenceSystem CreateLocal(string name, LocalDatum datum, Unit unit, 
    ICollection<Axis> axises, Identifier identifier = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| name | String | SRSの名前。 |
| datum | LocalDatum | SRS で使用するデータム。 |
| unit | Unit | SRSで使用するユニット。 |
| axises | ICollection`1 | SRSで使用する軸。空でない必要があります |
| identifier | Identifier | SRS に添付される識別子。識別子をアタッチしても、他の SRS パラメータは変更されません. 識別子と SRS パラメータの一貫性を確保するのはあなた次第です. |

### 戻り値

新しいローカル SRS。

### 例外

| 例外 | 調子 |
| --- | --- |
| InvalidOperationException | *axises*空です。 |
| ArgumentNullException | を除く任意の引数*identifier*無効である。 |

### 関連項目

* class [LocalSpatialReferenceSystem](../../localspatialreferencesystem/)
* class [LocalDatum](../../localdatum/)
* class [Unit](../../unit/)
* class [Axis](../../axis/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* 名前空間 [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* 組み立て [Aspose.GIS](../../../)


