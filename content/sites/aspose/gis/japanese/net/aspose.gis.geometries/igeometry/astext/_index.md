---
title: IGeometry.AsText
second_title: Aspose.GIS for .NET API リファレンス
description: IGeometry 方法. このジオメトリを WellKnown Text 表現に変換します
type: docs
weight: 120
url: /ja/net/aspose.gis.geometries/igeometry/astext/
---
## AsText() {#astext}

このジオメトリを Well-Known Text 表現に変換します。

```csharp
public string AsText()
```

### 戻り値

このジオメトリの Well-Known Text 表現。

### 備考

このメソッドの出力はIso WKT バリアント。

### 関連項目

* interface [IGeometry](../)
* 名前空間 [Aspose.Gis.Geometries](../../igeometry/)
* 組み立て [Aspose.GIS](../../../)

---

## AsText(WktVariant) {#astext_1}

このジオメトリを Well-Known Text 表現に変換します。

```csharp
public string AsText(WktVariant variant)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| variant | WktVariant | 使用する Well-Known Text バリアント。 |

### 戻り値

このジオメトリの Well-Known Text 表現。

### 例外

| 例外 | 調子 |
| --- | --- |
| NotSupportedException | ジオメトリは、要求された WKT バリアントではサポートされていません。 次のジオメトリは、によってのみサポートされています。IsoWKT バリアント: [`CircularString`](../../circularstring/)[`CompoundCurve`](../../compoundcurve/)[`CurvePolygon`](../../curvepolygon/)[`MultiCurve`](../../multicurve/)[`MultiSurface`](../../multisurface/) 他のすべてのジオメトリは、すべての WKT バリアントでサポートされています。 |
| ArgumentOutOfRangeException | *variant*は有効ではありません[`WktVariant`](../../wktvariant/). |

### 関連項目

* enum [WktVariant](../../wktvariant/)
* interface [IGeometry](../)
* 名前空間 [Aspose.Gis.Geometries](../../igeometry/)
* 組み立て [Aspose.GIS](../../../)

---

## AsText(WktVariant, NumericFormat) {#astext_2}

このジオメトリを Well-Known Text 表現に変換します。

```csharp
public string AsText(WktVariant variant, NumericFormat format)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| variant | WktVariant | 使用する Well-Known Text バリアント。 |
| format | NumericFormat | 文字列に変換する座標形式。を参照してください[`NumericFormat`](../../../aspose.gis/numericformat/)それを得るために。 |

### 戻り値

このジオメトリの Well-Known Text 表現。

### 例外

| 例外 | 調子 |
| --- | --- |
| NotSupportedException | 要求された WKT バリアントでジオメトリを表現できません。現在、これは when で発生します[`HasCurveGeometry`](../hascurvegeometry/)ジオメトリの`true`および WKT バリアント is SimpleFeatureAccessOutdated . |
| ArgumentOutOfRangeException | *variant*は有効ではありません[`WktVariant`](../../wktvariant/). |

### 関連項目

* enum [WktVariant](../../wktvariant/)
* class [NumericFormat](../../../aspose.gis/numericformat/)
* interface [IGeometry](../)
* 名前空間 [Aspose.Gis.Geometries](../../igeometry/)
* 組み立て [Aspose.GIS](../../../)


