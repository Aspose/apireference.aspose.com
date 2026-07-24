---
title: "XpsGradientBrush"
second_title: "Java için Aspose.Page API Referansı"
description: "LinerGradientBrush ve RadialGradientBrush öğelerinin ortak özelliklerini kapsayan sınıf."
type: docs
weight: 26
url: /tr/java/com.aspose.xps/xpsgradientbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush)
```
public abstract class XpsGradientBrush extends XpsTransformableBrush
```

LinerGradientBrush ve RadialGradientBrush öğelerinin ortak özelliklerini kapsayan sınıf.
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getColorInterpolationMode()](#getColorInterpolationMode--) | Renk ara değerlemesi için gamma fonksiyonunu belirten değeri döndürür. |
| [getGradientStops()](#getGradientStops--) | Degradeyi oluşturan degrade duraklarının listesini döndürür. |
| [getOpacity()](#getOpacity--) | Fırça dolgusunun tekdüze şeffaflığını tanımlayan değeri döndürür. |
| [getSpreadMethod()](#getSpreadMethod--) | Fırçanın birincil, başlangıç degrade alanının dışındaki içerik alanını nasıl doldurması gerektiğini açıklayan değeri döndürür. |
| [getTransform()](#getTransform--) | Fırçanın koordinat alanına uygulanan matris dönüşümünü döndürür. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setColorInterpolationMode(XpsColorInterpolationMode value)](#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-) | Renk ara değerlemesi için gamma fonksiyonunu belirten değeri ayarlar. |
| [setGradientStops(List<XpsGradientStop> value)](#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--) | Degradeyi oluşturan degrade duraklarının listesini ayarlar. |
| [setOpacity(float value)](#setOpacity-float-) | Fırça dolgusunun tekdüze şeffaflığını tanımlayan değeri ayarlar. |
| [setSpreadMethod(XpsSpreadMethod value)](#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-) | Fırçanın birincil, ilk degrade alanının dışındaki içerik alanını nasıl doldurması gerektiğini tanımlayan değeri ayarlar. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Fırçanın koordinat uzayına uygulanan matris dönüşümünü ayarlar. |
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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getColorInterpolationMode() {#getColorInterpolationMode--}
```
public XpsColorInterpolationMode getColorInterpolationMode()
```


Renk ara değerlemesi için gama fonksiyonunu belirten değeri döndürür. Gama ayarı, belirtilmişse alfa bileşenine uygulanmamalıdır.

**Returns:**
[XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) - Value specifying the gamma function for color interpolation.
### getGradientStops() {#getGradientStops--}
```
public List<XpsGradientStop> getGradientStops()
```


Degradeyi oluşturan degrade duraklarının listesini döndürür.

**Returns:**
java.util.List<com.aspose.xps.XpsGradientStop> - Degradeyi oluşturan degrade duraklarının listesi.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Fırça dolgusunun tekdüze şeffaflığını tanımlayan değeri döndürür.

**Returns:**
float - Fırça dolgusunun tekdüze şeffaflığını tanımlayan değer.
### getSpreadMethod() {#getSpreadMethod--}
```
public XpsSpreadMethod getSpreadMethod()
```


Fırçanın birincil, başlangıç degrade alanının dışındaki içerik alanını nasıl doldurması gerektiğini açıklayan değeri döndürür.

**Returns:**
[XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) - Value describing how the brush should fill the content area outside of the primary, initial gradient area.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Fırçanın koordinat uzayına uygulanan matris dönüşümünü döndürür. Transform özelliği, fırçaya yerel etkili bir render dönüşümü sağlamak için mevcut etkili render dönüşümüyle birleştirilir. Fırça için görünüm alanı, yerel etkili render dönüşümü kullanılarak dönüştürülür.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The matrix transformation applied to the coordinate space of the brush.
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




### setColorInterpolationMode(XpsColorInterpolationMode value) {#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-}
```
public void setColorInterpolationMode(XpsColorInterpolationMode value)
```


Renk ara değerlemesi için gama fonksiyonunu belirten değeri ayarlar. Gama ayarı, belirtilmişse alfa bileşenine uygulanmamalıdır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | [XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) | Renk ara değerlemesi için gama fonksiyonunu belirten değer. |

### setGradientStops(List<XpsGradientStop> value) {#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--}
```
public void setGradientStops(List<XpsGradientStop> value)
```


Degradeyi oluşturan degrade duraklarının listesini ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | java.util.List<com.aspose.xps.XpsGradientStop> | Degradeyi oluşturan degrade duraklarının listesi. |

### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Fırça dolgusunun tekdüze şeffaflığını tanımlayan değeri ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | float | Fırça dolgusunun tekdüze şeffaflığını tanımlayan değer. |

### setSpreadMethod(XpsSpreadMethod value) {#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-}
```
public void setSpreadMethod(XpsSpreadMethod value)
```


Fırçanın birincil, ilk degrade alanının dışındaki içerik alanını nasıl doldurması gerektiğini tanımlayan değeri ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | [XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) | Fırçanın birincil, ilk degrade alanının dışındaki içerik alanını nasıl doldurması gerektiğini tanımlayan değer. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Fırçanın koordinat uzayına uygulanan matris dönüşümünü ayarlar. Transform özelliği, fırçaya yerel etkili bir render dönüşümü sağlamak için mevcut etkili render dönüşümüyle birleştirilir. Fırça için görünüm alanı, yerel etkili render dönüşümü kullanılarak dönüştürülür.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Fırçanın koordinat uzayına uygulanan matris dönüşümü. |

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

