---
title: Class PdfDevice
second_title: Aspose.SVG for .NET API リファレンス
description: Aspose.Svg.Rendering.Pdf.PdfDevice クラス. PDF ドキュメントへのレンダリングを表します
type: docs
weight: 2950
url: /ja/net/aspose.svg.rendering.pdf/pdfdevice/
---
## PdfDevice class

PDF ドキュメントへのレンダリングを表します。

```csharp
public class PdfDevice : Device<PdfGraphicContext, PdfRenderingOptions>
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [PdfDevice](pdfdevice/#constructor)(ICreateStreamProvider) | の新しいインスタンスを初期化します`PdfDevice` class. |
| [PdfDevice](pdfdevice/#constructor_4)(Stream) | の新しいインスタンスを初期化します`PdfDevice` class. |
| [PdfDevice](pdfdevice/#constructor_5)(string) | の新しいインスタンスを初期化します`PdfDevice` class. |
| [PdfDevice](pdfdevice/#constructor_1)(PdfRenderingOptions, ICreateStreamProvider) | の新しいインスタンスを初期化します`PdfDevice`レンダリング オプションとストリーム プロバイダーによるクラス. |
| [PdfDevice](pdfdevice/#constructor_2)(PdfRenderingOptions, Stream) | の新しいインスタンスを初期化します`PdfDevice`オプションと出力ストリームをレンダリングすることによるクラス. |
| [PdfDevice](pdfdevice/#constructor_3)(PdfRenderingOptions, string) | の新しいインスタンスを初期化します`PdfDevice`レンダリング オプションと出力ファイル名によるクラス. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [GraphicContext](../../aspose.svg.rendering/device-2/graphiccontext/) { get; } |  |
| [Options](../../aspose.svg.rendering/device-2/options/) { get; } |  |

## メソッド

| 名前 | 説明 |
| --- | --- |
| override [AddRect](../../aspose.svg.rendering.pdf/pdfdevice/addrect/)(RectangleF) | 四角形を現在のパスに完全なサブパスとして追加します。 |
| override [BeginDocument](../../aspose.svg.rendering.pdf/pdfdevice/begindocument/)(Document) | ドキュメントのレンダリングを開始します。 |
| override [BeginElement](../../aspose.svg.rendering.pdf/pdfdevice/beginelement/)(Element, RectangleF) | 要素のレンダリングを開始します。 |
| override [BeginPage](../../aspose.svg.rendering.pdf/pdfdevice/beginpage/)(SizeF) | 新しいページのレンダリングを開始します。 |
| override [Clip](../../aspose.svg.rendering.pdf/pdfdevice/clip/)(FillMode) | FillMode ルールを使用して塗りつぶす領域を決定し、現在のクリッピング パスを現在のパスと交差させて変更します。 このメソッドは、現在のパスを終了します。 |
| override [ClosePath](../../aspose.svg.rendering.pdf/pdfdevice/closepath/)() | 現在のポイントからサブパスの開始点までの直線セグメントを追加することにより、現在のサブパスを閉じます。 現在のサブパスが既に閉じられている場合、"ClosePath" は何もしません。 この演算子は現在のサブパスを終了します。現在のパスに別のセグメントを追加すると、新しいサブパス が開始されますが、新しいセグメントが「ClosePath」メソッドによって到達したエンドポイントで開始される場合でも. |
| override [CubicBezierTo](../../aspose.svg.rendering.pdf/pdfdevice/cubicbezierto/)(PointF, PointF, PointF) | 3 次ベジエ曲線を現在のパスに追加します。曲線は、ベジエ制御点として pt1 と pt2 を使用して、現在の点から点 pt2, まで延長されます。新しい現在のポイントは pt3. です |
| [Dispose](../../aspose.svg.rendering/device-2/dispose/)() |  |
| override [DrawImage](../../aspose.svg.rendering.pdf/pdfdevice/drawimage/)(byte[], ImageType, RectangleF) | 指定した画像を描画します。 |
| override [EndDocument](../../aspose.svg.rendering.pdf/pdfdevice/enddocument/)() | ドキュメントのレンダリングを終了します。 |
| override [EndElement](../../aspose.svg.rendering.pdf/pdfdevice/endelement/)(Element) | 要素のレンダリングを終了します。 |
| override [EndPage](../../aspose.svg.rendering.pdf/pdfdevice/endpage/)() | 現在のページのレンダリングを終了します。 |
| override [Fill](../../aspose.svg.rendering.pdf/pdfdevice/fill/)(FillMode) | 現在のパスで囲まれた領域全体を塗りつぶします。 パスがいくつかの切断されたサブパスで構成されている場合、 をまとめて考慮して、すべてのサブパスの内部を埋めます。 このメソッドは、現在のパスを終了します。 |
| override [FillText](../../aspose.svg.rendering.pdf/pdfdevice/filltext/)(string, PointF) | 指定した位置に指定したテキスト文字列を入力します。 |
| override [Flush](../../aspose.svg.rendering.pdf/pdfdevice/flush/)() | すべてのデータを出力ストリームにフラッシュします。 |
| override [LineTo](../../aspose.svg.rendering.pdf/pdfdevice/lineto/)(PointF) | 現在の点から点 (pt) までの直線セグメントを追加します。新しい現在のポイントは pt. です |
| override [MoveTo](../../aspose.svg.rendering.pdf/pdfdevice/moveto/)(PointF) | 現在の点をパラメーター pt の座標に移動し、接続する線分を省略して、新しいサブパスを開始します。 現在のパスの以前のパス構築方法も「MoveTo」だった場合、新しい「MoveTo」がそれをオーバーライドします。 前の「MoveTo」操作の痕跡がパスに残っていません. |
| override [RestoreGraphicContext](../../aspose.svg.rendering.pdf/pdfdevice/restoregraphiccontext/)() | スタックからポップすることにより、グラフィック コンテキスト全体を以前の値に復元します。 |
| override [SaveGraphicContext](../../aspose.svg.rendering.pdf/pdfdevice/savegraphiccontext/)() | グラフィックス コンテキスト全体のコピーをスタックにプッシュします。 |
| override [Stroke](../../aspose.svg.rendering.pdf/pdfdevice/stroke/)() | 現在のパスに沿って線を引きます。ストローク ラインは、パス内の各直線または曲線のセグメントに従います。 はセグメントの中心にあり、辺はそれに平行です。パスの各サブパスは個別に扱われます。 このメソッドは、現在のパスを終了します。 |
| override [StrokeAndFill](../../aspose.svg.rendering.pdf/pdfdevice/strokeandfill/)(FillMode) | 現在のパスをストロークして塗りつぶします。 このメソッドは現在のパスを終了します。 |
| override [StrokeText](../../aspose.svg.rendering.pdf/pdfdevice/stroketext/)(string, PointF) | 指定された位置で指定されたテキスト文字列をストロークします。 |

## その他のメンバー

| 名前 | 説明 |
| --- | --- |
| class [PdfGraphicContext](pdfdevice.pdfgraphiccontext/) | PdfDevice の現在のグラフィック コントロール パラメータを保持します。 これらのパラメータは、グラフィック オペレータが実行されるグローバル フレームワークを定義します。 |

### 関連項目

* class [Device&lt;TGraphicContext,TRenderingOptions&gt;](../../aspose.svg.rendering/device-2/)
* class [PdfGraphicContext](../pdfdevice.pdfgraphiccontext/)
* class [PdfRenderingOptions](../pdfrenderingoptions/)
* 名前空間 [Aspose.Svg.Rendering.Pdf](../../aspose.svg.rendering.pdf/)
* 組み立て [Aspose.SVG](../../)


