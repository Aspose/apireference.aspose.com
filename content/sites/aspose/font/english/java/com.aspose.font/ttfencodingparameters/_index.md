---
title: TtfEncodingParameters
second_title: Aspose.Font for Java API Reference
description: Represents TTF encoding parameters.
type: docs
weight: 74
url: /java/com.aspose.font/ttfencodingparameters/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IEncodingParameters](../../com.aspose.font/iencodingparameters)
```
public class TtfEncodingParameters implements IEncodingParameters
```

Represents TTF encoding parameters. Should be used to request specific encoding from TTF Font.
## Constructors

| Constructor | Description |
| --- | --- |
| [TtfEncodingParameters(int platformId, int platformSpecificId)](#TtfEncodingParameters-int-int-) | Initializes new instance of TtfEncodingParameters class. |
## Methods

| Method | Description |
| --- | --- |
| [getPlatformId()](#getPlatformId--) | Get PlatformId value. |
| [setPlatformId(int value)](#setPlatformId-int-) | Sets PlatformId value. |
| [getPlatformSpecificId()](#getPlatformSpecificId--) | Gets PlatformSpecificId value. |
| [setPlatformSpecificId(int value)](#setPlatformSpecificId-int-) | Sets PlatformSpecificId value. |
### TtfEncodingParameters(int platformId, int platformSpecificId) {#TtfEncodingParameters-int-int-}
```
public TtfEncodingParameters(int platformId, int platformSpecificId)
```


Initializes new instance of TtfEncodingParameters class. Takes Platform Id, Platform-specific encoding id as parameters. These parameters used to request special CMap subtable from main font CMap table, see table 'CMap', 'name' in OpenType Font File specification.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| platformId | int | Platform id. |
| platformSpecificId | int | Platform-specific encoding id. |

### getPlatformId() {#getPlatformId--}
```
public int getPlatformId()
```


Get PlatformId value.

**Returns:**
int - PlatformId value.
### setPlatformId(int value) {#setPlatformId-int-}
```
public void setPlatformId(int value)
```


Sets PlatformId value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | PlatformId value. |

### getPlatformSpecificId() {#getPlatformSpecificId--}
```
public int getPlatformSpecificId()
```


Gets PlatformSpecificId value.

**Returns:**
int - PlatformSpecificId value.
### setPlatformSpecificId(int value) {#setPlatformSpecificId-int-}
```
public void setPlatformSpecificId(int value)
```


Sets PlatformSpecificId value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | PlatformSpecificId value. |

