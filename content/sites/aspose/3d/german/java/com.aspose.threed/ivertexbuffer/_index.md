---
title: IVertexBuffer
second_title: Aspose.3D für Java API-Referenz
description: Der Vertex-Puffer enthält die Polygon-Vertex-Daten, die an die Rendering-Pipeline gesendet werden.
type: docs
weight: 259
url: /de/java/com.aspose.threed/ivertexbuffer/
---

**All Implemented Interfaces:**
[com.aspose.threed.IBuffer](../../com.aspose.threed/ibuffer)
```
public interface IVertexBuffer extends IBuffer
```

Der Vertex-Puffer enthält die Polygon-Vertex-Daten, die an die Rendering-Pipeline gesendet werden.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [getVertexDeclaration()](#getVertexDeclaration--) | Liest die Scheitelpunktdeklaration. |
| [loadData(TriMesh mesh)](#loadData-com.aspose.threed.TriMesh-) | Lade Scheitelpunktdaten von [TriMesh](../../com.aspose.threed/trimesh) |
| [loadData(Object array)](#loadData-java.lang.Object-) | Lade Daten aus einem Array. |
| [loadData(long data, int size)](#loadData-long-int-) | Lade Daten von gegebener Position. |
### getVertexDeclaration() {#getVertexDeclaration--}
```
public abstract VertexDeclaration getVertexDeclaration()
```


Liest die Scheitelpunktdeklaration.

**Returns:**
[VertexDeclaration](../../com.aspose.threed/vertexdeclaration) - the vertex declaration
### loadData(TriMesh mesh) {#loadData-com.aspose.threed.TriMesh-}
```
public abstract void loadData(TriMesh mesh)
```


Lade Scheitelpunktdaten von [TriMesh](../../com.aspose.threed/trimesh)

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| mesh | [TriMesh](../../com.aspose.threed/trimesh) |  |

### loadData(Object array) {#loadData-java.lang.Object-}
```
public abstract void loadData(Object array)
```


Lade Daten aus einem Array.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Array | java.lang.Object |  |

### loadData(long data, int size) {#loadData-long-int-}
```
public abstract void loadData(long data, int size)
```


Lade Daten von gegebener Position.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Daten | long |  |
| Größe | int |  |

