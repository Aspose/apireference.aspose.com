---
title: SpatialReferenceSystem.Validate
second_title: Aspose.GIS for .NET API リファレンス
description: SpatialReferenceSystem 方法. この SRS が有効かどうかを判断します
type: docs
weight: 240
url: /ja/net/aspose.gis.spatialreferencing/spatialreferencesystem/validate/
---
## SpatialReferenceSystem.Validate method

この SRS が有効かどうかを判断します。

```csharp
public abstract bool Validate(out string errorMessage)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| errorMessage | String& | メソッドが戻る場合`false`の場合、これは無効の説明です。 |

### 戻り値

`true` SRSが有効な場合、`false`さもないと。

### 備考

有効な SRS には有効な楕円体が必要です。 - 地理的 SRS には、正確に 1 つの東/西軸、正確に 1 つの南北軸、およびオプションの上下軸 (地理的 SRS が 2D 地理的 SRS と垂直 SRS). - 投影 SRS には、正確に 1 つの東/西軸、正確に 1 つの北/南軸、およびオプションの上下軸 (投影 SRS が 2D 地理 SRS と垂直 SRS の複合である場合、オプションの軸が存在します) が必要です。 - ジオセントリック SRS には、正確に 1 つの東/西軸、正確に 1 つの北/南軸、および正確に 1 つのその他の軸が必要です。 - 垂直 SRS には、正確に 1 つの上/下軸が必要です。軸の方向はメートルではありません. - 複合 SRS は、有効な地理/投影と有効な垂直 SRS の組み合わせである必要があります.

### 関連項目

* class [SpatialReferenceSystem](../)
* 名前空間 [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* 組み立て [Aspose.GIS](../../../)


