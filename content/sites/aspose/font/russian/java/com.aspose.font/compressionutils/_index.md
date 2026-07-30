---
title: "CompressionUtils"
second_title: "Справочник API Aspose.Font for Java"
description: "Предоставляет вспомогательные методы для сжатия и распаковки."
type: docs
weight: 28
url: /ru/java/com.aspose.font/compressionutils/
---
**Inheritance:**
java.lang.Object
```
public class CompressionUtils
```

Предоставляет вспомогательные методы для сжатия и распаковки.
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [CompressionUtils()](#CompressionUtils--) |  |
## Методы

| Метод | Описание |
| --- | --- |
| [decodeByBrotli(byte[] input)](#decodeByBrotli-byte---) | Разжимает заданный массив байтов, сжатый Brotli. |
| [encodeByBrotli(byte[] buff, int buffLength)](#encodeByBrotli-byte---int-) | Сжимает заданный массив байтов с использованием алгоритма Brotli. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### CompressionUtils() {#CompressionUtils--}
```
public CompressionUtils()
```


### decodeByBrotli(byte[] input) {#decodeByBrotli-byte---}
```
public static byte[] decodeByBrotli(byte[] input)
```


Разжимает заданный массив байтов, сжатый Brotli.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| ввод | byte[] | Сжатые данные. |

**Returns:**
byte[] — распакованный массив байтов.
### encodeByBrotli(byte[] buff, int buffLength) {#encodeByBrotli-byte---int-}
```
public static byte[] encodeByBrotli(byte[] buff, int buffLength)
```


Сжимает заданный массив байтов с использованием алгоритма Brotli.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| buff | byte[] | Входной буфер для сжатия. |
| buffLength | int | Длина данных для сжатия. |

**Returns:**
byte[] — сжатый массив байтов.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Параметр | Тип | Описание |
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
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

