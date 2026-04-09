---
title: KeyframeSequence
second_title: Aspose.3D für Java API-Referenz
description: Die Sequenz von Keyframes beschreibt die Transformation eines abgetasteten Wertes über die Zeit.
type: docs
weight: 90
url: /de/java/com.aspose.threed/keyframesequence/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject)

**All Implemented Interfaces:**
java.lang.Iterable
```
public class KeyframeSequence extends A3DObject implements Iterable<KeyFrame>
```

Die Sequenz von Schlüsselbildern beschreibt die Transformation eines abgetasteten Wertes über die Zeit.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [KeyframeSequence(String name)](#KeyframeSequence-java.lang.String-) | Initialisiert eine neue Instanz der Klasse [KeyframeSequence](../../com.aspose.threed/keyframesequence). |
| [KeyframeSequence()](#KeyframeSequence--) | Initialisiert eine neue Instanz der Klasse [KeyframeSequence](../../com.aspose.threed/keyframesequence). |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [add(double time, float value)](#add-double-float-) | Erstelle einen neuen Keyframe mit angegebenem Wert |
| [add(double time, float value, Interpolation interpolation)](#add-double-float-com.aspose.threed.Interpolation-) | Erstelle einen neuen Keyframe mit angegebenem Wert |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Findet die Eigenschaft. |
| [getBindPoint()](#getBindPoint--) | Gibt den Property-Bind-Punkt zurück, der diese Kurve besitzt |
| [getClass()](#getClass--) |  |
| [getKeyFrames()](#getKeyFrames--) | Gibt die Keyframes dieser Kurve zurück. |
| [getName()](#getName--) | Liefert den Namen. |
| [getPostBehavior()](#getPostBehavior--) | Gibt das Post‑Verhalten zurück, das angibt, welchen abgetasteten Wert es nach dem letzten Keyframe haben soll. |
| [getPreBehavior()](#getPreBehavior--) | Gibt das Pre‑Verhalten zurück, das angibt, welchen abgetasteten Wert es vor dem ersten Keyframe haben soll. |
| [getProperties()](#getProperties--) | Liefert die Sammlung aller Eigenschaften. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Liefere den Wert der angegebenen Eigenschaft |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Gibt den Enumerator zurück, um alle Keyframes zu durchlaufen. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Entfernt eine dynamische Eigenschaft. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Entferne die angegebene Eigenschaft, die durch ihren Namen identifiziert wird |
| [reset()](#reset--) | Entfernt alle Keyframes und setzt das Post-/Pre‑Verhalten zurück. |
| [setName(String value)](#setName-java.lang.String-) | Setzt den Namen. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Setzt den Wert der angegebenen Eigenschaft |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### KeyframeSequence(String name) {#KeyframeSequence-java.lang.String-}
```
public KeyframeSequence(String name)
```


Initialisiert eine neue Instanz der Klasse [KeyframeSequence](../../com.aspose.threed/keyframesequence).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Name |

### KeyframeSequence() {#KeyframeSequence--}
```
public KeyframeSequence()
```


Initialisiert eine neue Instanz der Klasse [KeyframeSequence](../../com.aspose.threed/keyframesequence).

### add(double time, float value) {#add-double-float-}
```
public void add(double time, float value)
```


Erstelle einen neuen Keyframe mit angegebenem Wert

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Zeit | double | Zeitposition (gemessen in Sekunden) |
| Wert | float | Der Wert an dieser Zeitposition |

### add(double time, float value, Interpolation interpolation) {#add-double-float-com.aspose.threed.Interpolation-}
```
public void add(double time, float value, Interpolation interpolation)
```


Erstelle einen neuen Keyframe mit angegebenem Wert

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Zeit | double | Zeitposition (gemessen in Sekunden) |
| Wert | float | Der Wert an dieser Zeitposition |
| interpolation | [Interpolation](../../com.aspose.threed/interpolation) | Der Interpolationstyp dieses Keyframes |

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
### getBindPoint() {#getBindPoint--}
```
public BindPoint getBindPoint()
```


Gibt den Property-Bind-Punkt zurück, der diese Kurve besitzt

**Returns:**
[BindPoint](../../com.aspose.threed/bindpoint) - the property bind point which owns this curve
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getKeyFrames() {#getKeyFrames--}
```
public List<KeyFrame> getKeyFrames()
```


Gibt die Keyframes dieser Kurve zurück.

**Returns:**
java.util.List<com.aspose.threed.KeyFrame> - die Keyframes dieser Kurve.
### getName() {#getName--}
```
public String getName()
```


Liefert den Namen.

**Returns:**
java.lang.String - der Name.
### getPostBehavior() {#getPostBehavior--}
```
public Extrapolation getPostBehavior()
```


Gibt das Post‑Verhalten zurück, das angibt, welchen abgetasteten Wert es nach dem letzten Keyframe haben soll.

**Returns:**
[Extrapolation](../../com.aspose.threed/extrapolation) - the post behavior indicates what the sampled value should be after the last key frame.
### getPreBehavior() {#getPreBehavior--}
```
public Extrapolation getPreBehavior()
```


Gibt das Pre‑Verhalten zurück, das angibt, welchen abgetasteten Wert es vor dem ersten Keyframe haben soll.

**Returns:**
[Extrapolation](../../com.aspose.threed/extrapolation) - the pre behavior indicates what the sampled value should be before the first key.
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
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### iterator() {#iterator--}
```
public Iterator<KeyFrame> iterator()
```


Gibt den Enumerator zurück, um alle Keyframes zu durchlaufen.

**Returns:**
java.util.Iterator<com.aspose.threed.KeyFrame>
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
### reset() {#reset--}
```
public void reset()
```


Entfernt alle Keyframes und setzt das Post-/Pre‑Verhalten zurück.

### setName(String value) {#setName-java.lang.String-}
```
public void setName(String value)
```


Setzt den Namen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert |

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

