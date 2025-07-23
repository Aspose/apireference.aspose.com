---
title: FontEnvironment
second_title: Aspose.Font for Java API Reference
description: Provides information about the current environment and platform.
type: docs
weight: 38
url: /java/com.aspose.font/fontenvironment/
---
**Inheritance:**
java.lang.Object
```
public class FontEnvironment
```

Provides information about the current environment and platform.
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getCffCommonFontsSettings()](#getCffCommonFontsSettings--) | Settings common to CFF fonts. |
| [getClass()](#getClass--) |  |
| [getCurrent()](#getCurrent--) | Gets current environment. |
| [getCurrentPlatformId()](#getCurrentPlatformId--) | Gets current platform id. |
| [getFontSpecificEncodings()](#getFontSpecificEncodings--) | Stores specific encodings for consumer-aware Fonts. |
| [getStrictness()](#getStrictness--) | Some Fonts may contain unexpected data, non-specified features, or may be roughly cropped. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setStrictness(FontEnvironment.ParsingStrictness value)](#setStrictness-com.aspose.font.FontEnvironment.ParsingStrictness-) | Some Fonts may contain unexpected data, non-specified features, or may be roughly cropped. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getCffCommonFontsSettings() {#getCffCommonFontsSettings--}
```
public static CffFontsSettings getCffCommonFontsSettings()
```


Settings common to CFF fonts.

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


Gets current environment.

**Returns:**
[FontEnvironment](../../com.aspose.font/fontenvironment) - Current environment.
### getCurrentPlatformId() {#getCurrentPlatformId--}
```
public int getCurrentPlatformId()
```


Gets current platform id.

**Returns:**
int - Current platform id.
### getFontSpecificEncodings() {#getFontSpecificEncodings--}
```
public FontSpecificEncodings getFontSpecificEncodings()
```


Stores specific encodings for consumer-aware Fonts. For example, PDF uses Adobe Symbol and ZapfDingbats specific encodings.

**Returns:**
[FontSpecificEncodings](../../com.aspose.font/fontspecificencodings) - Specific encodings for consumer-aware Fonts.
### getStrictness() {#getStrictness--}
```
public FontEnvironment.ParsingStrictness getStrictness()
```


Some Fonts may contain unexpected data, non-specified features, or may be roughly cropped. Tolerant setting is recommended for consumers who want to open any font regardless possible Font's inadequacy. Font internal structures are not guaranteed to be consistent. Strict setting is recommended for consumers who want to open mostly valid and solid Fonts.

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


Some Fonts may contain unexpected data, non-specified features, or may be roughly cropped. Tolerant setting is recommended for consumers who want to open any font regardless possible Font's inadequacy. Font internal structures are not guaranteed to be consistent. Strict setting is recommended for consumers who want to open mostly valid and solid Fonts.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [ParsingStrictness](../../com.aspose.font/parsingstrictness) | Strictness. |

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
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

