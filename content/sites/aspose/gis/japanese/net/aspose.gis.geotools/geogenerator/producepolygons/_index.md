---
title: GeoGenerator.ProducePolygons
second_title: Aspose.GIS for .NET API リファレンス
description: GeoGenerator 方法. 指定された数のランダムな項目を持つ新しい IPolygon Enumerator を作成しますそれらはすべて指定された範囲内にあります
type: docs
weight: 30
url: /ja/net/aspose.gis.geotools/geogenerator/producepolygons/
---
## GeoGenerator.ProducePolygons method

指定された数のランダムな項目を持つ新しい IPolygon Enumerator を作成します。それらはすべて指定された範囲内にあります。

```csharp
public static IEnumerable<IPolygon> ProducePolygons(Extent rect, PolygonGeneratorOptions options)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| rect | Extent | 指定された領域 (参照[`範囲`](../../../aspose.gis/extent/)) |
| options | PolygonGeneratorOptions | ポリゴン作成オプション([`PolygonGeneratorOptions`](../../polygongeneratoroptions/)) |

### 戻り値

ポリゴンの配列 (の列挙を参照)[`IP ポリゴン`](../../../aspose.gis.geometries/ipolygon/))

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentOutOfRangeException | ポリゴンの数は 1 より大きい必要があります。 |
| NullReferenceException | エクステントには値が必要です (NULL ではない) |
| ArgumentException | 最小長と最大長は等しくなく、0 より大きくなければなりません |
| ArgumentException | 最大長は最小長より大きくなければなりません |

### 関連項目

* interface [IPolygon](../../../aspose.gis.geometries/ipolygon/)
* class [Extent](../../../aspose.gis/extent/)
* class [PolygonGeneratorOptions](../../polygongeneratoroptions/)
* class [GeoGenerator](../)
* 名前空間 [Aspose.Gis.GeoTools](../../geogenerator/)
* 組み立て [Aspose.GIS](../../../)


