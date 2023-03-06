---
title: Class CompoundCurve
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.Geometries.CompoundCurve クラス. 隣接する曲線が終点で結合されるように連続する曲線のシーケンスを表す曲線
type: docs
weight: 890
url: /ja/net/aspose.gis.geometries/compoundcurve/
---
## CompoundCurve class

隣接する曲線が終点で結合されるように、連続する曲線のシーケンスを表す曲線。

```csharp
public class CompoundCurve : Curve, ICompoundCurve
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [CompoundCurve](compoundcurve/#constructor)() | の新しいインスタンスを初期化します`CompoundCurve`class. |
| [CompoundCurve](compoundcurve/#constructor_1)(ICompoundCurve) | の新しいインスタンスを初期化します`CompoundCurve`class. |
| [CompoundCurve](compoundcurve/#constructor_2)(IEnumerable&lt;ICurve&gt;) | の新しいインスタンスを初期化します`CompoundCurve`class. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension/) { get; } | この座標次元の数を取得します[`Geometry`](../geometry/) . |
| [Count](../../aspose.gis.geometries/compoundcurve/count/) { get; } | 内の曲線の数を取得します[`ICompoundCurve`](../icompoundcurve/) . |
| [Dimension](../../aspose.gis.geometries/curve/dimension/) { get; } | このトポロジー次元を取得します[`Geometry`](../geometry/) . |
| override [EndPoint](../../aspose.gis.geometries/compoundcurve/endpoint/) { get; } | 曲線の終点のコピーを返します。 |
| override [GeometryType](../../aspose.gis.geometries/compoundcurve/geometrytype/) { get; } | ジオメトリのタイプを取得します。 |
| override [HasCurveGeometry](../../aspose.gis.geometries/compoundcurve/hascurvegeometry/) { get; } | このジオメトリが曲線 (線形ではない) ジオメトリであるか、曲線を含むかどうかを示す値を取得します。 |
| [HasM](../../aspose.gis.geometries/compoundcurve/hasm/) { get; set; } | このインスタンスが M 座標を持つかどうかを示す値を取得します。 |
| [HasZ](../../aspose.gis.geometries/compoundcurve/hasz/) { get; set; } | このインスタンスが Z 座標を持つかどうかを示す値を取得します。 |
| [IsClosed](../../aspose.gis.geometries/curve/isclosed/) { get; } | 曲線が閉じているかどうかを示す値を取得します。 始点が終点と等しい場合、曲線は閉じています。 |
| override [IsEmpty](../../aspose.gis.geometries/compoundcurve/isempty/) { get; } | このインスタンスが空かどうかを示す値を取得します。 |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple/) { get; } | このインスタンスが SFA の観点から単純かどうかを示す値を取得します。 |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid/) { get; } | このインスタンスが有効かどうかを示す値を取得します。 |
| [Item](../../aspose.gis.geometries/compoundcurve/item/) { get; } | を取得します[`ICurve`](../icurve/)指定されたインデックスで. |
| [SpatialReferenceSystem](../../aspose.gis.geometries/compoundcurve/spatialreferencesystem/) { get; set; } | このインスタンスの SpatialReferenceSystem を取得します。 このプロパティは、`null` 、SpatialReferenceSystem が設定されていない場合. 新しい SpatialReferenceSystem を割り当てても座標変換は実行されず、参照のみが変更されます. |
| override [StartPoint](../../aspose.gis.geometries/compoundcurve/startpoint/) { get; } | 曲線の始点のコピーを返します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [AddCurve](../../aspose.gis.geometries/compoundcurve/addcurve/)(ICurve) | これの最後に曲線を追加します`CompoundCurve` . |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)() | このジオメトリを Well-Known Binary 表現に変換します。 |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)(WkbVariant) | このジオメトリを Well-Known Binary 表現に変換します。 |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(Measurement, Measurement, Renderer, VectorSymbolizer) | このジオメトリを画像表現にエクスポートします。 |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | このジオメトリを画像表現にエクスポートします。 |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | このジオメトリを画像表現にエクスポートします。 |
| [AsText](../../aspose.gis.geometries/geometry/astext/)() | このジオメトリを Well-Known Text 表現に変換します。 |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant) | このジオメトリを Well-Known Text 表現に変換します。 |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant, NumericFormat) | このジオメトリを Well-Known Text 表現に変換します。 |
| override [Clone](../../aspose.gis.geometries/compoundcurve/clone/)() | このインスタンスを複製します。 |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby/)(IGeometry) | このジオメトリが指定されたジオメトリによってカバーされているかどうかを判断します. |
| [Covers](../../aspose.gis.geometries/geometry/covers/)(IGeometry) | このジオメトリが指定されたジオメトリをカバーするかどうかを決定します. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses/)(IGeometry) | このジオメトリと指定されたジオメトリが交差するかどうかを決定します. |
| [Difference](../../aspose.gis.geometries/geometry/difference/)(IGeometry) | このジオメトリから指定されたジオメトリを減算します。 |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint/)(IGeometry) | このジオメトリが指定されたジオメトリから切り離されているかどうかを判断します. |
| [Equals](../../aspose.gis.geometries/compoundcurve/equals/#equals)(ICompoundCurve) | 現在のオブジェクトが同じ型の別のオブジェクトと等しいかどうかを示します。 |
| override [Equals](../../aspose.gis.geometries/compoundcurve/equals/#equals_1)(object) | 指定されたオブジェクトが現在のオブジェクトと等しいかどうかを判断します。 |
| [GetArea](../../aspose.gis.geometries/geometry/getarea/)() | このジオメトリの面積を計算します. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer/)(double, int) | このジオメトリの周囲のバッファ領域を計算します. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid/)() | このジオメトリの重心を計算します。 |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull/)() | このジオメトリの凸包を計算します. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto/)(IGeometry) | このジオメトリと指定されたジオメトリ間の最小距離を計算します. |
| [GetEnumerator](../../aspose.gis.geometries/compoundcurve/getenumerator/)() | コレクションを反復処理する列挙子を返します。 |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent/)() | このジオメトリの境界範囲を計算して返します. |
| override [GetHashCode](../../aspose.gis.geometries/compoundcurve/gethashcode/)() | デフォルトのハッシュ関数として機能します。 |
| [GetLength](../../aspose.gis.geometries/geometry/getlength/)() | このジオメトリの長さを計算します. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection/)(IGeometry) | このジオメトリと指定されたジオメトリの間の交差を構築します。 |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(Extent) | このジオメトリが指定された範囲と交差するかどうかを決定します. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(IGeometry) | このジオメトリと指定されたジオメトリが交差するかどうかを決定します。 |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps/)(IGeometry) | このジオメトリが指定されたジオメトリとオーバーラップするかどうかを決定します。 |
| [Relate](../../aspose.gis.geometries/geometry/relate/)(IGeometry, string) | このジオメトリと指定されたジオメトリの DE-9IM 交差行列が、指定されたパターンと一致するかどうかを決定します。 |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines/)() | このジオメトリのラインとして表されるポリゴンを取得します. |
| override [Reverse](../../aspose.gis.geometries/compoundcurve/reverse/)() | これを反転`CompoundCurve`.つまり、この複合曲線内の曲線とすべての曲線の順序を逆にします. |
| [RoundM](../../aspose.gis.geometries/geometry/roundm/)(int) | M 座標を指定された小数桁数に丸めます。 |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy/)(int) | X 座標と Y 座標を、指定された小数点以下の桁数に丸めます。 |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz/)(int) | Z 座標を指定された小数桁数に丸めます。 |
| override [SetEmpty](../../aspose.gis.geometries/compoundcurve/setempty/)() | これを作る[`Geometry`](../geometry/)空. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains/)(IGeometry) | このジオメトリが指定されたジオメトリを空間的に含むかどうかを決定します. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals/)(IGeometry) | このジオメトリが指定されたジオメトリと空間的に等しいかどうかを決定します. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference/)(IGeometry) | このジオメトリと指定されたジオメトリの間の対称差分を作成します。 |
| [ToEditable](../../aspose.gis.geometries/compoundcurve/toeditable/#toeditable)() | このジオメトリの編集可能なコピーを取得します. (3 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable/)() | このジオメトリの編集可能なコピーを取得します. |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry/)() | デフォルトを使用して、このジオメトリの近似バージョンまたは同等の非曲線バージョンを取得します`許容範囲` . (2 methods) |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry/)(double) | 指定された値を使用して、このジオメトリの近似バージョンまたは同等の非曲線バージョンを取得します`許容範囲`. (2 methods) |
| override [ToString](../../aspose.gis.geometries/geometry/tostring/)() | 現在のオブジェクトを表す文字列を返します。 |
| [Touches](../../aspose.gis.geometries/geometry/touches/)(IGeometry) | このジオメトリと指定されたジオメトリが接触するかどうかを決定します. |
| [Union](../../aspose.gis.geometries/geometry/union/)(IGeometry) | このジオメトリと指定されたジオメトリを結合します。 |
| [Within](../../aspose.gis.geometries/geometry/within/)(Extent) | このジオメトリが指定された範囲内にあるかどうかを判断します. |
| [Within](../../aspose.gis.geometries/geometry/within/)(IGeometry) | このジオメトリが指定されたジオメトリ内にあるかどうかを判断します. |
| [operator ==](../../aspose.gis.geometries/compoundcurve/op_equality/) | 演算子 ==. を実装します |
| [operator !=](../../aspose.gis.geometries/compoundcurve/op_inequality/) | 演算子 !=. を実装します |

### 備考

複合曲線に他の複合曲線を含めることはできません.

### 関連項目

* class [Curve](../curve/)
* interface [ICompoundCurve](../icompoundcurve/)
* 名前空間 [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* 組み立て [Aspose.GIS](../../)


