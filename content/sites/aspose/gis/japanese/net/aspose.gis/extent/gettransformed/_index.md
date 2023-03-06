---
title: Extent.GetTransformed
second_title: Aspose.GIS for .NET API リファレンス
description: Extent 方法. 指定された新しいエクステントを返しますSpatialReferenceSystemこのエクステントを含む.
type: docs
weight: 150
url: /ja/net/aspose.gis/extent/gettransformed/
---
## Extent.GetTransformed method

指定された新しいエクステントを返します[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)このエクステントを含む.

```csharp
public Extent GetTransformed(SpatialReferenceSystem targetSrs)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| targetSrs | SpatialReferenceSystem | [`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)に変身します。 |

### 戻り値

この範囲を指定された SRS に変換した結果。

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数は`null`. |
| NotSupportedException | 提供された SRS への変換はサポートされていません。 |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | 変換に失敗しました。 |
| InvalidOperationException | [`SpatialReferenceSystem`](../spatialreferencesystem/)この程度のは`null` . |

### 関連項目

* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Extent](../)
* 名前空間 [Aspose.Gis](../../extent/)
* 組み立て [Aspose.GIS](../../../)


