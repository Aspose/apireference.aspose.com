---
title: "GlyphId"
second_title: "Справочник API Aspose.Font for Java"
description: "Представляет идентификаторы глифов, доступные в шрифте."
type: docs
weight: 50
url: /ru/java/com.aspose.font/glyphid/
---
**Inheritance:**
java.lang.Object
```
public abstract class GlyphId
```

Представляет идентификаторы глифов, доступные в шрифте. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Например: идентификатор Type1 представляет собой имя глифа, экземпляр класса ( GlyphStringId ). Идентификатор TTF — это целочисленный индекс, экземпляр класса ( GlyphUInt32Id ).
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object obj)](#equals-java.lang.Object-) | Возвращает true, если два идентификатора глифов не равны. |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) | Возвращает хеш-код объекта. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [op_Equality(GlyphId obj1, Object obj2)](#op-Equality-com.aspose.font.GlyphId-java.lang.Object-) | Возвращает true, если два идентификатора глифов равны. |
| [op_Inequality(GlyphId obj1, Object obj2)](#op-Inequality-com.aspose.font.GlyphId-java.lang.Object-) | Возвращает true, если два идентификатора глифов не равны. |
| [toGlyphStringId()](#toGlyphStringId--) | Виртуальное приведение к GlyphStringId. |
| [toGlyphUInt32Id()](#toGlyphUInt32Id--) | Виртуальное преобразование в GlyphUInt32Id. |
| [toString()](#toString--) | Возвращает строковое представление идентификатора глифа. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Возвращает true, если два идентификатора глифов не равны.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| obj | java.lang.Object | Идентификатор глифа для сравнения. |

**Returns:**
boolean - Результат сравнения.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### hashCode() {#hashCode--}
```
public abstract int hashCode()
```


Возвращает хеш-код объекта.

**Returns:**
int - Хеш-код объекта.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### op_Equality(GlyphId obj1, Object obj2) {#op-Equality-com.aspose.font.GlyphId-java.lang.Object-}
```
public static boolean op_Equality(GlyphId obj1, Object obj2)
```


Возвращает true, если два идентификатора глифов равны.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| obj1 | [GlyphId](../../com.aspose.font/glyphid) | Первый идентификатор глифа для сравнения. |
| obj2 | java.lang.Object | Второй идентификатор глифа для сравнения. |

**Returns:**
boolean - Результат сравнения.
### op_Inequality(GlyphId obj1, Object obj2) {#op-Inequality-com.aspose.font.GlyphId-java.lang.Object-}
```
public static boolean op_Inequality(GlyphId obj1, Object obj2)
```


Возвращает true, если два идентификатора глифов не равны.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| obj1 | [GlyphId](../../com.aspose.font/glyphid) | Первый идентификатор глифа для сравнения. |
| obj2 | java.lang.Object | Второй идентификатор глифа для сравнения. |

**Returns:**
boolean - Результат сравнения.
### toGlyphStringId() {#toGlyphStringId--}
```
public GlyphStringId toGlyphStringId()
```


Виртуальное приведение к GlyphStringId. GlyphStringId переопределяет, чтобы вернуть экземпляр.

**Returns:**
[GlyphStringId](../../com.aspose.font/glyphstringid) - null
### toGlyphUInt32Id() {#toGlyphUInt32Id--}
```
public GlyphUInt32Id toGlyphUInt32Id()
```


Виртуальное преобразование в GlyphUInt32Id. GlyphUInt32Id переопределяет метод для возврата экземпляра.

**Returns:**
[GlyphUInt32Id](../../com.aspose.font/glyphuint32id) - null
### toString() {#toString--}
```
public abstract String toString()
```


Возвращает строковое представление идентификатора глифа.

**Returns:**
java.lang.String — идентификатор глифа
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

