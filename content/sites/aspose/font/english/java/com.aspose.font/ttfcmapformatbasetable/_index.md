---
title: TtfCMapFormatBaseTable
second_title: Aspose.Font for Java API Reference
description: Represents CMap sub table base class.
type: docs
weight: 73
url: /java/com.aspose.font/ttfcmapformatbasetable/
---
**Inheritance:**
java.lang.Object
```
public class TtfCMapFormatBaseTable
```

Represents CMap sub table base class.
## Methods

| Method | Description |
| --- | --- |
| [getPlatformId()](#getPlatformId--) | Gets PlatformId. |
| [getPlatformSpecificId()](#getPlatformSpecificId--) | Gets PlatformSpecificId. |
| [getGlyphIndex(long charCode)](#getGlyphIndex-long-) | Gets a glyph index for a given character code |
| [getAllCodes()](#getAllCodes--) | Gets all the codes from current CMap's subtable. |
### getPlatformId() {#getPlatformId--}
```
public int getPlatformId()
```


Gets PlatformId.

**Returns:**
int - PlatformId.
### getPlatformSpecificId() {#getPlatformSpecificId--}
```
public int getPlatformSpecificId()
```


Gets PlatformSpecificId.

**Returns:**
int - PlatformSpecificId.
### getGlyphIndex(long charCode) {#getGlyphIndex-long-}
```
public long getGlyphIndex(long charCode)
```


Gets a glyph index for a given character code

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| charCode | long | character code |

**Returns:**
long - Glyph index.
### getAllCodes() {#getAllCodes--}
```
public ArrayList<Long> getAllCodes()
```


Gets all the codes from current CMap's subtable.

**Returns:**
java.util.ArrayList<java.lang.Long> - All codes from current CMap's subtable.
