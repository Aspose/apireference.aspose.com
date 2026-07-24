---
title: "PageAPI"
second_title: "Aspose.Page for Java API リファレンス"
description: "ページ要素変更 API。"
type: docs
weight: 12
url: /ja/java/com.aspose.xps.features.eventbasedmodifications/pageapi/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.xps.features.EventBasedModifications.IModificationAPI](../../com.aspose.xps.features.eventbasedmodifications/imodificationapi)
```
public class PageAPI implements EventBasedModifications.IModificationAPI
```

**Page** 要素の変更 API。
## メソッド

| メソッド | 説明 |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | コンテンツ要素（Canvas、Path、または Glyphs）を追加します |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | ページのインデックス位置に要素（Canvas、Path、または Glyphs）を挿入します。 |
| [<T>remove(T element)](#-T-remove-T-) | ページから要素を削除します。 |
| [addCanvas()](#addCanvas--) | ページに新しいキャンバスを追加します。 |
| [addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | ページに新しいグリフを追加します。 |
| [addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | ページに新しいグリフを追加します。 |
| [addOutlineEntry(String description, int outlineLevel, int targetPageNumber)](#addOutlineEntry-java.lang.String-int-int-) | ドキュメントにアウトラインエントリを追加します。 |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | ページに新しいパスを追加します。 |
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
| [createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | 新しいグリフを作成します。 |
| [createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | 新しいグリフを作成します。 |
| [createGradientStop(XpsColor color, float offset)](#createGradientStop-com.aspose.xps.XpsColor-float-) | 新しいグラデーションストップを作成します。 |
| [createGradientStop(Color color, float offset)](#createGradientStop-java.awt.Color-float-) | 新しいグラデーションストップを作成します。 |
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
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | ページの高さを、実座標空間の単位で実数として返します。 |
| [getPageCount()](#getPageCount--) | アクティブなドキュメントのページ数を返します。 |
| [getTotalPageCount()](#getTotalPageCount--) | XPS ドキュメント内のすべてのドキュメントの総ページ数を返します。 |
| [getUtils()](#getUtils--) | 正式な XPS 操作 API を超えるユーティリティを提供するオブジェクトを取得します。 |
| [getWidth()](#getWidth--) | ページの幅を、実座標空間の単位で実数として返します。 |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | ページの index 位置に新しいキャンバスを挿入します。 |
| [insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)](#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | ページの index 位置に新しいグリフを挿入します。 |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | ページの index 位置に新しいグリフを挿入します。 |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | ページの index 位置に新しいパスを挿入します。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeAt(int index)](#removeAt-int-) | ページの index 位置から要素を削除します。 |
| [setHeight(float value)](#setHeight-float-) | ページの高さを、実座標空間の単位で実数として設定します。 |
| [setWidth(float value)](#setWidth-float-) | ページの幅を、実座標空間の単位で実数として設定します。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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


ページのインデックス位置に要素（Canvas、Path、または Glyphs）を挿入します。

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


ページから要素を削除します。

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


ページに新しいキャンバスを追加します。

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


ページに新しいグリフを追加します。

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


ページに新しいグリフを追加します。

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
### addOutlineEntry(String description, int outlineLevel, int targetPageNumber) {#addOutlineEntry-java.lang.String-int-int-}
```
public void addOutlineEntry(String description, int outlineLevel, int targetPageNumber)
```


ドキュメントにアウトラインエントリを追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| 説明 | java.lang.String | エントリの説明。 |
| outlineLevel | int | アウトラインレベル。 |
| targetPageNumber | int | 対象ページ番号。 |

### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


ページに新しいパスを追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | パスのジオメトリ。 |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
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
| element | [XpsContentElement](../../com.aspose.xps/xpscontentelement) | Visual プロパティのビジュアルブラシ用 XPS 要素（Canvas、Path、または Glyphs）。 |
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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getHeight() {#getHeight--}
```
public float getHeight()
```


ページの高さを、実座標空間の単位で実数として返します。

**Returns:**
float - ページの高さです。
### getPageCount() {#getPageCount--}
```
public int getPageCount()
```


アクティブなドキュメントのページ数を返します。

**Returns:**
int - アクティブなドキュメントのページ数です。
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
[DocumentUtils](../../com.aspose.xps/documentutils) - The object that provides utilities beyond the formal XPS manipulation API.
### getWidth() {#getWidth--}
```
public float getWidth()
```


ページの幅を、実座標空間の単位で実数として返します。

**Returns:**
float - ページの幅です。
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


ページの index 位置に新しいキャンバスを挿入します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| インデックス | int | 新しい Canvas を挿入すべき位置です。 |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString) {#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)
```


ページの index 位置に新しいグリフを挿入します。

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


ページの index 位置に新しいグリフを挿入します。

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
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


ページの index 位置に新しいパスを挿入します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| インデックス | int | 新しい Path を挿入すべき位置です。 |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | パスのジオメトリ。 |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
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


ページの index 位置から要素を削除します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| インデックス | int | 要素を削除すべき位置です。 |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Removed element.
### setHeight(float value) {#setHeight-float-}
```
public void setHeight(float value)
```


ページの高さを、実座標空間の単位で実数として設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | float | ページの高さです。 |

### setWidth(float value) {#setWidth-float-}
```
public void setWidth(float value)
```


ページの幅を、実座標空間の単位で実数として設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | float | ページの幅です。 |

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

