---
title: "XpsPath"
second_title: "Java için Aspose.Page API Referansı"
description: "Path öğesi özelliklerini kapsayan sınıf."
type: docs
weight: 40
url: /tr/java/com.aspose.xps/xpspath/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsPath extends XpsContentElement
```

Path öğesi özelliklerini kapsayan sınıf. Bu öğe, sabit bir sayfaya vektör grafikleri ve görseller eklemenin tek yoludur. Sayfada renderlenecek tek bir vektör grafiği tanımlar.
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [deepClone()](#deepClone--) | Bu yolu klonlar. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Öğenin çocuklarına indeks i ile erişim sağlar. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Öğenin render edilen bölgesini sınırlayan yol geometrisini döndürür. |
| [getData()](#getData--) | Yolun geometrisini döndürür. |
| [getFill()](#getFill--) | Yolun Data özelliğiyle belirtilen geometrinin boyanmasında kullanılan fırçayı döndürür. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Köprü hedef nesnesini döndürür. |
| [getOpacity()](#getOpacity--) | Öğenin tekdüze şeffaflığını tanımlayan değeri döndürür. |
| [getOpacityMask()](#getOpacityMask--) | Opacity özniteliği gibi öğeye uygulanan, ancak öğenin farklı bölgeleri için farklı alfa değerlerine izin veren alfa değer maskesini belirten fırçayı döndürür. |
| [getRenderTransform()](#getRenderTransform--) | Öğenin ve tüm alt öğelerin (varsa) tüm öznitelikleri için yeni bir koordinat çerçevesi oluşturan afin dönüşüm matrisini döndürür. |
| [getStroke()](#getStroke--) | Çizgi (stroke) çiziminde kullanılan fırçayı döndürür. |
| [getStrokeDashArray()](#getStrokeDashArray--) | Kontur çizgisinin tire ve boşluk uzunluklarını belirten diziyi döndürür. |
| [getStrokeDashCap()](#getStrokeDashCap--) | Her bir tire ucunun nasıl çizileceğini belirten değeri döndürür. |
| [getStrokeDashOffset()](#getStrokeDashOffset--) | Tire dizisi deseninin tekrarlanması için başlangıç noktasını döndürür. |
| [getStrokeEndLineCap()](#getStrokeEndLineCap--) | Bir çizgideki son tire ucunun şeklini tanımlayan değeri döndürür. |
| [getStrokeLineJoin()](#getStrokeLineJoin--) | Bir çizgideki ilk tire başlangıcının şeklini tanımlayan değeri döndürür. |
| [getStrokeMiterLimit()](#getStrokeMiterLimit--) | Maksimum kiriş (miter) uzunluğu ile çizgi kalınlığının yarısı arasındaki oranı döndürür. |
| [getStrokeStartLineCap()](#getStrokeStartLineCap--) | Bir çizgideki ilk tire başlangıcının şeklini tanımlayan değeri döndürür. |
| [getStrokeThickness()](#getStrokeThickness--) | Çizgi kalınlığını, etkili koordinat uzayının birimleriyle (yolun render dönüşümünü içerir) döndürür. |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Iterable arayüzünün uygulanması. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Elemanın işlenen bölgesini sınırlayan yol geometrisini ayarlar. |
| [setData(XpsPathGeometry value)](#setData-com.aspose.xps.XpsPathGeometry-) | Yolun geometrisini ayarlar. |
| [setFill(XpsBrush value)](#setFill-com.aspose.xps.XpsBrush-) | Yolun Data özelliğiyle belirtilen geometrinin boyanması için kullanılan fırçayı ayarlar. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Bağlantı hedef nesnesini ayarlar. |
| [setOpacity(float value)](#setOpacity-float-) | Elemanın tekdüze şeffaflığını tanımlayan değeri ayarlar. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Elemanın Opaklık özelliğiyle aynı şekilde uygulanan, ancak elemanın farklı alanları için farklı alfa değerlerine izin veren alfa değer maskesini belirten fırçayı ayarlar. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Elemanın tüm öznitelikleri ve varsa tüm alt öğeler için yeni bir koordinat çerçevesi oluşturan afin dönüşüm matrisini ayarlar. |
| [setStroke(XpsBrush value)](#setStroke-com.aspose.xps.XpsBrush-) | Çizgi (stroke) çizmek için kullanılan fırçayı ayarlar. |
| [setStrokeDashArray(float[] value)](#setStrokeDashArray-float---) | Ana hat çizgisinin tire ve boşluk uzunluklarını belirten diziyi ayarlar. |
| [setStrokeDashCap(XpsDashCap value)](#setStrokeDashCap-com.aspose.xps.XpsDashCap-) | Her bir tire ucunun nasıl çizileceğini belirten değeri ayarlar. |
| [setStrokeDashOffset(float value)](#setStrokeDashOffset-float-) | Tire dizisi deseninin tekrarlanması için başlangıç noktasını ayarlar. |
| [setStrokeEndLineCap(XpsLineCap value)](#setStrokeEndLineCap-com.aspose.xps.XpsLineCap-) | Bir çizgideki son tırenin ucunun şeklini tanımlayan değeri ayarlar. |
| [setStrokeLineJoin(XpsLineJoin value)](#setStrokeLineJoin-com.aspose.xps.XpsLineJoin-) | Bir çizgideki ilk tırenin başlangıç şeklinin tanımını yapan değeri ayarlar. |
| [setStrokeMiterLimit(float value)](#setStrokeMiterLimit-float-) | Maksimum köşe uzunluğu ile çizgi kalınlığının yarısı arasındaki oranı ayarlar. |
| [setStrokeStartLineCap(XpsLineCap value)](#setStrokeStartLineCap-com.aspose.xps.XpsLineCap-) | Bir çizgideki ilk tırenin başlangıç şeklinin tanımını yapan değeri ayarlar. |
| [setStrokeThickness(float value)](#setStrokeThickness-float-) | Çizginin kalınlığını, etkili koordinat uzayının birimlerinde ayarlar (yolun render dönüşümünü içerir). |
| [size()](#size--) | Alt öğelerin sayısını döndürür. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsPath deepClone()
```


