---
title: Sphere
second_title: Aspose.3D für Java API-Referenz
description: Parametrisierte Kugel.
type: docs
weight: 174
url: /de/java/com.aspose.threed/sphere/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Primitive](../../com.aspose.threed/primitive)
```
public class Sphere extends Primitive
```

Parametrisierte Kugel.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [Sphere()](#Sphere--) | Initialisiert eine neue Instanz von [Sphere](../../com.aspose.threed/sphere) mit dem Standardradius 1. |
| [Sphere(double radius)](#Sphere-double-) | Initialisiert eine neue Instanz der [Sphere](../../com.aspose.threed/sphere)-Klasse mit angegebenem Radius. |
| [Sphere(double radius, int widthSegments, int heightSegments)](#Sphere-double-int-int-) | Initialisiert eine neue Instanz der [Sphere](../../com.aspose.threed/sphere)-Klasse mit angegebenem Radius, Breitensegmenten und Höhensegmenten. |
| [Sphere(String name, double radius, int widthSegments, int heightSegments, double phiStart, double phiLength, double thetaStart, double thetaLength)](#Sphere-java.lang.String-double-int-int-double-double-double-double-) | Initialisiert eine neue Instanz der [Sphere](../../com.aspose.threed/sphere)-Klasse. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Findet die Eigenschaft. |
| [getBoundingBox()](#getBoundingBox--) | Liefert die Begrenzungsbox der aktuellen Entität in ihrem Objekt-Raum-Koordinatensystem. |
| [getCastShadows()](#getCastShadows--) | Ermittelt, ob diese Geometrie Schatten werfen kann |
| [getClass()](#getClass--) |  |
| [getEntityRendererKey()](#getEntityRendererKey--) | Liefert den Schlüssel des Entitäts-Renderers, der im Renderer registriert ist |
| [getExcluded()](#getExcluded--) | Liefert, ob diese Entität beim Exportieren ausgeschlossen werden soll. |
| [getHeightSegments()](#getHeightSegments--) | Liefert die Höhensegmente. |
| [getName()](#getName--) | Liefert den Namen. |
| [getParentNode()](#getParentNode--) | Liefert den ersten übergeordneten Knoten; wenn der erste übergeordnete Knoten gesetzt wird, wird diese Entität von anderen übergeordneten Knoten getrennt. |
| [getParentNodes()](#getParentNodes--) | Liefert alle übergeordneten Knoten; eine Entität kann für Geometrie-Instanzierung an mehrere übergeordnete Knoten angehängt werden |
| [getPhiLength()](#getPhiLength--) | Liefert die Länge von phi. |
| [getPhiStart()](#getPhiStart--) | Liefert den phi-Start. |
| [getProperties()](#getProperties--) | Liefert die Sammlung aller Eigenschaften. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Liefere den Wert der angegebenen Eigenschaft |
| [getRadius()](#getRadius--) | Liefert den Radius der Kugel. |
| [getReceiveShadows()](#getReceiveShadows--) | Ermittelt, ob diese Geometrie Schatten empfangen kann. |
| [getScene()](#getScene--) | Liefert die Szene, zu der dieses Objekt gehört |
| [getThetaLength()](#getThetaLength--) | Liefert die Länge von theta. |
| [getThetaStart()](#getThetaStart--) | Liefert den theta-Start. |
| [getWidthSegments()](#getWidthSegments--) | Liefert die Breitensegmente. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Entfernt eine dynamische Eigenschaft. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Entferne die angegebene Eigenschaft, die durch ihren Namen identifiziert wird |
| [setCastShadows(boolean value)](#setCastShadows-boolean-) | Legt fest, ob diese Geometrie Schatten werfen kann |
| [setExcluded(boolean value)](#setExcluded-boolean-) | Legt fest, ob diese Entität beim Exportieren ausgeschlossen werden soll. |
| [setHeightSegments(int value)](#setHeightSegments-int-) | Legt die Höhensegmente fest. |
| [setName(String value)](#setName-java.lang.String-) | Setzt den Namen. |
| [setParentNode(Node value)](#setParentNode-com.aspose.threed.Node-) | Setzt den ersten übergeordneten Knoten; wenn der erste übergeordnete Knoten gesetzt wird, wird diese Entität von anderen übergeordneten Knoten getrennt. |
| [setPhiLength(double value)](#setPhiLength-double-) | Legt die Länge von phi fest. |
| [setPhiStart(double value)](#setPhiStart-double-) | Legt den phi-Start fest. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Setzt den Wert der angegebenen Eigenschaft |
| [setRadius(double value)](#setRadius-double-) | Legt den Radius der Kugel fest. |
| [setReceiveShadows(boolean value)](#setReceiveShadows-boolean-) | Legt fest, ob diese Geometrie Schatten empfangen kann. |
| [setThetaLength(double value)](#setThetaLength-double-) | Legt die Länge von theta fest. |
| [setThetaStart(double value)](#setThetaStart-double-) | Legt den theta-Start fest. |
| [setWidthSegments(int value)](#setWidthSegments-int-) | Setzt die Breitensegmente. |
| [toMesh()](#toMesh--) | Konvertiere das aktuelle Objekt zu einem Mesh |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Sphere() {#Sphere--}
```
public Sphere()
```


Initialisiert eine neue Instanz von [Sphere](../../com.aspose.threed/sphere) mit dem Standardradius 1.

### Sphere(double radius) {#Sphere-double-}
```
public Sphere(double radius)
```


Initialisiert eine neue Instanz der [Sphere](../../com.aspose.threed/sphere)-Klasse mit angegebenem Radius.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| radius | double | Radius. |

### Sphere(double radius, int widthSegments, int heightSegments) {#Sphere-double-int-int-}
```
public Sphere(double radius, int widthSegments, int heightSegments)
```


Initialisiert eine neue Instanz der [Sphere](../../com.aspose.threed/sphere)-Klasse mit angegebenem Radius, Breitensegmenten und Höhensegmenten.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| radius | double | Radius der Kugel. |
| widthSegments | int | Breitenabschnitte. |
| heightSegments | int | Höhensegmente. |

### Sphere(String name, double radius, int widthSegments, int heightSegments, double phiStart, double phiLength, double thetaStart, double thetaLength) {#Sphere-java.lang.String-double-int-int-double-double-double-double-}
```
public Sphere(String name, double radius, int widthSegments, int heightSegments, double phiStart, double phiLength, double thetaStart, double thetaLength)
```


Initialisiert eine neue Instanz der [Sphere](../../com.aspose.threed/sphere)-Klasse.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Name. |
| radius | double | Radius der Kugel. |
| widthSegments | int | Breitenabschnitte. |
| heightSegments | int | Höhensegmente. |
| phiStart | double | Phi-Start. |
| phiLength | double | Phi-Länge. |
| thetaStart | double | Theta-Start. |
| thetaLength | double | Theta-Länge. |

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
### getHeightSegments() {#getHeightSegments--}
```
public int getHeightSegments()
```


Liefert die Höhensegmente.

**Returns:**
int - die Höhensegmente.
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
### getPhiLength() {#getPhiLength--}
```
public double getPhiLength()
```


Liefert die Länge von phi.

**Returns:**
double - die Länge von phi.
### getPhiStart() {#getPhiStart--}
```
public double getPhiStart()
```


Liefert den phi-Start.

**Returns:**
double - der phi-Start.
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
### getRadius() {#getRadius--}
```
public double getRadius()
```


Liefert den Radius der Kugel.

**Returns:**
double - der Radius der Kugel.
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
### getThetaLength() {#getThetaLength--}
```
public double getThetaLength()
```


Liefert die Länge von theta.

**Returns:**
double - die Länge von theta.
### getThetaStart() {#getThetaStart--}
```
public double getThetaStart()
```


Liefert den theta-Start.

**Returns:**
double - der theta-Start.
### getWidthSegments() {#getWidthSegments--}
```
public int getWidthSegments()
```


Liefert die Breitensegmente.

**Returns:**
int - die Breitenabschnitte.
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

### setHeightSegments(int value) {#setHeightSegments-int-}
```
public void setHeightSegments(int value)
```


Legt die Höhensegmente fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Neuer Wert |

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

### setPhiLength(double value) {#setPhiLength-double-}
```
public void setPhiLength(double value)
```


Legt die Länge von phi fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

### setPhiStart(double value) {#setPhiStart-double-}
```
public void setPhiStart(double value)
```


Legt den phi-Start fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

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

### setRadius(double value) {#setRadius-double-}
```
public void setRadius(double value)
```


Legt den Radius der Kugel fest.

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

### setThetaLength(double value) {#setThetaLength-double-}
```
public void setThetaLength(double value)
```


Legt die Länge von theta fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

### setThetaStart(double value) {#setThetaStart-double-}
```
public void setThetaStart(double value)
```


Legt den theta-Start fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

### setWidthSegments(int value) {#setWidthSegments-int-}
```
public void setWidthSegments(int value)
```


Setzt die Breitensegmente.

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

