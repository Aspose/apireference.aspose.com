---
title: "System::Drawing::Graphics クラス"
linktitle: "Graphics"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Graphics クラス。描画サーフェスを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを関数への引数として使用してください。"
type: docs
weight: 1000
url: /ja/cpp/system.drawing/graphics/
---
## Graphics class


描画サーフェスを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class Graphics : public virtual System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [AddMetafileComment](./addmetafilecomment/)(const System::ArrayPtr\<uint8_t\>\&) | 未実装です。 |
| [BeginContainer](./begincontainer/)() | このオブジェクトの現在の状態を持つコンテナを保存し、新しいコンテナを開いて使用し、保存したコンテナを返します。 |
| [BeginContainer](./begincontainer/)(Rectangle, Rectangle, GraphicsUnit) | このオブジェクトの現在の状態を持つコンテナを保存し、新しいコンテナを開いて使用し、保存したコンテナを返します。 |
| [BeginContainer](./begincontainer/)(RectangleF, RectangleF, GraphicsUnit) | このオブジェクトの現在の状態を持つコンテナを保存し、新しいコンテナを開いて使用し、保存したコンテナを返します。 |
| [Clear](./clear/)(Color) | 現在のオブジェクトが表す描画サーフェスをクリアし、指定された色で塗りつぶします。 |
| [CopyFromScreen](./copyfromscreen/)(Point, Point, Size, CopyPixelOperation) | 未実装です。 |
| [CopyFromScreen](./copyfromscreen/)(int32_t, int32_t, int32_t, int32_t, Size, CopyPixelOperation) | 未実装です。 |
| [Dispose](./dispose/)() | 現在のオブジェクトが取得したすべてのオペレーティングシステムリソースを解放します。 |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t) | 現在のオブジェクトが表すサーフェス上に、指定されたペンを使用して指定された弧を描画します。 |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float) | 現在のオブジェクトが表すサーフェス上に、指定されたペンを使用して指定された弧を描画します。 |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, Rectangle, float, float) | 現在のオブジェクトが表すサーフェス上に、指定されたペンを使用して指定された弧を描画します。 |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, RectangleF, float, float) | 現在のオブジェクトが表すサーフェス上に、指定されたペンを使用して指定された弧を描画します。 |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, const Point\&, const Point\&, const Point\&, const Point\&) | 未実装です。 |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, const PointF\&, const PointF\&, const PointF\&, const PointF\&) | 未実装です。 |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float, float, float) | 未実装です。 |
| [DrawBeziers](./drawbeziers/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&) | 指定されたペンを使用して一連のベジェスプラインを描画します。 |
| [DrawBeziers](./drawbeziers/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&) | 指定されたペンを使用して一連のベジェスプラインを描画します。 |
| [DrawClosedCurve](./drawclosedcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, float, Drawing2D::FillMode) | 指定されたペンを使用して閉じたスプラインを描画します。 |
| [DrawClosedCurve](./drawclosedcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, float, Drawing2D::FillMode) | 指定されたペンを使用して閉じたスプラインを描画します。 |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, float) | 指定されたペンを使用してスプラインを描画します。 |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, float) | 指定されたペンを使用してスプラインを描画します。 |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, int32_t, int32_t, float) | 指定されたペンを使用してスプラインを描画します。 |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, int32_t, int32_t, float) | 指定されたペンを使用してスプラインを描画します。 |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, Rectangle) | 現在のオブジェクトが表すサーフェス上に、指定されたペンを使用して指定された楕円を描画します。 |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, RectangleF) | 現在のオブジェクトが表すサーフェス上に、指定されたペンを使用して指定された楕円を描画します。 |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, int, int, int, int) | 現在のオブジェクトが表すサーフェス上に、指定されたペンを使用して指定された楕円を描画します。 |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, float, float, float, float) | 現在のオブジェクトが表すサーフェス上に、指定されたペンを使用して指定された楕円を描画します。 |
| [DrawIcon](./drawicon/)(const SharedPtr\<Icon\>\&, Rectangle) | 未実装です。 |
| [DrawIcon](./drawicon/)(const SharedPtr\<Icon\>\&, int32_t, int32_t) | 未実装です。 |
| [DrawIconUnstretched](./drawiconunstretched/)(const SharedPtr\<Icon\>\&, Rectangle) | 未実装です。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::ArrayPtr\<Point\>\&) | 未実装です。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::ArrayPtr\<PointF\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | 指定された位置に、指定された画像の指定された領域を描画します。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::Details::ArrayView\<PointF\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | 指定された位置に、指定された画像の指定された領域を描画します。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::Details::StackArray\<PointF, N\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | 指定された位置に、指定された画像の指定された領域を描画します。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int) | 指定された位置に、指定された画像を描画します。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float) | 指定された位置に、指定された画像を描画します。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Point) | 指定された位置に、指定された画像を描画します。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, PointF) | 指定された位置に、指定された画像を描画します。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int, int, int) | 指定された矩形に、指定された画像を描画します。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float, float, float) | 指定された矩形に、指定された画像を描画します。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, RectangleF, RectangleF, GraphicsUnit) | 指定された位置に、指定された画像の指定された領域を描画します。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, Rectangle, GraphicsUnit) | 指定された位置に、指定された画像の指定された領域を描画します。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int, Rectangle, GraphicsUnit) | 指定された位置に、指定された画像の指定された領域を描画します。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const Rectangle\&) | 指定された位置に、指定された画像を描画します。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const RectangleF\&) | 指定された位置に、指定された画像を描画します。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | 指定された矩形に、指定された画像の指定された領域を描画します。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | 指定された矩形に、指定された画像の指定された領域を描画します。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit) | 指定された矩形に、指定された画像の指定された領域を描画します。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit) | 指定された矩形に、指定された画像の指定された領域を描画します。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort) | 未実装です。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort) | 未実装です。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort, IntPtr) | 未実装です。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort, IntPtr) | 未実装です。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<PointF\>\&, RectangleF, GraphicsUnit) | 未実装です。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<PointF\>\&) | 未実装です。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit) | 未実装です。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit, const SharedPtr\<Imaging::ImageAttributes\>\&) | 指定された位置に、指定された画像の指定された領域を描画します。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float, RectangleF, GraphicsUnit) | 指定された位置に、指定された画像の指定された領域を描画します。 |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, int, int) | 指定された位置に、元の物理サイズを使用して指定された画像を描画します。 |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, int, int, int, int) | 指定された位置に、元の物理サイズで指定された画像を描画します。 |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, const Rectangle\&) | 指定された位置に、元の物理サイズで指定された画像を描画します。 |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, const Point\&) | 指定された位置に、元の物理サイズで指定された画像を描画します。 |
| [DrawImageUnscaledAndClipped](./drawimageunscaledandclipped/)(const SharedPtr\<Image\>\&, Rectangle) | 未実装です。 |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, Point, Point) | 指定されたペンを使用して指定された直線を描画します。 |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, PointF, PointF) | 指定されたペンを使用して指定された直線を描画します。 |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, int, int, int, int) | 指定されたペンを使用して指定された直線を描画します。 |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, float, float, float, float) | 指定されたペンを使用して指定された直線を描画します。 |
| [DrawLines](./drawlines/)(const SharedPtr\<Pen\>\&, const System::ArrayPtr\<System::Drawing::Point\>\&) | 指定されたペンを使用して一連の線分を描画します。 |
| [DrawLines](./drawlines/)(const SharedPtr\<Pen\>\&, const System::ArrayPtr\<System::Drawing::PointF\>\&) | 指定されたペンを使用して一連の線分を描画します。 |
| [DrawPath](./drawpath/)(const SharedPtr\<Pen\>\&, const SharedPtr\<Drawing2D::GraphicsPath\>\&) | 指定されたペンを使用して指定されたパスを描画します。 |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t) | 現在のオブジェクトが表すサーフェス上に、指定されたペンを使用して指定されたパイを描画します。 |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float) | 現在のオブジェクトが表すサーフェス上に、指定されたペンを使用して指定されたパイを描画します。 |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, Rectangle, float, float) | 現在のオブジェクトが表すサーフェス上に、指定されたペンを使用して指定されたパイを描画します。 |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, RectangleF, float, float) | 現在のオブジェクトが表すサーフェス上に、指定されたペンを使用して指定されたパイを描画します。 |
| [DrawPolygon](./drawpolygon/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&) | 指定されたペンを使用して多角形を描画します。 |
| [DrawPolygon](./drawpolygon/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&) | 指定されたペンを使用して多角形を描画します。 |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, int, int, int, int) | 現在のオブジェクトが表すサーフェス上に、指定されたペンを使用して指定された矩形を描画します。 |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, float, float, float, float) | 現在のオブジェクトが表すサーフェス上に、指定されたペンを使用して指定された矩形を描画します。 |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, Rectangle) | 現在のオブジェクトが表すサーフェス上に、指定されたペンを使用して指定された矩形を描画します。 |
| [DrawRectangles](./drawrectangles/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Rectangle\>\&) | 指定されたペンを使用して一連の矩形を描画します。 |
| [DrawRectangles](./drawrectangles/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<RectangleF\>\&) | 指定されたペンを使用して一連の矩形を描画します。 |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, PointF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | 指定されたフォントとブラシを使用して、指定された位置に指定された文字列を描画します。 |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, RectangleF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | 指定されたフォントとブラシを使用して、指定された矩形内に指定された文字列を描画します。 |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, float, float, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | 指定されたフォントとブラシを使用して、指定された位置に指定された文字列を描画します。 |
| [EndContainer](./endcontainer/)(const SharedPtr\<Drawing2D::GraphicsContainer\>\&) | 現在のコンテナを閉じ、保存されたコンテナの状態からこのオブジェクトの状態を復元します。 |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<PointF\>\&, Graphics::EnumerateMetafileProc) | 未実装です。 |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<Point\>\&, Graphics::EnumerateMetafileProc) | 未実装です。 |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Point, Graphics::EnumerateMetafileProc) | 未実装です。 |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, PointF, Graphics::EnumerateMetafileProc) | 未実装です。 |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Rectangle, Graphics::EnumerateMetafileProc) | 未実装です。 |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, RectangleF, Graphics::EnumerateMetafileProc) | 未実装です。 |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Point, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | 未実装です。 |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, PointF, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | 未実装です。 |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | 未実装です。 |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<PointF\>\&, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | 未実装です。 |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Rectangle, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | 未実装です。 |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, RectangleF, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | 未実装です。 |
| [ExcludeClip](./excludeclip/)(Rectangle) | 未実装です。 |
| [ExcludeClip](./excludeclip/)(const SharedPtr\<Region\>\&) | 未実装です。 |
| [FillClosedCurve](./fillclosedcurve/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<PointF\>\&, Drawing2D::FillMode, float) | 指定されたブラシを使用して閉じたスプラインを描画します。 |
| [FillClosedCurve](./fillclosedcurve/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Point\>\&, Drawing2D::FillMode, float) | 指定されたブラシを使用して閉じたスプラインを描画します。 |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, Rectangle) | 境界矩形で指定された楕円の内部を、指定されたブラシで塗りつぶします。 |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, RectangleF) | 境界矩形で指定された楕円の内部を、指定されたブラシで塗りつぶします。 |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, int, int, int, int) | 境界矩形で指定された楕円の内部を、指定されたブラシで塗りつぶします。 |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, float, float, float, float) | 境界矩形で指定された楕円の内部を、指定されたブラシで塗りつぶします。 |
| [FillPath](./fillpath/)(const SharedPtr\<Brush\>\&, const SharedPtr\<Drawing2D::GraphicsPath\>\&) | 指定されたパスの内部を、指定されたブラシで塗りつぶします。 |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, int, int, int, int, int, int) | 現在のオブジェクトが表す表面上で、指定されたブラシを使用して指定されたパイを塗りつぶします。 |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, float, float, float, float, float, float) | 現在のオブジェクトが表す表面上で、指定されたブラシを使用して指定されたパイを塗りつぶします。 |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, Rectangle, float, float) | 現在のオブジェクトが表す表面上で、指定されたブラシを使用して指定されたパイを塗りつぶします。 |
| [FillPolygon](./fillpolygon/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Point\>\&, Drawing2D::FillMode) | 指定されたポリゴンの内部を、指定されたブラシで塗りつぶします。 |
| [FillPolygon](./fillpolygon/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<PointF\>\&, Drawing2D::FillMode) | 指定されたポリゴンの内部を、指定されたブラシで塗りつぶします。 |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, float, float, float, float) | 指定された矩形を、指定されたブラシで塗りつぶします。 |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, int, int, int, int) | 指定された矩形を、指定されたブラシで塗りつぶします。 |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, Rectangle) | 指定された矩形を、指定されたブラシで塗りつぶします。 |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, RectangleF) | 指定された矩形を、指定されたブラシで塗りつぶします。 |
| [FillRectangles](./fillrectangles/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Rectangle\>\&) | 指定されたブラシを使用して、一連の矩形を塗りつぶします。 |
| [FillRectangles](./fillrectangles/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<RectangleF\>\&) | 指定されたブラシを使用して、一連の矩形を塗りつぶします。 |
| [FillRegion](./fillregion/)(const SharedPtr\<Brush\>\&, const SharedPtr\<Region\>\&) | 指定された領域の内部を、指定されたブラシで塗りつぶします。 |
| [Flush](./flush/)(Drawing2D::FlushIntention) | 保留中のすべての描画操作を即座に実行させます。 |
| static [FromHwnd](./fromhwnd/)(IntPtr) | 未実装です。 |
| static [FromHwndInternal](./fromhwndinternal/)(IntPtr) | 未実装です。 |
| static [FromImage](./fromimage/)(const SharedPtr\<Image\>\&) | 指定された画像から新しい [Graphics](./) オブジェクトを作成します。 |
| [get_Clip](./get_clip/)() | 現在の [Graphics](./) オブジェクトが表す描画サーフェスの描画領域を制限する領域を表す [Region](../region/) オブジェクトを返します。 |
| [get_ClipBounds](./get_clipbounds/)() const | 現在のオブジェクトが表すサーフェスのクリッピング領域を囲む矩形を返します。 |
| [get_CompositingMode](./get_compositingmode/)() | 現在のオブジェクトが表すサーフェス上で合成画像がどのように描画されるかを示す値を返します。 |
| [get_CompositingQuality](./get_compositingquality/)() | 画像を合成する際に使用される品質レベルを示す値を返します。 |
| [get_DpiX](./get_dpix/)() | 水平解像度を返します。 |
| [get_DpiY](./get_dpiy/)() | 垂直解像度を返します。 |
| [get_InterpolationMode](./get_interpolationmode/)() | 現在のオブジェクトに関連付けられた補間モードを示す値を返します。 |
| [get_IsClipEmpty](./get_isclipempty/)() const | 未実装です。 |
| [get_IsVisibleClipEmpty](./get_isvisibleclipempty/)() const | 未実装です。 |
| [get_PageScale](./get_pagescale/)() const | 現在の [Graphics](./) オブジェクトに対するワールド単位とページ単位間のスケーリングを返します。 |
| [get_PageUnit](./get_pageunit/)() const | 現在のオブジェクトが表すサーフェス上のページ座標に使用される測定単位を返します。 |
| [get_PixelOffsetMode](./get_pixeloffsetmode/)() | 現在のオブジェクトが表すサーフェス上でレンダリング中にピクセルがどのようにオフセットされるかを示す値を返します。 |
| [get_RenderingOrigin](./get_renderingorigin/)() const | ディザリングおよびハッチブラシ用に、現在の [Graphics](./) オブジェクトのレンダリング原点を表す [Point](../point/) オブジェクトを返します。 |
| [get_SmoothingMode](./get_smoothingmode/)() | 現在のオブジェクトが表すサーフェス上でレンダリング中に使用されるスムージングモードを示す値を返します。 |
| [get_TextContrast](./get_textcontrast/)() const | 未実装です。 |
| [get_TextRenderingHint](./get_textrenderinghint/)() | テキストレンダリングの品質を示す値を返します。 |
| [get_Transform](./get_transform/)() | 現在の [Graphics](./) オブジェクトの幾何学的ワールド変換を返します。 |
| [get_VisibleClipBounds](./get_visibleclipbounds/)() const | 現在の [Graphics](./) オブジェクトの可視クリッピング領域の境界矩形を表す [RectangleF](../rectanglef/) オブジェクトを返します。 |
| [GetHdc](./gethdc/)() | 未実装です。 |
| [GetNearestColor](./getnearestcolor/)(Color) | 未実装です。 |
| [GetSkCanvas](./getskcanvas/)() const |  |
| [IntersectClip](./intersectclip/)(const System::SharedPtr\<Region\>\&) | このオブジェクトのクリップ領域を、現在のクリップと指定されたクリップの交差に更新します。 |
| [IntersectClip](./intersectclip/)(System::Drawing::RectangleF) | このオブジェクトのクリップ領域を、現在のクリップと指定されたクリップの交差に更新します。 |
| [IntersectClip](./intersectclip/)(System::Drawing::Rectangle) | このオブジェクトのクリップ領域を、現在のクリップと指定されたクリップの交差に更新します。 |
| [IsVisible](./isvisible/)(Point) | 指定された点が現在の [Graphics](./) オブジェクトの可視クリップ領域内に含まれるかどうかを判定します。 |
| [IsVisible](./isvisible/)(PointF) | 未実装です。 |
| [IsVisible](./isvisible/)(Rectangle) | 未実装です。 |
| [IsVisible](./isvisible/)(RectangleF) | 未実装です。 |
| [IsVisible](./isvisible/)(int32_t, int32_t) | 未実装です。 |
| [IsVisible](./isvisible/)(float, float) | 未実装です。 |
| [IsVisible](./isvisible/)(float, float, float, float) | 未実装です。 |
| [IsVisible](./isvisible/)(int32_t, int32_t, int32_t, int32_t) | 未実装です。 |
| [MeasureCharacterRanges](./measurecharacterranges/)(const System::String\&, const SharedPtr\<Font\>\&, RectangleF, const SharedPtr\<StringFormat\>\&) | 指定された文字列の文字位置を囲む各領域の配列を返します。 |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, PointF const\&, System::SharedPtr\<StringFormat\> const\&) const | 指定されたフォントと指定された書式で描画された場合の、指定された文字列のサイズを返します。 |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, int, System::SharedPtr\<StringFormat\> const\&) const | 指定されたフォントと指定された書式で描画された場合の、指定された文字列のサイズを返します。 |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&, int\&, int\&) const | 未実装です。 |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&) const | 指定されたフォントと指定された書式で描画された場合の、指定された文字列のサイズを返します。 |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | 現在の [Graphics](./) オブジェクトのワールド変換行列に、指定された行列を掛けます。 |
| [ReleaseHdc](./releasehdc/)() | 未実装です。 |
| [ReleaseHdc](./releasehdc/)(IntPtr) | 未実装です。 |
| [ResetClip](./resetclip/)() | このグラフィックスのクリップ領域を無限領域にリセットします。 |
| [ResetTransform](./resettransform/)() | 現在のオブジェクトのワールド変換行列を単位行列になるようにリセットします。 |
| [Restore](./restore/)(const SharedPtr\<Drawing2D::GraphicsState\>\&) | 保存された状態からこのオブジェクトの状態を復元します。 |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | 指定された順序で、現在の [Graphics](./) オブジェクトのワールド変換行列に指定された回転を適用します。 |
| [Save](./save/)() | このオブジェクトの現在の状態を保存し、保存された状態を返します。 |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | 指定されたスケールベクトルを現在のオブジェクトのワールド変換行列に適用します。 |
| [set_Clip](./set_clip/)(const SharedPtr\<Region\>\&) | 現在のオブジェクトが表す描画サーフェスの描画領域を制限する領域を設定します。 |
| [set_CompositingMode](./set_compositingmode/)(Drawing2D::CompositingMode) | 現在のオブジェクトが表すサーフェス上で合成画像が描画される方法を指定する値を設定します。 |
| [set_CompositingQuality](./set_compositingquality/)(Drawing2D::CompositingQuality) | 画像を合成する際に使用する品質レベルを指定する値を設定します。 |
| [set_InterpolationMode](./set_interpolationmode/)(Drawing2D::InterpolationMode) | 現在のオブジェクトに関連付けられた補間モードを示す値を設定します。 |
| [set_PageScale](./set_pagescale/)(float) | 現在の [Graphics](./) オブジェクトのワールド単位とページ単位間のスケーリングを設定します。 |
| [set_PageUnit](./set_pageunit/)(GraphicsUnit) | 現在のオブジェクトが表すサーフェス上のページ座標に使用される測定単位を設定します。 |
| [set_PixelOffsetMode](./set_pixeloffsetmode/)(Drawing2D::PixelOffsetMode) | 現在のオブジェクトが表すサーフェス上でレンダリング中にピクセルをオフセットする方法を指定する値を設定します。 |
| [set_RenderingOrigin](./set_renderingorigin/)(Point) | 現在の [Graphics](./) オブジェクトのディザリングおよびハッチブラシ用のレンダリング原点を指定する [Point](../point/) オブジェクトを設定します。 |
| [set_SmoothingMode](./set_smoothingmode/)(Drawing2D::SmoothingMode) | 現在のオブジェクトが表すサーフェス上でレンダリング中に使用されるスムージングモードを指定する値を設定します。 |
| [set_TextContrast](./set_textcontrast/)(int32_t) | 未実装です。 |
| [set_TextRenderingHint](./set_textrenderinghint/)(Text::TextRenderingHint) | テキストレンダリングの品質を指定する値を設定します。 |
| [set_Transform](./set_transform/)(const SharedPtr\<Drawing2D::Matrix\>\&) | 現在の [Graphics](./) オブジェクトの幾何学的ワールド変換を設定します。 |
| [SetClip](./setclip/)(const SharedPtr\<Region\>\&, Drawing2D::CombineMode) | 現在の [Graphics](./) オブジェクトが表す描画サーフェスのクリッピング領域を、現在のクリップ領域と指定された領域を組み合わせる指定された操作の結果に設定します。 |
| [SetClip](./setclip/)(Rectangle, Drawing2D::CombineMode) | 現在の [Graphics](./) オブジェクトが表す描画サーフェスのクリッピング領域を、現在のクリップ領域と指定された領域を組み合わせる指定された操作の結果に設定します。 |
| [SetClip](./setclip/)(RectangleF, Drawing2D::CombineMode) | 現在の [Graphics](./) オブジェクトが表す描画サーフェスのクリッピング領域を、現在のクリップ領域と指定された領域を組み合わせる指定された操作の結果に設定します。 |
| [SetClip](./setclip/)(const SharedPtr\<Graphics\>\&, Drawing2D::CombineMode) | 未実装です。 |
| [SetClip](./setclip/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&, Drawing2D::CombineMode) | 現在の [Graphics](./) オブジェクトで表される描画面のクリッピング領域を、現在のクリップ領域とグラフィック パスで指定された領域を結合する指定された操作の結果に設定します。 |
| [TransformPoints](./transformpoints/)(Drawing2D::CoordinateSpace, Drawing2D::CoordinateSpace, const ArrayPtr\<System::Drawing::Point\>\&) | 未実装です。 |
| [TransformPoints](./transformpoints/)(Drawing2D::CoordinateSpace, Drawing2D::CoordinateSpace, const ArrayPtr\<System::Drawing::PointF\>\&) | 未実装です。 |
| [TranslateClip](./translateclip/)(int, int) | 未実装です。 |
| [TranslateClip](./translateclip/)(float, float) | 未実装です。 |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | 現在の [Graphics](./) オブジェクトのワールド変換行列に、指定された平行移動ベクトルを適用します。 |
| [~Graphics](./~graphics/)() |  |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [DrawImageAbort](./drawimageabort/) | DrawImage メソッドの引数として使用されるコールバック関数オブジェクトの型です。 |
| [EnumerateMetafileProc](./enumeratemetafileproc/) | EnumerateMetafile メソッドの引数として使用されるコールバック関数オブジェクトの型です。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
