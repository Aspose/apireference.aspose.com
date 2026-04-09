---
title: BindPoint
second_title: Aspose.3D für Java API-Referenz
description: Ein  wird normalerweise auf einer Objekteigenschaft erstellt; einige Eigenschaftstypen enthalten mehrere Komponentenfelder, wie ein Vector3-Feld, das für jedes Komponentenfeld einen Kanal erzeugt und das Feld über die Kanäle mit einer oder mehreren Keyframe‑Sequenzinstanz(en) verbindet.
type: docs
weight: 19
url: /de/java/com.aspose.threed/bindpoint/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject)
```
public class BindPoint extends A3DObject
```

Ein [BindPoint](../../com.aspose.threed/bindpoint) wird normalerweise auf einer Objekteigenschaft erstellt; einige Eigenschaftstypen enthalten mehrere Komponentenfelder (wie ein Vector3-Feld), [BindPoint](../../com.aspose.threed/bindpoint) erzeugt für jedes Komponentenfeld einen Kanal und verbindet das Feld über die Kanäle mit einer oder mehreren Keyframe‑Sequenzinstanz(en).
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [BindPoint(Scene scene, Property prop)](#BindPoint-com.aspose.threed.Scene-com.aspose.threed.Property-) | Initialisiert eine neue Instanz der Klasse [BindPoint](../../com.aspose.threed/bindpoint). |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [addChannel(String name, Class<?> type, Object value)](#addChannel-java.lang.String-java.lang.Class----java.lang.Object-) | Fügt die angegebene Kanal‑Eigenschaft hinzu. |
| [addChannel(String name, Object value)](#addChannel-java.lang.String-java.lang.Object-) | Fügt die angegebene Kanal‑Eigenschaft hinzu. |
| [bindKeyframeSequence(String channelName, KeyframeSequence sequence)](#bindKeyframeSequence-java.lang.String-com.aspose.threed.KeyframeSequence-) | Binde die Keyframe‑Sequenz an den angegebenen Kanal |
| [createKeyframeSequence(String name)](#createKeyframeSequence-java.lang.String-) | Erstellt eine neue Kurve und verbindet sie mit dem ersten Kanal der Kurvenzuordnung |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Findet die Eigenschaft. |
| [get(String channelName)](#get-java.lang.String-) | Liefert den Kanal mit dem angegebenen Namen |
| [getChannel(String channelName)](#getChannel-java.lang.String-) | Liefert den Kanal mit dem angegebenen Namen |
| [getChannelsCount()](#getChannelsCount--) | Liefert die Gesamtzahl der Eigenschaftskanäle, die in dieser Animationskurvenzuordnung definiert sind. |
| [getClass()](#getClass--) |  |
| [getKeyframeSequence(String channelName)](#getKeyframeSequence-java.lang.String-) | Liefert die erste Keyframe‑Sequenz im angegebenen Kanal |
| [getName()](#getName--) | Liefert den Namen. |
| [getProperties()](#getProperties--) | Liefert die Sammlung aller Eigenschaften. |
| [getProperty()](#getProperty--) | Liefert die mit der CurveMapping verknüpfte Eigenschaft |
| [getProperty(String property)](#getProperty-java.lang.String-) | Liefere den Wert der angegebenen Eigenschaft |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Entfernt eine dynamische Eigenschaft. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Entferne die angegebene Eigenschaft, die durch ihren Namen identifiziert wird |
| [resetChannels()](#resetChannels--) | Leert die Eigenschaftskanäle dieser Animationskurvenzuordnung. |
| [setName(String value)](#setName-java.lang.String-) | Setzt den Namen. |
| [setProperty(Property value)](#setProperty-com.aspose.threed.Property-) | Liefert die mit der CurveMapping verknüpfte Eigenschaft |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Setzt den Wert der angegebenen Eigenschaft |
| [toString()](#toString--) | Formatiert das Objekt in einen String |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### BindPoint(Scene scene, Property prop) {#BindPoint-com.aspose.threed.Scene-com.aspose.threed.Property-}
```
public BindPoint(Scene scene, Property prop)
```


Initialisiert eine neue Instanz der Klasse [BindPoint](../../com.aspose.threed/bindpoint).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| scene | [Scene](../../com.aspose.threed/scene) | Die Szene, die die Animation enthält. |
| prop | [Property](../../com.aspose.threed/property) | Eigenschaft. |

### addChannel(String name, Class<?> type, Object value) {#addChannel-java.lang.String-java.lang.Class----java.lang.Object-}
```
public boolean addChannel(String name, Class<?> type, Object value)
```


Fügt die angegebene Kanal‑Eigenschaft hinzu.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Name. |
| type | java.lang.Class<?> | Typ. |
| Wert | java.lang.Object | Wert. |

**Returns:**
boolean – true, wenn der Kanal hinzugefügt wurde, sonst false.
### addChannel(String name, Object value) {#addChannel-java.lang.String-java.lang.Object-}
```
public boolean addChannel(String name, Object value)
```


Fügt die angegebene Kanal‑Eigenschaft hinzu.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Name. |
| Wert | java.lang.Object | Wert. |

**Returns:**
boolean – true, wenn der Kanal hinzugefügt wurde, sonst false.
### bindKeyframeSequence(String channelName, KeyframeSequence sequence) {#bindKeyframeSequence-java.lang.String-com.aspose.threed.KeyframeSequence-}
```
public void bindKeyframeSequence(String channelName, KeyframeSequence sequence)
```


Binde die Keyframe‑Sequenz an den angegebenen Kanal

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| channelName | java.lang.String | Welcher Kanal, an den die Keyframe‑Sequenz gebunden wird |
| sequence | [KeyframeSequence](../../com.aspose.threed/keyframesequence) | Die zu bindende Keyframe‑Sequenz |

### createKeyframeSequence(String name) {#createKeyframeSequence-java.lang.String-}
```
public KeyframeSequence createKeyframeSequence(String name)
```


Erstellt eine neue Kurve und verbindet sie mit dem ersten Kanal der Kurvenzuordnung

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Der Name der neuen Sequenz. |

**Returns:**
[KeyframeSequence](../../com.aspose.threed/keyframesequence) - The keyframe sequence.
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
### get(String channelName) {#get-java.lang.String-}
```
public AnimationChannel get(String channelName)
```


Liefert den Kanal mit dem angegebenen Namen

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| channelName | java.lang.String | Kanalname |

**Returns:**
[AnimationChannel](../../com.aspose.threed/animationchannel) - Animation channel
### getChannel(String channelName) {#getChannel-java.lang.String-}
```
public AnimationChannel getChannel(String channelName)
```


Liefert den Kanal mit dem angegebenen Namen

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| channelName | java.lang.String | Der zu findende Kanalname |

**Returns:**
[AnimationChannel](../../com.aspose.threed/animationchannel) - Channel with the name
### getChannelsCount() {#getChannelsCount--}
```
public int getChannelsCount()
```


Liefert die Gesamtzahl der Eigenschaftskanäle, die in dieser Animationskurvenzuordnung definiert sind.

**Returns:**
int - Die Kanalanzahl.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getKeyframeSequence(String channelName) {#getKeyframeSequence-java.lang.String-}
```
public KeyframeSequence getKeyframeSequence(String channelName)
```


Liefert die erste Keyframe‑Sequenz im angegebenen Kanal

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| channelName | java.lang.String | Der zu findende Kanalname |

**Returns:**
[KeyframeSequence](../../com.aspose.threed/keyframesequence) - First keyframe sequence with the channel name
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
### getProperty() {#getProperty--}
```
public Property getProperty()
```


Liefert die mit der CurveMapping verknüpfte Eigenschaft

**Returns:**
[Property](../../com.aspose.threed/property) - the property associated with the CurveMapping
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
### resetChannels() {#resetChannels--}
```
public void resetChannels()
```


Leert die Eigenschaftskanäle dieser Animationskurvenzuordnung.

### setName(String value) {#setName-java.lang.String-}
```
public void setName(String value)
```


Setzt den Namen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert |

### setProperty(Property value) {#setProperty-com.aspose.threed.Property-}
```
public void setProperty(Property value)
```


Liefert die mit der CurveMapping verknüpfte Eigenschaft

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Property](../../com.aspose.threed/property) | Neuer Wert |

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


Formatiert das Objekt in einen String

**Returns:**
java.lang.String - Objektzeichenkette
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