Bu yolu klonlar.

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Clone this path.
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
### getData() {#getData--}
```
public XpsPathGeometry getData()
```


Yolun geometrisini döndürür.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The geometry of the path.
### getFill() {#getFill--}
```
public XpsBrush getFill()
```


Yolun Data özelliğiyle belirtilen geometrinin boyanmasında kullanılan fırçayı döndürür.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to paint the geometry specified
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
### getStroke() {#getStroke--}
```
public XpsBrush getStroke()
```


Çizgi (stroke) çiziminde kullanılan fırçayı döndürür.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to draw the stroke.
### getStrokeDashArray() {#getStrokeDashArray--}
```
public float[] getStrokeDashArray()
```


Kontur çizgisinin tire ve boşluk uzunluklarını belirten diziyi döndürür.

**Returns:**
float[] - Ana hat çizgisinin tire ve boşluk uzunluklarını belirten dizi.
### getStrokeDashCap() {#getStrokeDashCap--}
```
public XpsDashCap getStrokeDashCap()
```


Her bir tire ucunun nasıl çizileceğini belirten değeri döndürür.

**Returns:**
[XpsDashCap](../../com.aspose.xps/xpsdashcap) - The value specifying how the ends of each dash are drawn.
### getStrokeDashOffset() {#getStrokeDashOffset--}
```
public float getStrokeDashOffset()
```


Tire dizisi deseninin tekrarlanması için başlangıç noktasını döndürür. Bu değer atlanırsa, tire dizisi çizginin başlangıcıyla hizalanır.

**Returns:**
float - Tire dizisi deseninin tekrarlanması için başlangıç noktası.
### getStrokeEndLineCap() {#getStrokeEndLineCap--}
```
public XpsLineCap getStrokeEndLineCap()
```


Bir çizgideki son tire ucunun şeklini tanımlayan değeri döndürür.

**Returns:**
[XpsLineCap](../../com.aspose.xps/xpslinecap) - The value defining the shape of the end of the last dash in a stroke.
### getStrokeLineJoin() {#getStrokeLineJoin--}
```
public XpsLineJoin getStrokeLineJoin()
```


Bir çizgideki ilk tire başlangıcının şeklini tanımlayan değeri döndürür.

**Returns:**
[XpsLineJoin](../../com.aspose.xps/xpslinejoin) - The value defining the shape of the beginning of the first dash in a stroke.
### getStrokeMiterLimit() {#getStrokeMiterLimit--}
```
public float getStrokeMiterLimit()
```


Maksimum köşe uzunluğu ile çizgi kalınlığının yarısı arasındaki oranı döndürür. Bu değer yalnızca StrokeLineJoin özelliği Miter olarak belirtildiğinde anlamlıdır.

**Returns:**
float - Maksimum köşe uzunluğu ile çizgi kalınlığının yarısı arasındaki oran.
### getStrokeStartLineCap() {#getStrokeStartLineCap--}
```
public XpsLineCap getStrokeStartLineCap()
```


Bir çizgideki ilk tire başlangıcının şeklini tanımlayan değeri döndürür.

**Returns:**
[XpsLineCap](../../com.aspose.xps/xpslinecap) - The value defining the shape of the beginning of the first dash in a stroke.
### getStrokeThickness() {#getStrokeThickness--}
```
public float getStrokeThickness()
```


