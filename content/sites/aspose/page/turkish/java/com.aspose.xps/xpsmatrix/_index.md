---
title: "XpsMatrix"
second_title: "Java için Aspose.Page API Referansı"
description: "MatrixTransform özellik öğesi özelliklerini kapsayan sınıf."
type: docs
weight: 36
url: /tr/java/com.aspose.xps/xpsmatrix/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject)
```
public final class XpsMatrix extends XpsObject
```

MatrixTransform özellik öğesi özelliklerini kapsayan sınıf. Bu öğe, öğelerin koordinat sistemlerini değiştirmek için kullanılan keyfi bir afine matris dönüşümünü tanımlar.
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [deepClone()](#deepClone--) | Bu dönüşüm matrisini klonlar. |
| [equals(XpsMatrix a, XpsMatrix b)](#equals-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | Gerçek uygulama. |
| [equals(Object obj)](#equals-java.lang.Object-) | Belirtilen  object  nesnesinin bu örnekle eşit olup olmadığını belirler. |
| [getClass()](#getClass--) |  |
| [getM11()](#getM11--) | M11 öğesini alır. |
| [getM12()](#getM12--) | M12 öğesini alır. |
| [getM21()](#getM21--) | M21 öğesini alır. |
| [getM22()](#getM22--) | M22 öğesini alır. |
| [getM31()](#getM31--) | M31 öğesini alır. |
| [getM32()](#getM32--) | M32 öğesini alır. |
| [hashCode()](#hashCode--) | Bu örnek için bir karma kod döndürür. |
| [isIdentity()](#isIdentity--) | Bu örneğin birim matris olup olmadığını gösteren bir değer alır. |
| [multiply(XpsMatrix matrix)](#multiply-com.aspose.xps.XpsMatrix-) | Bu matrisi,  matrix  tarafından belirtilen matrisi varsayılan (Prepend) sırada çarpar. |
| [multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder)](#multiply-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix.MatrixOrder-) | Bu matrisi,  matrix  tarafından belirtilen matrisi  matrixOrder  tarafından belirtilen sırada çarpar. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [op_Equality(XpsMatrix a, XpsMatrix b)](#op-Equality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | == operatörünü uygular. |
| [op_Inequality(XpsMatrix a, XpsMatrix b)](#op-Inequality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | ! operatörünü uygular. |
| [reset()](#reset--) | Bu Matrisi birim matrisine sıfırlar. |
| [rotate(float angle)](#rotate-float-) | Bu Matrise,  angle  kadar saat yönünde döndürme uygular, varsayılan (Prepend) sırada. |
| [rotate(float angle, XpsMatrix.MatrixOrder matrixOrder)](#rotate-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | Bu Matrise,  angle  kadar saat yönünde döndürme uygular,  matrixOrder  tarafından belirtilen sırada. |
| [rotateAround(float angle, Point2D pivot)](#rotateAround-float-java.awt.geom.Point2D-) | Bu Matrise,  pivot  etrafında  angle  kadar saat yönünde döndürme uygular, varsayılan (Prepend) sırada. |
| [rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder)](#rotateAround-float-java.awt.geom.Point2D-com.aspose.xps.XpsMatrix.MatrixOrder-) | Bu Matrise,  pivot  etrafında  angle  kadar saat yönünde döndürme uygular,  matrixOrder  tarafından belirtilen sırada. |
| [scale(float scaleX, float scaleY)](#scale-float-float-) | Belirtilen ölçek vektörünü (scaleX ve scaleY) bu Matrise varsayılan (Prepend) sırada uygular. |
| [scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder)](#scale-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | Bu Matrise, belirtilen ölçek vektörünü (scaleX ve scaleY)  matrixOrder  tarafından belirtilen sırada uygular. |
| [skew(double skewX, double skewY)](#skew-double-double-) | Belirtilen eğim dönüşümünü bu Matrise uygular. |
| [toString()](#toString--) | Bu  XpsMatrix  örneğinin dize temsilini döndürür. |
| [transform(Rectangle2D rect)](#transform-java.awt.geom.Rectangle2D-) | Bu Matrisin temsil ettiği afin dönüşümünü belirtilen bir dikdörtgene uygular. |
| [transformPoint(Point2D point)](#transformPoint-java.awt.geom.Point2D-) | Bu Matrisin temsil ettiği afin dönüşümünü belirtilen bir noktaya uygular. |
| [transformPoints(Point2D[] points)](#transformPoints-java.awt.geom.Point2D---) | Bu Matrisin temsil ettiği afin dönüşümünü belirtilen nokta dizisine uygular. |
| [transformPoints(Point2D[] points, int startIndex, int numberOfPoints)](#transformPoints-java.awt.geom.Point2D---int-int-) | Bu Matrisin temsil ettiği afin dönüşümünü nokta dizisinin belirtilen bir bölümüne uygular. |
| [translate(float offsetX, float offsetY)](#translate-float-float-) | Belirtilen çeviri vektörünü bu Matrise uygular. |
| [translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder)](#translate-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | Bu Matrise, belirtilen çeviri vektörünü  matrixOrder  tarafından belirtilen sırada uygular. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsMatrix deepClone()
```


Bu dönüşüm matrisini klonlar.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - Clone of this transformation matrix.
### equals(XpsMatrix a, XpsMatrix b) {#equals-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean equals(XpsMatrix a, XpsMatrix b)
```


Gerçek uygulama.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | İlk matris. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | İkinci matris. |

**Returns:**
boolean - [true] eğer matrisler eşitse
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Belirtilen  object  nesnesinin bu örnekle eşit olup olmadığını belirler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | java.lang.Object | Bu örnekle karşılaştırılacak  object  nesnesi. |

**Returns:**
boolean -  true  ise belirtilen nesne bu örnek ile eşitse; aksi takdirde  false .  obj  parametresi null'dur.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getM11() {#getM11--}
```
public float getM11()
```


M11 öğesini alır.

**Returns:**
float - M11 öğesi.
### getM12() {#getM12--}
```
public float getM12()
```


M12 öğesini alır.

**Returns:**
float - M12 öğesi.
### getM21() {#getM21--}
```
public float getM21()
```


M21 öğesini alır.

**Returns:**
float - M21 öğesi.
### getM22() {#getM22--}
```
public float getM22()
```


M22 öğesini alır.

**Returns:**
float - M22 öğesi.
### getM31() {#getM31--}
```
public float getM31()
```


M31 öğesini alır.

**Returns:**
float - M31 öğesi.
### getM32() {#getM32--}
```
public float getM32()
```


M32 öğesini alır.

**Returns:**
float - M32 öğesi.
### hashCode() {#hashCode--}
```
public int hashCode()
```


Bu örnek için bir karma kod döndürür.

**Returns:**
int - Bu örnek için bir hash kodu, hash algoritmaları ve hash tablosu gibi veri yapılarında kullanılmaya uygun.
### isIdentity() {#isIdentity--}
```
public boolean isIdentity()
```


Bu örneğin birim matris olup olmadığını gösteren bir değer alır.

Değer:  True  ise bu örnek birim matrisidir; aksi takdirde  false .

**Returns:**
boolean - Bu örneğin birim matrisi olup olmadığını gösteren bir değer.
### multiply(XpsMatrix matrix) {#multiply-com.aspose.xps.XpsMatrix-}
```
public void multiply(XpsMatrix matrix)
```


Bu matrisi,  matrix  tarafından belirtilen matrisi varsayılan (Prepend) sırada çarpar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| matrix | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Matris. |

### multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder) {#multiply-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder)
```


Bu matrisi,  matrix  tarafından belirtilen matrisi  matrixOrder  tarafından belirtilen sırada çarpar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| matrix | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Matris. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | Sıra. |

### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### op_Equality(XpsMatrix a, XpsMatrix b) {#op-Equality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean op_Equality(XpsMatrix a, XpsMatrix b)
```


== operatörünü uygular.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | İlk matris. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | İkinci matris. |

**Returns:**
boolean - Operatörün sonucu.
### op_Inequality(XpsMatrix a, XpsMatrix b) {#op-Inequality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean op_Inequality(XpsMatrix a, XpsMatrix b)
```


!= operatörünü uygular.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | İlk matris. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | İkinci matris. |

**Returns:**
boolean - Operatörün sonucu.
### reset() {#reset--}
```
public void reset()
```


Bu Matrisi birim matrisine sıfırlar.

### rotate(float angle) {#rotate-float-}
```
public void rotate(float angle)
```


Bu Matrise,  angle  kadar saat yönünde döndürme uygular, varsayılan (Prepend) sırada.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| angle | float | Açı. |

### rotate(float angle, XpsMatrix.MatrixOrder matrixOrder) {#rotate-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void rotate(float angle, XpsMatrix.MatrixOrder matrixOrder)
```


Bu Matrise,  angle  kadar saat yönünde döndürme uygular,  matrixOrder  tarafından belirtilen sırada.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| angle | float | Açı. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | Sıra. |

### rotateAround(float angle, Point2D pivot) {#rotateAround-float-java.awt.geom.Point2D-}
```
public void rotateAround(float angle, Point2D pivot)
```


Bu Matrise,  pivot  etrafında  angle  kadar saat yönünde döndürme uygular, varsayılan (Prepend) sırada.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| angle | float | Açı. |
| pivot | java.awt.geom.Point2D | Dönüm noktası. |

### rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder) {#rotateAround-float-java.awt.geom.Point2D-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder)
```


Bu Matrise,  pivot  etrafında  angle  kadar saat yönünde döndürme uygular,  matrixOrder  tarafından belirtilen sırada.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| angle | float | Açı. |
| pivot | java.awt.geom.Point2D | Dönüm noktası. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | Sıra. |

### scale(float scaleX, float scaleY) {#scale-float-float-}
```
public void scale(float scaleX, float scaleY)
```


Belirtilen ölçek vektörünü (scaleX ve scaleY) bu Matrise varsayılan (Prepend) sırada uygular.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| scaleX | float | Ölçek x. |
| scaleY | float | Y ölçeği. |

### scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder) {#scale-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder)
```


Bu Matrise, belirtilen ölçek vektörünü (scaleX ve scaleY)  matrixOrder  tarafından belirtilen sırada uygular.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| scaleX | float | X ölçeği. |
| scaleY | float | Y ölçeği. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | Sıra. |

### skew(double skewX, double skewY) {#skew-double-double-}
```
public void skew(double skewX, double skewY)
```


Belirtilen eğim dönüşümünü bu Matrise uygular.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| skewX | double | Eğme x. |
| skewY | double | Eğme y. |

### toString() {#toString--}
```
public String toString()
```


Bu  XpsMatrix  örneğinin dize temsilini döndürür.

**Returns:**
java.lang.String - Dize temsili
### transform(Rectangle2D rect) {#transform-java.awt.geom.Rectangle2D-}
```
public Rectangle2D transform(Rectangle2D rect)
```


Bu Matrisin temsil ettiği afin dönüşümünü belirtilen bir dikdörtgene uygular.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| rect | java.awt.geom.Rectangle2D | Dikdörtgen. |

**Returns:**
java.awt.geom.Rectangle2D - Dönüştürülmüş dikdörtgen
### transformPoint(Point2D point) {#transformPoint-java.awt.geom.Point2D-}
```
public Point2D transformPoint(Point2D point)
```


Bu Matrisin temsil ettiği afin dönüşümünü belirtilen bir noktaya uygular.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| nokta | java.awt.geom.Point2D | Nokta. |

**Returns:**
java.awt.geom.Point2D - Dönüştürülmüş nokta
### transformPoints(Point2D[] points) {#transformPoints-java.awt.geom.Point2D---}
```
public void transformPoints(Point2D[] points)
```


Bu Matrisin temsil ettiği afin dönüşümünü belirtilen nokta dizisine uygular.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| noktalar | java.awt.geom.Point2D[] | Noktalar. |

### transformPoints(Point2D[] points, int startIndex, int numberOfPoints) {#transformPoints-java.awt.geom.Point2D---int-int-}
```
public void transformPoints(Point2D[] points, int startIndex, int numberOfPoints)
```


Bu Matrisin temsil ettiği afin dönüşümünü nokta dizisinin belirtilen bir bölümüne uygular.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| noktalar | java.awt.geom.Point2D[] | Noktalar. |
| startIndex | int | Başlangıç indeksi. |
| numberOfPoints | int | Nokta sayısı. |

### translate(float offsetX, float offsetY) {#translate-float-float-}
```
public void translate(float offsetX, float offsetY)
```


Belirtilen çeviri vektörünü bu Matrise uygular.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| offsetX | float | X ofseti. |
| offsetY | float | Y ofseti. |

### translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder) {#translate-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder)
```


Bu Matrise, belirtilen çeviri vektörünü  matrixOrder  tarafından belirtilen sırada uygular.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| offsetX | float | X ofseti. |
| offsetY | float | Y ofseti. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | Sıra. |

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

