---
title: "XpsCanvas"
second_title: "Java için Aspose.Page API Referansı"
description: "Canvas öğesinin özelliklerini kapsülleyen sınıf."
type: docs
weight: 16
url: /tr/java/com.aspose.xps/xpscanvas/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsCanvas extends XpsContentElement
```

Canvas öğesi özelliklerini kapsayan sınıf. Bu öğe öğeleri bir araya gruplar. Örneğin, Glyphs ve Path öğeleri bir canvas içinde bir birim (bir hiperlink hedefi) olarak tanımlanabilmesi veya her alt ve üst öğeye birleşik bir özellik değeri uygulanabilmesi için gruplanabilir.
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | Bu canvas'ın alt öğe listesine bir öğe ekler. |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | Bu tuvalin alt öğe listesine  index  konumunda bir öğe ekler. |
| [addCanvas()](#addCanvas--) | Bu canvas'ın alt öğe listesine yeni bir canvas ekler. |
| [addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Bu canvas'ın alt öğe listesine yeni glyph'ler ekler. |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | Bu canvas'ın alt öğe listesine yeni bir path ekler. |
| [deepClone()](#deepClone--) | Bu canvas'ı klonlar. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Öğenin çocuklarına indeks i ile erişim sağlar. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Öğenin render edilen bölgesini sınırlayan yol geometrisini döndürür. |
| [getEdgeMode()](#getEdgeMode--) | Tuval içindeki yolların kenarlarının nasıl işleneceğini kontrol eden değeri döndürür. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Köprü hedef nesnesini döndürür. |
| [getOpacity()](#getOpacity--) | Öğenin tekdüze şeffaflığını tanımlayan değeri döndürür. |
| [getOpacityMask()](#getOpacityMask--) | Opacity özniteliği gibi öğeye uygulanan, ancak öğenin farklı bölgeleri için farklı alfa değerlerine izin veren alfa değer maskesini belirten fırçayı döndürür. |
| [getRenderTransform()](#getRenderTransform--) | Öğenin ve tüm alt öğelerin (varsa) tüm öznitelikleri için yeni bir koordinat çerçevesi oluşturan afin dönüşüm matrisini döndürür. |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | Bu tuvalin alt öğe listesine  index  konumunda yeni bir tuval ekler. |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Bu tuvalin alt öğe listesine  index  konumunda yeni glifler ekler. |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | Bu tuvalin alt öğe listesine  index  konumunda yeni bir yol ekler. |
| [iterator()](#iterator--) | Iterable arayüzünün uygulanması. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Elemanın işlenen bölgesini sınırlayan yol geometrisini ayarlar. |
| [setEdgeMode(XpsEdgeMode value)](#setEdgeMode-com.aspose.xps.XpsEdgeMode-) | Tuval içindeki yolların kenarlarının nasıl işleneceğini kontrol eden değeri ayarlar. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Bağlantı hedef nesnesini ayarlar. |
| [setOpacity(float value)](#setOpacity-float-) | Elemanın tekdüze şeffaflığını tanımlayan değeri ayarlar. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Elemanın Opaklık özelliğiyle aynı şekilde uygulanan, ancak elemanın farklı alanları için farklı alfa değerlerine izin veren alfa değer maskesini belirten fırçayı ayarlar. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Elemanın tüm öznitelikleri ve varsa tüm alt öğeler için yeni bir koordinat çerçevesi oluşturan afin dönüşüm matrisini ayarlar. |
| [size()](#size--) | Alt öğelerin sayısını döndürür. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


Bu canvas'ın alt öğe listesine bir öğe ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| öğe | T | Eklenecek öğe. |

**Returns:**
T - Eklenen öğe.
### <T>insert(int index, T element) {#-T-insert-int-T-}
```
public T <T>insert(int index, T element)
```


Bu tuvalin alt öğe listesine  index  konumunda bir öğe ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| indeks | int | Bir öğenin eklenmesi gereken konum. |
| öğe | T | Eklenecek öğe. |

**Returns:**
T - Eklenen öğe.
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


Bu canvas'ın alt öğe listesine yeni bir canvas ekler.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Bu canvas'ın alt öğe listesine yeni glyph'ler ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| fontFamily | java.lang.String | Yazı tipi ailesi. |
| fontSize | float | Yazı tipi boyutu. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Yazı tipi stili. |
| originX | float | Gliflerin X koordinat başlangıcı. |
| originY | float | Gliflerin orijinal T koordinatı. |
| unicodeString | java.lang.String | Yazdırılacak dize. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


Bu canvas'ın alt öğe listesine yeni bir path ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Yolun geometrisi. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### deepClone() {#deepClone--}
```
public XpsCanvas deepClone()
```


Bu canvas'ı klonlar.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Clone of this canvas.
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
### getEdgeMode() {#getEdgeMode--}
```
public XpsEdgeMode getEdgeMode()
```


Tuval içindeki yolların kenarlarının nasıl işleneceğini kontrol eden değeri döndürür.

**Returns:**
[XpsEdgeMode](../../com.aspose.xps/xpsedgemode) - The edge rendering mode.
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
### insertCanvas(int index) {#insertCanvas-int-}
```
public XpsCanvas insertCanvas(int index)
```


Bu tuvalin alt öğe listesine  index  konumunda yeni bir tuval ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| indeks | int | Yeni bir kanvasın eklenmesi gereken konum. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Bu tuvalin alt öğe listesine  index  konumunda yeni glifler ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| indeks | int | Yeni gliflerin eklenmesi gereken konum. |
| fontFamily | java.lang.String | Yazı tipi ailesi. |
| fontSize | float | Yazı tipi boyutu. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Yazı tipi stili. |
| originX | float | Gliflerin X koordinat başlangıcı. |
| originY | float | Gliflerin orijinal T koordinatı. |
| unicodeString | java.lang.String | Yazdırılacak dize. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


Bu tuvalin alt öğe listesine  index  konumunda yeni bir yol ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| indeks | int | Yeni bir yolun eklenmesi gereken konum. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Yolun geometrisi. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
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

### setEdgeMode(XpsEdgeMode value) {#setEdgeMode-com.aspose.xps.XpsEdgeMode-}
```
public void setEdgeMode(XpsEdgeMode value)
```


Tuval içindeki yolların kenarlarının nasıl işleneceğini kontrol eden değeri ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | [XpsEdgeMode](../../com.aspose.xps/xpsedgemode) | Kenar işleme modu. |

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

