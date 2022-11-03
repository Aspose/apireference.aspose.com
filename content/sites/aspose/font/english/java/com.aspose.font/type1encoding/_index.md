---
title: Type1Encoding
second_title: Aspose.Font for Java API Reference
description: Represents Type1 Font encoding.
type: docs
weight: 89
url: /java/com.aspose.font/type1encoding/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IFontEncoding](../../com.aspose.font/ifontencoding), [com.aspose.font.ISupportsNameAddressing](../../com.aspose.font/isupportsnameaddressing)
```
public class Type1Encoding implements IFontEncoding, ISupportsNameAddressing
```

Represents Type1 Font encoding.
## Methods

| Method | Description |
| --- | --- |
| [decodeToGid(long charCode)](#decodeToGid-long-) | Decodes Gid to unicode. |
| [decodeToGidParameterized(IEncodingParameters parameters, long charCode)](#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-) | Parameterized decode method. |
| [encode(long gid, long charCode)](#encode-long-long-) | Encodes the glyph. |
| [gidToUnicode(GlyphId gid)](#gidToUnicode-com.aspose.font.GlyphId-) | Decodes Gid to Unicode. |
| [unicodeToGid(long unicode)](#unicodeToGid-long-) | Returns GlyphId for unicode. |
| [getNameToCharCodeIndex()](#getNameToCharCodeIndex--) | Returns name to character code encoding map. |
### decodeToGid(long charCode) {#decodeToGid-long-}
```
public GlyphId decodeToGid(long charCode)
```


Decodes Gid to unicode. Glyph id is a unique number for a glyph, which is font type dependent. For example: Type1's id is a glyph name, instance of ( GlyphStringId ) class. TTF's id is an int index, instance of ( GlyphUInt32Id ) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| charCode | long | Character code to get glyph identifier for. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to character code passed.
### decodeToGidParameterized(IEncodingParameters parameters, long charCode) {#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-}
```
public GlyphId decodeToGidParameterized(IEncodingParameters parameters, long charCode)
```


Parameterized decode method. Not supported for Type1 Font type.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| parameters | [IEncodingParameters](../../com.aspose.font/iencodingparameters) | Not supported for Type1 Font type. |
| charCode | long | Not supported for Type1 Font type. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Not supported for Type1 Font type.
### encode(long gid, long charCode) {#encode-long-long-}
```
public void encode(long gid, long charCode)
```


Encodes the glyph. For TTF Fonts the character code is unicode. Not supported for Type1 Font types.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| gid | long | Glyph id. |
| charCode | long | Character code associated with the glyph id. |

### gidToUnicode(GlyphId gid) {#gidToUnicode-com.aspose.font.GlyphId-}
```
public long gidToUnicode(GlyphId gid)
```


Decodes Gid to Unicode. Glyph id is a unique number for a glyph, which is font type dependent. For example: Type1's id is a glyph name, instance of ( GlyphStringId ) class. TTF's id is an int index, instance of ( GlyphUInt32Id ) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| gid | [GlyphId](../../com.aspose.font/glyphid) | Glyph identifier of symbol to decode. |

**Returns:**
long - Unicode value related to glyph id passed.
### unicodeToGid(long unicode) {#unicodeToGid-long-}
```
public GlyphId unicodeToGid(long unicode)
```


Returns GlyphId for unicode. Or notdef if font doesn't contain glyph for the unicode. Glyph id is a unique number for a glyph, which is font type dependent. For example: Type1's id is a glyph name, instance of ( GlyphStringId ) class. TTF's id is an int index, instance of ( GlyphUInt32Id ) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| unicode | long | Unicode to get glyph identifier for. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to unicode passed.
### getNameToCharCodeIndex() {#getNameToCharCodeIndex--}
```
public NameToCodeMap getNameToCharCodeIndex()
```


Returns name to character code encoding map. Note: Character code is not a unicode. Character code is a char index in Font encoding "table".

**Returns:**
[NameToCodeMap](../../com.aspose.font/nametocodemap) - Name to character code encoding map.
