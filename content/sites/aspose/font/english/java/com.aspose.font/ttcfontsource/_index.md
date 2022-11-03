---
title: TtcFontSource
second_title: Aspose.Font for Java API Reference
description: Represents TTC Font source.
type: docs
weight: 60
url: /java/com.aspose.font/ttcfontsource/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.font.IFontSource
```
public class TtcFontSource implements IFontSource
```

Represents TTC Font source.
## Constructors

| Constructor | Description |
| --- | --- |
| [TtcFontSource(StreamSource source)](#TtcFontSource-com.aspose.font.StreamSource-) | Creates TTC Font source based on IStreamSource stream providing object. |
| [TtcFontSource(String filePath)](#TtcFontSource-java.lang.String-) | Creates TTC Font source based on ttc font collection file path. |
## Methods

| Method | Description |
| --- | --- |
| [getFontDefinitions()](#getFontDefinitions--) | Returns Font definition array of the TTC Font source. |
### TtcFontSource(StreamSource source) {#TtcFontSource-com.aspose.font.StreamSource-}
```
public TtcFontSource(StreamSource source)
```


Creates TTC Font source based on IStreamSource stream providing object.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| source | [StreamSource](../../com.aspose.font/streamsource) | Source stream to extract TTC Font collection data from. |

### TtcFontSource(String filePath) {#TtcFontSource-java.lang.String-}
```
public TtcFontSource(String filePath)
```


Creates TTC Font source based on ttc font collection file path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| filePath | java.lang.String | Font collection file. |

### getFontDefinitions() {#getFontDefinitions--}
```
public FontDefinition[] getFontDefinitions()
```


Returns Font definition array of the TTC Font source.

**Returns:**
com.aspose.font.FontDefinition[] - All font definitions from TTC Font source.
