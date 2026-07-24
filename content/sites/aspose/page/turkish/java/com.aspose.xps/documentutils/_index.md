---
title: "DocumentUtils"
second_title: "Java için Aspose.Page API Referansı"
description: "Bu sınıf, resmi XPS manipülasyon API'sinin ötesinde yardımcı araçlar sağlar."
type: docs
weight: 10
url: /tr/java/com.aspose.xps/documentutils/
---
**Inheritance:**
java.lang.Object
```
public class DocumentUtils
```

Bu sınıf, resmi XPS manipülasyon API'sinin ötesinde yardımcı araçlar sağlar.
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [createCircle(Point2D center, float radius)](#createCircle-java.awt.geom.Point2D-float-) | Bir daireyi temsil eden bir yol geometrisi oluşturur. |
| [createCircularSegment(Point2D center, float radius, float startAngle, float endAngle)](#createCircularSegment-java.awt.geom.Point2D-float-float-float-) | İki açı arasındaki dairesel bir segmenti temsil eden bir yol geometrisi oluşturur. |
| [createEllipse(Point2D center, float radiusX, float radiusY)](#createEllipse-java.awt.geom.Point2D-float-float-) | Bir elipsi temsil eden bir yol geometrisi oluşturur. |
| [createImage(String fileName, Rectangle2D imageBox)](#createImage-java.lang.String-java.awt.geom.Rectangle2D-) | Bir görüntüyle doldurulmuş dikdörtgen bir yol oluşturur. |
| [createImage(String fileName, Rectangle2D imageBox, ImageMode mode)](#createImage-java.lang.String-java.awt.geom.Rectangle2D-com.aspose.xps.ImageMode-) | Bir görüntüyle doldurulmuş dikdörtgen bir yol oluşturur. |
| [createPieSlice(Point2D center, float radius, float startAngle, float endAngle)](#createPieSlice-java.awt.geom.Point2D-float-float-float-) | İki radyal ışın arasındaki daire dilimini temsil eden bir yol geometrisi oluşturur. |
| [createRectangle(Rectangle2D rectangle)](#createRectangle-java.awt.geom.Rectangle2D-) | Bir dikdörtgeni temsil eden bir yol geometrisi oluşturur. |
| [createRegularCircumscribedNGon(int n, Point2D center, float radius)](#createRegularCircumscribedNGon-int-java.awt.geom.Point2D-float-) | Bir daire etrafına dışbükey çizilmiş düzenli n-gon'u temsil eden bir yol geometrisi oluşturur. |
| [createRegularInscribedNGon(int n, Point2D center, float radius)](#createRegularInscribedNGon-int-java.awt.geom.Point2D-float-) | Bir daire içinde içbükey çizilmiş düzenli n-gon'u temsil eden bir yol geometrisi oluşturur. |
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


Bir daireyi temsil eden bir yol geometrisi oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| merkez | java.awt.geom.Point2D | Dairenin merkez noktası. |
| yarıçap | float | Dairenin yarıçapı. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createCircularSegment(Point2D center, float radius, float startAngle, float endAngle) {#createCircularSegment-java.awt.geom.Point2D-float-float-float-}
```
public XpsPathGeometry createCircularSegment(Point2D center, float radius, float startAngle, float endAngle)
```


İki açı arasındaki dairesel bir segmenti temsil eden bir yol geometrisi oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| merkez | java.awt.geom.Point2D | Dairenin merkezi. |
| yarıçap | float | Dairenin yarıçapı. |
| startAngle | float | Başlangıç ışınının açısı (derece). |
| endAngle | float | Bitiş ışınının açısı (derece). |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createEllipse(Point2D center, float radiusX, float radiusY) {#createEllipse-java.awt.geom.Point2D-float-float-}
```
public XpsPathGeometry createEllipse(Point2D center, float radiusX, float radiusY)
```


Bir elipsi temsil eden bir yol geometrisi oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| merkez | java.awt.geom.Point2D | Elipsin merkez noktası. |
| radiusX | float | Elipsin yatay yarıçapı. |
| radiusY | float | Elipsin dikey yarıçapı. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createImage(String fileName, Rectangle2D imageBox) {#createImage-java.lang.String-java.awt.geom.Rectangle2D-}
```
public XpsPath createImage(String fileName, Rectangle2D imageBox)
```


Bir görüntüyle doldurulmuş dikdörtgen bir yol oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| fileName | java.lang.String | Görüntü dosyasının adı. |
| imageBox | java.awt.geom.Rectangle2D | Görüntü ile doldurulacak görüntü kutusu. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - The XPS path.
### createImage(String fileName, Rectangle2D imageBox, ImageMode mode) {#createImage-java.lang.String-java.awt.geom.Rectangle2D-com.aspose.xps.ImageMode-}
```
public XpsPath createImage(String fileName, Rectangle2D imageBox, ImageMode mode)
```


Bir görüntüyle doldurulmuş dikdörtgen bir yol oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| fileName | java.lang.String | Görüntü dosyasının adı. |
| imageBox | java.awt.geom.Rectangle2D | Görüntü ile doldurulacak görüntü kutusu. |
| mode | [ImageMode](../../com.aspose.xps/imagemode) | Görüntü sığdırma modu. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - The XPS path.
### createPieSlice(Point2D center, float radius, float startAngle, float endAngle) {#createPieSlice-java.awt.geom.Point2D-float-float-float-}
```
public XpsPathGeometry createPieSlice(Point2D center, float radius, float startAngle, float endAngle)
```


İki radyal ışın arasındaki daire dilimini temsil eden bir yol geometrisi oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| merkez | java.awt.geom.Point2D | Dairenin merkezi. |
| yarıçap | float | Dairenin yarıçapı. |
| startAngle | float | Başlangıç ışınının açısı (derece). |
| endAngle | float | Bitiş ışınının açısı (derece). |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRectangle(Rectangle2D rectangle) {#createRectangle-java.awt.geom.Rectangle2D-}
```
public XpsPathGeometry createRectangle(Rectangle2D rectangle)
```


Bir dikdörtgeni temsil eden bir yol geometrisi oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| dikdörtgen | java.awt.geom.Rectangle2D | Dikdörtgen. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRegularCircumscribedNGon(int n, Point2D center, float radius) {#createRegularCircumscribedNGon-int-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createRegularCircumscribedNGon(int n, Point2D center, float radius)
```


Bir daire etrafına dışbükey çizilmiş düzenli n-gon'u temsil eden bir yol geometrisi oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| n | int | Köşe sayısı. |
| merkez | java.awt.geom.Point2D | Dairenin merkezi. |
| yarıçap | float | Dairenin yarıçapı. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRegularInscribedNGon(int n, Point2D center, float radius) {#createRegularInscribedNGon-int-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createRegularInscribedNGon(int n, Point2D center, float radius)
```


Bir daire içinde içbükey çizilmiş düzenli n-gon'u temsil eden bir yol geometrisi oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| n | int | Köşe sayısı. |
| merkez | java.awt.geom.Point2D | Dairenin merkezi. |
| yarıçap | float | Dairenin yarıçapı. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
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

