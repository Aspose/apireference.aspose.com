---
title: "StreamSource"
second_title: "Справочник API Aspose.Font for Java"
description: "Определяет способ получения файлового потока при необходимости."
type: docs
weight: 74
url: /ru/java/com.aspose.font/streamsource/
---
**Inheritance:**
java.lang.Object
```
public abstract class StreamSource
```

Определяет способ получения файлового потока при необходимости.
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [StreamSource()](#StreamSource--) | Инициализирует экземпляр источника потока. |
## Методы

| Метод | Описание |
| --- | --- |
| [deepClone()](#deepClone--) | Клонирует объект источника потока. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFontStream()](#getFontStream--) | Возвращает поток шрифта. |
| [getOffset()](#getOffset--) | Получает смещение внутри источника. |
| [hashCode()](#hashCode--) |  |
| [mustCloseAfterUse()](#mustCloseAfterUse--) | Наследники могут предотвратить закрытие потока. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOffset(long value)](#setOffset-long-) | Устанавливает смещение внутри источника. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StreamSource() {#StreamSource--}
```
public StreamSource()
```


Инициализирует экземпляр источника потока.

### deepClone() {#deepClone--}
```
public abstract Object deepClone()
```


Клонирует объект источника потока.

**Returns:**
java.lang.Object - Копия объекта источника потока.
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
### getFontStream() {#getFontStream--}
```
public abstract InputStream getFontStream()
```


Возвращает поток шрифта.

**Returns:**
java.io.InputStream - Поток шрифта.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Получает смещение внутри источника.

**Returns:**
long - Смещение внутри источника.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### mustCloseAfterUse() {#mustCloseAfterUse--}
```
public boolean mustCloseAfterUse()
```


Наследники могут предотвратить закрытие потока. Возвращает true, если источник потока хочет, чтобы поток был закрыт после использования. В противном случае возвращает false.

**Returns:**
boolean - True, если источник потока хочет, чтобы поток был закрыт после использования, иначе false.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setOffset(long value) {#setOffset-long-}
```
public void setOffset(long value)
```


Устанавливает смещение внутри источника.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | long | Смещение внутри источника. |

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

