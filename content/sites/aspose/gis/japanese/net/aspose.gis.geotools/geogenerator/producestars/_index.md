---
title: GeoGenerator.ProduceStars
second_title: Aspose.GIS for .NET API リファレンス
description: GeoGenerator 方法. 星の配列を作成しますそれらはすべて指定範囲内にあります
type: docs
weight: 40
url: /ja/net/aspose.gis.geotools/geogenerator/producestars/
---
## GeoGenerator.ProduceStars method

星の配列を作成します。それらはすべて指定範囲内にあります。

```csharp
public static IEnumerable<IPolygon> ProduceStars(Extent rect, StarGeneratorOptions options)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| rect | Extent | 指定された領域 (参照[`範囲`](../../../aspose.gis/extent/)) |
| options | StarGeneratorOptions | ポリゴン作成オプション([`StarGeneratorOptions`](../../stargeneratoroptions/)) |

### 戻り値

星の配列 (の列挙を参照)[`IP ポリゴン`](../../../aspose.gis.geometries/ipolygon/))

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentOutOfRangeException | 星の数は 1 より大きい必要があります。 |
| NullReferenceException | エクステントには値が必要です (NULL ではない) |
| ArgumentException | 最小長と最大長は等しくなく、3 より大きくなければなりません |
| ArgumentException | 最大長は最小長より大きくなければなりません |

### 関連項目

* interface [IPolygon](../../../aspose.gis.geometries/ipolygon/)
* class [Extent](../../../aspose.gis/extent/)
* class [StarGeneratorOptions](../../stargeneratoroptions/)
* class [GeoGenerator](../)
* 名前空間 [Aspose.Gis.GeoTools](../../geogenerator/)
* 組み立て [Aspose.GIS](../../../)


