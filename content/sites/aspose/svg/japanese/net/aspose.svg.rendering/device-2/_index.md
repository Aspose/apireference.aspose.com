---
title: Class DeviceTGraphicContextTRenderingOptions
second_title: Aspose.SVG for .NET API リファレンス
description: Aspose.Svg.Rendering.Device2TGraphicContextTRenderingOptions クラス. 特定のレンダリング デバイスを実装するための基本クラスを表します
type: docs
weight: 2740
url: /ja/net/aspose.svg.rendering/device-2/
---
## Device&lt;TGraphicContext,TRenderingOptions&gt; class

特定のレンダリング デバイスを実装するための基本クラスを表します。

```csharp
public abstract class Device<TGraphicContext, TRenderingOptions> : Device, IDevice
    where TGraphicContext : GraphicContext, new()
    where TRenderingOptions : RenderingOptions
```

| パラメータ | 説明 |
| --- | --- |
| TGraphicContext | 現在のグラフィック コントロール パラメータを保持するグラフィック コンテキスト |
| TRenderingOptions | レンダリング オプション |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [GraphicContext](../../aspose.svg.rendering/device-2/graphiccontext/) { get; } | グラフィック コンテキストを取得します |
| [Options](../../aspose.svg.rendering/device-2/options/) { get; } | レンダリング オプションを取得します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| abstract [AddRect](../../aspose.svg.rendering/device-2/addrect/)(RectangleF) | 四角形を現在のパスに完全なサブパスとして追加します。 |
| virtual [BeginDocument](../../aspose.svg.rendering/device-2/begindocument/)(Document) | ドキュメントのレンダリングを開始します。 |
| abstract [BeginElement](../../aspose.svg.rendering/device-2/beginelement/)(Element, RectangleF) | ノードのレンダリングを開始します。 |
| virtual [BeginPage](../../aspose.svg.rendering/device-2/beginpage/)(SizeF) | 新しいページのレンダリングを開始します。 |
| abstract [Clip](../../aspose.svg.rendering/device-2/clip/)(FillMode) | FillMode ルールを使用して塗りつぶす領域を決定し、現在のクリッピング パスを現在のパスと交差させて変更します。 このメソッドは、現在のパスを終了します。 |
| abstract [ClosePath](../../aspose.svg.rendering/device-2/closepath/)() | 現在のポイントからサブパスの開始点までの直線セグメントを追加することにより、現在のサブパスを閉じます。 現在のサブパスが既に閉じられている場合、"ClosePath" は何もしません。 この演算子は現在のサブパスを終了します。現在のパスに別のセグメントを追加すると、新しいサブパス が開始されますが、新しいセグメントが「ClosePath」メソッドによって到達したエンドポイントで開始される場合でも. |
| abstract [CubicBezierTo](../../aspose.svg.rendering/device-2/cubicbezierto/)(PointF, PointF, PointF) | 3 次ベジエ曲線を現在のパスに追加します。曲線は、ベジエ制御点として pt1 と pt2 を使用して、現在の点から点 pt2, まで延長されます。新しい現在のポイントは pt3. です |
| [Dispose](../../aspose.svg.rendering/device-2/dispose/)() | アンマネージ リソースの解放、解放、またはリセットに関連するアプリケーション定義のタスクを実行します。 |
| abstract [DrawImage](../../aspose.svg.rendering/device-2/drawimage/)(byte[], ImageType, RectangleF) | 指定した画像を描画します。 |
| virtual [EndDocument](../../aspose.svg.rendering/device-2/enddocument/)() | ドキュメントのレンダリングを終了します。 |
| abstract [EndElement](../../aspose.svg.rendering/device-2/endelement/)(Element) | ノードのレンダリングを終了します。 |
| virtual [EndPage](../../aspose.svg.rendering/device-2/endpage/)() | 現在のページのレンダリングを終了します。 |
| abstract [Fill](../../aspose.svg.rendering/device-2/fill/)(FillMode) | 現在のパスで囲まれた領域全体を塗りつぶします。 パスがいくつかの切断されたサブパスで構成されている場合、 をまとめて考慮して、すべてのサブパスの内部を埋めます。 このメソッドは、現在のパスを終了します。 |
| abstract [FillText](../../aspose.svg.rendering/device-2/filltext/)(string, PointF) | 指定した位置に指定したテキスト文字列を入力します。 |
| virtual [Flush](../../aspose.svg.rendering/device-2/flush/)() | すべてのデータを出力ストリームにフラッシュします。 |
| abstract [LineTo](../../aspose.svg.rendering/device-2/lineto/)(PointF) | 現在の点から点 (pt) までの直線セグメントを追加します。新しい現在のポイントは pt. です |
| abstract [MoveTo](../../aspose.svg.rendering/device-2/moveto/)(PointF) | 現在の点をパラメーター pt の座標に移動し、接続する線分を省略して、新しいサブパスを開始します。 現在のパスの以前のパス構築方法も「MoveTo」だった場合、新しい「MoveTo」がそれをオーバーライドします。 前の「MoveTo」操作の痕跡がパスに残っていません. |
| virtual [RestoreGraphicContext](../../aspose.svg.rendering/device-2/restoregraphiccontext/)() | スタックからポップすることにより、グラフィック コンテキスト全体を以前の値に復元します。 |
| virtual [SaveGraphicContext](../../aspose.svg.rendering/device-2/savegraphiccontext/)() | グラフィックス コンテキスト全体のコピーをスタックにプッシュします。 |
| abstract [Stroke](../../aspose.svg.rendering/device-2/stroke/)() | 現在のパスに沿って線を引きます。ストローク ラインは、パス内の各直線または曲線のセグメントに従います。 はセグメントの中心にあり、辺はそれに平行です。パスの各サブパスは個別に扱われます。 このメソッドは、現在のパスを終了します。 |
| abstract [StrokeAndFill](../../aspose.svg.rendering/device-2/strokeandfill/)(FillMode) | 現在のパスをストロークして塗りつぶします。 このメソッドは現在のパスを終了します。 |
| abstract [StrokeText](../../aspose.svg.rendering/device-2/stroketext/)(string, PointF) | 指定された位置で指定されたテキスト文字列をストロークします。 |

## その他のメンバー

| 名前 | 説明 |
| --- | --- |
| class [DeviceConfiguration&lt;TGraphicContext,TRenderingOptions&gt;](device-2.deviceconfiguration-2/) | デバイスの構成オブジェクトを表します。 |
| enum [PageWritingStrategy&lt;TGraphicContext,TRenderingOptions&gt;](device-2.pagewritingstrategy-2/) | 出力 stream\streams にページを書き込む方法のタイプを指定します。 |

### 関連項目

* class [Device](../device/)
* interface [IDevice](../idevice/)
* class [GraphicContext](../graphiccontext/)
* class [RenderingOptions](../renderingoptions/)
* 名前空間 [Aspose.Svg.Rendering](../../aspose.svg.rendering/)
* 組み立て [Aspose.SVG](../../)


