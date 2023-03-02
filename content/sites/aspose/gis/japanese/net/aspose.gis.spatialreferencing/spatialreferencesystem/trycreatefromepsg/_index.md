---
title: SpatialReferenceSystem.TryCreateFromEpsg
second_title: Aspose.GIS for .NET API リファレンス
description: SpatialReferenceSystem 方法. 指定された EPSG コードに基づいて空間参照系を作成します
type: docs
weight: 400
url: /ja/net/aspose.gis.spatialreferencing/spatialreferencesystem/trycreatefromepsg/
---
## SpatialReferenceSystem.TryCreateFromEpsg method

指定された EPSG コードに基づいて空間参照系を作成します。

```csharp
public static bool TryCreateFromEpsg(int epsg, out SpatialReferenceSystem value)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| epsg | Int32 | 空間参照系の EPSG コード。 |
| value | SpatialReferenceSystem& | このメソッドが戻るとき`true` 、指定された EPSG コードを持つ SRS が含まれています。それ以外の場合、 が含まれます`null` . |

### 戻り値

`true`指定された EPSG コードが既知であり、SRS が作成された場合。`false`さもないと。

### 関連項目

* method [CreateFromEpsg](../createfromepsg/)
* class [SpatialReferenceSystem](../)
* 名前空間 [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* 組み立て [Aspose.GIS](../../../)


