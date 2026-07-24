---
title: "XpsTransformableBrush"
second_title: "Java için Aspose.Page API Referansı"
description: "SolidColorBrush dışındaki tüm dönüştürülebilir fırça öğelerinin ortak özelliklerini kapsayan sınıf."
type: docs
weight: 52
url: /tr/java/com.aspose.xps/xpstransformablebrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush)

**All Implemented Interfaces:**
com.aspose.xps.ITransformableProperty
```
public abstract class XpsTransformableBrush extends XpsBrush implements ITransformableProperty
```

Dönüştürülebilir fırçalar öğelerinin (SolidColorBrush dışındakilerin) ortak özelliklerini kapsayan sınıf.
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getOpacity()](#getOpacity--) | Fırça dolgusunun tekdüze şeffaflığını tanımlayan değeri döndürür. |
| [getTransform()](#getTransform--) | Fırçanın koordinat alanına uygulanan matris dönüşümünü döndürür. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOpacity(float value)](#setOpacity-float-) | Fırça dolgusunun tekdüze şeffaflığını tanımlayan değeri ayarlar. |
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
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Fırça dolgusunun tekdüze şeffaflığını tanımlayan değeri döndürür.

**Returns:**
float - Fırça dolgusunun tekdüze şeffaflığını tanımlayan değer.
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




### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Fırça dolgusunun tekdüze şeffaflığını tanımlayan değeri ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | float | Fırça dolgusunun tekdüze şeffaflığını tanımlayan değer. |

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

