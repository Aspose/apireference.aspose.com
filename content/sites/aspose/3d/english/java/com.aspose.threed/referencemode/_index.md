---
title: ReferenceMode
second_title: Aspose.3D for Java API Reference
description: com.aspose.threed.ReferenceMode defines how mapping information is stored and referenced by.
type: docs
weight: 266
url: /java/com.aspose.threed/referencemode/
---

**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum ReferenceMode extends Enum<ReferenceMode>
```

com.aspose.threed.ReferenceMode defines how mapping information is stored and referenced by.
## Fields

| Field | Description |
| --- | --- |
| [DIRECT](#DIRECT) | Data is directly referenced |
| [INDEX](#INDEX) | Data is referenced by index |
| [INDEX_TO_DIRECT](#INDEX-TO-DIRECT) | Data is referenced by index, then accessed by index in com.aspose.threed.VertexElement's data list. |
## Methods

| Method | Description |
| --- | --- |
| [values()](#values--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
### DIRECT {#DIRECT}
```
public static final ReferenceMode DIRECT
```


Data is directly referenced

### INDEX {#INDEX}
```
public static final ReferenceMode INDEX
```


Data is referenced by index

### INDEX_TO_DIRECT {#INDEX-TO-DIRECT}
```
public static final ReferenceMode INDEX_TO_DIRECT
```


Data is referenced by index, then accessed by index in com.aspose.threed.VertexElement's data list.

### values() {#values--}
```
public static ReferenceMode[] values()
```




**Returns:**
com.aspose.threed.ReferenceMode[]
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static ReferenceMode valueOf(String name)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

**Returns:**
[ReferenceMode](../../com.aspose.threed/referencemode)
