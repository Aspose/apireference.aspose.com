---
title: Class PsDocument
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.EPS.PsDocument クラス. このクラスはPS/EPS ドキュメントをカプセル化します
type: docs
weight: 140
url: /ja/net/aspose.page.eps/psdocument/
---
## PsDocument class

このクラスは、PS/EPS ドキュメントをカプセル化します。

```csharp
public sealed class PsDocument : Document
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [PsDocument](psdocument/#constructor)(Stream) | 初期化`PsDocument`PS/EPS ファイルのストリーム付き. |
| [PsDocument](psdocument/#constructor_1)(Stream, PsSaveOptions) | 空の初期化`PsDocument`初期化されたページで. |
| [PsDocument](psdocument/#constructor_2)(Stream, PsSaveOptions, bool) | 空の初期化`PsDocument`. |
| [PsDocument](psdocument/#constructor_3)(Stream, PsSaveOptions, int) | 空の初期化`PsDocument` Postscript ドキュメントのページ数が事前にわかっている場合. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [NumberOfPages](../../aspose.page.eps/psdocument/numberofpages/) { get; } | 結果の PDF ドキュメントのページ数を返します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Clip](../../aspose.page.eps/psdocument/clip/)(GraphicsPath) | クリップを現在のグラフィック状態に追加します。 |
| [ClipAndNewPath](../../aspose.page.eps/psdocument/clipandnewpath/)(GraphicsPath) | クリップを現在のグラフィックス状態に追加し、「newpath」演算子を書き込みます。このクリッピング パスと、「charpath」演算子でアウトライン化されたグリフなどの後続パスの合流点をエスケープ する必要があります。 |
| [ClipRectangle](../../aspose.page.eps/psdocument/cliprectangle/)(RectangleF) | クリッピング四角形を現在のグラフィックス状態に追加します。 |
| [ClipText](../../aspose.page.eps/psdocument/cliptext/)(string, Font, float, float) |  |
| [ClosePage](../../aspose.page.eps/psdocument/closepage/)() | 現在のページを完了します。 |
| [Draw](../../aspose.page.eps/psdocument/draw/)(GraphicsPath) | 任意のパスを描画します。 |
| [DrawExplicitImageMask](../../aspose.page.eps/psdocument/drawexplicitimagemask/)(Bitmap, Bitmap, Matrix) | マスクされた画像を描画します。 |
| [DrawImage](../../aspose.page.eps/psdocument/drawimage/#drawimage)(Bitmap) | 画像を描画します。 |
| [DrawImage](../../aspose.page.eps/psdocument/drawimage/#drawimage_1)(Bitmap, Matrix, Color) | 変換された画像を背景付きで描画します。 |
| [DrawTransparentImage](../../aspose.page.eps/psdocument/drawtransparentimage/)(Bitmap, Matrix, int) | 変換された透明な画像を描画します。画像にアルファ チャネルがない場合、不透明な image として描画されます |
| [Fill](../../aspose.page.eps/psdocument/fill/)(GraphicsPath) | 任意のパスを入力します。 |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext)(string, DrFont, float, float, Brush, Pen) | グリフの内部を塗りつぶし、グリフの輪郭を描くことにより、テキスト文字列を追加します。 |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext_3)(string, Font, float, float, Brush, Pen) | グリフの内部を塗りつぶし、グリフの輪郭を描くことにより、テキスト文字列を追加します。 |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext_1)(string, float[], DrFont, float, float, Brush, Pen) | グリフの内部を塗りつぶし、グリフの輪郭を描くことにより、テキスト文字列を追加します。 |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext_2)(string, float[], Font, float, float, Brush, Pen) | グリフの内部を塗りつぶし、グリフの輪郭を描くことにより、テキスト文字列を追加します。 |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext)(string, DrFont, float, float) | グリフの内部を埋めることによってテキスト文字列を追加します. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_6)(string, Font, float, float) | グリフの内部を埋めることによってテキスト文字列を追加します. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_1)(string, DrFont, float, float, Brush) | グリフの内部を埋めることによってテキスト文字列を追加します. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_2)(string, float[], DrFont, float, float) | グリフの内部を埋めることによってテキスト文字列を追加します. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_4)(string, float[], Font, float, float) | グリフの内部を埋めることによってテキスト文字列を追加します. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_7)(string, Font, float, float, Brush) | グリフの内部を埋めることによってテキスト文字列を追加します. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_3)(string, float[], DrFont, float, float, Brush) | グリフの内部を埋めることによってテキスト文字列を追加します. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_5)(string, float[], Font, float, float, Brush) | グリフの内部を埋めることによってテキスト文字列を追加します. |
| [GetPaint](../../aspose.page.eps/psdocument/getpaint/)() | 現在のグラフィックス状態のペイントを取得します。 |
| [GetStroke](../../aspose.page.eps/psdocument/getstroke/)() | 現在のグラフィック状態のストロークを取得します. |
| [GetXmpMetadata](../../aspose.page.eps/psdocument/getxmpmetadata/)() | PS/EPS ファイルを読み取り、XmpMetdata が既に存在する場合は抽出し、存在しない場合は新しいものを追加します。 |
| [Merge](../../aspose.page.eps/psdocument/merge/)(string[], Device, SaveOptions) | PS/EPS ファイルをデバイスにマージします。 |
| [OpenPage](../../aspose.page.eps/psdocument/openpage/#openpage_1)(string) | ドキュメントのサイズで新しいページを作成し、現在のページにします。 |
| [OpenPage](../../aspose.page.eps/psdocument/openpage/#openpage)(float, float) | 新しいページを作成し、現在のページにします。 |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext)(string, DrFont, float, float) | グリフの輪郭を描画してテキスト文字列を追加します。 |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_6)(string, Font, float, float) | グリフの輪郭を描画してテキスト文字列を追加します。 |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_1)(string, DrFont, float, float, Pen) | グリフの輪郭を描画してテキスト文字列を追加します。 |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_2)(string, float[], DrFont, float, float) | グリフの輪郭を描画してテキスト文字列を追加します。 |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_4)(string, float[], Font, float, float) | グリフの輪郭を描画してテキスト文字列を追加します。 |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_7)(string, Font, float, float, Pen) | グリフの輪郭を描画してテキスト文字列を追加します。 |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_3)(string, float[], DrFont, float, float, Pen) | グリフの輪郭を描画してテキスト文字列を追加します。 |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_5)(string, float[], Font, float, float, Pen) | グリフの輪郭を描画してテキスト文字列を追加します。 |
| [Rotate](../../aspose.page.eps/psdocument/rotate/#rotate_1)(float) | 原点を中心に反時計回りの回転を現在のグラフィックス状態に追加します (現在の行列を回転させます). |
| [Rotate](../../aspose.page.eps/psdocument/rotate/#rotate)(int) | 原点を中心に反時計回りの回転を現在のグラフィックス状態に追加します (現在の行列を回転させます). |
| [Save](../../aspose.page.eps/psdocument/save/#save)() | 保存数`PsDocument`EPSファイルとして。このメソッドは、PsDocument がゼロから作成された場合にのみ使用されます。 |
| [Save](../../aspose.page.eps/psdocument/save/#save_2)(Stream) | 保存数`PsDocument`EPSファイルとして。このメソッドは、XMP メタデータを更新した後にのみ使用されます。 GetMetadata メソッドの呼び出し中に作成された更新済みの既存のメタデータまたは新しいメタデータを含む最初の EPS ファイルを保存します。 最後のケースでは、必要なすべての PostScript コードと EPS コメントが追加されます。 |
| override [Save](../../aspose.page.eps/psdocument/save/#save_1)(Device, SaveOptions) | PS/EPS ファイルをデバイスに保存します。 |
| [Scale](../../aspose.page.eps/psdocument/scale/)(float, float) | 現在のグラフィックス状態にスケールを追加します (現在のマトリックスをスケーリングします). |
| [SetPageDevice](../../aspose.page.eps/psdocument/setpagedevice/)(Dictionary&lt;string, object&gt;) | ページ デバイス パラメータを設定します (演算子「setpagedevice」の PostScript 仕様を参照してください)。 これらの中には、ページ サイズや色などがあります。 |
| [SetPageSize](../../aspose.page.eps/psdocument/setpagesize/)(float, float) | ページ サイズを設定します。 1 つのドキュメントでサイズの異なるページを作成するには[`SetPageDevice`](./setpagedevice/)このメソッドの直後に メソッド. |
| [SetPaint](../../aspose.page.eps/psdocument/setpaint/)(Brush) | ペイントを現在のグラフィック状態に設定します。 |
| [SetStroke](../../aspose.page.eps/psdocument/setstroke/)(Pen) | 現在のグラフィック状態でストロークを設定します。 |
| [SetTransform](../../aspose.page.eps/psdocument/settransform/)(Matrix) | 現在の変換をこれに設定します。 |
| [Shear](../../aspose.page.eps/psdocument/shear/)(float, float) | 現在のグラフィックス状態にせん断変換を追加します (現在の行列をせん断します). |
| [Transform](../../aspose.page.eps/psdocument/transform/)(Matrix) | 現在のグラフィックス状態に変換を追加します (このマトリックスを現在のマトリックスと連結します). |
| [Translate](../../aspose.page.eps/psdocument/translate/)(float, float) | 現在のグラフィックス状態に変換を追加します (現在のマトリックスを変換します). |
| [WriteGraphicsRestore](../../aspose.page.eps/psdocument/writegraphicsrestore/)() | 現在のグラフィックス状態の復元を書き込みます (演算子「grestore」の PostScript 仕様を参照してください)。 |
| [WriteGraphicsSave](../../aspose.page.eps/psdocument/writegraphicssave/)() | 現在のグラフィック状態の保存を書き込みます (オペレーター「gsave」の PostScript 仕様を参照)。 |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps)(Bitmap, Stream, PsSaveOptions) | ビットマップ オブジェクトを EPS 出力ストリームに保存します。 |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_1)(Bitmap, string, PsSaveOptions) | Bitmap オブジェクトを EPS ファイルに保存します。 |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_2)(Stream, Stream, PsSaveOptions) | PNG/JPEG/TIFF/BMP/GIF/EMF 画像を入力ストリームから EPS 出力ストリームに保存します。 |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_3)(string, string, PsSaveOptions) | PNG/JPEG/TIFF/BMP/GIF/EMF 画像をファイルから EPS ファイルに保存します。 |

### 関連項目

* class [Document](../../aspose.page/document/)
* 名前空間 [Aspose.Page.EPS](../../aspose.page.eps/)
* 組み立て [Aspose.Page](../../)


