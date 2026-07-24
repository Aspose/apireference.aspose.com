---
title: "PsDocument"
second_title: "Aspose.Page for Java API リファレンス"
description: "このクラスは PS/EPS ドキュメントをカプセル化します。"
type: docs
weight: 16
url: /ja/java/com.aspose.eps/psdocument/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Document](../../com.aspose.page/document)
```
public final class PsDocument extends Document
```

このクラスは PS/EPS ドキュメントをカプセル化します。
## コンストラクタ

| コンストラクタ | 説明 |
| --- | --- |
| [PsDocument()](#PsDocument--) | 空の  PsDocument  を初期化されたページで初期化します。 |
| [PsDocument(String outPsFilePath, PsSaveOptions options)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | 空の  PsDocument  を初期化されたページで初期化します。 |
| [PsDocument(OutputStream psStream, PsSaveOptions options)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | 空の  PsDocument  を初期化されたページで初期化します。 |
| [PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-boolean-) | 空の  PsDocument  を初期化します。 |
| [PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-boolean-) | 空の  PsDocument  を初期化します。 |
| [PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-int-) | 事前にPostscriptドキュメントページ数が分かっている場合、空の  PsDocument  を初期化します。 |
| [PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-int-) | 事前にPostscriptドキュメントページ数が分かっている場合、空の  PsDocument  を初期化します。 |
| [PsDocument(String psFilePath)](#PsDocument-java.lang.String-) | 入力PS/EPSファイルで  PsDocument  を初期化します。 |
| [PsDocument(InputStream psStream)](#PsDocument-java.io.InputStream-) | PS/EPSファイルのストリームで  PsDocument  を初期化します。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [clip(Shape s)](#clip-java.awt.Shape-) | 現在のグラフィックス状態にクリップを追加します。 |
| [clipAndNewPath(Shape s)](#clipAndNewPath-java.awt.Shape-) | 現在のグラフィックス状態にクリップを追加し、次に \"newpath\" 演算子を書き込みます。 |
| [clipRectangle(Rectangle2D.Float rect)](#clipRectangle-java.awt.geom.Rectangle2D.Float-) | 現在のグラフィックス状態にクリッピング矩形を追加します。 |
| [clipText(String text, Font font, float x, float y)](#clipText-java.lang.String-java.awt.Font-float-float-) | 指定されたフォントの指定テキストのアウトラインからクリップを追加します。 |
| [closePage()](#closePage--) | 現在のページを完了します。 |
| [convertType1FontToTTF(String type1FontFilePath, String outputDir)](#convertType1FontToTTF-java.lang.String-java.lang.String-) | Type 1 フントを TrueType に変換します。 |
| [convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream)](#convertType3FontToTTF-java.lang.String-java.io.OutputStream-) | Type 3 フントを TrueType に変換します。 |
| [convertType3FontToTTF(String type3FontFilePath, String outputDir)](#convertType3FontToTTF-java.lang.String-java.lang.String-) | Type 3 フントを TrueType に変換します。 |
| [cropEps(OutputStream epsStream, float[] cropBox)](#cropEps-java.io.OutputStream-float---) | 指定された  PsDocument  を EPS ファイルとしてトリミングします。 |
| [draw(Shape shape)](#draw-java.awt.Shape-) | 任意のパスを描画します。 |
| [drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform)](#drawExplicitImageMask-java.awt.image.BufferedImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-) | マスクされた画像を描画します。 |
| [drawImage(BufferedImage image)](#drawImage-java.awt.image.BufferedImage-) | 画像を描画します。 |
| [drawImage(BufferedImage image, AffineTransform transform, Color bkg)](#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-) | 背景付きで変換された画像を描画します。 |
| [drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold)](#drawTransparentImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-int-) | 背景付きで変換された透明画像を描画します。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [extractEpsBoundingBox()](#extractEpsBoundingBox--) | EPS ファイルを読み取り、%%BoundingBox コメントから EPS 画像のバウンディングボックスを抽出します。存在しない場合はデフォルトページサイズ (0, 0, 595, 842) の境界を使用します。 |
| [extractEpsSize()](#extractEpsSize--) | EPS ファイルを読み取り、%%BoundingBox コメントから EPS 画像のサイズを抽出します。存在しない場合はデフォルトページサイズ (595, 842) を使用します。 |
| [extractText(SaveOptions options, int startPage, int endPage)](#extractText-com.aspose.page.SaveOptions-int-int-) | PS ファイルからテキストを抽出します。 |
| [fill(Shape shape)](#fill-java.awt.Shape-) | 任意のパスを塗りつぶす。 |
| [fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | グリフの内部を塗りつぶし、グリフの輪郭を描画してテキスト文字列を追加します。 |
| [fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | グリフの内部を塗りつぶし、グリフの輪郭を描画してテキスト文字列を追加します。 |
| [fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | グリフの内部を塗りつぶし、グリフの輪郭を描画してテキスト文字列を追加します。 |
| [fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | グリフの内部を塗りつぶし、グリフの輪郭を描画してテキスト文字列を追加します。 |
| [fillText(String text, DrFont drFont, float x, float y)](#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-) | グリフの内部を塗りつぶしてテキスト文字列を追加します。 |
| [fillText(String text, DrFont drFont, float x, float y, Paint fill)](#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-) | グリフの内部を塗りつぶしてテキスト文字列を追加します。 |
| [fillText(String text, float[] advances, DrFont drFont, float x, float y)](#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-) | グリフの内部を塗りつぶしてテキスト文字列を追加します。 |
| [fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill)](#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-) | グリフの内部を塗りつぶしてテキスト文字列を追加します。 |
| [fillText(String text, float[] advances, Font font, float x, float y)](#fillText-java.lang.String-float---java.awt.Font-float-float-) | グリフの内部を塗りつぶしてテキスト文字列を追加します。 |
| [fillText(String text, float[] advances, Font font, float x, float y, Paint fill)](#fillText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-) | グリフの内部を塗りつぶしてテキスト文字列を追加します。 |
| [fillText(String text, Font font, float x, float y)](#fillText-java.lang.String-java.awt.Font-float-float-) | グリフの内部を塗りつぶしてテキスト文字列を追加します。 |
| [fillText(String text, Font font, float x, float y, Paint fill)](#fillText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-) | グリフの内部を塗りつぶしてテキスト文字列を追加します。 |
| [getClass()](#getClass--) |  |
| [getInputStream()](#getInputStream--) |  |
| [getNumberOfPages()](#getNumberOfPages--) | 結果の PDF ドキュメントのページ数を取得します。 |
| [getPaint()](#getPaint--) | 現在のグラフィックス状態のペイントを取得します。 |
| [getStroke()](#getStroke--) | 現在のグラフィックス状態のストロークを取得します。 |
| [getXmpMetadata()](#getXmpMetadata--) | PS/EPS ファイルを読み取り、XMP メタデータが既に存在すれば抽出し、存在しなければ新しく追加します。 |
| [hashCode()](#hashCode--) |  |
| [isLicensed()](#isLicensed--) | Aspose.Page for Java 製品ライセンスがアクセスされ、有効かどうかを示します。 |
| [merge(String[] filesForMerge, Device device, SaveOptions options)](#merge-java.lang.String---com.aspose.page.Device-com.aspose.page.SaveOptions-) | PS/EPS ファイルをデバイスにマージします。 |
| [mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options)](#mergeToPdf-java.io.OutputStream-java.lang.String---com.aspose.page.SaveOptions-) | PS/EPS ファイルをデバイスにマージします。 |
| [mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options)](#mergeToPdf-java.lang.String-java.lang.String---com.aspose.page.SaveOptions-) | PS/EPS ファイルをデバイスにマージします。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [openPage(float width, float height)](#openPage-float-float-) | 新しいページを作成し、現在のページに設定します。 |
| [openPage(String pageName)](#openPage-java.lang.String-) | ドキュメントのサイズで新しいページを作成し、現在のページに設定します。 |
| [outlineText(String text, DrFont drFont, float x, float y)](#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-) | グリフの輪郭を描画してテキスト文字列を追加します。 |
| [outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-) | グリフの輪郭を描画してテキスト文字列を追加します。 |
| [outlineText(String text, float[] advances, DrFont drFont, float x, float y)](#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-) | グリフの輪郭を描画してテキスト文字列を追加します。 |
| [outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-) | グリフの輪郭を描画してテキスト文字列を追加します。 |
| [outlineText(String text, float[] advances, Font font, float x, float y)](#outlineText-java.lang.String-float---java.awt.Font-float-float-) | グリフの輪郭を描画してテキスト文字列を追加します。 |
| [outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-) | グリフの輪郭を描画してテキスト文字列を追加します。 |
| [outlineText(String text, Font font, float x, float y)](#outlineText-java.lang.String-java.awt.Font-float-float-) | グリフの輪郭を描画してテキスト文字列を追加します。 |
| [outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-) | グリフの輪郭を描画してテキスト文字列を追加します。 |
| [resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units)](#resizeEps-java.io.OutputStream-com.aspose.page.DimensionF-com.aspose.page.Units-) | 指定された PsDocument を EPS ファイルとしてサイズ変更します。 |
| [rotate(float angleRadians)](#rotate-float-) | 原点を中心に反時計回りの回転を現在のグラフィックス状態に追加します（現在の行列を回転）。 |
| [rotate(int angleDegrees)](#rotate-int-) | 原点を中心に反時計回りの回転を現在のグラフィックス状態に追加します（現在の行列を回転）。 |
| [save()](#save--) | 指定された PsDocument を PS または EPS ファイルとして保存します。 |
| [save(Device device, SaveOptions options)](#save-com.aspose.page.Device-com.aspose.page.SaveOptions-) | PS/EPS ファイルをデバイスに保存します。 |
| [save(OutputStream epsStream)](#save-java.io.OutputStream-) | 指定された PsDocument をストリームに保存します。 |
| [save(String outEpsFilePath)](#save-java.lang.String-) | 指定された PsDocument を EPS ファイルとして保存します。 |
| [saveAsImage(ImageSaveOptions options)](#saveAsImage-com.aspose.eps.device.ImageSaveOptions-) | PS/EPS ファイルを画像ファイルに保存します。 |
| [saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)](#saveAsImage-com.aspose.eps.device.ImageSaveOptions-java.lang.String-java.lang.String-) | PS/EPS ファイルを指定されたディレクトリの指定されたファイル名で画像ファイルに保存します。 |
| [saveAsImagesBytes(ImageSaveOptions options)](#saveAsImagesBytes-com.aspose.eps.device.ImageSaveOptions-) | PS/EPS ファイルを画像のバイト配列に保存します。 |
| [saveAsPdf(OutputStream pdfStream, PdfSaveOptions options)](#saveAsPdf-java.io.OutputStream-com.aspose.eps.device.PdfSaveOptions-) | PS/EPS ファイルを出力 PDF ストリームに保存します。 |
| [saveAsPdf(String outPdfFilePath, PdfSaveOptions options)](#saveAsPdf-java.lang.String-com.aspose.eps.device.PdfSaveOptions-) | PS/EPS ファイルを PDF ファイルに保存します。 |
| [saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options)](#saveImageAsEps-java.awt.image.BufferedImage-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | BufferedImage オブジェクトを EPS ファイルに保存します。 |
| [saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options)](#saveImageAsEps-java.awt.image.BufferedImage-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | BufferedImage オブジェクトを EPS ファイルに保存します。 |
| [saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options)](#saveImageAsEps-java.io.InputStream-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | 入力ストリームから PNG/JPEG/BMP/GIF 画像を EPS 出力ストリームに保存します。 |
| [saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options)](#saveImageAsEps-java.lang.String-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | ファイルから PNG/JPEG/BMP/GIF 画像を EPS ファイルに保存します。 |
| [scale(float xScale, float yScale)](#scale-float-float-) | 現在のグラフィックス状態にスケールを追加します（現在の行列をスケール）。 |
| [setInputStream(InputStream is)](#setInputStream-java.io.InputStream-) | 入力ストリームを指定します。 |
| [setPageDevice(Map<String,Object> pageParams)](#setPageDevice-java.util.Map-java.lang.String-java.lang.Object--) | ページデバイスパラメータを設定します（演算子 "setpagedevice" の PostScript 仕様を参照）。 |
| [setPageSize(float width, float height)](#setPageSize-float-float-) | ページサイズを設定します。 |
| [setPaint(Paint paint)](#setPaint-java.awt.Paint-) | 現在のグラフィックス状態の塗りを設定します。 |
| [setStroke(Stroke stroke)](#setStroke-java.awt.Stroke-) | 現在のグラフィックス状態のストロークを設定します。 |
| [setTransform(AffineTransform matrix)](#setTransform-java.awt.geom.AffineTransform-) | 現在の変換をこれに設定します。 |
| [shear(float shx, float shy)](#shear-float-float-) | 現在のグラフィックス状態にせん断変換を追加します（現在の行列をせん断）。 |
| [toString()](#toString--) |  |
| [transform(AffineTransform matrix)](#transform-java.awt.geom.AffineTransform-) | 現在のグラフィックス状態に変換を追加します（この行列を現在の行列と連結）。 |
| [translate(float x, float y)](#translate-float-float-) | 現在のグラフィックス状態に平行移動を追加します（現在の行列を平行移動）。 |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
| [writeGraphicsRestore()](#writeGraphicsRestore--) | 現在のグラフィックス状態の復元を書き込みます（演算子 "grestore" の PostScript 仕様を参照）。 |
| [writeGraphicsSave()](#writeGraphicsSave--) | 現在のグラフィックス状態の保存を書き込みます（演算子 "gsave" の PostScript 仕様を参照）。 |
### PsDocument() {#PsDocument--}
```
public PsDocument()
```


空の PsDocument を初期化されたページとともに初期化します。このコンストラクタは、PostScript ファイルに関連しない追加操作（例：フォント変換）のみで使用されます。

### PsDocument(String outPsFilePath, PsSaveOptions options) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options)
```


空の  PsDocument  を初期化されたページで初期化します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| outPsFilePath | java.lang.String | 出力 PS/EPS ファイルのパスです。 |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | PostScript ファイルの保存を制御するパラメータのセットです。 |

### PsDocument(OutputStream psStream, PsSaveOptions options) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options)
```


空の  PsDocument  を初期化されたページで初期化します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| psStream | java.io.OutputStream | PS/EPS ファイルを保存するストリームです。 |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | PostScript ファイルの保存を制御するパラメータのセットです。 |

### PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-boolean-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged)
```


空の  PsDocument  を初期化します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| outPsFilePath | java.lang.String | 出力 PS/EPS ファイルのパスです。 |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | PostScript ファイルの保存を制御するパラメータのセットです。 |
| multipaged | boolean | false の場合、ページは初期化されません。この場合、ページの初期化は明示的な "openPage(width, height)" 呼び出しで実行する必要があります。 |

### PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-boolean-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged)
```


空の  PsDocument  を初期化します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| psStream | java.io.OutputStream | PS/EPS ファイルを保存するストリームです。 |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | PostScript ファイルの保存を制御するパラメータのセットです。 |
| multipaged | boolean | false の場合、ページは初期化されません。この場合、ページの初期化は明示的な "openPage(width, height)" 呼び出しで実行する必要があります。 |

### PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-int-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages)
```


事前にPostscriptドキュメントページ数が分かっている場合、空の  PsDocument  を初期化します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| outPsFilePath | java.lang.String | 出力 PS/EPS ファイルのパスです。 |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | PostScript ファイルの保存を制御するパラメータのセットです。 |
| numberOfPages | int | PostScript ドキュメントのページ数です。 |

### PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-int-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages)
```


事前にPostscriptドキュメントページ数が分かっている場合、空の  PsDocument  を初期化します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| psStream | java.io.OutputStream | PS/EPS ファイルを保存するストリームです。 |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | PostScript ファイルの保存を制御するパラメータのセットです。 |
| numberOfPages | int | PostScript ドキュメントのページ数です。 |

### PsDocument(String psFilePath) {#PsDocument-java.lang.String-}
```
public PsDocument(String psFilePath)
```


入力PS/EPSファイルで  PsDocument  を初期化します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| psFilePath | java.lang.String | PS/EPS ファイルのパスです。 |

### PsDocument(InputStream psStream) {#PsDocument-java.io.InputStream-}
```
public PsDocument(InputStream psStream)
```


PS/EPSファイルのストリームで  PsDocument  を初期化します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| psStream | java.io.InputStream | PS/EPS ファイルのストリームです。 |

### clip(Shape s) {#clip-java.awt.Shape-}
```
public void clip(Shape s)
```


現在のグラフィックス状態にクリップを追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| s | java.awt.Shape | クリッピングパス。 |

### clipAndNewPath(Shape s) {#clipAndNewPath-java.awt.Shape-}
```
public void clipAndNewPath(Shape s)
```


現在のグラフィックス状態にクリップを追加し、次に "newpath" 演算子を書き込みます。このクリッピングパスと、"charpath" 演算子でアウトライン化されたグリフなどの後続パスとの合流を回避するために必要です。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| s | java.awt.Shape | クリッピングパス。 |

### clipRectangle(Rectangle2D.Float rect) {#clipRectangle-java.awt.geom.Rectangle2D.Float-}
```
public void clipRectangle(Rectangle2D.Float rect)
```


現在のグラフィックス状態にクリッピング矩形を追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| rect | java.awt.geom.Rectangle2D.Float | クリッピング矩形。 |

### clipText(String text, Font font, float x, float y) {#clipText-java.lang.String-java.awt.Font-float-float-}
```
public void clipText(String text, Font font, float x, float y)
```


指定されたフォントの指定テキストのアウトラインからクリップを追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| text | java.lang.String | テキスト。 |
| font | java.awt.Font | フォント。 |
| x | float | テキスト位置の X 座標。 |
| y | float |  |

### closePage() {#closePage--}
```
public void closePage()
```


現在のページを完了します。

### convertType1FontToTTF(String type1FontFilePath, String outputDir) {#convertType1FontToTTF-java.lang.String-java.lang.String-}
```
public void convertType1FontToTTF(String type1FontFilePath, String outputDir)
```


Type 1 フォントを TrueType に変換します。変換された TTF フォントファイルの名前は、入力の Type 1 フォントと同じで、拡張子は ".ttf" になります。TTF ファイルは割り当てられた出力ディレクトリに保存されます。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| type1FontFilePath | java.lang.String | Type 1 フォントファイルのパス.. |
| outputDir | java.lang.String | 生成された TrueType フォントを保存する出力ディレクトリ。 |

### convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream) {#convertType3FontToTTF-java.lang.String-java.io.OutputStream-}
```
public void convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream)
```


Type 3 フォントを TrueType に変換します。TTF ファイルは指定された出力ストリームに保存されます。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| type3FontFilePath | java.lang.String | Type 3 フォントファイルのパス。 |
| outputStream | java.io.OutputStream | 生成された TrueType フォントを保存する出力ストリーム。 |

### convertType3FontToTTF(String type3FontFilePath, String outputDir) {#convertType3FontToTTF-java.lang.String-java.lang.String-}
```
public void convertType3FontToTTF(String type3FontFilePath, String outputDir)
```


Type 3 フォントを TrueType に変換します。変換された TTF フォントファイルの名前は、入力の Type 3 フォントと同じで、拡張子は ".ttf" になります。TTF ファイルは割り当てられた出力ディレクトリに保存されます。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| type3FontFilePath | java.lang.String | Type 3 フォントファイルのパス.. |
| outputDir | java.lang.String | 生成された TrueType フォントを保存する出力ディレクトリ。 |

### cropEps(OutputStream epsStream, float[] cropBox) {#cropEps-java.io.OutputStream-float---}
```
public void cropEps(OutputStream epsStream, float[] cropBox)
```


指定された PsDocument を EPS ファイルとしてトリミングします。既存の %%BoundingBox を更新した初期 EPS ファイルを保存するか、または新しいものが作成されます。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| epsStream | java.io.OutputStream |  |
| cropBox | float[] | クロップボックス (x0, y0, x, y) です。 |

### draw(Shape shape) {#draw-java.awt.Shape-}
```
public void draw(Shape shape)
```


任意のパスを描画します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| shape | java.awt.Shape | 塗りつぶすパス。 |

### drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform) {#drawExplicitImageMask-java.awt.image.BufferedImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-}
```
public void drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform)
```


マスクされた画像を描画します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| image24bpp | java.awt.image.BufferedImage | 描画する画像です。24bpp RGB 画像形式である必要があります。 |
| alphaMask1bpp | java.awt.image.BufferedImage | 画像マスクです。1bpp 画像形式である必要があります。 |
| transform | java.awt.geom.AffineTransform | 画像を変換する行列です。 |

### drawImage(BufferedImage image) {#drawImage-java.awt.image.BufferedImage-}
```
public void drawImage(BufferedImage image)
```


画像を描画します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | 描画する画像です。 |

### drawImage(BufferedImage image, AffineTransform transform, Color bkg) {#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-}
```
public void drawImage(BufferedImage image, AffineTransform transform, Color bkg)
```


背景付きで変換された画像を描画します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | 描画する画像です。 |
| transform | java.awt.geom.AffineTransform | 画像を変換する行列です。 |
| bkg | java.awt.Color | 画像の背景です。 |

### drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold) {#drawTransparentImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-int-}
```
public void drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold)
```


背景付きで変換された透過画像を描画します。画像にアルファチャンネルがない場合は不透明画像として描画されます。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | 描画する画像です。 |
| transform | java.awt.geom.AffineTransform | 画像を変換する行列です。 |
| transparencyThreshold | int | 透過度ピクセルが完全に透過と解釈される閾値を定義するしきい値です。この閾値未満のすべての値は完全に不透明と解釈されます。 |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### extractEpsBoundingBox() {#extractEpsBoundingBox--}
```
public int[] extractEpsBoundingBox()
```


EPS ファイルを読み取り、%%BoundingBox コメントから EPS 画像のバウンディングボックスを抽出します。存在しない場合はデフォルトページサイズ (0, 0, 595, 842) の境界を使用します。

**Returns:**
int[] - EPS 画像のバウンディングボックスです。
### extractEpsSize() {#extractEpsSize--}
```
public Dimension extractEpsSize()
```


EPS ファイルを読み取り、%%BoundingBox コメントから EPS 画像のサイズを抽出します。存在しない場合はデフォルトページサイズ (595, 842) を使用します。

**Returns:**
java.awt.Dimension - EPS 画像のサイズです。
### extractText(SaveOptions options, int startPage, int endPage) {#extractText-com.aspose.page.SaveOptions-int-int-}
```
public String extractText(SaveOptions options, int startPage, int endPage)
```


PS ファイルからテキストを抽出します。TrueType フォント (Type 42) または TrueType フォントで構成された複合フォント (Type 0) で書かれたテキストに対してのみ機能します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | 保存オプションです。 |
| startPage | int | テキスト抽出を開始するページ（含む）です。 |
| endPage | int | テキストを抽出する対象ページ（含む）です。 |

**Returns:**
java.lang.String - 選択された PS ファイルのページに含まれるテキストです。
### fill(Shape shape) {#fill-java.awt.Shape-}
```
public void fill(Shape shape)
```


任意のパスを塗りつぶす。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| shape | java.awt.Shape | 塗りつぶすパス。 |

### fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


グリフの内部を塗りつぶし、グリフの輪郭を描画してテキスト文字列を追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| text | java.lang.String | 追加するテキストです。 |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont はテキスト描画に使用されます。カスタムフォルダーにあるカスタムフォントと併用できます。 |
| x | float | テキスト原点の X 座標です。 |
| y | float | テキスト原点の Y 座標です。 |
| fillPaint | java.awt.Paint | グリフ内部の塗りに使用される塗料です。 |
| strokePaint | java.awt.Paint | java.awt.Paint はグリフの輪郭塗装に使用されます。JDK の java.awt.Paint クラスの任意のサブクラスを使用できます。 |
| stroke | java.awt.Stroke | グリフ輪郭の描画に使用されるストロークです。 |

### fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


グリフの内部を塗りつぶし、グリフの輪郭を描画してテキスト文字列を追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| text | java.lang.String | 追加するテキストです。 |
| advances | float[] | グリフ幅の配列です。その長さは文字列中のグリフ数と一致する必要があります。 |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont はテキスト描画に使用されます。カスタムフォルダーにあるカスタムフォントと併用できます。 |
| x | float | テキスト原点の X 座標です。 |
| y | float | テキスト原点の Y 座標です。 |
| fillPaint | java.awt.Paint | グリフ内部の塗りに使用される塗料です。 |
| strokePaint | java.awt.Paint | java.awt.Paint はグリフの輪郭塗装に使用されます。JDK の java.awt.Paint クラスの任意のサブクラスを使用できます。 |
| stroke | java.awt.Stroke | グリフ輪郭の描画に使用されるストロークです。 |

### fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


グリフの内部を塗りつぶし、グリフの輪郭を描画してテキスト文字列を追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| text | java.lang.String | 追加するテキストです。advances はグリフ幅の配列で、その長さは文字列中のグリフ数と一致する必要があります。 |
| advances | float[] |  |
| font | java.awt.Font | テキスト描画に使用されるシステムフォントです。 |
| x | float | テキスト原点の X 座標です。 |
| y | float | テキスト原点の Y 座標です。 |
| fillPaint | java.awt.Paint | グリフ内部の塗りに使用される塗料です。 |
| strokePaint | java.awt.Paint | java.awt.Paint はグリフの輪郭塗装に使用されます。JDK の java.awt.Paint クラスの任意のサブクラスを使用できます。 |
| stroke | java.awt.Stroke | グリフ輪郭の描画に使用されるストロークです。 |

### fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


グリフの内部を塗りつぶし、グリフの輪郭を描画してテキスト文字列を追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| text | java.lang.String | 追加するテキストです。 |
| font | java.awt.Font | テキスト描画に使用されるシステムフォントです。 |
| x | float | テキスト原点の X 座標です。 |
| y | float | テキスト原点の Y 座標です。 |
| fillPaint | java.awt.Paint | グリフ内部の塗りに使用される塗料です。 |
| strokePaint | java.awt.Paint | java.awt.Paint はグリフの輪郭塗装に使用されます。JDK の java.awt.Paint クラスの任意のサブクラスを使用できます。 |
| stroke | java.awt.Stroke | グリフ輪郭の描画に使用されるストロークです。 |

### fillText(String text, DrFont drFont, float x, float y) {#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-}
```
public void fillText(String text, DrFont drFont, float x, float y)
```


グリフの内部を塗りつぶしてテキスト文字列を追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| text | java.lang.String | 追加するテキストです。 |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont はテキスト描画に使用されます。カスタムフォルダーにあるカスタムフォントと併用できます。 |
| x | float | テキスト原点の X 座標です。 |
| y | float | テキスト原点の Y 座標です。 |

### fillText(String text, DrFont drFont, float x, float y, Paint fill) {#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-}
```
public void fillText(String text, DrFont drFont, float x, float y, Paint fill)
```


グリフの内部を塗りつぶしてテキスト文字列を追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| text | java.lang.String | 追加するテキストです。 |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont はテキスト描画に使用されます。カスタムフォルダーにあるカスタムフォントと併用できます。 |
| x | float | テキスト原点の X 座標です。 |
| y | float | テキスト原点の Y 座標です。 |
| fill | java.awt.Paint | グリフの塗装に使用される塗りです。 |

### fillText(String text, float[] advances, DrFont drFont, float x, float y) {#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-}
```
public void fillText(String text, float[] advances, DrFont drFont, float x, float y)
```


グリフの内部を塗りつぶしてテキスト文字列を追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| text | java.lang.String | 追加するテキストです。 |
| advances | float[] | グリフ幅の配列です。その長さは文字列中のグリフ数と一致する必要があります。 |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont はテキスト描画に使用されます。カスタムフォルダーにあるカスタムフォントと併用できます。 |
| x | float | テキスト原点の X 座標です。 |
| y | float | テキスト原点の Y 座標です。 |

### fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill) {#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-}
```
public void fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill)
```


グリフの内部を塗りつぶしてテキスト文字列を追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| text | java.lang.String | 追加するテキストです。 |
| advances | float[] | グリフ幅の配列です。その長さは文字列中のグリフ数と一致する必要があります。 |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont はテキスト描画に使用されます。カスタムフォルダーにあるカスタムフォントと併用できます。 |
| x | float | テキスト原点の X 座標です。 |
| y | float | テキスト原点の Y 座標です。 |
| fill | java.awt.Paint | グリフの塗装に使用される塗りです。 |

### fillText(String text, float[] advances, Font font, float x, float y) {#fillText-java.lang.String-float---java.awt.Font-float-float-}
```
public void fillText(String text, float[] advances, Font font, float x, float y)
```


グリフの内部を塗りつぶしてテキスト文字列を追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| text | java.lang.String | 追加するテキストです。 |
| advances | float[] | グリフ幅の配列です。その長さは文字列中のグリフ数と一致する必要があります。 |
| font | java.awt.Font | テキスト描画に使用されるシステムフォントです。 |
| x | float | テキスト原点の X 座標です。 |
| y | float | テキスト原点の Y 座標です。 |

### fillText(String text, float[] advances, Font font, float x, float y, Paint fill) {#fillText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-}
```
public void fillText(String text, float[] advances, Font font, float x, float y, Paint fill)
```


グリフの内部を塗りつぶしてテキスト文字列を追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| text | java.lang.String | 追加するテキストです。 |
| advances | float[] | グリフ幅の配列です。その長さは文字列中のグリフ数と一致する必要があります。 |
| font | java.awt.Font | テキスト描画に使用されるフォントです。 |
| x | float | テキスト原点の X 座標です。 |
| y | float | テキスト原点の Y 座標です。 |
| fill | java.awt.Paint | グリフの塗装に使用される塗りです。 |

### fillText(String text, Font font, float x, float y) {#fillText-java.lang.String-java.awt.Font-float-float-}
```
public void fillText(String text, Font font, float x, float y)
```


グリフの内部を塗りつぶしてテキスト文字列を追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| text | java.lang.String | 追加するテキストです。 |
| font | java.awt.Font | テキスト描画に使用されるシステムフォントです。 |
| x | float | テキスト原点の X 座標です。 |
| y | float | テキスト原点の Y 座標です。 |

### fillText(String text, Font font, float x, float y, Paint fill) {#fillText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-}
```
public void fillText(String text, Font font, float x, float y, Paint fill)
```


グリフの内部を塗りつぶしてテキスト文字列を追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| text | java.lang.String | 追加するテキストです。 |
| font | java.awt.Font | テキスト描画に使用されるフォントです。 |
| x | float | テキスト原点の X 座標です。 |
| y | float | テキスト原点の Y 座標です。 |
| fill | java.awt.Paint | グリフの塗装に使用される塗りです。 |

### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getInputStream() {#getInputStream--}
```
public InputStream getInputStream()
```




**Returns:**
java.io.InputStream
### getNumberOfPages() {#getNumberOfPages--}
```
public int getNumberOfPages()
```


結果の PDF ドキュメントのページ数を取得します。

**Returns:**
int - ページ数です。
### getPaint() {#getPaint--}
```
public Paint getPaint()
```


現在のグラフィックス状態のペイントを取得します。

**Returns:**
java.awt.Paint - 現在の塗料です。
### getStroke() {#getStroke--}
```
public Stroke getStroke()
```


現在のグラフィックス状態のストロークを取得します。

**Returns:**
java.awt.Stroke - 現在のストローク。
### getXmpMetadata() {#getXmpMetadata--}
```
public XmpMetadata getXmpMetadata()
```


PS/EPS ファイルを読み取り、XMP メタデータが既に存在すれば抽出し、存在しなければ新しく追加します。

**Returns:**
[XmpMetadata](../../com.aspose.eps.xmp/xmpmetadata) - existing or new instance of XMP metadata.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isLicensed() {#isLicensed--}
```
public boolean isLicensed()
```


Aspose.Page for Java 製品ライセンスがアクセスされ、有効かどうかを示します。

**Returns:**
boolean - 真偽値
### merge(String[] filesForMerge, Device device, SaveOptions options) {#merge-java.lang.String---com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void merge(String[] filesForMerge, Device device, SaveOptions options)
```


PS/EPS ファイルをデバイスにマージします。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | このファイルと出力デバイスにマージするための PS/EPS ファイル。 |
| device | [Device](../../com.aspose.page/device) | 出力デバイス。 |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | 変換中にスローされたエラーの出力を指定するフラグを含みます。 |

### mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options) {#mergeToPdf-java.io.OutputStream-java.lang.String---com.aspose.page.SaveOptions-}
```
public void mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options)
```


PS/EPS ファイルをデバイスにマージします。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| pdfStream | java.io.OutputStream | 出力 PDF ストリーム。 |
| filesForMerge | java.lang.String[] | このファイルと出力デバイスにマージするための PS/EPS ファイル。 |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | 変換中にスローされたエラーの出力を指定するフラグを含みます。 |

### mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options) {#mergeToPdf-java.lang.String-java.lang.String---com.aspose.page.SaveOptions-}
```
public void mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options)
```


PS/EPS ファイルをデバイスにマージします。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | 出力 PDF ファイルのパス。 |
| filesForMerge | java.lang.String[] | このファイルと出力デバイスにマージするための PS/EPS ファイル。 |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | 変換中にスローされたエラーの出力を指定するフラグを含みます。 |

### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### openPage(float width, float height) {#openPage-float-float-}
```
public void openPage(float width, float height)
```


新しいページを作成し、現在のページに設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| width | float | 新しいページの幅。 |
| height | float | 新しいページの高さ。 |

### openPage(String pageName) {#openPage-java.lang.String-}
```
public void openPage(String pageName)
```


ドキュメントのサイズで新しいページを作成し、現在のページに設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| pageName | java.lang.String | 新しいページの名前。null の場合、ページの名前はページの順序番号になります。 |

### outlineText(String text, DrFont drFont, float x, float y) {#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-}
```
public void outlineText(String text, DrFont drFont, float x, float y)
```


グリフの輪郭を描画してテキスト文字列を追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| text | java.lang.String | 追加するテキストです。 |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont はテキスト描画に使用されます。カスタムフォルダーにあるカスタムフォントと併用できます。 |
| x | float | テキスト原点の X 座標です。 |
| y | float | テキスト原点の Y 座標です。 |

### outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)
```


グリフの輪郭を描画してテキスト文字列を追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| text | java.lang.String | 追加するテキストです。 |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont はテキスト描画に使用されます。カスタムフォルダーにあるカスタムフォントと併用できます。 |
| x | float | テキスト原点の X 座標です。 |
| y | float | テキスト原点の Y 座標です。 |
| outlinePaint | java.awt.Paint | java.awt.Paint はグリフの輪郭塗装に使用されます。JDK の java.awt.Paint クラスの任意のサブクラスを使用できます。 |
| stroke | java.awt.Stroke | グリフ輪郭の描画に使用されるストロークです。 |

### outlineText(String text, float[] advances, DrFont drFont, float x, float y) {#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-}
```
public void outlineText(String text, float[] advances, DrFont drFont, float x, float y)
```


グリフの輪郭を描画してテキスト文字列を追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| text | java.lang.String | 追加するテキストです。 |
| advances | float[] | グリフ幅の配列です。その長さは文字列中のグリフ数と一致する必要があります。 |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont はテキスト描画に使用されます。カスタムフォルダーにあるカスタムフォントと併用できます。 |
| x | float | テキスト原点の X 座標です。 |
| y | float | テキスト原点の Y 座標です。 |

### outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)
```


グリフの輪郭を描画してテキスト文字列を追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| text | java.lang.String | 追加するテキストです。 |
| advances | float[] | グリフ幅の配列です。その長さは文字列中のグリフ数と一致する必要があります。 |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont はテキスト描画に使用されます。カスタムフォルダーにあるカスタムフォントと併用できます。 |
| x | float | テキスト原点の X 座標です。 |
| y | float | テキスト原点の Y 座標です。 |
| outlinePaint | java.awt.Paint | java.awt.Paint はグリフの輪郭塗装に使用されます。JDK の java.awt.Paint クラスの任意のサブクラスを使用できます。 |
| stroke | java.awt.Stroke | グリフ輪郭の描画に使用されるストロークです。 |

### outlineText(String text, float[] advances, Font font, float x, float y) {#outlineText-java.lang.String-float---java.awt.Font-float-float-}
```
public void outlineText(String text, float[] advances, Font font, float x, float y)
```


グリフの輪郭を描画してテキスト文字列を追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| text | java.lang.String | 追加するテキストです。 |
| advances | float[] | グリフ幅の配列です。その長さは文字列中のグリフ数と一致する必要があります。 |
| font | java.awt.Font | テキスト描画に使用されるシステムフォントです。 |
| x | float | テキスト原点の X 座標です。 |
| y | float | テキスト原点の Y 座標です。 |

### outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke)
```


グリフの輪郭を描画してテキスト文字列を追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| text | java.lang.String | 追加するテキストです。 |
| advances | float[] | グリフ幅の配列です。その長さは文字列中のグリフ数と一致する必要があります。 |
| font | java.awt.Font | テキスト描画に使用されるフォントです。 |
| x | float | テキスト原点の X 座標です。 |
| y | float | テキスト原点の Y 座標です。 |
| outlinePaint | java.awt.Paint | java.awt.Paint はグリフの輪郭塗装に使用されます。JDK の java.awt.Paint クラスの任意のサブクラスを使用できます。 |
| stroke | java.awt.Stroke | グリフ輪郭の描画に使用されるストロークです。 |

### outlineText(String text, Font font, float x, float y) {#outlineText-java.lang.String-java.awt.Font-float-float-}
```
public void outlineText(String text, Font font, float x, float y)
```


グリフの輪郭を描画してテキスト文字列を追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| text | java.lang.String | 追加するテキストです。 |
| font | java.awt.Font | テキスト描画に使用されるシステムフォントです。 |
| x | float | テキスト原点の X 座標です。 |
| y | float | テキスト原点の Y 座標です。 |

### outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke)
```


グリフの輪郭を描画してテキスト文字列を追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| text | java.lang.String | 追加するテキストです。 |
| font | java.awt.Font | テキスト描画に使用されるフォントです。 |
| x | float | テキスト原点の X 座標です。 |
| y | float | テキスト原点の Y 座標です。 |
| outlinePaint | java.awt.Paint | java.awt.Paint はグリフの輪郭塗装に使用されます。JDK の java.awt.Paint クラスの任意のサブクラスを使用できます。 |
| stroke | java.awt.Stroke | グリフ輪郭の描画に使用されるストロークです。 |

### resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units) {#resizeEps-java.io.OutputStream-com.aspose.page.DimensionF-com.aspose.page.Units-}
```
public void resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units)
```


指定された PsDocument を EPS ファイルとしてサイズ変更します。このメソッドは EPS サイズを抽出した後にのみ使用されます。既存の %%BoundingBox を更新した初期 EPS ファイルを保存するか、新しいものが作成されます。ページ変換行列も設定されます。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| epsStream | java.io.OutputStream |  |
| newSizeInUnits | [DimensionF](../../com.aspose.page/dimensionf) | 割り当てられた単位での EPS 画像の新しいサイズ。 |
| units | [Units](../../com.aspose.page/units) | 新しいサイズの単位。ポイント、インチ、ミリメートル、センチメートル、または元のサイズのパーセントを指定できます。 |

### rotate(float angleRadians) {#rotate-float-}
```
public void rotate(float angleRadians)
```


原点を中心に反時計回りの回転を現在のグラフィックス状態に追加します（現在の行列を回転）。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| angleRadians | float | ラジアン単位の回転角度。 |

### rotate(int angleDegrees) {#rotate-int-}
```
public void rotate(int angleDegrees)
```


原点を中心に反時計回りの回転を現在のグラフィックス状態に追加します（現在の行列を回転）。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| angleDegrees | int | 度単位の回転角度。 |

### save() {#save--}
```
public void save()
```


指定された PsDocument を PS または EPS ファイルとして保存します。このメソッドは PsDocument が最初から作成された場合にのみ使用されます。

### save(Device device, SaveOptions options) {#save-com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void save(Device device, SaveOptions options)
```


PS/EPS ファイルをデバイスに保存します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| device | [Device](../../com.aspose.page/device) | 出力デバイス。 |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | 変換中にスローされたエラーの出力を指定するフラグを含みます。 |

### save(OutputStream epsStream) {#save-java.io.OutputStream-}
```
public void save(OutputStream epsStream)
```


指定された PsDocument をストリームに保存します。このメソッドは XMP メタデータを更新した後にのみ使用されます。既存のメタデータを更新した初期 EPS ファイルを保存するか、getMetadata メソッドを呼び出す際に新しく作成されたものを保存します。後者の場合、必要なすべての PostScript コードと EPS コメントが追加されます。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| epsStream | java.io.OutputStream | 出力 EPS ファイルのストリーム。 |

### save(String outEpsFilePath) {#save-java.lang.String-}
```
public void save(String outEpsFilePath)
```


指定された PsDocument を EPS ファイルとして保存します。このメソッドは XMP メタデータを更新した後にのみ使用されます。既存のメタデータを更新した初期 EPS ファイルを保存するか、getMetadata メソッドを呼び出す際に新しく作成されたものを保存します。後者の場合、必要なすべての PostScript コードと EPS コメントが追加されます。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| outEpsFilePath | java.lang.String | 出力 EPS ファイルパスです。 |

### saveAsImage(ImageSaveOptions options) {#saveAsImage-com.aspose.eps.device.ImageSaveOptions-}
```
public void saveAsImage(ImageSaveOptions options)
```


PS/EPS ファイルを画像ファイルに保存します。出力ディレクトリとファイル名は入力 PS ファイルと同じになります。ファイル拡張子は \"options\" パラメータの画像形式に対応します。ドキュメントが FileInputStream から派生していないストリームで初期化された場合、画像ファイルはデフォルトのファイル名テンプレートで現在のフォルダーに保存されます。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | 画像保存に必要なパラメータと、変換中にスローされたエラーの出力を指定するフラグを含みます。 |

### saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate) {#saveAsImage-com.aspose.eps.device.ImageSaveOptions-java.lang.String-java.lang.String-}
```
public void saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)
```


指定されたディレクトリに、指定されたファイル名で PS/EPS ファイルを画像ファイルに保存します。ファイル拡張子は \"options\" パラメータの画像形式に対応します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | 画像保存に必要なパラメータと、変換中にスローされたエラーの出力を指定するフラグを含みます。 |
| outDir | java.lang.String | 画像ファイルが保存される出力ディレクトリです。 |
| fileNameTemplate | java.lang.String | 画像のファイル名テンプレート（拡張子なし）。入力 PS/EPS ファイルが 1 ページの場合は正確にそのファイル名になります。それ以外の場合は \"\\_[n]\" となり、\"n\" は 0 から始まるページ番号です。サフィックスがこのテンプレートに付加されます。ファイル拡張子は \"option\" パラメータの画像形式に対応します。 |

### saveAsImagesBytes(ImageSaveOptions options) {#saveAsImagesBytes-com.aspose.eps.device.ImageSaveOptions-}
```
public byte[][] saveAsImagesBytes(ImageSaveOptions options)
```


PS/EPS ファイルを画像のバイト配列に保存します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | 画像保存に必要なパラメータと、変換中にスローされたエラーの出力を指定するフラグを含みます。 |

**Returns:**
byte[][] - 画像バイト。1 ページにつき 1 つのバイト配列です。
### saveAsPdf(OutputStream pdfStream, PdfSaveOptions options) {#saveAsPdf-java.io.OutputStream-com.aspose.eps.device.PdfSaveOptions-}
```
public void saveAsPdf(OutputStream pdfStream, PdfSaveOptions options)
```


PS/EPS ファイルを出力 PDF ストリームに保存します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| pdfStream | java.io.OutputStream | 出力 PDF ストリーム。 |
| options | [PdfSaveOptions](../../com.aspose.eps.device/pdfsaveoptions) | 変換中にスローされたエラーの出力を指定するフラグを含みます。 |

### saveAsPdf(String outPdfFilePath, PdfSaveOptions options) {#saveAsPdf-java.lang.String-com.aspose.eps.device.PdfSaveOptions-}
```
public void saveAsPdf(String outPdfFilePath, PdfSaveOptions options)
```


PS/EPS ファイルを PDF ファイルに保存します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | 出力 PDF ファイルのパス。 |
| options | [PdfSaveOptions](../../com.aspose.eps.device/pdfsaveoptions) | 変換中にスローされたエラーの出力を指定するフラグを含みます。 |

### saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options) {#saveImageAsEps-java.awt.image.BufferedImage-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options)
```


BufferedImage オブジェクトを EPS ファイルに保存します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | 画像です。 |
| epsStream | java.io.OutputStream | EPS 出力ストリームです。 |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | 変換中にスローされたエラーの出力を指定するパラメータを含みます。 |

### saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options) {#saveImageAsEps-java.awt.image.BufferedImage-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options)
```


BufferedImage オブジェクトを EPS ファイルに保存します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | 画像です。 |
| epsFilePath | java.lang.String | EPS ファイルパスです。 |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | 変換中にスローされたエラーの出力を指定するパラメータを含みます。 |

### saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options) {#saveImageAsEps-java.io.InputStream-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options)
```


入力ストリームから PNG/JPEG/BMP/GIF 画像を EPS 出力ストリームに保存します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| imageStream | java.io.InputStream | 画像入力ストリームです。 |
| epsStream | java.io.OutputStream | EPS 出力ストリームです。 |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | 変換中にスローされたエラーの出力を指定するパラメータを含みます。 |

### saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options) {#saveImageAsEps-java.lang.String-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options)
```


ファイルから PNG/JPEG/BMP/GIF 画像を EPS ファイルに保存します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| imageFilePath | java.lang.String | 画像ファイルパスです。 |
| epsFilePath | java.lang.String | EPS ファイルパスです。 |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | 変換中にスローされたエラーの出力を指定するパラメータを含みます。 |

### scale(float xScale, float yScale) {#scale-float-float-}
```
public void scale(float xScale, float yScale)
```


現在のグラフィックス状態にスケールを追加します（現在の行列をスケール）。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| xScale | float | X 軸のスケールです。 |
| yScale | float | Y 軸のスケールです。 |

### setInputStream(InputStream is) {#setInputStream-java.io.InputStream-}
```
public void setInputStream(InputStream is)
```


入力ストリームを指定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| is | java.io.InputStream | PS/EPS ファイルの入力ストリームです。 |

### setPageDevice(Map<String,Object> pageParams) {#setPageDevice-java.util.Map-java.lang.String-java.lang.Object--}
```
public void setPageDevice(Map<String,Object> pageParams)
```


ページデバイスパラメータを設定します（演算子 \"setpagedevice\" の PostScript 仕様を参照）。これにはページサイズやカラーなどが含まれます。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| pageParams | java.util.Map<java.lang.String,java.lang.Object> | ページのパラメータ。この辞書にはページサイズや色などが含まれます。 |

### setPageSize(float width, float height) {#setPageSize-float-float-}
```
public void setPageSize(float width, float height)
```


ページサイズを設定します。1つのドキュメント内で異なるサイズのページを作成するには、このメソッドの直後に  setPageDevice  メソッドを使用します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| width | float | 結果の PostScript ファイルにおけるページの幅。 |
| height | float | 結果の PostScript ファイルにおけるページの高さ。 |

### setPaint(Paint paint) {#setPaint-java.awt.Paint-}
```
public void setPaint(Paint paint)
```


現在のグラフィックス状態の塗りを設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| paint | java.awt.Paint | ペイントです。JDK に存在する  Paint  クラスの任意のサブクラスを使用できます。 |

### setStroke(Stroke stroke) {#setStroke-java.awt.Stroke-}
```
public void setStroke(Stroke stroke)
```


現在のグラフィックス状態のストロークを設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| stroke | java.awt.Stroke | ストロークです。 |

### setTransform(AffineTransform matrix) {#setTransform-java.awt.geom.AffineTransform-}
```
public void setTransform(AffineTransform matrix)
```


現在の変換をこれに設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| matrix | java.awt.geom.AffineTransform | 変換です。 |

### shear(float shx, float shy) {#shear-float-float-}
```
public void shear(float shx, float shy)
```


現在のグラフィックス状態にせん断変換を追加します（現在の行列をせん断）。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| shx | float | X 軸方向のせん断です。 |
| shy | float | Y 軸方向のせん断です。 |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### transform(AffineTransform matrix) {#transform-java.awt.geom.AffineTransform-}
```
public void transform(AffineTransform matrix)
```


現在のグラフィックス状態に変換を追加します（この行列を現在の行列と連結）。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| matrix | java.awt.geom.AffineTransform | 変換です。 |

### translate(float x, float y) {#translate-float-float-}
```
public void translate(float x, float y)
```


現在のグラフィックス状態に平行移動を追加します（現在の行列を平行移動）。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| x | float | X 方向への平行移動です。 |
| y | float | Y 方向への平行移動です。 |

### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

### writeGraphicsRestore() {#writeGraphicsRestore--}
```
public void writeGraphicsRestore()
```


現在のグラフィックス状態の復元を書き込みます（演算子 "grestore" の PostScript 仕様を参照）。

### writeGraphicsSave() {#writeGraphicsSave--}
```
public void writeGraphicsSave()
```


現在のグラフィックス状態の保存を書き込みます（演算子 "gsave" の PostScript 仕様を参照）。

