---
title: "Brep"
linktitle: "Brep"
second_title: "Aspose.CAD for Java"
description: "The BREP."
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.collada.fileparser.elements/brep/
---

**Inheritance:** java.lang.Object, ColladaElement

The BREP. Describes a boundary representation (BREP) structure.

## Constructors

| Constructor | Description |
| --- | --- |
| [Brep()](#Brep) |  |

## Methods

| Method | Description |
| --- | --- |
| [getCurves()](#getCurves) | Gets or sets the curves. The curves element holds all the curves that are needed for the BREP structure. Here are the curves that describes the kind of an edge, but here are also the curves that are needed to create a extrusion for a surface. This element is needed, if the edges element is present. |
| [setCurves(Curves value)](#setCurves-com.aspose.cad.fileformats.collada.fileparser.elements.Curves) | Gets or sets the curves. The curves element holds all the curves that are needed for the BREP structure. Here are the curves that describes the kind of an edge, but here are also the curves that are needed to create a extrusion for a surface. This element is needed, if the edges element is present. |
| [getSurfaceCurves()](#getSurfaceCurves) | Gets or sets the surface curves. Contains all 2D curves used in this B-rep. This includes surfaces that describe the kind of the face. This element is required if the faces element is present. |
| [setSurfaceCurves(SurfaceCurves value)](#setSurfaceCurves-com.aspose.cad.fileformats.collada.fileparser.elements.SurfaceCurves) | Gets or sets the surface curves. Contains all 2D curves used in this B-rep. This includes surfaces that describe the kind of the face. This element is required if the faces element is present. |
| [getSurfaces()](#getSurfaces) | Gets or sets the surfaces. The surfaces element holds all the surfaces that are needed for the BREP structure. Here are the surfaces that describes the kind of a face. This element is needed, if the faces element is present. |
| [setSurfaces(Surfaces value)](#setSurfaces-com.aspose.cad.fileformats.collada.fileparser.elements.Surfaces) | Gets or sets the surfaces. The surfaces element holds all the surfaces that are needed for the BREP structure. Here are the surfaces that describes the kind of a face. This element is needed, if the faces element is present. |
| [getSource()](#getSource) | Gets or sets the source. The source elements define the access of the elements vertices, edges and faces to their geometric entities. At least one source element is needed for the vertices. If there are edges a second source element is needed for accessing the curves in the curve element by an IDREF_array. If there are faces the third source element is needed for accessing the surfaces in the surface element by an IDREF_array. |
| [setSource(Source[] value)](#setSource-com.aspose.cad.fileformats.collada.fileparser.elements.Source:A) | Gets or sets the source. The source elements define the access of the elements vertices, edges and faces to their geometric entities. At least one source element is needed for the vertices. If there are edges a second source element is needed for accessing the curves in the curve element by an IDREF_array. If there are faces the third source element is needed for accessing the surfaces in the surface element by an IDREF_array. |
| [getVertices()](#getVertices) | Gets or sets the vertices. This element defines all the vertices of an BREP structure. Vertices are the base topological entity for all BREP structures, so this element is ever needed. |
| [setVertices(Vertices value)](#setVertices-com.aspose.cad.fileformats.collada.fileparser.elements.Vertices) | Gets or sets the vertices. This element defines all the vertices of an BREP structure. Vertices are the base topological entity for all BREP structures, so this element is ever needed. |
| [getEdges()](#getEdges) | Gets or sets the edges. This element defines all the edges of the BREP structure. |
| [setEdges(Edges value)](#setEdges-com.aspose.cad.fileformats.collada.fileparser.elements.Edges) | Gets or sets the edges. This element defines all the edges of the BREP structure. |
| [getWires()](#getWires) | Gets or sets the wires. This element defines all the wires of the BREP structure. |
| [setWires(Wires value)](#setWires-com.aspose.cad.fileformats.collada.fileparser.elements.Wires) | Gets or sets the wires. This element defines all the wires of the BREP structure. |
| [getFaces()](#getFaces) | Gets or sets the faces. This element defines all the faces of the BREP structure. |
| [setFaces(Faces value)](#setFaces-com.aspose.cad.fileformats.collada.fileparser.elements.Faces) | Gets or sets the faces. This element defines all the faces of the BREP structure. |
| [getParametricCurves()](#getParametricCurves) | Gets or sets the parametric curves. |
| [setParametricCurves(ParametricCurves value)](#setParametricCurves-com.aspose.cad.fileformats.collada.fileparser.elements.ParametricCurves) | Gets or sets the parametric curves. |
| [getShells()](#getShells) | Gets or sets the shells. This element defines all the shells of the BREP structure. |
| [setShells(Shells value)](#setShells-com.aspose.cad.fileformats.collada.fileparser.elements.Shells) | Gets or sets the shells. This element defines all the shells of the BREP structure. |
| [getSolids()](#getSolids) | Gets or sets the solids. This element defines all the solids of the BREP structure. |
| [setSolids(Solids value)](#setSolids-com.aspose.cad.fileformats.collada.fileparser.elements.Solids) | Gets or sets the solids. This element defines all the solids of the BREP structure. |
| [getExtra()](#getExtra) | Gets or sets the extra. |
| [setExtra(Extra[] value)](#setExtra-com.aspose.cad.fileformats.collada.fileparser.elements.Extra:A) | Gets or sets the extra. |

### Brep() {#Brep}
```java
public Brep()
```

### getCurves() {#getCurves}
```java
public final Curves getCurves()
```

Gets or sets the curves. The curves element holds all the curves that are needed for the BREP structure. Here are the curves that describes the kind of an edge, but here are also the curves that are needed to create a extrusion for a surface. This element is needed, if the edges element is present.

**Returns:** Curves

### setCurves(Curves value) {#setCurves-com.aspose.cad.fileformats.collada.fileparser.elements.Curves}
```java
public final void setCurves(Curves value)
```

Gets or sets the curves. The curves element holds all the curves that are needed for the BREP structure. Here are the curves that describes the kind of an edge, but here are also the curves that are needed to create a extrusion for a surface. This element is needed, if the edges element is present.

### getSurfaceCurves() {#getSurfaceCurves}
```java
public final SurfaceCurves getSurfaceCurves()
```

Gets or sets the surface curves. Contains all 2D curves used in this B-rep. This includes surfaces that describe the kind of the face. This element is required if the faces element is present.

**Returns:** SurfaceCurves

### setSurfaceCurves(SurfaceCurves value) {#setSurfaceCurves-com.aspose.cad.fileformats.collada.fileparser.elements.SurfaceCurves}
```java
public final void setSurfaceCurves(SurfaceCurves value)
```

Gets or sets the surface curves. Contains all 2D curves used in this B-rep. This includes surfaces that describe the kind of the face. This element is required if the faces element is present.

### getSurfaces() {#getSurfaces}
```java
public final Surfaces getSurfaces()
```

Gets or sets the surfaces. The surfaces element holds all the surfaces that are needed for the BREP structure. Here are the surfaces that describes the kind of a face. This element is needed, if the faces element is present.

**Returns:** Surfaces

### setSurfaces(Surfaces value) {#setSurfaces-com.aspose.cad.fileformats.collada.fileparser.elements.Surfaces}
```java
public final void setSurfaces(Surfaces value)
```

Gets or sets the surfaces. The surfaces element holds all the surfaces that are needed for the BREP structure. Here are the surfaces that describes the kind of a face. This element is needed, if the faces element is present.

### getSource() {#getSource}
```java
public final Source[] getSource()
```

Gets or sets the source. The source elements define the access of the elements vertices, edges and faces to their geometric entities. At least one source element is needed for the vertices. If there are edges a second source element is needed for accessing the curves in the curve element by an IDREF_array. If there are faces the third source element is needed for accessing the surfaces in the surface element by an IDREF_array.

**Returns:** Source[]

### setSource(Source[] value) {#setSource-com.aspose.cad.fileformats.collada.fileparser.elements.Source:A}
```java
public final void setSource(Source[] value)
```

Gets or sets the source. The source elements define the access of the elements vertices, edges and faces to their geometric entities. At least one source element is needed for the vertices. If there are edges a second source element is needed for accessing the curves in the curve element by an IDREF_array. If there are faces the third source element is needed for accessing the surfaces in the surface element by an IDREF_array.

### getVertices() {#getVertices}
```java
public final Vertices getVertices()
```

Gets or sets the vertices. This element defines all the vertices of an BREP structure. Vertices are the base topological entity for all BREP structures, so this element is ever needed.

**Returns:** Vertices

### setVertices(Vertices value) {#setVertices-com.aspose.cad.fileformats.collada.fileparser.elements.Vertices}
```java
public final void setVertices(Vertices value)
```

Gets or sets the vertices. This element defines all the vertices of an BREP structure. Vertices are the base topological entity for all BREP structures, so this element is ever needed.

### getEdges() {#getEdges}
```java
public final Edges getEdges()
```

Gets or sets the edges. This element defines all the edges of the BREP structure.

**Returns:** Edges

### setEdges(Edges value) {#setEdges-com.aspose.cad.fileformats.collada.fileparser.elements.Edges}
```java
public final void setEdges(Edges value)
```

Gets or sets the edges. This element defines all the edges of the BREP structure.

### getWires() {#getWires}
```java
public final Wires getWires()
```

Gets or sets the wires. This element defines all the wires of the BREP structure.

**Returns:** Wires

### setWires(Wires value) {#setWires-com.aspose.cad.fileformats.collada.fileparser.elements.Wires}
```java
public final void setWires(Wires value)
```

Gets or sets the wires. This element defines all the wires of the BREP structure.

### getFaces() {#getFaces}
```java
public final Faces getFaces()
```

Gets or sets the faces. This element defines all the faces of the BREP structure.

**Returns:** Faces

### setFaces(Faces value) {#setFaces-com.aspose.cad.fileformats.collada.fileparser.elements.Faces}
```java
public final void setFaces(Faces value)
```

Gets or sets the faces. This element defines all the faces of the BREP structure.

### getParametricCurves() {#getParametricCurves}
```java
public final ParametricCurves getParametricCurves()
```

Gets or sets the parametric curves.

**Returns:** ParametricCurves

### setParametricCurves(ParametricCurves value) {#setParametricCurves-com.aspose.cad.fileformats.collada.fileparser.elements.ParametricCurves}
```java
public final void setParametricCurves(ParametricCurves value)
```

Gets or sets the parametric curves.

### getShells() {#getShells}
```java
public final Shells getShells()
```

Gets or sets the shells. This element defines all the shells of the BREP structure.

**Returns:** Shells

### setShells(Shells value) {#setShells-com.aspose.cad.fileformats.collada.fileparser.elements.Shells}
```java
public final void setShells(Shells value)
```

Gets or sets the shells. This element defines all the shells of the BREP structure.

### getSolids() {#getSolids}
```java
public final Solids getSolids()
```

Gets or sets the solids. This element defines all the solids of the BREP structure.

**Returns:** Solids

### setSolids(Solids value) {#setSolids-com.aspose.cad.fileformats.collada.fileparser.elements.Solids}
```java
public final void setSolids(Solids value)
```

Gets or sets the solids. This element defines all the solids of the BREP structure.

### getExtra() {#getExtra}
```java
public final Extra[] getExtra()
```

Gets or sets the extra.

**Returns:** Extra[]

### setExtra(Extra[] value) {#setExtra-com.aspose.cad.fileformats.collada.fileparser.elements.Extra:A}
```java
public final void setExtra(Extra[] value)
```

Gets or sets the extra.

