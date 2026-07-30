---
title: "Глиф"
second_title: "Справочник API Aspose.Font for Java"
description: "Представляет глиф шрифта."
type: docs
weight: 49
url: /ru/java/com.aspose.font/glyph/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.lang.Cloneable
```
public class Glyph implements Cloneable
```

Представляет глиф шрифта.
## Методы

| Метод | Описание |
| --- | --- |
| [clone()](#clone--) | Возвращает копию глифа. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getGlyphBBox()](#getGlyphBBox--) | Получает ограничивающий прямоугольник глифа. |
| [getLeftSidebearingX()](#getLeftSidebearingX--) | Получает координату x бокового отступа glyph. |
| [getLeftSidebearingY()](#getLeftSidebearingY--) | Получает координату y бокового отступа glyph. |
| [getPath()](#getPath--) | Получает путь glyph. |
| [getSourceResolution()](#getSourceResolution--) | Получает разрешение исходного набора команд. |
| [getState()](#getState--) | Получает состояние glyph. |
| [getWidthVectorX()](#getWidthVectorX--) | Получает вектор ширины glyph. |
| [getWidthVectorY()](#getWidthVectorY--) | Получает вектор ширины glyph. |
| [hashCode()](#hashCode--) |  |
| [isEmpty()](#isEmpty--) | Истина, если glyph не содержит инструкций рисования. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### clone() {#clone--}
```
public Object clone()
```


Возвращает копию глифа.

**Returns:**
java.lang.Object - Копия Glyph.
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
### getGlyphBBox() {#getGlyphBBox--}
```
public FontBBox getGlyphBBox()
```


Получает ограничивающий прямоугольник глифа.

**Returns:**
[FontBBox](../../com.aspose.font/fontbbox) - Glyph BBox
### getLeftSidebearingX() {#getLeftSidebearingX--}
```
public double getLeftSidebearingX()
```


Получает координату x бокового отступа glyph.

**Returns:**
double - Координата x бокового отступа glyph.
### getLeftSidebearingY() {#getLeftSidebearingY--}
```
public double getLeftSidebearingY()
```


Получает координату y бокового отступа glyph.

**Returns:**
double - Координата y бокового отступа glyph.
### getPath() {#getPath--}
```
public SegmentPath getPath()
```


Получает путь glyph.

**Returns:**
[SegmentPath](../../com.aspose.font/segmentpath) - Glyph path.
### getSourceResolution() {#getSourceResolution--}
```
public int getSourceResolution()
```


Получает разрешение исходного набора команд.

**Returns:**
int - Разрешение исходного набора команд.
### getState() {#getState--}
```
public GlyphState getState()
```


Получает состояние glyph.

**Returns:**
[GlyphState](../../com.aspose.font/glyphstate) - Glyph state.
### getWidthVectorX() {#getWidthVectorX--}
```
public double getWidthVectorX()
```


Получает вектор ширины glyph. Координата x.

**Returns:**
double - Вектор ширины glyph. Координата x.
### getWidthVectorY() {#getWidthVectorY--}
```
public double getWidthVectorY()
```


Получает вектор ширины glyph. Координата y.

**Returns:**
double - Вектор ширины glyph. Координата y.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isEmpty() {#isEmpty--}
```
public boolean isEmpty()
```


Истина, если glyph не содержит инструкций рисования.

**Returns:**
boolean - Истина, если glyph не содержит инструкций рисования.
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

