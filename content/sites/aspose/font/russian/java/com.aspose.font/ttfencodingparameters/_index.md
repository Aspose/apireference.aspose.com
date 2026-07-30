---
title: "TtfEncodingParameters"
second_title: "Справочник API Aspose.Font for Java"
description: "Представляет параметры кодировки TTF."
type: docs
weight: 93
url: /ru/java/com.aspose.font/ttfencodingparameters/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IEncodingParameters](../../com.aspose.font/iencodingparameters)
```
public class TtfEncodingParameters implements IEncodingParameters
```

Представляет параметры кодировки TTF. Должен использоваться для запроса конкретной кодировки из шрифта TTF.
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [TtfEncodingParameters(int platformId, int platformSpecificId)](#TtfEncodingParameters-int-int-) | Инициализирует новый экземпляр класса TtfEncodingParameters. |
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getPlatformId()](#getPlatformId--) | Получить значение PlatformId. |
| [getPlatformSpecificId()](#getPlatformSpecificId--) | Получает значение PlatformSpecificId. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setPlatformId(int value)](#setPlatformId-int-) | Устанавливает значение PlatformId. |
| [setPlatformSpecificId(int value)](#setPlatformSpecificId-int-) | Устанавливает значение PlatformSpecificId. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TtfEncodingParameters(int platformId, int platformSpecificId) {#TtfEncodingParameters-int-int-}
```
public TtfEncodingParameters(int platformId, int platformSpecificId)
```


Инициализирует новый экземпляр класса TtfEncodingParameters. Принимает в качестве параметров Platform Id и Platform-specific encoding id. Эти параметры используются для запроса специальной подсубтаблицы CMap из основной таблицы CMap шрифта, см. таблицы 'CMap', 'name' в спецификации файла шрифта OpenType.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| platformId | int | Идентификатор платформы. |
| platformSpecificId | int | Идентификатор кодировки, специфичный для платформы. |

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
### getPlatformId() {#getPlatformId--}
```
public int getPlatformId()
```


Получить значение PlatformId.

**Returns:**
int - значение PlatformId.
### getPlatformSpecificId() {#getPlatformSpecificId--}
```
public int getPlatformSpecificId()
```


Получает значение PlatformSpecificId.

**Returns:**
int - значение PlatformSpecificId.
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




### setPlatformId(int value) {#setPlatformId-int-}
```
public void setPlatformId(int value)
```


Устанавливает значение PlatformId.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | int | Значение PlatformId. |

### setPlatformSpecificId(int value) {#setPlatformSpecificId-int-}
```
public void setPlatformSpecificId(int value)
```


Устанавливает значение PlatformSpecificId.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | int | Значение PlatformSpecificId. |

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

