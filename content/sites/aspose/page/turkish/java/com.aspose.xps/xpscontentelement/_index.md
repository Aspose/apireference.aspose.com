---
title: "XpsContentElement"
second_title: "Java için Aspose.Page API Referansı"
description: "XPS içerik öğeleri Canvas Path ve Glyphs özelliklerini kapsüller."
type: docs
weight: 18
url: /tr/java/com.aspose.xps/xpscontentelement/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement)
```
public abstract class XpsContentElement extends XpsHyperlinkElement
```

XPS içerik öğelerinin (Canvas, Path ve Glyphs) özelliklerini kapsüller.
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Öğenin çocuklarına indeks i ile erişim sağlar. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Öğenin render edilen bölgesini sınırlayan yol geometrisini döndürür. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Köprü hedef nesnesini döndürür. |
| [getOpacity()](#getOpacity--) | Öğenin tekdüze şeffaflığını tanımlayan değeri döndürür. |
| [getOpacityMask()](#getOpacityMask--) | Opacity özniteliği gibi öğeye uygulanan, ancak öğenin farklı bölgeleri için farklı alfa değerlerine izin veren alfa değer maskesini belirten fırçayı döndürür. |
| [getRenderTransform()](#getRenderTransform--) | Öğenin ve tüm alt öğelerin (varsa) tüm öznitelikleri için yeni bir koordinat çerçevesi oluşturan afin dönüşüm matrisini döndürür. |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Iterable arayüzünün uygulanması. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Elemanın işlenen bölgesini sınırlayan yol geometrisini ayarlar. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Bağlantı hedef nesnesini ayarlar. |
| [setOpacity(float value)](#setOpacity-float-) | Elemanın tekdüze şeffaflığını tanımlayan değeri ayarlar. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Elemanın Opaklık özelliğiyle aynı şekilde uygulanan, ancak elemanın farklı alanları için farklı alfa değerlerine izin veren alfa değer maskesini belirten fırçayı ayarlar. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Elemanın tüm öznitelikleri ve varsa tüm alt öğeler için yeni bir koordinat çerçevesi oluşturan afin dönüşüm matrisini ayarlar. |
| [size()](#size--) | Alt öğelerin sayısını döndürür. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### get(int i) {#get-int-}
```
public XpsContentElement get(int i)
```


Öğenin çocuklarına indeks i ile erişim sağlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| i | int | Alt öğenin indeksi. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Child element at  i  position.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getClip() {#getClip--}
```
public XpsPathGeometry getClip()
```


Öğenin render edilen bölgesini sınırlayan yol geometrisini döndürür.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The path geometry limiting the rendered region of the element.
### getHyperlinkTarget() {#getHyperlinkTarget--}
```
public XpsHyperlinkTarget getHyperlinkTarget()
```


Köprü hedef nesnesini döndürür.

**Returns:**
[XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) - Hyperlink target object.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Öğenin tekdüze şeffaflığını tanımlayan değeri döndürür.

**Returns:**
float - Elemanın tekdüze şeffaflığını tanımlayan değer.
### getOpacityMask() {#getOpacityMask--}
```
public XpsBrush getOpacityMask()
```


Opacity özniteliği gibi öğeye uygulanan, ancak öğenin farklı bölgeleri için farklı alfa değerlerine izin veren alfa değer maskesini belirten fırçayı döndürür.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush specifying a mask.
### getRenderTransform() {#getRenderTransform--}
```
public XpsMatrix getRenderTransform()
```


Öğenin ve tüm alt öğelerin (varsa) tüm öznitelikleri için yeni bir koordinat çerçevesi oluşturan afin dönüşüm matrisini döndürür.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### iterator() {#iterator--}
```
public Iterator<XpsContentElement> iterator()
```


Iterable arayüzünün uygulanması.

**Returns:**
java.util.Iterator<com.aspose.xps.XpsContentElement> - Liste için yineleyiciyi döndürür.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setClip(XpsPathGeometry value) {#setClip-com.aspose.xps.XpsPathGeometry-}
```
public void setClip(XpsPathGeometry value)
```


Elemanın işlenen bölgesini sınırlayan yol geometrisini ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Elemanın işlenen bölgesini sınırlayan yol geometrisi. |

### setHyperlinkTarget(XpsHyperlinkTarget value) {#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-}
```
public void setHyperlinkTarget(XpsHyperlinkTarget value)
```


Bağlantı hedef nesnesini ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | [XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) | Bağlantı hedef nesnesi. |

### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Elemanın tekdüze şeffaflığını tanımlayan değeri ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | float | Elemanın tekdüze şeffaflığını tanımlayan değer. |

### setOpacityMask(XpsBrush value) {#setOpacityMask-com.aspose.xps.XpsBrush-}
```
public void setOpacityMask(XpsBrush value)
```


Elemanın Opaklık özelliğiyle aynı şekilde uygulanan, ancak elemanın farklı alanları için farklı alfa değerlerine izin veren alfa değer maskesini belirten fırçayı ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | Maskeyi belirten fırça. |

### setRenderTransform(XpsMatrix value) {#setRenderTransform-com.aspose.xps.XpsMatrix-}
```
public void setRenderTransform(XpsMatrix value)
```


Elemanın tüm öznitelikleri ve varsa tüm alt öğeler için yeni bir koordinat çerçevesi oluşturan afin dönüşüm matrisini ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Afin dönüşüm matrisi. |

### size() {#size--}
```
public int size()
```


Alt öğelerin sayısını döndürür.

**Returns:**
int - Alt öğelerin sayısı.
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

