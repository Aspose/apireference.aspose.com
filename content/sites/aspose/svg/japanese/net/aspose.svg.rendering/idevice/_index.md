---
title: Interface IDevice
second_title: Aspose.SVG for .NET API リファレンス
description: Aspose.Svg.Rendering.IDevice インターフェース. パステキスト画像などのグラフィック要素のカスタム レンダリングをサポートするメソッドとプロパティを定義します
type: docs
weight: 2810
url: /ja/net/aspose.svg.rendering/idevice/
---
## IDevice interface

パス、テキスト、画像などのグラフィック要素のカスタム レンダリングをサポートするメソッドとプロパティを定義します。

```csharp
public interface IDevice : IDisposable
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [GraphicContext](../../aspose.svg.rendering/idevice/graphiccontext/) { get; } | グラフィック コンテキストを取得します。 |
| [Options](../../aspose.svg.rendering/idevice/options/) { get; } | レンダリング オプションを取得します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [AddRect](../../aspose.svg.rendering/idevice/addrect/)(RectangleF) | 四角形を現在のパスに完全なサブパスとして追加します。 |
| [BeginDocument](../../aspose.svg.rendering/idevice/begindocument/)(Document) | ドキュメントのレンダリングを開始します。 |
| [BeginElement](../../aspose.svg.rendering/idevice/beginelement/)(Element, RectangleF) | 要素のレンダリングを開始します。 |
| [BeginPage](../../aspose.svg.rendering/idevice/beginpage/)(SizeF) | 新しいページのレンダリングを開始します。 |
| [Clip](../../aspose.svg.rendering/idevice/clip/)(FillMode) | FillMode ルールを使用して塗りつぶす領域を決定し、現在のクリッピング パスを現在のパスと交差させて変更します。 このメソッドは、現在のパスを終了します。 |
| [ClosePath](../../aspose.svg.rendering/idevice/closepath/)() | 現在のポイントからサブパスの開始点までの直線セグメントを追加することにより、現在のサブパスを閉じます。 現在のサブパスが既に閉じられている場合、"ClosePath" は何もしません。 この演算子は現在のサブパスを終了します。現在のパスに別のセグメントを追加すると、新しいサブパス が開始されますが、新しいセグメントが「ClosePath」メソッドによって到達したエンドポイントで開始される場合でも. |
| [CubicBezierTo](../../aspose.svg.rendering/idevice/cubicbezierto/)(PointF, PointF, PointF) | 3 次ベジエ曲線を現在のパスに追加します。曲線は、ベジエ制御点として pt1 と pt2 を使用して、現在の点から点 pt3, まで延長されます。新しい現在のポイントは pt3. です |
| [DrawImage](../../aspose.svg.rendering/idevice/drawimage/)(byte[], ImageType, RectangleF) | 指定した画像を描画します。 |
| [EndDocument](../../aspose.svg.rendering/idevice/enddocument/)() | ドキュメントのレンダリングを終了します。 |
| [EndElement](../../aspose.svg.rendering/idevice/endelement/)(Element) | 要素のレンダリングを終了します。 |
| [EndPage](../../aspose.svg.rendering/idevice/endpage/)() | 現在のページのレンダリングを終了します。 |
| [Fill](../../aspose.svg.rendering/idevice/fill/)(FillMode) | 現在のパスで囲まれた領域全体を塗りつぶします。 パスがいくつかの切断されたサブパスで構成されている場合、 をまとめて考慮して、すべてのサブパスの内部を埋めます。 このメソッドは、現在のパスを終了します。 |
| [FillText](../../aspose.svg.rendering/idevice/filltext/)(string, PointF) | 指定した位置に指定したテキスト文字列を入力します。 |
| [Flush](../../aspose.svg.rendering/idevice/flush/)() | すべてのデータを出力ストリームにフラッシュします。 |
| [LineTo](../../aspose.svg.rendering/idevice/lineto/)(PointF) | 現在の点から点 (pt) までの直線セグメントを追加します。新しい現在のポイントは pt. です |
| [MoveTo](../../aspose.svg.rendering/idevice/moveto/)(PointF) | 現在の点をパラメーター pt の座標に移動し、接続する線分を省略して、新しいサブパスを開始します。 現在のパスの以前のパス構築方法も「MoveTo」だった場合、新しい「MoveTo」がそれをオーバーライドします。 前の「MoveTo」操作の痕跡がパスに残っていません. |
| [RestoreGraphicContext](../../aspose.svg.rendering/idevice/restoregraphiccontext/)() | スタックからポップすることにより、グラフィック コンテキスト全体を以前の値に復元します。 |
| [SaveGraphicContext](../../aspose.svg.rendering/idevice/savegraphiccontext/)() | グラフィックス コンテキスト全体のコピーをスタックにプッシュします。 |
| [Stroke](../../aspose.svg.rendering/idevice/stroke/)() | 現在のパスに沿って線を引きます。ストローク ラインは、パス内の各直線または曲線のセグメントに従います。 はセグメントの中心にあり、辺はそれに平行です。パスの各サブパスは個別に扱われます。 このメソッドは、現在のパスを終了します。 |
| [StrokeAndFill](../../aspose.svg.rendering/idevice/strokeandfill/)(FillMode) | 現在のパスをストロークして塗りつぶします。 このメソッドは現在のパスを終了します。 |
| [StrokeText](../../aspose.svg.rendering/idevice/stroketext/)(string, PointF) | 指定された位置で指定されたテキスト文字列をストロークします。 |

### 関連項目

* 名前空間 [Aspose.Svg.Rendering](../../aspose.svg.rendering/)
* 組み立て [Aspose.SVG](../../)


