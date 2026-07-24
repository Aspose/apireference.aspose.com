---
title: "BeforeSavingEventArgs"
second_title: "Java için Aspose.Page API Referansı"
description: "Çeşitli kaydetmeden önceki olayların bağımsız değişkenleri için temel sınıfı tanımlar."
type: docs
weight: 11
url: /tr/java/com.aspose.xps.features.eventbasedmodifications/beforesavingeventargs/
---
**Inheritance:**
java.lang.Object
```
public class BeforeSavingEventArgs<T>
```

Çeşitli kaydetmeden önceki olayların bağımsız değişkenleri için temel sınıfı tanımlar.
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAbsolutePageNumber()](#getAbsolutePageNumber--) | XPS paketindeki tüm belgeler arasında geçerli mutlak sayfa numarasını döndürür. |
| [getClass()](#getClass--) |  |
| [getDocumentNumber()](#getDocumentNumber--) | XPS paketindeki geçerli belge numarasını döndürür. |
| [getElementAPI()](#getElementAPI--) | Kaydedilmek üzere olan öğenin değiştirme API'sini döndürür. |
| [getOutputPageNumber()](#getOutputPageNumber--) | Geçerli çıktı numarasını döndürür. |
| [getRelativePageNumber()](#getRelativePageNumber--) | XPS paketindeki geçerli belgeye göre geçerli sayfa numarasını döndürür. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
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
### getAbsolutePageNumber() {#getAbsolutePageNumber--}
```
public int getAbsolutePageNumber()
```


XPS paketindeki tüm belgeler arasında geçerli mutlak sayfa numarasını döndürür.

**Returns:**
int - XPS paketindeki tüm belgeler arasında geçerli mutlak sayfa numarası.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDocumentNumber() {#getDocumentNumber--}
```
public int getDocumentNumber()
```


XPS paketindeki geçerli belge numarasını döndürür.

**Returns:**
int - XPS paketindeki geçerli belge numarası.
### getElementAPI() {#getElementAPI--}
```
public T getElementAPI()
```


Kaydedilmek üzere olan öğenin değiştirme API'sini döndürür.

**Returns:**
T - Kaydedilmek üzere olan öğenin değiştirme API'si.
### getOutputPageNumber() {#getOutputPageNumber--}
```
public int getOutputPageNumber()
```


Geçerli çıktı numarasını döndürür. **AbsolutePageNumber**, **PageNumbers** kaydetme seçeneği belirtilmişse farklıdır.

**Returns:**
int - Geçerli çıktı numarası.
### getRelativePageNumber() {#getRelativePageNumber--}
```
public int getRelativePageNumber()
```


XPS paketindeki geçerli belgeye göre geçerli sayfa numarasını döndürür.

**Returns:**
int - XPS paketindeki geçerli belgeye göre geçerli sayfa numarası.
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

