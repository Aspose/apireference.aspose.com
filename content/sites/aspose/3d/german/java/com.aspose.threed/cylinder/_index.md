---
title: Cylinder
second_title: Aspose.3D für Java API-Referenz
description: Parametrisierter Zylinder.
type: docs
weight: 40
url: /de/java/com.aspose.threed/cylinder/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Primitive](../../com.aspose.threed/primitive)
```
public class Cylinder extends Primitive
```

Parametrisierter Zylinder. Er kann auch verwendet werden, um den Kegel darzustellen, wenn einer der Werte radiusTop/radiusBottom null ist.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [Cylinder()](#Cylinder--) | Initialisiert eine neue Instanz der [Cylinder](../../com.aspose.threed/cylinder) Klasse. |
| [Cylinder(double radius, double height)](#Cylinder-double-double-) | Initialisiert eine neue Instanz der [Cylinder](../../com.aspose.threed/cylinder) Klasse. |
| [Cylinder(double radiusTop, double radiusBottom, double height)](#Cylinder-double-double-double-) | Initialisiert eine neue Instanz der [Cylinder](../../com.aspose.threed/cylinder) Klasse. |
| [Cylinder(double radiusTop, double radiusBottom, double height, int radialSegments, int heightSegments, boolean openEnded)](#Cylinder-double-double-double-int-int-boolean-) | Initialisiert eine neue Instanz der [Cylinder](../../com.aspose.threed/cylinder) Klasse. |
| [Cylinder(String name, double radiusTop, double radiusBottom, double height, int radialSegments, int heightSegments, boolean openEnded, double thetaStart, double thetaLength)](#Cylinder-java.lang.String-double-double-double-int-int-boolean-double-double-) | Initialisiert eine neue Instanz der [Cylinder](../../com.aspose.threed/cylinder) Klasse. |
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
| [getGenerateFanCylinder()](#getGenerateFanCylinder--) | Gibt an, ob ein fanförmiger Zylinder erzeugt werden soll, wenn die ThetaLength kleiner als 2\*PI ist, andernfalls wird das Modell nicht geschnitten. |
| [getHeight()](#getHeight--) | Gibt die Höhe des Zylinders zurück. |
| [getHeightSegments()](#getHeightSegments--) | Liefert die Höhensegmente. |
| [getName()](#getName--) | Liefert den Namen. |
| [getOffsetBottom()](#getOffsetBottom--) | Gibt den Transformationsversatz der Scheitelpunkte der Unterseite zurück. |
| [getOffsetTop()](#getOffsetTop--) | Gibt den Transformationsversatz der Scheitelpunkte der Oberseite zurück. |
| [getOpenEnded()](#getOpenEnded--) | Gibt einen Wert zurück, der angibt, ob dieser [Cylinder](../../com.aspose.threed/cylinder) offen ist. |
| [getParentNode()](#getParentNode--) | Liefert den ersten übergeordneten Knoten; wenn der erste übergeordnete Knoten gesetzt wird, wird diese Entität von anderen übergeordneten Knoten getrennt. |
| [getParentNodes()](#getParentNodes--) | Liefert alle übergeordneten Knoten; eine Entität kann für Geometrie-Instanzierung an mehrere übergeordnete Knoten angehängt werden |
| [getProperties()](#getProperties--) | Liefert die Sammlung aller Eigenschaften. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Liefere den Wert der angegebenen Eigenschaft |
| [getRadialSegments()](#getRadialSegments--) | Gibt die radialen Segmente zurück. |
| [getRadiusBottom()](#getRadiusBottom--) | Gibt den Radius der Unterkappe des Zylinders zurück. |
| [getRadiusTop()](#getRadiusTop--) | Gibt den Radius der oberen Kappe des Zylinders zurück. |
| [getReceiveShadows()](#getReceiveShadows--) | Ermittelt, ob diese Geometrie Schatten empfangen kann. |
| [getScene()](#getScene--) | Liefert die Szene, zu der dieses Objekt gehört |
| [getShearBottom()](#getShearBottom--) | Liest die Schertransformation der unteren Seite, der Vektor speichert den (x-Achse, z-Achse) Scherwert, gemessen in Radiant, Standardwert ist (0, 0). |
| [getShearTop()](#getShearTop--) | Liest die Schertransformation der oberen Seite, der Vektor speichert den (x-Achse, z-Achse) Scherwert, gemessen in Radiant, Standardwert ist (0, 0). |
| [getThetaLength()](#getThetaLength--) | Liefert die Länge von theta. |
| [getThetaStart()](#getThetaStart--) | Liefert den theta-Start. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Entfernt eine dynamische Eigenschaft. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Entferne die angegebene Eigenschaft, die durch ihren Namen identifiziert wird |
| [setCastShadows(boolean value)](#setCastShadows-boolean-) | Legt fest, ob diese Geometrie Schatten werfen kann |
| [setExcluded(boolean value)](#setExcluded-boolean-) | Legt fest, ob diese Entität beim Exportieren ausgeschlossen werden soll. |
| [setGenerateFanCylinder(boolean value)](#setGenerateFanCylinder-boolean-) | Legt fest, ob ein fächerförmiger Zylinder erzeugt werden soll, wenn die ThetaLength kleiner als 2\*PI ist, andernfalls wird das Modell nicht geschnitten. |
| [setHeight(double value)](#setHeight-double-) | Legt die Höhe des Zylinders fest. |
| [setHeightSegments(int value)](#setHeightSegments-int-) | Legt die Höhensegmente fest. |
| [setName(String value)](#setName-java.lang.String-) | Setzt den Namen. |
| [setOffsetBottom(Vector3 value)](#setOffsetBottom-com.aspose.threed.Vector3-) | Legt den Transformationsoffset der Scheitelpunkte der unteren Seite fest. |
| [setOffsetTop(Vector3 value)](#setOffsetTop-com.aspose.threed.Vector3-) | Legt den Transformationsoffset der Scheitelpunkte der oberen Seite fest. |
| [setOpenEnded(boolean value)](#setOpenEnded-boolean-) | Legt einen Wert fest, der angibt, ob dieser [Cylinder](../../com.aspose.threed/cylinder) offen ist. |
| [setParentNode(Node value)](#setParentNode-com.aspose.threed.Node-) | Setzt den ersten übergeordneten Knoten; wenn der erste übergeordnete Knoten gesetzt wird, wird diese Entität von anderen übergeordneten Knoten getrennt. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Setzt den Wert der angegebenen Eigenschaft |
| [setRadialSegments(int value)](#setRadialSegments-int-) | Legt die radialen Segmente fest. |
| [setRadiusBottom(double value)](#setRadiusBottom-double-) | Legt den Radius der unteren Kappe des Zylinders fest. |
| [setRadiusTop(double value)](#setRadiusTop-double-) | Legt den Radius der oberen Kappe des Zylinders fest. |
| [setReceiveShadows(boolean value)](#setReceiveShadows-boolean-) | Legt fest, ob diese Geometrie Schatten empfangen kann. |
| [setShearBottom(Vector2 value)](#setShearBottom-com.aspose.threed.Vector2-) | Legt die Schertransformation der unteren Seite fest, der Vektor speichert den (x-Achse, z-Achse) Scherwert, gemessen in Radiant, Standardwert ist (0, 0). |
| [setShearTop(Vector2 value)](#setShearTop-com.aspose.threed.Vector2-) | Legt die Schertransformation der oberen Seite fest, der Vektor speichert den (x-Achse, z-Achse) Scherwert, gemessen in Radiant, Standardwert ist (0, 0). |
| [setThetaLength(double value)](#setThetaLength-double-) | Legt die Länge von theta fest. |
| [setThetaStart(double value)](#setThetaStart-double-) | Legt den theta-Start fest. |
| [toMesh()](#toMesh--) | Konvertiere das aktuelle Objekt zu einem Mesh |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Cylinder() {#Cylinder--}
```
public Cylinder()
```


Initialisiert eine neue Instanz der [Cylinder](../../com.aspose.threed/cylinder) Klasse.

### Cylinder(double radius, double height) {#Cylinder-double-double-}
```
public Cylinder(double radius, double height)
```


Initialisiert eine neue Instanz der [Cylinder](../../com.aspose.threed/cylinder) Klasse.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| radius | double | Radius der oberen und unteren Kappe. |
| height | double | Höhe. |

### Cylinder(double radiusTop, double radiusBottom, double height) {#Cylinder-double-double-double-}
```
public Cylinder(double radiusTop, double radiusBottom, double height)
```


Initialisiert eine neue Instanz der [Cylinder](../../com.aspose.threed/cylinder) Klasse.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| radiusTop | double | Oberer Radius. |
| radiusBottom | double | Unterer Radius. |
| height | double | Höhe. |

### Cylinder(double radiusTop, double radiusBottom, double height, int radialSegments, int heightSegments, boolean openEnded) {#Cylinder-double-double-double-int-int-boolean-}
```
public Cylinder(double radiusTop, double radiusBottom, double height, int radialSegments, int heightSegments, boolean openEnded)
```


Initialisiert eine neue Instanz der [Cylinder](../../com.aspose.threed/cylinder) Klasse.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| radiusTop | double | Radius der oberen Kappe des Zylinders. |
| radiusBottom | double | Radius der unteren Kappe des Zylinders. |
| height | double | Höhe des Zylinders. |
| radialSegments | int | Radiale Segmente beider oberer und unterer Kreise.. |
| heightSegments | int | Höhensegmente. |
| openEnded | boolean | Wenn auf  true  gesetzt, hätte der Zylinder keine Boden-/Deckelkappen.. |

### Cylinder(String name, double radiusTop, double radiusBottom, double height, int radialSegments, int heightSegments, boolean openEnded, double thetaStart, double thetaLength) {#Cylinder-java.lang.String-double-double-double-int-int-boolean-double-double-}
```
public Cylinder(String name, double radiusTop, double radiusBottom, double height, int radialSegments, int heightSegments, boolean openEnded, double thetaStart, double thetaLength)
```


Initialisiert eine neue Instanz der [Cylinder](../../com.aspose.threed/cylinder) Klasse.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Der Name dieses Objekts |
| radiusTop | double | Radius der oberen Kappe des Zylinders. |
| radiusBottom | double | Radius der unteren Kappe des Zylinders. |
| height | double | Höhe des Zylinders. |
| radialSegments | int | Radiale Segmente beider oberer und unterer Kreise.. |
| heightSegments | int | Höhensegmente. |
| openEnded | boolean | Wenn auf  true  gesetzt, hätte der Zylinder keine Boden-/Deckelkappen.. |
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
### getGenerateFanCylinder() {#getGenerateFanCylinder--}
```
public boolean getGenerateFanCylinder()
```


Gibt an, ob ein fanförmiger Zylinder erzeugt werden soll, wenn die ThetaLength kleiner als 2\*PI ist, andernfalls wird das Modell nicht geschnitten.

**Returns:**
boolean - ob ein fächerförmiger Zylinder erzeugt werden soll, wenn die ThetaLength kleiner als 2\*PI ist, andernfalls wird das Modell nicht geschnitten.
### getHeight() {#getHeight--}
```
public double getHeight()
```


Gibt die Höhe des Zylinders zurück.

**Returns:**
double - die Höhe des Zylinders.
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
### getOffsetBottom() {#getOffsetBottom--}
```
public Vector3 getOffsetBottom()
```


Gibt den Transformationsversatz der Scheitelpunkte der Unterseite zurück.

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - the vertices transformation offset of the bottom side.
### getOffsetTop() {#getOffsetTop--}
```
public Vector3 getOffsetTop()
```


Gibt den Transformationsversatz der Scheitelpunkte der Oberseite zurück.

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - the vertices transformation offset of the top side.
### getOpenEnded() {#getOpenEnded--}
```
public boolean getOpenEnded()
```


Gibt einen Wert zurück, der angibt, ob dieser [Cylinder](../../com.aspose.threed/cylinder) offen ist. Der Standardwert ist false.

**Returns:**
boolean - ein Wert, der angibt, ob dieser [Cylinder](../../com.aspose.threed/cylinder) offen ist. Der Standardwert ist false.
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
### getRadiusBottom() {#getRadiusBottom--}
```
public double getRadiusBottom()
```


Gibt den Radius der Unterkappe des Zylinders zurück.

**Returns:**
double - der Radius der Bodenabdeckung des Zylinders.
### getRadiusTop() {#getRadiusTop--}
```
public double getRadiusTop()
```


Gibt den Radius der oberen Kappe des Zylinders zurück.

**Returns:**
double - der Radius der Deckelabdeckung des Zylinders.
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
### getShearBottom() {#getShearBottom--}
```
public Vector2 getShearBottom()
```


Liest die Schertransformation der unteren Seite, der Vektor speichert den (x-Achse, z-Achse) Scherwert, gemessen in Radiant, Standardwert ist (0, 0).

**Returns:**
[Vector2](../../com.aspose.threed/vector2) - of the shear transform of the bottom side, vector stores the (x-axis, z-axis) shear value that measured in radian, default value is (0, 0)
### getShearTop() {#getShearTop--}
```
public Vector2 getShearTop()
```


Liest die Schertransformation der oberen Seite, der Vektor speichert den (x-Achse, z-Achse) Scherwert, gemessen in Radiant, Standardwert ist (0, 0).

**Returns:**
[Vector2](../../com.aspose.threed/vector2) - of the shear transform of the top side, vector stores the (x-axis, z-axis) shear value that measured in radian, default value is (0, 0)
### getThetaLength() {#getThetaLength--}
```
public double getThetaLength()
```


Gibt die Länge von Theta zurück. Der Standardwert ist 2\\u03c0.

**Returns:**
double - die Länge von Theta. Der Standardwert ist 2\\u03c0.
### getThetaStart() {#getThetaStart--}
```
public double getThetaStart()
```


Gibt den Startwert von Theta zurück. Der Standardwert ist 0.

**Returns:**
double - der Startwert von Theta. Der Standardwert ist 0.
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

### setGenerateFanCylinder(boolean value) {#setGenerateFanCylinder-boolean-}
```
public void setGenerateFanCylinder(boolean value)
```


Legt fest, ob ein fächerförmiger Zylinder erzeugt werden soll, wenn die ThetaLength kleiner als 2\*PI ist, andernfalls wird das Modell nicht geschnitten.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### setHeight(double value) {#setHeight-double-}
```
public void setHeight(double value)
```


Legt die Höhe des Zylinders fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

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

### setOffsetBottom(Vector3 value) {#setOffsetBottom-com.aspose.threed.Vector3-}
```
public void setOffsetBottom(Vector3 value)
```


Legt den Transformationsoffset der Scheitelpunkte der unteren Seite fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | Neuer Wert |

### setOffsetTop(Vector3 value) {#setOffsetTop-com.aspose.threed.Vector3-}
```
public void setOffsetTop(Vector3 value)
```


Legt den Transformationsoffset der Scheitelpunkte der oberen Seite fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | Neuer Wert |

### setOpenEnded(boolean value) {#setOpenEnded-boolean-}
```
public void setOpenEnded(boolean value)
```


Setzt einen Wert, der angibt, ob dieser [Cylinder](../../com.aspose.threed/cylinder) offen ist. Der Standardwert ist false.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

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

### setRadiusBottom(double value) {#setRadiusBottom-double-}
```
public void setRadiusBottom(double value)
```


Legt den Radius der unteren Kappe des Zylinders fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

### setRadiusTop(double value) {#setRadiusTop-double-}
```
public void setRadiusTop(double value)
```


Legt den Radius der oberen Kappe des Zylinders fest.

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

### setShearBottom(Vector2 value) {#setShearBottom-com.aspose.threed.Vector2-}
```
public void setShearBottom(Vector2 value)
```


Legt die Schertransformation der unteren Seite fest, der Vektor speichert den (x-Achse, z-Achse) Scherwert, gemessen in Radiant, Standardwert ist (0, 0).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Vector2](../../com.aspose.threed/vector2) | Neuer Wert |

### setShearTop(Vector2 value) {#setShearTop-com.aspose.threed.Vector2-}
```
public void setShearTop(Vector2 value)
```


Legt die Schertransformation der oberen Seite fest, der Vektor speichert den (x-Achse, z-Achse) Scherwert, gemessen in Radiant, Standardwert ist (0, 0).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Vector2](../../com.aspose.threed/vector2) | Neuer Wert |

### setThetaLength(double value) {#setThetaLength-double-}
```
public void setThetaLength(double value)
```


Setzt die Länge von Theta. Der Standardwert ist 2\\u03c0.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

### setThetaStart(double value) {#setThetaStart-double-}
```
public void setThetaStart(double value)
```


Setzt den Startwert von Theta. Der Standardwert ist 0.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

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

