---
title: "FontEnvironment"
second_title: "Справочник API Aspose.Font for Java"
description: "Предоставляет информацию о текущей среде и платформе."
type: docs
weight: 39
url: /ru/java/com.aspose.font/fontenvironment/
---
**Inheritance:**
java.lang.Object
```
public class FontEnvironment
```

Предоставляет информацию о текущей среде и платформе.
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getCffCommonFontsSettings()](#getCffCommonFontsSettings--) | Настройки, общие для шрифтов CFF. |
| [getClass()](#getClass--) |  |
| [getCurrent()](#getCurrent--) | Получает текущую среду. |
| [getCurrentPlatformId()](#getCurrentPlatformId--) | Получает текущий идентификатор платформы. |
| [getFontSpecificEncodings()](#getFontSpecificEncodings--) | Сохраняет специфические кодировки для шрифтов, учитывающих потребителя. |
| [getStrictness()](#getStrictness--) | Некоторые шрифты могут содержать неожиданные данные, неуказанные функции или быть грубо обрезаны. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setStrictness(FontEnvironment.ParsingStrictness value)](#setStrictness-com.aspose.font.FontEnvironment.ParsingStrictness-) | Некоторые шрифты могут содержать неожиданные данные, неуказанные функции или быть грубо обрезаны. |
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
### getCffCommonFontsSettings() {#getCffCommonFontsSettings--}
```
public static CffFontsSettings getCffCommonFontsSettings()
```


Настройки, общие для шрифтов CFF.

**Returns:**
[CffFontsSettings](../../com.aspose.font/cfffontssettings)
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getCurrent() {#getCurrent--}
```
public static FontEnvironment getCurrent()
```


Получает текущую среду.

**Returns:**
[FontEnvironment](../../com.aspose.font/fontenvironment) - Current environment.
### getCurrentPlatformId() {#getCurrentPlatformId--}
```
public int getCurrentPlatformId()
```


Получает текущий идентификатор платформы.

**Returns:**
int - Текущий идентификатор платформы.
### getFontSpecificEncodings() {#getFontSpecificEncodings--}
```
public FontSpecificEncodings getFontSpecificEncodings()
```


Сохраняет специфические кодировки для шрифтов, учитывающих потребителя. Например, PDF использует специфические кодировки Adobe Symbol и ZapfDingbats.

**Returns:**
[FontSpecificEncodings](../../com.aspose.font/fontspecificencodings) - Specific encodings for consumer-aware Fonts.
### getStrictness() {#getStrictness--}
```
public FontEnvironment.ParsingStrictness getStrictness()
```


Некоторые шрифты могут содержать неожиданные данные, неуказанные функции или быть грубо обрезаны. Для потребителей, желающих открыть любой шрифт независимо от возможных недостатков шрифта, рекомендуется толерантный режим. Внутренние структуры шрифтов не гарантируют согласованность. Для потребителей, желающих открывать в основном корректные и надёжные шрифты, рекомендуется строгий режим.

**Returns:**
[ParsingStrictness](../../com.aspose.font/parsingstrictness) - Strictness.
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




### setStrictness(FontEnvironment.ParsingStrictness value) {#setStrictness-com.aspose.font.FontEnvironment.ParsingStrictness-}
```
public void setStrictness(FontEnvironment.ParsingStrictness value)
```


Некоторые шрифты могут содержать неожиданные данные, неуказанные функции или быть грубо обрезаны. Для потребителей, желающих открыть любой шрифт независимо от возможных недостатков шрифта, рекомендуется толерантный режим. Внутренние структуры шрифтов не гарантируют согласованность. Для потребителей, желающих открывать в основном корректные и надёжные шрифты, рекомендуется строгий режим.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| value | [ParsingStrictness](../../com.aspose.font/parsingstrictness) | Строгость. |

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

