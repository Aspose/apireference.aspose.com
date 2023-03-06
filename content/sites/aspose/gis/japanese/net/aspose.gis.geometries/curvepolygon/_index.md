---
title: Class CurvePolygon
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.Geometries.CurvePolygon クラス. 1 つの外部境界と 0 個以上の内部境界で定義される平面サーフェス
type: docs
weight: 910
url: /ja/net/aspose.gis.geometries/curvepolygon/
---
## CurvePolygon class

1 つの外部境界と 0 個以上の内部境界で定義される平面サーフェス。

```csharp
public class CurvePolygon : Surface, ICurvePolygon
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [CurvePolygon](curvepolygon/#constructor)() | の新しいインスタンスを初期化します`CurvePolygon`class. |
| [CurvePolygon](curvepolygon/#constructor_1)(ICurve) | の新しいインスタンスを初期化します`CurvePolygon`class. |
| [CurvePolygon](curvepolygon/#constructor_2)(ICurve, IEnumerable&lt;ICurve&gt;) | の新しいインスタンスを初期化します`CurvePolygon`class. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension/) { get; } | この座標次元の数を取得します[`Geometry`](../geometry/) . |
| [Dimension](../../aspose.gis.geometries/surface/dimension/) { get; } | このトポロジー次元を取得します[`Geometry`](../geometry/) . |
| [ExteriorRing](../../aspose.gis.geometries/curvepolygon/exteriorring/) { get; set; } | 外部リングを取得します。 |
| override [GeometryType](../../aspose.gis.geometries/curvepolygon/geometrytype/) { get; } | ジオメトリのタイプを取得します。 |
| override [HasCurveGeometry](../../aspose.gis.geometries/curvepolygon/hascurvegeometry/) { get; } | このジオメトリが曲線 (線形ではない) ジオメトリであるか、曲線を含むかどうかを示す値を取得します。 |
| [HasM](../../aspose.gis.geometries/curvepolygon/hasm/) { get; set; } | このインスタンスが M 座標を持つかどうかを示す値を取得します。 |
| [HasZ](../../aspose.gis.geometries/curvepolygon/hasz/) { get; set; } | このインスタンスが Z 座標を持つかどうかを示す値を取得します。 |
| [InteriorRingsCount](../../aspose.gis.geometries/curvepolygon/interiorringscount/) { get; } | 内部リングの数を取得します。 |
| override [IsEmpty](../../aspose.gis.geometries/curvepolygon/isempty/) { get; } | このインスタンスが空かどうかを示す値を取得します。 |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple/) { get; } | このインスタンスが SFA の観点から単純かどうかを示す値を取得します。 |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid/) { get; } | このインスタンスが有効かどうかを示す値を取得します。 |
| [SpatialReferenceSystem](../../aspose.gis.geometries/curvepolygon/spatialreferencesystem/) { get; set; } | このインスタンスの SpatialReferenceSystem を取得します。 このプロパティは、`null` 、SpatialReferenceSystem は不明です。 新しい SpatialReferenceSystem を割り当てると、座標変換は実行されず、参照のみが変更されます。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [AddInteriorRing](../../aspose.gis.geometries/curvepolygon/addinteriorring/)(ICurve) | 内部リングを追加します。 |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)() | このジオメトリを Well-Known Binary 表現に変換します。 |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)(WkbVariant) | このジオメトリを Well-Known Binary 表現に変換します。 |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(Measurement, Measurement, Renderer, VectorSymbolizer) | このジオメトリを画像表現にエクスポートします。 |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | このジオメトリを画像表現にエクスポートします。 |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | このジオメトリを画像表現にエクスポートします。 |
| [AsText](../../aspose.gis.geometries/geometry/astext/)() | このジオメトリを Well-Known Text 表現に変換します。 |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant) | このジオメトリを Well-Known Text 表現に変換します。 |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant, NumericFormat) | このジオメトリを Well-Known Text 表現に変換します。 |
| override [Clone](../../aspose.gis.geometries/curvepolygon/clone/)() | このインスタンスを複製します。 |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby/)(IGeometry) | このジオメトリが指定されたジオメトリによってカバーされているかどうかを判断します. |
| [Covers](../../aspose.gis.geometries/geometry/covers/)(IGeometry) | このジオメトリが指定されたジオメトリをカバーするかどうかを決定します. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses/)(IGeometry) | このジオメトリと指定されたジオメトリが交差するかどうかを決定します. |
| [Difference](../../aspose.gis.geometries/geometry/difference/)(IGeometry) | このジオメトリから指定されたジオメトリを減算します。 |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint/)(IGeometry) | このジオメトリが指定されたジオメトリから切り離されているかどうかを判断します. |
| [Equals](../../aspose.gis.geometries/curvepolygon/equals/#equals)(ICurvePolygon) | 現在のオブジェクトが同じ型の別のオブジェクトと等しいかどうかを示します。 |
| override [Equals](../../aspose.gis.geometries/curvepolygon/equals/#equals_1)(object) | 指定されたオブジェクトが現在のオブジェクトと等しいかどうかを判断します。 |
| [GetArea](../../aspose.gis.geometries/geometry/getarea/)() | このジオメトリの面積を計算します. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer/)(double, int) | このジオメトリの周囲のバッファ領域を計算します. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid/)() | このジオメトリの重心を計算します。 |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull/)() | このジオメトリの凸包を計算します. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto/)(IGeometry) | このジオメトリと指定されたジオメトリ間の最小距離を計算します. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent/)() | このジオメトリの境界範囲を計算して返します. |
| override [GetHashCode](../../aspose.gis.geometries/curvepolygon/gethashcode/)() | デフォルトのハッシュ関数として機能します。 |
| [GetInteriorRing](../../aspose.gis.geometries/curvepolygon/getinteriorring/)(int) | インデックスで内部リングを取得します。 |
| [GetLength](../../aspose.gis.geometries/geometry/getlength/)() | このジオメトリの長さを計算します. |
| override [GetPointOnSurface](../../aspose.gis.geometries/curvepolygon/getpointonsurface/)() | この曲がった多角形上にあることが保証されている点を見つけます. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection/)(IGeometry) | このジオメトリと指定されたジオメトリの間の交差を構築します。 |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(Extent) | このジオメトリが指定された範囲と交差するかどうかを決定します. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(IGeometry) | このジオメトリと指定されたジオメトリが交差するかどうかを決定します。 |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps/)(IGeometry) | このジオメトリが指定されたジオメトリとオーバーラップするかどうかを決定します。 |
| [Relate](../../aspose.gis.geometries/geometry/relate/)(IGeometry, string) | このジオメトリと指定されたジオメトリの DE-9IM 交差行列が、指定されたパターンと一致するかどうかを決定します。 |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines/)() | このジオメトリのラインとして表されるポリゴンを取得します. |
| [RoundM](../../aspose.gis.geometries/geometry/roundm/)(int) | M 座標を指定された小数桁数に丸めます。 |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy/)(int) | X 座標と Y 座標を、指定された小数点以下の桁数に丸めます。 |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz/)(int) | Z 座標を指定された小数桁数に丸めます。 |
| override [SetEmpty](../../aspose.gis.geometries/curvepolygon/setempty/)() | これを作る[`Geometry`](../geometry/)空. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains/)(IGeometry) | このジオメトリが指定されたジオメトリを空間的に含むかどうかを決定します. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals/)(IGeometry) | このジオメトリが指定されたジオメトリと空間的に等しいかどうかを決定します. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference/)(IGeometry) | このジオメトリと指定されたジオメトリの間の対称差分を作成します。 |
| [ToEditable](../../aspose.gis.geometries/curvepolygon/toeditable/#toeditable)() | このジオメトリの編集可能なコピーを取得します. (3 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable/)() | このジオメトリの編集可能なコピーを取得します. |
| [ToLinearGeometry](../../aspose.gis.geometries/surface/tolineargeometry/)() | デフォルトを使用して、このジオメトリの近似バージョンまたは同等の非曲線バージョンを取得します`許容範囲` . (2 methods) |
| [ToLinearGeometry](../../aspose.gis.geometries/surface/tolineargeometry/)(double) | 指定された値を使用して、このジオメトリの近似バージョンまたは同等の非曲線バージョンを取得します`許容範囲`. (2 methods) |
| override [ToString](../../aspose.gis.geometries/geometry/tostring/)() | 現在のオブジェクトを表す文字列を返します。 |
| [Touches](../../aspose.gis.geometries/geometry/touches/)(IGeometry) | このジオメトリと指定されたジオメトリが接触するかどうかを決定します. |
| [Union](../../aspose.gis.geometries/geometry/union/)(IGeometry) | このジオメトリと指定されたジオメトリを結合します。 |
| [Within](../../aspose.gis.geometries/geometry/within/)(Extent) | このジオメトリが指定された範囲内にあるかどうかを判断します. |
| [Within](../../aspose.gis.geometries/geometry/within/)(IGeometry) | このジオメトリが指定されたジオメトリ内にあるかどうかを判断します. |
| [operator ==](../../aspose.gis.geometries/curvepolygon/op_equality/) | 演算子 ==. を実装します |
| [operator !=](../../aspose.gis.geometries/curvepolygon/op_inequality/) | 演算子 !=. を実装します |

### 関連項目

* class [Surface](../surface/)
* interface [ICurvePolygon](../icurvepolygon/)
* 名前空間 [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* 組み立て [Aspose.GIS](../../)


