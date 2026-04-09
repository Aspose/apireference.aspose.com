---
title: Mesh
second_title: Aspose.3D für Java API-Referenz
description: Ein Mesh besteht aus vielen n-seitigen Polygonen.
type: docs
weight: 102
url: /de/java/com.aspose.threed/mesh/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Geometry](../../com.aspose.threed/geometry)

**All Implemented Interfaces:**
java.lang.Iterable, [com.aspose.threed.IMeshConvertible](../../com.aspose.threed/imeshconvertible)
```
public class Mesh extends Geometry implements Iterable<int[]>, IMeshConvertible
```

Ein Mesh besteht aus vielen n-seitigen Polygonen. **Beispiel:** So fügen Sie ein Polygon zum Mesh hinzu:

```
Mesh mesh = new Mesh();
  int[] indices = new int[] {0, 1, 2};
  mesh.createPolygon(indices);
```

Durchlaufen Sie alle Polygone im Mesh:

```
Mesh mesh = new Mesh();
  for(int[] polygon : mesh)
  {
      //deal with polygon
  }
```
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [Mesh()](#Mesh--) | Initialisiert eine neue Instanz der [Mesh](../../com.aspose.threed/mesh) Klasse. |
| [Mesh(String name)](#Mesh-java.lang.String-) | Initialisiert eine neue Instanz der [Mesh](../../com.aspose.threed/mesh) Klasse. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [<T>getDeformers2()](#-T-getDeformers2--) | Ermittelt alle Deformer mit angegebenen Deformer-Typen |
| [addControlPoint(double x, double y, double z)](#addControlPoint-double-double-double-) | Fügen Sie einen neuen Kontrollpunkt zum Mesh hinzu, das ist effizienter. |
| [addControlPoint(double x, double y, double z, double w)](#addControlPoint-double-double-double-double-) | Fügen Sie einen neuen Kontrollpunkt zum Mesh hinzu, das ist effizienter. |
| [addElement(VertexElement element)](#addElement-com.aspose.threed.VertexElement-) | Fügt ein vorhandenes Vertex-Element zur aktuellen Geometrie hinzu |
| [clone()](#clone--) |  |
| [createElement(VertexElementType type)](#createElement-com.aspose.threed.VertexElementType-) | Erstellt ein Vertex-Element mit angegebenem Typ und fügt es zur Geometrie hinzu |
| [createElement(VertexElementType type, MappingMode mappingMode, ReferenceMode referenceMode)](#createElement-com.aspose.threed.VertexElementType-com.aspose.threed.MappingMode-com.aspose.threed.ReferenceMode-) | Erstellt ein Vertex-Element mit angegebenem Typ und fügt es zur Geometrie hinzu |
| [createElementUV(TextureMapping uvMapping)](#createElementUV-com.aspose.threed.TextureMapping-) | Erstellt ein [VertexElementUV](../../com.aspose.threed/vertexelementuv) mit dem angegebenen Texturzuordnungstyp. |
| [createElementUV(TextureMapping uvMapping, MappingMode mappingMode, ReferenceMode referenceMode)](#createElementUV-com.aspose.threed.TextureMapping-com.aspose.threed.MappingMode-com.aspose.threed.ReferenceMode-) | Erstellt ein [VertexElementUV](../../com.aspose.threed/vertexelementuv) mit dem angegebenen Texturzuordnungstyp. |
| [createPolygon(int v1, int v2, int v3)](#createPolygon-int-int-int-) | Erstelle ein Polygon mit 3 Scheitelpunkten (Dreieck) |
| [createPolygon(int v1, int v2, int v3, int v4)](#createPolygon-int-int-int-int-) | Erstelle ein Polygon mit 4 Scheitelpunkten (Quad) |
| [createPolygon(int[] indices)](#createPolygon-int---) | Erstellt ein neues Polygon, bei dem alle Scheitelpunkte in `indices` definiert sind. |
| [createPolygon(int[] indices, int offset, int length)](#createPolygon-int---int-int-) | Erstellt ein neues Polygon, bei dem alle Scheitelpunkte in `indices` definiert sind. |
| [difference(Mesh a, Mesh b)](#difference-com.aspose.threed.Mesh-com.aspose.threed.Mesh-) | Berechne die Differenz zweier Meshes |
| [doBoolean(BooleanOperation op, Mesh a, Matrix4 transformA, Mesh b, Matrix4 transformB)](#doBoolean-com.aspose.threed.BooleanOperation-com.aspose.threed.Mesh-com.aspose.threed.Matrix4-com.aspose.threed.Mesh-com.aspose.threed.Matrix4-) | Führe eine boolesche Operation an zwei Meshes durch |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Findet die Eigenschaft. |
| [getBoundingBox()](#getBoundingBox--) | Liefert die Begrenzungsbox der aktuellen Entität in ihrem Objekt-Raum-Koordinatensystem. |
| [getCastShadows()](#getCastShadows--) | Ermittelt, ob diese Geometrie Schatten werfen kann |
| [getClass()](#getClass--) |  |
| [getControlPoints()](#getControlPoints--) | Ermittelt alle Kontrollpunkte |
| [getDeformers()](#getDeformers--) | Ermittelt alle Deformer, die mit dieser Geometrie verbunden sind. |
| [getEdges()](#getEdges--) | Ermittelt die Kanten des Meshes. |
| [getElement(VertexElementType type)](#getElement-com.aspose.threed.VertexElementType-) | Ermittelt ein Scheitellement mit dem angegebenen Typ |
| [getEntityRendererKey()](#getEntityRendererKey--) | Liefert den Schlüssel des Entitäts-Renderers, der im Renderer registriert ist |
| [getExcluded()](#getExcluded--) | Liefert, ob diese Entität beim Exportieren ausgeschlossen werden soll. |
| [getName()](#getName--) | Liefert den Namen. |
| [getParentNode()](#getParentNode--) | Liefert den ersten übergeordneten Knoten; wenn der erste übergeordnete Knoten gesetzt wird, wird diese Entität von anderen übergeordneten Knoten getrennt. |
| [getParentNodes()](#getParentNodes--) | Liefert alle übergeordneten Knoten; eine Entität kann für Geometrie-Instanzierung an mehrere übergeordnete Knoten angehängt werden |
| [getPolygonCount()](#getPolygonCount--) | Ermittelt die Anzahl der Polygone |
| [getPolygonSize(int index)](#getPolygonSize-int-) | Ermittelt die Scheitelpunktanzahl des angegebenen Polygons. |
| [getPolygons()](#getPolygons--) | Ermittelt die Polygondefinition des Meshes |
| [getProperties()](#getProperties--) | Liefert die Sammlung aller Eigenschaften. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Liefere den Wert der angegebenen Eigenschaft |
| [getReceiveShadows()](#getReceiveShadows--) | Ermittelt, ob diese Geometrie Schatten empfangen kann. |
| [getScene()](#getScene--) | Liefert die Szene, zu der dieses Objekt gehört |
| [getVertexElementOfUV(TextureMapping textureMapping)](#getVertexElementOfUV-com.aspose.threed.TextureMapping-) | Ermittelt eine [VertexElementUV](../../com.aspose.threed/vertexelementuv)-Instanz mit dem angegebenen Texturzuordnungstyp |
| [getVertexElements()](#getVertexElements--) | Ermittelt alle Scheitellemente |
| [getVisible()](#getVisible--) | Ermittelt, ob die Geometrie sichtbar ist |
| [hashCode()](#hashCode--) |  |
| [intersect(Mesh a, Mesh b)](#intersect-com.aspose.threed.Mesh-com.aspose.threed.Mesh-) | Berechne die Schnittmenge zweier Meshes |
| [isManifold()](#isManifold--) | Prüfe, ob das aktuelle Mesh ein Manifold-Mesh ist. |
| [iterator()](#iterator--) | Ermittelt den Enumerator für jedes innere Polygon. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [optimize(boolean vertexElements)](#optimize-boolean-) | Optimiere den Speicherverbrauch des Meshes, indem du doppelte Kontrollpunkte eliminiert |
| [optimize(boolean vertexElements, float toleranceControlPoint)](#optimize-boolean-float-) | Optimiere den Speicherverbrauch des Meshes, indem du doppelte Kontrollpunkte eliminiert |
| [optimize(boolean vertexElements, float toleranceControlPoint, float toleranceNormal)](#optimize-boolean-float-float-) | Optimiere den Speicherverbrauch des Meshes, indem du doppelte Kontrollpunkte eliminiert |
| [optimize(boolean vertexElements, float toleranceControlPoint, float toleranceNormal, float toleranceUV)](#optimize-boolean-float-float-float-) | Optimiere den Speicherverbrauch des Meshes, indem du doppelte Kontrollpunkte eliminiert |
| [optimize2(boolean vertexElements)](#optimize2-boolean-) | Optimiere den Speicherverbrauch des Meshes, indem du doppelte Kontrollpunkte eliminiert |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Entfernt eine dynamische Eigenschaft. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Entferne die angegebene Eigenschaft, die durch ihren Namen identifiziert wird |
| [setCastShadows(boolean value)](#setCastShadows-boolean-) | Legt fest, ob diese Geometrie Schatten werfen kann |
| [setExcluded(boolean value)](#setExcluded-boolean-) | Legt fest, ob diese Entität beim Exportieren ausgeschlossen werden soll. |
| [setName(String value)](#setName-java.lang.String-) | Setzt den Namen. |
| [setParentNode(Node value)](#setParentNode-com.aspose.threed.Node-) | Setzt den ersten übergeordneten Knoten; wenn der erste übergeordnete Knoten gesetzt wird, wird diese Entität von anderen übergeordneten Knoten getrennt. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Setzt den Wert der angegebenen Eigenschaft |
| [setReceiveShadows(boolean value)](#setReceiveShadows-boolean-) | Legt fest, ob diese Geometrie Schatten empfangen kann. |
| [setVisible(boolean value)](#setVisible-boolean-) | Legt fest, ob die Geometrie sichtbar ist |
| [toMesh()](#toMesh--) | Ermittelt die Mesh-Instanz aus dem aktuellen Entity. |
| [toString()](#toString--) |  |
| [triangulate()](#triangulate--) | Gibt das triangulierte Mesh zurück. |
| [union(Mesh a, Mesh b)](#union-com.aspose.threed.Mesh-com.aspose.threed.Mesh-) | Berechnet die Vereinigung von zwei Meshes. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Mesh() {#Mesh--}
```
public Mesh()
```


Initialisiert eine neue Instanz der [Mesh](../../com.aspose.threed/mesh) Klasse.

### Mesh(String name) {#Mesh-java.lang.String-}
```
public Mesh(String name)
```


Initialisiert eine neue Instanz der [Mesh](../../com.aspose.threed/mesh) Klasse.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Name. |

### <T>getDeformers2() {#-T-getDeformers2--}
```
public Collection<T> <T>getDeformers2()
```


Ermittelt alle Deformer mit angegebenen Deformer-Typen

**Returns:**
java.util.Collection<T> - Deformer-Sammlung
### addControlPoint(double x, double y, double z) {#addControlPoint-double-double-double-}
```
public void addControlPoint(double x, double y, double z)
```


Fügen Sie einen neuen Kontrollpunkt zum Mesh hinzu, das ist effizienter.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | double | Die x-Komponente des Kontrollpunkts |
| y | double | Die y-Komponente des Kontrollpunkts |
| z | double | Die z-Komponente des Kontrollpunkts |

### addControlPoint(double x, double y, double z, double w) {#addControlPoint-double-double-double-double-}
```
public void addControlPoint(double x, double y, double z, double w)
```


Fügen Sie einen neuen Kontrollpunkt zum Mesh hinzu, das ist effizienter.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | double | Die x-Komponente des Kontrollpunkts |
| y | double | Die y-Komponente des Kontrollpunkts |
| z | double | Die z-Komponente des Kontrollpunkts |
| w | double | Die w-Komponente des Kontrollpunkts |

### addElement(VertexElement element) {#addElement-com.aspose.threed.VertexElement-}
```
public void addElement(VertexElement element)
```


Fügt ein vorhandenes Vertex-Element zur aktuellen Geometrie hinzu

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| element | [VertexElement](../../com.aspose.threed/vertexelement) | Das hinzuzufügende Vertex-Element |

### clone() {#clone--}
```
public Mesh clone()
```




**Returns:**
[Mesh](../../com.aspose.threed/mesh)
### createElement(VertexElementType type) {#createElement-com.aspose.threed.VertexElementType-}
```
public VertexElement createElement(VertexElementType type)
```


Erstellt ein Vertex-Element mit angegebenem Typ und fügt es zur Geometrie hinzu

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| type | [VertexElementType](../../com.aspose.threed/vertexelementtype) | Vertex-Elementtyp |

**Returns:**
[VertexElement](../../com.aspose.threed/vertexelement) - Created element. **Remarks:** If type is [VertexElementType.UV](../../com.aspose.threed/vertexelementtype\#UV), a [VertexElementUV](../../com.aspose.threed/vertexelementuv) with texture mapping type to [TextureMapping.DIFFUSE](../../com.aspose.threed/texturemapping\#DIFFUSE) will be created.
### createElement(VertexElementType type, MappingMode mappingMode, ReferenceMode referenceMode) {#createElement-com.aspose.threed.VertexElementType-com.aspose.threed.MappingMode-com.aspose.threed.ReferenceMode-}
```
public VertexElement createElement(VertexElementType type, MappingMode mappingMode, ReferenceMode referenceMode)
```


Erstellt ein Vertex-Element mit angegebenem Typ und fügt es zur Geometrie hinzu

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| type | [VertexElementType](../../com.aspose.threed/vertexelementtype) | Vertex-Elementtyp |
| mappingMode | [MappingMode](../../com.aspose.threed/mappingmode) | Standard-Mapping-Modus |
| referenceMode | [ReferenceMode](../../com.aspose.threed/referencemode) | Standard-Referenzmodus |

**Returns:**
[VertexElement](../../com.aspose.threed/vertexelement) - Created element. **Remarks:** If type is [VertexElementType.UV](../../com.aspose.threed/vertexelementtype\#UV), a [VertexElementUV](../../com.aspose.threed/vertexelementuv) with texture mapping type to [TextureMapping.DIFFUSE](../../com.aspose.threed/texturemapping\#DIFFUSE) will be created.
### createElementUV(TextureMapping uvMapping) {#createElementUV-com.aspose.threed.TextureMapping-}
```
public VertexElementUV createElementUV(TextureMapping uvMapping)
```


Erstellt ein [VertexElementUV](../../com.aspose.threed/vertexelementuv) mit dem angegebenen Texturzuordnungstyp.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| uvMapping | [TextureMapping](../../com.aspose.threed/texturemapping) | Welchen Textur-Mapping-Typ erstellen |

**Returns:**
[VertexElementUV](../../com.aspose.threed/vertexelementuv) - Created element uv
### createElementUV(TextureMapping uvMapping, MappingMode mappingMode, ReferenceMode referenceMode) {#createElementUV-com.aspose.threed.TextureMapping-com.aspose.threed.MappingMode-com.aspose.threed.ReferenceMode-}
```
public VertexElementUV createElementUV(TextureMapping uvMapping, MappingMode mappingMode, ReferenceMode referenceMode)
```


Erstellt ein [VertexElementUV](../../com.aspose.threed/vertexelementuv) mit dem angegebenen Texturzuordnungstyp.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| uvMapping | [TextureMapping](../../com.aspose.threed/texturemapping) | Welchen Textur-Mapping-Typ erstellen |
| mappingMode | [MappingMode](../../com.aspose.threed/mappingmode) | Standard-Mapping-Modus |
| referenceMode | [ReferenceMode](../../com.aspose.threed/referencemode) | Standard-Referenzmodus |

**Returns:**
[VertexElementUV](../../com.aspose.threed/vertexelementuv) - Created element uv
### createPolygon(int v1, int v2, int v3) {#createPolygon-int-int-int-}
```
public void createPolygon(int v1, int v2, int v3)
```


Erstelle ein Polygon mit 3 Scheitelpunkten (Dreieck)

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| v1 | int | Index des ersten Vertex |
| v2 | int | Index des zweiten Vertex |
|  | v3 | int | Index des dritten Vertex **Beispiel:** Der folgende Code zeigt, wie man ein neues Polygon mit den Indizes des Kontrollpunkts erstellt. |

```
Mesh mesh = new Mesh();
  mesh.createPolygon(0, 1, 2);
``` |

### createPolygon(int v1, int v2, int v3, int v4) {#createPolygon-int-int-int-int-}
```
public void createPolygon(int v1, int v2, int v3, int v4)
```


Erstelle ein Polygon mit 4 Scheitelpunkten (Quad)

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| v1 | int | Index des ersten Vertex |
| v2 | int | Index des zweiten Vertex |
| v3 | int | Index des dritten Vertex |
|  | v4 | int | Index des vierten Vertex **Beispiel:** Der folgende Code zeigt, wie man ein neues Polygon mit den Indizes des Kontrollpunkts erstellt. |

```
Mesh mesh = new Mesh();
  mesh.createPolygon(0, 1, 2, 3);
``` |

### createPolygon(int[] indices) {#createPolygon-int---}
```
public void createPolygon(int[] indices)
```


Erstellt ein neues Polygon mit allen in `indices` definierten Vertexen. Um ein Polygon Vertex für Vertex zu erstellen, verwenden Sie bitte [PolygonBuilder](../../com.aspose.threed/polygonbuilder).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
|  | Indizes | int[] | Array der Polygonindizes, jeder Index verweist auf einen Kontrollpunkt, der das Polygon bildet. **Beispiel:** |

```
Mesh mesh = new Mesh();
  int[] indices = new int[] {0, 1, 2};
  mesh.createPolygon(indices);
``` |

### createPolygon(int[] indices, int offset, int length) {#createPolygon-int---int-int-}
```
public void createPolygon(int[] indices, int offset, int length)
```


Erstellt ein neues Polygon mit allen in `indices` definierten Vertexen. Um ein Polygon Vertex für Vertex zu erstellen, verwenden Sie bitte [PolygonBuilder](../../com.aspose.threed/polygonbuilder).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Indizes | int[] | Array der Polygonindizes, jeder Index verweist auf einen Kontrollpunkt, der das Polygon bildet. |
| Versatz | int | Der Versatz des ersten Polygonindex |
|  | Länge | int | Die Länge der Indizes **Beispiel:** Der folgende Code zeigt, wie man ein neues Polygon mit den Indizes der Kontrollpunkte erstellt. |

```
Mesh mesh = new Mesh();
  int[] indices = new int[] {0, 1, 2};
  mesh.createPolygon(indices);
``` |

### difference(Mesh a, Mesh b) {#difference-com.aspose.threed.Mesh-com.aspose.threed.Mesh-}
```
public static Mesh difference(Mesh a, Mesh b)
```


Berechne die Differenz zweier Meshes

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| a | [Mesh](../../com.aspose.threed/mesh) | Erstes Mesh |
| b | [Mesh](../../com.aspose.threed/mesh) | Zweites Mesh |

**Returns:**
[Mesh](../../com.aspose.threed/mesh) - Result mesh **Example:** The following code shows how to calculate the difference of two meshes:
### doBoolean(BooleanOperation op, Mesh a, Matrix4 transformA, Mesh b, Matrix4 transformB) {#doBoolean-com.aspose.threed.BooleanOperation-com.aspose.threed.Mesh-com.aspose.threed.Matrix4-com.aspose.threed.Mesh-com.aspose.threed.Matrix4-}
```
public static Mesh doBoolean(BooleanOperation op, Mesh a, Matrix4 transformA, Mesh b, Matrix4 transformB)
```


Führe eine boolesche Operation an zwei Meshes durch

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| op | [BooleanOperation](../../com.aspose.threed/booleanoperation) | Der Boolesche Operationstyp. |
| a | [Mesh](../../com.aspose.threed/mesh) | Erstes Mesh zum Verarbeiten. |
| transformA | [Matrix4](../../com.aspose.threed/matrix4) | Transformationsmatrix des ersten Mesh |
| b | [Mesh](../../com.aspose.threed/mesh) | Zweites Mesh zum Verarbeiten |
| transformB | [Matrix4](../../com.aspose.threed/matrix4) | Transformationsmatrix des zweiten Mesh |

**Returns:**
[Mesh](../../com.aspose.threed/mesh) - The result mesh **Example:** The following code shows how to calculate the union of two meshes:
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
### getCastShadows() {#getCastShadows--}
```
public boolean getCastShadows()
```


Ermittelt, ob diese Geometrie Schatten werfen kann

**Returns:**
boolean - ob diese Geometrie Schatten werfen kann
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getControlPoints() {#getControlPoints--}
```
public List<Vector4> getControlPoints()
```


Ermittelt alle Kontrollpunkte

**Returns:**
java.util.List<com.aspose.threed.Vector4> - alle Kontrollpunkte
### getDeformers() {#getDeformers--}
```
public List<Deformer> getDeformers()
```


Ermittelt alle Deformer, die mit dieser Geometrie verbunden sind.

**Returns:**
java.util.List<com.aspose.threed.Deformer> - alle Deformer, die mit dieser Geometrie verbunden sind.
### getEdges() {#getEdges--}
```
public List<Integer> getEdges()
```


Liefert Kanten des Mesh. Kanten sind optional im Mesh, daher kann es leer sein.

**Returns:**
java.util.List<java.lang.Integer> - Kanten des Mesh. Kanten sind optional im Mesh, daher kann es leer sein.
### getElement(VertexElementType type) {#getElement-com.aspose.threed.VertexElementType-}
```
public VertexElement getElement(VertexElementType type)
```


Ermittelt ein Scheitellement mit dem angegebenen Typ

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| type | [VertexElementType](../../com.aspose.threed/vertexelementtype) | welchen Vertex-Elementtyp zu finden |

**Returns:**
[VertexElement](../../com.aspose.threed/vertexelement) - [VertexElement](../../com.aspose.threed/vertexelement) instance if found, otherwise null will be returned.
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
### getPolygonCount() {#getPolygonCount--}
```
public int getPolygonCount()
```


Ermittelt die Anzahl der Polygone

**Returns:**
int - die Anzahl der Polygone **Beispiel:** Der folgende Code zeigt, wie man die Anzahl der Polygone des Mesh erhält.

```
Mesh mesh = (new Sphere()).toMesh();
      System.out.println("Mesh's polygon count = " + mesh.getPolygonCount());
```
### getPolygonSize(int index) {#getPolygonSize-int-}
```
public int getPolygonSize(int index)
```


Ermittelt die Scheitelpunktanzahl des angegebenen Polygons.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Index. |

**Returns:**
int - Die Polygongröße.
### getPolygons() {#getPolygons--}
```
public List<int[]> getPolygons()
```


Ermittelt die Polygondefinition des Meshes

**Returns:**
java.util.List<int[]> - die Polygon-Definition des Meshes
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
### getReceiveShadows() {#getReceiveShadows--}
```
public boolean getReceiveShadows()
```


Ermittelt, ob diese Geometrie Schatten empfangen kann.

**Returns:**
boolean - ob diese Geometrie Schatten empfangen kann.
### getScene() {#getScene--}
```
public Scene getScene()
```


Liefert die Szene, zu der dieses Objekt gehört

**Returns:**
[Scene](../../com.aspose.threed/scene) - the scene that this object belongs to
### getVertexElementOfUV(TextureMapping textureMapping) {#getVertexElementOfUV-com.aspose.threed.TextureMapping-}
```
public VertexElementUV getVertexElementOfUV(TextureMapping textureMapping)
```


Ermittelt eine [VertexElementUV](../../com.aspose.threed/vertexelementuv)-Instanz mit dem angegebenen Texturzuordnungstyp

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| textureMapping | [TextureMapping](../../com.aspose.threed/texturemapping) |  |

**Returns:**
[VertexElementUV](../../com.aspose.threed/vertexelementuv) - VertexElementUV with the texture mapping type
### getVertexElements() {#getVertexElements--}
```
public List<VertexElement> getVertexElements()
```


Ermittelt alle Scheitellemente

**Returns:**
java.util.List<com.aspose.threed.VertexElement> - alle Vertex-Elemente
### getVisible() {#getVisible--}
```
public boolean getVisible()
```


Ermittelt, ob die Geometrie sichtbar ist

**Returns:**
boolean - ob die Geometrie sichtbar ist
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### intersect(Mesh a, Mesh b) {#intersect-com.aspose.threed.Mesh-com.aspose.threed.Mesh-}
```
public static Mesh intersect(Mesh a, Mesh b)
```


Berechne die Schnittmenge zweier Meshes

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| a | [Mesh](../../com.aspose.threed/mesh) | Erstes Mesh |
| b | [Mesh](../../com.aspose.threed/mesh) | Zweites Mesh |

**Returns:**
[Mesh](../../com.aspose.threed/mesh) - Result mesh **Example:** The following code shows how to calculate the difference of two meshes:
### isManifold() {#isManifold--}
```
public boolean isManifold()
```


Überprüfen Sie, ob das aktuelle Mesh ein Mannigfaltigkeits-Mesh ist. Diese Funktion wird das Ergebnis der Mannigfaltigkeitsberechnung nicht zwischenspeichern.

**Returns:**
boolean - true, wenn das Mesh ein Mannigfaltigkeits-Mesh ist.
### iterator() {#iterator--}
```
public Iterator<int[]> iterator()
```


Ermittelt den Enumerator für jedes innere Polygon.

**Returns:**
java.util.Iterator<int[]> - Der Enumerator.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### optimize(boolean vertexElements) {#optimize-boolean-}
```
public Mesh optimize(boolean vertexElements)
```


Optimiere den Speicherverbrauch des Meshes, indem du doppelte Kontrollpunkte eliminiert

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| vertexElements | boolean | Duplizierte Vertex-Elementdaten optimieren |

**Returns:**
[Mesh](../../com.aspose.threed/mesh) - New mesh instance with compact memory usage **Example:** The following code shows how to eliminate duplicated control points from an unoptimized mesh:

```
//Sphere.ToMesh generates 117 control points
  Mesh mesh = (new Sphere()).toMesh();
  //After optimized, there're only 86 control points, polygon indices are also remapped.
  Mesh optimized = mesh.optimize(true);
```
### optimize(boolean vertexElements, float toleranceControlPoint) {#optimize-boolean-float-}
```
public Mesh optimize(boolean vertexElements, float toleranceControlPoint)
```


Optimiere den Speicherverbrauch des Meshes, indem du doppelte Kontrollpunkte eliminiert

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| vertexElements | boolean | Duplizierte Vertex-Elementdaten optimieren |
| toleranceControlPoint | float | Die Toleranz für den Kontrollpunkt, Standardwert ist 1e-9 |

**Returns:**
[Mesh](../../com.aspose.threed/mesh) - New mesh instance with compact memory usage
### optimize(boolean vertexElements, float toleranceControlPoint, float toleranceNormal) {#optimize-boolean-float-float-}
```
public Mesh optimize(boolean vertexElements, float toleranceControlPoint, float toleranceNormal)
```


Optimiere den Speicherverbrauch des Meshes, indem du doppelte Kontrollpunkte eliminiert

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| vertexElements | boolean | Duplizierte Vertex-Elementdaten optimieren |
| toleranceControlPoint | float | Die Toleranz für den Kontrollpunkt, Standardwert ist 1e-9 |
| toleranceNormal | float | Die Toleranz für Normal/Tangente/Binormale, Standardwert ist 1e-9 |

**Returns:**
[Mesh](../../com.aspose.threed/mesh) - New mesh instance with compact memory usage
### optimize(boolean vertexElements, float toleranceControlPoint, float toleranceNormal, float toleranceUV) {#optimize-boolean-float-float-float-}
```
public Mesh optimize(boolean vertexElements, float toleranceControlPoint, float toleranceNormal, float toleranceUV)
```


Optimiere den Speicherverbrauch des Meshes, indem du doppelte Kontrollpunkte eliminiert

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| vertexElements | boolean | Duplizierte Vertex-Elementdaten optimieren |
| toleranceControlPoint | float | Die Toleranz für den Kontrollpunkt, Standardwert ist 1e-9 |
| toleranceNormal | float | Die Toleranz für Normal/Tangente/Binormale, Standardwert ist 1e-9 |
| toleranceUV | float | Die Toleranz für UV, Standardwert ist 1e-9 |

**Returns:**
[Mesh](../../com.aspose.threed/mesh) - New mesh instance with compact memory usage
### optimize2(boolean vertexElements) {#optimize2-boolean-}
```
public Mesh optimize2(boolean vertexElements)
```


Optimiere den Speicherverbrauch des Meshes, indem du doppelte Kontrollpunkte eliminiert

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| vertexElements | boolean | Duplizierte Vertex-Elementdaten optimieren |

**Returns:**
[Mesh](../../com.aspose.threed/mesh) - New mesh instance with compact memory usage
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
### setCastShadows(boolean value) {#setCastShadows-boolean-}
```
public void setCastShadows(boolean value)
```


Legt fest, ob diese Geometrie Schatten werfen kann

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

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

### setReceiveShadows(boolean value) {#setReceiveShadows-boolean-}
```
public void setReceiveShadows(boolean value)
```


Legt fest, ob diese Geometrie Schatten empfangen kann.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### setVisible(boolean value) {#setVisible-boolean-}
```
public void setVisible(boolean value)
```


Legt fest, ob die Geometrie sichtbar ist

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### toMesh() {#toMesh--}
```
public Mesh toMesh()
```


Ermittelt die Mesh-Instanz aus dem aktuellen Entity.

**Returns:**
[Mesh](../../com.aspose.threed/mesh) - Returns current instance.
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### triangulate() {#triangulate--}
```
public Mesh triangulate()
```


Gibt das triangulierte Mesh zurück.

**Returns:**
[Mesh](../../com.aspose.threed/mesh) - Current mesh if current mesh is already triangulated, otherwise a new triangulated mesh will be calculated and returned **Example:** The following code shows how to triangulate a mesh:

```
//The plane mesh has only one polygon with 4 control points
  var mesh = (new Plane()).ToMesh();
  //After triangulated, the new mesh's rectangle will become 2 triangles.
  var triangulated = mesh.Triangulate();
```
### union(Mesh a, Mesh b) {#union-com.aspose.threed.Mesh-com.aspose.threed.Mesh-}
```
public static Mesh union(Mesh a, Mesh b)
```


Berechnet die Vereinigung von zwei Meshes.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| a | [Mesh](../../com.aspose.threed/mesh) | Erstes Mesh |
| b | [Mesh](../../com.aspose.threed/mesh) | Zweites Mesh |

**Returns:**
[Mesh](../../com.aspose.threed/mesh) - Result mesh **Example:** The following code shows how to union two meshes into one mesh:
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

