---
title: MorphTargetDeformer
second_title: Aspose.3D für Java API-Referenz
description: MorphTargetDeformer bietet pro-Vertex-Animation.
type: docs
weight: 108
url: /de/java/com.aspose.threed/morphtargetdeformer/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.Deformer](../../com.aspose.threed/deformer)
```
public class MorphTargetDeformer extends Deformer
```

MorphTargetDeformer bietet per-Vertex-Animation. MorphTargetDeformer organisiert alle Ziele über [MorphTargetChannel](../../com.aspose.threed/morphtargetchannel), jeder Kanal kann mehrere Ziele organisieren. Ein häufiger Einsatz des Morph‑Target‑Deformers ist das Anwenden von Gesichtsausdrücken auf einen Charakter. Weitere Details finden Sie unter https://en.wikipedia.org/wiki/Morph\\_target\\_animation
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [MorphTargetDeformer(String name)](#MorphTargetDeformer-java.lang.String-) | Initialisiert eine neue Instanz der Klasse [MorphTargetDeformer](../../com.aspose.threed/morphtargetdeformer). |
| [MorphTargetDeformer()](#MorphTargetDeformer--) | Initialisiert eine neue Instanz der Klasse [MorphTargetDeformer](../../com.aspose.threed/morphtargetdeformer). |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Findet die Eigenschaft. |
| [get(Shape target)](#get-com.aspose.threed.Shape-) | Liefert das Gewicht für die gegebene Geometrie, dies ist ein kurzer Weg, das Gewicht für das Ziel zu ändern, ohne den Kanal zu verwenden. |
| [getChannels()](#getChannels--) | Liefert alle im Deformer enthaltenen Kanäle |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Liefert den Namen. |
| [getOwner()](#getOwner--) | Ermittelt die Geometrie, die diesen Deformer besitzt |
| [getProperties()](#getProperties--) | Liefert die Sammlung aller Eigenschaften. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Liefere den Wert der angegebenen Eigenschaft |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Entfernt eine dynamische Eigenschaft. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Entferne die angegebene Eigenschaft, die durch ihren Namen identifiziert wird |
| [set(Shape target, double value)](#set-com.aspose.threed.Shape-double-) | Setzt das Gewicht für die gegebene Geometrie, dies ist ein kurzer Weg, das Gewicht für das Ziel zu ändern, ohne den Kanal zu verwenden. |
| [setName(String value)](#setName-java.lang.String-) | Setzt den Namen. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Setzt den Wert der angegebenen Eigenschaft |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### MorphTargetDeformer(String name) {#MorphTargetDeformer-java.lang.String-}
```
public MorphTargetDeformer(String name)
```


Initialisiert eine neue Instanz der Klasse [MorphTargetDeformer](../../com.aspose.threed/morphtargetdeformer).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Name. |

### MorphTargetDeformer() {#MorphTargetDeformer--}
```
public MorphTargetDeformer()
```


Initialisiert eine neue Instanz der Klasse [MorphTargetDeformer](../../com.aspose.threed/morphtargetdeformer).

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
### get(Shape target) {#get-com.aspose.threed.Shape-}
```
public double get(Shape target)
```


Liefert das Gewicht für die gegebene Geometrie, dies ist ein kurzer Weg, das Gewicht für das Ziel zu ändern, ohne den Kanal zu verwenden.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| target | [Shape](../../com.aspose.threed/shape) | Zielgeometrie |

**Returns:**
double - Gewicht
### getChannels() {#getChannels--}
```
public List<MorphTargetChannel> getChannels()
```


Liefert alle im Deformer enthaltenen Kanäle

**Returns:**
java.util.List<com.aspose.threed.MorphTargetChannel> - alle Kanäle, die in diesem Deformer enthalten sind
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getName() {#getName--}
```
public String getName()
```


Liefert den Namen.

**Returns:**
java.lang.String - der Name.
### getOwner() {#getOwner--}
```
public Geometry getOwner()
```


Ermittelt die Geometrie, die diesen Deformer besitzt

**Returns:**
[Geometry](../../com.aspose.threed/geometry) - the geometry which owns this deformer
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
### set(Shape target, double value) {#set-com.aspose.threed.Shape-double-}
```
public void set(Shape target, double value)
```


Setzt das Gewicht für die gegebene Geometrie, dies ist ein kurzer Weg, das Gewicht für das Ziel zu ändern, ohne den Kanal zu verwenden.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| target | [Shape](../../com.aspose.threed/shape) | Zielgeometrie |
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

