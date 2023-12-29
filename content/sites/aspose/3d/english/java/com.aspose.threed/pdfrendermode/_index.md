---
title: PdfRenderMode
second_title: Aspose.3D for Java API Reference
description: Render mode specifies the style in which the 3D artwork is rendered.
type: docs
weight: 272
url: /java/com.aspose.threed/pdfrendermode/
---

**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum PdfRenderMode extends Enum<PdfRenderMode>
```

Render mode specifies the style in which the 3D artwork is rendered.
## Fields

| Field | Description |
| --- | --- |
| [BOUNDING_BOX](#BOUNDING-BOX) | Displays the bounding box edges of each node, aligned with the axes of the local coordinate space for that node. |
| [HIDDEN_WIREFRAME](#HIDDEN-WIREFRAME) | Displays edges in a single color, though removes back-facing and obscured edges. |
| [ILLUSTRATION](#ILLUSTRATION) | Displays silhouette edges with surfaces, removes obscured lines. |
| [SHADED_ILLUSTRATION](#SHADED-ILLUSTRATION) | Displays silhouette edges with lit and textured surfaces and an additional emissive term to remove poorly lit areas of the artwork. |
| [SHADED_VERTICES](#SHADED-VERTICES) | Displays only vertices, though uses their vertex color and applies lighting. |
| [SHADED_WIREFRAME](#SHADED-WIREFRAME) | Displays only edges, though interpolates their color between their two vertices and applies lighting. |
| [SOLID](#SOLID) | Displays textured and lit geometric shapes. |
| [SOLID_OUTLINE](#SOLID-OUTLINE) | Displays silhouette edges with lit and textured surfaces, removes obscured lines. |
| [SOLID_WIREFRAME](#SOLID-WIREFRAME) | Displays textured and lit geometric shapes (triangles) with single color edges on top of them. |
| [TRANSPARENT](#TRANSPARENT) | Displays textured and lit geometric shapes (triangles) with an added level of transparency. |
| [TRANSPARENT_BOUNDING_BOX](#TRANSPARENT-BOUNDING-BOX) | Displays bounding boxes faces of each node, aligned with the axes of the local coordinate space for that node, with an added level of transparency. |
| [TRANSPARENT_BOUNDING_BOX_OUTLINE](#TRANSPARENT-BOUNDING-BOX-OUTLINE) | Displays bounding boxes edges and faces of each node, aligned with the axes of the local coordinate space for that node, with an added level of transparency. |
| [TRANSPARENT_WIREFRAME](#TRANSPARENT-WIREFRAME) | Displays textured and lit geometric shapes (triangles) with an added level of transparency, with single color opaque edges on top of it. |
| [VERTICES](#VERTICES) | Displays only vertices in a single color. |
| [WIREFRAME](#WIREFRAME) | Displays only edges in a single color. |
## Methods

| Method | Description |
| --- | --- |
| [<T>valueOf(Class<T> arg0, String arg1)](#-T-valueOf-java.lang.Class-T--java.lang.String-) |  |
| [compareTo(E arg0)](#compareTo-E-) |  |
| [describeConstable()](#describeConstable--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDeclaringClass()](#getDeclaringClass--) |  |
| [hashCode()](#hashCode--) |  |
| [name()](#name--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [ordinal()](#ordinal--) |  |
| [toString()](#toString--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
| [values()](#values--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### BOUNDING_BOX {#BOUNDING-BOX}
```
public static final PdfRenderMode BOUNDING_BOX
```


Displays the bounding box edges of each node, aligned with the axes of the local coordinate space for that node.

### HIDDEN_WIREFRAME {#HIDDEN-WIREFRAME}
```
public static final PdfRenderMode HIDDEN_WIREFRAME
```


Displays edges in a single color, though removes back-facing and obscured edges.

### ILLUSTRATION {#ILLUSTRATION}
```
public static final PdfRenderMode ILLUSTRATION
```


Displays silhouette edges with surfaces, removes obscured lines.

### SHADED_ILLUSTRATION {#SHADED-ILLUSTRATION}
```
public static final PdfRenderMode SHADED_ILLUSTRATION
```


Displays silhouette edges with lit and textured surfaces and an additional emissive term to remove poorly lit areas of the artwork.

### SHADED_VERTICES {#SHADED-VERTICES}
```
public static final PdfRenderMode SHADED_VERTICES
```


Displays only vertices, though uses their vertex color and applies lighting.

### SHADED_WIREFRAME {#SHADED-WIREFRAME}
```
public static final PdfRenderMode SHADED_WIREFRAME
```


Displays only edges, though interpolates their color between their two vertices and applies lighting.

### SOLID {#SOLID}
```
public static final PdfRenderMode SOLID
```


Displays textured and lit geometric shapes.

### SOLID_OUTLINE {#SOLID-OUTLINE}
```
public static final PdfRenderMode SOLID_OUTLINE
```


Displays silhouette edges with lit and textured surfaces, removes obscured lines.

### SOLID_WIREFRAME {#SOLID-WIREFRAME}
```
public static final PdfRenderMode SOLID_WIREFRAME
```


Displays textured and lit geometric shapes (triangles) with single color edges on top of them.

### TRANSPARENT {#TRANSPARENT}
```
public static final PdfRenderMode TRANSPARENT
```


Displays textured and lit geometric shapes (triangles) with an added level of transparency.

### TRANSPARENT_BOUNDING_BOX {#TRANSPARENT-BOUNDING-BOX}
```
public static final PdfRenderMode TRANSPARENT_BOUNDING_BOX
```


Displays bounding boxes faces of each node, aligned with the axes of the local coordinate space for that node, with an added level of transparency.

### TRANSPARENT_BOUNDING_BOX_OUTLINE {#TRANSPARENT-BOUNDING-BOX-OUTLINE}
```
public static final PdfRenderMode TRANSPARENT_BOUNDING_BOX_OUTLINE
```


Displays bounding boxes edges and faces of each node, aligned with the axes of the local coordinate space for that node, with an added level of transparency.

### TRANSPARENT_WIREFRAME {#TRANSPARENT-WIREFRAME}
```
public static final PdfRenderMode TRANSPARENT_WIREFRAME
```


Displays textured and lit geometric shapes (triangles) with an added level of transparency, with single color opaque edges on top of it.

### VERTICES {#VERTICES}
```
public static final PdfRenderMode VERTICES
```


Displays only vertices in a single color.

### WIREFRAME {#WIREFRAME}
```
public static final PdfRenderMode WIREFRAME
```


Displays only edges in a single color.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Class<T> |  |
| arg1 | java.lang.String |  |

**Returns:**
T
### compareTo(E arg0) {#compareTo-E-}
```
public final int compareTo(E arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | E |  |

**Returns:**
int
### describeConstable() {#describeConstable--}
```
public final Optional<Enum.EnumDesc<E>> describeConstable()
```




**Returns:**
java.util.Optional<java.lang.Enum.EnumDesc<E>>
### equals(Object arg0) {#equals-java.lang.Object-}
```
public final boolean equals(Object arg0)
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
### getDeclaringClass() {#getDeclaringClass--}
```
public final Class<E> getDeclaringClass()
```




**Returns:**
java.lang.Class<E>
### hashCode() {#hashCode--}
```
public final int hashCode()
```




**Returns:**
int
### name() {#name--}
```
public final String name()
```




**Returns:**
java.lang.String
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### ordinal() {#ordinal--}
```
public final int ordinal()
```




**Returns:**
int
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static PdfRenderMode valueOf(String name)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

**Returns:**
[PdfRenderMode](../../com.aspose.threed/pdfrendermode)
### values() {#values--}
```
public static PdfRenderMode[] values()
```




**Returns:**
com.aspose.threed.PdfRenderMode[]
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final void wait(long arg0)
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