Çizginin kalınlığını, etkili koordinat uzayının birimlerinde döndürür (yolun render dönüşümünü içerir). Çizgi, Path öğesinin Data özelliğiyle belirtilen geometrinin sınırının üzerine çizilir. StrokeThickness'in yarısı Data özelliğiyle belirtilen geometrinin dışına, diğer yarısı ise geometrinin içine uzanır.

**Returns:**
float - Bir çizginin kalınlığı.
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

### setData(XpsPathGeometry value) {#setData-com.aspose.xps.XpsPathGeometry-}
```
public void setData(XpsPathGeometry value)
```


Yolun geometrisini ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Yolun geometrisi. |

### setFill(XpsBrush value) {#setFill-com.aspose.xps.XpsBrush-}
```
public void setFill(XpsBrush value)
```


Yolun Data özelliğiyle belirtilen geometrinin boyanması için kullanılan fırçayı ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | Belirtilen geometrinin boyanması için kullanılan fırça |

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

### setStroke(XpsBrush value) {#setStroke-com.aspose.xps.XpsBrush-}
```
public void setStroke(XpsBrush value)
```


Çizgi (stroke) çizmek için kullanılan fırçayı ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | Çizgiyi çizmek için kullanılan fırça. |

### setStrokeDashArray(float[] value) {#setStrokeDashArray-float---}
```
public void setStrokeDashArray(float[] value)
```


Ana hat çizgisinin tire ve boşluk uzunluklarını belirten diziyi ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | float[] | Ana hat çizgisinin tire ve boşluk uzunluklarını belirten dizi. |

### setStrokeDashCap(XpsDashCap value) {#setStrokeDashCap-com.aspose.xps.XpsDashCap-}
```
public void setStrokeDashCap(XpsDashCap value)
```


Her bir tire ucunun nasıl çizileceğini belirten değeri ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | [XpsDashCap](../../com.aspose.xps/xpsdashcap) | Her bir tırenin uçlarının nasıl çizileceğini belirten değer. |

### setStrokeDashOffset(float value) {#setStrokeDashOffset-float-}
```
public void setStrokeDashOffset(float value)
```


Tire dizisi deseninin tekrarlanması için başlangıç noktasını ayarlar. Bu değer atlanırsa, tire dizisi çizginin başlangıcıyla hizalanır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | float | Tire dizisi deseninin tekrarlanması için başlangıç noktası. |

### setStrokeEndLineCap(XpsLineCap value) {#setStrokeEndLineCap-com.aspose.xps.XpsLineCap-}
```
public void setStrokeEndLineCap(XpsLineCap value)
```


Bir çizgideki son tırenin ucunun şeklini tanımlayan değeri ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | [XpsLineCap](../../com.aspose.xps/xpslinecap) | Bir çizgideki son tırenin ucunun şeklini tanımlayan değer. |

### setStrokeLineJoin(XpsLineJoin value) {#setStrokeLineJoin-com.aspose.xps.XpsLineJoin-}
```
public void setStrokeLineJoin(XpsLineJoin value)
```


Bir çizgideki ilk tırenin başlangıç şeklinin tanımını yapan değeri ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | [XpsLineJoin](../../com.aspose.xps/xpslinejoin) | Bir çizgideki ilk tırenin başlangıç şeklinin tanımını yapan değer. |

### setStrokeMiterLimit(float value) {#setStrokeMiterLimit-float-}
```
public void setStrokeMiterLimit(float value)
```


Maksimum köşe uzunluğu ile çizgi kalınlığının yarısı arasındaki oranı ayarlar. Bu değer yalnızca StrokeLineJoin özniteliği Miter belirtiyorsa anlamlıdır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | float | Maksimum köşe uzunluğu ile çizgi kalınlığının yarısı arasındaki oran. |

### setStrokeStartLineCap(XpsLineCap value) {#setStrokeStartLineCap-com.aspose.xps.XpsLineCap-}
```
public void setStrokeStartLineCap(XpsLineCap value)
```


Bir çizgideki ilk tırenin başlangıç şeklinin tanımını yapan değeri ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | [XpsLineCap](../../com.aspose.xps/xpslinecap) | Bir çizgideki ilk tırenin başlangıç şeklinin tanımını yapan değer. |

### setStrokeThickness(float value) {#setStrokeThickness-float-}
```
public void setStrokeThickness(float value)
```


Bir çizginin kalınlığını, etkili koordinat alanı birimlerinde ayarlar (yolun render dönüşümünü içerir). Çizgi, Path element\u2019s Data property'nin sınırının üzerine çizilir. StrokeThickness'in yarısı Data property tarafından belirtilen geometrinin dışına, diğer yarısı ise geometrinin içine uzanır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | float | Bir çizginin kalınlığı. |

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

