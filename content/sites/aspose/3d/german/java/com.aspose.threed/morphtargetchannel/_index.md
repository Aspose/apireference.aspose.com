---
title: MorphTargetChannel
second_title: Aspose.3D für Java API-Referenz
description: Ein MorphTargetChannel wird von  verwendet, um die Zielgeometrien zu organisieren.
type: docs
weight: 107
url: /de/java/com.aspose.threed/morphtargetchannel/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject)
```
public class MorphTargetChannel extends A3DObject
```

Ein MorphTargetChannel wird von [MorphTargetDeformer](../../com.aspose.threed/morphtargetdeformer) verwendet, um die Zielgeometrien zu organisieren. Einige Dateiformate wie FBX unterstützen mehrere Kanäle parallel. **Remarks:** Gewicht liegt zwischen 0 und 1,0, und das Standardgewicht für das Ziel ist 0,0;
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [MorphTargetChannel(String name)](#MorphTargetChannel-java.lang.String-) | Initialisiert eine neue Instanz der Klasse [MorphTargetChannel](../../com.aspose.threed/morphtargetchannel). |
| [MorphTargetChannel()](#MorphTargetChannel--) | Initialisiert eine neue Instanz der Klasse [MorphTargetChannel](../../com.aspose.threed/morphtargetchannel). |
## Felder

| Feld | Beschreibung |
| --- | --- |
| [DEFAULT_WEIGHT](#DEFAULT-WEIGHT) | Standardgewicht für Morph‑Ziel. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Findet die Eigenschaft. |
| [get(Shape target)](#get-com.aspose.threed.Shape-) | Liefert das Gewicht für die angegebene Geometrie |
| [getChannelWeight()](#getChannelWeight--) | Liefert das Deformer‑Gewicht dieses Kanals. |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Liefert den Namen. |
| [getProperties()](#getProperties--) | Liefert die Sammlung aller Eigenschaften. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Liefere den Wert der angegebenen Eigenschaft |
| [getTargets()](#getTargets--) | Liefert alle Ziele, die mit dem Kanal verknüpft sind. |
| [getWeight(Shape target)](#getWeight-com.aspose.threed.Shape-) | Liefert das Gewicht für das angegebene Ziel; gehört das Ziel nicht zu diesem Kanal, wird der Standardwert 0 zurückgegeben. |
| [getWeights()](#getWeights--) | Liefert die vollständigen Gewichtswerte der Zielgeometrien. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Entfernt eine dynamische Eigenschaft. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Entferne die angegebene Eigenschaft, die durch ihren Namen identifiziert wird |
| [set(Shape target, double value)](#set-com.aspose.threed.Shape-double-) | Setzt das Gewicht für die angegebene Geometrie |
| [setChannelWeight(double value)](#setChannelWeight-double-) | Setzt das Deformer‑Gewicht dieses Kanals. |
| [setName(String value)](#setName-java.lang.String-) | Setzt den Namen. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Setzt den Wert der angegebenen Eigenschaft |
| [setWeight(Shape target)](#setWeight-com.aspose.threed.Shape-) | Setzt das Gewicht für das angegebene Ziel, Standardwert ist 1, der Bereich sollte zwischen 0 und 1 liegen |
| [setWeight(Shape target, double weight)](#setWeight-com.aspose.threed.Shape-double-) | Setzt das Gewicht für das angegebene Ziel, Standardwert ist 1, der Bereich sollte zwischen 0 und 1 liegen |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### MorphTargetChannel(String name) {#MorphTargetChannel-java.lang.String-}
```
public MorphTargetChannel(String name)
```


Initialisiert eine neue Instanz der Klasse [MorphTargetChannel](../../com.aspose.threed/morphtargetchannel).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Name. |

### MorphTargetChannel() {#MorphTargetChannel--}
```
public MorphTargetChannel()
```


Initialisiert eine neue Instanz der Klasse [MorphTargetChannel](../../com.aspose.threed/morphtargetchannel).

### DEFAULT_WEIGHT {#DEFAULT-WEIGHT}
```
public static final double DEFAULT_WEIGHT
```


Standardgewicht für Morph‑Ziel.

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


Liefert das Gewicht für die angegebene Geometrie

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| target | [Shape](../../com.aspose.threed/shape) | Zielgeometrie. |

**Returns:**
double - Gewicht
### getChannelWeight() {#getChannelWeight--}
```
public double getChannelWeight()
```


Liefert das Deformer‑Gewicht dieses Kanals. Das Gewicht liegt zwischen 0,0 und 1,0

**Returns:**
double - das Deformer‑Gewicht dieses Kanals. Das Gewicht liegt zwischen 0,0 und 1,0
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
### getTargets() {#getTargets--}
```
public List<Shape> getTargets()
```


Liefert alle Ziele, die mit dem Kanal verknüpft sind.

**Returns:**
java.util.List<com.aspose.threed.Shape> - alle Ziele, die mit dem Kanal verknüpft sind.
### getWeight(Shape target) {#getWeight-com.aspose.threed.Shape-}
```
public double getWeight(Shape target)
```


Liefert das Gewicht für das angegebene Ziel; gehört das Ziel nicht zu diesem Kanal, wird der Standardwert 0 zurückgegeben.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| target | [Shape](../../com.aspose.threed/shape) |  |

**Returns:**
double
### getWeights() {#getWeights--}
```
public List<Double> getWeights()
```


Liefert die vollständigen Gewichtswerte der Zielgeometrien.

**Returns:**
java.util.List<java.lang.Double> - die vollständigen Gewichtswerte der Zielgeometrien.
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


Setzt das Gewicht für die angegebene Geometrie

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| target | [Shape](../../com.aspose.threed/shape) | Zielgeometrie. |
| Wert | double | Neuer Wert |

### setChannelWeight(double value) {#setChannelWeight-double-}
```
public void setChannelWeight(double value)
```


Setzt das Deformer‑Gewicht dieses Kanals. Das Gewicht liegt zwischen 0,0 und 1,0

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
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

### setWeight(Shape target) {#setWeight-com.aspose.threed.Shape-}
```
public void setWeight(Shape target)
```


Setzt das Gewicht für das angegebene Ziel, Standardwert ist 1, der Bereich sollte zwischen 0 und 1 liegen

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| target | [Shape](../../com.aspose.threed/shape) |  |

### setWeight(Shape target, double weight) {#setWeight-com.aspose.threed.Shape-double-}
```
public void setWeight(Shape target, double weight)
```


Setzt das Gewicht für das angegebene Ziel, Standardwert ist 1, der Bereich sollte zwischen 0 und 1 liegen

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| target | [Shape](../../com.aspose.threed/shape) |  |
| Gewicht | double |  |

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

