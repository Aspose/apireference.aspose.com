---
title: NurbsCurve
second_title: Aspose.3D für Java API-Referenz
description: NURBS-Kurve ist eine Kurve, die durch NURBS (Non-uniform rational basis spline) dargestellt wird. Eine NURBS-Kurve wird durch ihr einen Satz gewichteter Punkte und ein weiteres Attribut definiert. Die w‑Komponente im Kontrollpunkt wird als Gewicht des Kontrollpunkts verwendet, egal ob es ein ... oder ... ist.
type: docs
weight: 112
url: /de/java/com.aspose.threed/nurbscurve/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Curve](../../com.aspose.threed/curve)
```
public class NurbsCurve extends Curve
```

[NURBS curve][] is a curve represented by NURBS(Non-uniform rational basis spline), A NURBS curve is defined by its [getOrder](../../com.aspose.threed/nurbscurve\#getOrder), a set of weighted [Geometry.getControlPoints](../../com.aspose.threed/geometry\#getControlPoints) and a [getKnotVectors](../../com.aspose.threed/nurbscurve\#getKnotVectors) The w component in control point is used as control point's weight, whatever it is a [CurveDimension.TWO\_DIMENSIONAL](../../com.aspose.threed/curvedimension\#TWO-DIMENSIONAL) or [CurveDimension.THREE\_DIMENSIONAL](../../com.aspose.threed/curvedimension\#THREE-DIMENSIONAL)


[NURBS curve]: https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [NurbsCurve()](#NurbsCurve--) | Initialisiert eine neue Instanz der Klasse [NurbsCurve](../../com.aspose.threed/nurbscurve). |
| [NurbsCurve(String name)](#NurbsCurve-java.lang.String-) | Initialisiert eine neue Instanz der Klasse [NurbsCurve](../../com.aspose.threed/nurbscurve). |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [evaluate()](#evaluate--) | Evaluiert die NURBS-Kurve |
| [evaluate(int steps)](#evaluate-int-) | Evaluiert die NURBS-Kurve |
| [evaluateAt(double u)](#evaluateAt-double-) | Evaluiert den Punkt der Kurve an der angegebenen Position |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Findet die Eigenschaft. |
| [getBoundingBox()](#getBoundingBox--) | Liefert die Begrenzungsbox der aktuellen Entität in ihrem Objekt-Raum-Koordinatensystem. |
| [getClass()](#getClass--) |  |
| [getColor()](#getColor--) | Ruft die Farbe der Linie ab, Standardwert ist weiß(1, 1, 1) |
| [getControlPoints()](#getControlPoints--) | Ermittelt alle Kontrollpunkte |
| [getCurveType()](#getCurveType--) | Ruft den Typ der Kurve ab. |
| [getDegree()](#getDegree--) | Ruft den Grad einer NURBS-Kurve ab, der Grad ist definiert als Ordnung - 1 |
| [getDimension()](#getDimension--) | Ruft die Dimension der Kurve ab. |
| [getEntityRendererKey()](#getEntityRendererKey--) | Liefert den Schlüssel des Entitäts-Renderers, der im Renderer registriert ist |
| [getExcluded()](#getExcluded--) | Liefert, ob diese Entität beim Exportieren ausgeschlossen werden soll. |
| [getKnotVectors()](#getKnotVectors--) | Ruft den Knotenvektor ab, er ist eine Sequenz von Parameterwerten, die bestimmen, wo und wie die Kontrollpunkte die NURBS-Kurve beeinflussen. |
| [getMultiplicity()](#getMultiplicity--) | Ruft die Multiplizität ab. |
| [getName()](#getName--) | Liefert den Namen. |
| [getOrder()](#getOrder--) | Ruft die Ordnung einer NURBS-Kurve ab, sie definiert die Anzahl benachbarter Kontrollpunkte, die einen beliebigen Punkt auf der Kurve beeinflussen. |
| [getParentNode()](#getParentNode--) | Liefert den ersten übergeordneten Knoten; wenn der erste übergeordnete Knoten gesetzt wird, wird diese Entität von anderen übergeordneten Knoten getrennt. |
| [getParentNodes()](#getParentNodes--) | Liefert alle übergeordneten Knoten; eine Entität kann für Geometrie-Instanzierung an mehrere übergeordnete Knoten angehängt werden |
| [getProperties()](#getProperties--) | Liefert die Sammlung aller Eigenschaften. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Liefere den Wert der angegebenen Eigenschaft |
| [getRational()](#getRational--) | Ruft ab, ob sie rational ist, dieser Wert gibt an, ob diese [NurbsCurve](../../com.aspose.threed/nurbscurve) ein rationaler Spline oder ein nicht-rationaler Spline ist. |
| [getScene()](#getScene--) | Liefert die Szene, zu der dieses Objekt gehört |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Entfernt eine dynamische Eigenschaft. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Entferne die angegebene Eigenschaft, die durch ihren Namen identifiziert wird |
| [setColor(Vector3 value)](#setColor-com.aspose.threed.Vector3-) | Setzt die Farbe der Linie, Standardwert ist weiß(1, 1, 1) |
| [setCurveType(NurbsType value)](#setCurveType-com.aspose.threed.NurbsType-) | Setzt den Typ der Kurve. |
| [setDegree(int value)](#setDegree-int-) | Setzt den Grad einer NURBS-Kurve, der Grad ist definiert als Ordnung - 1 |
| [setDimension(CurveDimension value)](#setDimension-com.aspose.threed.CurveDimension-) | Setzt die Dimension der Kurve. |
| [setExcluded(boolean value)](#setExcluded-boolean-) | Legt fest, ob diese Entität beim Exportieren ausgeschlossen werden soll. |
| [setName(String value)](#setName-java.lang.String-) | Setzt den Namen. |
| [setOrder(int value)](#setOrder-int-) | Setzt die Ordnung einer NURBS-Kurve, sie definiert die Anzahl benachbarter Kontrollpunkte, die einen beliebigen Punkt auf der Kurve beeinflussen. |
| [setParentNode(Node value)](#setParentNode-com.aspose.threed.Node-) | Setzt den ersten übergeordneten Knoten; wenn der erste übergeordnete Knoten gesetzt wird, wird diese Entität von anderen übergeordneten Knoten getrennt. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Setzt den Wert der angegebenen Eigenschaft |
| [setRational(boolean value)](#setRational-boolean-) | Setzt, ob sie rational ist, dieser Wert gibt an, ob diese [NurbsCurve](../../com.aspose.threed/nurbscurve) ein rationaler Spline oder ein nicht-rationaler Spline ist. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### NurbsCurve() {#NurbsCurve--}
```
public NurbsCurve()
```


Initialisiert eine neue Instanz der Klasse [NurbsCurve](../../com.aspose.threed/nurbscurve).

### NurbsCurve(String name) {#NurbsCurve-java.lang.String-}
```
public NurbsCurve(String name)
```


Initialisiert eine neue Instanz der Klasse [NurbsCurve](../../com.aspose.threed/nurbscurve).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Name |

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
### evaluate() {#evaluate--}
```
public Vector4[] evaluate()
```


Evaluiert die NURBS-Kurve

**Returns:**
com.aspose.threed.Vector4[] - Punkte in der Kurve
### evaluate(int steps) {#evaluate-int-}
```
public Vector4[] evaluate(int steps)
```


Evaluiert die NURBS-Kurve

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Schritte | int | Die Auswertungsfrequenz zwischen zwei benachbarten Knoten, Standardwert ist 20 |

**Returns:**
com.aspose.threed.Vector4[] - Punkte in der Kurve
### evaluateAt(double u) {#evaluateAt-double-}
```
public Vector4 evaluateAt(double u)
```


Evaluiert den Punkt der Kurve an der angegebenen Position

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| u | double | Die Position in der Kurve, zwischen 0 und 1 |

**Returns:**
[Vector4](../../com.aspose.threed/vector4)
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


Ruft die Farbe der Linie ab, Standardwert ist weiß(1, 1, 1)

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - the color of the line, default value is white(1, 1, 1)
### getControlPoints() {#getControlPoints--}
```
public List<Vector4> getControlPoints()
```


Ermittelt alle Kontrollpunkte

**Returns:**
java.util.List<com.aspose.threed.Vector4> - alle Kontrollpunkte
### getCurveType() {#getCurveType--}
```
public NurbsType getCurveType()
```


Ruft den Typ der Kurve ab.

**Returns:**
[NurbsType](../../com.aspose.threed/nurbstype) - the type of the curve.
### getDegree() {#getDegree--}
```
public int getDegree()
```


Ruft den Grad einer NURBS-Kurve ab, der Grad ist definiert als Ordnung - 1

**Returns:**
int - der Grad einer NURBS-Kurve, der Grad ist definiert als Ordnung - 1
### getDimension() {#getDimension--}
```
public CurveDimension getDimension()
```


Ruft die Dimension der Kurve ab.

**Returns:**
[CurveDimension](../../com.aspose.threed/curvedimension) - the curve's dimension. **Remarks:** For a [CurveDimension.TWO\_DIMENSIONAL](../../com.aspose.threed/curvedimension\#TWO-DIMENSIONAL) curve, the z component in control point is unused.
### getEntityRendererKey() {#getEntityRendererKey--}
```
public EntityRendererKey getEntityRendererKey()
```


Liefert den Schlüssel des Entitäts-Renderers, der im Renderer registriert ist

**Returns:**
[EntityRendererKey](../../com.aspose.threed/entityrendererkey)
### getExcluded() {#getExcluded--}
```
public boolean getExcluded()
```


Liefert, ob diese Entität beim Exportieren ausgeschlossen werden soll.

**Returns:**
boolescher Wert – ob diese Entität beim Exportieren ausgeschlossen werden soll.
### getKnotVectors() {#getKnotVectors--}
```
public List<Double> getKnotVectors()
```


Ruft den Knotenvektor ab, er ist eine Sequenz von Parameterwerten, die bestimmen, wo und wie die Kontrollpunkte die NURBS-Kurve beeinflussen.

**Returns:**
java.util.List<java.lang.Double> - der Knotenvektor, er ist eine Sequenz von Parameterwerten, die bestimmen, wo und wie die Kontrollpunkte die NURBS-Kurve beeinflussen.
### getMultiplicity() {#getMultiplicity--}
```
public List<Integer> getMultiplicity()
```


Ruft die Multiplizität ab.

**Returns:**
java.util.List<java.lang.Integer> – die Multiplizität.
### getName() {#getName--}
```
public String getName()
```


Liefert den Namen.

**Returns:**
java.lang.String - der Name.
### getOrder() {#getOrder--}
```
public int getOrder()
```


Ruft die Ordnung einer NURBS-Kurve ab, sie definiert die Anzahl benachbarter Kontrollpunkte, die einen beliebigen Punkt auf der Kurve beeinflussen.

**Returns:**
int – die Ordnung einer NURBS-Kurve, sie definiert die Anzahl benachbarter Kontrollpunkte, die jeden Punkt der Kurve beeinflussen.
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
### getRational() {#getRational--}
```
public boolean getRational()
```


Ermittelt, ob sie rational ist; dieser Wert gibt an, ob diese [NurbsCurve](../../com.aspose.threed/nurbscurve) ein rationaler Spline oder ein nicht-rationaler Spline ist. Nicht-rationaler B-Spline ist ein Spezialfall von rationalen B-Splines.

**Returns:**
boolean – ob sie rational ist; dieser Wert gibt an, ob diese [NurbsCurve](../../com.aspose.threed/nurbscurve) ein rationaler Spline oder ein nicht-rationaler Spline ist. Nicht-rationaler B-Spline ist ein Spezialfall von rationalen B-Splines.
### getScene() {#getScene--}
```
public Scene getScene()
```


Liefert die Szene, zu der dieses Objekt gehört

**Returns:**
[Scene](../../com.aspose.threed/scene) - the scene that this object belongs to
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
### setColor(Vector3 value) {#setColor-com.aspose.threed.Vector3-}
```
public void setColor(Vector3 value)
```


Setzt die Farbe der Linie, Standardwert ist weiß(1, 1, 1)

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | Neuer Wert |

### setCurveType(NurbsType value) {#setCurveType-com.aspose.threed.NurbsType-}
```
public void setCurveType(NurbsType value)
```


Setzt den Typ der Kurve.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [NurbsType](../../com.aspose.threed/nurbstype) | Neuer Wert |

### setDegree(int value) {#setDegree-int-}
```
public void setDegree(int value)
```


Setzt den Grad einer NURBS-Kurve, der Grad ist definiert als Ordnung - 1

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Neuer Wert |

### setDimension(CurveDimension value) {#setDimension-com.aspose.threed.CurveDimension-}
```
public void setDimension(CurveDimension value)
```


Setzt die Dimension der Kurve.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [CurveDimension](../../com.aspose.threed/curvedimension) | Neuer Wert **Hinweise:** Für eine [CurveDimension.TWO\_DIMENSIONAL](../../com.aspose.threed/curvedimension\#TWO-DIMENSIONAL) Kurve wird die Z-Komponente im Kontrollpunkt nicht verwendet. |

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

### setOrder(int value) {#setOrder-int-}
```
public void setOrder(int value)
```


Setzt die Ordnung einer NURBS-Kurve, sie definiert die Anzahl benachbarter Kontrollpunkte, die einen beliebigen Punkt auf der Kurve beeinflussen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Neuer Wert |

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

### setRational(boolean value) {#setRational-boolean-}
```
public void setRational(boolean value)
```


Legt fest, ob sie rational ist; dieser Wert gibt an, ob diese [NurbsCurve](../../com.aspose.threed/nurbscurve) ein rationaler Spline oder ein nicht-rationaler Spline ist. Nicht-rationaler B-Spline ist ein Spezialfall von rationalen B-Splines.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

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

