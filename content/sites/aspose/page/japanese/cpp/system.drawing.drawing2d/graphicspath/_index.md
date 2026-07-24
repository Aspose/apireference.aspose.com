---
title: "System::Drawing::Drawing2D::GraphicsPath クラス"
linktitle: "GraphicsPath"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Drawing2D::GraphicsPath クラス。接続された直線と曲線の集合を表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上で、または operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡す際に使用してください。"
type: docs
weight: 600
url: /ja/cpp/system.drawing.drawing2d/graphicspath/
---
## GraphicsPath class


接続された直線と曲線の集合を表します。このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

```cpp
class GraphicsPath : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [AddArc](./addarc/)(float, float, float, float, float, float) | 指定された楕円弧を、現在のオブジェクトが表すパスに追加します。 |
| [AddArc](./addarc/)(int, int, int, int, float, float) | 指定された楕円弧を、現在のオブジェクトが表すパスに追加します。 |
| [AddArc](./addarc/)(const RectangleF\&, float, float) | 指定された楕円弧を、現在のオブジェクトが表すパスに追加します。 |
| [AddArc](./addarc/)(const Rectangle\&, float, float) | 指定された楕円弧を、現在のオブジェクトが表すパスに追加します。 |
| [AddBezier](./addbezier/)(const Point\&, const Point\&, const Point\&, const Point\&) | 指定された三次ベジェ曲線を、現在のオブジェクトが表すパスに追加します。 |
| [AddBezier](./addbezier/)(const PointF\&, const PointF\&, const PointF\&, const PointF\&) | 指定された三次ベジェ曲線を、現在のオブジェクトが表すパスに追加します。 |
| [AddBezier](./addbezier/)(int, int, int, int, int, int, int, int) | 指定された三次ベジェ曲線を、現在のオブジェクトが表すパスに追加します。 |
| [AddBezier](./addbezier/)(float, float, float, float, float, float, float, float) | 指定された三次ベジェ曲線を、現在のオブジェクトが表すパスに追加します。 |
| [AddBeziers](./addbeziers/)(const ArrayPtr\<Point\>\&) | 接続された三次ベジェ曲線のシーケンスを現在の図形に追加します。 |
| [AddBeziers](./addbeziers/)(const ArrayPtr\<PointF\>\&) | 接続された三次ベジェ曲線のシーケンスを現在の図形に追加します。 |
| [AddClosedCurve](./addclosedcurve/)(const ArrayPtr\<PointF\>\&, float) | 指定された閉じた曲線を、現在のオブジェクトが表すパスに追加します。 |
| [AddClosedCurve](./addclosedcurve/)(const ArrayPtr\<Point\>\&, float) | 指定された閉じた曲線を、現在のオブジェクトが表すパスに追加します。 |
| [AddCurve](./addcurve/)(const ArrayPtr\<PointF\>\&, float) | 指定された曲線を、現在のオブジェクトが表すパスに追加します。 |
| [AddCurve](./addcurve/)(const ArrayPtr\<Point\>\&, float) | 指定された曲線を、現在のオブジェクトが表すパスに追加します。 |
| [AddCurve](./addcurve/)(const ArrayPtr\<PointF\>\&, int, int, float) | 指定された曲線を、現在のオブジェクトが表すパスに追加します。 |
| [AddCurve](./addcurve/)(const ArrayPtr\<Point\>\&, int, int, float) | 指定された曲線を、現在のオブジェクトが表すパスに追加します。 |
| [AddEllipse](./addellipse/)(float, float, float, float) | 指定された楕円を、現在のオブジェクトが表すパスに追加します。 |
| [AddEllipse](./addellipse/)(int, int, int, int) | 指定された楕円を、現在のオブジェクトが表すパスに追加します。 |
| [AddEllipse](./addellipse/)(const RectangleF\&) | 指定された楕円を、現在のオブジェクトが表すパスに追加します。 |
| [AddEllipse](./addellipse/)(const Rectangle\&) | 指定された楕円を、現在のオブジェクトが表すパスに追加します。 |
| [AddLine](./addline/)(const Point\&, const Point\&) | 指定された直線を、現在のオブジェクトが表すパスに追加します。 |
| [AddLine](./addline/)(const PointF\&, const PointF\&) | 指定された直線を、現在のオブジェクトが表すパスに追加します。 |
| [AddLine](./addline/)(int, int, int, int) | 指定された直線を、現在のオブジェクトが表すパスに追加します。 |
| [AddLine](./addline/)(float, float, float, float) | 指定された直線を、現在のオブジェクトが表すパスに追加します。 |
| [AddLines](./addlines/)(const ArrayPtr\<PointF\>\&) | 指定された接続された線分の系列を、現在のオブジェクトが表すパスに追加します。 |
| [AddLines](./addlines/)(const ArrayPtr\<Point\>\&) | 指定された接続された線分の系列を、現在のオブジェクトが表すパスに追加します。 |
| [AddPath](./addpath/)(const SharedPtr\<GraphicsPath\>\&, bool) | 指定されたパスを、現在のオブジェクトが表すパスに追加します。 |
| [AddPie](./addpie/)(float, float, float, float, float, float) | 指定されたパイ形状の輪郭を、現在のオブジェクトが表すパスに追加します。 |
| [AddPie](./addpie/)(int, int, int, int, float, float) | 指定されたパイ形状の輪郭を、現在のオブジェクトが表すパスに追加します。 |
| [AddPie](./addpie/)(const Rectangle\&, float, float) | 指定されたパイ形状の輪郭を、現在のオブジェクトが表すパスに追加します。 |
| [AddPolygon](./addpolygon/)(const ArrayPtr\<PointF\>\&) | 指定された多角形を、現在のオブジェクトが表すパスに追加します。 |
| [AddPolygon](./addpolygon/)(const ArrayPtr\<Point\>\&) | 指定された多角形を、現在のオブジェクトが表すパスに追加します。 |
| [AddRectangle](./addrectangle/)(const Rectangle\&) | 指定された矩形を、現在のオブジェクトが表すパスに追加します。 |
| [AddRectangle](./addrectangle/)(const RectangleF\&) | 指定された矩形を、現在のオブジェクトが表すパスに追加します。 |
| [AddRectangles](./addrectangles/)(const ArrayPtr\<Rectangle\>\&) | 指定された矩形の系列を、現在のオブジェクトが表すパスに追加します。 |
| [AddRectangles](./addrectangles/)(const ArrayPtr\<RectangleF\>\&) | 指定された矩形の系列を、現在のオブジェクトが表すパスに追加します。 |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, Point, const SharedPtr\<StringFormat\>\&) | 指定されたテキスト文字列を、現在のオブジェクトが表すパスに追加します。 |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, PointF, const SharedPtr\<StringFormat\>\&) | 指定されたテキスト文字列を、現在のオブジェクトが表すパスに追加します。 |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, Rectangle, const SharedPtr\<StringFormat\>\&) | 指定されたテキスト文字列を、現在のオブジェクトが表すパスに追加します。 |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, RectangleF, const SharedPtr\<StringFormat\>\&) | 指定されたテキスト文字列を、現在のオブジェクトが表すパスに追加します。 |
| virtual [Clone](./clone/)() | 現在のオブジェクトのコピーを作成します。 |
| [CloseAllFigures](./closeallfigures/)() | すべての開いている図形を閉じて、新しい図形を開始します。 |
| [CloseFigure](./closefigure/)() | 現在の図形を閉じて、新しい図形を開始します。 |
| [Dispose](./dispose/)() | 現在のオブジェクトが取得したすべてのオペレーティングシステムリソースを解放します。 |
| [Flatten](./flatten/)() | パス内の各曲線を、接続された直線の系列に変換して平坦化します。フラットネス値 0.25 が使用されます。 |
| [Flatten](./flatten/)(const MatrixPtr\&) | パス内の各曲線を、接続された直線の系列に変換して平坦化します。フラットネス値 0.25 が使用されます。 |
| [Flatten](./flatten/)(const MatrixPtr\&, float) | パス内の各曲線を、接続された直線の系列に変換して平坦化します。 |
| [get_FillMode](./get_fillmode/)() | 現在のオブジェクトの塗りつぶしモードを返します。 |
| [get_PathData](./get_pathdata/)() | 現在のオブジェクトが表すパスを構成する点とその種類を含む [PathData](../pathdata/) オブジェクトを返します。 |
| [get_PathPoints](./get_pathpoints/)() const | 現在のオブジェクトが表すパスを構成する点を含む配列を返します。 |
| [get_PathTypes](./get_pathtypes/)() const | 現在のオブジェクトが表すパスを構成する点の種類を示す値を含む配列を返します。 |
| [get_PointCount](./get_pointcount/)() const | 現在のオブジェクトが表すパスの点数を返します。 |
| [GetBounds](./getbounds/)(const MatrixPtr\&, const SharedPtr\<Pen\>\&) const | 指定された行列で変換されたときに、現在のオブジェクトが表すパスを囲む矩形を表す [RectangleF](../../system.drawing/rectanglef/) オブジェクトを返します。 |
| [GetFigureFlags](./getfigureflags/)() | 現在のオブジェクトが表すパスに含まれる図形の種類を示す、Detail::FigureType 値のビット単位の組み合わせである値を返します。 |
| [GetLastPoint](./getlastpoint/)() const | パスの最後の点を表す [PointF](../../system.drawing/pointf/) オブジェクトを返します。 |
| [GraphicsPath](./graphicspath/)(FillMode) | 指定された塗りつぶしモードで [GraphicsPath](./) クラスの新しいインスタンスを作成します。 |
| [GraphicsPath](./graphicspath/)(const ArrayPtr\<Point\>\&, const ArrayPtr\<uint8_t\>\&, FillMode) | 指定されたパスを表す [GraphicsPath](./) オブジェクトの新しいインスタンスを作成します。 |
| [GraphicsPath](./graphicspath/)(const ArrayPtr\<PointF\>\&, const ArrayPtr\<uint8_t\>\&, FillMode) | 指定されたパスを表す [GraphicsPath](./) オブジェクトの新しいインスタンスを作成します。 |
| [GraphicsPath](./graphicspath/)(const SkPath\&) |  |
| [IsOutlineVisible](./isoutlinevisible/)(const PointF\&, const SharedPtr\<Pen\>\&) | 指定された [Pen](../../system.drawing/pen/) で描画した場合に、この [GraphicsPath](./) の輪郭（下部）に指定された点が含まれるかどうかを示します。実装されていません。 |
| [IsVisible](./isvisible/)(const PointF\&) | 指定された点が現在のオブジェクトが表すパス内に含まれるかどうかを判断します。 |
| [IsVisible](./isvisible/)(float, float) | 指定された点が現在のオブジェクトが表すパス内に含まれるかどうかを判断します。 |
| [Reset](./reset/)() | すべての点を削除してパスを空にします。 |
| [Reverse](./reverse/)() | この [GraphicsPath](./) の PathPoints 配列内の点の順序を逆にします。 |
| [set_FillMode](./set_fillmode/)(FillMode) | 現在のオブジェクトの塗りつぶしモードを設定します。 |
| [SetMarkers](./setmarkers/)() | 未実装です。 |
| [StartFigure](./startfigure/)() | 新しい図形を開始します。 |
| [Transform](./transform/)(const MatrixPtr\&) | 指定された変換行列を適用して、現在のオブジェクトが表すパスを変換します。 |
| [Transform](./transform/)(const SkMatrix\&) |  |
| [Widen](./widen/)(const SharedPtr\<Pen\>\&) | このパスを元のパスの周囲の輪郭に置き換えます。 |
| [~GraphicsPath](./~graphicspath/)() | デストラクタ。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
