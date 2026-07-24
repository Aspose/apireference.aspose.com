---
title: "XpsGlyphs"
second_title: "Java için Aspose.Page API Referansı"
description: "Glyphs öğesi özelliklerini kapsayan sınıf."
type: docs
weight: 25
url: /tr/java/com.aspose.xps/xpsglyphs/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsGlyphs extends XpsContentElement
```

Glyphs öğesi özelliklerini kapsayan sınıf. Bu öğe tek bir yazı tipinden tekdüze biçimlendirilmiş bir metin akışını temsil eder. Doğru renderleme için gerekli bilgileri sağlar ve görüntüleme tüketicilerinde arama ve seçim özelliklerini destekler.
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [deepClone()](#deepClone--) | Bu glyph'leri kopyala. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Öğenin çocuklarına indeks i ile erişim sağlar. |
| [getBidiLevel()](#getBidiLevel--) | Unicode algoritmasının çift yönlü iç içeleme seviyesini belirten değeri döndürür. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Öğenin render edilen bölgesini sınırlayan yol geometrisini döndürür. |
| [getFill()](#getFill--) | Render edilen gliflerin şeklini doldurmak için kullanılan fırçayı döndürür. |
| [getFont()](#getFont--) | Eleman metnini tipografik olarak ayarlamak için kullanılan TrueType yazı tipinin font kaynağını döndürür. |
| [getFontRenderingEmSize()](#getFontRenderingEmSize--) | Etkili koordinat uzayının birimleri cinsinden, float olarak ifade edilen, çizim yüzeyi birimlerinde font boyutunu döndürür. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Köprü hedef nesnesini döndürür. |
| [getOpacity()](#getOpacity--) | Öğenin tekdüze şeffaflığını tanımlayan değeri döndürür. |
| [getOpacityMask()](#getOpacityMask--) | Opacity özniteliği gibi öğeye uygulanan, ancak öğenin farklı bölgeleri için farklı alfa değerlerine izin veren alfa değer maskesini belirten fırçayı döndürür. |
| [getOriginX()](#getOriginX--) | Koşu içindeki ilk glifin x koordinatını, etkili koordinat uzayının birimleri cinsinden döndürür. |
| [getOriginY()](#getOriginY--) | Koşu içindeki ilk glifin y koordinatını, etkili koordinat uzayının birimleri cinsinden döndürür. |
| [getRenderTransform()](#getRenderTransform--) | Öğenin ve tüm alt öğelerin (varsa) tüm öznitelikleri için yeni bir koordinat çerçevesi oluşturan afin dönüşüm matrisini döndürür. |
| [getStyleSimulations()](#getStyleSimulations--) | Bir stil simülasyonunu belirten değeri döndürür. |
| [getUnicodeString()](#getUnicodeString--) | Glyphs öğesi tarafından oluşturulan metin dizesini döndürür. |
| [hashCode()](#hashCode--) |  |
| [isSideways()](#isSideways--) | Bir glifin yanına çevrildiğini gösteren değeri döndürür, köken dönmemiş glifin üst orta kısmı olarak tanımlanır. |
| [iterator()](#iterator--) | Iterable arayüzünün uygulanması. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setBidiLevel(int value)](#setBidiLevel-int-) | Unicode algoritması çift yönlü iç içeleme seviyesini belirten değeri ayarlar. |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Elemanın işlenen bölgesini sınırlayan yol geometrisini ayarlar. |
| [setFill(XpsBrush value)](#setFill-com.aspose.xps.XpsBrush-) | Oluşturulan gliflerin şeklini doldurmak için kullanılan fırçayı ayarlar. |
| [setFontRenderingEmSize(float value)](#setFontRenderingEmSize-float-) | Çizim yüzeyi birimlerinde, etkili koordinat uzayının birimlerinde bir float olarak ifade edilen yazı tipi boyutunu ayarlar. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Bağlantı hedef nesnesini ayarlar. |
| [setOpacity(float value)](#setOpacity-float-) | Elemanın tekdüze şeffaflığını tanımlayan değeri ayarlar. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Elemanın Opaklık özelliğiyle aynı şekilde uygulanan, ancak elemanın farklı alanları için farklı alfa değerlerine izin veren alfa değer maskesini belirten fırçayı ayarlar. |
| [setOriginX(float value)](#setOriginX-float-) | Koşudaki ilk glifin x koordinatını, etkili koordinat uzayının birimlerinde ayarlar. |
| [setOriginY(float value)](#setOriginY-float-) | Koşudaki ilk glifin y koordinatını, etkili koordinat uzayının birimlerinde ayarlar. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Elemanın tüm öznitelikleri ve varsa tüm alt öğeler için yeni bir koordinat çerçevesi oluşturan afin dönüşüm matrisini ayarlar. |
| [setSideways(boolean value)](#setSideways-boolean-) | Bir glifin yanına çevrildiğini gösteren değeri ayarlar, köken dönmemiş glifin üst orta kısmı olarak tanımlanır. |
| [setStyleSimulations(XpsStyleSimulations value)](#setStyleSimulations-com.aspose.xps.XpsStyleSimulations-) | Bir stil simülasyonunu belirten değeri ayarlar. |
| [setUnicodeString(String value)](#setUnicodeString-java.lang.String-) | Glyphs öğesi tarafından oluşturulan metin dizesini ayarlar. |
| [size()](#size--) | Alt öğelerin sayısını döndürür. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsGlyphs deepClone()
```


