---
title: "FileResult"
second_title: "Java için Aspose.Page API Referansı"
description: "Dosya yolu içeren bir dize biçiminde işlem sonucunu temsil eder."
type: docs
weight: 14
url: /tr/java/com.aspose.page.plugins/fileresult/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IOperationResult](../../com.aspose.page.plugins/ioperationresult)
```
public final class FileResult implements IOperationResult
```

Dosya yolu içeren bir dize biçiminde işlem sonucunu temsil eder.
## Yapıcılar

| Yapıcı | Açıklama |
| --- | --- |
| [FileResult(String path)](#FileResult-java.lang.String-) | Belirtilen çıktı dosyası yoluyla yeni bir örnek başlatır. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getData()](#getData--) | Ham veriyi alır. |
| [hashCode()](#hashCode--) |  |
| [isByteArray()](#isByteArray--) | Sonucun bir bayt dizisi olup olmadığını gösterir. |
| [isFile()](#isFile--) | Sonucun bir çıktı dosyasının yolu olup olmadığını gösterir. |
| [isStream()](#isStream--) | Sonucun bir çıktı akışı olup olmadığını gösterir. |
| [isString()](#isString--) | Sonucun bir metin dizesi olup olmadığını gösterir. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toFile()](#toFile--) | Sonucu bir dosyaya dönüştürmeye çalışır. |
| [toStream()](#toStream--) | Sonucu bir akış nesnesine dönüştürmeye çalışır. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FileResult(String path) {#FileResult-java.lang.String-}
```
public FileResult(String path)
```


Belirtilen çıktı dosyası yoluyla yeni bir örnek başlatır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| yol | java.lang.String | Bir dosyanın yolu. |

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
### getData() {#getData--}
```
public final Object getData()
```


Ham veriyi alır.

**Returns:**
java.lang.Object - Çıktı verisini temsil eden bir nesne.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isByteArray() {#isByteArray--}
```
public final boolean isByteArray()
```


Sonucun bir bayt dizisi olup olmadığını gösterir.

**Returns:**
boolean -  true  sonuç bir bayt dizisi ise; aksi takdirde  false .
### isFile() {#isFile--}
```
public final boolean isFile()
```


Sonucun bir çıktı dosyasının yolu olup olmadığını gösterir.

**Returns:**
boolean -  true  sonuç bir dosya ise; aksi takdirde  false .
### isStream() {#isStream--}
```
public final boolean isStream()
```


Sonucun bir çıktı akışı olup olmadığını gösterir.

**Returns:**
boolean -  true  sonuç bir akış nesnesi ise; aksi takdirde  false .
### isString() {#isString--}
```
public final boolean isString()
```


Sonucun bir metin dizesi olup olmadığını gösterir.

**Returns:**
boolean -  true  sonuç bir dize ise; aksi takdirde  false .
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### toFile() {#toFile--}
```
public final String toFile()
```


Sonucu bir dosyaya dönüştürmeye çalışır.

**Returns:**
java.lang.String - Sonuç bir dosya ise çıktı dosyasının yolunu temsil eden bir dize; aksi takdirde  null .
### toStream() {#toStream--}
```
public final OutputStream toStream()
```


Sonucu bir akış nesnesine dönüştürmeye çalışır.

**Returns:**
java.io.OutputStream - Sonuç akış ise çıktı verisini temsil eden bir akış nesnesi; aksi takdirde null.
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

