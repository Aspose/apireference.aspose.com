---
title: "XpsImageBrush"
second_title: "Java için Aspose.Page API Referansı"
description: "ImageBrush özellik öğesi özelliklerini kapsayan sınıf."
type: docs
weight: 33
url: /tr/java/com.aspose.xps/xpsimagebrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush), [com.aspose.xps.XpsTilingBrush](../../com.aspose.xps/xpstilingbrush)
```
public final class XpsImageBrush extends XpsTilingBrush
```

ImageBrush özellik öğesi özelliklerini kapsayan sınıf. Bu öğe bir bölgeyi görsel ile doldurmak için kullanılır.
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [deepClone()](#deepClone--) | Bu görüntü fırçasını klonlar. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getImage()](#getImage--) | Fırça için kullanılan görüntü kaynağını döndürür. |
| [getImageSource()](#getImageSource--) | Bir görüntü kaynağının URI'sını döndürür. |
| [getOpacity()](#getOpacity--) | Fırça dolgusunun tekdüze şeffaflığını tanımlayan değeri döndürür. |
| [getTileMode()](#getTileMode--) | Doldurulmuş geometride döşemenin nasıl gerçekleştirileceğini belirten değeri döndürür. |
| [getTransform()](#getTransform--) | Fırçanın koordinat alanına uygulanan matris dönüşümünü döndürür. |
| [getViewbox()](#getViewbox--) | Fırçanın, görünüm alanına eşlenecek kaynak içeriğinin bölgesini döndürür. |
| [getViewport()](#getViewport--) | İlk fırça döşemesinin konumunu ve boyutlarını döndürür. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOpacity(float value)](#setOpacity-float-) | Fırça dolgusunun tekdüze şeffaflığını tanımlayan değeri ayarlar. |
| [setTileMode(XpsTileMode value)](#setTileMode-com.aspose.xps.XpsTileMode-) | Doldurulmuş geometride döşemenin nasıl gerçekleştirileceğini belirten değeri ayarlar. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Fırçanın koordinat uzayına uygulanan matris dönüşümünü ayarlar. |
| [setViewbox(Rectangle2D value)](#setViewbox-java.awt.geom.Rectangle2D-) | Fırçanın kaynak içeriğinin görünüm alanına eşlenecek bölgesini ayarlar. |
| [setViewport(Rectangle2D value)](#setViewport-java.awt.geom.Rectangle2D-) | İlk fırça döşemesinin konumunu ve boyutlarını ayarlar. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsImageBrush deepClone()
```


Bu görüntü fırçasını klonlar.

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - Clone of this image brush.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parametre | Tür | Açıklama |
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


Fırça için kullanılan görüntü kaynağını döndürür.

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - Image resource used to for the brush.
### getImageSource() {#getImageSource--}
```
public String getImageSource()
```


Bir görüntü kaynağının URI'sını döndürür.

**Returns:**
java.lang.String - Bir görüntü kaynağının URI'si.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Fırça dolgusunun tekdüze şeffaflığını tanımlayan değeri döndürür.

**Returns:**
float - Fırça dolgusunun tekdüze şeffaflığını tanımlayan değer.
### getTileMode() {#getTileMode--}
```
public XpsTileMode getTileMode()
```


Doldurulmuş geometride döşemenin nasıl gerçekleştirileceğini belirten değeri döndürür.

**Returns:**
[XpsTileMode](../../com.aspose.xps/xpstilemode) - Value specifying how tiling is performed in the filled geometry.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Fırçanın koordinat uzayına uygulanan matris dönüşümünü döndürür. Transform özelliği, fırçaya yerel etkili bir render dönüşümü sağlamak için mevcut etkili render dönüşümüyle birleştirilir. Fırça için görünüm alanı, yerel etkili render dönüşümü kullanılarak dönüştürülür.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The matrix transformation applied to the coordinate space of the brush.
### getViewbox() {#getViewbox--}
```
public Rectangle2D getViewbox()
```


Fırçanın, görünüm alanına eşlenecek kaynak içeriğinin bölgesini döndürür.

**Returns:**
java.awt.geom.Rectangle2D - Fırçanın kaynak içeriğinin görünüm alanına eşlenecek bölgesi.
### getViewport() {#getViewport--}
```
public Rectangle2D getViewport()
```


İlk fırça döşemesinin konumunu ve boyutlarını döndürür. Sonraki döşemeler, döşeme modunda belirtildiği gibi, bu döşemeye göre konumlandırılır.

**Returns:**
java.awt.geom.Rectangle2D - İlk fırça döşemesinin konumu ve boyutları.
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


Fırça dolgusunun tekdüze şeffaflığını tanımlayan değeri ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | float | Fırça dolgusunun tekdüze şeffaflığını tanımlayan değer. |

### setTileMode(XpsTileMode value) {#setTileMode-com.aspose.xps.XpsTileMode-}
```
public void setTileMode(XpsTileMode value)
```


Doldurulmuş geometride döşemenin nasıl gerçekleştirileceğini belirten değeri ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | [XpsTileMode](../../com.aspose.xps/xpstilemode) | Doldurulmuş geometride döşemenin nasıl gerçekleştirileceğini belirten değer. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Fırçanın koordinat uzayına uygulanan matris dönüşümünü ayarlar. Transform özelliği, fırçaya yerel etkili bir render dönüşümü sağlamak için mevcut etkili render dönüşümüyle birleştirilir. Fırça için görünüm alanı, yerel etkili render dönüşümü kullanılarak dönüştürülür.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Fırçanın koordinat uzayına uygulanan matris dönüşümü. |

### setViewbox(Rectangle2D value) {#setViewbox-java.awt.geom.Rectangle2D-}
```
public void setViewbox(Rectangle2D value)
```


Fırçanın kaynak içeriğinin görünüm alanına eşlenecek bölgesini ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | java.awt.geom.Rectangle2D | Fırçanın kaynak içeriğinin görünüm alanına eşlenecek bölgesi. |

### setViewport(Rectangle2D value) {#setViewport-java.awt.geom.Rectangle2D-}
```
public void setViewport(Rectangle2D value)
```


İlk fırça döşemesinin konumunu ve boyutlarını ayarlar. Sonraki döşemeler, döşeme modunda belirtildiği gibi, bu döşemeye göre konumlandırılır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | java.awt.geom.Rectangle2D | İlk fırça döşemesinin konumu ve boyutları. |

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
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

