---
title: TtfEncoding
second_title: Aspose.Font for Java API Reference
description: Represents TTF Font encoding.
type: docs
weight: 73
url: /java/com.aspose.font/ttfencoding/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IFontEncoding](../../com.aspose.font/ifontencoding)
```
public class TtfEncoding implements IFontEncoding
```

Represents TTF Font encoding.
## Methods

| Method | Description |
| --- | --- |
| [gidToUnicode(GlyphId glyphId)](#gidToUnicode-com.aspose.font.GlyphId-) | Decodes glyph id to unicode. |
| [encode(long gid, long charCode)](#encode-long-long-) | Encodes the glyph. |
| [unicodeToGid(long unicode)](#unicodeToGid-long-) | Decodes a unicode and returns glyph id. |
| [decodeToGid(long unicode)](#decodeToGid-long-) | TTF Font's DecodeToGlyphId implementation finds unicode table and returns glyph id for unicode char. |
| [decodeToGidParameterized(IEncodingParameters parameters, long charCode)](#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-) | Parametrized version allows to use specific CMap table (not unicode). |
### gidToUnicode(GlyphId glyphId) {#gidToUnicode-com.aspose.font.GlyphId-}
```
public long gidToUnicode(GlyphId glyphId)
```


Decodes glyph id to unicode. Glyph id is a unique number for a glyph, which is font type dependent. For example: Type1's id is a glyph name, instance of ( GlyphStringId ) class. TTF's id is an int index, instance of ( GlyphUInt32Id ) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Glyph identifier of symbol to decode. |

**Returns:**
long - Unicode value related to glyph id passed.
### encode(long gid, long charCode) {#encode-long-long-}
```
public void encode(long gid, long charCode)
```


Encodes the glyph. For TTF Fonts the character code is unicode.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| gid | long | Glyph identifier. |
| charCode | long | Character code. |

### unicodeToGid(long unicode) {#unicodeToGid-long-}
```
public GlyphId unicodeToGid(long unicode)
```


Decodes a unicode and returns glyph id.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| unicode | long | Unicode to get glyph identifier for. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to unicode passed.
### decodeToGid(long unicode) {#decodeToGid-long-}
```
public GlyphId decodeToGid(long unicode)
```


TTF Font's DecodeToGlyphId implementation finds unicode table and returns glyph id for unicode char. Glyph id is a unique number for a glyph, which is font type dependent. For example: Type1's id is a glyph name, instance of ( GlyphStringId ) class. TTF's id is an int index, instance of ( GlyphUInt32Id ) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| unicode | long | Character code to get glyph identifier for. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to character code passed.
### decodeToGidParameterized(IEncodingParameters parameters, long charCode) {#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-}
```
public GlyphId decodeToGidParameterized(IEncodingParameters parameters, long charCode)
```


Parametrized version allows to use specific CMap table (not unicode).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| parameters | [IEncodingParameters](../../com.aspose.font/iencodingparameters) | Implementation of  IEncodingParameters  interface. |
| charCode | long | character code to get glyph identifier for. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to character code passed.
