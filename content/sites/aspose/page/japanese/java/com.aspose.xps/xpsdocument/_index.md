---
title: "XpsDocument"
second_title: "Aspose.Page for Java API リファレンス"
description: "任意の XPS 要素に対する操作メソッドを提供する XPS ドキュメントの主要エンティティをカプセル化するクラス。"
type: docs
weight: 19
url: /ja/java/com.aspose.xps/xpsdocument/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Document](../../com.aspose.page/document)

**All Implemented Interfaces:**
java.io.Closeable
```
public final class XpsDocument extends Document implements Closeable
```

任意の XPS 要素に対する操作メソッドを提供する XPS ドキュメントの主要エンティティをカプセル化するクラス。
## コンストラクタ

| コンストラクタ | 説明 |
| --- | --- |
| [XpsDocument()](#XpsDocument--) | デフォルトのページサイズで空の XPS ドキュメントを作成します。 |
| [XpsDocument(String path)](#XpsDocument-java.lang.String-) | 指定されたパスにある既存の XPS ドキュメントを開きます。 |
| [XpsDocument(InputStream stream, LoadOptions options)](#XpsDocument-java.io.InputStream-com.aspose.xps.LoadOptions-) | ストリームに格納された既存のドキュメントを XPS ドキュメントとしてロードします。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | コンテンツ要素（Canvas、Path、または Glyphs）を追加します |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | アクティブページのインデックス位置に要素（Canvas、Path、または Glyphs）を挿入します。 |
| [<T>remove(T element)](#-T-remove-T-) | アクティブページから要素を削除します。 |
| [addCanvas()](#addCanvas--) | アクティブページに新しいキャンバスを追加します。 |
| [addDocument()](#addDocument--) | デフォルトのページサイズで空のドキュメントを追加し、追加されたドキュメントをアクティブとして選択します。 |
| [addDocument(boolean activate)](#addDocument-boolean-) | デフォルトのページサイズで空のドキュメントを追加します。 |
| [addDocument(float width, float height)](#addDocument-float-float-) | 最初のページの width と height の寸法で空のドキュメントを追加し、追加されたドキュメントをアクティブとして選択します。 |
| [addDocument(float width, float height, boolean activate)](#addDocument-float-float-boolean-) | 最初のページの width と height を持つ空のドキュメントを追加します。 |
| [addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | アクティブなページに新しいグリフを追加します。 |
| [addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | アクティブなページに新しいグリフを追加します。 |
| [addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target)](#addOutlineEntry-java.lang.String-int-com.aspose.xps.XpsHyperlinkTarget-) | ドキュメントにアウトラインエントリを追加します。 |
| [addPage()](#addPage--) | デフォルトのページサイズで空のページをドキュメントに追加します。 |
| [addPage(boolean activate)](#addPage-boolean-) | デフォルトのページサイズで空のページをドキュメントに追加します。 |
| [addPage(XpsPage page)](#addPage-com.aspose.xps.XpsPage-) | ページをドキュメントに追加し、追加されたページをアクティブに選択します。 |
| [addPage(XpsPage page, boolean activate)](#addPage-com.aspose.xps.XpsPage-boolean-) | ページをドキュメントに追加します。 |
| [addPage(float width, float height)](#addPage-float-float-) | 指定された width と height を持つ空のページをドキュメントに追加します。 |
| [addPage(float width, float height, boolean activate)](#addPage-float-float-boolean-) | 指定された width と height を持つ空のページをドキュメントに追加します。 |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | アクティブなページに新しいパスを追加します。 |
| [close()](#close--) | インスタンスを破棄します。 |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-) | 新しいストロークされた楕円弧セグメントを作成します。 |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-) | 新しい楕円弧セグメントを作成します。 |
| [createCanvas()](#createCanvas--) | 新しいキャンバスを作成します。 |
| [createColor(XpsIccProfile iccProfile, float[] components)](#createColor-com.aspose.xps.XpsIccProfile-float...-) | ICCベースのカラースペースで新しい色を作成します。 |
| [createColor(float r, float g, float b)](#createColor-float-float-float-) | scRGB カラースペースで新しい色を作成します。 |
| [createColor(float a, float r, float g, float b)](#createColor-float-float-float-float-) | scRGB カラースペースで新しい色を作成します。 |
| [createColor(int r, int g, int b)](#createColor-int-int-int-) | sRGB カラースペースで新しい色を作成します。 |
| [createColor(int a, int r, int g, int b)](#createColor-int-int-int-int-) | sRGB カラースペースで新しい色を作成します。 |
| [createColor(Color color)](#createColor-java.awt.Color-) | 新しい色を作成します。 |
| [createColor(String path, float[] components)](#createColor-java.lang.String-float...-) | ICCベースのカラースペースで新しい色を作成します。 |
| [createFont(InputStream stream)](#createFont-java.io.InputStream-) | stream から新しい TrueType フォントリソースを作成します。 |
| [createFont(String fontFamily, XpsFontStyle fontStyle)](#createFont-java.lang.String-com.aspose.xps.XpsFontStyle-) | 新しい TrueType フォントリソースを作成します。 |
| [createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | 新しいグリフを作成します。 |
| [createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | 新しいグリフを作成します。 |
| [createGradientStop(XpsColor color, float offset)](#createGradientStop-com.aspose.xps.XpsColor-float-) | 新しいグラデーションストップを作成します。 |
| [createGradientStop(Color color, float offset)](#createGradientStop-java.awt.Color-float-) | 新しいグラデーションストップを作成します。 |
| [createIccProfile(InputStream stream)](#createIccProfile-java.io.InputStream-) | stream から新しい ICC プロファイルリソースを作成します。 |
| [createIccProfile(String iccProfilePath)](#createIccProfile-java.lang.String-) | iccProfilePath にある ICC プロファイルファイルから新しい ICC プロファイルリソースを作成します。 |
| [createImage(InputStream stream)](#createImage-java.io.InputStream-) | stream から新しい画像リソースを作成します。 |
| [createImage(String imagePath)](#createImage-java.lang.String-) | imagePath にある画像ファイルから新しい画像リソースを作成します。 |
| [createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | 新しいイメージブラシを作成します。 |
| [createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | 新しいイメージブラシを作成します。 |
| [createLinearGradientBrush(Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-) | 新しい線形グラデーションブラシを作成します。 |
| [createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-) | 新しい線形グラデーションブラシを作成します。 |
| [createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)](#createMatrix-float-float-float-float-float-float-) | 新しいアフィン変換行列を作成します。 |
| [createPath(XpsPathGeometry data)](#createPath-com.aspose.xps.XpsPathGeometry-) | 新しいパスを作成します。 |
| [createPathFigure(Point2D startPoint)](#createPathFigure-java.awt.geom.Point2D-) | 新しいオープンパス図形を作成します。 |
| [createPathFigure(Point2D startPoint, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-boolean-) | 新しいパス図形を作成します。 |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--) | 新しいオープンパス図形を作成します。 |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-) | 新しいパス図形を作成します。 |
| [createPathGeometry()](#createPathGeometry--) | 新しいパスジオメトリを作成します。 |
| [createPathGeometry(String abbreviatedGeometry)](#createPathGeometry-java.lang.String-) | 省略形で指定された新しいパスジオメトリを作成します。 |
| [createPathGeometry(List<XpsPathFigure> pathFigures)](#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--) | 指定されたパス図形のリストで新しいパスジオメトリを作成します。 |
| [createPolyBezierSegment(Point2D[] points)](#createPolyBezierSegment-java.awt.geom.Point2D---) | ストロークされた立方ベジエ曲線の新しいセットを作成します。 |
| [createPolyBezierSegment(Point2D[] points, boolean isStroked)](#createPolyBezierSegment-java.awt.geom.Point2D---boolean-) | 立方ベジエ曲線の新しいセットを作成します。 |
| [createPolyLineSegment(Point2D[] points)](#createPolyLineSegment-java.awt.geom.Point2D---) | 任意の数の個々の頂点を含む新しいストロークされた多角形描画を作成します。 |
| [createPolyLineSegment(Point2D[] points, boolean isStroked)](#createPolyLineSegment-java.awt.geom.Point2D---boolean-) | 任意の数の個々の頂点を含む新しい多角形描画を作成します。 |
| [createPolyQuadraticBezierSegment(Point2D[] points)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---) | パス図形の前の点から指定された制御点を使用して頂点のセットを通過する、ストロークされた二次ベジエ曲線の新しいセットを作成します。 |
| [createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-) | パス図形の前の点から指定された制御点を使用して頂点のセットを通過する、二次ベジエ曲線の新しいセットを作成します。 |
| [createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | 新しい放射状グラデーションブラシを作成します。 |
| [createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | 新しい放射状グラデーションブラシを作成します。 |
| [createSolidColorBrush(XpsColor color)](#createSolidColorBrush-com.aspose.xps.XpsColor-) | 新しい単色ブラシを作成します。 |
| [createSolidColorBrush(Color color)](#createSolidColorBrush-java.awt.Color-) | 新しい単色ブラシを作成します。 |
| [createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)](#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | 新しいビジュアルブラシを作成します。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getActiveDocument()](#getActiveDocument--) | アクティブなドキュメント番号を返します。 |
| [getActivePage()](#getActivePage--) | アクティブなドキュメント内のアクティブなページ番号を返します。 |
| [getClass()](#getClass--) |  |
| [getDocumentCount()](#getDocumentCount--) | XPS パッケージ内のドキュメント数を返します。 |
| [getDocumentPrintTicket(int documentIndex)](#getDocumentPrintTicket-int-) | documentIndex でインデックスされたドキュメントの印刷チケットを取得します。 |
| [getJobPrintTicket()](#getJobPrintTicket--) | ドキュメントのジョブ印刷チケットを返します。 |
| [getPage()](#getPage--) | アクティブなページの XpsPage インスタンスを返します。 |
| [getPageCount()](#getPageCount--) | アクティブなドキュメントのページ数を返します。 |
| [getPagePrintTicket(int documentIndex, int pageIndex)](#getPagePrintTicket-int-int-) | documentIndex でインデックスされたドキュメント内の pageIndex でインデックスされたページの印刷チケットを取得します。 |
| [getTotalPageCount()](#getTotalPageCount--) | XPS ドキュメント内のすべてのドキュメントの総ページ数を返します。 |
| [getUtils()](#getUtils--) | 正式な XPS 操作 API を超えるユーティリティを提供するオブジェクトを取得します。 |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | index の位置にアクティブなページへ新しいキャンバスを挿入します。 |
| [insertDocument(int index)](#insertDocument-int-) | index の位置にデフォルトのページサイズの空のドキュメントを挿入し、挿入されたドキュメントをアクティブに選択します。 |
| [insertDocument(int index, boolean activate)](#insertDocument-int-boolean-) | index の位置にデフォルトのページサイズの空のドキュメントを挿入します。 |
| [insertDocument(int index, float width, float height)](#insertDocument-int-float-float-) | index の位置に最初のページの width と height を持つ空のドキュメントを挿入し、挿入されたドキュメントをアクティブに選択します。 |
| [insertDocument(int index, float width, float height, boolean activate)](#insertDocument-int-float-float-boolean-) | インデックス 位置 に、width と height の最初のページ寸法を持つ空のドキュメントを挿入します。 |
| [insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)](#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | インデックス 位置 にアクティブページへ新しいグリフを挿入します。 |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | インデックス 位置 にアクティブページへ新しいグリフを挿入します。 |
| [insertPage(int index)](#insertPage-int-) | インデックス 位置 にデフォルトページサイズの空ページをドキュメントに挿入し、挿入されたページをアクティブに選択します。 |
| [insertPage(int index, boolean activate)](#insertPage-int-boolean-) | インデックス 位置 にデフォルトページサイズの空ページをドキュメントに挿入します。 |
| [insertPage(int index, XpsPage page)](#insertPage-int-com.aspose.xps.XpsPage-) | インデックス 位置 にページをドキュメントに挿入し、挿入されたページをアクティブに選択します。 |
| [insertPage(int index, XpsPage page, boolean activate)](#insertPage-int-com.aspose.xps.XpsPage-boolean-) | インデックス 位置 にページをドキュメントに挿入します。 |
| [insertPage(int index, float width, float height)](#insertPage-int-float-float-) | インデックス 位置 に指定された width と height の空ページをドキュメントに挿入し、挿入されたページをアクティブに選択します。 |
| [insertPage(int index, float width, float height, boolean activate)](#insertPage-int-float-float-boolean-) | インデックス 位置 に指定された width と height の空ページをドキュメントに挿入します。 |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | インデックス 位置 にアクティブページへ新しいパスを挿入します。 |
| [isLicensed()](#isLicensed--) | Aspose.Page for Java 製品ライセンスがアクセスされ、有効かどうかを示します。 |
| [merge(String[] filesForMerge, OutputStream outStream)](#merge-java.lang.String---java.io.OutputStream-) | 複数の XPS ファイルを 1 つの XPS ドキュメントに結合します。 |
| [merge(String[] filesForMerge, String outXpsFilePath)](#merge-java.lang.String---java.lang.String-) | 複数の XPS ファイルを 1 つの XPS ドキュメントに結合します。 |
| [mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options)](#mergeToPdf-java.lang.String-java.lang.String---com.aspose.xps.rendering.PdfSaveOptions-) | Device インスタンスを使用して XPS ドキュメントを PDF に結合します。 |
| [mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options)](#mergeToPdf-java.lang.String---java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-) | Device インスタンスを使用して XPS ドキュメントを PDF に結合します。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeAt(int index)](#removeAt-int-) | インデックス 位置 からアクティブページの要素を削除します。 |
| [removeDocumentAt(int index)](#removeDocumentAt-int-) | インデックス 位置 のドキュメントを削除します。 |
| [removePage(XpsPage page)](#removePage-com.aspose.xps.XpsPage-) | ドキュメントからページを削除します。 |
| [removePageAt(int index)](#removePageAt-int-) | インデックス 位置 のドキュメントからページを削除します。 |
| [save(Device device, SaveOptions options)](#save-com.aspose.page.Device-com.aspose.page.SaveOptions-) | Device インスタンスを使用してドキュメントを保存します。 |
| [save(OutputStream stream)](#save-java.io.OutputStream-) | XPS ドキュメントをストリームに保存します。 |
| [save(String path)](#save-java.lang.String-) | path にある XPS ファイルに XPS ドキュメントを保存します。 |
| [saveAsImage(ImageSaveOptions options)](#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-) | ドキュメントを画像ファイルに保存します。出力ディレクトリとファイル名は、入力 XPS ファイルと同じになります。 |
| [saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)](#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-java.lang.String-java.lang.String-) | 指定されたディレクトリと指定されたファイル名でドキュメントを画像ファイルに保存します。 |
| [saveAsImageBytes(ImageSaveOptions options)](#saveAsImageBytes-com.aspose.xps.rendering.ImageSaveOptions-) | ドキュメントをビットマップ画像形式でバイト配列として保存します。 |
| [saveAsPdf(OutputStream stream, PdfSaveOptions options)](#saveAsPdf-java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-) | ドキュメントを PDF 形式で保存します。 |
| [saveAsPdf(String outPdfFilePath, PdfSaveOptions options)](#saveAsPdf-java.lang.String-com.aspose.xps.rendering.PdfSaveOptions-) | ドキュメントを PDF 形式で保存します。 |
| [saveAsPs(OutputStream stream, PsSaveOptions options)](#saveAsPs-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | ドキュメントを PS 形式で保存します。 |
| [saveAsPs(String outPsFilePath, PsSaveOptions options)](#saveAsPs-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | ドキュメントを PostSscript 形式で保存します。 |
| [selectActiveDocument(int documentNumber)](#selectActiveDocument-int-) | 編集用にアクティブなドキュメントを選択します。 |
| [selectActivePage(int pageNumber)](#selectActivePage-int-) | 編集用にアクティブなドキュメントページを選択します。 |
| [setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket)](#setDocumentPrintTicket-int-com.aspose.xps.metadata.DocumentPrintTicket-) | printTicket を documentIndex でインデックス付けされたドキュメントにリンクします。 |
| [setJobPrintTicket(JobPrintTicket value)](#setJobPrintTicket-com.aspose.xps.metadata.JobPrintTicket-) | ドキュメントのジョブ印刷チケットを設定します。 |
| [setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket)](#setPagePrintTicket-int-int-com.aspose.xps.metadata.PagePrintTicket-) | printTicket を documentIndex でインデックス付けされたドキュメント内の pageIndex でインデックス付けされたページにリンクします。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsDocument() {#XpsDocument--}
```
public XpsDocument()
```


デフォルトのページサイズで空の XPS ドキュメントを作成します。

### XpsDocument(String path) {#XpsDocument-java.lang.String-}
```
public XpsDocument(String path)
```


指定されたパスにある既存の XPS ドキュメントを開きます。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| path | java.lang.String | ドキュメントの場所。 |

### XpsDocument(InputStream stream, LoadOptions options) {#XpsDocument-java.io.InputStream-com.aspose.xps.LoadOptions-}
```
public XpsDocument(InputStream stream, LoadOptions options)
```


ストリームに格納された既存のドキュメントを XPS ドキュメントとしてロードします。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| ストリーム | java.io.InputStream | ドキュメントストリーム。 |
| options | [LoadOptions](../../com.aspose.xps/loadoptions) | ドキュメントの読み込みオプション。 |

### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


コンテンツ要素（Canvas、Path、または Glyphs）を追加します

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| 要素 | T | 追加する要素です。 |

**Returns:**
T - 追加された要素。
### <T>insert(int index, T element) {#-T-insert-int-T-}
```
public T <T>insert(int index, T element)
```


アクティブページのインデックス位置に要素（Canvas、Path、または Glyphs）を挿入します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| インデックス | int | 要素を挿入すべき位置。 |
| 要素 | T | 挿入する要素。 |

**Returns:**
T - 挿入された要素。
### <T>remove(T element) {#-T-remove-T-}
```
public T <T>remove(T element)
```


アクティブページから要素を削除します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| 要素 | T | 削除する要素。 |

**Returns:**
T - 削除された要素。
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


アクティブページに新しいキャンバスを追加します。

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addDocument() {#addDocument--}
```
public void addDocument()
```


デフォルトのページサイズで空のドキュメントを追加し、追加されたドキュメントをアクティブとして選択します。

### addDocument(boolean activate) {#addDocument-boolean-}
```
public void addDocument(boolean activate)
```


デフォルトのページサイズで空のドキュメントを追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| アクティブ化 | boolean | 追加されたドキュメントをアクティブとして選択するかどうかを示すフラグ。 |

### addDocument(float width, float height) {#addDocument-float-float-}
```
public void addDocument(float width, float height)
```


最初のページの width と height の寸法で空のドキュメントを追加し、追加されたドキュメントをアクティブとして選択します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| width | float | 最初のページの幅。 |
| height | float | 最初のページの高さ。 |

### addDocument(float width, float height, boolean activate) {#addDocument-float-float-boolean-}
```
public void addDocument(float width, float height, boolean activate)
```


最初のページの width と height を持つ空のドキュメントを追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| width | float | 最初のページの幅。 |
| height | float | 最初のページの高さ。 |
| アクティブ化 | boolean | 追加されたドキュメントをアクティブとして選択するかどうかを示すフラグ。 |

### addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


アクティブなページに新しいグリフを追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | フォントリソース。 |
| fontRenderingEmSize | float | フォントサイズ。 |
| originX | float | グリフの原点 X 座標。 |
| originY | float | グリフの原点 Y 座標。 |
| unicodeString | java.lang.String | 印刷される文字列。 |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


アクティブなページに新しいグリフを追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| fontFamily | java.lang.String | フォントファミリー。 |
| fontRenderingEmSize | float | フォントサイズ。 |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | フォントスタイル。 |
| originX | float | グリフの原点 X 座標。 |
| originY | float | グリフの原点 Y 座標。 |
| unicodeString | java.lang.String | 印刷される文字列。 |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target) {#addOutlineEntry-java.lang.String-int-com.aspose.xps.XpsHyperlinkTarget-}
```
public void addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target)
```


ドキュメントにアウトラインエントリを追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| 説明 | java.lang.String | エントリの説明。 |
| outlineLevel | int | アウトラインレベル。 |
| target | [XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) | エントリターゲット。 |

### addPage() {#addPage--}
```
public XpsPage addPage()
```


デフォルトのページサイズで空のページをドキュメントに追加します。

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(boolean activate) {#addPage-boolean-}
```
public XpsPage addPage(boolean activate)
```


デフォルトのページサイズで空のページをドキュメントに追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| アクティブ化 | boolean | 追加されたページをアクティブとして選択するかどうかを示すフラグ。 |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(XpsPage page) {#addPage-com.aspose.xps.XpsPage-}
```
public XpsPage addPage(XpsPage page)
```


ページをドキュメントに追加し、追加されたページをアクティブに選択します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | 追加されるページ。 |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(XpsPage page, boolean activate) {#addPage-com.aspose.xps.XpsPage-boolean-}
```
public XpsPage addPage(XpsPage page, boolean activate)
```


ページをドキュメントに追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | 追加されるページ。 |
| アクティブ化 | boolean | 追加されたページをアクティブとして選択するかどうかを示すフラグ。 |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(float width, float height) {#addPage-float-float-}
```
public XpsPage addPage(float width, float height)
```


指定された width と height を持つ空のページをドキュメントに追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| width | float | 新しいページの幅。 |
| height | float | 新しいページの高さ。 |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(float width, float height, boolean activate) {#addPage-float-float-boolean-}
```
public XpsPage addPage(float width, float height, boolean activate)
```


指定された width と height を持つ空のページをドキュメントに追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| width | float | 新しいページの幅。 |
| height | float | 新しいページの高さ。 |
| アクティブ化 | boolean | 追加されたページをアクティブとして選択するかどうかを示すフラグ。 |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


アクティブなページに新しいパスを追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | パスのジオメトリ。 |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### close() {#close--}
```
public void close()
```


インスタンスを破棄します。

### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)
```


新しいストロークされた楕円弧セグメントを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| ポイント | java.awt.geom.Point2D | 楕円弧の終点。 |
| size | java.awt.geom.Dimension2D | 楕円弧の x と y の半径（x,y のペア）。 |
| rotationAngle | float | 楕円が現在の座標系に対してどのように回転しているかを示します。 |
| isLargeArc | boolean | 弧が 180 度以上のスイープで描画されるかどうかを決定します。 |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | 弧が描画される方向。 |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)
```


新しい楕円弧セグメントを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| ポイント | java.awt.geom.Point2D | 楕円弧の終点。 |
| size | java.awt.geom.Dimension2D | 楕円弧の x と y の半径（x,y のペア）。 |
| rotationAngle | float | 楕円が現在の座標系に対してどのように回転しているかを示します。 |
| isLargeArc | boolean | 弧が 180 度以上のスイープで描画されるかどうかを決定します。 |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | 弧が描画される方向。 |
| isStroked | boolean | パスのこのセグメントのストロークが描画されるかどうかを指定します。 |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createCanvas() {#createCanvas--}
```
public XpsCanvas createCanvas()
```


新しいキャンバスを作成します。

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - New canvas.
### createColor(XpsIccProfile iccProfile, float[] components) {#createColor-com.aspose.xps.XpsIccProfile-float...-}
```
public XpsColor createColor(XpsIccProfile iccProfile, float[] components)
```


ICCベースのカラースペースで新しい色を作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| iccProfile | [XpsIccProfile](../../com.aspose.xps/xpsiccprofile) | ICC プロファイルリソース。 |
| components | float[] | 色コンポーネント。 |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float r, float g, float b) {#createColor-float-float-float-}
```
public XpsColor createColor(float r, float g, float b)
```


scRGB カラースペースで新しい色を作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| r | float | 赤色コンポーネント。 |
| g | float | 緑色コンポーネント。 |
| b | float | 青色コンポーネント。 |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float a, float r, float g, float b) {#createColor-float-float-float-float-}
```
public XpsColor createColor(float a, float r, float g, float b)
```


scRGB カラースペースで新しい色を作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| a | float | アルファ色コンポーネント。 |
| r | float | 赤色コンポーネント。 |
| g | float | 緑色コンポーネント。 |
| b | float | 青色コンポーネント。 |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int r, int g, int b) {#createColor-int-int-int-}
```
public XpsColor createColor(int r, int g, int b)
```


sRGB カラースペースで新しい色を作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| r | int | 赤色コンポーネント。 |
| g | int | 緑色コンポーネント。 |
| b | int | 青色コンポーネント。 |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int a, int r, int g, int b) {#createColor-int-int-int-int-}
```
public XpsColor createColor(int a, int r, int g, int b)
```


sRGB カラースペースで新しい色を作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| a | int | アルファ色コンポーネント。 |
| r | int | 赤色コンポーネント。 |
| g | int | 緑色コンポーネント。 |
| b | int | 青色コンポーネント。 |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(Color color) {#createColor-java.awt.Color-}
```
public XpsColor createColor(Color color)
```


新しい色を作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| color | java.awt.Color | RGB カラー用のネイティブカラーインスタンスです。 |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(String path, float[] components) {#createColor-java.lang.String-float...-}
```
public XpsColor createColor(String path, float[] components)
```


ICCベースのカラースペースで新しい色を作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| path | java.lang.String | ICC プロファイルへのパスです。 |
| components | float[] | 色コンポーネント。 |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createFont(InputStream stream) {#createFont-java.io.InputStream-}
```
public XpsFont createFont(InputStream stream)
```


stream から新しい TrueType フォントリソースを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| ストリーム | java.io.InputStream | リソースとして使用する ICC プロファイルを含むストリーム。 |

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - New TrueType font resource.
### createFont(String fontFamily, XpsFontStyle fontStyle) {#createFont-java.lang.String-com.aspose.xps.XpsFontStyle-}
```
public XpsFont createFont(String fontFamily, XpsFontStyle fontStyle)
```


新しい TrueType フォントリソースを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| fontFamily | java.lang.String | フォントファミリー。 |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | フォントスタイル。組み合わせ可能な値については、 XpsFont  クラス定数（ビットフラグ）を参照してください。 |

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - New TrueType font resource.
### createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


新しいグリフを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | フォントリソース。 |
| fontRenderingEmSize | float | フォントサイズ。 |
| originX | float | グリフの原点 X 座標。 |
| originY | float | グリフの原点 Y 座標。 |
| unicodeString | java.lang.String | 印刷される文字列。 |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


新しいグリフを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| fontFamily | java.lang.String | フォントファミリー。 |
| fontRenderingEmSize | float | フォントサイズ。 |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | フォントスタイル。 |
| originX | float | グリフの原点 X 座標。 |
| originY | float | グリフの原点 Y 座標。 |
| unicodeString | java.lang.String | 印刷される文字列。 |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGradientStop(XpsColor color, float offset) {#createGradientStop-com.aspose.xps.XpsColor-float-}
```
public XpsGradientStop createGradientStop(XpsColor color, float offset)
```


新しいグラデーションストップを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | グラデーションストップカラーです。 |
| オフセット | float | グラデーションのオフセットです。 |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createGradientStop(Color color, float offset) {#createGradientStop-java.awt.Color-float-}
```
public XpsGradientStop createGradientStop(Color color, float offset)
```


新しいグラデーションストップを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| color | java.awt.Color | グラデーションストップカラーです。 |
| オフセット | float | グラデーションのオフセットです。 |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createIccProfile(InputStream stream) {#createIccProfile-java.io.InputStream-}
```
public XpsIccProfile createIccProfile(InputStream stream)
```


stream から新しい ICC プロファイルリソースを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| ストリーム | java.io.InputStream | リソースとして使用する ICC プロファイルを含むストリーム。 |

**Returns:**
[XpsIccProfile](../../com.aspose.xps/xpsiccprofile) - New ICC profile resource.
### createIccProfile(String iccProfilePath) {#createIccProfile-java.lang.String-}
```
public XpsIccProfile createIccProfile(String iccProfilePath)
```


iccProfilePath にある ICC プロファイルファイルから新しい ICC プロファイルリソースを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| iccProfilePath | java.lang.String | リソースとして使用する ICC プロファイルへのパス。 |

**Returns:**
[XpsIccProfile](../../com.aspose.xps/xpsiccprofile) - New ICC profile resource.
### createImage(InputStream stream) {#createImage-java.io.InputStream-}
```
public XpsImage createImage(InputStream stream)
```


stream から新しい画像リソースを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| ストリーム | java.io.InputStream | リソースとして使用する画像を含むストリーム。 |

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - New image resource.
### createImage(String imagePath) {#createImage-java.lang.String-}
```
public XpsImage createImage(String imagePath)
```


imagePath にある画像ファイルから新しい画像リソースを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| イメージパス | java.lang.String | リソースとして使用する画像へのパス。 |

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - New image resource.
### createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)
```


新しいイメージブラシを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| image | [XpsImage](../../com.aspose.xps/xpsimage) | 画像リソースです。 |
| ビュー ボックス | java.awt.geom.Rectangle2D | ブラシのソースコンテンツの位置とサイズです。 |
| ビューポート | java.awt.geom.Rectangle2D | プライムブラシタイルが含まれる座標空間内の領域で、（必要に応じて繰り返し）ブラシが適用される領域を埋めるために適用される領域です。 |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)
```


新しいイメージブラシを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| イメージパス | java.lang.String | ブラシタイルとして使用する画像へのパスです。 |
| ビュー ボックス | java.awt.geom.Rectangle2D | ブラシのソースコンテンツの位置とサイズです。 |
| ビューポート | java.awt.geom.Rectangle2D | プライムブラシタイルが含まれる座標空間内の領域で、（必要に応じて繰り返し）ブラシが適用される領域を埋めるために適用される領域です。 |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createLinearGradientBrush(Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(Point2D startPoint, Point2D endPoint)
```


新しい線形グラデーションブラシを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| 開始点 | java.awt.geom.Point2D | 線形グラデーションの開始点です。 |
| 終了点 | java.awt.geom.Point2D | 線形グラデーションの終了点です。 |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)
```


新しい線形グラデーションブラシを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| グラデーションストップ | java.util.List<com.aspose.xps.XpsGradientStop> | グラデーションストップのリストです。 |
| 開始点 | java.awt.geom.Point2D | 線形グラデーションの開始点です。 |
| 終了点 | java.awt.geom.Point2D | 線形グラデーションの終了点です。 |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createMatrix(float m11, float m12, float m21, float m22, float m31, float m32) {#createMatrix-float-float-float-float-float-float-}
```
public XpsMatrix createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)
```


新しいアフィン変換行列を作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| m11 | float | 要素 11です。 |
| m12 | float | 要素 12です。 |
| m21 | float | 要素 21です。 |
| m22 | float | 要素 22です。 |
| m31 | float | 要素 31。 |
| m32 | float | 要素 32。 |

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - New affine transformation matrix.
### createPath(XpsPathGeometry data) {#createPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath createPath(XpsPathGeometry data)
```


新しいパスを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | パスのジオメトリ。 |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - New path.
### createPathFigure(Point2D startPoint) {#createPathFigure-java.awt.geom.Point2D-}
```
public XpsPathFigure createPathFigure(Point2D startPoint)
```


新しいオープンパス図形を作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| 開始点 | java.awt.geom.Point2D | パス図形の最初のセグメントの開始点。 |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, boolean isClosed)
```


新しいパス図形を作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| 開始点 | java.awt.geom.Point2D | パス図形の最初のセグメントの開始点。 |
| isClosed | boolean | パスが閉じているかどうかを指定します。true に設定すると、ストロークは "closed" と描画され、つまりパス図形の最後のセグメントの最後の点が StartPoint 属性で指定された点と接続されます。false の場合、ストロークは "open" と描画され、最後の点は開始点と接続されません。これは、ストロークを指定する Path 要素でパス図形が使用されている場合にのみ適用されます。 |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)
```


新しいオープンパス図形を作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| 開始点 | java.awt.geom.Point2D | パス図形の最初のセグメントの開始点。 |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | パスセグメントのリスト。 |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)
```


新しいパス図形を作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| 開始点 | java.awt.geom.Point2D | パス図形の最初のセグメントの開始点。 |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | パスセグメントのリスト。 |
| isClosed | boolean | パスが閉じているかどうかを指定します。true に設定すると、ストロークは "closed" と描画され、つまりパス図形の最後のセグメントの最後の点が StartPoint 属性で指定された点と接続されます。false の場合、ストロークは "open" と描画され、最後の点は開始点と接続されません。これは、ストロークを指定する Path 要素でパス図形が使用されている場合にのみ適用されます。 |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathGeometry() {#createPathGeometry--}
```
public XpsPathGeometry createPathGeometry()
```


新しいパスジオメトリを作成します。

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(String abbreviatedGeometry) {#createPathGeometry-java.lang.String-}
```
public XpsPathGeometry createPathGeometry(String abbreviatedGeometry)
```


省略形で指定された新しいパスジオメトリを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| abbreviatedGeometry | java.lang.String | パスジオメトリの省略形。 |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(List<XpsPathFigure> pathFigures) {#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--}
```
public XpsPathGeometry createPathGeometry(List<XpsPathFigure> pathFigures)
```


指定されたパス図形のリストで新しいパスジオメトリを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| pathFigures | java.util.List<com.aspose.xps.XpsPathFigure> | パス図形のリスト。 |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPolyBezierSegment(Point2D[] points) {#createPolyBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points)
```


ストロークされた立方ベジエ曲線の新しいセットを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | 複数のベジエセグメントの制御点。 |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyBezierSegment(Point2D[] points, boolean isStroked) {#createPolyBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points, boolean isStroked)
```


立方ベジエ曲線の新しいセットを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | 複数のベジエセグメントの制御点。 |
| isStroked | boolean | パスのこのセグメントのストロークが描画されるかどうかを指定します。 |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyLineSegment(Point2D[] points) {#createPolyLineSegment-java.awt.geom.Point2D---}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points)
```


任意の数の個々の頂点を含む新しいストロークされた多角形描画を作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | ポリラインセグメントを定義する複数のセグメントの座標セット。 |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyLineSegment(Point2D[] points, boolean isStroked) {#createPolyLineSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points, boolean isStroked)
```


任意の数の個々の頂点を含む新しい多角形描画を作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | ポリラインセグメントを定義する複数のセグメントの座標セット。 |
| isStroked | boolean | パスのこのセグメントのストロークが描画されるかどうかを指定します。 |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyQuadraticBezierSegment(Point2D[] points) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points)
```


パス図形の前の点から指定された制御点を使用して頂点のセットを通過する、ストロークされた二次ベジエ曲線の新しいセットを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | 複数の二次ベジエセグメントの制御点。 |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)
```


パス図形の前の点から指定された制御点を使用して頂点のセットを通過する、二次ベジエ曲線の新しいセットを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | 複数の二次ベジエセグメントの制御点。 |
| isStroked | boolean | パスのこのセグメントのストロークが描画されるかどうかを指定します。 |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


新しい放射状グラデーションブラシを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| center | java.awt.geom.Point2D | 放射状グラデーションの中心点（すなわち楕円の中心）。 |
| gradientOrigin | java.awt.geom.Point2D | 放射状グラデーションの起点。 |
| radiusX | float | 放射状グラデーションを定義する楕円の x 軸方向の半径です。 |
| radiusY | float | 放射状グラデーションを定義する楕円の y 軸方向の半径です。 |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


新しい放射状グラデーションブラシを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| グラデーションストップ | java.util.List<com.aspose.xps.XpsGradientStop> | グラデーションストップのリストです。 |
| center | java.awt.geom.Point2D | 放射状グラデーションの中心点（すなわち楕円の中心）。 |
| gradientOrigin | java.awt.geom.Point2D | 放射状グラデーションの起点。 |
| radiusX | float | 放射状グラデーションを定義する楕円の x 軸方向の半径です。 |
| radiusY | float | 放射状グラデーションを定義する楕円の y 軸方向の半径です。 |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createSolidColorBrush(XpsColor color) {#createSolidColorBrush-com.aspose.xps.XpsColor-}
```
public XpsSolidColorBrush createSolidColorBrush(XpsColor color)
```


新しい単色ブラシを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | 塗りつぶし要素の色です。 |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createSolidColorBrush(Color color) {#createSolidColorBrush-java.awt.Color-}
```
public XpsSolidColorBrush createSolidColorBrush(Color color)
```


新しい単色ブラシを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| color | java.awt.Color | 塗りつぶし要素の色です。 |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport) {#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsVisualBrush createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)
```


新しいビジュアルブラシを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| element | [XpsContentElement](../../com.aspose.xps/xpscontentelement) | Visual プロパティ（ビジュアルブラシ）のための XPS 要素（Canvas、Path、または Glyphs）。 |
| ビュー ボックス | java.awt.geom.Rectangle2D | ブラシのソースコンテンツの位置とサイズです。 |
| ビューポート | java.awt.geom.Rectangle2D | プライムブラシタイルが含まれる座標空間内の領域で、（必要に応じて繰り返し）ブラシが適用される領域を埋めるために適用される領域です。 |

**Returns:**
[XpsVisualBrush](../../com.aspose.xps/xpsvisualbrush) - New visual brush.
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
### getActiveDocument() {#getActiveDocument--}
```
public int getActiveDocument()
```


アクティブなドキュメント番号を返します。

**Returns:**
int - 整数値。
### getActivePage() {#getActivePage--}
```
public int getActivePage()
```


アクティブなドキュメント内のアクティブなページ番号を返します。

**Returns:**
int - 整数値。
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDocumentCount() {#getDocumentCount--}
```
public int getDocumentCount()
```


XPS パッケージ内のドキュメント数を返します。

**Returns:**
int - XPS パッケージ内のドキュメント数。
### getDocumentPrintTicket(int documentIndex) {#getDocumentPrintTicket-int-}
```
public DocumentPrintTicket getDocumentPrintTicket(int documentIndex)
```


documentIndex でインデックスされたドキュメントの印刷チケットを取得します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| documentIndex | int | 返却する印刷チケットを持つドキュメントのインデックス。 |

**Returns:**
[DocumentPrintTicket](../../com.aspose.xps.metadata/documentprintticket) - Document's print ticket.
### getJobPrintTicket() {#getJobPrintTicket--}
```
public JobPrintTicket getJobPrintTicket()
```


ドキュメントのジョブ印刷チケットを返します。

**Returns:**
[JobPrintTicket](../../com.aspose.xps.metadata/jobprintticket) - The document's job print ticket.
### getPage() {#getPage--}
```
public XpsPage getPage()
```


アクティブなページの XpsPage インスタンスを返します。

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - The  XpsPage  instance for active page.
### getPageCount() {#getPageCount--}
```
public int getPageCount()
```


アクティブなドキュメントのページ数を返します。

**Returns:**
int - アクティブなドキュメントのページ数です。
### getPagePrintTicket(int documentIndex, int pageIndex) {#getPagePrintTicket-int-int-}
```
public PagePrintTicket getPagePrintTicket(int documentIndex, int pageIndex)
```


documentIndex でインデックスされたドキュメント内の pageIndex でインデックスされたページの印刷チケットを取得します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| documentIndex | int | ドキュメントのインデックス。 |
| pageIndex | int | 返却する印刷チケットを持つページのインデックス。 |

**Returns:**
[PagePrintTicket](../../com.aspose.xps.metadata/pageprintticket) - Page's print ticket.
### getTotalPageCount() {#getTotalPageCount--}
```
public int getTotalPageCount()
```


XPS ドキュメント内のすべてのドキュメントの総ページ数を返します。

**Returns:**
int - XPS ドキュメント内のすべてのドキュメントの総ページ数です。
### getUtils() {#getUtils--}
```
public DocumentUtils getUtils()
```


正式な XPS 操作 API を超えるユーティリティを提供するオブジェクトを取得します。

**Returns:**
[DocumentUtils](../../com.aspose.xps/documentutils) - The utilities object.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### insertCanvas(int index) {#insertCanvas-int-}
```
public XpsCanvas insertCanvas(int index)
```


index の位置にアクティブなページへ新しいキャンバスを挿入します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| インデックス | int | 新しい Canvas を挿入すべき位置です。 |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertDocument(int index) {#insertDocument-int-}
```
public void insertDocument(int index)
```


index の位置にデフォルトのページサイズの空のドキュメントを挿入し、挿入されたドキュメントをアクティブに選択します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| インデックス | int | ドキュメントを挿入すべき位置。 |

### insertDocument(int index, boolean activate) {#insertDocument-int-boolean-}
```
public void insertDocument(int index, boolean activate)
```


index の位置にデフォルトのページサイズの空のドキュメントを挿入します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| インデックス | int | ドキュメントを挿入すべき位置。 |
| アクティブ化 | boolean | 挿入されたドキュメントをアクティブとして選択するかどうかを示すフラグ。 |

### insertDocument(int index, float width, float height) {#insertDocument-int-float-float-}
```
public void insertDocument(int index, float width, float height)
```


index の位置に最初のページの width と height を持つ空のドキュメントを挿入し、挿入されたドキュメントをアクティブに選択します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| インデックス | int | ドキュメントを挿入すべき位置。 |
| width | float | 最初のページの幅。 |
| height | float | 最初のページの高さ。 |

### insertDocument(int index, float width, float height, boolean activate) {#insertDocument-int-float-float-boolean-}
```
public void insertDocument(int index, float width, float height, boolean activate)
```


インデックス 位置 に、width と height の最初のページ寸法を持つ空のドキュメントを挿入します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| インデックス | int | ドキュメントを挿入すべき位置。 |
| width | float | 最初のページの幅。 |
| height | float | 最初のページの高さ。 |
| アクティブ化 | boolean | 挿入されたドキュメントをアクティブとして選択するかどうかを示すフラグ。 |

### insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString) {#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)
```


インデックス 位置 にアクティブページへ新しいグリフを挿入します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| インデックス | int | 新しい Glyphs を挿入すべき位置です。 |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | フォントリソース。 |
| fontSize | float | フォントサイズ。 |
| originX | float | グリフの原点 X 座標。 |
| originY | float | グリフの原点 Y 座標。 |
| unicodeString | java.lang.String | 印刷される文字列。 |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


インデックス 位置 にアクティブページへ新しいグリフを挿入します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| インデックス | int | 新しい Glyphs を挿入すべき位置です。 |
| fontFamily | java.lang.String | フォントファミリー。 |
| fontSize | float | フォントサイズ。 |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | フォントスタイル。 |
| originX | float | グリフの原点 X 座標。 |
| originY | float | グリフの原点 Y 座標。 |
| unicodeString | java.lang.String | 印刷される文字列。 |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertPage(int index) {#insertPage-int-}
```
public XpsPage insertPage(int index)
```


インデックス 位置 にデフォルトページサイズの空ページをドキュメントに挿入し、挿入されたページをアクティブに選択します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| インデックス | int | ページを挿入すべき位置。 |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, boolean activate) {#insertPage-int-boolean-}
```
public XpsPage insertPage(int index, boolean activate)
```


インデックス 位置 にデフォルトページサイズの空ページをドキュメントに挿入します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| インデックス | int | ページを挿入すべき位置。 |
| アクティブ化 | boolean | 挿入されたページをアクティブとして選択するかどうかを示すフラグ。 |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, XpsPage page) {#insertPage-int-com.aspose.xps.XpsPage-}
```
public XpsPage insertPage(int index, XpsPage page)
```


インデックス 位置 にページをドキュメントに挿入し、挿入されたページをアクティブに選択します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| インデックス | int | ページを追加すべき位置。 |
| page | [XpsPage](../../com.aspose.xps/xpspage) | 挿入するページ。 |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, XpsPage page, boolean activate) {#insertPage-int-com.aspose.xps.XpsPage-boolean-}
```
public XpsPage insertPage(int index, XpsPage page, boolean activate)
```


インデックス 位置 にページをドキュメントに挿入します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| インデックス | int | ページを追加すべき位置。 |
| page | [XpsPage](../../com.aspose.xps/xpspage) | 挿入するページ。 |
| アクティブ化 | boolean | 挿入されたページをアクティブとして選択するかどうかを示すフラグ。 |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, float width, float height) {#insertPage-int-float-float-}
```
public XpsPage insertPage(int index, float width, float height)
```


インデックス 位置 に指定された width と height の空ページをドキュメントに挿入し、挿入されたページをアクティブに選択します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| インデックス | int | ページを挿入すべき位置。 |
| width | float | 新しいページの幅。 |
| height | float | 新しいページの高さ。 |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, float width, float height, boolean activate) {#insertPage-int-float-float-boolean-}
```
public XpsPage insertPage(int index, float width, float height, boolean activate)
```


インデックス 位置 に指定された width と height の空ページをドキュメントに挿入します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| インデックス | int | ページを挿入すべき位置。 |
| width | float | 新しいページの幅。 |
| height | float | 新しいページの高さ。 |
| アクティブ化 | boolean | 挿入されたページをアクティブとして選択するかどうかを示すフラグ。 |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


インデックス 位置 にアクティブページへ新しいパスを挿入します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| インデックス | int | 新しい Path を挿入すべき位置です。 |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | パスのジオメトリ。 |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
### isLicensed() {#isLicensed--}
```
public boolean isLicensed()
```


Aspose.Page for Java 製品ライセンスがアクセスされ、有効かどうかを示します。

**Returns:**
boolean - 真偽値
### merge(String[] filesForMerge, OutputStream outStream) {#merge-java.lang.String---java.io.OutputStream-}
```
public void merge(String[] filesForMerge, OutputStream outStream)
```


複数の XPS ファイルを 1 つの XPS ドキュメントに結合します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | このドキュメントとマージする XPS ファイル。 |
| outStream | java.io.OutputStream | マージされた XPS ドキュメントを保存する出力ストリーム。 |

### merge(String[] filesForMerge, String outXpsFilePath) {#merge-java.lang.String---java.lang.String-}
```
public void merge(String[] filesForMerge, String outXpsFilePath)
```


複数の XPS ファイルを 1 つの XPS ドキュメントに結合します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | このドキュメントとマージする XPS ファイル。 |
| outXpsFilePath | java.lang.String | 出力 XPS ファイルのパス。 |

### mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options) {#mergeToPdf-java.lang.String-java.lang.String---com.aspose.xps.rendering.PdfSaveOptions-}
```
public void mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options)
```


Device インスタンスを使用して XPS ドキュメントを PDF に結合します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | 出力 PDF ファイルのパス。 |
| filesForMerge | java.lang.String[] | このドキュメントを出力デバイスにマージするための XPS ファイル。 |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | ドキュメント保存オプション。 |

### mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options) {#mergeToPdf-java.lang.String---java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options)
```


Device インスタンスを使用して XPS ドキュメントを PDF に結合します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | このドキュメントを出力デバイスにマージするための XPS ファイル。 |
| pdfStream | java.io.OutputStream | 結果の PDF を書き込む出力ストリーム。 |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | ドキュメント保存オプション。 |

### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### removeAt(int index) {#removeAt-int-}
```
public XpsContentElement removeAt(int index)
```


インデックス 位置 からアクティブページの要素を削除します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| インデックス | int | 要素を削除すべき位置です。 |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Removed element.
### removeDocumentAt(int index) {#removeDocumentAt-int-}
```
public void removeDocumentAt(int index)
```


インデックス 位置 のドキュメントを削除します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| インデックス | int | ドキュメントを削除すべき位置。 |

### removePage(XpsPage page) {#removePage-com.aspose.xps.XpsPage-}
```
public XpsPage removePage(XpsPage page)
```


ドキュメントからページを削除します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | 削除するページ。 |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Removed page.
### removePageAt(int index) {#removePageAt-int-}
```
public XpsPage removePageAt(int index)
```


インデックス 位置 のドキュメントからページを削除します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| インデックス | int | ページを削除すべき位置。 |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Removed page.
### save(Device device, SaveOptions options) {#save-com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void save(Device device, SaveOptions options)
```


Device インスタンスを使用してドキュメントを保存します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| device | [Device](../../com.aspose.page/device) | Device のインスタンス。 |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | ドキュメント保存オプション。 |

### save(OutputStream stream) {#save-java.io.OutputStream-}
```
public void save(OutputStream stream)
```


XPS ドキュメントをストリームに保存します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| ストリーム | java.io.OutputStream | 保存先となる XPS ドキュメントのストリーム。 |

### save(String path) {#save-java.lang.String-}
```
public void save(String path)
```


path にある XPS ファイルに XPS ドキュメントを保存します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| path | java.lang.String | ドキュメントの場所。 |

### saveAsImage(ImageSaveOptions options) {#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-}
```
public void saveAsImage(ImageSaveOptions options)
```


ドキュメントを画像ファイルに保存します。出力ディレクトリとファイル名は入力 XPS ファイルと同じになります。ファイル拡張子は "options" パラメーターの画像形式に対応します。ドキュメントが FileInputStream 以外のストリームで初期化されている場合、画像ファイルはデフォルトのファイル名テンプレートで現在のフォルダーに保存されます。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | ビットマップ画像形式でドキュメントを保存するためのオプション。 |

### saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate) {#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-java.lang.String-java.lang.String-}
```
public void saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)
```


指定されたディレクトリとファイル名でドキュメントを画像ファイルに保存します。ファイル拡張子は "options" パラメーターの画像形式に対応します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | ビットマップ画像形式でドキュメントを保存するためのオプション。 |
| outDir | java.lang.String | 画像ファイルが保存される出力ディレクトリ。 |
| fileNameTemplate | java.lang.String | 画像のファイル名テンプレート（拡張子なし）。入力 XPS ファイルが 1 ページの場合は正確にそのファイル名になります。それ以外の場合は "\_[n]" となり、"n" は 1 から始まるページ番号です。この後にサフィックスが付加されます。ファイル拡張子は "option" パラメーターの画像形式に対応します。 |

### saveAsImageBytes(ImageSaveOptions options) {#saveAsImageBytes-com.aspose.xps.rendering.ImageSaveOptions-}
```
public byte[][][] saveAsImageBytes(ImageSaveOptions options)
```


ドキュメントをビットマップ画像形式でバイト配列として保存します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | ビットマップ画像形式でドキュメントを保存するためのオプション。 |

**Returns:**
byte[][][] - 結果として得られる画像のバイト配列。第1次元は内部ドキュメント用、第2次元は内部ドキュメント内のページ用です。
### saveAsPdf(OutputStream stream, PdfSaveOptions options) {#saveAsPdf-java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void saveAsPdf(OutputStream stream, PdfSaveOptions options)
```


ドキュメントを PDF 形式で保存します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| ストリーム | java.io.OutputStream | 出力 PDF ファイルを書き込むストリーム。 |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | PDF 形式でドキュメントを保存するためのオプション。 |

### saveAsPdf(String outPdfFilePath, PdfSaveOptions options) {#saveAsPdf-java.lang.String-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void saveAsPdf(String outPdfFilePath, PdfSaveOptions options)
```


ドキュメントを PDF 形式で保存します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | 出力 PDF ファイルのパス。 |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | PDF 形式でドキュメントを保存するためのオプション。 |

### saveAsPs(OutputStream stream, PsSaveOptions options) {#saveAsPs-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public void saveAsPs(OutputStream stream, PsSaveOptions options)
```


ドキュメントを PS 形式で保存します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| ストリーム | java.io.OutputStream | 出力 PS ファイルを書き込むストリーム。 |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | PS 形式でドキュメントを保存するためのオプション。 |

### saveAsPs(String outPsFilePath, PsSaveOptions options) {#saveAsPs-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public void saveAsPs(String outPsFilePath, PsSaveOptions options)
```


ドキュメントを PostSscript 形式で保存します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| outPsFilePath | java.lang.String | 出力 PostScript ファイルのパス。 |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | PDF 形式でドキュメントを保存するためのオプション。 |

### selectActiveDocument(int documentNumber) {#selectActiveDocument-int-}
```
public void selectActiveDocument(int documentNumber)
```


編集用にアクティブなドキュメントを選択します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| documentNumber | int | ドキュメント番号。 |

### selectActivePage(int pageNumber) {#selectActivePage-int-}
```
public XpsPage selectActivePage(int pageNumber)
```


編集用にアクティブなドキュメントページを選択します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| pageNumber | int | ページ番号。 |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) -  XpsPage  instance for active page.
### setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket) {#setDocumentPrintTicket-int-com.aspose.xps.metadata.DocumentPrintTicket-}
```
public void setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket)
```


printTicket を documentIndex でインデックス付けされたドキュメントにリンクします。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| documentIndex | int | 印刷チケットをリンクするドキュメントのインデックス。 |
| printTicket | [DocumentPrintTicket](../../com.aspose.xps.metadata/documentprintticket) | リンクする印刷チケット。 |

### setJobPrintTicket(JobPrintTicket value) {#setJobPrintTicket-com.aspose.xps.metadata.JobPrintTicket-}
```
public void setJobPrintTicket(JobPrintTicket value)
```


ドキュメントのジョブ印刷チケットを設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | [JobPrintTicket](../../com.aspose.xps.metadata/jobprintticket) | ドキュメントのジョブ印刷チケット。 |

### setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket) {#setPagePrintTicket-int-int-com.aspose.xps.metadata.PagePrintTicket-}
```
public void setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket)
```


printTicket を documentIndex でインデックス付けされたドキュメント内の pageIndex でインデックス付けされたページにリンクします。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| documentIndex | int | ドキュメントのインデックス。 |
| pageIndex | int | 印刷チケットをリンクするページのインデックス。 |
| printTicket | [PagePrintTicket](../../com.aspose.xps.metadata/pageprintticket) | リンクする印刷チケット。 |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
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

