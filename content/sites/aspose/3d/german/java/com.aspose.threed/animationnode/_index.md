---
title: AnimationNode
second_title: Aspose.3D für Java API-Referenz
description: Aspose.3Ds unterstützt eine Animationshierarchie, jede Animation kann aus mehreren Animationen und der Schlüsselbilddefinition von Animationen zusammengesetzt werden.
type: docs
weight: 15
url: /de/java/com.aspose.threed/animationnode/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject)
```
public class AnimationNode extends A3DObject
```

Aspose.3D unterstützt eine Animationshierarchie, jede Animation kann aus mehreren Animationen und der Schlüsselbilddefinition einer Animation zusammengesetzt werden. [AnimationNode](../../com.aspose.threed/animationnode) definiert die Transformation eines Eigenschaftswerts über die Zeit, zum Beispiel kann ein Animationsknoten verwendet werden, um die Transformation eines Knotens oder andere numerische Eigenschaften eines [A3DObject](../../com.aspose.threed/a3dobject) Objekts zu steuern.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [AnimationNode(String name)](#AnimationNode-java.lang.String-) | Initialisiert eine neue Instanz der Klasse [AnimationNode](../../com.aspose.threed/animationnode). |
| [AnimationNode()](#AnimationNode--) | Initialisiert eine neue Instanz der Klasse [AnimationNode](../../com.aspose.threed/animationnode). |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [createBindPoint(A3DObject obj, String propName)](#createBindPoint-com.aspose.threed.A3DObject-java.lang.String-) | Erstellt einen BindPoint basierend auf dem Datentyp der Eigenschaft. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findBindPoint(A3DObject target, String name)](#findBindPoint-com.aspose.threed.A3DObject-java.lang.String-) | Findet den Bindungspunkt nach Ziel und Name. |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Findet die Eigenschaft. |
| [getBindPoint(A3DObject target, String propName, boolean create)](#getBindPoint-com.aspose.threed.A3DObject-java.lang.String-boolean-) | Gibt den Animations-Bindungspunkt für die angegebene Eigenschaft zurück. |
| [getBindPoints()](#getBindPoints--) | Liest die aktuellen Eigenschafts-Bindungspunkte |
| [getClass()](#getClass--) |  |
| [getKeyframeSequence(A3DObject target, String propName, boolean create)](#getKeyframeSequence-com.aspose.threed.A3DObject-java.lang.String-boolean-) | Gibt die Keyframe-Sequenz für die angegebene Eigenschaft zurück. |
| [getKeyframeSequence(A3DObject target, String propName, String channelName, boolean create)](#getKeyframeSequence-com.aspose.threed.A3DObject-java.lang.String-java.lang.String-boolean-) | Ruft die Keyframe‑Sequenz für die angegebene Eigenschaft und den Kanal ab. |
| [getName()](#getName--) | Liefert den Namen. |
| [getProperties()](#getProperties--) | Liefert die Sammlung aller Eigenschaften. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Liefere den Wert der angegebenen Eigenschaft |
| [getSubAnimations()](#getSubAnimations--) | Ruft die Unteranimationsknoten unter den aktuellen Animationen ab. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Entfernt eine dynamische Eigenschaft. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Entferne die angegebene Eigenschaft, die durch ihren Namen identifiziert wird |
| [setName(String value)](#setName-java.lang.String-) | Setzt den Namen. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Setzt den Wert der angegebenen Eigenschaft |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### AnimationNode(String name) {#AnimationNode-java.lang.String-}
```
public AnimationNode(String name)
```


Initialisiert eine neue Instanz der Klasse [AnimationNode](../../com.aspose.threed/animationnode).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Name |

### AnimationNode() {#AnimationNode--}
```
public AnimationNode()
```


Initialisiert eine neue Instanz der Klasse [AnimationNode](../../com.aspose.threed/animationnode).

### createBindPoint(A3DObject obj, String propName) {#createBindPoint-com.aspose.threed.A3DObject-java.lang.String-}
```
public BindPoint createBindPoint(A3DObject obj, String propName)
```


Erstellt einen BindPoint basierend auf dem Datentyp der Eigenschaft.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | [A3DObject](../../com.aspose.threed/a3dobject) | Objekt. |
| propName | java.lang.String | Eigenschaftsname. |

**Returns:**
[BindPoint](../../com.aspose.threed/bindpoint) - The bind point instance or null if the property is not defined.
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
### findBindPoint(A3DObject target, String name) {#findBindPoint-com.aspose.threed.A3DObject-java.lang.String-}
```
public BindPoint findBindPoint(A3DObject target, String name)
```


Findet den Bindungspunkt nach Ziel und Name.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| target | [A3DObject](../../com.aspose.threed/a3dobject) | Ziel des Bindungspunkts zum Finden. |
| Name | java.lang.String | Name des Bindungspunkts zum Finden. |

**Returns:**
[BindPoint](../../com.aspose.threed/bindpoint) - The bind point.
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
### getBindPoint(A3DObject target, String propName, boolean create) {#getBindPoint-com.aspose.threed.A3DObject-java.lang.String-boolean-}
```
public BindPoint getBindPoint(A3DObject target, String propName, boolean create)
```


Gibt den Animations-Bindungspunkt für die angegebene Eigenschaft zurück.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| target | [A3DObject](../../com.aspose.threed/a3dobject) | Auf welchem Objekt der Bindungspunkt erstellt werden soll. |
| propName | java.lang.String | Der Name der Eigenschaft. |
| erstellen | boolean | Wenn auf  true  gesetzt, den Bindungspunkt erstellen, falls er nicht existiert. |

**Returns:**
[BindPoint](../../com.aspose.threed/bindpoint) - The bind point.
### getBindPoints() {#getBindPoints--}
```
public List<BindPoint> getBindPoints()
```


Liest die aktuellen Eigenschafts-Bindungspunkte

**Returns:**
java.util.List<com.aspose.threed.BindPoint> - die aktuellen Bindungspunkte der Eigenschaft
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getKeyframeSequence(A3DObject target, String propName, boolean create) {#getKeyframeSequence-com.aspose.threed.A3DObject-java.lang.String-boolean-}
```
public KeyframeSequence getKeyframeSequence(A3DObject target, String propName, boolean create)
```


Gibt die Keyframe-Sequenz für die angegebene Eigenschaft zurück.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| target | [A3DObject](../../com.aspose.threed/a3dobject) | Bei welcher Instanz die Keyframe‑Sequenz erstellt werden soll. |
| propName | java.lang.String | Der Name der Eigenschaft. |
| erstellen | boolean | Wenn auf  true , gesetzt, die Sequenz erstellen, falls sie nicht existiert. |

**Returns:**
[KeyframeSequence](../../com.aspose.threed/keyframesequence) - The keyframe sequence.
### getKeyframeSequence(A3DObject target, String propName, String channelName, boolean create) {#getKeyframeSequence-com.aspose.threed.A3DObject-java.lang.String-java.lang.String-boolean-}
```
public KeyframeSequence getKeyframeSequence(A3DObject target, String propName, String channelName, boolean create)
```


Ruft die Keyframe‑Sequenz für die angegebene Eigenschaft und den Kanal ab.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| target | [A3DObject](../../com.aspose.threed/a3dobject) | Bei welcher Instanz die Keyframe‑Sequenz erstellt werden soll. |
| propName | java.lang.String | Der Name der Eigenschaft. |
| channelName | java.lang.String | Der Kanalname. |
| erstellen | boolean | Wenn auf  true  gesetzt, die Animationssequenz erstellen, falls sie nicht existiert. |

**Returns:**
[KeyframeSequence](../../com.aspose.threed/keyframesequence) - The keyframe sequence.
### getName() {#getName--}
```
public String getName()
```


Liefert den Namen.

**Returns:**
java.lang.String - der Name.
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
### getSubAnimations() {#getSubAnimations--}
```
public List<AnimationNode> getSubAnimations()
```


Ruft die Unteranimationsknoten unter den aktuellen Animationen ab.

**Returns:**
java.util.List<com.aspose.threed.AnimationNode> - die Unteranimationsknoten unter den aktuellen Animationen
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

