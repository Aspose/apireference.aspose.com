---
title: "XpsRadialGradientBrush"
second_title: "Java için Aspose.Page API Referansı"
description: "RadialGradientBrush özellik öğesi özelliklerini kapsayan sınıf."
type: docs
weight: 48
url: /tr/java/com.aspose.xps/xpsradialgradientbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush), [com.aspose.xps.XpsGradientBrush](../../com.aspose.xps/xpsgradientbrush)
```
public final class XpsRadialGradientBrush extends XpsGradientBrush
```

RadialGradientBrush özelliği öğesinin özelliklerini kapsayan sınıf. Bu öğe, radyal degrade fırçasını belirtmek için kullanılır.
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [deepClone()](#deepClone--) | Bu radyal degrade fırçasını kopyalar. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getCenter()](#getCenter--) | Radyal degrade'nin merkez noktasını döndürür (yani, elipsin merkezi). |
| [getClass()](#getClass--) |  |
| [getColorInterpolationMode()](#getColorInterpolationMode--) | Renk ara değerlemesi için gamma fonksiyonunu belirten değeri döndürür. |
| [getGradientOrigin()](#getGradientOrigin--) | Radyal degrade'nin başlangıç noktasını döndürür. |
| [getGradientStops()](#getGradientStops--) | Degradeyi oluşturan degrade duraklarının listesini döndürür. |
| [getOpacity()](#getOpacity--) | Fırça dolgusunun tekdüze şeffaflığını tanımlayan değeri döndürür. |
| [getRadiusX()](#getRadiusX--) | Radyal degradeyi tanımlayan elipsin x boyutundaki yarıçapı döndürür. |
| [getRadiusY()](#getRadiusY--) | Radyal degradeyi tanımlayan elipsin y boyutundaki yarıçapı döndürür. |
| [getSpreadMethod()](#getSpreadMethod--) | Fırçanın birincil, başlangıç degrade alanının dışındaki içerik alanını nasıl doldurması gerektiğini açıklayan değeri döndürür. |
| [getTransform()](#getTransform--) | Fırçanın koordinat alanına uygulanan matris dönüşümünü döndürür. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setCenter(Point2D value)](#setCenter-java.awt.geom.Point2D-) | Radyal degrade'nin merkez noktasını ayarlar (yani, elipsin merkezi). |
| [setColorInterpolationMode(XpsColorInterpolationMode value)](#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-) | Renk ara değerlemesi için gamma fonksiyonunu belirten değeri ayarlar. |
| [setGradientOrigin(Point2D value)](#setGradientOrigin-java.awt.geom.Point2D-) | Radyal degrade'nin başlangıç noktasını ayarlar. |
| [setGradientStops(List<XpsGradientStop> value)](#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--) | Degradeyi oluşturan degrade duraklarının listesini ayarlar. |
| [setOpacity(float value)](#setOpacity-float-) | Fırça dolgusunun tekdüze şeffaflığını tanımlayan değeri ayarlar. |
| [setRadiusX(float value)](#setRadiusX-float-) | Radyal degradeyi tanımlayan elipsin x boyutundaki yarıçapı ayarlar. |
| [setRadiusY(float value)](#setRadiusY-float-) | Radyal degradeyi tanımlayan elipsin y boyutundaki yarıçapı ayarlar. |
| [setSpreadMethod(XpsSpreadMethod value)](#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-) | Fırçanın birincil, ilk degrade alanının dışındaki içerik alanını nasıl doldurması gerektiğini tanımlayan değeri ayarlar. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Fırçanın koordinat uzayına uygulanan matris dönüşümünü ayarlar. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsRadialGradientBrush deepClone()
```


Bu radyal degrade fırçasını kopyalar.

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - Clone of this radial gradient brush.
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
### getCenter() {#getCenter--}
```
public Point2D getCenter()
```


Radyal degrade'nin merkez noktasını döndürür (yani, elipsin merkezi).

**Returns:**
java.awt.geom.Point2D - Dairesel degrade'nin merkez noktası.
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
### getGradientOrigin() {#getGradientOrigin--}
```
public Point2D getGradientOrigin()
```


Radyal degrade'nin başlangıç noktasını döndürür.

**Returns:**
java.awt.geom.Point2D - Dairesel degrade'nin başlangıç noktası.
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
### getRadiusX() {#getRadiusX--}
```
public float getRadiusX()
```


Radyal degradeyi tanımlayan elipsin x boyutundaki yarıçapı döndürür.

**Returns:**
float - Dairesel degradeyi tanımlayan elipsin x boyutundaki yarıçap.
### getRadiusY() {#getRadiusY--}
```
public float getRadiusY()
```


Radyal degradeyi tanımlayan elipsin y boyutundaki yarıçapı döndürür.

**Returns:**
float - Dairesel degradeyi tanımlayan elipsin y boyutundaki yarıçap.
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




### setCenter(Point2D value) {#setCenter-java.awt.geom.Point2D-}
```
public void setCenter(Point2D value)
```


Radyal degrade'nin merkez noktasını ayarlar (yani, elipsin merkezi).

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | java.awt.geom.Point2D | Dairesel degrade'nin merkez noktası. |

### setColorInterpolationMode(XpsColorInterpolationMode value) {#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-}
```
public void setColorInterpolationMode(XpsColorInterpolationMode value)
```


Renk ara değerlemesi için gama fonksiyonunu belirten değeri ayarlar. Gama ayarı, belirtilmişse alfa bileşenine uygulanmamalıdır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | [XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) | Renk ara değerlemesi için gama fonksiyonunu belirten değer. |

### setGradientOrigin(Point2D value) {#setGradientOrigin-java.awt.geom.Point2D-}
```
public void setGradientOrigin(Point2D value)
```


Radyal degrade'nin başlangıç noktasını ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | java.awt.geom.Point2D | Radyal degrade'nin başlangıç noktası. |

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

### setRadiusX(float value) {#setRadiusX-float-}
```
public void setRadiusX(float value)
```


Radyal degradeyi tanımlayan elipsin x boyutundaki yarıçapı ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | float | Radyal degradeyi tanımlayan elipsin x boyutundaki yarıçapı. |

### setRadiusY(float value) {#setRadiusY-float-}
```
public void setRadiusY(float value)
```


Radyal degradeyi tanımlayan elipsin y boyutundaki yarıçapı ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | float | Radial gradyanı tanımlayan elipsin y boyutundaki yarıçap. |

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

