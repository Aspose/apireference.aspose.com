---
title: CffEncoding
second_title: Aspose.Font for Java API Reference
description: Represents CFF font encoding.
type: docs
weight: 11
url: /java/com.aspose.font/cffencoding/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IFontEncoding](../../com.aspose.font/ifontencoding), [com.aspose.font.ISupportsNameAddressing](../../com.aspose.font/isupportsnameaddressing)
```
public class CffEncoding implements IFontEncoding, ISupportsNameAddressing
```

Represents CFF font encoding.
## Methods

| Method | Description |
| --- | --- |
| [gidToUnicode(GlyphId gid)](#gidToUnicode-com.aspose.font.GlyphId-) | Decodes Gid to unicode. |
| [encode(long gid, long charCode)](#encode-long-long-) | Encodes the glyph. |
| [unicodeToGid(long unicode)](#unicodeToGid-long-) | Decodes a unicode and returns glyph id. |
| [decodeToGid(long charCode)](#decodeToGid-long-) | Gets Gid for charCode passed. |
| [decodeToGidParameterized(IEncodingParameters parameters, long charCode)](#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-) | Parameterized decode method. |
| [getNameToCharCodeIndex()](#getNameToCharCodeIndex--) | Returns name to character code encoding map. |
| [getNameToGidIndex()](#getNameToGidIndex--) | Returns name to character code encoding map. |
| [getNameToSidIndex()](#getNameToSidIndex--) | Returns name to character code encoding map. |
| [getSidName(int sid)](#getSidName-int-) | Gets name for the SID specified. |
### gidToUnicode(GlyphId gid) {#gidToUnicode-com.aspose.font.GlyphId-}
```
public long gidToUnicode(GlyphId gid)
```


Decodes Gid to unicode. Glyph id is a unique number for a glyph, which is font type dependent. CFF Font glyph id can be instance of ( GlyphStringId ) class or ( GlyphUInt32Id ) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| gid | [GlyphId](../../com.aspose.font/glyphid) | Glyph identifier of symbol to decode. |

**Returns:**
long - Unicode value related to glyph id passed.
### encode(long gid, long charCode) {#encode-long-long-}
```
public void encode(long gid, long charCode)
```


Encodes the glyph. Not supported for CFF Font types.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| gid | long | Glyph id |
| charCode | long | CharCode associated with the glyph id. |

### unicodeToGid(long unicode) {#unicodeToGid-long-}
```
public GlyphId unicodeToGid(long unicode)
```


Decodes a unicode and returns glyph id. Glyph id is a unique number for a glyph, which is font type dependent. CFF Font glyph id can be instance of ( GlyphStringId ) class or ( GlyphUInt32Id ) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| unicode | long | Unicode to get glyph identifier for. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to unicode passed.
### decodeToGid(long charCode) {#decodeToGid-long-}
```
public GlyphId decodeToGid(long charCode)
```


Gets Gid for charCode passed. This method designed for a CFF CIDFonts, where charCode must be a valid CID value. Glyph id is a unique number for a glyph, which is font type dependent. CFF Font glyph id can be instance of ( GlyphStringId ) class or ( GlyphUInt32Id ) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| charCode | long | Character code (CID) to get glyph identifier for. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to CID passed.
### decodeToGidParameterized(IEncodingParameters parameters, long charCode) {#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-}
```
public GlyphId decodeToGidParameterized(IEncodingParameters parameters, long charCode)
```


Parameterized decode method. Not supported for CFF Font type.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| parameters | [IEncodingParameters](../../com.aspose.font/iencodingparameters) | Implementation of  IEncodingParameters  interface. |
| charCode | long | Character code to get glyph identifier for. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to charCode passed.
### getNameToCharCodeIndex() {#getNameToCharCodeIndex--}
```
public NameToCodeMap getNameToCharCodeIndex()
```


Returns name to character code encoding map. Note: character code is not a unicode. Character code is a char index in Font encoding "table".

**Returns:**
[NameToCodeMap](../../com.aspose.font/nametocodemap) - Name to character code encoding map.
### getNameToGidIndex() {#getNameToGidIndex--}
```
public NameToCodeMap getNameToGidIndex()
```


Returns name to character code encoding map. Note: character code is not a unicode. Character code is a char index in Font encoding "table".

**Returns:**
[NameToCodeMap](../../com.aspose.font/nametocodemap) - Name to character code encoding map.
### getNameToSidIndex() {#getNameToSidIndex--}
```
public NameToCodeMap getNameToSidIndex()
```


Returns name to character code encoding map. Note: character code is not a unicode. Character code is a char index in Font encoding "table".

**Returns:**
[NameToCodeMap](../../com.aspose.font/nametocodemap) - Name to character code encoding map.
### getSidName(int sid) {#getSidName-int-}
```
public String getSidName(int sid)
```


Gets name for the SID specified.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| sid | int | String identfier. |

**Returns:**
java.lang.String - Name from string INDEX if found.
