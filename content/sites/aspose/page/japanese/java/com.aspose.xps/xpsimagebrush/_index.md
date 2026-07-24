---
title: "XpsImageBrush"
second_title: "Aspose.Page for Java API リファレンス"
description: "ImageBrush プロパティ要素の機能をカプセル化するクラス。"
type: docs
weight: 33
url: /ja/java/com.aspose.xps/xpsimagebrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush), [com.aspose.xps.XpsTilingBrush](../../com.aspose.xps/xpstilingbrush)
```
public final class XpsImageBrush extends XpsTilingBrush
```

ImageBrush プロパティ要素の機能をカプセル化するクラス。この要素は画像で領域を塗りつぶすために使用されます。
## メソッド

| メソッド | 説明 |
| --- | --- |
| [deepClone()](#deepClone--) | この画像ブラシをクローンします。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getImage()](#getImage--) | ブラシに使用される画像リソースを返します。 |
| [getImageSource()](#getImageSource--) | 画像リソースの URI を返します。 |
| [getOpacity()](#getOpacity--) | ブラシの塗りの均一な透明度を定義する値を返します。 |
| [getTileMode()](#getTileMode--) | 塗りつぶされたジオメトリでタイル処理がどのように行われるかを指定する値を返します。 |
| [getTransform()](#getTransform--) | ブラシの座標空間に適用される行列変換を返します。 |
| [getViewbox()](#getViewbox--) | ビュー ポートにマッピングされるブラシのソース コンテンツ領域を返します。 |
| [getViewport()](#getViewport--) | 最初のブラシタイルの位置とサイズを返します。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOpacity(float value)](#setOpacity-float-) | ブラシの塗りの均一な透明度を定義する値を設定します。 |
| [setTileMode(XpsTileMode value)](#setTileMode-com.aspose.xps.XpsTileMode-) | 塗りつぶされたジオメトリでタイル処理がどのように行われるかを指定する値を設定します。 |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | ブラシの座標空間に適用される行列変換を設定します。 |
| [setViewbox(Rectangle2D value)](#setViewbox-java.awt.geom.Rectangle2D-) | ビュー ポートにマッピングされるブラシのソース コンテンツ領域を設定します。 |
| [setViewport(Rectangle2D value)](#setViewport-java.awt.geom.Rectangle2D-) | 最初のブラシタイルの位置とサイズを設定します。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsImageBrush deepClone()
```


この画像ブラシをクローンします。

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - Clone of this image brush.
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
### getImage() {#getImage--}
```
public XpsImage getImage()
```


ブラシに使用される画像リソースを返します。

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - Image resource used to for the brush.
### getImageSource() {#getImageSource--}
```
public String getImageSource()
```


画像リソースの URI を返します。

**Returns:**
java.lang.String - 画像リソースの URI。
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


ブラシの塗りの均一な透明度を定義する値を返します。

**Returns:**
float - ブラシの塗りの均一な透明度を定義する値。
### getTileMode() {#getTileMode--}
```
public XpsTileMode getTileMode()
```


塗りつぶされたジオメトリでタイル処理がどのように行われるかを指定する値を返します。

**Returns:**
[XpsTileMode](../../com.aspose.xps/xpstilemode) - Value specifying how tiling is performed in the filled geometry.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


ブラシの座標空間に適用される行列変換を返します。Transform プロパティは現在の有効なレンダー変換と連結され、ブラシローカルの有効なレンダー変換を生成します。ブラシのビュー ポートはローカルの有効なレンダー変換を使用して変換されます。

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The matrix transformation applied to the coordinate space of the brush.
### getViewbox() {#getViewbox--}
```
public Rectangle2D getViewbox()
```


ビュー ポートにマッピングされるブラシのソース コンテンツ領域を返します。

**Returns:**
java.awt.geom.Rectangle2D - ビュー ポートにマッピングされるブラシのソース コンテンツ領域。
### getViewport() {#getViewport--}
```
public Rectangle2D getViewport()
```


最初のブラシタイルの位置とサイズを返します。以降のタイルはタイル モードで指定されるように、このタイルを基準に配置されます。

**Returns:**
java.awt.geom.Rectangle2D - 最初のブラシタイルの位置とサイズ。
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




### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


ブラシの塗りの均一な透明度を定義する値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | float | ブラシの塗りの均一な透明度を定義する値。 |

### setTileMode(XpsTileMode value) {#setTileMode-com.aspose.xps.XpsTileMode-}
```
public void setTileMode(XpsTileMode value)
```


塗りつぶされたジオメトリでタイル処理がどのように行われるかを指定する値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | [XpsTileMode](../../com.aspose.xps/xpstilemode) | 塗りつぶされたジオメトリでタイル処理がどのように行われるかを指定する値。 |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


ブラシの座標空間に適用される行列変換を設定します。Transform プロパティは現在の有効なレンダー変換と連結され、ブラシローカルの有効なレンダー変換を生成します。ブラシのビュー ポートはローカルの有効なレンダー変換を使用して変換されます。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | ブラシの座標空間に適用される行列変換。 |

### setViewbox(Rectangle2D value) {#setViewbox-java.awt.geom.Rectangle2D-}
```
public void setViewbox(Rectangle2D value)
```


ビュー ポートにマッピングされるブラシのソース コンテンツ領域を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | java.awt.geom.Rectangle2D | ビュー ポートにマッピングされるブラシのソース コンテンツ領域。 |

### setViewport(Rectangle2D value) {#setViewport-java.awt.geom.Rectangle2D-}
```
public void setViewport(Rectangle2D value)
```


最初のブラシタイルの位置とサイズを設定します。以降のタイルはタイル モードで指定されるように、このタイルを基準に配置されます。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | java.awt.geom.Rectangle2D | 最初のブラシタイルの位置とサイズ。 |

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

