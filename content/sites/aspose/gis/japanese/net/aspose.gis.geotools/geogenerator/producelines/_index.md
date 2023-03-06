---
title: GeoGenerator.ProduceLines
second_title: Aspose.GIS for .NET API リファレンス
description: GeoGenerator 方法. 指定された数のランダムな項目を持つ新しい ILineString 列挙子を作成しますそれらはすべて指定された範囲内にあります
type: docs
weight: 10
url: /ja/net/aspose.gis.geotools/geogenerator/producelines/
---
## GeoGenerator.ProduceLines method

指定された数のランダムな項目を持つ新しい ILineString 列挙子を作成します。それらはすべて指定された範囲内にあります。

```csharp
public static IEnumerable<ILineString> ProduceLines(Extent rect, LineGeneratorOptions options)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| rect | Extent | 指定された領域 (参照[`範囲`](../../../aspose.gis/extent/)) |
| options | LineGeneratorOptions | ライン作成オプション (を参照)[`LineGeneratorOptions`](../../linegeneratoroptions/)) |

### 戻り値

行の配列 (の列挙を参照)[`ILineString`](../../../aspose.gis.geometries/ilinestring/))

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentOutOfRangeException | 行数は 1 より大きい必要があります。 |
| NullReferenceException | エクステントには値が必要です (NULL ではない) |

### 関連項目

* interface [ILineString](../../../aspose.gis.geometries/ilinestring/)
* class [Extent](../../../aspose.gis/extent/)
* class [LineGeneratorOptions](../../linegeneratoroptions/)
* class [GeoGenerator](../)
* 名前空間 [Aspose.Gis.GeoTools](../../geogenerator/)
* 組み立て [Aspose.GIS](../../../)


