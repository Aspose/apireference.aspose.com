---
title: TriMesh
second_title: Aspose.3D für Java API-Referenz
description: Ein TriMesh enthält Rohdaten, die direkt von der GPU verwendet werden können.
type: docs
weight: 194
url: /de/java/com.aspose.threed/trimesh/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity)

**All Implemented Interfaces:**
java.lang.Iterable
```
public class TriMesh extends Entity implements Iterable<Vertex>
```

Ein TriMesh enthält Rohdaten, die direkt von der GPU verwendet werden können. Diese Klasse ist ein Hilfswerkzeug zum Erstellen eines Meshes, das nur pro-Vertex-Daten enthält. **Beispiel:** Der folgende Code zeigt, wie man ein TriMesh mit benutzerdefiniertem Speicherlayout erstellt und es in eine Datei exportiert.

```
//Define a vertex declaration as {FVector3 Position; FVector3 Normal; FVector2 UV}
              VertexDeclaration vd = new VertexDeclaration();
              vd.addField(VertexFieldDataType.F_VECTOR3, VertexFieldSemantic.POSITION);
              vd.addField(VertexFieldDataType.F_VECTOR3, VertexFieldSemantic.NORMAL);
              vd.addField(VertexFieldDataType.F_VECTOR2, VertexFieldSemantic.UV);
              //convert a mesh to tri-mesh using specified memory layout
              var mesh = (new Sphere()).toMesh();
              var triMesh = TriMesh.fromMesh(vd, mesh);
              //save it to a stream, 115 vertices * 32bytes per vertex
              try(var s = new FileOutputStream("output.bin")) {
                  triMesh.writeVerticesTo(s);
                  //save indices as ushort to stream, 504 indices * 2 bytes per index
                  triMesh.write16bIndicesTo(s);
              }
```
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [TriMesh(String name, VertexDeclaration declaration)](#TriMesh-java.lang.String-com.aspose.threed.VertexDeclaration-) | Initialisieren Sie eine Instanz von [TriMesh](../../com.aspose.threed/trimesh) |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [addTriangle(int a, int b, int c)](#addTriangle-int-int-int-) | Fügen Sie ein neues Dreieck hinzu |
| [beginVertex()](#beginVertex--) | Beginnen Sie mit dem Hinzufügen von Scheitelpunkten |
| [copyFrom(TriMesh input, VertexDeclaration vd)](#copyFrom-com.aspose.threed.TriMesh-com.aspose.threed.VertexDeclaration-) | Kopieren Sie das [TriMesh](../../com.aspose.threed/trimesh) aus der Eingabe mit neuem Scheitelpunktlayout |
| [endVertex()](#endVertex--) | Beenden Sie das Hinzufügen von Scheitelpunkten |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Findet die Eigenschaft. |
| [fromMesh(Mesh mesh)](#fromMesh-com.aspose.threed.Mesh-) | Erstellen Sie ein TriMesh aus dem angegebenen Mesh-Objekt, wobei die Scheitelpunktdeklaration auf der Struktur des Eingabemeshes basiert. |
| [fromMesh(Mesh mesh, boolean useFloat)](#fromMesh-com.aspose.threed.Mesh-boolean-) | Erstellen Sie ein TriMesh aus dem angegebenen Mesh-Objekt, wobei die Scheitelpunktdeklaration auf der Struktur des Eingabemeshes basiert. |
| [fromMesh(VertexDeclaration declaration, Mesh mesh)](#fromMesh-com.aspose.threed.VertexDeclaration-com.aspose.threed.Mesh-) | Erstellen Sie ein TriMesh aus dem angegebenen Mesh-Objekt mit dem angegebenen Scheitelpunktlayout. |
| [fromRawData(VertexDeclaration vd, byte[] vertices, int[] indices, boolean generateVertexMapping)](#fromRawData-com.aspose.threed.VertexDeclaration-byte---int---boolean-) | Erstellen Sie ein TriMesh aus Rohdaten |
| [getBoundingBox()](#getBoundingBox--) | Liefert die Begrenzungsbox der aktuellen Entität in ihrem Objekt-Raum-Koordinatensystem. |
| [getCapacity()](#getCapacity--) | Die Kapazität der vorab zugewiesenen Scheitelpunkte. |
| [getClass()](#getClass--) |  |
| [getEntityRendererKey()](#getEntityRendererKey--) | Liefert den Schlüssel des Entitäts-Renderers, der im Renderer registriert ist |
| [getExcluded()](#getExcluded--) | Liefert, ob diese Entität beim Exportieren ausgeschlossen werden soll. |
| [getIndicesCount()](#getIndicesCount--) | Die Anzahl der Indizes in diesem [TriMesh](../../com.aspose.threed/trimesh) |
| [getIntIndices()](#getIntIndices--) | Konvertieren Sie die Indizes in ein 32‑Bit‑Ganzzahl‑Array |
| [getName()](#getName--) | Liefert den Namen. |
| [getParentNode()](#getParentNode--) | Liefert den ersten übergeordneten Knoten; wenn der erste übergeordnete Knoten gesetzt wird, wird diese Entität von anderen übergeordneten Knoten getrennt. |
| [getParentNodes()](#getParentNodes--) | Liefert alle übergeordneten Knoten; eine Entität kann für Geometrie-Instanzierung an mehrere übergeordnete Knoten angehängt werden |
| [getProperties()](#getProperties--) | Liefert die Sammlung aller Eigenschaften. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Liefere den Wert der angegebenen Eigenschaft |
| [getScene()](#getScene--) | Liefert die Szene, zu der dieses Objekt gehört |
| [getShortIndices()](#getShortIndices--) | Konvertieren Sie die Indizes in ein 16‑Bit‑Ganzzahl‑Array |
| [getUnmergedVerticesCount()](#getUnmergedVerticesCount--) | Die Anzahl der nicht zusammengeführten Scheitelpunkte, die über [beginVertex](../../com.aspose.threed/trimesh\#beginVertex) und [endVertex](../../com.aspose.threed/trimesh\#endVertex) übergeben wurden. |
| [getVertexDeclaration()](#getVertexDeclaration--) | Das Scheitelpunktlayout des [TriMesh](../../com.aspose.threed/trimesh). |
| [getVerticesCount()](#getVerticesCount--) | Die Anzahl der Scheitelpunkte in diesem [TriMesh](../../com.aspose.threed/trimesh) |
| [getVerticesSizeInBytes()](#getVerticesSizeInBytes--) | Die Gesamtabmessung aller Scheitelpunkte in Bytes |
| [hashCode()](#hashCode--) |  |
| [indicesToArray(int[][] result)](#indicesToArray-int-----) | Konvertieren Sie die Indizes in ein 32‑Bit‑Ganzzahl‑Array |
| [indicesToArray(short[][] result)](#indicesToArray-short-----) | Konvertieren Sie die Indizes in ein 16‑Bit‑Ganzzahl‑Array |
| [iterator()](#iterator--) | Erhalten Sie den Enumerator, um [Vertex](../../com.aspose.threed/vertex) zu durchlaufen |
| [loadVerticesFromBytes(byte[] verticesInBytes)](#loadVerticesFromBytes-byte---) | Laden Sie Scheitelpunkte aus Bytes, die Länge der Bytes muss ein ganzzahliges Vielfaches der Scheitelpunktgröße sein. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [readDouble(int idx, VertexField field)](#readDouble-int-com.aspose.threed.VertexField-) | Lesen Sie das Double‑Feld |
| [readFVector2(int idx, VertexField field)](#readFVector2-int-com.aspose.threed.VertexField-) | Lesen Sie das Vector2‑Feld |
| [readFVector3(int idx, VertexField field)](#readFVector3-int-com.aspose.threed.VertexField-) | Lesen Sie das Vector3‑Feld |
| [readFVector4(int idx, VertexField field)](#readFVector4-int-com.aspose.threed.VertexField-) | Lese das vector4-Feld |
| [readFloat(int idx, VertexField field)](#readFloat-int-com.aspose.threed.VertexField-) | Lese das float-Feld |
| [readVector2(int idx, VertexField field)](#readVector2-int-com.aspose.threed.VertexField-) | Lesen Sie das Vector2‑Feld |
| [readVector3(int idx, VertexField field)](#readVector3-int-com.aspose.threed.VertexField-) | Lesen Sie das Vector3‑Feld |
| [readVector4(int idx, VertexField field)](#readVector4-int-com.aspose.threed.VertexField-) | Lese das vector4-Feld |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Entfernt eine dynamische Eigenschaft. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Entferne die angegebene Eigenschaft, die durch ihren Namen identifiziert wird |
| [setExcluded(boolean value)](#setExcluded-boolean-) | Legt fest, ob diese Entität beim Exportieren ausgeschlossen werden soll. |
| [setName(String value)](#setName-java.lang.String-) | Setzt den Namen. |
| [setParentNode(Node value)](#setParentNode-com.aspose.threed.Node-) | Setzt den ersten übergeordneten Knoten; wenn der erste übergeordnete Knoten gesetzt wird, wird diese Entität von anderen übergeordneten Knoten getrennt. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Setzt den Wert der angegebenen Eigenschaft |
| [toString()](#toString--) | Gibt die String-Darstellung von [TriMesh](../../com.aspose.threed/trimesh) zurück |
| [verticesToArray()](#verticesToArray--) | Konvertiere die Vertex-Daten in ein Byte‑Array |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
| [write16bIndicesTo(Stream stream)](#write16bIndicesTo-com.aspose.threed.Stream-) | Schreibe die Indexdaten als 16‑Bit‑Integer in den Stream **Beispiel:** |
| [write16bIndicesTo(OutputStream stream)](#write16bIndicesTo-java.io.OutputStream-) | Schreibe die Indexdaten als 16‑Bit‑Integer in den Stream |
| [write32bIndicesTo(Stream stream)](#write32bIndicesTo-com.aspose.threed.Stream-) | Schreibe die Indexdaten als 32‑Bit‑Integer in den Stream **Beispiel:** |
| [write32bIndicesTo(OutputStream stream)](#write32bIndicesTo-java.io.OutputStream-) | Schreibe die Indexdaten als 32‑Bit‑Integer in den Stream |
| [writeVerticesTo(Stream stream)](#writeVerticesTo-com.aspose.threed.Stream-) | Schreibe Scheitelpunktdaten in den angegebenen Stream |
| [writeVerticesTo(OutputStream stream)](#writeVerticesTo-java.io.OutputStream-) | Schreibe Scheitelpunktdaten in den angegebenen Stream |
### TriMesh(String name, VertexDeclaration declaration) {#TriMesh-java.lang.String-com.aspose.threed.VertexDeclaration-}
```
public TriMesh(String name, VertexDeclaration declaration)
```


Initialisieren Sie eine Instanz von [TriMesh](../../com.aspose.threed/trimesh)

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Der Name dieses TriMesh |
| declaration | [VertexDeclaration](../../com.aspose.threed/vertexdeclaration) | Die Deklaration des Vertex |

### addTriangle(int a, int b, int c) {#addTriangle-int-int-int-}
```
public void addTriangle(int a, int b, int c)
```


Fügen Sie ein neues Dreieck hinzu

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| a | int | Der Index des ersten Scheitelpunkts |
| b | int | Der Index des zweiten Scheitelpunkts |
| c | int | Der Index des dritten Scheitelpunkts |

### beginVertex() {#beginVertex--}
```
public Vertex beginVertex()
```


Beginnen Sie mit dem Hinzufügen von Scheitelpunkten

**Returns:**
[Vertex](../../com.aspose.threed/vertex) - The reference of internal vertex object in type [Vertex](../../com.aspose.threed/vertex)
### copyFrom(TriMesh input, VertexDeclaration vd) {#copyFrom-com.aspose.threed.TriMesh-com.aspose.threed.VertexDeclaration-}
```
public static TriMesh copyFrom(TriMesh input, VertexDeclaration vd)
```


Kopieren Sie das [TriMesh](../../com.aspose.threed/trimesh) aus der Eingabe mit neuem Scheitelpunktlayout

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | [TriMesh](../../com.aspose.threed/trimesh) | Das Eingabe‑TriMesh zum Kopieren |
| vd | [VertexDeclaration](../../com.aspose.threed/vertexdeclaration) | Die neue Vertex-Deklaration des Ausgabe‑TriMesh |

**Returns:**
[TriMesh](../../com.aspose.threed/trimesh) - A new TriMesh instance with new vertex declaration. **Example:**

```
//Define a vertex declaration as {FVector3 Position; FVector3 Normal; FVector2 UV}
  VertexDeclaration vd = new VertexDeclaration();
  vd.addField(VertexFieldDataType.F_VECTOR3, VertexFieldSemantic.POSITION);
  vd.addField(VertexFieldDataType.F_VECTOR3, VertexFieldSemantic.NORMAL);
  vd.addField(VertexFieldDataType.F_VECTOR2, VertexFieldSemantic.UV);
  //convert a mesh to TriMesh, the layout is automatically inferred from input mesh
  var oldTriMesh = TriMesh.fromMesh((new Sphere()).toMesh());
  //now create a new TriMesh from old TriMesh, using explicit memory layout defined by vd
  var newTriMesh = TriMesh.copyFrom(oldTriMesh, vd);
```
### endVertex() {#endVertex--}
```
public int endVertex()
```


Beenden Sie das Hinzufügen von Scheitelpunkten

**Returns:**
int
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
### findProperty(String propertyName) {#findProperty-java.lang.String-}
```
public Property findProperty(String propertyName)
```


Findet die Eigenschaft. Sie kann eine dynamische Eigenschaft sein (erstellt durch CreateDynamicProperty/SetProperty) oder eine native Eigenschaft (identifiziert durch ihren Namen)

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| propertyName | java.lang.String | Eigenschaftsname. |

**Returns:**
[Property](../../com.aspose.threed/property) - The property.
### fromMesh(Mesh mesh) {#fromMesh-com.aspose.threed.Mesh-}
```
public static TriMesh fromMesh(Mesh mesh)
```


Erstellen Sie ein TriMesh aus dem angegebenen Mesh-Objekt, wobei die Scheitelpunktdeklaration auf der Struktur des Eingabemeshes basiert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| mesh | [Mesh](../../com.aspose.threed/mesh) |  |

**Returns:**
[TriMesh](../../com.aspose.threed/trimesh) - The [TriMesh](../../com.aspose.threed/trimesh) generated from given [Mesh](../../com.aspose.threed/mesh) **Example:** The following code shows how to create a TriMesh with custom memory layout, and export it to file.

```
//Define a vertex declaration as {FVector3 Position; FVector3 Normal; FVector2 UV}
              VertexDeclaration vd = new VertexDeclaration();
              vd.addField(VertexFieldDataType.F_VECTOR3, VertexFieldSemantic.POSITION);
              vd.addField(VertexFieldDataType.F_VECTOR3, VertexFieldSemantic.NORMAL);
              vd.addField(VertexFieldDataType.F_VECTOR2, VertexFieldSemantic.UV);
              //convert a mesh to tri-mesh using specified memory layout
              var mesh = (new Sphere()).toMesh();
              var triMesh = TriMesh.fromMesh(vd, mesh);
              //save it to a stream, 115 vertices * 32bytes per vertex
              try(var s = new FileOutputStream("output.bin")) {
                  triMesh.writeVerticesTo(s);
                  //save indices as ushort to stream, 504 indices * 2 bytes per index
                  triMesh.write16bIndicesTo(s);
              }
```
### fromMesh(Mesh mesh, boolean useFloat) {#fromMesh-com.aspose.threed.Mesh-boolean-}
```
public static TriMesh fromMesh(Mesh mesh, boolean useFloat)
```


Erstellen Sie ein TriMesh aus dem angegebenen Mesh-Objekt, wobei die Scheitelpunktdeklaration auf der Struktur des Eingabemeshes basiert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| mesh | [Mesh](../../com.aspose.threed/mesh) |  |
| useFloat | boolean | Verwende den Float‑Typ anstelle des Double‑Typs für jedes Vertex‑Element‑Komponente. |

**Returns:**
[TriMesh](../../com.aspose.threed/trimesh) - The [TriMesh](../../com.aspose.threed/trimesh) generated from given [Mesh](../../com.aspose.threed/mesh) **Example:** The following code shows how to create a TriMesh with custom memory layout, and export it to file.

```
//Define a vertex declaration as {FVector3 Position; FVector3 Normal; FVector2 UV}
              VertexDeclaration vd = new VertexDeclaration();
              vd.addField(VertexFieldDataType.F_VECTOR3, VertexFieldSemantic.POSITION);
              vd.addField(VertexFieldDataType.F_VECTOR3, VertexFieldSemantic.NORMAL);
              vd.addField(VertexFieldDataType.F_VECTOR2, VertexFieldSemantic.UV);
              //convert a mesh to tri-mesh using specified memory layout
              var mesh = (new Sphere()).toMesh();
              var triMesh = TriMesh.fromMesh(vd, mesh);
              //save it to a stream, 115 vertices * 32bytes per vertex
              try(var s = new FileOutputStream("output.bin")) {
                  triMesh.writeVerticesTo(s);
                  //save indices as ushort to stream, 504 indices * 2 bytes per index
                  triMesh.write16bIndicesTo(s);
              }
```
### fromMesh(VertexDeclaration declaration, Mesh mesh) {#fromMesh-com.aspose.threed.VertexDeclaration-com.aspose.threed.Mesh-}
```
public static TriMesh fromMesh(VertexDeclaration declaration, Mesh mesh)
```


Erstellen Sie ein TriMesh aus dem angegebenen Mesh-Objekt mit dem angegebenen Scheitelpunktlayout.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| declaration | [VertexDeclaration](../../com.aspose.threed/vertexdeclaration) | Typdefinition des Scheitelpunkts oder Speicherlayout |
| mesh | [Mesh](../../com.aspose.threed/mesh) | Quell-Mesh |

**Returns:**
[TriMesh](../../com.aspose.threed/trimesh) - Instance of TriMesh converted from input mesh with specified vertex's memory layout **Example:** The following code shows how to create a TriMesh with custom memory layout, and export it to file.

```
//Define a vertex declaration as {FVector3 Position; FVector3 Normal; FVector2 UV}
              VertexDeclaration vd = new VertexDeclaration();
              vd.addField(VertexFieldDataType.F_VECTOR3, VertexFieldSemantic.POSITION);
              vd.addField(VertexFieldDataType.F_VECTOR3, VertexFieldSemantic.NORMAL);
              vd.addField(VertexFieldDataType.F_VECTOR2, VertexFieldSemantic.UV);
              //convert a mesh to tri-mesh using specified memory layout
              var mesh = (new Sphere()).toMesh();
              var triMesh = TriMesh.fromMesh(vd, mesh);
              //save it to a stream, 115 vertices * 32bytes per vertex
              try(var s = new FileOutputStream("output.bin")) {
                  triMesh.writeVerticesTo(s);
                  //save indices as ushort to stream, 504 indices * 2 bytes per index
                  triMesh.write16bIndicesTo(s);
              }
```
### fromRawData(VertexDeclaration vd, byte[] vertices, int[] indices, boolean generateVertexMapping) {#fromRawData-com.aspose.threed.VertexDeclaration-byte---int---boolean-}
```
public static TriMesh fromRawData(VertexDeclaration vd, byte[] vertices, int[] indices, boolean generateVertexMapping)
```


Erstellen Sie ein TriMesh aus Rohdaten

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| vd | [VertexDeclaration](../../com.aspose.threed/vertexdeclaration) | Scheitelpunkt-Deklaration, muss mindestens ein Feld enthalten. |
| Scheitelpunkte | byte[] | Die Eingabe-Scheitelpunktdaten, die minimale Länge der Scheitelpunkte muss größer oder gleich der Größe der Scheitelpunktdeklaration sein |
| Indizes | int[] | Die Dreiecksindizes |
| generateVertexMapping | boolean | Erstelle [Vertex](../../com.aspose.threed/vertex) für jeden Scheitelpunkt, was nur für die Serialisierung/Deserialisierung nicht erforderlich ist. |

**Returns:**
[TriMesh](../../com.aspose.threed/trimesh) - The [TriMesh](../../com.aspose.threed/trimesh) instance that encapsulated the input byte array. **Remarks:** The returned TriMesh will not copy the input byte array for performance, external changes on the array will be reflected to this instance. **Example:** The following code shows how to construct a TriMesh from raw bytes, this is useful when build your own 3D format

```
var indices = new int[] { 0,  1,  2 };
  var vertices = new byte[]{
      0, 0, 0, 191,
      0, 0, 0, 0,
      0, 0, 0, 191,
      0, 0, 0, 191,
      0, 0, 0, 0,
      0, 0, 0, 63,
      0, 0, 0, 63,
      0, 0, 0, 0The string representation,
      0, 0, 0, 63
  };
  VertexDeclaration vd = new VertexDeclaration();
  vd.AddField(VertexFieldDataType.FVector3, VertexFieldSemantic.Position);
  var triMesh = TriMesh.FromRawData(vd, vertices, indices, true);
```
### getBoundingBox() {#getBoundingBox--}
```
public BoundingBox getBoundingBox()
```


Liefert die Begrenzungsbox der aktuellen Entität in ihrem Objekt-Raum-Koordinatensystem.

**Returns:**
[BoundingBox](../../com.aspose.threed/boundingbox) - the bounding box of current entity in its object space coordinate system. **Example:** The following code shows how to calculate the bounding box of a shape

```
Entity entity = new Sphere();
     entity.setRadius(10);
     var bbox = entity.getBoundingBox();
     System.out.printf("The bounding box of the entity is %s ~ %s", bbox.getMinimum(), bbox.getMaximum());
```
### getCapacity() {#getCapacity--}
```
public int getCapacity()
```


Die Kapazität der vorab zugewiesenen Scheitelpunkte.

**Returns:**
int - Die Kapazität der vorab zugewiesenen Scheitelpunkte.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getEntityRendererKey() {#getEntityRendererKey--}
```
public EntityRendererKey getEntityRendererKey()
```


Liefert den Schlüssel des Entitäts-Renderers, der im Renderer registriert ist

**Returns:**
[EntityRendererKey](../../com.aspose.threed/entityrendererkey) - the key of the entity renderer registered in the renderer
### getExcluded() {#getExcluded--}
```
public boolean getExcluded()
```


Liefert, ob diese Entität beim Exportieren ausgeschlossen werden soll.

**Returns:**
boolescher Wert – ob diese Entität beim Exportieren ausgeschlossen werden soll.
### getIndicesCount() {#getIndicesCount--}
```
public int getIndicesCount()
```


Die Anzahl der Indizes in diesem [TriMesh](../../com.aspose.threed/trimesh)

**Returns:**
int - Die Anzahl der Indizes in diesem [TriMesh](../../com.aspose.threed/trimesh)
### getIntIndices() {#getIntIndices--}
```
public int[] getIntIndices()
```


Konvertieren Sie die Indizes in ein 32‑Bit‑Ganzzahl‑Array

**Returns:**
int[]
### getName() {#getName--}
```
public String getName()
```


Liefert den Namen.

**Returns:**
java.lang.String - der Name.
### getParentNode() {#getParentNode--}
```
public Node getParentNode()
```


Liefert den ersten übergeordneten Knoten; wenn der erste übergeordnete Knoten gesetzt wird, wird diese Entität von anderen übergeordneten Knoten getrennt.

**Returns:**
[Node](../../com.aspose.threed/node) - the first parent node, if set the first parent node, this entity will be detached from other parent nodes.
### getParentNodes() {#getParentNodes--}
```
public ArrayList<Node> getParentNodes()
```


Liefert alle übergeordneten Knoten; eine Entität kann für Geometrie-Instanzierung an mehrere übergeordnete Knoten angehängt werden

**Returns:**
java.util.ArrayList<com.aspose.threed.Node> - alle übergeordneten Knoten, ein Entity kann für Geometrieinstanzierung an mehrere übergeordnete Knoten angehängt werden
### getProperties() {#getProperties--}
```
public PropertyCollection getProperties()
```


Liefert die Sammlung aller Eigenschaften.

**Returns:**
[PropertyCollection](../../com.aspose.threed/propertycollection) - the collection of all properties.
### getProperty(String property) {#getProperty-java.lang.String-}
```
public Object getProperty(String property)
```


Liefere den Wert der angegebenen Eigenschaft

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eigenschaft | java.lang.String | Eigenschaftsname |

**Returns:**
java.lang.Object - Der Wert der gefundenen Eigenschaft
### getScene() {#getScene--}
```
public Scene getScene()
```


Liefert die Szene, zu der dieses Objekt gehört

**Returns:**
[Scene](../../com.aspose.threed/scene) - the scene that this object belongs to
### getShortIndices() {#getShortIndices--}
```
public short[] getShortIndices()
```


Konvertieren Sie die Indizes in ein 16‑Bit‑Ganzzahl‑Array

**Returns:**
short[]
### getUnmergedVerticesCount() {#getUnmergedVerticesCount--}
```
public int getUnmergedVerticesCount()
```


Die Anzahl der nicht zusammengeführten Scheitelpunkte, die über [beginVertex](../../com.aspose.threed/trimesh\#beginVertex) und [endVertex](../../com.aspose.threed/trimesh\#endVertex) übergeben wurden.

**Returns:**
int - Die Anzahl der nicht zusammengeführten Scheitelpunkte, die über [beginVertex](../../com.aspose.threed/trimesh\#beginVertex) und [endVertex](../../com.aspose.threed/trimesh\#endVertex) übergeben wurden.
### getVertexDeclaration() {#getVertexDeclaration--}
```
public VertexDeclaration getVertexDeclaration()
```


Das Scheitelpunktlayout des [TriMesh](../../com.aspose.threed/trimesh).

**Returns:**
[VertexDeclaration](../../com.aspose.threed/vertexdeclaration) - The vertex layout of the [TriMesh](../../com.aspose.threed/trimesh).
### getVerticesCount() {#getVerticesCount--}
```
public int getVerticesCount()
```


Die Anzahl der Scheitelpunkte in diesem [TriMesh](../../com.aspose.threed/trimesh)

**Returns:**
int - Die Anzahl der Scheitelpunkte in diesem [TriMesh](../../com.aspose.threed/trimesh)
### getVerticesSizeInBytes() {#getVerticesSizeInBytes--}
```
public int getVerticesSizeInBytes()
```


Die Gesamtabmessung aller Scheitelpunkte in Bytes

**Returns:**
int - Die Gesamtegröße aller Scheitelpunkte in Bytes
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### indicesToArray(int[][] result) {#indicesToArray-int-----}
```
public void indicesToArray(int[][] result)
```


Konvertieren Sie die Indizes in ein 32‑Bit‑Ganzzahl‑Array

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Ergebnis | int[][] |  |

### indicesToArray(short[][] result) {#indicesToArray-short-----}
```
public void indicesToArray(short[][] result)
```


Konvertieren Sie die Indizes in ein 16‑Bit‑Ganzzahl‑Array

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Ergebnis | short[][] |  |

### iterator() {#iterator--}
```
public Iterator<Vertex> iterator()
```


Erhalten Sie den Enumerator, um [Vertex](../../com.aspose.threed/vertex) zu durchlaufen

**Returns:**
java.util.Iterator<com.aspose.threed.Vertex>
### loadVerticesFromBytes(byte[] verticesInBytes) {#loadVerticesFromBytes-byte---}
```
public void loadVerticesFromBytes(byte[] verticesInBytes)
```


Lade Scheitelpunkte aus Bytes, die Länge der Bytes muss ein ganzzahliges Vielfaches der Scheitelpunktgröße sein. **Beispiel:** Der folgende Code zeigt, wie man ein leeres TriMesh erstellt und Scheitelpunkte manuell aus Rohbytes lädt.

```
var indices = new int[] { 0,  1,  2 };
  var vertices = new byte[]{
      0, 0, 0, 191,
      0, 0, 0, 0,
      0, 0, 0, 191,
      0, 0, 0, 191,
      0, 0, 0, 0,
      0, 0, 0, 63,
      0, 0, 0, 63,
      0, 0, 0, 0,
      0, 0, 0, 63
  };
  VertexDeclaration vd = new VertexDeclaration();
  vd.AddField(VertexFieldDataType.FVector3, VertexFieldSemantic.Position);
  //create an empty TriMesh with specified vertex declaration
  var triMesh = new TriMesh("", vd);
  //load vertices directly from bytes
  triMesh.LoadVerticesFromBytes(vertices);
  triMesh.AddTriangle(0, 1, 2);
```

```
int[] indices = new int[] { 0,  1,  2 };
  byte[] vertices = new byte[]{
      0, 0, 0, 191,
      0, 0, 0, 0,
      0, 0, 0, 191,
      0, 0, 0, 191,
      0, 0, 0, 0,
      0, 0, 0, 63,
      0, 0, 0, 63,
      0, 0, 0, 0,
      0, 0, 0, 63
  };
  VertexDeclaration vd = new VertexDeclaration();
  vd.addField(VertexFieldDataType.F_VECTOR3, VertexFieldSemantic.POSITION);
  //create an empty TriMesh with specified vertex declaration
  var triMesh = new TriMesh("", vd);
  //load vertices directly from bytes
  triMesh.loadVerticesFromBytes(vertices);
  triMesh.addTriangle(0, 1, 2);
```

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| verticesInBytes | byte[] |  |

### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### readDouble(int idx, VertexField field) {#readDouble-int-com.aspose.threed.VertexField-}
```
public double readDouble(int idx, VertexField field)
```


Lesen Sie das Double‑Feld

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| idx | int | Der Index des zu lesenden Scheitelpunkts |
| field | [VertexField](../../com.aspose.threed/vertexfield) | Das Feld mit einem float/double-kompatiblen Datentyp |

**Returns:**
double - Double-Wert des angegebenen Scheitelpunktfeldes
### readFVector2(int idx, VertexField field) {#readFVector2-int-com.aspose.threed.VertexField-}
```
public FVector2 readFVector2(int idx, VertexField field)
```


Lesen Sie das Vector2‑Feld

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| idx | int | Der Index des zu lesenden Scheitelpunkts |
| field | [VertexField](../../com.aspose.threed/vertexfield) | Das Feld mit dem Datentyp Vector2/FVector2 |

**Returns:**
[FVector2](../../com.aspose.threed/fvector2) - FVector2 of specified vertex's field
### readFVector3(int idx, VertexField field) {#readFVector3-int-com.aspose.threed.VertexField-}
```
public FVector3 readFVector3(int idx, VertexField field)
```


Lesen Sie das Vector3‑Feld

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| idx | int | Der Index des zu lesenden Scheitelpunkts |
| field | [VertexField](../../com.aspose.threed/vertexfield) | Das Feld mit dem Datentyp Vector3/FVector3 |

**Returns:**
[FVector3](../../com.aspose.threed/fvector3)
### readFVector4(int idx, VertexField field) {#readFVector4-int-com.aspose.threed.VertexField-}
```
public FVector4 readFVector4(int idx, VertexField field)
```


Lese das vector4-Feld

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| idx | int | Der Index des zu lesenden Scheitelpunkts |
| field | [VertexField](../../com.aspose.threed/vertexfield) | Das Feld mit dem Datentyp Vector4/FVector4 |

**Returns:**
[FVector4](../../com.aspose.threed/fvector4)
### readFloat(int idx, VertexField field) {#readFloat-int-com.aspose.threed.VertexField-}
```
public float readFloat(int idx, VertexField field)
```


Lese das float-Feld

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| idx | int | Der Index des zu lesenden Scheitelpunkts |
| field | [VertexField](../../com.aspose.threed/vertexfield) | Das Feld mit einem float/double-kompatiblen Datentyp |

**Returns:**
float - Float-Wert des angegebenen Scheitelpunktfeldes
### readVector2(int idx, VertexField field) {#readVector2-int-com.aspose.threed.VertexField-}
```
public Vector2 readVector2(int idx, VertexField field)
```


Lesen Sie das Vector2‑Feld

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| idx | int | Der Index des zu lesenden Scheitelpunkts |
| field | [VertexField](../../com.aspose.threed/vertexfield) | Das Feld mit dem Datentyp Vector2/FVector2 |

**Returns:**
[Vector2](../../com.aspose.threed/vector2) - Vector2 of specified vertex's field
### readVector3(int idx, VertexField field) {#readVector3-int-com.aspose.threed.VertexField-}
```
public Vector3 readVector3(int idx, VertexField field)
```


Lesen Sie das Vector3‑Feld

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| idx | int | Der Index des zu lesenden Scheitelpunkts |
| field | [VertexField](../../com.aspose.threed/vertexfield) | Das Feld mit dem Datentyp Vector3/FVector3 |

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### readVector4(int idx, VertexField field) {#readVector4-int-com.aspose.threed.VertexField-}
```
public Vector4 readVector4(int idx, VertexField field)
```


Lese das vector4-Feld

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| idx | int | Der Index des zu lesenden Scheitelpunkts |
| field | [VertexField](../../com.aspose.threed/vertexfield) | Das Feld mit dem Datentyp Vector4/FVector4 |

**Returns:**
[Vector4](../../com.aspose.threed/vector4)
### removeProperty(Property property) {#removeProperty-com.aspose.threed.Property-}
```
public boolean removeProperty(Property property)
```


Entfernt eine dynamische Eigenschaft.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| property | [Property](../../com.aspose.threed/property) | Welche Eigenschaft zu entfernen ist |

**Returns:**
boolean - true, wenn die Eigenschaft erfolgreich entfernt wurde
### removeProperty(String property) {#removeProperty-java.lang.String-}
```
public boolean removeProperty(String property)
```


Entferne die angegebene Eigenschaft, die durch ihren Namen identifiziert wird

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eigenschaft | java.lang.String | Welche Eigenschaft zu entfernen ist |

**Returns:**
boolean - true, wenn die Eigenschaft erfolgreich entfernt wurde
### setExcluded(boolean value) {#setExcluded-boolean-}
```
public void setExcluded(boolean value)
```


Legt fest, ob diese Entität beim Exportieren ausgeschlossen werden soll.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### setName(String value) {#setName-java.lang.String-}
```
public void setName(String value)
```


Setzt den Namen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert |

### setParentNode(Node value) {#setParentNode-com.aspose.threed.Node-}
```
public void setParentNode(Node value)
```


Setzt den ersten übergeordneten Knoten; wenn der erste übergeordnete Knoten gesetzt wird, wird diese Entität von anderen übergeordneten Knoten getrennt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Node](../../com.aspose.threed/node) | Neuer Wert |

### setProperty(String property, Object value) {#setProperty-java.lang.String-java.lang.Object-}
```
public void setProperty(String property, Object value)
```


Setzt den Wert der angegebenen Eigenschaft

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eigenschaft | java.lang.String | Eigenschaftsname |
| Wert | java.lang.Object | Der Wert der Eigenschaft |

### toString() {#toString--}
```
public String toString()
```


Gibt die String-Darstellung von [TriMesh](../../com.aspose.threed/trimesh) zurück

**Returns:**
java.lang.String - Die String-Darstellung
### verticesToArray() {#verticesToArray--}
```
public byte[] verticesToArray()
```


Konvertiere die Vertex-Daten in ein Byte‑Array

**Returns:**
byte[]
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

### write16bIndicesTo(Stream stream) {#write16bIndicesTo-com.aspose.threed.Stream-}
```
public void write16bIndicesTo(Stream stream)
```


Schreibe die Indexdaten als 16‑Bit‑Integer in den Stream **Beispiel:**

```
//convert a mesh to TriMesh, the layout is automatically inferred from input mesh
      var mesh = (new Sphere()).toMesh();
      var triMesh = TriMesh.fromMesh(mesh);
      //save it to a stream, 115 vertices * 32bytes per vertex
      var stream = new ByteArrayOutputStream();
      try(var s = Stream.wrap(stream)) {
          triMesh.writeVerticesTo(s);
          //save indices as ushort to stream, 504 indices * 2 bytes per index
          triMesh.write16bIndicesTo(s);
      }
```

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | [Stream](../../com.aspose.threed/stream) |  |

### write16bIndicesTo(OutputStream stream) {#write16bIndicesTo-java.io.OutputStream-}
```
public void write16bIndicesTo(OutputStream stream)
```


Schreibe die Indexdaten als 16‑Bit‑Integer in den Stream

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
|  | Stream | java.io.OutputStream | **Beispiel:** |

```
//convert a mesh to TriMesh, the layout is automatically inferred from input mesh    
     var mesh = (new Sphere()).toMesh();    
     var triMesh = TriMesh.fromMesh(mesh);    
     //save it to a stream, 115 vertices * 32bytes per vertex    
     var stream = new ByteArrayOutputStream();    
     triMesh.writeVerticesTo(stream);    
     //save indices as ushort to stream, 504 indices * 2 bytes per index    
     triMesh.write16bIndicesTo(stream);
``` |

### write32bIndicesTo(Stream stream) {#write32bIndicesTo-com.aspose.threed.Stream-}
```
public void write32bIndicesTo(Stream stream)
```


Schreibe die Indexdaten als 32‑Bit‑Integer in den Stream **Beispiel:**

```
//convert a mesh to TriMesh, the layout is automatically inferred from input mesh
      var mesh = (new Sphere()).toMesh();
      var triMesh = TriMesh.fromMesh(mesh);
      //save it to a stream, 115 vertices * 32bytes per vertex
      var stream = new ByteArrayOutputStream();
      try(var s = Stream.wrap(stream)) {
          triMesh.writeVerticesTo(s);
          //save indices as ushort to stream, 504 indices * 2 bytes per index
          triMesh.write32bIndicesTo(s);
      }
```

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | [Stream](../../com.aspose.threed/stream) |  |

### write32bIndicesTo(OutputStream stream) {#write32bIndicesTo-java.io.OutputStream-}
```
public void write32bIndicesTo(OutputStream stream)
```


Schreibe die Indexdaten als 32‑Bit‑Integer in den Stream

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
|  | Stream | java.io.OutputStream | **Beispiel:** |

```
//convert a mesh to TriMesh, the layout is automatically inferred from input mesh    
      var mesh = (new Sphere()).toMesh();    
      var triMesh = TriMesh.fromMesh(mesh);    
      //save it to a stream, 115 vertices * 32bytes per vertex    
      var stream = new ByteArrayOutputStream();    
      triMesh.writeVerticesTo(stream);    
      //save indices as ushort to stream, 504 indices * 2 bytes per index    
      triMesh.write32bIndicesTo(stream);
``` |

### writeVerticesTo(Stream stream) {#writeVerticesTo-com.aspose.threed.Stream-}
```
public void writeVerticesTo(Stream stream)
```


Schreibe Scheitelpunktdaten in den angegebenen Stream

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
|  | stream | [Stream](../../com.aspose.threed/stream) | Der Stream, in den die Vertexdaten geschrieben werden **Beispiel:** |

```
//convert a mesh to TriMesh, the layout is automatically inferred from input mesh
      var mesh = (new Sphere()).toMesh();
      var triMesh = TriMesh.fromMesh(mesh);
      //save it to a stream, 115 vertices * 32bytes per vertex
      var stream = new ByteArrayOutputStream();
      try(var s = Stream.wrap(stream)) {
          triMesh.writeVerticesTo(s);
          //save indices as ushort to stream, 504 indices * 2 bytes per index
          triMesh.write16bIndicesTo(s);
      }
``` |

### writeVerticesTo(OutputStream stream) {#writeVerticesTo-java.io.OutputStream-}
```
public void writeVerticesTo(OutputStream stream)
```


Schreibe Scheitelpunktdaten in den angegebenen Stream

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
|  | Stream | java.io.OutputStream | Der Stream, in den die Vertexdaten geschrieben werden **Beispiel:** |

```
//convert a mesh to TriMesh, the layout is automatically inferred from input mesh    
      var mesh = (new Sphere()).toMesh();    
      var triMesh = TriMesh.fromMesh(mesh);    
      //save it to a stream, 115 vertices * 32bytes per vertex    
      var stream = new ByteArrayOutputStream();    
      triMesh.writeVerticesTo(stream);    
      //save indices as ushort to stream, 504 indices * 2 bytes per index    
      triMesh.write16bIndicesTo(stream);
``` |

