---
title: CffEncoding
second_title: Aspose.Font for Java API Reference
description: Represents CFF _font encoding.
type: docs
weight: 18
url: /java/com.aspose.font/cffencoding/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IFontEncoding](../../com.aspose.font/ifontencoding), [com.aspose.font.ISupportsNameAddressing](../../com.aspose.font/isupportsnameaddressing)
```
public class CffEncoding implements IFontEncoding, ISupportsNameAddressing
```

Represents CFF \_font encoding.
## Methods

| Method | Description |
| --- | --- |
| [decodeToGid(long charCode)](#decodeToGid-long-) | Gets Gid for charCode passed. |
| [decodeToGidParameterized(IEncodingParameters parameters, long charCode)](#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-) | Parameterized decode method. |
| [encode(long gid, long charCode)](#encode-long-long-) | Encodes the glyph. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getNameToCharCodeIndex()](#getNameToCharCodeIndex--) | Returns name to character code encoding map. |
| [getNameToGidIndex()](#getNameToGidIndex--) | Returns name to character code encoding map. |
| [getNameToSidIndex()](#getNameToSidIndex--) | Returns name to character code encoding map. |
| [getSidName(int sid)](#getSidName-int-) | Gets name for the SID specified. |
| [gidToUnicode(GlyphId gid)](#gidToUnicode-com.aspose.font.GlyphId-) | Decodes Gid to unicode. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [unicodeToGid(long unicode)](#unicodeToGid-long-) | Decodes a unicode and returns glyph id. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### decodeToGid(long charCode) {#decodeToGid-long-}
```
public GlyphId decodeToGid(long charCode)
```


Gets Gid for charCode passed. This method designed for a CFF CIDFonts, where charCode must be a valid CID value. Glyph id is a unique number for a glyph, which is \_font type dependent. CFF Font glyph id can be instance of ( GlyphStringId ) class or ( GlyphUInt32Id ) class.

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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
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
java.lang.String - Name from String INDEX if found.
### gidToUnicode(GlyphId gid) {#gidToUnicode-com.aspose.font.GlyphId-}
```
public long gidToUnicode(GlyphId gid)
```


Decodes Gid to unicode. Glyph id is a unique number for a glyph, which is \_font type dependent. CFF Font glyph id can be instance of ( GlyphStringId ) class or ( GlyphUInt32Id ) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| gid | [GlyphId](../../com.aspose.font/glyphid) | Glyph identifier of symbol to decode. |

**Returns:**
long - Unicode value related to glyph id passed.
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
### unicodeToGid(long unicode) {#unicodeToGid-long-}
```
public GlyphId unicodeToGid(long unicode)
```


Decodes a unicode and returns glyph id. Glyph id is a unique number for a glyph, which is \_font type dependent. CFF Font glyph id can be instance of ( GlyphStringId ) class or ( GlyphUInt32Id ) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| unicode | long | Unicode to get glyph identifier for. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to unicode passed.
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

