---
title: Class ImageRenderingOptions
second_title: Aspose.SVG for .NET API リファレンス
description: Aspose.Svg.Rendering.Image.ImageRenderingOptions クラス. のレンダリング オプションを表しますImageDevice.このオプションは出力画像フォーマット圧縮解像度などを指定するために使用されます.
type: docs
weight: 2860
url: /ja/net/aspose.svg.rendering.image/imagerenderingoptions/
---
## ImageRenderingOptions class

のレンダリング オプションを表します[`ImageDevice`](../imagedevice/).このオプションは、出力画像フォーマット、圧縮、解像度などを指定するために使用されます.

```csharp
public class ImageRenderingOptions : RenderingOptions
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [ImageRenderingOptions](imagerenderingoptions/#constructor)() | の新しいインスタンスを初期化します`ImageRenderingOptions`クラス;Pngデフォルトの画像フォーマットとして使用されます. |
| [ImageRenderingOptions](imagerenderingoptions/#constructor_1)(ImageFormat) | の新しいインスタンスを初期化します`ImageRenderingOptions`指定された画像形式のクラス. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [BackgroundColor](../../aspose.svg.rendering/renderingoptions/backgroundcolor/) { get; set; } | 取得または設定Colorすべてのページの背景を塗りつぶします。デフォルト値はTransparent . |
| [Compression](../../aspose.svg.rendering.image/imagerenderingoptions/compression/) { get; set; } | タグ付き画像ファイル形式 (TIFF) を設定または取得します[`Compression`](../compression/).デフォルトでは、このプロパティはLZW . |
| [Css](../../aspose.svg.rendering/renderingoptions/css/) { get; } | を取得します[`CssOptions`](../../aspose.svg.rendering/cssoptions/) css プロパティ処理の構成に使用されるオブジェクト. |
| [Format](../../aspose.svg.rendering.image/imagerenderingoptions/format/) { get; set; } | 設定または取得[`ImageFormat`](../imageformat/).デフォルトでは、このプロパティはPng . |
| override [HorizontalResolution](../../aspose.svg.rendering.image/imagerenderingoptions/horizontalresolution/) { get; set; } | 出力および内部 (フィルター処理中に使用される) 画像の水平解像度を、1 インチあたりのピクセル数で設定または取得します。デフォルトでは、このプロパティは 300 dpi. です。 |
| [PageSetup](../../aspose.svg.rendering/renderingoptions/pagesetup/) { get; } | 設定出力ページ セットに使用されるページ設定オブジェクトを取得します。 |
| [SmoothingMode](../../aspose.svg.rendering.image/imagerenderingoptions/smoothingmode/) { get; set; } | この Graphics のレンダリング品質を取得または設定します。 |
| [Text](../../aspose.svg.rendering.image/imagerenderingoptions/text/) { get; } | を取得します[`TextOptions`](../textoptions/)テキストレンダリングの設定に使用されるオブジェクト. |
| override [VerticalResolution](../../aspose.svg.rendering.image/imagerenderingoptions/verticalresolution/) { get; set; } | 出力および内部 (フィルター処理中に使用される) イメージの垂直解像度を、1 インチあたりのピクセル数で設定または取得します。デフォルトでは、このプロパティは 300 dpi. です。 |

### 関連項目

* class [RenderingOptions](../../aspose.svg.rendering/renderingoptions/)
* 名前空間 [Aspose.Svg.Rendering.Image](../../aspose.svg.rendering.image/)
* 組み立て [Aspose.SVG](../../)