Bu glyph'leri kopyala.

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Clone of this glyphs.
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
### getBidiLevel() {#getBidiLevel--}
```
public int getBidiLevel()
```


Unicode algoritması çift yönlü iç içeleme seviyesini belirten değeri döndürür. Çift değerler soldan sağa düzeni, tek değerler sağdan sola düzeni gösterir. Sağdan sola düzen, koşu kökenini ilk glifin sağ tarafına yerleştirir, pozitif ilerleme genişlikleri (sola ilerlemeyi temsil eder) sonraki glifleri önceki glifin soluna yerleştirir.

**Returns:**
int - Unicode algoritması çift yönlü iç içeleme seviyesini belirten değer.
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
### getFill() {#getFill--}
```
public XpsBrush getFill()
```


Render edilen gliflerin şeklini doldurmak için kullanılan fırçayı döndürür.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to fill the shape of the rendered glyphs.
### getFont() {#getFont--}
```
public XpsFont getFont()
```


Eleman metnini tipografik olarak ayarlamak için kullanılan TrueType yazı tipinin font kaynağını döndürür.

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - The font resource for the TrueType font used to typeset elements text.
### getFontRenderingEmSize() {#getFontRenderingEmSize--}
```
public float getFontRenderingEmSize()
```


Etkili koordinat uzayının birimleri cinsinden, float olarak ifade edilen, çizim yüzeyi birimlerinde font boyutunu döndürür.

**Returns:**
float - Yazı tipi boyutu.
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
### getOriginX() {#getOriginX--}
```
public float getOriginX()
```


Koşu içindeki ilk glifin x koordinatını, etkili koordinat uzayının birimleri cinsinden döndürür.

**Returns:**
float - Koşudaki ilk glifin x koordinatı, etkili koordinat uzayının birimlerinde.
### getOriginY() {#getOriginY--}
```
public float getOriginY()
```


Koşu içindeki ilk glifin y koordinatını, etkili koordinat uzayının birimleri cinsinden döndürür.

**Returns:**
float - Koşudaki ilk glifin y koordinatı, etkili koordinat uzayının birimlerinde.
### getRenderTransform() {#getRenderTransform--}
```
public XpsMatrix getRenderTransform()
```


Öğenin ve tüm alt öğelerin (varsa) tüm öznitelikleri için yeni bir koordinat çerçevesi oluşturan afin dönüşüm matrisini döndürür.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### getStyleSimulations() {#getStyleSimulations--}
```
public XpsStyleSimulations getStyleSimulations()
```


Bir stil simülasyonunu belirten değeri döndürür.

**Returns:**
[XpsStyleSimulations](../../com.aspose.xps/xpsstylesimulations) - The value specifying a style simulation.
### getUnicodeString() {#getUnicodeString--}
```
public String getUnicodeString()
```


