---
title: SplitMeshPolicy
second_title: Aspose.3D for Java API Reference
description: Share vertex/control point data between sub-meshes or each sub-mesh has its own compacted data.
type: docs
weight: 273
url: /java/com.aspose.threed/splitmeshpolicy/
---

**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum SplitMeshPolicy extends Enum<SplitMeshPolicy>
```

Share vertex/control point data between sub-meshes or each sub-mesh has its own compacted data.
## Fields

| Field | Description |
| --- | --- |
| [CLONE_DATA](#CLONE-DATA) | Control points and vertex elements data will be cloned |
| [COMPACT_DATA](#COMPACT-DATA) | Only used control points and vertex elements data will be copied to the sub-mesh |
## Methods

| Method | Description |
| --- | --- |
| [values()](#values--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
### CLONE_DATA {#CLONE-DATA}
```
public static final SplitMeshPolicy CLONE_DATA
```


Control points and vertex elements data will be cloned

### COMPACT_DATA {#COMPACT-DATA}
```
public static final SplitMeshPolicy COMPACT_DATA
```


Only used control points and vertex elements data will be copied to the sub-mesh

### values() {#values--}
```
public static SplitMeshPolicy[] values()
```




**Returns:**
com.aspose.threed.SplitMeshPolicy[]
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static SplitMeshPolicy valueOf(String name)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

**Returns:**
[SplitMeshPolicy](../../com.aspose.threed/splitmeshpolicy)
