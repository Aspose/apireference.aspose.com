---
title: TtcFontFileDefinition
second_title: Aspose.Font for Java API Reference
description: Represents file definition for TTC Font.
type: docs
weight: 59
url: /java/com.aspose.font/ttcfontfiledefinition/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.FontFileDefinition](../../com.aspose.font/fontfiledefinition)
```
public class TtcFontFileDefinition extends FontFileDefinition
```

Represents file definition for TTC Font.
## Constructors

| Constructor | Description |
| --- | --- |
| [TtcFontFileDefinition(int fontIndex, String fileExtension, StreamSource streamSource, long offset)](#TtcFontFileDefinition-int-java.lang.String-com.aspose.font.StreamSource-long-) | Creates a file definition using file content only. |
## Methods

| Method | Description |
| --- | --- |
| [getFontIndex()](#getFontIndex--) | Gets Font index inside TTC Font. |
### TtcFontFileDefinition(int fontIndex, String fileExtension, StreamSource streamSource, long offset) {#TtcFontFileDefinition-int-java.lang.String-com.aspose.font.StreamSource-long-}
```
public TtcFontFileDefinition(int fontIndex, String fileExtension, StreamSource streamSource, long offset)
```


Creates a file definition using file content only.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fontIndex | int | Index of font inside TTC font collection. |
| fileExtension | java.lang.String | Extension of font file collection. |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | Source of font file collection. |
| offset | long | Offset to font data in font file collection, see TTC Header, Offset Table in OpenType Font File specification |

### getFontIndex() {#getFontIndex--}
```
public long getFontIndex()
```


Gets Font index inside TTC Font.

**Returns:**
long - Font index inside TTC Font.
