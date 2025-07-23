---
title: IFontEncoding
second_title: Aspose.Font for Java API Reference
description: Defines an interface for Font encoding.
type: docs
weight: 123
url: /java/com.aspose.font/ifontencoding/
---```
public interface IFontEncoding
```

Defines an interface for Font encoding.
## Methods

| Method | Description |
| --- | --- |
| [decodeToGid(long charCode)](#decodeToGid-long-) | Decodes a character code and returns glyph id. |
| [decodeToGidParameterized(IEncodingParameters parameters, long charCode)](#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-) | Parameterized decode method. |
| [encode(long gid, long charCode)](#encode-long-long-) | Encodes the glyph. |
| [gidToUnicode(GlyphId gid)](#gidToUnicode-com.aspose.font.GlyphId-) | Decodes Gid to unicode. |
| [unicodeToGid(long unicode)](#unicodeToGid-long-) | Decodes a unicode and returns glyph id. |
### decodeToGid(long charCode) {#decodeToGid-long-}
```
public abstract GlyphId decodeToGid(long charCode)
```


Decodes a character code and returns glyph id. Glyph id is a unique number for a glyph, which is font type dependent. For example: Type1's id is a glyph name, instance of ( GlyphStringId ) class. TTF's id is an int index, instance of ( GlyphUInt32Id ) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| charCode | long | Character code to get glyph identifier for. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to charCode passed.
### decodeToGidParameterized(IEncodingParameters parameters, long charCode) {#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-}
```
public abstract GlyphId decodeToGidParameterized(IEncodingParameters parameters, long charCode)
```


Parameterized decode method. Some font types can have multiple encoding algorithms/maps. So,  IEncodingParameters  interface is used to create concrete font encoding parameters.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| parameters | [IEncodingParameters](../../com.aspose.font/iencodingparameters) | Implementation of  IEncodingParameters  interface. |
| charCode | long | Character code to get glyph identifier for. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to char code passed.
### encode(long gid, long charCode) {#encode-long-long-}
```
public abstract void encode(long gid, long charCode)
```


Encodes the glyph. For TTF Fonts the charCode is unicode.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| gid | long | Glyph id. |
| charCode | long | Character code associated with the glyph id. |

### gidToUnicode(GlyphId gid) {#gidToUnicode-com.aspose.font.GlyphId-}
```
public abstract long gidToUnicode(GlyphId gid)
```


Decodes Gid to unicode. Glyph id is a unique number for a glyph, which is font type dependent. For example: Type1's id is a glyph name, instance of ( GlyphStringId ) class. TTF's id is an int index, instance of ( GlyphUInt32Id ) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| gid | [GlyphId](../../com.aspose.font/glyphid) | Glyph identifier of symbol to decode. |

**Returns:**
long - Unicode value related to glyph id passed.
### unicodeToGid(long unicode) {#unicodeToGid-long-}
```
public abstract GlyphId unicodeToGid(long unicode)
```


Decodes a unicode and returns glyph id. Glyph id is a unique number for a glyph, which is font type dependent. For example: Type1's id is a glyph name, instance of ( GlyphStringId ) class. TTF's id is an int index, instance of ( GlyphUInt32Id ) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| unicode | long | Unicode to get glyph identifier for. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to unicode passed.
