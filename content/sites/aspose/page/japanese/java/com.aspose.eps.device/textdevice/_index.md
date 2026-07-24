---
title: "TextDevice"
second_title: "Aspose.Page for Java API リファレンス"
description: 
type: docs
weight: 13
url: /ja/java/com.aspose.eps.device/textdevice/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Device](../../com.aspose.page/device)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPageDevice](../../com.aspose.page/imultipagedevice)
```
public class TextDevice extends Device implements IMultiPageDevice
```
## コンストラクタ

| コンストラクタ | 説明 |
| --- | --- |
| [TextDevice()](#TextDevice--) |  |
## フィールド

| フィールド | 説明 |
| --- | --- |
| [DEFAULT_SIZE](#DEFAULT-SIZE) |  |
| [EMIT_ERRORS](#EMIT-ERRORS) |  |
| [EMIT_WARNINGS](#EMIT-WARNINGS) |  |
| [VERSION](#VERSION) | 現在のデバイスバージョンです。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [closePage()](#closePage--) |  |
| [create()](#create--) |  |
| [dispose()](#dispose--) |  |
| [draw(Shape path)](#draw-java.awt.Shape-) | パスを描画します。 |
| [drawArc(float x, float y, float width, float height, float startAngle, float arcAngle)](#drawArc-float-float-float-float-float-float-) | 円弧を描画します。 |
| [drawImage(BufferedImage image, AffineTransform transform, Color bkg)](#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-) | 割り当てられた変換と背景で画像を描画します。 |
| [drawLine(float x1, float y1, float x2, float y2)](#drawLine-float-float-float-float-) | 線分を描画します。 |
| [drawOval(float x, float y, float width, float height)](#drawOval-float-float-float-float-) | 楕円を描画します。 |
| [drawPolygon(float[] xPoints, float[] yPoints, int nPoints)](#drawPolygon-float---float---int-) | 多角形を描画します。 |
| [drawPolygon(int[] xPoints, int[] yPoints, int nPoints)](#drawPolygon-int---int---int-) | 多角形を描画します。 |
| [drawPolyline(float[] xPoints, float[] yPoints, int nPoints)](#drawPolyline-float---float---int-) | ポリラインを描画します。 |
| [drawPolyline(int[] xPoints, int[] yPoints, int nPoints)](#drawPolyline-int---int---int-) | ポリラインを描画します。 |
| [drawRect(float x, float y, float width, float height)](#drawRect-float-float-float-float-) | 矩形を描画します。 |
| [drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)](#drawRoundRect-float-float-float-float-float-float-) | 丸角長方形を描画します。 |
| [drawString(String str, float x, float y)](#drawString-java.lang.String-float-float-) |  |
| [endDocument()](#endDocument--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fill(Shape path)](#fill-java.awt.Shape-) | パスを塗りつぶします。 |
| [fillArc(float x, float y, float width, float height, float startAngle, float arcAngle)](#fillArc-float-float-float-float-float-float-) | 円弧を塗りつぶします。 |
| [fillOval(float x, float y, float width, float height)](#fillOval-float-float-float-float-) | 楕円を塗りつぶします。 |
| [fillPolygon(float[] xPoints, float[] yPoints, int nPoints)](#fillPolygon-float---float---int-) | 多角形を塗りつぶします。 |
| [fillPolygon(int[] xPoints, int[] yPoints, int nPoints)](#fillPolygon-int---int---int-) | 多角形を塗りつぶします。 |
| [fillRect(float x, float y, float width, float height)](#fillRect-float-float-float-float-) | 長方形を塗りつぶします。 |
| [fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)](#fillRoundRect-float-float-float-float-float-float-) | 丸角長方形を描画します。 |
| [getBackground()](#getBackground--) | ページの現在の背景を取得します。 |
| [getCharTM()](#getCharTM--) | 現在の文字変換を取得します。 |
| [getClass()](#getClass--) |  |
| [getCreator()](#getCreator--) | 結果として得られるデバイス出力の作成者を取得します。 |
| [getCurrentPageNumber()](#getCurrentPageNumber--) |  |
| [getFont()](#getFont--) | 現在のフォントを取得します。 |
| [getOpacity()](#getOpacity--) | 現在の不透明度を取得します。 |
| [getOpacityMask()](#getOpacityMask--) | 現在の不透明度マスクを取得します。 |
| [getPages()](#getPages--) |  |
| [getPaint()](#getPaint--) | 現在のペイントを取得します。 |
| [getProperties()](#getProperties--) | メタデータを含むデバイスプロパティを取得します。 |
| [getProperty(String key)](#getProperty-java.lang.String-) | 文字列プロパティの値を取得します。 |
| [getPropertyColor(String key)](#getPropertyColor-java.lang.String-) | 色プロパティの値を取得します。 |
| [getPropertyDouble(String key)](#getPropertyDouble-java.lang.String-) | double プロパティの値を取得します。 |
| [getPropertyInt(String key)](#getPropertyInt-java.lang.String-) | 整数プロパティの値を取得します。 |
| [getPropertyMargins(String key)](#getPropertyMargins-java.lang.String-) | 余白プロパティの値を取得します。 |
| [getPropertyMatrix(String key)](#getPropertyMatrix-java.lang.String-) | 行列プロパティの値を取得します。 |
| [getPropertyRectangle(String key)](#getPropertyRectangle-java.lang.String-) | 長方形プロパティの値を取得します。 |
| [getPropertySize(String key)](#getPropertySize-java.lang.String-) | サイズプロパティの値を取得します。 |
| [getSaveOptions()](#getSaveOptions--) | 保存オプションを返します。 |
| [getSize()](#getSize--) | ページのサイズを取得します。 |
| [getStroke()](#getStroke--) | 現在のストロークを取得します。 |
| [getText()](#getText--) |  |
| [getText(int startPage, int endPage)](#getText-int-int-) |  |
| [getTextRenderingMode()](#getTextRenderingMode--) | 現在のテキスト描画モードを取得します。 |
| [getTextStrokeWidth()](#getTextStrokeWidth--) | 現在のテキストストローク幅を取得します。 |
| [getTransform()](#getTransform--) | 現在の変換を取得します。 |
| [hashCode()](#hashCode--) |  |
| [initClip()](#initClip--) | デバイスのクリップを初期化します。 |
| [initPageNumbers()](#initPageNumbers--) |  |
| [isDirectRGB()](#isDirectRGB--) |  |
| [isMainDocument()](#isMainDocument--) |  |
| [isProperty(String key)](#isProperty-java.lang.String-) | ブールプロパティの値を取得します。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [openPage(float width, float height)](#openPage-float-float-) |  |
| [openPage(String title)](#openPage-java.lang.String-) |  |
| [renew()](#renew--) |  |
| [renewForMerge(boolean mainDocument)](#renewForMerge-boolean-) |  |
| [reset()](#reset--) |  |
| [reset(boolean zeroPageNumbers)](#reset-boolean-) |  |
| [rotate(double theta)](#rotate-double-) | 現在の変換行列を回転させます。 |
| [rotate(double theta, double x, double y)](#rotate-double-double-double-) | 現在の変換行列を点の周りで回転させます。 |
| [scale(double x, double y)](#scale-double-double-) | 現在の変換行列を拡大縮小します。 |
| [setBackground(Color background)](#setBackground-java.awt.Color-) | ページの現在の背景を指定します。 |
| [setCharTM(AffineTransform charTM)](#setCharTM-java.awt.geom.AffineTransform-) | 文字の変換を指定します。 |
| [setClip(Shape clipPath)](#setClip-java.awt.Shape-) | デバイスのクリップを指定します。 |
| [setCreator(String creator)](#setCreator-java.lang.String-) | 結果として得られるデバイス出力の作成者を指定します。 |
| [setFont(ITrFont font)](#setFont-com.aspose.page.ITrFont-) | フォントを指定します。 |
| [setOpacity(float opacity)](#setOpacity-float-) | 不透明度を指定します。 |
| [setOpacityMask(Paint opacityMask)](#setOpacityMask-java.awt.Paint-) | 不透明度マスクを指定します。 |
| [setPaint(Paint paint)](#setPaint-java.awt.Paint-) | ペイントを指定します。 |
| [setProperties(UserProperties props)](#setProperties-com.aspose.page.UserProperties-) | メタデータを含むデバイスプロパティを指定します。 |
| [setSaveOptions(SaveOptions options)](#setSaveOptions-com.aspose.page.SaveOptions-) | レンダリングプロセスの管理オプションを指定します。 |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) |  |
| [setStroke(Stroke stroke)](#setStroke-java.awt.Stroke-) | ストロークを指定します。 |
| [setTextRenderingMode(TextRenderingMode textRenderingMode)](#setTextRenderingMode-com.aspose.page.TextRenderingMode-) | テキスト描画モードを指定します。 |
| [setTextStrokeWidth(float textStrokeWidth)](#setTextStrokeWidth-float-) | テキストストローク幅を指定します。 |
| [setTransform(AffineTransform transform)](#setTransform-java.awt.geom.AffineTransform-) | 現在の変換を指定します。 |
| [shear(double shx, double shy)](#shear-double-double-) | 現在の変換行列をせん断します。 |
| [startDocument()](#startDocument--) |  |
| [toString()](#toString--) |  |
| [transform(AffineTransform transform)](#transform-java.awt.geom.AffineTransform-) | 現在の変換行列を変換します。 |
| [translate(double x, double y)](#translate-double-double-) | 現在の変換行列を平行移動します。 |
| [updatePageParameters(IMultiPageDevice device)](#updatePageParameters-com.aspose.page.IMultiPageDevice-) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
| [writeComment(String comment)](#writeComment-java.lang.String-) | コメントを書き込みます。 |
| [writeString(ITrFont font, String str)](#writeString-com.aspose.page.ITrFont-java.lang.String-) | 指定されたフォントで文字列を書き出します。 |
| [writeWarning(String warning)](#writeWarning-java.lang.String-) |  |
### TextDevice() {#TextDevice--}
```
public TextDevice()
```


### DEFAULT_SIZE {#DEFAULT-SIZE}
```
public static final Dimension DEFAULT_SIZE
```


### EMIT_ERRORS {#EMIT-ERRORS}
```
public static final String EMIT_ERRORS
```


### EMIT_WARNINGS {#EMIT-WARNINGS}
```
public static final String EMIT_WARNINGS
```


### VERSION {#VERSION}
```
public static String VERSION
```


現在のデバイスバージョンです。

### closePage() {#closePage--}
```
public void closePage()
```


ページがレンダリングされた後、デバイスの必要な準備を行います。

### create() {#create--}
```
public Device create()
```


このデバイスのコピーを作成します。

**Returns:**
[Device](../../com.aspose.page/device)
### dispose() {#dispose--}
```
public void dispose()
```


デバイスを破棄します。

### draw(Shape path) {#draw-java.awt.Shape-}
```
public void draw(Shape path)
```


パスを描画します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| path | java.awt.Shape | 描画するパス。 |

### drawArc(float x, float y, float width, float height, float startAngle, float arcAngle) {#drawArc-float-float-float-float-float-float-}
```
public void drawArc(float x, float y, float width, float height, float startAngle, float arcAngle)
```


円弧を描画します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| x | float | 弧の中心のX座標。 |
| y | float | 弧の中心のY座標。 |
| width | float | 外接矩形の幅。 |
| height | float | 外接矩形の高さ。 |
| startAngle | float | 弧の開始角度。 |
| arcAngle | float | 弧の角度。 |

### drawImage(BufferedImage image, AffineTransform transform, Color bkg) {#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-}
```
public void drawImage(BufferedImage image, AffineTransform transform, Color bkg)
```


割り当てられた変換と背景で画像を描画します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | 描画する画像。 |
| transform | java.awt.geom.AffineTransform | 変換。 |
| bkg | java.awt.Color | 背景色。 |

### drawLine(float x1, float y1, float x2, float y2) {#drawLine-float-float-float-float-}
```
public void drawLine(float x1, float y1, float x2, float y2)
```


線分を描画します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| x1 | float | セグメントの開始点のX座標。 |
| y1 | float | セグメントの開始点のY座標。 |
| x2 | float | セグメントの終了点のX座標。 |
| y2 | float | セグメントの終了点のY座標。 |

### drawOval(float x, float y, float width, float height) {#drawOval-float-float-float-float-}
```
public void drawOval(float x, float y, float width, float height)
```


楕円を描画します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| x | float | 楕円の中心のX座標。 |
| y | float | 楕円の中心のY座標。 |
| width | float | 外接矩形の幅。 |
| height | float | 外接矩形の高さ。 |

### drawPolygon(float[] xPoints, float[] yPoints, int nPoints) {#drawPolygon-float---float---int-}
```
public void drawPolygon(float[] xPoints, float[] yPoints, int nPoints)
```


多角形を描画します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| xPoints | float[] | 点のX座標。 |
| yPoints | float[] | 点のY座標。 |
| nPoints | int | 点の数です。 |

### drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {#drawPolygon-int---int---int-}
```
public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints)
```


多角形を描画します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| xPoints | int[] | 点のX座標。 |
| yPoints | int[] | 点のY座標。 |
| nPoints | int | 点の数です。 |

### drawPolyline(float[] xPoints, float[] yPoints, int nPoints) {#drawPolyline-float---float---int-}
```
public void drawPolyline(float[] xPoints, float[] yPoints, int nPoints)
```


ポリラインを描画します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| xPoints | float[] | 点のX座標。 |
| yPoints | float[] | 点のY座標。 |
| nPoints | int | 点の数です。 |

### drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {#drawPolyline-int---int---int-}
```
public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints)
```


ポリラインを描画します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| xPoints | int[] | 点のX座標。 |
| yPoints | int[] | 点のY座標。 |
| nPoints | int | 点の数です。 |

### drawRect(float x, float y, float width, float height) {#drawRect-float-float-float-float-}
```
public void drawRect(float x, float y, float width, float height)
```


矩形を描画します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| x | float | 矩形の左上隅のX座標。 |
| y | float | 矩形の左上隅のY座標。 |
| width | float | 矩形の幅。 |
| height | float | 矩形の高さ。 |

### drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight) {#drawRoundRect-float-float-float-float-float-float-}
```
public void drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)
```


丸角長方形を描画します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| x | float | 矩形の左上隅のX座標。 |
| y | float | 矩形の左上隅のY座標。 |
| width | float | 矩形の幅。 |
| height | float | 矩形の高さ。 |
| arcWidth | float | 矩形の角を丸める弧の外接矩形の幅。 |
| arcHeight | float | 矩形の角を丸める弧の外接矩形の高さ。 |

### drawString(String str, float x, float y) {#drawString-java.lang.String-float-float-}
```
public void drawString(String str, float x, float y)
```


指定された点に文字列を描画します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| str | java.lang.String |  |
| x | float |  |
| y | float |  |

### endDocument() {#endDocument--}
```
public void endDocument()
```


ドキュメントがレンダリングされた後、デバイスの必要な準備を行います。

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
### fill(Shape path) {#fill-java.awt.Shape-}
```
public void fill(Shape path)
```


パスを塗りつぶします。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| path | java.awt.Shape | 塗りつぶすパス。 |

### fillArc(float x, float y, float width, float height, float startAngle, float arcAngle) {#fillArc-float-float-float-float-float-float-}
```
public void fillArc(float x, float y, float width, float height, float startAngle, float arcAngle)
```


円弧を塗りつぶします。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| x | float | 弧の中心のX座標。 |
| y | float | 弧の中心のY座標。 |
| width | float | 外接矩形の幅。 |
| height | float | 外接矩形の高さ。 |
| startAngle | float | 弧の開始角度。 |
| arcAngle | float | 弧の角度。 |

### fillOval(float x, float y, float width, float height) {#fillOval-float-float-float-float-}
```
public void fillOval(float x, float y, float width, float height)
```


楕円を塗りつぶします。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| x | float | 楕円の中心のX座標。 |
| y | float | 楕円の中心のY座標。 |
| width | float | 外接矩形の幅。 |
| height | float | 外接矩形の高さ。 |

### fillPolygon(float[] xPoints, float[] yPoints, int nPoints) {#fillPolygon-float---float---int-}
```
public void fillPolygon(float[] xPoints, float[] yPoints, int nPoints)
```


多角形を塗りつぶします。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| xPoints | float[] | 点のX座標。 |
| yPoints | float[] | 点のY座標。 |
| nPoints | int | 点の数です。 |

### fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {#fillPolygon-int---int---int-}
```
public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints)
```


多角形を塗りつぶします。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| xPoints | int[] | 点のX座標。 |
| yPoints | int[] | 点のY座標。 |
| nPoints | int | 点の数です。 |

### fillRect(float x, float y, float width, float height) {#fillRect-float-float-float-float-}
```
public void fillRect(float x, float y, float width, float height)
```


長方形を塗りつぶします。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| x | float | 矩形の左上隅のX座標。 |
| y | float | 矩形の左上隅のY座標。 |
| width | float | 矩形の幅。 |
| height | float | 矩形の高さ。 |

### fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight) {#fillRoundRect-float-float-float-float-float-float-}
```
public void fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)
```


丸角長方形を描画します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| x | float | 矩形の左上隅のX座標。 |
| y | float | 矩形の左上隅のY座標。 |
| width | float | 矩形の幅。 |
| height | float | 矩形の高さ。 |
| arcWidth | float | 矩形の角を丸める弧の外接矩形の幅。 |
| arcHeight | float | 矩形の角を丸める弧の外接矩形の高さ。 |

### getBackground() {#getBackground--}
```
public Color getBackground()
```


ページの現在の背景を取得します。

**Returns:**
java.awt.Color - ページの現在の背景
### getCharTM() {#getCharTM--}
```
public AffineTransform getCharTM()
```


現在の文字変換を取得します。

**Returns:**
java.awt.geom.AffineTransform - 現在の文字変換。
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getCreator() {#getCreator--}
```
public String getCreator()
```


結果として得られるデバイス出力の作成者を取得します。

**Returns:**
java.lang.String - 作成者の値。
### getCurrentPageNumber() {#getCurrentPageNumber--}
```
public int getCurrentPageNumber()
```


現在のページ番号を取得します。

**Returns:**
int
### getFont() {#getFont--}
```
public ITrFont getFont()
```


現在のフォントを取得します。

**Returns:**
[ITrFont](../../com.aspose.page/itrfont) - Current font.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


現在の不透明度を取得します。

**Returns:**
float - 現在の不透明度。
### getOpacityMask() {#getOpacityMask--}
```
public Paint getOpacityMask()
```


現在の不透明度マスクを取得します。

**Returns:**
java.awt.Paint - 現在の不透明度マスク。
### getPages() {#getPages--}
```
public List<String> getPages()
```




**Returns:**
java.util.List<java.lang.String>
### getPaint() {#getPaint--}
```
public Paint getPaint()
```


現在のペイントを取得します。

**Returns:**
java.awt.Paint - 現在の塗料です。
### getProperties() {#getProperties--}
```
public UserProperties getProperties()
```


メタデータを含むデバイスプロパティを取得します。

**Returns:**
[UserProperties](../../com.aspose.page/userproperties) - Device properties.
### getProperty(String key) {#getProperty-java.lang.String-}
```
public String getProperty(String key)
```


文字列プロパティの値を取得します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |

**Returns:**
java.lang.String - プロパティの値。
### getPropertyColor(String key) {#getPropertyColor-java.lang.String-}
```
public Color getPropertyColor(String key)
```


色プロパティの値を取得します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |

**Returns:**
java.awt.Color - プロパティの値。
### getPropertyDouble(String key) {#getPropertyDouble-java.lang.String-}
```
public double getPropertyDouble(String key)
```


double プロパティの値を取得します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |

**Returns:**
double - プロパティの値。
### getPropertyInt(String key) {#getPropertyInt-java.lang.String-}
```
public int getPropertyInt(String key)
```


整数プロパティの値を取得します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |

**Returns:**
int - プロパティの値。
### getPropertyMargins(String key) {#getPropertyMargins-java.lang.String-}
```
public Insets getPropertyMargins(String key)
```


余白プロパティの値を取得します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |

**Returns:**
java.awt.Insets - プロパティの値。
### getPropertyMatrix(String key) {#getPropertyMatrix-java.lang.String-}
```
public AffineTransform getPropertyMatrix(String key)
```


行列プロパティの値を取得します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |

**Returns:**
java.awt.geom.AffineTransform - プロパティの値。
### getPropertyRectangle(String key) {#getPropertyRectangle-java.lang.String-}
```
public Rectangle getPropertyRectangle(String key)
```


長方形プロパティの値を取得します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |

**Returns:**
java.awt.Rectangle - プロパティの値。
### getPropertySize(String key) {#getPropertySize-java.lang.String-}
```
public Dimension getPropertySize(String key)
```


サイズプロパティの値を取得します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |

**Returns:**
java.awt.Dimension - プロパティの値。
### getSaveOptions() {#getSaveOptions--}
```
public SaveOptions getSaveOptions()
```


保存オプションを返します。

**Returns:**
[SaveOptions](../../com.aspose.page/saveoptions) - The save options.
### getSize() {#getSize--}
```
public Dimension getSize()
```


ページのサイズを取得します。

**Returns:**
java.awt.Dimension - ページのサイズ。
### getStroke() {#getStroke--}
```
public Stroke getStroke()
```


現在のストロークを取得します。

**Returns:**
java.awt.Stroke - 現在のストローク。
### getText() {#getText--}
```
public String getText()
```




**Returns:**
java.lang.String
### getText(int startPage, int endPage) {#getText-int-int-}
```
public String getText(int startPage, int endPage)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| startPage | int |  |
| endPage | int |  |

**Returns:**
java.lang.String
### getTextRenderingMode() {#getTextRenderingMode--}
```
public TextRenderingMode getTextRenderingMode()
```


現在のテキスト描画モードを取得します。

**Returns:**
[TextRenderingMode](../../com.aspose.page/textrenderingmode) - Current text rendering mode.
### getTextStrokeWidth() {#getTextStrokeWidth--}
```
public float getTextStrokeWidth()
```


現在のテキストストローク幅を取得します。

**Returns:**
float - 現在のテキストストローク幅。
### getTransform() {#getTransform--}
```
public AffineTransform getTransform()
```


現在の変換を取得します。

**Returns:**
java.awt.geom.AffineTransform - 現在の変換。
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### initClip() {#initClip--}
```
public void initClip()
```


デバイスのクリップを初期化します。

### initPageNumbers() {#initPageNumbers--}
```
public void initPageNumbers()
```


レンダリングするページ数を初期化します。

### isDirectRGB() {#isDirectRGB--}
```
public boolean isDirectRGB()
```


デバイスが直接RGBモード（RGB）を使用しているかどうかを示します。

**Returns:**
boolean
### isMainDocument() {#isMainDocument--}
```
public boolean isMainDocument()
```




**Returns:**
boolean
### isProperty(String key) {#isProperty-java.lang.String-}
```
public boolean isProperty(String key)
```


ブールプロパティの値を取得します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| キー | java.lang.String | プロパティの名前です。 |

**Returns:**
boolean - プロパティの値。
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
public boolean openPage(float width, float height)
```


ページのレンダリング前にデバイスの必要な準備を行います。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| width | float |  |
| height | float |  |

**Returns:**
boolean
### openPage(String title) {#openPage-java.lang.String-}
```
public boolean openPage(String title)
```


ページのレンダリング前にデバイスの必要な準備を行います。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| タイトル | java.lang.String |  |

**Returns:**
boolean
### renew() {#renew--}
```
public void renew()
```


ドキュメント全体の初期状態にデバイスをリセットします。出力ストリームのリセットに使用されます。

### renewForMerge(boolean mainDocument) {#renewForMerge-boolean-}
```
public void renewForMerge(boolean mainDocument)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| mainDocument | boolean |  |

### reset() {#reset--}
```
public void reset()
```


ページの初期状態にデバイスをリセットします。

### reset(boolean zeroPageNumbers) {#reset-boolean-}
```
public void reset(boolean zeroPageNumbers)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| zeroPageNumbers | boolean |  |

### rotate(double theta) {#rotate-double-}
```
public void rotate(double theta)
```


現在の変換行列を回転させます。writeTransform(Transform) を呼び出します。正の角度 theta で回転させると、正の x 軸上の点が正の y 軸方向へ回転します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| theta | double | 回転させるラジアン単位の角度。 |

### rotate(double theta, double x, double y) {#rotate-double-double-double-}
```
public void rotate(double theta, double x, double y)
```


現在の変換行列を点の周りで回転させます。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| theta | double | ラジアン単位の回転角。 |
| x | double | 点の X 座標。 |
| y | double | 点のY座標。 |

### scale(double x, double y) {#scale-double-double-}
```
public void scale(double x, double y)
```


現在の変換行列をスケールします。Calls writeTransform(Transform).

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| x | double | X軸のスケール。 |
| y | double | Y軸のスケール。 |

### setBackground(Color background) {#setBackground-java.awt.Color-}
```
public void setBackground(Color background)
```


ページの現在の背景を指定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| 背景 | java.awt.Color | ページの背景。 |

### setCharTM(AffineTransform charTM) {#setCharTM-java.awt.geom.AffineTransform-}
```
public void setCharTM(AffineTransform charTM)
```


文字の変換を指定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| charTM | java.awt.geom.AffineTransform | \\u0421haracters 変換。 |

### setClip(Shape clipPath) {#setClip-java.awt.Shape-}
```
public void setClip(Shape clipPath)
```


デバイスのクリップを指定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| clipPath | java.awt.Shape | クリッピングパス。 |

### setCreator(String creator) {#setCreator-java.lang.String-}
```
public void setCreator(String creator)
```


結果として得られるデバイス出力の作成者を指定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| 作成者 | java.lang.String | 作成者の値。 |

### setFont(ITrFont font) {#setFont-com.aspose.page.ITrFont-}
```
public void setFont(ITrFont font)
```


フォントを指定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| font | [ITrFont](../../com.aspose.page/itrfont) | フォント。 |

### setOpacity(float opacity) {#setOpacity-float-}
```
public void setOpacity(float opacity)
```


不透明度を指定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| 不透明度 | float | 不透明度。 |

### setOpacityMask(Paint opacityMask) {#setOpacityMask-java.awt.Paint-}
```
public void setOpacityMask(Paint opacityMask)
```


不透明度マスクを指定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| opacityMask | java.awt.Paint | 不透明度マスク。 |

### setPaint(Paint paint) {#setPaint-java.awt.Paint-}
```
public void setPaint(Paint paint)
```


ペイントを指定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| paint | java.awt.Paint | ペイント。 |

### setProperties(UserProperties props) {#setProperties-com.aspose.page.UserProperties-}
```
public void setProperties(UserProperties props)
```


メタデータを含むデバイスプロパティを指定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| props | [UserProperties](../../com.aspose.page/userproperties) | デバイスプロパティ。 |

### setSaveOptions(SaveOptions options) {#setSaveOptions-com.aspose.page.SaveOptions-}
```
public void setSaveOptions(SaveOptions options)
```


レンダリングプロセスの管理オプションを指定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | レンダリングプロセスを管理するオプション。 |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


ページのサイズを指定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| size | java.awt.Dimension |  |

### setStroke(Stroke stroke) {#setStroke-java.awt.Stroke-}
```
public void setStroke(Stroke stroke)
```


ストロークを指定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| stroke | java.awt.Stroke | ストローク。 |

### setTextRenderingMode(TextRenderingMode textRenderingMode) {#setTextRenderingMode-com.aspose.page.TextRenderingMode-}
```
public void setTextRenderingMode(TextRenderingMode textRenderingMode)
```


テキスト描画モードを指定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| textRenderingMode | [TextRenderingMode](../../com.aspose.page/textrenderingmode) | テキストレンダリングモード。 |

### setTextStrokeWidth(float textStrokeWidth) {#setTextStrokeWidth-float-}
```
public void setTextStrokeWidth(float textStrokeWidth)
```


テキストストローク幅を指定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| textStrokeWidth | float | テキストストローク幅。 |

### setTransform(AffineTransform transform) {#setTransform-java.awt.geom.AffineTransform-}
```
public void setTransform(AffineTransform transform)
```


現在の変換を指定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| transform | java.awt.geom.AffineTransform | 変換.. |

### shear(double shx, double shy) {#shear-double-double-}
```
public void shear(double shx, double shy)
```


現在の変換行列をシアーします。writeTransform(Transform) を呼び出します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| shx | double | X 軸のシアー。 |
| shy | double | Y 軸のシアー。 |

### startDocument() {#startDocument--}
```
public void startDocument()
```


ドキュメントのレンダリング開始前にデバイスの必要な準備を行います。

### toString() {#toString--}
```
public String toString()
```


デバイスタイプの名前を返します。

**Returns:**
java.lang.String
### transform(AffineTransform transform) {#transform-java.awt.geom.AffineTransform-}
```
public void transform(AffineTransform transform)
```


現在の変換行列を変換します。writeTransform(Transform) を呼び出します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| transform | java.awt.geom.AffineTransform | 適用される変換。 |

### translate(double x, double y) {#translate-double-double-}
```
public void translate(double x, double y)
```


現在の変換行列を平行移動します。writeTransform(Transform) を呼び出します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| x | double | X 軸の平行移動。 |
| y | double | Y 軸の平行移動。 |

### updatePageParameters(IMultiPageDevice device) {#updatePageParameters-com.aspose.page.IMultiPageDevice-}
```
public void updatePageParameters(IMultiPageDevice device)
```


他のマルチページデバイスからページパラメータを更新します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| device | [IMultiPageDevice](../../com.aspose.page/imultipagedevice) |  |

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

### writeComment(String comment) {#writeComment-java.lang.String-}
```
public void writeComment(String comment)
```


コメントを書き込みます。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| コメント | java.lang.String | 書き込むコメント。 |

### writeString(ITrFont font, String str) {#writeString-com.aspose.page.ITrFont-java.lang.String-}
```
public void writeString(ITrFont font, String str)
```


指定されたフォントで文字列を書き出します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| font | [ITrFont](../../com.aspose.page/itrfont) | 指定されたフォント。 |
| str | java.lang.String | 文字列。 |

### writeWarning(String warning) {#writeWarning-java.lang.String-}
```
public void writeWarning(String warning)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| 警告 | java.lang.String |  |

