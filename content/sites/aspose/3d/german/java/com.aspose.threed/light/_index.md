---
title: Licht
second_title: Aspose.3D für Java API-Referenz
description: Das Licht beleuchtet die Szene.
type: docs
weight: 94
url: /de/java/com.aspose.threed/light/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Frustum](../../com.aspose.threed/frustum)
```
public class Light extends Frustum
```

Das Licht beleuchtet die Szene.

Die Formel zur Berechnung der Gesamtdämpfung von Licht lautet:  A = ConstantAttenuation + (Dist \* LinearAttenuation) + ((Dist^2) \* QuadraticAttenuation)
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [Light()](#Light--) | Initialisiert eine neue Instanz der [Light](../../com.aspose.threed/light)-Klasse. |
| [Light(String name)](#Light-java.lang.String-) | Initialisiert eine neue Instanz der [Light](../../com.aspose.threed/light)-Klasse. |
| [Light(String name, LightType type)](#Light-java.lang.String-com.aspose.threed.LightType-) | Initialisiert eine neue Instanz der [Light](../../com.aspose.threed/light)-Klasse. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Findet die Eigenschaft. |
| [getAspect()](#getAspect--) | Liefert das Seitenverhältnis des Frustums |
| [getBoundingBox()](#getBoundingBox--) | Liefert die Begrenzungsbox der aktuellen Entität in ihrem Objekt-Raum-Koordinatensystem. |
| [getCastLight()](#getCastLight--) | Liefert, ob die aktuelle Lichtinstanz andere Objekte beleuchten kann. |
| [getCastShadows()](#getCastShadows--) | Liefert, ob das Licht Schatten auf andere Objekte werfen kann. |
| [getClass()](#getClass--) |  |
| [getColor()](#getColor--) | Liefert die Farbe des Lichts |
| [getConstantAttenuation()](#getConstantAttenuation--) | Liefert die konstante Dämpfung zur Berechnung der Gesamtdämpfung des Lichts |
| [getDirection()](#getDirection--) | Liefert die Richtung, in die die Kamera blickt. |
| [getEntityRendererKey()](#getEntityRendererKey--) | Liefert den Schlüssel des Entitäts-Renderers, der im Renderer registriert ist |
| [getExcluded()](#getExcluded--) | Liefert, ob diese Entität beim Exportieren ausgeschlossen werden soll. |
| [getFalloff()](#getFalloff--) | Liefert den Abfallkegelwinkel (in Grad). |
| [getFarPlane()](#getFarPlane--) | Liefert die Entfernung der fernen Ebene des Frustums. |
| [getHotSpot()](#getHotSpot--) | Ermittelt den Hot‑Spot‑Kegelwinkel (in Grad). |
| [getIntensity()](#getIntensity--) | Ermittelt die Lichtintensität, Standardwert ist 100 |
| [getLightType()](#getLightType--) | Ermittelt den Lichttyp |
| [getLinearAttenuation()](#getLinearAttenuation--) | Ermittelt die lineare Dämpfung zur Berechnung der Gesamtdämpfung des Lichts |
| [getLookAt()](#getLookAt--) | Ermittelt die interessierte Position, auf die die Kamera blickt. |
| [getName()](#getName--) | Liefert den Namen. |
| [getNearPlane()](#getNearPlane--) | Ermittelt den Abstand der Nahebene des Sichtvolumens. |
| [getOrthoHeight()](#getOrthoHeight--) | Ermittelt die Höhe, wenn das Sichtvolumen in orthografischer Projektion ist. |
| [getParentNode()](#getParentNode--) | Liefert den ersten übergeordneten Knoten; wenn der erste übergeordnete Knoten gesetzt wird, wird diese Entität von anderen übergeordneten Knoten getrennt. |
| [getParentNodes()](#getParentNodes--) | Liefert alle übergeordneten Knoten; eine Entität kann für Geometrie-Instanzierung an mehrere übergeordnete Knoten angehängt werden |
| [getProperties()](#getProperties--) | Liefert die Sammlung aller Eigenschaften. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Liefere den Wert der angegebenen Eigenschaft |
| [getQuadraticAttenuation()](#getQuadraticAttenuation--) | Ermittelt die quadratische Dämpfung zur Berechnung der Gesamtdämpfung des Lichts |
| [getRotationMode()](#getRotationMode--) | Ermittelt den Orientierungsmodus des Sichtvolumens. Diese Eigenschaft funktioniert nur, wenn [getTarget](../../com.aspose.threed/frustum\#getTarget) null ist. |
| [getScene()](#getScene--) | Liefert die Szene, zu der dieses Objekt gehört |
| [getShadowColor()](#getShadowColor--) | Ermittelt die Farbe des Schattens. |
| [getTarget()](#getTarget--) | Ermittelt das Ziel, auf das die Kamera blickt. |
| [getUp()](#getUp--) | Ermittelt die Aufwärtsrichtung der Kamera |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Entfernt eine dynamische Eigenschaft. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Entferne die angegebene Eigenschaft, die durch ihren Namen identifiziert wird |
| [setAspect(double value)](#setAspect-double-) | Setzt das Seitenverhältnis des Sichtvolumens |
| [setCastLight(boolean value)](#setCastLight-boolean-) | Legt fest, ob die aktuelle Lichtinstanz andere Objekte beleuchten kann. |
| [setCastShadows(boolean value)](#setCastShadows-boolean-) | Legt fest, ob das Licht Schatten auf andere Objekte werfen kann |
| [setColor(Vector3 value)](#setColor-com.aspose.threed.Vector3-) | Setzt die Farbe des Lichts |
| [setConstantAttenuation(double value)](#setConstantAttenuation-double-) | Setzt die konstante Dämpfung zur Berechnung der Gesamtdämpfung des Lichts |
| [setDirection(Vector3 value)](#setDirection-com.aspose.threed.Vector3-) | Setzt die Richtung, in die die Kamera blickt. |
| [setExcluded(boolean value)](#setExcluded-boolean-) | Legt fest, ob diese Entität beim Exportieren ausgeschlossen werden soll. |
| [setFalloff(double value)](#setFalloff-double-) | Setzt den Abfallwinkel des Kegels (in Grad). |
| [setFarPlane(double value)](#setFarPlane-double-) | Setzt den Abstand der Fernebene des Sichtvolumens. |
| [setHotSpot(double value)](#setHotSpot-double-) | Setzt den Hot‑Spot‑Kegelwinkel (in Grad). |
| [setIntensity(double value)](#setIntensity-double-) | Setzt die Lichtintensität, Standardwert ist 100 |
| [setLightType(LightType value)](#setLightType-com.aspose.threed.LightType-) | Setzt den Lichttyp |
| [setLinearAttenuation(double value)](#setLinearAttenuation-double-) | Setzt die lineare Dämpfung zur Berechnung der Gesamtdämpfung des Lichts |
| [setLookAt(Vector3 value)](#setLookAt-com.aspose.threed.Vector3-) | Setzt die interessierte Position, auf die die Kamera blickt. |
| [setName(String value)](#setName-java.lang.String-) | Setzt den Namen. |
| [setNearPlane(double value)](#setNearPlane-double-) | Legt den Abstand der nahen Ebene des Frustums fest. |
| [setOrthoHeight(double value)](#setOrthoHeight-double-) | Legt die Höhe fest, wenn das Frustum in orthografischer Projektion ist. |
| [setParentNode(Node value)](#setParentNode-com.aspose.threed.Node-) | Setzt den ersten übergeordneten Knoten; wenn der erste übergeordnete Knoten gesetzt wird, wird diese Entität von anderen übergeordneten Knoten getrennt. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Setzt den Wert der angegebenen Eigenschaft |
| [setQuadraticAttenuation(double value)](#setQuadraticAttenuation-double-) | Legt die quadratische Dämpfung fest, um die Gesamtdämpfung des Lichts zu berechnen |
| [setRotationMode(RotationMode value)](#setRotationMode-com.aspose.threed.RotationMode-) | Legt den Orientierungsmodus des Frustums fest. Diese Eigenschaft funktioniert nur, wenn [getTarget](../../com.aspose.threed/frustum\#getTarget) null ist. |
| [setShadowColor(Vector3 value)](#setShadowColor-com.aspose.threed.Vector3-) | Legt die Farbe des Schattens fest. |
| [setTarget(Node value)](#setTarget-com.aspose.threed.Node-) | Legt das Ziel fest, auf das die Kamera blickt. |
| [setUp(Vector3 value)](#setUp-com.aspose.threed.Vector3-) | Legt die Aufwärtsrichtung der Kamera fest |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Light() {#Light--}
```
public Light()
```


Initialisiert eine neue Instanz der [Light](../../com.aspose.threed/light)-Klasse.

### Light(String name) {#Light-java.lang.String-}
```
public Light(String name)
```


Initialisiert eine neue Instanz der [Light](../../com.aspose.threed/light)-Klasse.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Name |

### Light(String name, LightType type) {#Light-java.lang.String-com.aspose.threed.LightType-}
```
public Light(String name, LightType type)
```


Initialisiert eine neue Instanz der [Light](../../com.aspose.threed/light)-Klasse.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Name |
| type | [LightType](../../com.aspose.threed/lighttype) | Neuer Lichttyp |

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
### getAspect() {#getAspect--}
```
public double getAspect()
```


Liefert das Seitenverhältnis des Frustums

**Returns:**
double - das Seitenverhältnis des Frustums
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
### getCastLight() {#getCastLight--}
```
public boolean getCastLight()
```


Liefert, ob die aktuelle Lichtinstanz andere Objekte beleuchten kann.

**Returns:**
boolean - ob die aktuelle Lichtinstanz andere Objekte beleuchten kann.
### getCastShadows() {#getCastShadows--}
```
public boolean getCastShadows()
```


Liefert, ob das Licht Schatten auf andere Objekte werfen kann.

**Returns:**
boolean - ob das Licht Schatten auf andere Objekte werfen kann.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getColor() {#getColor--}
```
public Vector3 getColor()
```


Liefert die Farbe des Lichts

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - the light's color
### getConstantAttenuation() {#getConstantAttenuation--}
```
public double getConstantAttenuation()
```


Liefert die konstante Dämpfung zur Berechnung der Gesamtdämpfung des Lichts

**Returns:**
double - die konstante Dämpfung zur Berechnung der Gesamtdämpfung des Lichts
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
### getFalloff() {#getFalloff--}
```
public double getFalloff()
```


Liefert den Abfallkegelwinkel (in Grad).

**Returns:**
double - der Abfallkegelwinkel (in Grad).
### getFarPlane() {#getFarPlane--}
```
public double getFarPlane()
```


Liefert die Entfernung der fernen Ebene des Frustums.

**Returns:**
double - der Abstand der fernen Ebene des Frustums.
### getHotSpot() {#getHotSpot--}
```
public double getHotSpot()
```


Ermittelt den Hot‑Spot‑Kegelwinkel (in Grad).

**Returns:**
double - der Hot-Spot-Kegelwinkel (in Grad).
### getIntensity() {#getIntensity--}
```
public double getIntensity()
```


Ermittelt die Lichtintensität, Standardwert ist 100

**Returns:**
double - die Lichtintensität, Standardwert ist 100
### getLightType() {#getLightType--}
```
public LightType getLightType()
```


Ermittelt den Lichttyp

**Returns:**
[LightType](../../com.aspose.threed/lighttype) - the light's type
### getLinearAttenuation() {#getLinearAttenuation--}
```
public double getLinearAttenuation()
```


Ermittelt die lineare Dämpfung zur Berechnung der Gesamtdämpfung des Lichts

**Returns:**
double - die lineare Dämpfung zur Berechnung der Gesamtdämpfung des Lichts
### getLookAt() {#getLookAt--}
```
public Vector3 getLookAt()
```


Ermittelt die interessierte Position, auf die die Kamera blickt.

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - the the interested position that the camera is looking at.
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
### getQuadraticAttenuation() {#getQuadraticAttenuation--}
```
public double getQuadraticAttenuation()
```


Ermittelt die quadratische Dämpfung zur Berechnung der Gesamtdämpfung des Lichts

**Returns:**
double - die quadratische Dämpfung zur Berechnung der Gesamtdämpfung des Lichts
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
### getShadowColor() {#getShadowColor--}
```
public Vector3 getShadowColor()
```


Ermittelt die Farbe des Schattens.

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - the shadow's color.
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
### setAspect(double value) {#setAspect-double-}
```
public void setAspect(double value)
```


Setzt das Seitenverhältnis des Sichtvolumens

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

### setCastLight(boolean value) {#setCastLight-boolean-}
```
public void setCastLight(boolean value)
```


Legt fest, ob die aktuelle Lichtinstanz andere Objekte beleuchten kann.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### setCastShadows(boolean value) {#setCastShadows-boolean-}
```
public void setCastShadows(boolean value)
```


Legt fest, ob das Licht Schatten auf andere Objekte werfen kann

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### setColor(Vector3 value) {#setColor-com.aspose.threed.Vector3-}
```
public void setColor(Vector3 value)
```


Setzt die Farbe des Lichts

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | Neuer Wert |

### setConstantAttenuation(double value) {#setConstantAttenuation-double-}
```
public void setConstantAttenuation(double value)
```


Setzt die konstante Dämpfung zur Berechnung der Gesamtdämpfung des Lichts

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

### setFalloff(double value) {#setFalloff-double-}
```
public void setFalloff(double value)
```


Setzt den Abfallwinkel des Kegels (in Grad).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

### setFarPlane(double value) {#setFarPlane-double-}
```
public void setFarPlane(double value)
```


Setzt den Abstand der Fernebene des Sichtvolumens.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

### setHotSpot(double value) {#setHotSpot-double-}
```
public void setHotSpot(double value)
```


Setzt den Hot‑Spot‑Kegelwinkel (in Grad).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

### setIntensity(double value) {#setIntensity-double-}
```
public void setIntensity(double value)
```


Setzt die Lichtintensität, Standardwert ist 100

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

### setLightType(LightType value) {#setLightType-com.aspose.threed.LightType-}
```
public void setLightType(LightType value)
```


Setzt den Lichttyp

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [LightType](../../com.aspose.threed/lighttype) | Neuer Wert |

### setLinearAttenuation(double value) {#setLinearAttenuation-double-}
```
public void setLinearAttenuation(double value)
```


Setzt die lineare Dämpfung zur Berechnung der Gesamtdämpfung des Lichts

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

### setQuadraticAttenuation(double value) {#setQuadraticAttenuation-double-}
```
public void setQuadraticAttenuation(double value)
```


Legt die quadratische Dämpfung fest, um die Gesamtdämpfung des Lichts zu berechnen

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

### setRotationMode(RotationMode value) {#setRotationMode-com.aspose.threed.RotationMode-}
```
public void setRotationMode(RotationMode value)
```


Legt den Orientierungsmodus des Frustums fest. Diese Eigenschaft funktioniert nur, wenn [getTarget](../../com.aspose.threed/frustum\#getTarget) null ist. Wenn der Wert [RotationMode.FIXED\_TARGET](../../com.aspose.threed/rotationmode\#FIXED-TARGET) ist, wird die Richtung stets über die Eigenschaft [getLookAt](../../com.aspose.threed/frustum\#getLookAt) berechnet. Andernfalls wird [getLookAt](../../com.aspose.threed/frustum\#getLookAt) stets über [getDirection](../../com.aspose.threed/frustum\#getDirection) berechnet.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [RotationMode](../../com.aspose.threed/rotationmode) | Neuer Wert |

### setShadowColor(Vector3 value) {#setShadowColor-com.aspose.threed.Vector3-}
```
public void setShadowColor(Vector3 value)
```


Legt die Farbe des Schattens fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | Neuer Wert |

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

