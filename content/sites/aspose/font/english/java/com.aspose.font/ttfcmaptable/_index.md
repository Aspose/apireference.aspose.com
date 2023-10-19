---
title: TtfCMapTable
second_title: Aspose.Font for Java API Reference
description: Represents cmap table of the TTF Font file.
type: docs
weight: 71
url: /java/com.aspose.font/ttfcmaptable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfCMapTable extends TtfTableBase
```

Represents "cmap" table of the TTF Font file.
## Methods

| Method | Description |
| --- | --- |
| [getTag()](#getTag--) | Gets table tag. |
| [getPlatformTables(int platformId, int platformSpecificId)](#getPlatformTables-int-int-) | Returns CMap subtables for planformId and platformSpecificId. |
| [findUnicodeTable()](#findUnicodeTable--) | Searches and returns unicode CMap. |
| [getAllSubtables()](#getAllSubtables--) | Returns all the subtables from CMap table. |
### getTag() {#getTag--}
```
public static String getTag()
```


Gets table tag.

**Returns:**
java.lang.String - Table tag.
### getPlatformTables(int platformId, int platformSpecificId) {#getPlatformTables-int-int-}
```
public TtfCMapFormatBaseTable[] getPlatformTables(int platformId, int platformSpecificId)
```


Returns CMap subtables for planformId and platformSpecificId.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| platformId | int | Platform Id. |
| platformSpecificId | int | Platform-specific encoding Id. |

**Returns:**
com.aspose.font.TtfCMapFormatBaseTable[] - CMap subtables.
### findUnicodeTable() {#findUnicodeTable--}
```
public TtfCMapFormatBaseTable findUnicodeTable()
```


Searches and returns unicode CMap. if there is ucs-4 CMap - returns it first; otherwise - returns any unicode cmap it can find.

**Returns:**
[TtfCMapFormatBaseTable](../../com.aspose.font/ttfcmapformatbasetable) - Unicode subtable.
### getAllSubtables() {#getAllSubtables--}
```
public TtfCMapTable.TtfCMapSubtableDescription[] getAllSubtables()
```


Returns all the subtables from CMap table.

**Returns:**
com.aspose.font.TtfCMapTable.TtfCMapSubtableDescription[] - array of  TtfCmapSubtableDescription  objects
