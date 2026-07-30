---
title: "RenderingUtils"
second_title: "Справочник API Aspose.Font for Java"
description: "Предоставляет вспомогательные методы для рендеринга."
type: docs
weight: 72
url: /ru/java/com.aspose.font/renderingutils/
---
**Inheritance:**
java.lang.Object
```
public class RenderingUtils
```

Предоставляет вспомогательные методы для рендеринга.
## Методы

| Метод | Описание |
| --- | --- |
| [drawText(Font font, GlyphId[] glyphIds, double fontSize)](#drawText-com.aspose.font.Font-com.aspose.font.GlyphId---double-) | Отрисовка текста в Bitmap. |
| [drawText(Font font, GlyphId[] glyphIds, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth)](#drawText-com.aspose.font.Font-com.aspose.font.GlyphId---double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-) | Отрисовка текста в Bitmap. |
| [drawText(Font font, String text, double fontSize)](#drawText-com.aspose.font.Font-java.lang.String-double-) | Отрисовка текста в Bitmap. |
| [drawText(Font font, String text, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth)](#drawText-com.aspose.font.Font-java.lang.String-double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-) | Отрисовка текста в Bitmap. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### drawText(Font font, GlyphId[] glyphIds, double fontSize) {#drawText-com.aspose.font.Font-com.aspose.font.GlyphId---double-}
```
public static InputStream drawText(Font font, GlyphId[] glyphIds, double fontSize)
```


Отрисовка текста в Bitmap. Возвращает результат в формате PNG в виде потока байтов.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| font | [Font](../../com.aspose.font/font) | Шрифт |
| glyphIds | [GlyphId\[\]](../../com.aspose.font/glyphid) | Текст, представленный как массив идентификаторов глифов |
| fontSize | double | Размер шрифта |

**Returns:**
java.io.InputStream — изображение в формате PNG в виде потока байтов
### drawText(Font font, GlyphId[] glyphIds, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth) {#drawText-com.aspose.font.Font-com.aspose.font.GlyphId---double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-}
```
public static InputStream drawText(Font font, GlyphId[] glyphIds, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth)
```


Отрисовка текста в Bitmap. Возвращает результат в формате PNG в виде потока байтов.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| font | [Font](../../com.aspose.font/font) | Шрифт |
| glyphIds | [GlyphId\[\]](../../com.aspose.font/glyphid) | Текст, представленный как массив идентификаторов глифов |
| fontSize | double | Размер шрифта |
| lineSpacingType | [LineSpacingType](../../com.aspose.font/linespacingtype) | Тип межстрочного интервала. Количество пикселей или процент от высоты шрифта |
| lineSpacingValue | int | Значение межстрочного интервала |
| maxWidth | int | Максимальная ширина в пикселях для изображения |

**Returns:**
java.io.InputStream — изображение в формате PNG в виде потока байтов
### drawText(Font font, String text, double fontSize) {#drawText-com.aspose.font.Font-java.lang.String-double-}
```
public static InputStream drawText(Font font, String text, double fontSize)
```


Отрисовка текста в Bitmap.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| font | [Font](../../com.aspose.font/font) | Шрифт. |
| text | java.lang.String | Текст. |
| fontSize | double | Размер шрифта. |

**Returns:**
java.io.InputStream — PNG‑изображение с текстом в виде потока байтов.
### drawText(Font font, String text, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth) {#drawText-com.aspose.font.Font-java.lang.String-double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-}
```
public static InputStream drawText(Font font, String text, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth)
```


Отрисовка текста в Bitmap.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| font | [Font](../../com.aspose.font/font) | Шрифт. |
| text | java.lang.String | Текст. |
| fontSize | double | Размер шрифта. |
| lineSpacingType | [LineSpacingType](../../com.aspose.font/linespacingtype) | Тип межстрочного интервала. Количество пикселей или процент от высоты шрифта. |
| lineSpacingValue | int | Значение межстрочного интервала. |
| maxWidth | int | Максимальная ширина в пикселях для результирующего изображения. |

**Returns:**
java.io.InputStream — PNG‑изображение с текстом в виде потока байтов.
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