Glyphs öğesi tarafından oluşturulan metin dizesini döndürür. Metin Unicode kod noktaları olarak belirtilir.

**Returns:**
java.lang.String - Glyphs öğesi tarafından oluşturulan metin dizesi.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isSideways() {#isSideways--}
```
public boolean isSideways()
```


Bir glifin yanına çevrildiğini gösteren değeri döndürür, köken dönmemiş glifin üst orta kısmı olarak tanımlanır.

**Returns:**
boolean - Bir glifin yanına çevrildiğini gösteren değer.
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




### setBidiLevel(int value) {#setBidiLevel-int-}
```
public void setBidiLevel(int value)
```


Unicode algoritması çift yönlü iç içeleme seviyesini belirten değeri ayarlar. Çift değerler soldan sağa düzeni, tek değerler sağdan sola düzeni gösterir. Sağdan sola düzen, koşu kökenini ilk glifin sağ tarafına yerleştirir, pozitif ilerleme genişlikleri (sola ilerlemeyi temsil eder) sonraki glifleri önceki glifin soluna yerleştirir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | int | Unicode algoritması çift yönlü iç içeleme seviyesini belirten değer. |

### setClip(XpsPathGeometry value) {#setClip-com.aspose.xps.XpsPathGeometry-}
```
public void setClip(XpsPathGeometry value)
```


Elemanın işlenen bölgesini sınırlayan yol geometrisini ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Elemanın işlenen bölgesini sınırlayan yol geometrisi. |

### setFill(XpsBrush value) {#setFill-com.aspose.xps.XpsBrush-}
```
public void setFill(XpsBrush value)
```


Oluşturulan gliflerin şeklini doldurmak için kullanılan fırçayı ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | Oluşturulan gliflerin şeklini doldurmak için kullanılan fırça. |

### setFontRenderingEmSize(float value) {#setFontRenderingEmSize-float-}
```
public void setFontRenderingEmSize(float value)
```


Çizim yüzeyi birimlerinde, etkili koordinat uzayının birimlerinde bir float olarak ifade edilen yazı tipi boyutunu ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | float | Yazı tipi boyutu. |

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

### setOriginX(float value) {#setOriginX-float-}
```
public void setOriginX(float value)
```


Koşudaki ilk glifin x koordinatını, etkili koordinat uzayının birimlerinde ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | float | Koşudaki ilk glifin x koordinatı, etkili koordinat uzayının birimlerinde. |

### setOriginY(float value) {#setOriginY-float-}
```
public void setOriginY(float value)
```


Koşudaki ilk glifin y koordinatını, etkili koordinat uzayının birimlerinde ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | float | Koşudaki ilk glifin y koordinatı, etkili koordinat uzayının birimlerinde. |

### setRenderTransform(XpsMatrix value) {#setRenderTransform-com.aspose.xps.XpsMatrix-}
```
public void setRenderTransform(XpsMatrix value)
```


Elemanın tüm öznitelikleri ve varsa tüm alt öğeler için yeni bir koordinat çerçevesi oluşturan afin dönüşüm matrisini ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Afin dönüşüm matrisi. |

### setSideways(boolean value) {#setSideways-boolean-}
```
public void setSideways(boolean value)
```


Bir glifin yanına çevrildiğini gösteren değeri ayarlar, köken dönmemiş glifin üst orta kısmı olarak tanımlanır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | boolean | Bir glifin yanına çevrildiğini gösteren değer. |

### setStyleSimulations(XpsStyleSimulations value) {#setStyleSimulations-com.aspose.xps.XpsStyleSimulations-}
```
public void setStyleSimulations(XpsStyleSimulations value)
```


Bir stil simülasyonunu belirten değeri ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | [XpsStyleSimulations](../../com.aspose.xps/xpsstylesimulations) | Stil benzetimini belirten değer. |

### setUnicodeString(String value) {#setUnicodeString-java.lang.String-}
```
public void setUnicodeString(String value)
```


Glyphs öğesi tarafından işlenen metin dizesini ayarlar. Metin Unicode kod noktaları olarak belirtilir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | java.lang.String | Glyphs öğesi tarafından işlenen metin dizesi. |

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

