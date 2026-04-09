---
title: Kamera
second_title: Aspose.3D für Java API-Referenz
description: Die Kamera beschreibt den Augenpunkt des Betrachters, der die Szene betrachtet.
type: docs
weight: 28
url: /de/java/com.aspose.threed/camera/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Frustum](../../com.aspose.threed/frustum)

**All Implemented Interfaces:**
[com.aspose.threed.IOrientable](../../com.aspose.threed/iorientable)
```
public class Camera extends Frustum implements IOrientable
```

Die Kamera beschreibt den Augenpunkt des Betrachters, der die Szene betrachtet.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [Camera()](#Camera--) | Initialisiert eine neue Instanz der [Camera](../../com.aspose.threed/camera)-Klasse. |
| [Camera(ProjectionType projectionType)](#Camera-com.aspose.threed.ProjectionType-) | Initialisiert eine neue Instanz der [Camera](../../com.aspose.threed/camera)-Klasse. |
| [Camera(String name)](#Camera-java.lang.String-) | Initialisiert eine neue Instanz der [Camera](../../com.aspose.threed/camera)-Klasse. |
| [Camera(String name, ProjectionType projectionType)](#Camera-java.lang.String-com.aspose.threed.ProjectionType-) | Initialisiert eine neue Instanz der [Camera](../../com.aspose.threed/camera)-Klasse. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Findet die Eigenschaft. |
| [getApertureMode()](#getApertureMode--) | Liest den Blendenmodus der Kamera |
| [getAspect()](#getAspect--) | Liefert das Seitenverhältnis des Frustums |
| [getAspectRatio()](#getAspectRatio--) | Liest das Seitenverhältnis der Ansichtsebene. |
| [getBoundingBox()](#getBoundingBox--) | Liefert die Begrenzungsbox der aktuellen Entität in ihrem Objekt-Raum-Koordinatensystem. |
| [getClass()](#getClass--) |  |
| [getDirection()](#getDirection--) | Liefert die Richtung, in die die Kamera blickt. |
| [getEntityRendererKey()](#getEntityRendererKey--) | Liefert den Schlüssel des Entitäts-Renderers, der im Renderer registriert ist |
| [getExcluded()](#getExcluded--) | Liefert, ob diese Entität beim Exportieren ausgeschlossen werden soll. |
| [getFarPlane()](#getFarPlane--) | Liefert die Entfernung der fernen Ebene des Frustums. |
| [getFieldOfView()](#getFieldOfView--) | Liest das Sichtfeld der Kamera in Grad, diese Eigenschaft wird nur verwendet, wenn ApertureMode [ApertureMode.HORIZONTAL](../../com.aspose.threed/aperturemode\#HORIZONTAL) oder [ApertureMode.VERTICAL](../../com.aspose.threed/aperturemode\#VERTICAL) ist |
| [getFieldOfViewX()](#getFieldOfViewX--) | Liest das horizontale Sichtfeld der Kamera in Grad, diese Eigenschaft wird nur verwendet, wenn ApertureMode [ApertureMode.HORIZ\_AND\_VERT](../../com.aspose.threed/aperturemode\#HORIZ-AND-VERT) ist |
| [getFieldOfViewY()](#getFieldOfViewY--) | Liest das vertikale Sichtfeld der Kamera in Grad, diese Eigenschaft wird nur verwendet, wenn ApertureMode [ApertureMode.HORIZ\_AND\_VERT](../../com.aspose.threed/aperturemode\#HORIZ-AND-VERT) ist |
| [getHeight()](#getHeight--) | Liest die Höhe der Ansichtsebene in Zoll |
| [getLookAt()](#getLookAt--) | Ermittelt die interessierte Position, auf die die Kamera blickt. |
| [getMagnification()](#getMagnification--) | Liest die Vergrößerung, die in einer orthografischen Kamera verwendet wird |
| [getName()](#getName--) | Liefert den Namen. |
| [getNearPlane()](#getNearPlane--) | Ermittelt den Abstand der Nahebene des Sichtvolumens. |
| [getOrthoHeight()](#getOrthoHeight--) | Ermittelt die Höhe, wenn das Sichtvolumen in orthografischer Projektion ist. |
| [getParentNode()](#getParentNode--) | Liefert den ersten übergeordneten Knoten; wenn der erste übergeordnete Knoten gesetzt wird, wird diese Entität von anderen übergeordneten Knoten getrennt. |
| [getParentNodes()](#getParentNodes--) | Liefert alle übergeordneten Knoten; eine Entität kann für Geometrie-Instanzierung an mehrere übergeordnete Knoten angehängt werden |
| [getProjectionType()](#getProjectionType--) | Liest den Projektionstyp der Kamera. |
| [getProperties()](#getProperties--) | Liefert die Sammlung aller Eigenschaften. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Liefere den Wert der angegebenen Eigenschaft |
| [getRotationMode()](#getRotationMode--) | Ermittelt den Orientierungsmodus des Sichtvolumens. Diese Eigenschaft funktioniert nur, wenn [getTarget](../../com.aspose.threed/frustum\#getTarget) null ist. |
| [getScene()](#getScene--) | Liefert die Szene, zu der dieses Objekt gehört |
| [getTarget()](#getTarget--) | Ermittelt das Ziel, auf das die Kamera blickt. |
| [getUp()](#getUp--) | Ermittelt die Aufwärtsrichtung der Kamera |
| [getWidth()](#getWidth--) | Liest die Breite der Ansichtsebene in Zoll |
| [hashCode()](#hashCode--) |  |
| [moveForward(double distance)](#moveForward-double-) | Bewege die Kamera vorwärts in Richtung ihrer Ausrichtung oder ihres Ziels. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Entfernt eine dynamische Eigenschaft. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Entferne die angegebene Eigenschaft, die durch ihren Namen identifiziert wird |
| [setApertureMode(ApertureMode value)](#setApertureMode-com.aspose.threed.ApertureMode-) | Setzt den Blendenmodus der Kamera |
| [setAspect(double value)](#setAspect-double-) | Setzt das Seitenverhältnis des Sichtvolumens |
| [setAspectRatio(double value)](#setAspectRatio-double-) | Setzt das Seitenverhältnis der Ansichtsebene. |
| [setDirection(Vector3 value)](#setDirection-com.aspose.threed.Vector3-) | Setzt die Richtung, in die die Kamera blickt. |
| [setExcluded(boolean value)](#setExcluded-boolean-) | Legt fest, ob diese Entität beim Exportieren ausgeschlossen werden soll. |
| [setFarPlane(double value)](#setFarPlane-double-) | Setzt den Abstand der Fernebene des Sichtvolumens. |
| [setFieldOfView(double value)](#setFieldOfView-double-) | Setzt das Sichtfeld der Kamera in Grad, diese Eigenschaft wird nur verwendet, wenn ApertureMode [ApertureMode.HORIZONTAL](../../com.aspose.threed/aperturemode\#HORIZONTAL) oder [ApertureMode.VERTICAL](../../com.aspose.threed/aperturemode\#VERTICAL) ist |
| [setFieldOfViewX(double value)](#setFieldOfViewX-double-) | Setzt das horizontale Sichtfeld der Kamera in Grad, diese Eigenschaft wird nur verwendet, wenn ApertureMode [ApertureMode.HORIZ\_AND\_VERT](../../com.aspose.threed/aperturemode\#HORIZ-AND-VERT) ist |
| [setFieldOfViewY(double value)](#setFieldOfViewY-double-) | Setzt das vertikale Sichtfeld der Kamera in Grad, diese Eigenschaft wird nur verwendet, wenn ApertureMode [ApertureMode.HORIZ\_AND\_VERT](../../com.aspose.threed/aperturemode\#HORIZ-AND-VERT) ist |
| [setHeight(double value)](#setHeight-double-) | Setzt die Höhe der Ansichtsebene in Zoll |
| [setLookAt(Vector3 value)](#setLookAt-com.aspose.threed.Vector3-) | Setzt die interessierte Position, auf die die Kamera blickt. |
| [setMagnification(Vector2 value)](#setMagnification-com.aspose.threed.Vector2-) | Setzt die Vergrößerung, die in einer orthografischen Kamera verwendet wird |
| [setName(String value)](#setName-java.lang.String-) | Setzt den Namen. |
| [setNearPlane(double value)](#setNearPlane-double-) | Legt den Abstand der nahen Ebene des Frustums fest. |
| [setOrthoHeight(double value)](#setOrthoHeight-double-) | Legt die Höhe fest, wenn das Frustum in orthografischer Projektion ist. |
| [setParentNode(Node value)](#setParentNode-com.aspose.threed.Node-) | Setzt den ersten übergeordneten Knoten; wenn der erste übergeordnete Knoten gesetzt wird, wird diese Entität von anderen übergeordneten Knoten getrennt. |
| [setProjectionType(ProjectionType value)](#setProjectionType-com.aspose.threed.ProjectionType-) | Setzt den Projektionstyp der Kamera. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Setzt den Wert der angegebenen Eigenschaft |
| [setRotationMode(RotationMode value)](#setRotationMode-com.aspose.threed.RotationMode-) | Legt den Orientierungsmodus des Frustums fest. Diese Eigenschaft funktioniert nur, wenn [getTarget](../../com.aspose.threed/frustum\#getTarget) null ist. |
| [setTarget(Node value)](#setTarget-com.aspose.threed.Node-) | Legt das Ziel fest, auf das die Kamera blickt. |
| [setUp(Vector3 value)](#setUp-com.aspose.threed.Vector3-) | Legt die Aufwärtsrichtung der Kamera fest |
| [setWidth(double value)](#setWidth-double-) | Setzt die Breite der Ansichtsebene in Zoll |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Camera() {#Camera--}
```
public Camera()
```


Initialisiert eine neue Instanz der [Camera](../../com.aspose.threed/camera)-Klasse.

### Camera(ProjectionType projectionType) {#Camera-com.aspose.threed.ProjectionType-}
```
public Camera(ProjectionType projectionType)
```


Initialisiert eine neue Instanz der [Camera](../../com.aspose.threed/camera)-Klasse.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| projectionType | [ProjectionType](../../com.aspose.threed/projectiontype) | Projektionstyp. |

### Camera(String name) {#Camera-java.lang.String-}
```
public Camera(String name)
```


Initialisiert eine neue Instanz der [Camera](../../com.aspose.threed/camera)-Klasse.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Name. |

### Camera(String name, ProjectionType projectionType) {#Camera-java.lang.String-com.aspose.threed.ProjectionType-}
```
public Camera(String name, ProjectionType projectionType)
```


Initialisiert eine neue Instanz der [Camera](../../com.aspose.threed/camera)-Klasse.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Name. |
| projectionType | [ProjectionType](../../com.aspose.threed/projectiontype) | Projektionstyp. |

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
### getApertureMode() {#getApertureMode--}
```
public ApertureMode getApertureMode()
```


Liest den Blendenmodus der Kamera

**Returns:**
[ApertureMode](../../com.aspose.threed/aperturemode) - the camera's aperture mode
### getAspect() {#getAspect--}
```
public double getAspect()
```


Liefert das Seitenverhältnis des Frustums

**Returns:**
double - das Seitenverhältnis des Frustums
### getAspectRatio() {#getAspectRatio--}
```
public double getAspectRatio()
```


Liest das Seitenverhältnis der Ansichtsebene.

**Returns:**
double - das Seitenverhältnis der Ansichtsebene.
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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDirection() {#getDirection--}
```
public Vector3 getDirection()
```


Liest die Richtung, in die die Kamera blickt. Änderungen an dieser Eigenschaft wirken sich auch auf [getLookAt](../../com.aspose.threed/frustum\#getLookAt) und [getTarget](../../com.aspose.threed/frustum\#getTarget) aus.

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - the direction that the camera is looking at. Changes on this property will also affects the [getLookAt](../../com.aspose.threed/frustum\#getLookAt) and [getTarget](../../com.aspose.threed/frustum\#getTarget).
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
### getFarPlane() {#getFarPlane--}
```
public double getFarPlane()
```


Liefert die Entfernung der fernen Ebene des Frustums.

**Returns:**
double - der Abstand der fernen Ebene des Frustums.
### getFieldOfView() {#getFieldOfView--}
```
public double getFieldOfView()
```


Liest das Sichtfeld der Kamera in Grad, diese Eigenschaft wird nur verwendet, wenn ApertureMode [ApertureMode.HORIZONTAL](../../com.aspose.threed/aperturemode\#HORIZONTAL) oder [ApertureMode.VERTICAL](../../com.aspose.threed/aperturemode\#VERTICAL) ist

**Returns:**
double - das Sichtfeld der Kamera in Grad, diese Eigenschaft wird nur verwendet, wenn ApertureMode [ApertureMode.HORIZONTAL](../../com.aspose.threed/aperturemode\#HORIZONTAL) oder [ApertureMode.VERTICAL](../../com.aspose.threed/aperturemode\#VERTICAL) ist
### getFieldOfViewX() {#getFieldOfViewX--}
```
public double getFieldOfViewX()
```


Liest das horizontale Sichtfeld der Kamera in Grad, diese Eigenschaft wird nur verwendet, wenn ApertureMode [ApertureMode.HORIZ\_AND\_VERT](../../com.aspose.threed/aperturemode\#HORIZ-AND-VERT) ist

**Returns:**
double - das horizontale Sichtfeld der Kamera in Grad, diese Eigenschaft wird nur verwendet, wenn ApertureMode [ApertureMode.HORIZ\_AND\_VERT](../../com.aspose.threed/aperturemode\#HORIZ-AND-VERT) ist
### getFieldOfViewY() {#getFieldOfViewY--}
```
public double getFieldOfViewY()
```


Liest das vertikale Sichtfeld der Kamera in Grad, diese Eigenschaft wird nur verwendet, wenn ApertureMode [ApertureMode.HORIZ\_AND\_VERT](../../com.aspose.threed/aperturemode\#HORIZ-AND-VERT) ist

**Returns:**
double - das vertikale Sichtfeld der Kamera in Grad, diese Eigenschaft wird nur verwendet, wenn ApertureMode [ApertureMode.HORIZ\_AND\_VERT](../../com.aspose.threed/aperturemode\#HORIZ-AND-VERT) ist
### getHeight() {#getHeight--}
```
public double getHeight()
```


Liest die Höhe der Ansichtsebene in Zoll

**Returns:**
double - die Höhe der Ansichtsebene in Zoll
### getLookAt() {#getLookAt--}
```
public Vector3 getLookAt()
```


Ermittelt die interessierte Position, auf die die Kamera blickt.

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - the the interested position that the camera is looking at.
### getMagnification() {#getMagnification--}
```
public Vector2 getMagnification()
```


Liest die Vergrößerung, die in einer orthografischen Kamera verwendet wird

**Returns:**
[Vector2](../../com.aspose.threed/vector2) - the magnification used in orthographic camera
### getName() {#getName--}
```
public String getName()
```


Liefert den Namen.

**Returns:**
java.lang.String - der Name.
### getNearPlane() {#getNearPlane--}
```
public double getNearPlane()
```


Ermittelt den Abstand der Nahebene des Sichtvolumens.

**Returns:**
double - der Abstand der nahen Ebene des Frustums.
### getOrthoHeight() {#getOrthoHeight--}
```
public double getOrthoHeight()
```


Ermittelt die Höhe, wenn das Sichtvolumen in orthografischer Projektion ist.

**Returns:**
double - die Höhe, wenn das Frustum in orthografischer Projektion ist.
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
### getProjectionType() {#getProjectionType--}
```
public ProjectionType getProjectionType()
```


Ermittelt den Projektionstyp der Kamera. Standardmäßig wird die perspektivische Projektion verwendet.

**Returns:**
[ProjectionType](../../com.aspose.threed/projectiontype) - the camera's projection type. By default the perspective projection is used.
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
### getRotationMode() {#getRotationMode--}
```
public RotationMode getRotationMode()
```


Liest den Orientierungsmodus des Frustums. Diese Eigenschaft funktioniert nur, wenn [getTarget](../../com.aspose.threed/frustum\#getTarget) null ist. Wenn der Wert [RotationMode.FIXED\_TARGET](../../com.aspose.threed/rotationmode\#FIXED-TARGET) ist, wird die Richtung stets über die Eigenschaft [getLookAt](../../com.aspose.threed/frustum\#getLookAt) berechnet. Andernfalls wird [getLookAt](../../com.aspose.threed/frustum\#getLookAt) stets über [getDirection](../../com.aspose.threed/frustum\#getDirection) berechnet.

**Returns:**
[RotationMode](../../com.aspose.threed/rotationmode) - the frustum's orientation mode This property only works when the [getTarget](../../com.aspose.threed/frustum\#getTarget) is null. If the value is [RotationMode.FIXED\_TARGET](../../com.aspose.threed/rotationmode\#FIXED-TARGET), the direction is always calculated by the property [getLookAt](../../com.aspose.threed/frustum\#getLookAt) Otherwise the [getLookAt](../../com.aspose.threed/frustum\#getLookAt) is always calculated by the [getDirection](../../com.aspose.threed/frustum\#getDirection)
### getScene() {#getScene--}
```
public Scene getScene()
```


Liefert die Szene, zu der dieses Objekt gehört

**Returns:**
[Scene](../../com.aspose.threed/scene) - the scene that this object belongs to
### getTarget() {#getTarget--}
```
public Node getTarget()
```


Liest das Ziel, auf das die Kamera blickt. Wenn der Benutzer diese Eigenschaft unterstützt, sollte sie vor der Eigenschaft [getLookAt](../../com.aspose.threed/frustum\#getLookAt) liegen.

**Returns:**
[Node](../../com.aspose.threed/node) - the target that the camera is looking at. If the user supports this property, it should be prior to [getLookAt](../../com.aspose.threed/frustum\#getLookAt) property.
### getUp() {#getUp--}
```
public Vector3 getUp()
```


Ermittelt die Aufwärtsrichtung der Kamera

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - the up direction of the camera
### getWidth() {#getWidth--}
```
public double getWidth()
```


Liest die Breite der Ansichtsebene in Zoll

**Returns:**
double – die Breite der Ansichtsebene gemessen in Zoll
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### moveForward(double distance) {#moveForward-double-}
```
public void moveForward(double distance)
```


Bewege die Kamera vorwärts in Richtung ihrer Ausrichtung oder ihres Ziels.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Entfernung | double | Wie lange vorwärts bewegt werden soll |

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
### setApertureMode(ApertureMode value) {#setApertureMode-com.aspose.threed.ApertureMode-}
```
public void setApertureMode(ApertureMode value)
```


Setzt den Blendenmodus der Kamera

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [ApertureMode](../../com.aspose.threed/aperturemode) | Neuer Wert |

### setAspect(double value) {#setAspect-double-}
```
public void setAspect(double value)
```


Setzt das Seitenverhältnis des Sichtvolumens

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

### setAspectRatio(double value) {#setAspectRatio-double-}
```
public void setAspectRatio(double value)
```


Setzt das Seitenverhältnis der Ansichtsebene.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

### setDirection(Vector3 value) {#setDirection-com.aspose.threed.Vector3-}
```
public void setDirection(Vector3 value)
```


Legt die Richtung fest, in die die Kamera blickt. Änderungen an dieser Eigenschaft wirken sich auch auf [getLookAt](../../com.aspose.threed/frustum\#getLookAt) und [getTarget](../../com.aspose.threed/frustum\#getTarget) aus.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | Neuer Wert |

### setExcluded(boolean value) {#setExcluded-boolean-}
```
public void setExcluded(boolean value)
```


Legt fest, ob diese Entität beim Exportieren ausgeschlossen werden soll.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### setFarPlane(double value) {#setFarPlane-double-}
```
public void setFarPlane(double value)
```


Setzt den Abstand der Fernebene des Sichtvolumens.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

### setFieldOfView(double value) {#setFieldOfView-double-}
```
public void setFieldOfView(double value)
```


Setzt das Sichtfeld der Kamera in Grad, diese Eigenschaft wird nur verwendet, wenn ApertureMode [ApertureMode.HORIZONTAL](../../com.aspose.threed/aperturemode\#HORIZONTAL) oder [ApertureMode.VERTICAL](../../com.aspose.threed/aperturemode\#VERTICAL) ist

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

### setFieldOfViewX(double value) {#setFieldOfViewX-double-}
```
public void setFieldOfViewX(double value)
```


Setzt das horizontale Sichtfeld der Kamera in Grad, diese Eigenschaft wird nur verwendet, wenn ApertureMode [ApertureMode.HORIZ\_AND\_VERT](../../com.aspose.threed/aperturemode\#HORIZ-AND-VERT) ist

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

### setFieldOfViewY(double value) {#setFieldOfViewY-double-}
```
public void setFieldOfViewY(double value)
```


Setzt das vertikale Sichtfeld der Kamera in Grad, diese Eigenschaft wird nur verwendet, wenn ApertureMode [ApertureMode.HORIZ\_AND\_VERT](../../com.aspose.threed/aperturemode\#HORIZ-AND-VERT) ist

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

### setHeight(double value) {#setHeight-double-}
```
public void setHeight(double value)
```


Setzt die Höhe der Ansichtsebene in Zoll

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

### setLookAt(Vector3 value) {#setLookAt-com.aspose.threed.Vector3-}
```
public void setLookAt(Vector3 value)
```


Setzt die interessierte Position, auf die die Kamera blickt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | Neuer Wert |

### setMagnification(Vector2 value) {#setMagnification-com.aspose.threed.Vector2-}
```
public void setMagnification(Vector2 value)
```


Setzt die Vergrößerung, die in einer orthografischen Kamera verwendet wird

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Vector2](../../com.aspose.threed/vector2) | Neuer Wert |

### setName(String value) {#setName-java.lang.String-}
```
public void setName(String value)
```


Setzt den Namen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert |

### setNearPlane(double value) {#setNearPlane-double-}
```
public void setNearPlane(double value)
```


Legt den Abstand der nahen Ebene des Frustums fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

### setOrthoHeight(double value) {#setOrthoHeight-double-}
```
public void setOrthoHeight(double value)
```


Legt die Höhe fest, wenn das Frustum in orthografischer Projektion ist.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

### setParentNode(Node value) {#setParentNode-com.aspose.threed.Node-}
```
public void setParentNode(Node value)
```


Setzt den ersten übergeordneten Knoten; wenn der erste übergeordnete Knoten gesetzt wird, wird diese Entität von anderen übergeordneten Knoten getrennt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Node](../../com.aspose.threed/node) | Neuer Wert |

### setProjectionType(ProjectionType value) {#setProjectionType-com.aspose.threed.ProjectionType-}
```
public void setProjectionType(ProjectionType value)
```


Setzt den Projektionstyp der Kamera. Standardmäßig wird die perspektivische Projektion verwendet.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [ProjectionType](../../com.aspose.threed/projectiontype) | Neuer Wert |

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

### setRotationMode(RotationMode value) {#setRotationMode-com.aspose.threed.RotationMode-}
```
public void setRotationMode(RotationMode value)
```


Legt den Orientierungsmodus des Frustums fest. Diese Eigenschaft funktioniert nur, wenn [getTarget](../../com.aspose.threed/frustum\#getTarget) null ist. Wenn der Wert [RotationMode.FIXED\_TARGET](../../com.aspose.threed/rotationmode\#FIXED-TARGET) ist, wird die Richtung stets über die Eigenschaft [getLookAt](../../com.aspose.threed/frustum\#getLookAt) berechnet. Andernfalls wird [getLookAt](../../com.aspose.threed/frustum\#getLookAt) stets über [getDirection](../../com.aspose.threed/frustum\#getDirection) berechnet.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [RotationMode](../../com.aspose.threed/rotationmode) | Neuer Wert |

### setTarget(Node value) {#setTarget-com.aspose.threed.Node-}
```
public void setTarget(Node value)
```


Legt das Ziel fest, auf das die Kamera blickt. Wenn der Benutzer diese Eigenschaft unterstützt, sollte sie vor der [getLookAt](../../com.aspose.threed/frustum\#getLookAt) Eigenschaft liegen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Node](../../com.aspose.threed/node) | Neuer Wert |

### setUp(Vector3 value) {#setUp-com.aspose.threed.Vector3-}
```
public void setUp(Vector3 value)
```


Legt die Aufwärtsrichtung der Kamera fest

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | Neuer Wert |

### setWidth(double value) {#setWidth-double-}
```
public void setWidth(double value)
```


Setzt die Breite der Ansichtsebene in Zoll

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

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

