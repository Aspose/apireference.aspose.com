---
title: "DimensionF"
second_title: "Java için Aspose.Page API Referansı"
description: "Dimension sınıfı, bir bileşenin genişliğini ve yüksekliğini tek hassasiyetle tek bir nesnede kapsüller."
type: docs
weight: 11
url: /tr/java/com.aspose.page/dimensionf/
---
**Inheritance:**
java.lang.Object, java.awt.geom.Dimension2D

**All Implemented Interfaces:**
java.io.Serializable
```
public class DimensionF extends Dimension2D implements Serializable
```

`Dimension` sınıfı, bir bileşenin (tek duyarlıkta) genişliğini ve yüksekliğini tek bir nesnede kapsüller.

Normalde `width` ve `height` değerleri negatif olmayan tam sayılardır. Bir boyut oluşturmanıza izin veren yapıcılar, bu özellikler için negatif bir değer ayarlamanızı engellemez. `width` veya `height` değeri negatif ise, diğer nesneler tarafından tanımlanan bazı metodların davranışı tanımsızdır.
## Yapıcılar

| Yapıcı | Açıklama |
| --- | --- |
| [DimensionF()](#DimensionF--) | Sıfır genişlik ve sıfır yükseklikte bir `Dimension` örneği oluşturur. |
| [DimensionF(DimensionF d)](#DimensionF-com.aspose.page.DimensionF-) | Belirtilen boyutun genişliği ve yüksekliğiyle aynı olan bir `Dimension` örneği oluşturur. |
| [DimensionF(float width, float height)](#DimensionF-float-float-) | Bir `Dimension` oluşturur ve belirtilen genişlik ve yükseklik ile başlatır. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| [height](#height) | Yükseklik boyutu; negatif değerler kullanılabilir. |
| [width](#width) | Genişlik boyutu; negatif değerler kullanılabilir. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [clone()](#clone--) |  |
| [equals(Object obj)](#equals-java.lang.Object-) | İki boyut nesnesinin eşit değerlere sahip olup olmadığını kontrol eder. |
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | \{@inheritDoc\} |
| [getSize()](#getSize--) | Bu `Dimension` nesnesinin boyutunu alır. |
| [getWidth()](#getWidth--) | \{@inheritDoc\} |
| [hashCode()](#hashCode--) | Bu `Dimension` için hash kodunu döndürür. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setSize(DimensionF d)](#setSize-com.aspose.page.DimensionF-) | Bu `Dimension` nesnesinin boyutunu belirtilen boyuta ayarlar. |
| [setSize(double width, double height)](#setSize-double-double-) | Bu `Dimension` nesnesinin boyutunu çift hassasiyetle belirtilen genişlik ve yüksekliğe ayarlar. |
| [setSize(float width, float height)](#setSize-float-float-) | Bu `Dimension` nesnesinin boyutunu belirtilen genişlik ve yüksekliğe ayarlar. |
| [setSize(Dimension2D arg0)](#setSize-java.awt.geom.Dimension2D-) |  |
| [toString()](#toString--) | Bu `Dimension` nesnesinin `height` ve `width` alanlarının değerlerinin bir dize temsilini döndürür. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### DimensionF() {#DimensionF--}
```
public DimensionF()
```


Sıfır genişlik ve sıfır yükseklikte bir `Dimension` örneği oluşturur.

### DimensionF(DimensionF d) {#DimensionF-com.aspose.page.DimensionF-}
```
public DimensionF(DimensionF d)
```


Belirtilen boyutun genişliği ve yüksekliğiyle aynı olan bir `Dimension` örneği oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| d | [DimensionF](../../com.aspose.page/dimensionf) | `width` ve `height` değerleri için belirtilen boyut |

### DimensionF(float width, float height) {#DimensionF-float-float-}
```
public DimensionF(float width, float height)
```


Bir `Dimension` oluşturur ve belirtilen genişlik ve yükseklik ile başlatır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| width | float | belirtilen genişlik |
| height | float | belirtilen yükseklik |

### height {#height}
```
public float height
```


Yükseklik boyutu; negatif değerler kullanılabilir.

### width {#width}
```
public float width
```


Genişlik boyutu; negatif değerler kullanılabilir.

### clone() {#clone--}
```
public Object clone()
```




**Returns:**
java.lang.Object
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


İki boyut nesnesinin eşit değerlere sahip olup olmadığını kontrol eder.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getHeight() {#getHeight--}
```
public double getHeight()
```




**Returns:**
double
### getSize() {#getSize--}
```
public DimensionF getSize()
```


Bu `Dimension` nesnesinin boyutunu alır. Bu yöntem, `Component` tarafından tanımlanan `getSize` yöntemine paralel olması için bütünlük sağlamak amacıyla eklenmiştir.

**Returns:**
[DimensionF](../../com.aspose.page/dimensionf) - the size of this dimension, a new instance of `Dimension` with the same width and height
### getWidth() {#getWidth--}
```
public double getWidth()
```




**Returns:**
double
### hashCode() {#hashCode--}
```
public int hashCode()
```


Bu `Dimension` için hash kodunu döndürür.

**Returns:**
int - bu `Dimension` için bir karma kodu
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setSize(DimensionF d) {#setSize-com.aspose.page.DimensionF-}
```
public void setSize(DimensionF d)
```


Bu `Dimension` nesnesinin boyutunu belirtilen boyuta ayarlar. Bu yöntem, `Component` tarafından tanımlanan `setSize` yöntemine paralel olması için bütünlük sağlamak amacıyla eklenmiştir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| d | [DimensionF](../../com.aspose.page/dimensionf) | bu `Dimension` nesnesi için yeni boyut |

### setSize(double width, double height) {#setSize-double-double-}
```
public void setSize(double width, double height)
```


Bu `Dimension` nesnesinin boyutunu çift hassasiyette belirtilen genişlik ve yüksekliğe ayarlar. `width` veya `height` `Integer.MAX_VALUE` değerinden büyükse, `Integer.MAX_VALUE` değerine sıfırlanacağını unutmayın.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| width | double | `Dimension` nesnesi için yeni genişlik |
| height | double | `Dimension` nesnesi için yeni yükseklik |

### setSize(float width, float height) {#setSize-float-float-}
```
public void setSize(float width, float height)
```


Bu `Dimension` nesnesinin boyutunu belirtilen genişlik ve yüksekliğe ayarlar. Bu yöntem, `Component` tarafından tanımlanan `setSize` yöntemine paralel olması için bütünlük sağlamak amacıyla eklenmiştir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| width | float | bu `Dimension` nesnesi için yeni genişlik |
| height | float | bu `Dimension` nesnesi için yeni yükseklik |

### setSize(Dimension2D arg0) {#setSize-java.awt.geom.Dimension2D-}
```
public void setSize(Dimension2D arg0)
```




**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| arg0 | java.awt.geom.Dimension2D |  |

### toString() {#toString--}
```
public String toString()
```


Bu `Dimension` nesnesinin `height` ve `width` alanlarının değerlerinin bir dize temsilini döndürür. Bu yöntem yalnızca hata ayıklama amaçları için kullanılmak üzere tasarlanmıştır ve döndürülen dizeyin içeriği ve biçimi uygulamalara göre değişebilir. Döndürülen dize boş olabilir ancak `null` olamaz.

**Returns:**
java.lang.String - bu `Dimension` nesnesinin bir dize temsili
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

