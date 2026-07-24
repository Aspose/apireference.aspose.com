---
title: "DocumentUtils"
second_title: "Aspose.Page for Java API リファレンス"
description: "このクラスは、正式な XPS 操作 API を超えるユーティリティを提供します。"
type: docs
weight: 10
url: /ja/java/com.aspose.xps/documentutils/
---
**Inheritance:**
java.lang.Object
```
public class DocumentUtils
```

このクラスは、正式な XPS 操作 API を超えるユーティリティを提供します。
## メソッド

| メソッド | 説明 |
| --- | --- |
| [createCircle(Point2D center, float radius)](#createCircle-java.awt.geom.Point2D-float-) | 円を表すパスジオメトリを作成します。 |
| [createCircularSegment(Point2D center, float radius, float startAngle, float endAngle)](#createCircularSegment-java.awt.geom.Point2D-float-float-float-) | 2 つの角度間の円弧セグメントを表すパスジオメトリを作成します。 |
| [createEllipse(Point2D center, float radiusX, float radiusY)](#createEllipse-java.awt.geom.Point2D-float-float-) | 楕円を表すパスジオメトリを作成します。 |
| [createImage(String fileName, Rectangle2D imageBox)](#createImage-java.lang.String-java.awt.geom.Rectangle2D-) | 画像で塗りつぶされた矩形パスを作成します。 |
| [createImage(String fileName, Rectangle2D imageBox, ImageMode mode)](#createImage-java.lang.String-java.awt.geom.Rectangle2D-com.aspose.xps.ImageMode-) | 画像で塗りつぶされた矩形パスを作成します。 |
| [createPieSlice(Point2D center, float radius, float startAngle, float endAngle)](#createPieSlice-java.awt.geom.Point2D-float-float-float-) | 2 本の放射線間の円スライスを表すパスジオメトリを作成します。 |
| [createRectangle(Rectangle2D rectangle)](#createRectangle-java.awt.geom.Rectangle2D-) | 矩形を表すパスジオメトリを作成します。 |
| [createRegularCircumscribedNGon(int n, Point2D center, float radius)](#createRegularCircumscribedNGon-int-java.awt.geom.Point2D-float-) | 円に外接する正 n 角形を表すパスジオメトリを作成します。 |
| [createRegularInscribedNGon(int n, Point2D center, float radius)](#createRegularInscribedNGon-int-java.awt.geom.Point2D-float-) | 円に内接する正 n 角形を表すパスジオメトリを作成します。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### createCircle(Point2D center, float radius) {#createCircle-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createCircle(Point2D center, float radius)
```


円を表すパスジオメトリを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| center | java.awt.geom.Point2D | 円の中心点です。 |
| 半径 | float | 円の半径です。 |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createCircularSegment(Point2D center, float radius, float startAngle, float endAngle) {#createCircularSegment-java.awt.geom.Point2D-float-float-float-}
```
public XpsPathGeometry createCircularSegment(Point2D center, float radius, float startAngle, float endAngle)
```


2 つの角度間の円弧セグメントを表すパスジオメトリを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| center | java.awt.geom.Point2D | 円の中心です。 |
| 半径 | float | 円の半径です。 |
| startAngle | float | 開始光線の角度（度）。 |
| endAngle | float | 終了光線の角度（度）。 |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createEllipse(Point2D center, float radiusX, float radiusY) {#createEllipse-java.awt.geom.Point2D-float-float-}
```
public XpsPathGeometry createEllipse(Point2D center, float radiusX, float radiusY)
```


楕円を表すパスジオメトリを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| center | java.awt.geom.Point2D | 楕円の中心点です。 |
| radiusX | float | 楕円の水平半径です。 |
| radiusY | float | 楕円の垂直半径です。 |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createImage(String fileName, Rectangle2D imageBox) {#createImage-java.lang.String-java.awt.geom.Rectangle2D-}
```
public XpsPath createImage(String fileName, Rectangle2D imageBox)
```


画像で塗りつぶされた矩形パスを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| fileName | java.lang.String | 画像ファイルの名前です。 |
| imageBox | java.awt.geom.Rectangle2D | 画像で埋めるイメージボックスです。 |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - The XPS path.
### createImage(String fileName, Rectangle2D imageBox, ImageMode mode) {#createImage-java.lang.String-java.awt.geom.Rectangle2D-com.aspose.xps.ImageMode-}
```
public XpsPath createImage(String fileName, Rectangle2D imageBox, ImageMode mode)
```


画像で塗りつぶされた矩形パスを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| fileName | java.lang.String | 画像ファイルの名前です。 |
| imageBox | java.awt.geom.Rectangle2D | 画像で埋めるイメージボックスです。 |
| mode | [ImageMode](../../com.aspose.xps/imagemode) | 画像のフィットモードです。 |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - The XPS path.
### createPieSlice(Point2D center, float radius, float startAngle, float endAngle) {#createPieSlice-java.awt.geom.Point2D-float-float-float-}
```
public XpsPathGeometry createPieSlice(Point2D center, float radius, float startAngle, float endAngle)
```


2 本の放射線間の円スライスを表すパスジオメトリを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| center | java.awt.geom.Point2D | 円の中心です。 |
| 半径 | float | 円の半径です。 |
| startAngle | float | 開始光線の角度（度）。 |
| endAngle | float | 終了光線の角度（度）。 |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRectangle(Rectangle2D rectangle) {#createRectangle-java.awt.geom.Rectangle2D-}
```
public XpsPathGeometry createRectangle(Rectangle2D rectangle)
```


矩形を表すパスジオメトリを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| rectangle | java.awt.geom.Rectangle2D | 矩形です。 |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRegularCircumscribedNGon(int n, Point2D center, float radius) {#createRegularCircumscribedNGon-int-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createRegularCircumscribedNGon(int n, Point2D center, float radius)
```


円に外接する正 n 角形を表すパスジオメトリを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| n | int | 頂点の数です。 |
| center | java.awt.geom.Point2D | 円の中心です。 |
| 半径 | float | 円の半径です。 |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRegularInscribedNGon(int n, Point2D center, float radius) {#createRegularInscribedNGon-int-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createRegularInscribedNGon(int n, Point2D center, float radius)
```


円に内接する正 n 角形を表すパスジオメトリを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| n | int | 頂点の数です。 |
| center | java.awt.geom.Point2D | 円の中心です。 |
| 半径 | float | 円の半径です。 |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
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
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




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

