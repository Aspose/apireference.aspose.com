---
title: PlatformId
second_title: Aspose.Font for Java API Reference
description: Represents PlatformId enumeration.
type: docs
weight: 121
url: /java/com.aspose.font/platformid/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum PlatformId extends Enum<PlatformId>
```

Represents PlatformId enumeration.
## Fields

| Field | Description |
| --- | --- |
| [Unicode](#Unicode) | Value 0 Unicode |
| [Macintosh](#Macintosh) | Value 1 Macintosh Script Manager code. |
| [ISO](#ISO) | Value2 Apple spec: (reserved; do not use) MS spec: ISO encoding. |
| [Microsoft](#Microsoft) | Value 3 Microsoft encoding. |
## Methods

| Method | Description |
| --- | --- |
| [values()](#values--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
### Unicode {#Unicode}
```
public static final PlatformId Unicode
```


Value 0 Unicode

### Macintosh {#Macintosh}
```
public static final PlatformId Macintosh
```


Value 1 Macintosh Script Manager code.

### ISO {#ISO}
```
public static final PlatformId ISO
```


Value2 Apple spec: (reserved; do not use) MS spec: ISO encoding. Note that platform ID 2 (ISO) has been deprecated as of OpenType Specification v1.3. It was intended to represent ISO/IEC 10646, as opposed to Unicode; both standards have identical character code assignments

### Microsoft {#Microsoft}
```
public static final PlatformId Microsoft
```


Value 3 Microsoft encoding.

### values() {#values--}
```
public static PlatformId[] values()
```




**Returns:**
com.aspose.font.PlatformId[]
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static PlatformId valueOf(String name)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

**Returns:**
[PlatformId](../../com.aspose.font/platformid)
