---
title: Map.Extent
second_title: Aspose.GIS for .NET API リファレンス
description: Map 財産. レンダリングするマップの境界を指定します に設定されている場合nullレンダリング中に範囲が計算されすべてのレイヤーのすべてのジオメトリが含まれます.
type: docs
weight: 40
url: /ja/net/aspose.gis.rendering/map/extent/
---
## Map.Extent property

レンダリングするマップの境界を指定します。 に設定されている場合`null`、レンダリング中に範囲が計算され、すべてのレイヤーのすべてのジオメトリが含まれます.

```csharp
public Extent Extent { get; set; }
```

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentException | [`IsValid`](../../../aspose.gis/extent/isvalid/)は`false`.[`Width`](../../../aspose.gis/extent/width/)ゼロ以下です。[`Height`](../../../aspose.gis/extent/height/)ゼロ以下です。[`SpatialReferenceSystem`](../../../aspose.gis/extent/spatialreferencesystem/)は`null`. |

### 備考

範囲の空間参照系がマップの空間参照系と等しくない場合、範囲はレンダリング中に ターゲット空間参照系に変換されます.

### 関連項目

* class [Extent](../../../aspose.gis/extent/)
* class [Map](../)
* 名前空間 [Aspose.Gis.Rendering](../../map/)
* 組み立て [Aspose.GIS](../../../)


