---
title: "CffFontMetrics"
second_title: "Справочник API Aspose.Font for Java"
description: "Реализация метрик шрифтов CFF"
type: docs
weight: 21
url: /ru/java/com.aspose.font/cfffontmetrics/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.FontMetrics](../../com.aspose.font/fontmetrics)
```
public class CffFontMetrics extends FontMetrics
```

Реализация метрик шрифтов CFF
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAscender()](#getAscender--) | Получает значение Ascender. |
| [getAscender(double fontSize)](#getAscender-double-) | Возвращает ascender для конкретного размера шрифта. |
| [getClass()](#getClass--) |  |
| [getDescender()](#getDescender--) | Получает значение Descender. |
| [getDescender(double fontSize)](#getDescender-double-) | Возвращает descender для конкретного размера шрифта. |
| [getFontBBox()](#getFontBBox--) | Получает значение FontBBox. |
| [getFontMatrix()](#getFontMatrix--) | Получает значение FontMatrix. |
| [getFontMatrixForGlyph(GlyphId glyphId)](#getFontMatrixForGlyph-com.aspose.font.GlyphId-) | Вычисляет матрицу преобразования для глифа, указанного по идентификатору. |
| [getGlyphBBox(GlyphId glyphId)](#getGlyphBBox-com.aspose.font.GlyphId-) | Возвращает Bbox глифа. |
| [getGlyphWidth(GlyphId glyphId)](#getGlyphWidth-com.aspose.font.GlyphId-) | Возвращает ширину глифа. |
| [getKerningValue(GlyphId prevGlyphId, GlyphId nextGlyphId)](#getKerningValue-com.aspose.font.GlyphId-com.aspose.font.GlyphId-) | Возвращает значение кернинга для пары глифов. |
| [getLineGap()](#getLineGap--) | Получает значение LineGap. |
| [getTypoAscender()](#getTypoAscender--) | Получает значение TypoAscender. |
| [getTypoAscender(double fontSize)](#getTypoAscender-double-) | Возвращает типографический восходящий показатель для конкретного размера шрифта. |
| [getTypoDescender()](#getTypoDescender--) | Получает значение TypoDescender. |
| [getTypoDescender(double fontSize)](#getTypoDescender-double-) | Возвращает типографический нисходящий показатель для конкретного размера шрифта. |
| [getTypoLineGap()](#getTypoLineGap--) | Получает значение TypoLineGap. |
| [getTypoLineGap(double fontSize)](#getTypoLineGap-double-) | Возвращает межстрочный интервал для конкретного размера шрифта. |
| [getUnitsPerEM()](#getUnitsPerEM--) | Получает значение UnitsPerEM. |
| [hashCode()](#hashCode--) |  |
| [isFixedPitch()](#isFixedPitch--) | Получает значение IsFixedPitch. |
| [measureString(String unicode, double fontSize)](#measureString-java.lang.String-double-) | Измеряет строку и возвращает её ширину. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAscender(double value)](#setAscender-double-) | Устанавливает значение Ascender. |
| [setDescender(double value)](#setDescender-double-) | Устанавливает значение Descender. |
| [setGlyphWidth(GlyphId glyphId, double value)](#setGlyphWidth-com.aspose.font.GlyphId-double-) |  |
| [setTypoAscender(double value)](#setTypoAscender-double-) | Устанавливает значение TypoAscender. |
| [setTypoDescender(double value)](#setTypoDescender-double-) | Устанавливает значение TypoDescender. |
| [setUnitsPerEM(long value)](#setUnitsPerEM-long-) | Устанавливает значение UnitsPerEM. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### getAscender() {#getAscender--}
```
public double getAscender()
```


Получает значение Ascender.

**Returns:**
double — значение Ascender.
### getAscender(double fontSize) {#getAscender-double-}
```
public double getAscender(double fontSize)
```


Возвращает ascender для конкретного размера шрифта.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fontSize | double | Размер шрифта. |

**Returns:**
double — значение Ascender.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDescender() {#getDescender--}
```
public double getDescender()
```


Получает значение Descender.

**Returns:**
double — значение Descender.
### getDescender(double fontSize) {#getDescender-double-}
```
public double getDescender(double fontSize)
```


Возвращает descender для конкретного размера шрифта.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fontSize | double | Размер шрифта. |

**Returns:**
double — значение Descender.
### getFontBBox() {#getFontBBox--}
```
public FontBBox getFontBBox()
```


Получает значение FontBBox.

**Returns:**
[FontBBox](../../com.aspose.font/fontbbox) - FontBBox value.
### getFontMatrix() {#getFontMatrix--}
```
public TransformationMatrix getFontMatrix()
```


Получает значение FontMatrix.

**Returns:**
[TransformationMatrix](../../com.aspose.font/transformationmatrix) - FontMatrix value.
### getFontMatrixForGlyph(GlyphId glyphId) {#getFontMatrixForGlyph-com.aspose.font.GlyphId-}
```
public TransformationMatrix getFontMatrixForGlyph(GlyphId glyphId)
```


Вычисляет матрицу преобразования для глифа, указанного по идентификатору.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Идентификатор глифа. |

**Returns:**
[TransformationMatrix](../../com.aspose.font/transformationmatrix) - Glyph transformation matrix.
### getGlyphBBox(GlyphId glyphId) {#getGlyphBBox-com.aspose.font.GlyphId-}
```
public FontBBox getGlyphBBox(GlyphId glyphId)
```


Возвращает Bbox глифа. Возвращает FontBBox, если BBox не был определён для глифа. Может быть переопределено конкретными наследниками кодировки шрифта.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Идентификатор глифа. |

**Returns:**
[FontBBox](../../com.aspose.font/fontbbox) - Glyph BBox.
### getGlyphWidth(GlyphId glyphId) {#getGlyphWidth-com.aspose.font.GlyphId-}
```
public double getGlyphWidth(GlyphId glyphId)
```


Возвращает ширину глифа. Может быть переопределено конкретными наследниками кодировки шрифта.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Идентификатор глифа. |

**Returns:**
double - ширина глифа.
### getKerningValue(GlyphId prevGlyphId, GlyphId nextGlyphId) {#getKerningValue-com.aspose.font.GlyphId-com.aspose.font.GlyphId-}
```
public double getKerningValue(GlyphId prevGlyphId, GlyphId nextGlyphId)
```


Возвращает значение кернинга для пары глифов.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| prevGlyphId | [GlyphId](../../com.aspose.font/glyphid) | Первый глиф в паре. |
| nextGlyphId | [GlyphId](../../com.aspose.font/glyphid) | Размер шрифта. |

**Returns:**
double - значение кернинга.
### getLineGap() {#getLineGap--}
```
public double getLineGap()
```


Получает значение LineGap.

**Returns:**
double - значение LineGap.
### getTypoAscender() {#getTypoAscender--}
```
public double getTypoAscender()
```


Получает значение TypoAscender.

**Returns:**
double - значение TypoAscender.
### getTypoAscender(double fontSize) {#getTypoAscender-double-}
```
public double getTypoAscender(double fontSize)
```


Возвращает типографический восходящий показатель для конкретного размера шрифта.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fontSize | double | Размер шрифта. |

**Returns:**
double - значение типографского восходящего знака.
### getTypoDescender() {#getTypoDescender--}
```
public double getTypoDescender()
```


Получает значение TypoDescender.

**Returns:**
double - значение TypoDescender.
### getTypoDescender(double fontSize) {#getTypoDescender-double-}
```
public double getTypoDescender(double fontSize)
```


Возвращает типографический нисходящий показатель для конкретного размера шрифта.

param fontSize Размер шрифта.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fontSize | double |  |

**Returns:**
double - значение типографского нисходящего знака.
### getTypoLineGap() {#getTypoLineGap--}
```
public double getTypoLineGap()
```


Получает значение TypoLineGap.

**Returns:**
double - значение TypoLineGap.
### getTypoLineGap(double fontSize) {#getTypoLineGap-double-}
```
public double getTypoLineGap(double fontSize)
```


Возвращает межстрочный интервал для конкретного размера шрифта.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fontSize | double | Размер шрифта. |

**Returns:**
double - значение промежутка строк.
### getUnitsPerEM() {#getUnitsPerEM--}
```
public long getUnitsPerEM()
```


Получает значение UnitsPerEM.

**Returns:**
long - значение UnitsPerEM.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isFixedPitch() {#isFixedPitch--}
```
public boolean isFixedPitch()
```


Получает значение IsFixedPitch.

**Returns:**
boolean - значение IsFixedPitch.
### measureString(String unicode, double fontSize) {#measureString-java.lang.String-double-}
```
public double measureString(String unicode, double fontSize)
```


Измеряет строку и возвращает её ширину.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| unicode | java.lang.String | Unicode строка. |
| fontSize | double | Размер шрифта. |

**Returns:**
double - ширина строки.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setAscender(double value) {#setAscender-double-}
```
public void setAscender(double value)
```


Устанавливает значение Ascender.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | double | Значение восходящего знака. |

### setDescender(double value) {#setDescender-double-}
```
public void setDescender(double value)
```


Устанавливает значение Descender.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | double | Значение нисходящего знака. |

### setGlyphWidth(GlyphId glyphId, double value) {#setGlyphWidth-com.aspose.font.GlyphId-double-}
```
public void setGlyphWidth(GlyphId glyphId, double value)
```


Устанавливает ширину глифа.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) |  |
| значение | double |  |

### setTypoAscender(double value) {#setTypoAscender-double-}
```
public void setTypoAscender(double value)
```


Устанавливает значение TypoAscender.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | double | Значение TypoAscender. |

### setTypoDescender(double value) {#setTypoDescender-double-}
```
public void setTypoDescender(double value)
```


Устанавливает значение TypoDescender.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | double | Значение TypoDescender. |

### setUnitsPerEM(long value) {#setUnitsPerEM-long-}
```
public void setUnitsPerEM(long value)
```


Устанавливает значение UnitsPerEM.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | long | Значение UnitsPerEM. |

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

