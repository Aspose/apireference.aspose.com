---
title: TtfGaspTable
second_title: Aspose.Font for Java API Reference
description: Represents gasp table of the TTF Font file.
type: docs
weight: 89
url: /java/com.aspose.font/ttfgasptable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfGaspTable extends TtfTableBase
```

Represents "gasp" table of the TTF Font file.
## Methods

| Method | Description |
| --- | --- |
| [getTag()](#getTag--) | Gets the table tag. |
| [getVersion()](#getVersion--) | Gets the table version. |
| [getNumRanges()](#getNumRanges--) | Gets GaspRange records. |
| [getGaspRanges()](#getGaspRanges--) | Gets the list of GaspRange records provides recommended behaviors for various ppem sizes. |
### getTag() {#getTag--}
```
public static String getTag()
```


Gets the table tag.

**Returns:**
java.lang.String - The table tag.
### getVersion() {#getVersion--}
```
public int getVersion()
```


Gets the table version.

**Returns:**
int - The table version.
### getNumRanges() {#getNumRanges--}
```
public int getNumRanges()
```


Gets GaspRange records.

**Returns:**
int - GaspRange records.
### getGaspRanges() {#getGaspRanges--}
```
public List<GaspRange> getGaspRanges()
```


Gets the list of GaspRange records provides recommended behaviors for various ppem sizes.

**Returns:**
java.util.List<com.aspose.font.GaspRange> - The list of GaspRange.
