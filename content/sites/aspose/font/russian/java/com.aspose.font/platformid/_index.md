---
title: "PlatformId"
second_title: "Справочник API Aspose.Font for Java"
description: "Представляет перечисление PlatformId."
type: docs
weight: 141
url: /ru/java/com.aspose.font/platformid/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum PlatformId extends Enum<PlatformId>
```

Представляет перечисление PlatformId.
## Поля

| Поле | Описание |
| --- | --- |
| [ISO](#ISO) | Value2 Apple спецификация: (зарезервировано; не использовать) MS спецификация: ISO кодировка. |
| [Macintosh](#Macintosh) | Value 1 код менеджера скриптов Macintosh. |
| [Microsoft](#Microsoft) | Value 3 кодировка Microsoft. |
| [Unicode](#Unicode) | Value 0 Unicode |
## Методы

| Метод | Описание |
| --- | --- |
| [<T>valueOf(Class<T> arg0, String arg1)](#-T-valueOf-java.lang.Class-T--java.lang.String-) |  |
| [compareTo(E arg0)](#compareTo-E-) |  |
| [describeConstable()](#describeConstable--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDeclaringClass()](#getDeclaringClass--) |  |
| [hashCode()](#hashCode--) |  |
| [name()](#name--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [ordinal()](#ordinal--) |  |
| [toString()](#toString--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
| [values()](#values--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ISO {#ISO}
```
public static final PlatformId ISO
```


Value2 Apple спецификация: (зарезервировано; не использовать) MS спецификация: ISO кодировка. Обратите внимание, что platform ID 2 (ISO) устарел начиная с OpenType Specification v1.3. Он был предназначен для представления ISO/IEC 10646, в отличие от Unicode; оба стандарта имеют одинаковые назначения кодовых точек.

### Macintosh {#Macintosh}
```
public static final PlatformId Macintosh
```


Value 1 код менеджера скриптов Macintosh.

### Microsoft {#Microsoft}
```
public static final PlatformId Microsoft
```


Value 3 кодировка Microsoft.

### Unicode {#Unicode}
```
public static final PlatformId Unicode
```


Value 0 Unicode

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | java.lang.Class<T> |  |
| arg1 | java.lang.String |  |

**Returns:**
T
### compareTo(E arg0) {#compareTo-E-}
```
public final int compareTo(E arg0)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | E |  |

**Returns:**
int
### describeConstable() {#describeConstable--}
```
public final Optional<Enum.EnumDesc<E>> describeConstable()
```




**Returns:**
java.util.Optional<java.lang.Enum.EnumDesc<E>>
### equals(Object arg0) {#equals-java.lang.Object-}
```
public final boolean equals(Object arg0)
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
### getDeclaringClass() {#getDeclaringClass--}
```
public final Class<E> getDeclaringClass()
```




**Returns:**
java.lang.Class<E>
### hashCode() {#hashCode--}
```
public final int hashCode()
```




**Returns:**
int
### name() {#name--}
```
public final String name()
```




**Returns:**
java.lang.String
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### ordinal() {#ordinal--}
```
public final int ordinal()
```




**Returns:**
int
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static PlatformId valueOf(String name)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| имя | java.lang.String |  |

**Returns:**
[PlatformId](../../com.aspose.font/platformid)
### values() {#values--}
```
public static PlatformId[] values()
```




**Returns:**
com.aspose.font.PlatformId[]
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

