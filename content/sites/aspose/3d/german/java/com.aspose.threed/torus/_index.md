---
title: Torus
second_title: Aspose.3D für Java API-Referenz
description: Parametrisierter Torus.
type: docs
weight: 189
url: /de/java/com.aspose.threed/torus/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Primitive](../../com.aspose.threed/primitive)
```
public class Torus extends Primitive
```

Parametrisierter Torus.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [Torus()](#Torus--) | Initialisiert eine neue Instanz der Klasse [Torus](../../com.aspose.threed/torus). |
| [Torus(double radius, double tube)](#Torus-double-double-) | Initialisiert eine neue Instanz der Klasse [Torus](../../com.aspose.threed/torus). |
| [Torus(double radius, double tube, double arc)](#Torus-double-double-double-) | Initialisiert eine neue Instanz der Klasse [Torus](../../com.aspose.threed/torus). |
| [Torus(String name, double radius, double tube, int radialSegments, int tubularSegments, double arc)](#Torus-java.lang.String-double-double-int-int-double-) | Initialisiert eine neue Instanz der Klasse [Torus](../../com.aspose.threed/torus). |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Findet die Eigenschaft. |
| [getArc()](#getArc--) | Liest den Bogen. |
| [getBoundingBox()](#getBoundingBox--) | Liefert die Begrenzungsbox der aktuellen Entität in ihrem Objekt-Raum-Koordinatensystem. |
| [getCastShadows()](#getCastShadows--) | Ermittelt, ob diese Geometrie Schatten werfen kann |
| [getClass()](#getClass--) |  |
| [getEntityRendererKey()](#getEntityRendererKey--) | Liefert den Schlüssel des Entitäts-Renderers, der im Renderer registriert ist |
| [getExcluded()](#getExcluded--) | Liefert, ob diese Entität beim Exportieren ausgeschlossen werden soll. |
| [getName()](#getName--) | Liefert den Namen. |
| [getParentNode()](#getParentNode--) | Liefert den ersten übergeordneten Knoten; wenn der erste übergeordnete Knoten gesetzt wird, wird diese Entität von anderen übergeordneten Knoten getrennt. |
| [getParentNodes()](#getParentNodes--) | Liefert alle übergeordneten Knoten; eine Entität kann für Geometrie-Instanzierung an mehrere übergeordnete Knoten angehängt werden |
| [getProperties()](#getProperties--) | Liefert die Sammlung aller Eigenschaften. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Liefere den Wert der angegebenen Eigenschaft |
| [getRadialSegments()](#getRadialSegments--) | Gibt die radialen Segmente zurück. |
| [getRadius()](#getRadius--) | Liest den Radius des Torus. |
| [getReceiveShadows()](#getReceiveShadows--) | Ermittelt, ob diese Geometrie Schatten empfangen kann. |
| [getScene()](#getScene--) | Liefert die Szene, zu der dieses Objekt gehört |
| [getTube()](#getTube--) | Liest den Radius der Röhre. |
| [getTubularSegments()](#getTubularSegments--) | Liest die Rohrsegmente. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Entfernt eine dynamische Eigenschaft. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Entferne die angegebene Eigenschaft, die durch ihren Namen identifiziert wird |
| [setArc(double value)](#setArc-double-) | Setzt den Bogen. |
| [setCastShadows(boolean value)](#setCastShadows-boolean-) | Legt fest, ob diese Geometrie Schatten werfen kann |
| [setExcluded(boolean value)](#setExcluded-boolean-) | Legt fest, ob diese Entität beim Exportieren ausgeschlossen werden soll. |
| [setName(String value)](#setName-java.lang.String-) | Setzt den Namen. |
| [setParentNode(Node value)](#setParentNode-com.aspose.threed.Node-) | Setzt den ersten übergeordneten Knoten; wenn der erste übergeordnete Knoten gesetzt wird, wird diese Entität von anderen übergeordneten Knoten getrennt. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Setzt den Wert der angegebenen Eigenschaft |
| [setRadialSegments(int value)](#setRadialSegments-int-) | Legt die radialen Segmente fest. |
| [setRadius(double value)](#setRadius-double-) | Setzt den Radius des Torus. |
| [setReceiveShadows(boolean value)](#setReceiveShadows-boolean-) | Legt fest, ob diese Geometrie Schatten empfangen kann. |
| [setTube(double value)](#setTube-double-) | Setzt den Radius der Röhre. |
| [setTubularSegments(int value)](#setTubularSegments-int-) | Setzt die Rohrsegmente. |
| [toMesh()](#toMesh--) | Konvertiere das aktuelle Objekt zu einem Mesh |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Torus() {#Torus--}
```
public Torus()
```


Initialisiert eine neue Instanz der Klasse [Torus](../../com.aspose.threed/torus).

### Torus(double radius, double tube) {#Torus-double-double-}
```
public Torus(double radius, double tube)
```


Initialisiert eine neue Instanz der Klasse [Torus](../../com.aspose.threed/torus).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| radius | double | Der Radius des Torus. |
| Röhre | double | Der Radius der Röhre des Torus. |

### Torus(double radius, double tube, double arc) {#Torus-double-double-double-}
```
public Torus(double radius, double tube, double arc)
```


Initialisiert eine neue Instanz der Klasse [Torus](../../com.aspose.threed/torus).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| radius | double | Der Radius des Torus. |
| Röhre | double | Der Radius der Röhre des Torus. |
| Bogen | double | Bogen. |

### Torus(String name, double radius, double tube, int radialSegments, int tubularSegments, double arc) {#Torus-java.lang.String-double-double-int-int-double-}
```
public Torus(String name, double radius, double tube, int radialSegments, int tubularSegments, double arc)
```


Initialisiert eine neue Instanz der Klasse [Torus](../../com.aspose.threed/torus).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Name. |
| radius | double | Der Radius des Torus. |
| Röhre | double | Der Radius der Röhre des Torus. |
| radialSegments | int | Radiale Segmente. |
| tubularSegments | int | Tubulare Segmente. |
| Bogen | double | Bogen. |

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
### getArc() {#getArc--}
```
public double getArc()
```


Liest den Bogen.

**Returns:**
double - der Bogen.
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
### getRadialSegments() {#getRadialSegments--}
```
public int getRadialSegments()
```


Gibt die radialen Segmente zurück.

**Returns:**
int - die radialen Segmente.
### getRadius() {#getRadius--}
```
public double getRadius()
```


Liest den Radius des Torus.

**Returns:**
double - der Radius des Torus.
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
### getTube() {#getTube--}
```
public double getTube()
```


Liest den Radius der Röhre.

**Returns:**
double - der Radius des Rohrs.
### getTubularSegments() {#getTubularSegments--}
```
public int getTubularSegments()
```


Liest die Rohrsegmente.

**Returns:**
int - die tubulären Segmente.
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
### setArc(double value) {#setArc-double-}
```
public void setArc(double value)
```


Setzt den Bogen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

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

### setRadialSegments(int value) {#setRadialSegments-int-}
```
public void setRadialSegments(int value)
```


Legt die radialen Segmente fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Neuer Wert |

### setRadius(double value) {#setRadius-double-}
```
public void setRadius(double value)
```


Setzt den Radius des Torus.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

### setReceiveShadows(boolean value) {#setReceiveShadows-boolean-}
```
public void setReceiveShadows(boolean value)
```


Legt fest, ob diese Geometrie Schatten empfangen kann.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### setTube(double value) {#setTube-double-}
```
public void setTube(double value)
```


Setzt den Radius der Röhre.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

### setTubularSegments(int value) {#setTubularSegments-int-}
```
public void setTubularSegments(int value)
```


Setzt die Rohrsegmente.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Neuer Wert |

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

