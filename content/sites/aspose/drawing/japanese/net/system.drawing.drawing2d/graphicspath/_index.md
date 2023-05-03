---
title: Class GraphicsPath
second_title: Aspose.Drawing for .NET API リファレンス
description: System.Drawing.Drawing2D.GraphicsPath クラス. 一連の接続された直線と曲線を表します.
type: docs
weight: 260
url: /ja/net/system.drawing.drawing2d/graphicspath/
---
## GraphicsPath class

一連の接続された直線と曲線を表します.

```csharp
public class GraphicsPath : IDisposable
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [GraphicsPath](graphicspath/#constructor)() | Alternate. の FillMode 値で、GraphicsPath クラスの新しいインスタンスを初期化します。 |
| [GraphicsPath](graphicspath/#constructor_1)(FillMode) | の新しいインスタンスを初期化します`GraphicsPath`指定された を持つクラスFillMode列挙. |
| [GraphicsPath](graphicspath/#constructor_2)(PointF[], byte[]) | の新しいインスタンスを初期化します`GraphicsPath`指定されたクラス[`PathPointType`](../pathpointtype/)とPointF配列. |
| [GraphicsPath](graphicspath/#constructor_4)(Point[], byte[]) | の新しいインスタンスを初期化します`GraphicsPath`指定されたクラス[`PathPointType`](../pathpointtype/)とPoint配列. |
| [GraphicsPath](graphicspath/#constructor_3)(PointF[], byte[], FillMode) | の新しいインスタンスを初期化します`GraphicsPath`指定されたクラスPathPointTypeとPointF配列と指定されたFillMode列挙要素.. |
| [GraphicsPath](graphicspath/#constructor_5)(Point[], byte[], FillMode) | の新しいインスタンスを初期化します`GraphicsPath`指定されたクラスPathPointTypeとPoint配列と指定されたFillMode列挙要素.. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [FillMode](../../system.drawing.drawing2d/graphicspath/fillmode/) { get; set; } | この GraphicsPath の形状の内部がどのように塗りつぶされるかを決定する FillMode 列挙体を取得または設定します。 |
| [PathData](../../system.drawing.drawing2d/graphicspath/pathdata/) { get; } | を取得しますPathDataこのためのポイントとタイプの配列をカプセル化するGraphicsPath |
| [PathPoints](../../system.drawing.drawing2d/graphicspath/pathpoints/) { get; } | パス内のポイントを取得します。 |
| [PathTypes](../../system.drawing.drawing2d/graphicspath/pathtypes/) { get; } | の対応する点のタイプを取得しますPathPoints配列. |
| [PointCount](../../system.drawing.drawing2d/graphicspath/pointcount/) { get; } | の要素数を取得しますPathPointsまたはPathTypes配列. |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [AddArc](../../system.drawing.drawing2d/graphicspath/addarc/#addarc_1)(RectangleF, float, float) | 現在の図形に楕円弧を追加します。 |
| [AddArc](../../system.drawing.drawing2d/graphicspath/addarc/#addarc)(float, float, float, float, float, float) | 現在の図形に楕円弧を追加します。 |
| [AddBezier](../../system.drawing.drawing2d/graphicspath/addbezier/#addbezier_1)(PointF, PointF, PointF, PointF) | 現在の Figure に 3 次ベジエ曲線を追加します。 |
| [AddBezier](../../system.drawing.drawing2d/graphicspath/addbezier/#addbezier)(float, float, float, float, float, float, float, float) | 現在の Figure に 3 次ベジエ曲線を追加します。 |
| [AddBeziers](../../system.drawing.drawing2d/graphicspath/addbeziers/#addbeziers)(PointF[]) | 接続された 3 次ベジエ曲線のシーケンスを現在の Figure に追加します。 |
| [AddBeziers](../../system.drawing.drawing2d/graphicspath/addbeziers/#addbeziers_1)(Point[]) | 接続された 3 次ベジエ曲線のシーケンスを現在の Figure に追加します。 |
| [AddClosedCurve](../../system.drawing.drawing2d/graphicspath/addclosedcurve/#addclosedcurve)(PointF[]) | このパスに閉じた曲線を追加します。カーディナル スプライン曲線が使用されるのは、曲線が配列内の各点を通過するためです. |
| [AddClosedCurve](../../system.drawing.drawing2d/graphicspath/addclosedcurve/#addclosedcurve_1)(PointF[], float) | このパスに閉じた曲線を追加します。 曲線は配列内の各点を通過するため、カーディナル スプライン曲線が使用されます。 |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve/#addcurve)(PointF[]) | 現在の Figure にスプライン曲線を追加します。カーディナル スプライン曲線が使用されるのは、曲線が配列内の各点を通過するためです. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve/#addcurve_3)(Point[]) | 現在の Figure にスプライン曲線を追加します。カーディナル スプライン曲線が使用されるのは、曲線が配列内の各点を通過するためです. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve/#addcurve_2)(PointF[], float) | 現在の図にスプライン曲線を追加します。 |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve/#addcurve_1)(PointF[], int, int, float) | 現在の図にスプライン曲線を追加します。 |
| [AddEllipse](../../system.drawing.drawing2d/graphicspath/addellipse/#addellipse_1)(RectangleF) | 現在のパスに楕円を追加します。 |
| [AddEllipse](../../system.drawing.drawing2d/graphicspath/addellipse/#addellipse)(float, float, float, float) | 現在のパスに楕円を追加します。 |
| [AddLine](../../system.drawing.drawing2d/graphicspath/addline/#addline_1)(PointF, PointF) | この GraphicsPath に線分を追加します。 |
| [AddLine](../../system.drawing.drawing2d/graphicspath/addline/#addline)(float, float, float, float) | この GraphicsPath に線分を追加します。 |
| [AddLines](../../system.drawing.drawing2d/graphicspath/addlines/#addlines)(PointF[]) | 一連の接続された線分をこの末尾に追加しますGraphicsPath. |
| [AddLines](../../system.drawing.drawing2d/graphicspath/addlines/#addlines_1)(Point[]) | 一連の接続された線分をこの末尾に追加しますGraphicsPath. |
| [AddPath](../../system.drawing.drawing2d/graphicspath/addpath/)(GraphicsPath, bool) | 指定された GraphicsPath をこのパスに追加します。 |
| [AddPie](../../system.drawing.drawing2d/graphicspath/addpie/#addpie_1)(Rectangle, float, float) | パイの輪郭をこのパスに追加します。 |
| [AddPie](../../system.drawing.drawing2d/graphicspath/addpie/#addpie)(float, float, float, float, float, float) | パイの輪郭をこのパスに追加します。 |
| [AddPolygon](../../system.drawing.drawing2d/graphicspath/addpolygon/#addpolygon)(PointF[]) | このパスにポリゴンを追加します。 |
| [AddPolygon](../../system.drawing.drawing2d/graphicspath/addpolygon/#addpolygon_1)(Point[]) | このパスにポリゴンを追加します。 |
| [AddRectangle](../../system.drawing.drawing2d/graphicspath/addrectangle/#addrectangle)(Rectangle) | このパスに四角形を追加します。 |
| [AddRectangle](../../system.drawing.drawing2d/graphicspath/addrectangle/#addrectangle_1)(RectangleF) | このパスに四角形を追加します。 |
| [AddRectangles](../../system.drawing.drawing2d/graphicspath/addrectangles/#addrectangles)(RectangleF[]) | 一連の長方形をこのパスに追加します。 |
| [AddRectangles](../../system.drawing.drawing2d/graphicspath/addrectangles/#addrectangles_1)(Rectangle[]) | 一連の長方形をこのパスに追加します。 |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring/#addstring)(string, FontFamily, int, float, Point, StringFormat) | このパスにテキスト文字列を追加します。 |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring/#addstring_1)(string, FontFamily, int, float, PointF, StringFormat) | このパスにテキスト文字列を追加します。 |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring/#addstring_2)(string, FontFamily, int, float, Rectangle, StringFormat) | このパスにテキスト文字列を追加します。 |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring/#addstring_3)(string, FontFamily, int, float, RectangleF, StringFormat) | このパスにテキスト文字列を追加します。 |
| [Clone](../../system.drawing.drawing2d/graphicspath/clone/)() | 現在のパス オブジェクトのコピーを作成します。 |
| [CloseAllFigures](../../system.drawing.drawing2d/graphicspath/closeallfigures/)() | このパスで開いているすべての Figure を閉じ、新しい Figure を開始します。端点から開始点まで線を結んで、開いている各 Figure を閉じます。 |
| [CloseFigure](../../system.drawing.drawing2d/graphicspath/closefigure/)() | 現在の Figure を閉じて、新しい Figure を開始します。現在の Figure に一連の接続された直線と曲線が含まれている場合、メソッドは終点から開始点までの直線を 接続してループを閉じます。 |
| [Dispose](../../system.drawing.drawing2d/graphicspath/dispose/)() | この GraphicsPath で使用されているすべてのリソースを解放します。 |
| [Flatten](../../system.drawing.drawing2d/graphicspath/flatten/#flatten)() | このパスの各曲線を一連の接続された線分に変換します。 |
| [Flatten](../../system.drawing.drawing2d/graphicspath/flatten/#flatten_1)(Matrix) | 指定された変換を適用してから、この中の各曲線を変換しますGraphicsPath. |
| [Flatten](../../system.drawing.drawing2d/graphicspath/flatten/#flatten_2)(Matrix, float) | この中の各曲線を変換しますGraphicsPath一連の接続された線分に変換します。 |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds/#getbounds)() | これを囲む四角形を返しますGraphicsPath. |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds/#getbounds_1)(Matrix) | これを囲む四角形を返しますGraphicsPathこのパスが 指定されたMatrix. |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds/#getbounds_2)(Matrix, Pen) | これを囲む四角形を返しますGraphicsPath現在のパスが 指定されたMatrix指定されたPen. |
| [GetLastPoint](../../system.drawing.drawing2d/graphicspath/getlastpoint/)() | この PathPoints 配列の最後のポイントを取得します`GraphicsPath`. |
| [IsOutlineVisible](../../system.drawing.drawing2d/graphicspath/isoutlinevisible/)(PointF, Pen) | 指定されたポイントがこのアウトライン内 (下) に含まれているかどうかを示しますGraphicsPath指定で描画した場合Pen. |
| [IsVisible](../../system.drawing.drawing2d/graphicspath/isvisible/)(PointF) | 指定したポイントがこの範囲内に含まれているかどうかを示しますGraphicsPath. |
| [Reset](../../system.drawing.drawing2d/graphicspath/reset/)() | を空にします[`PathPoints`](./pathpoints/)と[`PathTypes`](./pathtypes/)arrays を設定し、[`FillMode`](../fillmode/)にAlternate. |
| [Reverse](../../system.drawing.drawing2d/graphicspath/reverse/)() | 内のポイントの順序を逆にします。[`PathPoints`](./pathpoints/)これの配列`GraphicsPath`. |
| [SetMarkers](../../system.drawing.drawing2d/graphicspath/setmarkers/)() | これにマーカーを設定します`GraphicsPath`. |
| [StartFigure](../../system.drawing.drawing2d/graphicspath/startfigure/)() | 現在の Figure を閉じずに新しい Figure を開始します。 パスに追加された後続のすべてのポイントは、この新しい Figure に追加されます。 |
| [Transform](../../system.drawing.drawing2d/graphicspath/transform/)(Matrix) | この GraphicsPath に変換マトリックスを適用します。 |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp/#warp)(PointF[], RectangleF) | 長方形と平行四辺形で定義されたワープ変換をこれに適用します`GraphicsPath`. |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp/#warp_1)(PointF[], RectangleF, Matrix) | 長方形と平行四辺形で定義されたワープ変換をこれに適用します`GraphicsPath`. |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp/#warp_2)(PointF[], RectangleF, Matrix, WarpMode) | 長方形と平行四辺形で定義されたワープ変換をこれに適用します`GraphicsPath`. |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp/#warp_3)(PointF[], RectangleF, Matrix, WarpMode, float) | 長方形と平行四辺形で定義されたワープ変換をこれに適用します`GraphicsPath`. |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen/#widen)(Pen) | パスにアウトラインを追加します。 |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen/#widen_1)(Pen, Matrix) | に追加のアウトラインを追加しますGraphicsPath. |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen/#widen_2)(Pen, Matrix, float) | これを置き換えますGraphicsPathこのパスが指定されたペンで描かれたときに塗りつぶされる領域を囲む曲線で. |

### 関連項目

* 名前空間 [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* 組み立て [Aspose.Drawing](../../)


