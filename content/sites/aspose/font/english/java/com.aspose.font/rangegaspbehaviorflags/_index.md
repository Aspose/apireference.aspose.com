---
title: RangeGaspBehaviorFlags
second_title: Aspose.Font for Java API Reference
description: Flags describing desired rasterizer behavior.
type: docs
weight: 123
url: /java/com.aspose.font/rangegaspbehaviorflags/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum RangeGaspBehaviorFlags extends Enum<RangeGaspBehaviorFlags>
```

Flags describing desired rasterizer behavior.
## Fields

| Field | Description |
| --- | --- |
| [neither](#neither) | Optional for very large sizes, typically ppem > 2048 (0x0000). |
| [GASP_GRIDFIT](#GASP-GRIDFIT) | Use gridfitting (0x0001). |
| [GASP_DOGRAY](#GASP-DOGRAY) | Use grayscale rendering (0x0002). |
| [GASP_SYMMETRIC_GRIDFIT](#GASP-SYMMETRIC-GRIDFIT) | Use gridfitting with ClearType symmetric smoothing (0x0004). |
| [GASP_SYMMETRIC_SMOOTHING](#GASP-SYMMETRIC-SMOOTHING) | Use smoothing along multiple axes with ClearType® (0x0008). |
| [Reserved](#Reserved) | Reserved flags - set to 0 (0xfff0). |
## Methods

| Method | Description |
| --- | --- |
| [values()](#values--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
| [toInteger(EnumSet<RangeGaspBehaviorFlags> flags)](#toInteger-java.util.EnumSet-com.aspose.font.RangeGaspBehaviorFlags--) | Returns the integer value corresponding to a set of flags. |
| [getFlags(int value)](#getFlags-int-) | Returns a set of flags corresponding to an integer value. |
### neither {#neither}
```
public static final RangeGaspBehaviorFlags neither
```


Optional for very large sizes, typically ppem > 2048 (0x0000).

### GASP_GRIDFIT {#GASP-GRIDFIT}
```
public static final RangeGaspBehaviorFlags GASP_GRIDFIT
```


Use gridfitting (0x0001).

### GASP_DOGRAY {#GASP-DOGRAY}
```
public static final RangeGaspBehaviorFlags GASP_DOGRAY
```


Use grayscale rendering (0x0002).

### GASP_SYMMETRIC_GRIDFIT {#GASP-SYMMETRIC-GRIDFIT}
```
public static final RangeGaspBehaviorFlags GASP_SYMMETRIC_GRIDFIT
```


Use gridfitting with ClearType symmetric smoothing (0x0004). Only supported in version 1 'gasp'.

### GASP_SYMMETRIC_SMOOTHING {#GASP-SYMMETRIC-SMOOTHING}
```
public static final RangeGaspBehaviorFlags GASP_SYMMETRIC_SMOOTHING
```


Use smoothing along multiple axes with ClearType® (0x0008). Only supported in version 1 'gasp'.

### Reserved {#Reserved}
```
public static final RangeGaspBehaviorFlags Reserved
```


Reserved flags - set to 0 (0xfff0).

### values() {#values--}
```
public static RangeGaspBehaviorFlags[] values()
```




**Returns:**
com.aspose.font.RangeGaspBehaviorFlags[]
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static RangeGaspBehaviorFlags valueOf(String name)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

**Returns:**
[RangeGaspBehaviorFlags](../../com.aspose.font/rangegaspbehaviorflags)
### toInteger(EnumSet<RangeGaspBehaviorFlags> flags) {#toInteger-java.util.EnumSet-com.aspose.font.RangeGaspBehaviorFlags--}
```
public static int toInteger(EnumSet<RangeGaspBehaviorFlags> flags)
```


Returns the integer value corresponding to a set of flags.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| flags | java.util.EnumSet<com.aspose.font.RangeGaspBehaviorFlags> |  |

**Returns:**
int - The integer value corresponding to a set of flags.
### getFlags(int value) {#getFlags-int-}
```
public static EnumSet<RangeGaspBehaviorFlags> getFlags(int value)
```


Returns a set of flags corresponding to an integer value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The integer value. |

**Returns:**
java.util.EnumSet<com.aspose.font.RangeGaspBehaviorFlags> - The set of flags corresponding to the integer value.
