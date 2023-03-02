---
title: Class Curve
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.Geometries.Curve クラス. ACurveポイントのシーケンスです.
type: docs
weight: 900
url: /ja/net/aspose.gis.geometries/curve/
---
## Curve class

A`Curve`ポイントのシーケンスです.

```csharp
public abstract class Curve : Geometry, ICurve
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension/) { get; } | この座標次元の数を取得します[`Geometry`](../geometry/) . |
| [Dimension](../../aspose.gis.geometries/curve/dimension/) { get; } | このトポロジー次元を取得します[`Geometry`](../geometry/) . |
| abstract [EndPoint](../../aspose.gis.geometries/curve/endpoint/) { get; } | 曲線の終点のコピーを返します。 |
| abstract [GeometryType](../../aspose.gis.geometries/geometry/geometrytype/) { get; } | ジオメトリのタイプを取得します。 |
| virtual [HasCurveGeometry](../../aspose.gis.geometries/geometry/hascurvegeometry/) { get; } | このジオメトリが曲線 (線形ではない) ジオメトリであるか、曲線を含むかどうかを示す値を取得します。 |
| virtual [HasM](../../aspose.gis.geometries/geometry/hasm/) { get; set; } | このインスタンスが M 座標を持つかどうかを示す値を取得します。 |
| virtual [HasZ](../../aspose.gis.geometries/geometry/hasz/) { get; set; } | このインスタンスが Z 座標を持つかどうかを示す値を取得します。 |
| [IsClosed](../../aspose.gis.geometries/curve/isclosed/) { get; } | 曲線が閉じているかどうかを示す値を取得します。 始点が終点と等しい場合、曲線は閉じています。 |
| virtual [IsEmpty](../../aspose.gis.geometries/geometry/isempty/) { get; } | このインスタンスが空かどうかを示す値を取得します。 |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple/) { get; } | このインスタンスが SFA の観点から単純かどうかを示す値を取得します。 |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid/) { get; } | このインスタンスが有効かどうかを示す値を取得します。 |
| abstract [SpatialReferenceSystem](../../aspose.gis.geometries/geometry/spatialreferencesystem/) { get; set; } | このインスタンスの SpatialReferenceSystem を取得します。 このプロパティは、`null` 、SpatialReferenceSystem は不明です。 新しい SpatialReferenceSystem を割り当てると、座標変換は実行されず、参照のみが変更されます。 |
| abstract [StartPoint](../../aspose.gis.geometries/curve/startpoint/) { get; } | 曲線の始点のコピーを返します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)() | このジオメトリを Well-Known Binary 表現に変換します。 |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)(WkbVariant) | このジオメトリを Well-Known Binary 表現に変換します。 |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(Measurement, Measurement, Renderer, VectorSymbolizer) | このジオメトリを画像表現にエクスポートします。 |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | このジオメトリを画像表現にエクスポートします。 |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | このジオメトリを画像表現にエクスポートします。 |
| [AsText](../../aspose.gis.geometries/geometry/astext/)() | このジオメトリを Well-Known Text 表現に変換します。 |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant) | このジオメトリを Well-Known Text 表現に変換します。 |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant, NumericFormat) | このジオメトリを Well-Known Text 表現に変換します。 |
| abstract [Clone](../../aspose.gis.geometries/geometry/clone/)() | このインスタンスを複製します。 |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby/)(IGeometry) | このジオメトリが指定されたジオメトリによってカバーされているかどうかを判断します. |
| [Covers](../../aspose.gis.geometries/geometry/covers/)(IGeometry) | このジオメトリが指定されたジオメトリをカバーするかどうかを決定します. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses/)(IGeometry) | このジオメトリと指定されたジオメトリが交差するかどうかを決定します. |
| [Difference](../../aspose.gis.geometries/geometry/difference/)(IGeometry) | このジオメトリから指定されたジオメトリを減算します。 |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint/)(IGeometry) | このジオメトリが指定されたジオメトリから切り離されているかどうかを判断します. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea/)() | このジオメトリの面積を計算します. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer/)(double, int) | このジオメトリの周囲のバッファ領域を計算します. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid/)() | このジオメトリの重心を計算します。 |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull/)() | このジオメトリの凸包を計算します. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto/)(IGeometry) | このジオメトリと指定されたジオメトリ間の最小距離を計算します. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent/)() | このジオメトリの境界範囲を計算して返します. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength/)() | このジオメトリの長さを計算します. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection/)(IGeometry) | このジオメトリと指定されたジオメトリの間の交差を構築します。 |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(Extent) | このジオメトリが指定された範囲と交差するかどうかを決定します. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(IGeometry) | このジオメトリと指定されたジオメトリが交差するかどうかを決定します。 |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps/)(IGeometry) | このジオメトリが指定されたジオメトリとオーバーラップするかどうかを決定します。 |
| [Relate](../../aspose.gis.geometries/geometry/relate/)(IGeometry, string) | このジオメトリと指定されたジオメトリの DE-9IM 交差行列が、指定されたパターンと一致するかどうかを決定します。 |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines/)() | このジオメトリのラインとして表されるポリゴンを取得します. |
| abstract [Reverse](../../aspose.gis.geometries/curve/reverse/)() | この曲線を逆にします。 |
| [RoundM](../../aspose.gis.geometries/geometry/roundm/)(int) | M 座標を指定された小数桁数に丸めます。 |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy/)(int) | X 座標と Y 座標を、指定された小数点以下の桁数に丸めます。 |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz/)(int) | Z 座標を指定された小数桁数に丸めます。 |
| virtual [SetEmpty](../../aspose.gis.geometries/geometry/setempty/)() | これを作る[`Geometry`](../geometry/)空. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains/)(IGeometry) | このジオメトリが指定されたジオメトリを空間的に含むかどうかを決定します. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals/)(IGeometry) | このジオメトリが指定されたジオメトリと空間的に等しいかどうかを決定します. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference/)(IGeometry) | このジオメトリと指定されたジオメトリの間の対称差分を作成します。 |
| [ToEditable](../../aspose.gis.geometries/curve/toeditable/#toeditable)() | このジオメトリの編集可能なコピーを取得します. (2 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable/)() | このジオメトリの編集可能なコピーを取得します. |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry/#tolineargeometry_2)() | デフォルトを使用して、このジオメトリの近似バージョンまたは同等の非曲線バージョンを取得します`許容範囲` . (2 methods) |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry/#tolineargeometry_3)(double) | 指定された値を使用して、このジオメトリの近似バージョンまたは同等の非曲線バージョンを取得します`許容範囲`. (2 methods) |
| override [ToString](../../aspose.gis.geometries/geometry/tostring/)() | 現在のオブジェクトを表す文字列を返します。 |
| [Touches](../../aspose.gis.geometries/geometry/touches/)(IGeometry) | このジオメトリと指定されたジオメトリが接触するかどうかを決定します. |
| [Union](../../aspose.gis.geometries/geometry/union/)(IGeometry) | このジオメトリと指定されたジオメトリを結合します。 |
| [Within](../../aspose.gis.geometries/geometry/within/)(Extent) | このジオメトリが指定された範囲内にあるかどうかを判断します. |
| [Within](../../aspose.gis.geometries/geometry/within/)(IGeometry) | このジオメトリが指定されたジオメトリ内にあるかどうかを判断します. |

### 関連項目

* class [Geometry](../geometry/)
* interface [ICurve](../icurve/)
* 名前空間 [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* 組み立て [Aspose.GIS](../../)


