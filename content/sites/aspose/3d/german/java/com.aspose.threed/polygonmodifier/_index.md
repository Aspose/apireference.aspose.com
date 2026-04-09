---
title: PolygonModifier
second_title: Aspose.3D für Java API-Referenz
description: Hilfsprogramme zum Ändern von Polygonen
type: docs
weight: 134
url: /de/java/com.aspose.threed/polygonmodifier/
---

**Inheritance:**
java.lang.Object
```
public class PolygonModifier
```

Hilfsprogramme zum Ändern von Polygonen
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [applyTransform(Node node, Matrix4 transform)](#applyTransform-com.aspose.threed.Node-com.aspose.threed.Matrix4-) | Transformationsmatrix auf Kontrollpunkte aller Geometrien anwenden |
| [buildTangentBinormal(Mesh mesh)](#buildTangentBinormal-com.aspose.threed.Mesh-) | Dies erzeugt Tangente und Binormale am Mesh. Normal ist erforderlich, falls Normal nicht im Mesh vorhanden ist, wird es auch die Normaldaten aus der Position erzeugen. |
| [buildTangentBinormal(Scene scene)](#buildTangentBinormal-com.aspose.threed.Scene-) | Dies erzeugt Tangente und Binormale an allen Meshes der Szene. Normal ist erforderlich, falls Normal nicht im Mesh vorhanden ist, wird es auch die Normaldaten aus der Position erzeugen. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [generateNormal(Mesh mesh)](#generateNormal-com.aspose.threed.Mesh-) | Normaldaten aus Mesh-Definition erzeugen |
| [generateUV(Mesh mesh)](#generateUV-com.aspose.threed.Mesh-) | UV-Daten aus dem angegebenen Eingabemesh erzeugen |
| [generateUV(Mesh mesh, VertexElementNormal normals)](#generateUV-com.aspose.threed.Mesh-com.aspose.threed.VertexElementNormal-) | UV-Daten aus dem angegebenen Eingabemesh und den angegebenen Normaldaten erzeugen. |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [mergeMesh(Node node)](#mergeMesh-com.aspose.threed.Node-) | Konvertiere einen gesamten Knoten in ein einzelnes transformiertes Mesh. Vertex-Elemente wie Normalen-/Texturkoordinaten werden noch nicht unterstützt. |
| [mergeMesh(Scene scene)](#mergeMesh-com.aspose.threed.Scene-) | Konvertiere eine gesamte Szene in ein einzelnes transformiertes Mesh. Vertex-Elemente wie Normalen-/Texturkoordinaten werden noch nicht unterstützt. |
| [mergeMesh(List<Node> nodes)](#mergeMesh-java.util.List-com.aspose.threed.Node--) | Konvertiere einen gesamten Knoten in ein einzelnes transformiertes Mesh. Vertex-Elemente wie Normalen-/Texturkoordinaten werden noch nicht unterstützt. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [scale(Node node, Vector3 scale)](#scale-com.aspose.threed.Node-com.aspose.threed.Vector3-) | Skaliere alle Geometrien(Skaliere die Kontrollpunkte, nicht die Transformationsmatrix) in diesem Knoten |
| [scale(Scene scene, Vector3 scale)](#scale-com.aspose.threed.Scene-com.aspose.threed.Vector3-) | Skaliere alle Geometrien(Skaliere die Kontrollpunkte, nicht die Transformationsmatrix) in dieser Szene |
| [splitMesh(Mesh mesh, SplitMeshPolicy policy)](#splitMesh-com.aspose.threed.Mesh-com.aspose.threed.SplitMeshPolicy-) | Teile das Mesh in Sub-Meshes auf mittels [VertexElementMaterial](../../com.aspose.threed/vertexelementmaterial). |
| [splitMesh(Node node, SplitMeshPolicy policy)](#splitMesh-com.aspose.threed.Node-com.aspose.threed.SplitMeshPolicy-) | Teile das Mesh in Sub-Meshes auf mittels [VertexElementMaterial](../../com.aspose.threed/vertexelementmaterial). |
| [splitMesh(Node node, SplitMeshPolicy policy, boolean createChildNodes)](#splitMesh-com.aspose.threed.Node-com.aspose.threed.SplitMeshPolicy-boolean-) | Teile das Mesh in Sub-Meshes auf mittels [VertexElementMaterial](../../com.aspose.threed/vertexelementmaterial). |
| [splitMesh(Node node, SplitMeshPolicy policy, boolean createChildNodes, boolean removeOldMesh)](#splitMesh-com.aspose.threed.Node-com.aspose.threed.SplitMeshPolicy-boolean-boolean-) | Teile das Mesh in Sub-Meshes auf mittels [VertexElementMaterial](../../com.aspose.threed/vertexelementmaterial). |
| [splitMesh(Scene scene, SplitMeshPolicy policy)](#splitMesh-com.aspose.threed.Scene-com.aspose.threed.SplitMeshPolicy-) | Teile das Mesh in Sub-Meshes auf mittels [VertexElementMaterial](../../com.aspose.threed/vertexelementmaterial). |
| [splitMesh(Scene scene, SplitMeshPolicy policy, boolean removeOldMesh)](#splitMesh-com.aspose.threed.Scene-com.aspose.threed.SplitMeshPolicy-boolean-) | Teile das Mesh in Sub-Meshes auf mittels [VertexElementMaterial](../../com.aspose.threed/vertexelementmaterial). |
| [toString()](#toString--) |  |
| [triangulate(Mesh mesh)](#triangulate-com.aspose.threed.Mesh-) | Konvertiere ein polygonbasiertes Mesh in ein vollständiges Dreiecks-Mesh |
| [triangulate(Scene scene)](#triangulate-com.aspose.threed.Scene-) | Konvertiere alle polygonbasierten Meshes in ein vollständiges Dreiecks-Mesh |
| [triangulate(List<Vector4> controlPoints)](#triangulate-java.util.List-com.aspose.threed.Vector4--) | Konvertiere ein Polygon in Dreiecke, die Reihenfolge des Polygons wird durch die `controlPoints` definiert |
| [triangulate(List<Vector4> controlPoints, int[] polygon)](#triangulate-java.util.List-com.aspose.threed.Vector4--int---) | Konvertiere ein Polygon in Dreiecke |
| [triangulate(List<Vector4> controlPoints, List<int[]> polygons)](#triangulate-java.util.List-com.aspose.threed.Vector4--java.util.List-int----) | Konvertiere ein polygonbasiertes Mesh in Dreiecke |
| [triangulate(List<Vector4> controlPoints, List<int[]> polygons, boolean generateNormals, Vector3[][] nor_out)](#triangulate-java.util.List-com.aspose.threed.Vector4--java.util.List-int----boolean-com.aspose.threed.Vector3-----) | Konvertiere ein polygonbasiertes Mesh in ein vollständiges Dreiecks-Mesh |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### applyTransform(Node node, Matrix4 transform) {#applyTransform-com.aspose.threed.Node-com.aspose.threed.Matrix4-}
```
public static void applyTransform(Node node, Matrix4 transform)
```


Transformationsmatrix auf Kontrollpunkte aller Geometrien anwenden

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| node | [Node](../../com.aspose.threed/node) | Welche Geometrien des Knotens werden mit der angegebenen Transformation angewendet |
| transform | [Matrix4](../../com.aspose.threed/matrix4) | Die Transformationsmatrix, die auf die Kontrollpunkte angewendet wird. |

### buildTangentBinormal(Mesh mesh) {#buildTangentBinormal-com.aspose.threed.Mesh-}
```
public static void buildTangentBinormal(Mesh mesh)
```


Dies erzeugt Tangenten und Binormale im Mesh. Normalen sind erforderlich; wenn keine Normalen im Mesh vorhanden sind, werden sie ebenfalls aus den Positionen erzeugt. UVs sind ebenfalls erforderlich, es wird eine Ausnahme ausgelöst, wenn keine UV gefunden wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| mesh | [Mesh](../../com.aspose.threed/mesh) |  |

### buildTangentBinormal(Scene scene) {#buildTangentBinormal-com.aspose.threed.Scene-}
```
public static void buildTangentBinormal(Scene scene)
```


Dies erzeugt Tangenten und Binormale in allen Meshes der Szene. Normalen sind erforderlich; wenn keine Normalen im Mesh vorhanden sind, werden sie ebenfalls aus den Positionen erzeugt. UVs sind ebenfalls erforderlich, das Mesh wird ignoriert, wenn keine UV definiert ist.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| scene | [Scene](../../com.aspose.threed/scene) |  |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### generateNormal(Mesh mesh) {#generateNormal-com.aspose.threed.Mesh-}
```
public static VertexElementNormal generateNormal(Mesh mesh)
```


Normaldaten aus Mesh-Definition erzeugen

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| mesh | [Mesh](../../com.aspose.threed/mesh) |  |

**Returns:**
[VertexElementNormal](../../com.aspose.threed/vertexelementnormal) - [VertexElementNormal](../../com.aspose.threed/vertexelementnormal) instance with normal data.
### generateUV(Mesh mesh) {#generateUV-com.aspose.threed.Mesh-}
```
public static VertexElementUV generateUV(Mesh mesh)
```


UV-Daten aus dem angegebenen Eingabemesh erzeugen

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| mesh | [Mesh](../../com.aspose.threed/mesh) | Das Eingabe-Mesh |

**Returns:**
[VertexElementUV](../../com.aspose.threed/vertexelementuv) - Generated UV data
### generateUV(Mesh mesh, VertexElementNormal normals) {#generateUV-com.aspose.threed.Mesh-com.aspose.threed.VertexElementNormal-}
```
public static VertexElementUV generateUV(Mesh mesh, VertexElementNormal normals)
```


UV-Daten aus dem angegebenen Eingabemesh und den angegebenen Normaldaten erzeugen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| mesh | [Mesh](../../com.aspose.threed/mesh) | Das Eingabe-Mesh |
| normals | [VertexElementNormal](../../com.aspose.threed/vertexelementnormal) | Die Normaldaten |

**Returns:**
[VertexElementUV](../../com.aspose.threed/vertexelementuv) - Generated UV data
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### mergeMesh(Node node) {#mergeMesh-com.aspose.threed.Node-}
```
public static Mesh mergeMesh(Node node)
```


Konvertiere einen gesamten Knoten in ein einzelnes transformiertes Mesh. Vertex-Elemente wie Normalen-/Texturkoordinaten werden noch nicht unterstützt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| node | [Node](../../com.aspose.threed/node) | Der zu zusammenzufügenden Knoten |

**Returns:**
[Mesh](../../com.aspose.threed/mesh) - Merged mesh **Example:** The following code shows how to merge all objects from nodes into a single mesh.

```
//Input file may contains multiple objects
          var scene = Scene.fromFile("input.fbx");
          //now merge them into a single mesh
          Mesh merged = PolygonModifier.mergeMesh(scene.getRootNode());
          //then we save it to a file with only one mesh
          var newScene = new Scene(merged);
          newScene.save("test.obj");
```
### mergeMesh(Scene scene) {#mergeMesh-com.aspose.threed.Scene-}
```
public static Mesh mergeMesh(Scene scene)
```


Konvertiere eine gesamte Szene in ein einzelnes transformiertes Mesh. Vertex-Elemente wie Normalen-/Texturkoordinaten werden noch nicht unterstützt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| scene | [Scene](../../com.aspose.threed/scene) | Die zusammenzufügende Szene |

**Returns:**
[Mesh](../../com.aspose.threed/mesh) - The merged mesh **Example:** The following code shows how to merge all objects from a scene into a single mesh.

```
//Input file may contains multiple objects
         var scene = Scene.fromFile("input.fbx");
         //now merge them into a single mesh
         Mesh merged = PolygonModifier.mergeMesh(scene);
         //then we save it to a file with only one mesh
         var newScene = new Scene(merged);
         newScene.save("test.obj");
```
### mergeMesh(List<Node> nodes) {#mergeMesh-java.util.List-com.aspose.threed.Node--}
```
public static Mesh mergeMesh(List<Node> nodes)
```


Konvertiere einen gesamten Knoten in ein einzelnes transformiertes Mesh. Vertex-Elemente wie Normalen-/Texturkoordinaten werden noch nicht unterstützt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Knoten | java.util.List<com.aspose.threed.Node> | Die zu zusammenzufügenden Knoten |

**Returns:**
[Mesh](../../com.aspose.threed/mesh) - Merged mesh **Example:** The following code shows how to merge all objects from nodes into a single mesh.

```
//Input file may contains multiple objects
         var scene = Scene.fromFile("input.fbx");
         //now merge them into a single mesh
         Mesh merged = PolygonModifier.mergeMesh(scene.getRootNode().getChildNodes());
         //then we save it to a file with only one mesh
         var newScene = new Scene(merged);
         newScene.save("test.obj");
```
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### scale(Node node, Vector3 scale) {#scale-com.aspose.threed.Node-com.aspose.threed.Vector3-}
```
public static void scale(Node node, Vector3 scale)
```


Skaliere alle Geometrien(Skaliere die Kontrollpunkte, nicht die Transformationsmatrix) in diesem Knoten

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| node | [Node](../../com.aspose.threed/node) | Der zu skalierende Knoten |
|  | scale | [Vector3](../../com.aspose.threed/vector3) | Der Skalierungsfaktor **Example:** Der folgende Code zeigt, wie alle Geometrien in der Szene um das 10‑fache skaliert werden. |

```
//Load a test file for scaling
 		 var scene = Scene.fromFile("input.fbx");
 		 //scale all geometries 10 times.
 		 PolygonModifier.scale(scene.getRootNode(), new Vector3(10, 10, 10));
 		 scene.save("test.obj");
``` |

### scale(Scene scene, Vector3 scale) {#scale-com.aspose.threed.Scene-com.aspose.threed.Vector3-}
```
public static Scene scale(Scene scene, Vector3 scale)
```


Skaliere alle Geometrien(Skaliere die Kontrollpunkte, nicht die Transformationsmatrix) in dieser Szene

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| scene | [Scene](../../com.aspose.threed/scene) | Die zu skalierende Szene |
|  | scale | [Vector3](../../com.aspose.threed/vector3) | Der Skalierungsfaktor **Example:** Der folgende Code zeigt, wie alle Geometrien in der Szene um das 10‑fache skaliert werden. |

```
//Load a test file for scaling
 		var scene = Scene.fromFile("input.fbx");
 		//scale all geometries 10 times.
 		PolygonModifier.scale(scene, new Vector3(10, 10, 10));
 		scene.save("test.obj");
``` |

**Returns:**
[Scene](../../com.aspose.threed/scene)
### splitMesh(Mesh mesh, SplitMeshPolicy policy) {#splitMesh-com.aspose.threed.Mesh-com.aspose.threed.SplitMeshPolicy-}
```
public static Mesh[] splitMesh(Mesh mesh, SplitMeshPolicy policy)
```


Teile das Mesh in Sub-Meshes auf mittels [VertexElementMaterial](../../com.aspose.threed/vertexelementmaterial). Jeder Sub-Mesh verwendet nur ein Material. Das ursprüngliche Mesh wird nicht geändert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| mesh | [Mesh](../../com.aspose.threed/mesh) |  |
| policy | [SplitMeshPolicy](../../com.aspose.threed/splitmeshpolicy) |  |

**Returns:**
com.aspose.threed.Mesh[] - Neue gesplittete Meshes **Beispiel:** Der folgende Code zeigt, wie man eine Box in Teil-Meshes mit Materialindizes aufteilt.

```
// Create a mesh of box(A box is composed by 6 planes)
 			Mesh box = (new Box()).toMesh();
 			// Create a material element on this mesh
 			VertexElementMaterial mat = (VertexElementMaterial)box.createElement(VertexElementType.MATERIAL, MappingMode.POLYGON, ReferenceMode.INDEX);
 			// And specify different material index for each plane
 			mat.setIndices(new int[] { 0, 1, 2, 3, 4, 5 });
 			// Now split it into 6 sub meshes, we specified 6 different materials on each plane, each plane will become a sub mesh.
 			// We used the CloneData policy, each plane will has the same control point information or control point-based vertex element information.
 			Mesh[] planes = PolygonModifier.splitMesh(box, SplitMeshPolicy.CLONE_DATA);
 
 			// Now split it into 2 sub meshes, first mesh will contains 0/1/2 planes, and second mesh will contains the 3/4/5th planes.
 			mat.setIndices(new int[] { 0, 0, 0, 1, 1, 1 });
 			// We used the CompactData policy, each plane will has its own control point information or control point-based vertex element information.
 			planes = PolygonModifier.splitMesh(box, SplitMeshPolicy.COMPACT_DATA);
```
### splitMesh(Node node, SplitMeshPolicy policy) {#splitMesh-com.aspose.threed.Node-com.aspose.threed.SplitMeshPolicy-}
```
public static void splitMesh(Node node, SplitMeshPolicy policy)
```


Mesh in Teil-Meshes aufteilen mit [VertexElementMaterial](../../com.aspose.threed/vertexelementmaterial). Jeder Teil-Mesh verwendet nur ein Material. Mesh-Aufteilung an einem Knoten durchführen **Beispiel:** Der folgende Code zeigt, wie man eine Box in Teil-Meshes mit Materialindizes aufteilt.

```
// Create a mesh of box(A box is composed by 6 planes)
 			Mesh box = (new Box()).toMesh();
 			// Create a material element on this mesh
 			VertexElementMaterial mat = (VertexElementMaterial)box.createElement(VertexElementType.MATERIAL, MappingMode.POLYGON, ReferenceMode.INDEX);
 			// And specify different material index for each plane
 			mat.setIndices(new int[] { 0, 1, 2, 3, 4, 5 });
 			// Now split it into 6 sub meshes, we specified 6 different materials on each plane, each plane will become a sub mesh.
 			// We used the CloneData policy, each plane will has the same control point information or control point-based vertex element information.
 			Mesh[] planes = PolygonModifier.splitMesh(box, SplitMeshPolicy.CLONE_DATA);
 
 			// Now split it into 2 sub meshes, first mesh will contains 0/1/2 planes, and second mesh will contains the 3/4/5th planes.
 			mat.setIndices(new int[] { 0, 0, 0, 1, 1, 1 });
 			// We used the CompactData policy, each plane will has its own control point information or control point-based vertex element information.
 			planes = PolygonModifier.splitMesh(box, SplitMeshPolicy.COMPACT_DATA);
```

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| node | [Node](../../com.aspose.threed/node) |  |
| policy | [SplitMeshPolicy](../../com.aspose.threed/splitmeshpolicy) |  |

### splitMesh(Node node, SplitMeshPolicy policy, boolean createChildNodes) {#splitMesh-com.aspose.threed.Node-com.aspose.threed.SplitMeshPolicy-boolean-}
```
public static void splitMesh(Node node, SplitMeshPolicy policy, boolean createChildNodes)
```


Mesh in Teil-Meshes aufteilen mit [VertexElementMaterial](../../com.aspose.threed/vertexelementmaterial). Jeder Teil-Mesh verwendet nur ein Material. Mesh-Aufteilung an einem Knoten durchführen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| node | [Node](../../com.aspose.threed/node) |  |
| policy | [SplitMeshPolicy](../../com.aspose.threed/splitmeshpolicy) |  |
|  | createChildNodes | boolean | Erstelle Kindknoten für jeden Teil-Mesh. **Beispiel:** Der folgende Code zeigt, wie man eine Box in Teil-Meshes mit Materialindizes aufteilt. |

```
// Create a mesh of box(A box is composed by 6 planes)
 			Mesh box = (new Box()).toMesh();
 			// Create a material element on this mesh
 			VertexElementMaterial mat = (VertexElementMaterial)box.createElement(VertexElementType.MATERIAL, MappingMode.POLYGON, ReferenceMode.INDEX);
 			// And specify different material index for each plane
 			mat.setIndices(new int[] { 0, 1, 2, 3, 4, 5 });
 			// Now split it into 6 sub meshes, we specified 6 different materials on each plane, each plane will become a sub mesh.
 			// We used the CloneData policy, each plane will has the same control point information or control point-based vertex element information.
 			Mesh[] planes = PolygonModifier.splitMesh(box, SplitMeshPolicy.CLONE_DATA);
 
 			// Now split it into 2 sub meshes, first mesh will contains 0/1/2 planes, and second mesh will contains the 3/4/5th planes.
 			mat.setIndices(new int[] { 0, 0, 0, 1, 1, 1 });
 			// We used the CompactData policy, each plane will has its own control point information or control point-based vertex element information.
 			planes = PolygonModifier.splitMesh(box, SplitMeshPolicy.COMPACT_DATA);
``` |

### splitMesh(Node node, SplitMeshPolicy policy, boolean createChildNodes, boolean removeOldMesh) {#splitMesh-com.aspose.threed.Node-com.aspose.threed.SplitMeshPolicy-boolean-boolean-}
```
public static void splitMesh(Node node, SplitMeshPolicy policy, boolean createChildNodes, boolean removeOldMesh)
```


Mesh in Teil-Meshes aufteilen mit [VertexElementMaterial](../../com.aspose.threed/vertexelementmaterial). Jeder Teil-Mesh verwendet nur ein Material. Mesh-Aufteilung an einem Knoten durchführen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| node | [Node](../../com.aspose.threed/node) |  |
| policy | [SplitMeshPolicy](../../com.aspose.threed/splitmeshpolicy) |  |
| createChildNodes | boolean | Erstelle Kindknoten für jeden Teil-Mesh. |
|  | removeOldMesh | boolean | Entferne das alte Mesh nach dem Splitten; wenn dieser Parameter false ist, existieren das alte und das neue Mesh nebeneinander. **Beispiel:** Der folgende Code zeigt, wie man eine Box in Teil-Meshes mit Materialindizes aufteilt. |

```
// Create a mesh of box(A box is composed by 6 planes)
 			Mesh box = (new Box()).toMesh();
 			// Create a material element on this mesh
 			VertexElementMaterial mat = (VertexElementMaterial)box.createElement(VertexElementType.MATERIAL, MappingMode.POLYGON, ReferenceMode.INDEX);
 			// And specify different material index for each plane
 			mat.setIndices(new int[] { 0, 1, 2, 3, 4, 5 });
 			// Now split it into 6 sub meshes, we specified 6 different materials on each plane, each plane will become a sub mesh.
 			// We used the CloneData policy, each plane will has the same control point information or control point-based vertex element information.
 			Mesh[] planes = PolygonModifier.splitMesh(box, SplitMeshPolicy.CLONE_DATA);
 
 			// Now split it into 2 sub meshes, first mesh will contains 0/1/2 planes, and second mesh will contains the 3/4/5th planes.
 			mat.setIndices(new int[] { 0, 0, 0, 1, 1, 1 });
 			// We used the CompactData policy, each plane will has its own control point information or control point-based vertex element information.
 			planes = PolygonModifier.splitMesh(box, SplitMeshPolicy.COMPACT_DATA);
``` |

### splitMesh(Scene scene, SplitMeshPolicy policy) {#splitMesh-com.aspose.threed.Scene-com.aspose.threed.SplitMeshPolicy-}
```
public static void splitMesh(Scene scene, SplitMeshPolicy policy)
```


Mesh in Teil-Meshes aufteilen mit [VertexElementMaterial](../../com.aspose.threed/vertexelementmaterial). Jeder Teil-Mesh verwendet nur ein Material. Mesh-Aufteilung an allen Knoten der Szene durchführen. **Beispiel:** Der folgende Code zeigt, wie man eine Box in Teil-Meshes mit Materialindizes aufteilt.

```
// Create a mesh of box(A box is composed by 6 planes)
 			Mesh box = (new Box()).toMesh();
 			// Create a material element on this mesh
 			VertexElementMaterial mat = (VertexElementMaterial)box.createElement(VertexElementType.MATERIAL, MappingMode.POLYGON, ReferenceMode.INDEX);
 			// And specify different material index for each plane
 			mat.setIndices(new int[] { 0, 1, 2, 3, 4, 5 });
 			// Now split it into 6 sub meshes, we specified 6 different materials on each plane, each plane will become a sub mesh.
 			// We used the CloneData policy, each plane will has the same control point information or control point-based vertex element information.
 			Mesh[] planes = PolygonModifier.splitMesh(box, SplitMeshPolicy.CLONE_DATA);
 
 			// Now split it into 2 sub meshes, first mesh will contains 0/1/2 planes, and second mesh will contains the 3/4/5th planes.
 			mat.setIndices(new int[] { 0, 0, 0, 1, 1, 1 });
 			// We used the CompactData policy, each plane will has its own control point information or control point-based vertex element information.
 			planes = PolygonModifier.splitMesh(box, SplitMeshPolicy.COMPACT_DATA);
```

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| scene | [Scene](../../com.aspose.threed/scene) |  |
| policy | [SplitMeshPolicy](../../com.aspose.threed/splitmeshpolicy) |  |

### splitMesh(Scene scene, SplitMeshPolicy policy, boolean removeOldMesh) {#splitMesh-com.aspose.threed.Scene-com.aspose.threed.SplitMeshPolicy-boolean-}
```
public static void splitMesh(Scene scene, SplitMeshPolicy policy, boolean removeOldMesh)
```


Mesh in Teil-Meshes aufteilen mit [VertexElementMaterial](../../com.aspose.threed/vertexelementmaterial). Jeder Teil-Mesh verwendet nur ein Material. Mesh-Aufteilung an allen Knoten der Szene durchführen. **Beispiel:** Der folgende Code zeigt, wie man eine Box in Teil-Meshes mit Materialindizes aufteilt.

```
// Create a mesh of box(A box is composed by 6 planes)
 			Mesh box = (new Box()).toMesh();
 			// Create a material element on this mesh
 			VertexElementMaterial mat = (VertexElementMaterial)box.createElement(VertexElementType.MATERIAL, MappingMode.POLYGON, ReferenceMode.INDEX);
 			// And specify different material index for each plane
 			mat.setIndices(new int[] { 0, 1, 2, 3, 4, 5 });
 			// Now split it into 6 sub meshes, we specified 6 different materials on each plane, each plane will become a sub mesh.
 			// We used the CloneData policy, each plane will has the same control point information or control point-based vertex element information.
 			Mesh[] planes = PolygonModifier.splitMesh(box, SplitMeshPolicy.CLONE_DATA);
 
 			// Now split it into 2 sub meshes, first mesh will contains 0/1/2 planes, and second mesh will contains the 3/4/5th planes.
 			mat.setIndices(new int[] { 0, 0, 0, 1, 1, 1 });
 			// We used the CompactData policy, each plane will has its own control point information or control point-based vertex element information.
 			planes = PolygonModifier.splitMesh(box, SplitMeshPolicy.COMPACT_DATA);
```

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| scene | [Scene](../../com.aspose.threed/scene) |  |
| policy | [SplitMeshPolicy](../../com.aspose.threed/splitmeshpolicy) |  |
| removeOldMesh | boolean |  |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### triangulate(Mesh mesh) {#triangulate-com.aspose.threed.Mesh-}
```
public static Mesh triangulate(Mesh mesh)
```


Konvertiere ein polygonbasiertes Mesh in ein vollständiges Dreiecks-Mesh

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| mesh | [Mesh](../../com.aspose.threed/mesh) | Das ursprüngliche Nicht-Dreieck-Mesh |

**Returns:**
[Mesh](../../com.aspose.threed/mesh) - The generated new triangle mesh **Example:** The following code shows how to merge all objects from a scene into a single mesh.

```
var mesh = new Cylinder().toMesh();
 
 		//Triangulate this quadrangle-based mesh to triangle-based
 		mesh = PolygonModifier.triangulate(mesh);
 
 		var scene = new Scene(mesh);
 
         scene.save("test.obj");
```
### triangulate(Scene scene) {#triangulate-com.aspose.threed.Scene-}
```
public static void triangulate(Scene scene)
```


Konvertiere alle polygonbasierten Meshes in ein vollständiges Dreiecks-Mesh

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
|  | scene | [Scene](../../com.aspose.threed/scene) | Die zu verarbeitende Szene **Beispiel:** Der folgende Code zeigt, wie man alle Objekte einer Szene zu einem einzigen Mesh zusammenführt. |

```
var mesh = new Cylinder().toMesh();
 
 		//Triangulate this quadrangle-based mesh to triangle-based
 		mesh = PolygonModifier.triangulate(mesh);
 
 		var scene = new Scene(mesh);
 
         scene.save("test.obj");
``` |

### triangulate(List<Vector4> controlPoints) {#triangulate-java.util.List-com.aspose.threed.Vector4--}
```
public static int[][] triangulate(List<Vector4> controlPoints)
```


Konvertiere ein Polygon in Dreiecke, die Reihenfolge des Polygons wird durch die `controlPoints` definiert

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| controlPoints | java.util.List<com.aspose.threed.Vector4> | Steuerpunkte des Meshes |

**Returns:**
int[][] - Ein Satz von Dreiecken **Beispiel:** Der folgende Code zeigt, wie man alle Objekte einer Szene zu einem einzigen Mesh zusammenführt.

```
var mesh = new Cylinder().toMesh();
 
 		//Triangulate this quadrangle-based mesh to triangle-based
 		mesh = PolygonModifier.triangulate(mesh);
 
 		var scene = new Scene(mesh);
 
         scene.save("test.obj");
```
### triangulate(List<Vector4> controlPoints, int[] polygon) {#triangulate-java.util.List-com.aspose.threed.Vector4--int---}
```
public static int[][] triangulate(List<Vector4> controlPoints, int[] polygon)
```


Konvertiere ein Polygon in Dreiecke

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| controlPoints | java.util.List<com.aspose.threed.Vector4> | Steuerpunkte des Meshes |
| Polygon | int[] | Polygonfläche |

**Returns:**
int[][] - Ein Satz von Dreiecken **Beispiel:** Der folgende Code zeigt, wie man alle Objekte einer Szene zu einem einzigen Mesh zusammenführt.

```
var mesh = new Cylinder().toMesh();
 
 		//Triangulate this quadrangle-based mesh to triangle-based
 		mesh = PolygonModifier.triangulate(mesh);
 
 		var scene = new Scene(mesh);
 
         scene.save("test.obj");
```
### triangulate(List<Vector4> controlPoints, List<int[]> polygons) {#triangulate-java.util.List-com.aspose.threed.Vector4--java.util.List-int----}
```
public static int[][] triangulate(List<Vector4> controlPoints, List<int[]> polygons)
```


Konvertiere ein polygonbasiertes Mesh in Dreiecke

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| controlPoints | java.util.List<com.aspose.threed.Vector4> | Steuerpunkte des Meshes |
| Polygone | java.util.List<int[]> | Polygonflächen |

**Returns:**
int[][] - Ein Satz von Dreiecken **Beispiel:** Der folgende Code zeigt, wie man alle Objekte einer Szene zu einem einzigen Mesh zusammenführt.

```
var mesh = new Cylinder().toMesh();
 
 		//Triangulate this quadrangle-based mesh to triangle-based
 		mesh = PolygonModifier.triangulate(mesh);
 
 		var scene = new Scene(mesh);
 
         scene.save("test.obj");
```
### triangulate(List<Vector4> controlPoints, List<int[]> polygons, boolean generateNormals, Vector3[][] nor_out) {#triangulate-java.util.List-com.aspose.threed.Vector4--java.util.List-int----boolean-com.aspose.threed.Vector3-----}
```
public static int[][] triangulate(List<Vector4> controlPoints, List<int[]> polygons, boolean generateNormals, Vector3[][] nor_out)
```


Konvertiere ein polygonbasiertes Mesh in ein vollständiges Dreiecks-Mesh

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| controlPoints | java.util.List<com.aspose.threed.Vector4> | Steuerpunkte des Meshes |
| Polygone | java.util.List<int[]> | Polygonflächen |
| generateNormals | boolean | Normalen erzeugen |
| nor_out | [Vector3\[\]](../../com.aspose.threed/vector3) | Pro-Steuerpunkt erzeugte Normale |

**Returns:**
int[][] - Ein Satz von Dreiecken **Beispiel:** Der folgende Code zeigt, wie man alle Objekte einer Szene zu einem einzigen Mesh zusammenführt.

```
var mesh = new Cylinder().toMesh();
 
 		//Triangulate this quadrangle-based mesh to triangle-based
 		mesh = PolygonModifier.triangulate(mesh);
 
 		var scene = new Scene(mesh);
 
         scene.save("test.obj");
```
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final void wait(long arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

