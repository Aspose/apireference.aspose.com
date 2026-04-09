---
title: Pyramide
second_title: Aspose.3D für Java API-Referenz
description: Parametrisierte Pyramide.
type: docs
weight: 142
url: /de/java/com.aspose.threed/pyramid/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Primitive](../../com.aspose.threed/primitive)
```
public class Pyramid extends Primitive
```

Parametrisierte Pyramide.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [Pyramid()](#Pyramid--) | Konstruiere eine neue Pyramideninstanz mit Standard‑Grundfläche(10, 10) und Standardhöhe(5) |
| [Pyramid(double xbottom, double ybottom, double height)](#Pyramid-double-double-double-) | Konstruiere eine neue Pyramideninstanz mit angegebener Grundfläche |
| [Pyramid(double xbottom, double ybottom, double xtop, double ytop, double height)](#Pyramid-double-double-double-double-double-) | Konstruiere eine neue Pyramideninstanz mit angegebener Grundfläche, Oberflächenfläche und Höhe. |
| [Pyramid(String name, double xbottom, double ybottom, double xtop, double ytop, double height)](#Pyramid-java.lang.String-double-double-double-double-double-) | Konstruiere eine neue Pyramideninstanz mit angegebener Grundfläche, Oberflächenfläche und Höhe. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Findet die Eigenschaft. |
| [getBottomArea()](#getBottomArea--) | Fläche der unteren Kappe |
| [getBottomOffset()](#getBottomOffset--) | Versatz für untere Eckpunkte |
| [getBoundingBox()](#getBoundingBox--) | Liefert die Begrenzungsbox der aktuellen Entität in ihrem Objekt-Raum-Koordinatensystem. |
| [getCastShadows()](#getCastShadows--) | Ermittelt, ob diese Geometrie Schatten werfen kann |
| [getClass()](#getClass--) |  |
| [getEntityRendererKey()](#getEntityRendererKey--) | Liefert den Schlüssel des Entitäts-Renderers, der im Renderer registriert ist |
| [getExcluded()](#getExcluded--) | Liefert, ob diese Entität beim Exportieren ausgeschlossen werden soll. |
| [getHeight()](#getHeight--) | Höhe der Pyramide |
| [getName()](#getName--) | Liefert den Namen. |
| [getParentNode()](#getParentNode--) | Liefert den ersten übergeordneten Knoten; wenn der erste übergeordnete Knoten gesetzt wird, wird diese Entität von anderen übergeordneten Knoten getrennt. |
| [getParentNodes()](#getParentNodes--) | Liefert alle übergeordneten Knoten; eine Entität kann für Geometrie-Instanzierung an mehrere übergeordnete Knoten angehängt werden |
| [getProperties()](#getProperties--) | Liefert die Sammlung aller Eigenschaften. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Liefere den Wert der angegebenen Eigenschaft |
| [getReceiveShadows()](#getReceiveShadows--) | Ermittelt, ob diese Geometrie Schatten empfangen kann. |
| [getScene()](#getScene--) | Liefert die Szene, zu der dieses Objekt gehört |
| [getTopArea()](#getTopArea--) | Fläche der oberen Kappe |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Entfernt eine dynamische Eigenschaft. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Entferne die angegebene Eigenschaft, die durch ihren Namen identifiziert wird |
| [setBottomArea(Vector2 value)](#setBottomArea-com.aspose.threed.Vector2-) | Fläche der unteren Kappe |
| [setBottomOffset(Vector3 value)](#setBottomOffset-com.aspose.threed.Vector3-) | Versatz für untere Eckpunkte |
| [setCastShadows(boolean value)](#setCastShadows-boolean-) | Legt fest, ob diese Geometrie Schatten werfen kann |
| [setExcluded(boolean value)](#setExcluded-boolean-) | Legt fest, ob diese Entität beim Exportieren ausgeschlossen werden soll. |
| [setHeight(double value)](#setHeight-double-) | Höhe der Pyramide |
| [setName(String value)](#setName-java.lang.String-) | Setzt den Namen. |
| [setParentNode(Node value)](#setParentNode-com.aspose.threed.Node-) | Setzt den ersten übergeordneten Knoten; wenn der erste übergeordnete Knoten gesetzt wird, wird diese Entität von anderen übergeordneten Knoten getrennt. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Setzt den Wert der angegebenen Eigenschaft |
| [setReceiveShadows(boolean value)](#setReceiveShadows-boolean-) | Legt fest, ob diese Geometrie Schatten empfangen kann. |
| [setTopArea(Vector2 value)](#setTopArea-com.aspose.threed.Vector2-) | Fläche der oberen Kappe |
| [toMesh()](#toMesh--) | Konvertiere das aktuelle Objekt zu einem Mesh |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Pyramid() {#Pyramid--}
```
public Pyramid()
```


Konstruiere eine neue Pyramideninstanz mit Standard‑Grundfläche(10, 10) und Standardhöhe(5)

### Pyramid(double xbottom, double ybottom, double height) {#Pyramid-double-double-double-}
```
public Pyramid(double xbottom, double ybottom, double height)
```


Konstruiere eine neue Pyramideninstanz mit angegebener Grundfläche

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| xbottom | double | Die Länge in x‑Richtung des Bodens |
| ybottom | double | Die Länge in y‑Richtung des Bodens |
| height | double | Die Höhe der Pyramide |

### Pyramid(double xbottom, double ybottom, double xtop, double ytop, double height) {#Pyramid-double-double-double-double-double-}
```
public Pyramid(double xbottom, double ybottom, double xtop, double ytop, double height)
```


Konstruiere eine neue Pyramideninstanz mit angegebener Grundfläche, Oberflächenfläche und Höhe.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| xbottom | double | Die Länge in x‑Richtung der Grundfläche |
| ybottom | double | Die Länge in y‑Richtung der Grundfläche |
| xtop | double | Die Länge in x‑Richtung der Oberflächenfläche |
| ytop | double | Die Länge in y‑Richtung der Oberflächenfläche |
| height | double | Die Höhe der Pyramide |

### Pyramid(String name, double xbottom, double ybottom, double xtop, double ytop, double height) {#Pyramid-java.lang.String-double-double-double-double-double-}
```
public Pyramid(String name, double xbottom, double ybottom, double xtop, double ytop, double height)
```


Konstruiere eine neue Pyramideninstanz mit angegebener Grundfläche, Oberflächenfläche und Höhe.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Der Name der Pyramide |
| xbottom | double | Die Länge in x‑Richtung der Grundfläche |
| ybottom | double | Die Länge in y‑Richtung der Grundfläche |
| xtop | double | Die Länge in x‑Richtung der Oberflächenfläche |
| ytop | double | Die Länge in y‑Richtung der Oberflächenfläche |
| height | double | Die Höhe der Pyramide |

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
### getBottomArea() {#getBottomArea--}
```
public Vector2 getBottomArea()
```


Fläche der unteren Kappe

**Returns:**
[Vector2](../../com.aspose.threed/vector2) - Area of the bottom cap
### getBottomOffset() {#getBottomOffset--}
```
public Vector3 getBottomOffset()
```


Versatz für untere Eckpunkte

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - Offset for bottom vertices
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
### getHeight() {#getHeight--}
```
public double getHeight()
```


Höhe der Pyramide

**Returns:**
double - Höhe der Pyramide
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
### getTopArea() {#getTopArea--}
```
public Vector2 getTopArea()
```


Fläche der oberen Kappe

**Returns:**
[Vector2](../../com.aspose.threed/vector2) - Area of the top cap
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




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
### setBottomArea(Vector2 value) {#setBottomArea-com.aspose.threed.Vector2-}
```
public void setBottomArea(Vector2 value)
```


Fläche der unteren Kappe

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Vector2](../../com.aspose.threed/vector2) | Neuer Wert |

### setBottomOffset(Vector3 value) {#setBottomOffset-com.aspose.threed.Vector3-}
```
public void setBottomOffset(Vector3 value)
```


Versatz für untere Eckpunkte

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | Neuer Wert |

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

### setHeight(double value) {#setHeight-double-}
```
public void setHeight(double value)
```


Höhe der Pyramide

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

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

### setTopArea(Vector2 value) {#setTopArea-com.aspose.threed.Vector2-}
```
public void setTopArea(Vector2 value)
```


Fläche der oberen Kappe

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Vector2](../../com.aspose.threed/vector2) | Neuer Wert |

### toMesh() {#toMesh--}
```
public Mesh toMesh()
```


Konvertiere das aktuelle Objekt zu einem Mesh

**Returns:**
[Mesh](../../com.aspose.threed/mesh) - The mesh.
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
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

