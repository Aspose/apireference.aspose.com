---
title: SpatialReferenceSystem.CreateCompound
second_title: Aspose.GIS for .NET API リファレンス
description: SpatialReferenceSystem 方法. 複合 SRS を作成します
type: docs
weight: 340
url: /ja/net/aspose.gis.spatialreferencing/spatialreferencesystem/createcompound/
---
## SpatialReferenceSystem.CreateCompound method

複合 SRS を作成します。

```csharp
public static CompoundSpatialReferenceSystem CreateCompound(string name, 
    SpatialReferenceSystem head, SpatialReferenceSystem tail, Identifier identifier = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| name | String | 新しい SRS の名前。 |
| head | SpatialReferenceSystem | 新しい SRS の先頭 SRS。 |
| tail | SpatialReferenceSystem | 新しい SRS のテール SRS。 |
| identifier | Identifier | SRS に添付される識別子。識別子をアタッチしても、他の SRS パラメータは変更されません. 識別子と SRS パラメータの一貫性を確保するのはあなた次第です. |

### 戻り値

新コンパウンドSRS。

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | を除く任意の引数*identifier*は`null`. |
| InvalidOperationException | *head*また*tail*複合SRSそのものです。 |

### 関連項目

* class [CompoundSpatialReferenceSystem](../../compoundspatialreferencesystem/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* 名前空間 [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* 組み立て [Aspose.GIS](../../../)


