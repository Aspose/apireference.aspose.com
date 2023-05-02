---
title: Class Graphics
second_title: Aspose.Drawing for .NET API リファレンス
description: System.Drawing.Graphics クラス. 描画面をカプセル化します
type: docs
weight: 530
url: /ja/net/system.drawing/graphics/
---
## Graphics class

描画面をカプセル化します。

```csharp
public class Graphics : IDisposable
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Clip](../../system.drawing/graphics/clip/) { get; set; } | を取得または設定しますRegionこの描画領域を制限するGraphics. |
| [ClipBounds](../../system.drawing/graphics/clipbounds/) { get; } | を取得します[`RectangleF`](../rectanglef/)このクリッピング領域を境界付ける構造`Graphics`. |
| [CompositingMode](../../system.drawing/graphics/compositingmode/) { get; set; } | 合成画像をこれに描画する方法を指定する値を取得または設定しますGraphics. |
| [CompositingQuality](../../system.drawing/graphics/compositingquality/) { get; set; } | これに描画される合成画像のレンダリング品質を取得または設定しますGraphics. |
| [DpiX](../../system.drawing/graphics/dpix/) { get; } | この水平解像度を取得しますGraphics. |
| [DpiY](../../system.drawing/graphics/dpiy/) { get; } | この垂直解像度を取得しますGraphics. |
| [InterpolationMode](../../system.drawing/graphics/interpolationmode/) { get; set; } | この Graphics に関連付けられた補間モードを取得または設定します。 |
| [IsClipEmpty](../../system.drawing/graphics/isclipempty/) { get; } | このクリッピング領域かどうかを示す値を取得しますGraphics空です. |
| [IsVisibleClipEmpty](../../system.drawing/graphics/isvisibleclipempty/) { get; } | このクリッピング領域が表示されているかどうかを示す値を取得しますGraphics空です. |
| [PageScale](../../system.drawing/graphics/pagescale/) { get; set; } | このワールド単位とページ単位の間のスケーリングを取得または設定しますGraphics. |
| [PageUnit](../../system.drawing/graphics/pageunit/) { get; set; } | このページの座標に使用される測定単位を取得または設定しますGraphics. |
| [PixelOffsetMode](../../system.drawing/graphics/pixeloffsetmode/) { get; set; } | このレンダリング中にピクセルがどのようにオフセットされるかを指定する値を取得または設定しますGraphics. |
| [RenderingOrigin](../../system.drawing/graphics/renderingorigin/) { get; set; } | このレンダリング原点を取得または設定しますGraphicsディザリングとハッチ ブラシ用。 |
| [SmoothingMode](../../system.drawing/graphics/smoothingmode/) { get; set; } | この Graphics のレンダリング品質を取得または設定します。 |
| [TextContrast](../../system.drawing/graphics/textcontrast/) { get; set; } | テキストをレンダリングするためのガンマ補正値を取得または設定します。 |
| [TextRenderingHint](../../system.drawing/graphics/textrenderinghint/) { get; set; } | これに関連付けられたテキストのレンダリング モードを取得または設定しますGraphics. |
| [Transform](../../system.drawing/graphics/transform/) { get; set; } | このジオメトリック ワールド変換のコピーを取得または設定しますGraphics. |
| [VisibleClipBounds](../../system.drawing/graphics/visibleclipbounds/) { get; } | この可視クリッピング領域の境界矩形を取得しますGraphics. |

## メソッド

| 名前 | 説明 |
| --- | --- |
| static [FromHwnd](../../system.drawing/graphics/fromhwnd/)(IntPtr) | 新しいGraphics指定されたハンドルから window. へ |
| static [FromImage](../../system.drawing/graphics/fromimage/)(Image) | 指定された Image から新しい Graphics を作成します。 |
| [AddMetafileComment](../../system.drawing/graphics/addmetafilecomment/)(byte[]) | 現在のMetafile. |
| [BeginContainer](../../system.drawing/graphics/begincontainer/#begincontainer)() | グラフィックス コンテナを現在の状態で保存しますGraphics新しいグラフィックコンテナを開いて使用します. |
| [BeginContainer](../../system.drawing/graphics/begincontainer/#begincontainer_1)(Rectangle, Rectangle, GraphicsUnit) | グラフィックス コンテナを現在の状態で保存しますGraphics指定されたスケール変換で新しいグラフィックス コンテナを開いて使用します。 |
| [BeginContainer](../../system.drawing/graphics/begincontainer/#begincontainer_2)(RectangleF, RectangleF, GraphicsUnit) | グラフィックス コンテナを現在の状態で保存しますGraphics指定されたスケール変換で新しいグラフィックス コンテナを開いて使用します。 |
| [Clear](../../system.drawing/graphics/clear/)(Color) | 描画面全体をクリアし、指定した背景色で塗りつぶします。 |
| [CopyFromScreen](../../system.drawing/graphics/copyfromscreen/#copyfromscreen_1)(Point, Point, Size) | ピクセルの四角形に対応するカラー データのビット ブロック転送を、画面からデバイスの描画面に実行します。Graphics. |
| [CopyFromScreen](../../system.drawing/graphics/copyfromscreen/#copyfromscreen_2)(Point, Point, Size, CopyPixelOperation) | ピクセルの四角形に対応するカラー データのビット ブロック転送を、画面からデバイスの描画面に実行します。Graphics. |
| [CopyFromScreen](../../system.drawing/graphics/copyfromscreen/#copyfromscreen)(int, int, int, int, Size, CopyPixelOperation) | ピクセルの四角形に対応するカラー データのビット ブロック転送を、画面からデバイスの描画面に実行します。Graphics. |
| [Dispose](../../system.drawing/graphics/dispose/)() | この Graphics が使用するすべてのリソースを解放します。 |
| [DrawArc](../../system.drawing/graphics/drawarc/#drawarc_1)(Pen, RectangleF, float, float) | RectangleF 構造体で指定された楕円の一部を表す円弧を描画します。 |
| [DrawArc](../../system.drawing/graphics/drawarc/#drawarc)(Pen, float, float, float, float, float, float) | 座標、幅、および高さのペアで指定された楕円の一部を表す円弧を描画します。 |
| [DrawBezier](../../system.drawing/graphics/drawbezier/#drawbezier_1)(Pen, PointF, PointF, PointF, PointF) | 4 つの PointF 構造体で定義されたベジェ スプラインを描画します。 |
| [DrawBezier](../../system.drawing/graphics/drawbezier/#drawbezier)(Pen, float, float, float, float, float, float, float, float) | 点を表す 4 つの順序付けられた座標のペアによって定義されるベジエ スプラインを描画します。 |
| [DrawBeziers](../../system.drawing/graphics/drawbeziers/#drawbeziers)(Pen, PointF[]) | の配列から一連のベジェ スプラインを描画します。Point構造物. |
| [DrawBeziers](../../system.drawing/graphics/drawbeziers/#drawbeziers_1)(Pen, Point[]) | の配列から一連のベジェ スプラインを描画します。PointF構造物. |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve/#drawclosedcurve)(Pen, PointF[]) | の配列で定義された閉じたカーディナル スプラインを描画します。PointF構造物. |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve/#drawclosedcurve_2)(Pen, Point[]) | の配列で定義された閉じたカーディナル スプラインを描画します。Point構造物. |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve/#drawclosedcurve_1)(Pen, PointF[], float, FillMode) | 指定された張力を使用して、PointF 構造体の配列によって定義される閉じたカーディナル スプラインを描画します。 |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve/#drawclosedcurve_3)(Pen, Point[], float, FillMode) | の配列で定義された閉じたカーディナル スプラインを描画します。Point指定された張力を使用する構造. |
| [DrawCurve](../../system.drawing/graphics/drawcurve/#drawcurve)(Pen, PointF[]) | の指定された配列を介してカーディナル スプラインを描画します。PointF構造物. |
| [DrawCurve](../../system.drawing/graphics/drawcurve/#drawcurve_4)(Pen, Point[]) | の指定された配列を介してカーディナル スプラインを描画します。Point構造物. |
| [DrawCurve](../../system.drawing/graphics/drawcurve/#drawcurve_3)(Pen, PointF[], float) | の指定された配列を介してカーディナル スプラインを描画します。PointF指定された張力を使用する構造. |
| [DrawCurve](../../system.drawing/graphics/drawcurve/#drawcurve_6)(Pen, Point[], float) | の指定された配列を介してカーディナル スプラインを描画します。Point指定された張力を使用する構造. |
| [DrawCurve](../../system.drawing/graphics/drawcurve/#drawcurve_1)(Pen, PointF[], int, int) | の指定された配列を介してカーディナル スプラインを描画します。PointF指定された張力を使用する構造。描画は配列の先頭からのオフセットで始まります. |
| [DrawCurve](../../system.drawing/graphics/drawcurve/#drawcurve_2)(Pen, PointF[], int, int, float) | の指定された配列を介してカーディナル スプラインを描画します。PointF指定された張力を使用する構造。描画は配列の先頭からのオフセットで始まります. |
| [DrawCurve](../../system.drawing/graphics/drawcurve/#drawcurve_5)(Pen, Point[], int, int, float) | の指定された配列を介してカーディナル スプラインを描画します。Point指定された張力を使用する構造。描画は配列の先頭からのオフセットで始まります. |
| [DrawEllipse](../../system.drawing/graphics/drawellipse/#drawellipse_1)(Pen, RectangleF) | バウンディング RectangleF. によって定義された楕円を描画します。 |
| [DrawEllipse](../../system.drawing/graphics/drawellipse/#drawellipse)(Pen, float, float, float, float) | 座標、高さ、幅のペアで指定された外接する四角形で定義される楕円を描画します。 |
| [DrawIcon](../../system.drawing/graphics/drawicon/#drawicon_1)(Icon, Rectangle) | 指定されたIconによって指定された領域内Rectangle構造体. |
| [DrawIcon](../../system.drawing/graphics/drawicon/#drawicon)(Icon, int, int) | 指定されたIcon指定された座標で. |
| [DrawIconUnstretched](../../system.drawing/graphics/drawiconunstretched/)(Icon, Rectangle) | 指定されたIcon画像をスケーリングせずに. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_6)(Image, Point) | 指定された位置に元の物理サイズを使用して、指定された Image を描画します。 |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_7)(Image, PointF) | 指定されたImage、元の物理サイズを使用して、指定された場所で. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_8)(Image, PointF[]) | 指定されたImage指定された場所に、指定された形状とサイズで配置されます。 |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_11)(Image, Point[]) | 指定されたЕ:Image指定された場所に、指定された形状とサイズで配置されます。 |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_14)(Image, Rectangle) | 指定されたイメージを指定された位置に指定されたサイズで描画します。 |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_20)(Image, RectangleF) | 指定されたイメージを指定された位置に指定されたサイズで描画します。 |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_3)(Image, float, float) | 指定されたImage、元の物理サイズを使用して、指定された場所で. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage)(Image, int, int) | 座標ペアで指定された位置に、元の物理サイズを使用して、指定されたイメージを描画します。 |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_9)(Image, PointF[], RectangleF, GraphicsUnit) | 指定された Image の指定された部分を、指定された位置に指定されたサイズで描画します。 |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_12)(Image, Point[], Rectangle, GraphicsUnit) | 指定されたオブジェクトの指定された部分を描画しますImage指定された場所に、指定されたサイズで. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_19)(Image, Rectangle, Rectangle, GraphicsUnit) | 指定された Image の指定された部分を、指定された位置に指定されたサイズで描画します。 |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_21)(Image, RectangleF, RectangleF, GraphicsUnit) | 指定された Image の指定された部分を、指定された位置に指定されたサイズで描画します。 |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_4)(Image, float, float, float, float) | 指定されたImage 、元の物理サイズを使用して、指定された場所と指定されたサイズで. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_5)(Image, float, float, RectangleF, GraphicsUnit) | 指定した位置に画像の一部を描画します。 |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_1)(Image, int, int, int, int) | 指定されたイメージを指定された位置に指定されたサイズで描画します。 |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_2)(Image, int, int, Rectangle, GraphicsUnit) | 指定した位置に画像の一部を描画します。 |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_10)(Image, PointF[], RectangleF, GraphicsUnit, ImageAttributes) | 指定された Image の指定された部分を、指定された位置に指定されたサイズで描画します。 |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_13)(Image, Point[], Rectangle, GraphicsUnit, ImageAttributes) | 指定されたオブジェクトの指定された部分を描画しますImage指定された場所に、指定されたサイズで. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_17)(Image, Rectangle, float, float, float, float, GraphicsUnit) | 指定されたオブジェクトの指定された部分を描画しますImage指定された場所に、指定されたサイズで. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_15)(Image, Rectangle, int, int, int, int, GraphicsUnit) | 指定されたオブジェクトの指定された部分を描画しますImage指定された場所に、指定されたサイズで. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_18)(Image, Rectangle, float, float, float, float, GraphicsUnit, ImageAttributes) | 指定されたオブジェクトの指定された部分を描画しますImage指定された場所に、指定されたサイズで. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_16)(Image, Rectangle, int, int, int, int, GraphicsUnit, ImageAttributes) | 指定された Image の指定された部分を、指定された位置に指定されたサイズで描画します。 |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled/#drawimageunscaled_2)(Image, Point) | 指定された位置に元の物理サイズを使用して、指定されたイメージを描画します。 |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled/#drawimageunscaled_3)(Image, Rectangle) | 指定された位置に元の物理サイズを使用して、指定されたイメージを描画します。 |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled/#drawimageunscaled)(Image, int, int) | 座標ペアで指定された位置に元の物理サイズを使用して、指定されたイメージを描画します。 |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled/#drawimageunscaled_1)(Image, int, int, int, int) | 座標ペアで指定された位置に元の物理サイズを使用して、指定されたイメージを描画します。 |
| [DrawImageUnscaledAndClipped](../../system.drawing/graphics/drawimageunscaledandclipped/)(Image, Rectangle) | 指定された画像をスケーリングせずに描画し、必要に応じて、指定された四角形に収まるようにクリップします。 |
| [DrawLine](../../system.drawing/graphics/drawline/#drawline_2)(Pen, Point, Point) | 2 つを結ぶ線を描画しますPoint構造物. |
| [DrawLine](../../system.drawing/graphics/drawline/#drawline_3)(Pen, PointF, PointF) | 2 つの PointF 構造体を結ぶ線を描画します。 |
| [DrawLine](../../system.drawing/graphics/drawline/#drawline_1)(Pen, float, float, float, float) | 座標ペアで指定された 2 点を結ぶ線を描画します。 |
| [DrawLine](../../system.drawing/graphics/drawline/#drawline)(Pen, int, int, int, int) | 座標ペアで指定された 2 点を結ぶ線を描画します。 |
| [DrawLines](../../system.drawing/graphics/drawlines/#drawlines)(Pen, PointF[]) | の配列を接続する一連の線分を描画しますPointF構造物. |
| [DrawLines](../../system.drawing/graphics/drawlines/#drawlines_1)(Pen, Point[]) | の配列を接続する一連の線分を描画しますPoint構造物. |
| [DrawPath](../../system.drawing/graphics/drawpath/)(Pen, GraphicsPath) | GraphicsPath を描画します。 |
| [DrawPie](../../system.drawing/graphics/drawpie/#drawpie_1)(Pen, RectangleF, float, float) | RectangleF 構造体で指定された楕円と 2 つの放射状の線で定義される円グラフを描画します。 |
| [DrawPie](../../system.drawing/graphics/drawpie/#drawpie)(Pen, float, float, float, float, float, float) | 座標ペア、幅、高さ、および 2 本の放射状線で指定された楕円によって定義されるパイ形状を描画します。 |
| [DrawPolygon](../../system.drawing/graphics/drawpolygon/#drawpolygon)(Pen, PointF[]) | PointF 構造体の配列で定義された多角形を描画します。 |
| [DrawPolygon](../../system.drawing/graphics/drawpolygon/#drawpolygon_1)(Pen, Point[]) | の配列で定義された多角形を描画しますPoint構造物. |
| [DrawRectangle](../../system.drawing/graphics/drawrectangle/#drawrectangle_2)(Pen, Rectangle) | Rectangle 構造体で指定された四角形を描画します。 |
| [DrawRectangle](../../system.drawing/graphics/drawrectangle/#drawrectangle_1)(Pen, float, float, float, float) | 座標ペア、幅、高さで指定された長方形を描画します。 |
| [DrawRectangle](../../system.drawing/graphics/drawrectangle/#drawrectangle)(Pen, int, int, int, int) | 座標ペア、幅、高さで指定された長方形を描画します。 |
| [DrawRectangles](../../system.drawing/graphics/drawrectangles/#drawrectangles)(Pen, RectangleF[]) | で指定された一連の長方形を描画しますRectangleF構造物. |
| [DrawRectangles](../../system.drawing/graphics/drawrectangles/#drawrectangles_1)(Pen, Rectangle[]) | で指定された一連の長方形を描画しますRectangle構造物. |
| [DrawString](../../system.drawing/graphics/drawstring/#drawstring_2)(string, Font, Brush, PointF) | 指定した位置に指定した文字列を指定した文字列で描画します。Brush とFontオブジェクト. |
| [DrawString](../../system.drawing/graphics/drawstring/#drawstring_4)(string, Font, Brush, RectangleF) | 指定されたテキスト文字列を、指定された長方形内に指定された色で描画します。Brush とFont指定された書式設定属性を使用するオブジェクトStringFormat. |
| [DrawString](../../system.drawing/graphics/drawstring/#drawstring)(string, Font, Brush, float, float) | 指定した位置に指定した文字列を指定した文字列で描画します。BrushとFontオブジェクト. |
| [DrawString](../../system.drawing/graphics/drawstring/#drawstring_3)(string, Font, Brush, PointF, StringFormat) | 指定した位置に指定した文字列を指定した文字列で描画します。Brushand Font指定された書式設定属性を使用するオブジェクトStringFormat. |
| [DrawString](../../system.drawing/graphics/drawstring/#drawstring_5)(string, Font, Brush, RectangleF, StringFormat) | 指定されたテキスト文字列を、指定された長方形内に指定された色で描画します。Brush とFont指定された書式設定属性を使用するオブジェクトStringFormat. |
| [DrawString](../../system.drawing/graphics/drawstring/#drawstring_1)(string, Font, Brush, float, float, StringFormat) | 指定した位置に指定した文字列を指定した文字列で描画します。Brushand Font指定された書式設定属性を使用するオブジェクトStringFormat. |
| [EndContainer](../../system.drawing/graphics/endcontainer/)(GraphicsContainer) | 現在のグラフィック コンテナを閉じて、このコンテナの状態を復元しますGraphicsへの呼び出しによって保存された状態にBeginContainer method. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile)(Metafile, Point, EnumerateMetafileProc) | 指定された[`Metafile`](../../system.drawing.imaging/metafile/) 、一度に 1 つずつ、指定されたポイントで表示するためのコールバック メソッドに送信します。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_6)(Metafile, PointF, EnumerateMetafileProc) | 指定された[`Metafile`](../../system.drawing.imaging/metafile/) 、一度に 1 つずつ、指定されたポイントで表示するためのコールバック メソッドに送信します。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_12)(Metafile, PointF[], EnumerateMetafileProc) | 指定された[`Metafile`](../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定された平行四辺形で表示するためのコールバック メソッドに渡します。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_18)(Metafile, Point[], EnumerateMetafileProc) | 指定された[`Metafile`](../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定された平行四辺形で表示するためのコールバック メソッドに渡します。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_24)(Metafile, Rectangle, EnumerateMetafileProc) | 指定されたレコードを送信します[`Metafile`](../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定された四角形に表示するためのコールバック メソッドに渡します。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_30)(Metafile, RectangleF, EnumerateMetafileProc) | 指定されたレコードを送信します[`Metafile`](../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定された四角形に表示するためのコールバック メソッドに渡します。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_1)(Metafile, Point, EnumerateMetafileProc, IntPtr) | 指定された[`Metafile`](../../system.drawing.imaging/metafile/) 、一度に 1 つずつ、指定されたポイントで表示するためのコールバック メソッドに送信します。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_7)(Metafile, PointF, EnumerateMetafileProc, IntPtr) | 指定された[`Metafile`](../../system.drawing.imaging/metafile/) 、一度に 1 つずつ、指定されたポイントで表示するためのコールバック メソッドに送信します。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_13)(Metafile, PointF[], EnumerateMetafileProc, IntPtr) | 指定された[`Metafile`](../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定された平行四辺形で表示するためのコールバック メソッドに渡します。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_19)(Metafile, Point[], EnumerateMetafileProc, IntPtr) | 指定された[`Metafile`](../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定された平行四辺形で表示するためのコールバック メソッドに渡します。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_25)(Metafile, Rectangle, EnumerateMetafileProc, IntPtr) | 指定されたレコードを送信します[`Metafile`](../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定された四角形に表示するためのコールバック メソッドに渡します。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_31)(Metafile, RectangleF, EnumerateMetafileProc, IntPtr) | 指定されたレコードを送信します[`Metafile`](../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定された四角形に表示するためのコールバック メソッドに渡します。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_2)(Metafile, Point, EnumerateMetafileProc, IntPtr, ImageAttributes) | 指定された[`Metafile`](../../system.drawing.imaging/metafile/)、一度に 1 つずつ、指定された画像属性を使用して指定されたポイントで表示するためのコールバック メソッドに送信します。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_3)(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc) | から選択された長方形のレコードを送信します[`Metafile`](../../system.drawing.imaging/metafile/) 、一度に 1 つずつ、指定されたポイントで表示するためのコールバック メソッドに送信します。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_8)(Metafile, PointF, EnumerateMetafileProc, IntPtr, ImageAttributes) | 指定された[`Metafile`](../../system.drawing.imaging/metafile/)を一度に 1 つずつコールバック method に送信し、指定した画像属性を使用して指定したポイントに表示します。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_9)(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc) | から選択された長方形のレコードを送信します[`Metafile`](../../system.drawing.imaging/metafile/) 、一度に 1 つずつ、指定されたポイントで表示するためのコールバック メソッドに送信します。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_14)(Metafile, PointF[], EnumerateMetafileProc, IntPtr, ImageAttributes) | 指定された[`Metafile`](../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定されたイメージ属性を使用して指定された平行四辺形で表示するためのコールバック メソッドに渡します。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_15)(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc) | S から選択された長方形のレコードを送信します。[`Metafile`](../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定された平行四辺形で表示するためのコールバック メソッドに渡します。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_20)(Metafile, Point[], EnumerateMetafileProc, IntPtr, ImageAttributes) | 指定された[`Metafile`](../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定されたイメージ属性を使用して指定された平行四辺形で表示するためのコールバック メソッドに渡します。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_21)(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc) | から選択された長方形のレコードを送信します[`Metafile`](../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定された平行四辺形で表示するためのコールバック メソッドに渡します。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_26)(Metafile, Rectangle, EnumerateMetafileProc, IntPtr, ImageAttributes) | 指定されたレコードを送信します[`Metafile`](../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定されたイメージ属性を使用して指定された長方形に表示するためのコールバック メソッドに渡します。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_27)(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc) | から選択された長方形のレコードを送信します[`Metafile`](../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定された四角形に表示するためのコールバック メソッドに渡します。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_32)(Metafile, RectangleF, EnumerateMetafileProc, IntPtr, ImageAttributes) | 指定されたレコードを送信します[`Metafile`](../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定されたイメージ属性を使用して指定された長方形に表示するためのコールバック メソッドに渡します。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_33)(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc) | から選択された長方形のレコードを送信します[`Metafile`](../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定された四角形に表示するためのコールバック メソッドに渡します。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_4)(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) | から選択された長方形のレコードを送信します[`Metafile`](../../system.drawing.imaging/metafile/) 、一度に 1 つずつ、指定されたポイントで表示するためのコールバック メソッドに送信します。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_10)(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) | から選択された長方形のレコードを送信します[`Metafile`](../../system.drawing.imaging/metafile/) 、一度に 1 つずつ、指定されたポイントで表示するためのコールバック メソッドに送信します。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_16)(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) | から選択された長方形のレコードを送信します[`Metafile`](../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定された平行四辺形で表示するためのコールバック メソッドに渡します。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_22)(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) | から選択された長方形のレコードを送信します[`Metafile`](../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定された平行四辺形で表示するためのコールバック メソッドに渡します。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_28)(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) | から選択された長方形のレコードを送信します[`Metafile`](../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定された四角形に表示するためのコールバック メソッドに渡します。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_34)(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) | から選択された長方形のレコードを送信します[`Metafile`](../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定された四角形に表示するためのコールバック メソッドに渡します。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_5)(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | から選択された長方形のレコードを送信します[`Metafile`](../../system.drawing.imaging/metafile/)、一度に 1 つずつ、指定された画像属性を使用して指定されたポイントで表示するためのコールバック メソッドに送信します。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_11)(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | から選択された長方形のレコードを送信します[`Metafile`](../../system.drawing.imaging/metafile/)、一度に 1 つずつ、指定された画像属性を使用して指定されたポイントで表示するためのコールバック メソッドに送信します。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_17)(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | から選択された長方形のレコードを送信します[`Metafile`](../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定されたイメージ属性を使用して指定された平行四辺形で表示するためのコールバック メソッドに渡します。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_23)(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | から選択された長方形のレコードを送信します[`Metafile`](../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定されたイメージ属性を使用して指定された平行四辺形で表示するためのコールバック メソッドに渡します。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_29)(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | から選択された長方形のレコードを送信します[`Metafile`](../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定されたイメージ属性を使用して指定された長方形に表示するためのコールバック メソッドに渡します。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_35)(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | から選択された長方形のレコードを送信します[`Metafile`](../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定されたイメージ属性を使用して指定された長方形に表示するためのコールバック メソッドに渡します。 |
| [ExcludeClip](../../system.drawing/graphics/excludeclip/#excludeclip)(Rectangle) | このクリップ領域を更新しますGraphicsによって指定された領域を除外します。Rectangle |
| [ExcludeClip](../../system.drawing/graphics/excludeclip/#excludeclip_1)(Region) | このクリップ領域を更新しますGraphicsによって指定された領域を除外します。Region. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve/#fillclosedcurve)(Brush, PointF[]) | の配列で定義された閉じたカーディナル スプライン曲線の内部を塗りつぶします。PointF構造物. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve/#fillclosedcurve_3)(Brush, Point[]) | の配列で定義された閉じたカーディナル スプライン曲線の内部を塗りつぶします。Point構造物. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve/#fillclosedcurve_1)(Brush, PointF[], FillMode) | の配列で定義された閉じたカーディナル スプライン曲線の内部を塗りつぶします。PointF指定された塗りつぶしモードを使用する構造. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve/#fillclosedcurve_4)(Brush, Point[], FillMode) | の配列で定義された閉じたカーディナル スプライン曲線の内部を塗りつぶします。Point指定された塗りつぶしモードを使用する構造. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve/#fillclosedcurve_2)(Brush, PointF[], FillMode, float) | 指定された塗りつぶしモードとテンションを使用して、PointF 構造体 の配列によって定義された閉じたカーディナル スプライン曲線の内部を塗りつぶします。 |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve/#fillclosedcurve_5)(Brush, Point[], FillMode, float) | の配列で定義された閉じたカーディナル スプライン曲線の内部を塗りつぶします。Point指定された塗りつぶしモードを使用する構造. |
| [FillEllipse](../../system.drawing/graphics/fillellipse/#fillellipse_1)(Brush, RectangleF) | RectangleF 構造体で指定された外接する四角形で定義された楕円の内部を塗りつぶします。 |
| [FillEllipse](../../system.drawing/graphics/fillellipse/#fillellipse)(Brush, float, float, float, float) | 座標、幅、および高さのペアによって指定された外接する長方形によって定義された楕円の内部を塗りつぶします. |
| [FillPath](../../system.drawing/graphics/fillpath/)(Brush, GraphicsPath) | GraphicsPath. の内部を塗りつぶします。 |
| [FillPie](../../system.drawing/graphics/fillpie/#fillpie_2)(Brush, Rectangle, float, float) | Rectangle 構造体で指定された楕円と 2 本の放射状の線で定義されるパイ セクションの内部を塗りつぶします。 |
| [FillPie](../../system.drawing/graphics/fillpie/#fillpie_1)(Brush, float, float, float, float, float, float) | 1 組の座標、幅、高さ、および 2 本の放射状の線で指定された楕円で定義されるパイ セクションの内部を塗りつぶします。 |
| [FillPie](../../system.drawing/graphics/fillpie/#fillpie)(Brush, int, int, int, int, int, int) | 1 組の座標、幅、高さ、および 2 本の放射状の線で指定された楕円で定義されるパイ セクションの内部を塗りつぶします。 |
| [FillPolygon](../../system.drawing/graphics/fillpolygon/#fillpolygon)(Brush, PointF[]) | によって指定された点の配列によって定義された多角形の内部を塗りつぶします。PointF構造物. |
| [FillPolygon](../../system.drawing/graphics/fillpolygon/#fillpolygon_2)(Brush, Point[]) | によって指定された点の配列によって定義された多角形の内部を塗りつぶします。Point構造物. |
| [FillPolygon](../../system.drawing/graphics/fillpolygon/#fillpolygon_1)(Brush, PointF[], FillMode) | 指定された塗りつぶしモードを使用して、PointF 構造体によって指定された点の配列によって定義された多角形の内部を塗りつぶします。 |
| [FillPolygon](../../system.drawing/graphics/fillpolygon/#fillpolygon_3)(Brush, Point[], FillMode) | によって指定された点の配列によって定義された多角形の内部を塗りつぶします。Point指定された塗りつぶしモードを使用する構造. |
| [FillRectangle](../../system.drawing/graphics/fillrectangle/#fillrectangle_1)(Brush, RectangleF) | RectangleF 構造体で指定された四角形の内部を塗りつぶします。 |
| [FillRectangle](../../system.drawing/graphics/fillrectangle/#fillrectangle)(Brush, float, float, float, float) | 座標、幅、高さのペアで指定された長方形の内部を塗りつぶします。 |
| [FillRectangles](../../system.drawing/graphics/fillrectangles/#fillrectangles)(Brush, RectangleF[]) | によって指定された一連の長方形の内部を塗りつぶします。RectangleF構造物. |
| [FillRectangles](../../system.drawing/graphics/fillrectangles/#fillrectangles_1)(Brush, Rectangle[]) | によって指定された一連の長方形の内部を塗りつぶします。Rectangle構造物. |
| [FillRegion](../../system.drawing/graphics/fillregion/)(Brush, Region) | Region の内部を塗りつぶします。 |
| [Flush](../../system.drawing/graphics/flush/#flush)() | 保留中のすべてのグラフィックス操作の実行を強制し、操作が完了するのを待たずにすぐに戻ります. |
| [Flush](../../system.drawing/graphics/flush/#flush_1)(FlushIntention) | 保留中のすべてのグラフィックス操作の実行を、指定されたようにメソッドが待機中または待機していない状態で強制的に実行し、操作が終了する前に戻ります. |
| [GetHdc](../../system.drawing/graphics/gethdc/)() | これに関連付けられたデバイス コンテキストへのハンドルを取得しますGraphics. |
| [GetNearestColor](../../system.drawing/graphics/getnearestcolor/)(Color) | 指定された色に最も近い色を取得しますColor構造体. |
| [IntersectClip](../../system.drawing/graphics/intersectclip/#intersectclip)(Rectangle) | このクリップ領域を更新しますGraphics現在のクリップ領域と指定された領域の交点Rectangle構造体. |
| [IntersectClip](../../system.drawing/graphics/intersectclip/#intersectclip_1)(RectangleF) | このクリップ領域を更新しますGraphics現在のクリップ領域と指定された領域の交点RectangleF構造体. |
| [IntersectClip](../../system.drawing/graphics/intersectclip/#intersectclip_2)(Region) | このクリップ領域を更新しますGraphics現在のクリップ領域と指定された領域の交点Region. |
| [IsVisible](../../system.drawing/graphics/isvisible/#isvisible_4)(Point) | 指定されたPoint構造は、この可視クリップ領域内に含まれていますGraphics. |
| [IsVisible](../../system.drawing/graphics/isvisible/#isvisible_5)(PointF) | 指定されたPointF構造は、この可視クリップ領域内に含まれていますGraphics. |
| [IsVisible](../../system.drawing/graphics/isvisible/#isvisible_6)(Rectangle) | によって指定された長方形がRectangle構造は、この可視クリップ領域内に含まれていますGraphics. |
| [IsVisible](../../system.drawing/graphics/isvisible/#isvisible_7)(RectangleF) | によって指定された長方形がRectangleF構造は、この可視クリップ領域内に含まれていますGraphics. |
| [IsVisible](../../system.drawing/graphics/isvisible/#isvisible_2)(float, float) | 座標のペアで指定されたポイントが、このクリップの可視クリップ領域内に含まれているかどうかを示しますGraphics. |
| [IsVisible](../../system.drawing/graphics/isvisible/#isvisible)(int, int) | 座標のペアで指定されたポイントが、このクリップの可視クリップ領域内に含まれているかどうかを示しますGraphics. |
| [IsVisible](../../system.drawing/graphics/isvisible/#isvisible_3)(float, float, float, float) | 座標、幅、および高さのペアで指定された長方形が、このクリップの可視クリップ領域内に含まれているかどうかを示しますGraphics. |
| [IsVisible](../../system.drawing/graphics/isvisible/#isvisible_1)(int, int, int, int) | 座標、幅、および高さのペアで指定された長方形が、このクリップの可視クリップ領域内に含まれているかどうかを示しますGraphics. |
| [MeasureCharacterRanges](../../system.drawing/graphics/measurecharacterranges/)(string, Font, RectangleF, StringFormat) | の配列を取得しますRegion各オブジェクトは、指定された string. 内の文字位置の範囲を制限します。 |
| [MeasureString](../../system.drawing/graphics/measurestring/#measurestring)(string, Font) | 指定した文字列で描画したときに指定した文字列を測定しますFont. |
| [MeasureString](../../system.drawing/graphics/measurestring/#measurestring_1)(string, Font, int) | 指定した文字列で描画したときに指定した文字列を測定しますFont. |
| [MeasureString](../../system.drawing/graphics/measurestring/#measurestring_4)(string, Font, SizeF) | 指定した文字列で描画したときに指定した文字列を測定しますFont. |
| [MeasureString](../../system.drawing/graphics/measurestring/#measurestring_2)(string, Font, int, StringFormat) | 指定した文字列で描画したときに指定した文字列を測定しますFontおよび指定されたformatted StringFormat. |
| [MeasureString](../../system.drawing/graphics/measurestring/#measurestring_3)(string, Font, PointF, StringFormat) | 指定した文字列で描画したときに指定した文字列を測定しますFontおよび指定されたformatted StringFormat. |
| [MeasureString](../../system.drawing/graphics/measurestring/#measurestring_5)(string, Font, SizeF, StringFormat) | 指定した文字列で描画したときに指定した文字列を測定しますFontおよび指定されたformatted StringFormat. |
| [MeasureString](../../system.drawing/graphics/measurestring/#measurestring_6)(string, Font, SizeF, StringFormat, out int, out int) | 指定した文字列で描画したときに指定した文字列を測定しますFontおよび指定されたformatted StringFormat. |
| [MultiplyTransform](../../system.drawing/graphics/multiplytransform/#multiplytransform)(Matrix) | これのワールド変換を乗算しますGraphicsを指定し、Matrix. |
| [MultiplyTransform](../../system.drawing/graphics/multiplytransform/#multiplytransform_1)(Matrix, MatrixOrder) | これのワールド変換を乗算しますGraphicsおよび指定された Matrix指定された順序で. |
| [ReleaseHdc](../../system.drawing/graphics/releasehdc/#releasehdc)() | 前回の 呼び出しで取得したデバイス コンテキスト ハンドルを解放します。GetHdcこの方法Graphics. |
| [ReleaseHdc](../../system.drawing/graphics/releasehdc/#releasehdc_1)(IntPtr) | への前回の呼び出しで取得したデバイス コンテキスト ハンドルを解放します。GetHdcこれの method Graphics. |
| [ResetClip](../../system.drawing/graphics/resetclip/)() | このクリップ領域をリセットしますGraphics無限領域へ. |
| [ResetTransform](../../system.drawing/graphics/resettransform/)() | このワールド変換行列をリセットしますGraphics恒等行列に. |
| [Restore](../../system.drawing/graphics/restore/)(GraphicsState) | この状態を復元します`Graphics`によって表される状態に[`GraphicsState`](../../system.drawing.drawing2d/graphicsstate/). |
| [RotateTransform](../../system.drawing/graphics/rotatetransform/#rotatetransform)(float) | 指定された回転をこの変換行列に適用しますGraphics. |
| [RotateTransform](../../system.drawing/graphics/rotatetransform/#rotatetransform_1)(float, MatrixOrder) | 指定された回転をこの変換行列に適用しますGraphics指定された順序で. |
| [Save](../../system.drawing/graphics/save/)() | これの現在の状態を保存します`Graphics`保存された状態を[`GraphicsState`](../../system.drawing.drawing2d/graphicsstate/). |
| [ScaleTransform](../../system.drawing/graphics/scaletransform/#scaletransform)(float, float) | 指定されたスケーリング操作をこの変換行列に適用しますGraphicsオブジェクトの変換行列の前に it を追加します。 |
| [ScaleTransform](../../system.drawing/graphics/scaletransform/#scaletransform_1)(float, float, MatrixOrder) | 指定されたスケーリング操作をこの変換行列に適用しますGraphics指定された順序で. |
| [SetClip](../../system.drawing/graphics/setclip/#setclip_2)(Graphics) | このクリッピング領域を設定します`Graphics`指定の Clip プロパティに`Graphics` |
| [SetClip](../../system.drawing/graphics/setclip/#setclip)(GraphicsPath) | このクリッピング領域を設定します`Graphics`指定された[`GraphicsPath`](../../system.drawing.drawing2d/graphicspath/). |
| [SetClip](../../system.drawing/graphics/setclip/#setclip_4)(Rectangle) | このクリッピング領域を設定します`Graphics`現在のクリップ領域と[`Rectangle`](../rectangle/)構造体. |
| [SetClip](../../system.drawing/graphics/setclip/#setclip_6)(RectangleF) | このクリッピング領域を設定します`Graphics`現在のクリップ領域と[`RectangleF`](../rectanglef/)構造体. |
| [SetClip](../../system.drawing/graphics/setclip/#setclip_3)(Graphics, CombineMode) | このクリッピング領域を設定します`Graphics`現在のクリップ領域の指定された結合操作の結果と、指定されたクリップの Clip プロパティ`Graphics`. |
| [SetClip](../../system.drawing/graphics/setclip/#setclip_1)(GraphicsPath, CombineMode) | このクリッピング領域を設定します`Graphics`現在のクリップ領域と指定された領域を結合する指定された操作の結果に[`GraphicsPath`](../../system.drawing.drawing2d/graphicspath/). |
| [SetClip](../../system.drawing/graphics/setclip/#setclip_5)(Rectangle, CombineMode) | このクリッピング領域を設定します`Graphics`現在のクリップ領域と[`Rectangle`](../rectangle/)構造体. |
| [SetClip](../../system.drawing/graphics/setclip/#setclip_7)(RectangleF, CombineMode) | このクリッピング領域を設定します`Graphics`現在のクリップ領域と[`RectangleF`](../rectanglef/)構造体. |
| [SetClip](../../system.drawing/graphics/setclip/#setclip_8)(Region, CombineMode) | このクリッピング領域を設定しますGraphics指定された操作の結果に結合 現在のクリップ領域と指定されたRegion. |
| [TransformPoints](../../system.drawing/graphics/transformpoints/#transformpoints)(CoordinateSpace, CoordinateSpace, PointF[]) | 現在のワールドとこのページの変換を使用して、ポイントの配列をある座標空間から別の座標空間に変換しますGraphics. |
| [TransformPoints](../../system.drawing/graphics/transformpoints/#transformpoints_1)(CoordinateSpace, CoordinateSpace, Point[]) | 現在のワールドとこのページの変換を使用して、ポイントの配列をある座標空間から別の座標空間に変換しますGraphics. |
| [TranslateClip](../../system.drawing/graphics/translateclip/#translateclip_1)(float, float) | このクリッピング領域を変換しますGraphics水平および垂直方向に指定された量だけ。 |
| [TranslateClip](../../system.drawing/graphics/translateclip/#translateclip)(int, int) | このクリッピング領域を変換しますGraphics水平および垂直方向に指定された量だけ。 |
| [TranslateTransform](../../system.drawing/graphics/translatetransform/#translatetransform)(float, float) | 指定された translation をこの変換行列の先頭に追加することにより、座標系の原点を変更しますGraphics. |
| [TranslateTransform](../../system.drawing/graphics/translatetransform/#translatetransform_1)(float, float, MatrixOrder) | この変換行列 に指定された平行移動を適用して、座標系の原点を変更しますGraphics指定された順序で. |

## その他のメンバー

| 名前 | 説明 |
| --- | --- |
| delegate [DrawImageAbort](graphics.drawimageabort/) | を決定するためのコールバック メソッドを提供します。[`DrawImage`](./drawimage/)メソッドは実行を途中でキャンセルし、画像の描画を停止する必要があります。 |
| delegate [EnumerateMetafileProc](graphics.enumeratemetafileproc/) | のコールバック メソッドを提供します。[`EnumerateMetafile`](./enumeratemetafile/)方法。 |

### 関連項目

* 名前空間 [System.Drawing](../../system.drawing/)
* 組み立て [Aspose.Drawing](../../)


