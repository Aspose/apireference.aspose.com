---
title: FontEnvironment
second_title: Aspose.Font for Java API Reference
description: Provides information about the current environment and platform.
type: docs
weight: 36
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
| [getCurrent()](#getCurrent--) | Gets current environment. |
| [getCurrentPlatformId()](#getCurrentPlatformId--) | Gets current platform id. |
| [getStrictness()](#getStrictness--) | Some Fonts may contain unexpected data, non-specified features, or may be roughly cropped. |
| [setStrictness(FontEnvironment.ParsingStrictness value)](#setStrictness-com.aspose.font.FontEnvironment.ParsingStrictness-) | Some Fonts may contain unexpected data, non-specified features, or may be roughly cropped. |
| [getFontSpecificEncodings()](#getFontSpecificEncodings--) | Stores specific encodings for consumer-aware Fonts. |
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
### getStrictness() {#getStrictness--}
```
public FontEnvironment.ParsingStrictness getStrictness()
```


Some Fonts may contain unexpected data, non-specified features, or may be roughly cropped. Tolerant setting is recommended for consumers who want to open any font regardless possible Font's inadequacy. Font internal structures are not guaranteed to be consistent. Strict setting is recommended for consumers who want to open mostly valid and solid Fonts.

**Returns:**
[ParsingStrictness](../../com.aspose.font/parsingstrictness) - Strictness.
### setStrictness(FontEnvironment.ParsingStrictness value) {#setStrictness-com.aspose.font.FontEnvironment.ParsingStrictness-}
```
public void setStrictness(FontEnvironment.ParsingStrictness value)
```


Some Fonts may contain unexpected data, non-specified features, or may be roughly cropped. Tolerant setting is recommended for consumers who want to open any font regardless possible Font's inadequacy. Font internal structures are not guaranteed to be consistent. Strict setting is recommended for consumers who want to open mostly valid and solid Fonts.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [ParsingStrictness](../../com.aspose.font/parsingstrictness) | Strictness. |

### getFontSpecificEncodings() {#getFontSpecificEncodings--}
```
public FontSpecificEncodings getFontSpecificEncodings()
```


Stores specific encodings for consumer-aware Fonts. For example, PDF uses Adobe Symbol and ZapfDingbats specific encodings.

**Returns:**
[FontSpecificEncodings](../../com.aspose.font/fontspecificencodings) - Specific encodings for consumer-aware Fonts.
