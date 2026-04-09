---
title: Knochen
second_title: Aspose.3D für Java API-Referenz
description: Ein Knochen definiert die Teilmenge der Kontrollpunkte der Geometrie und legt das Blendgewicht für jeden Kontrollpunkt fest.
type: docs
weight: 20
url: /de/java/com.aspose.threed/bone/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject)
```
public class Bone extends A3DObject
```

Ein Knochen definiert die Teilmenge der Kontrollpunkte der Geometrie und legt das Blendgewicht für jeden Kontrollpunkt fest. Das [Bone](../../com.aspose.threed/bone)-Objekt kann nicht direkt verwendet werden, eine [SkinDeformer](../../com.aspose.threed/skindeformer)-Instanz wird verwendet, um die Geometrie zu deformieren, und [SkinDeformer](../../com.aspose.threed/skindeformer) enthält einen Satz von Knochen, wobei jeder Knochen mit einem Knoten verknüpft ist. HINWEIS: Ein Kontrollpunkt einer Geometrie kann an mehr als einem Knochen gebunden sein.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [Bone(String name)](#Bone-java.lang.String-) | Initialisiert eine neue Instanz der Klasse [Bone](../../com.aspose.threed/bone). |
| [Bone()](#Bone--) | Initialisiert eine neue Instanz der Klasse [Bone](../../com.aspose.threed/bone). |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Findet die Eigenschaft. |
| [get(int index)](#get-int-) | Gibt das Blendgewicht des angegebenen Kontrollpunkts zurück |
| [getBoneTransform()](#getBoneTransform--) | Gibt die Transformationsmatrix des Knochens zurück |
| [getClass()](#getClass--) |  |
| [getLinkMode()](#getLinkMode--) | Der Verbindungsmodus eines Knochens bezieht sich darauf, wie ein Knochen innerhalb einer hierarchischen Struktur mit seinem übergeordneten Knochen verbunden oder verknüpft ist. |
| [getName()](#getName--) | Liefert den Namen. |
| [getNode()](#getNode--) | Liest den Knoten. |
| [getProperties()](#getProperties--) | Liefert die Sammlung aller Eigenschaften. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Liefere den Wert der angegebenen Eigenschaft |
| [getTransform()](#getTransform--) | Liest die Transformationsmatrix des Knotens, der den Knochen enthält. |
| [getWeight(int index)](#getWeight-int-) | Liest das Gewicht für den Kontrollpunkt, der durch den Index angegeben ist |
| [getWeightCount()](#getWeightCount--) | Liest die Anzahl der Gewichte, diese wird automatisch durch [setWeight](../../com.aspose.threed/bone\#setWeight) erweitert |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Entfernt eine dynamische Eigenschaft. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Entferne die angegebene Eigenschaft, die durch ihren Namen identifiziert wird |
| [set(int index, double value)](#set-int-double-) | Setzt das Mischgewicht des angegebenen Kontrollpunkts |
| [setBoneTransform(Matrix4 value)](#setBoneTransform-com.aspose.threed.Matrix4-) | Setzt die Transformationsmatrix des Knochens. |
| [setLinkMode(BoneLinkMode value)](#setLinkMode-com.aspose.threed.BoneLinkMode-) | Der Verbindungsmodus eines Knochens bezieht sich darauf, wie ein Knochen innerhalb einer hierarchischen Struktur mit seinem übergeordneten Knochen verbunden oder verknüpft ist. |
| [setName(String value)](#setName-java.lang.String-) | Setzt den Namen. |
| [setNode(Node value)](#setNode-com.aspose.threed.Node-) | Setzt den Knoten. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Setzt den Wert der angegebenen Eigenschaft |
| [setTransform(Matrix4 value)](#setTransform-com.aspose.threed.Matrix4-) | Setzt die Transformationsmatrix des Knotens, der den Knochen enthält. |
| [setWeight(int index, double weight)](#setWeight-int-double-) | Setzt das Gewicht für den Kontrollpunkt, der durch den Index angegeben ist |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Bone(String name) {#Bone-java.lang.String-}
```
public Bone(String name)
```


Initialisiert eine neue Instanz der Klasse [Bone](../../com.aspose.threed/bone).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Name. |

### Bone() {#Bone--}
```
public Bone()
```


Initialisiert eine neue Instanz der Klasse [Bone](../../com.aspose.threed/bone).

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
### get(int index) {#get-int-}
```
public double get(int index)
```


Gibt das Blendgewicht des angegebenen Kontrollpunkts zurück

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Index des Gewichts |

**Returns:**
double - Das Gewicht
### getBoneTransform() {#getBoneTransform--}
```
public Matrix4 getBoneTransform()
```


Gibt die Transformationsmatrix des Knochens zurück

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4) - the transform matrix of the bone.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getLinkMode() {#getLinkMode--}
```
public BoneLinkMode getLinkMode()
```


Der Verbindungsmodus eines Knochens bezieht sich darauf, wie ein Knochen innerhalb einer hierarchischen Struktur mit seinem übergeordneten Knochen verbunden oder verknüpft ist.

**Returns:**
[BoneLinkMode](../../com.aspose.threed/bonelinkmode) - A bone's link mode refers to the way in which a bone is connected or linked to its parent bone within a hierarchical structure.
### getName() {#getName--}
```
public String getName()
```


Liefert den Namen.

**Returns:**
java.lang.String - der Name.
### getNode() {#getNode--}
```
public Node getNode()
```


Liest den Knoten. Der Knochenknoten ist der Knochen, an dem die Haut befestigt ist, der [SkinDeformer](../../com.aspose.threed/skindeformer) verwendet den Knochenknoten, um die Verschiebung der Kontrollpunkte zu beeinflussen. Der Knochenknoten hat normalerweise ein [Skeleton](../../com.aspose.threed/skeleton) angehängt, aber das ist nicht erforderlich. Das angehängte [Skeleton](../../com.aspose.threed/skeleton) wird normalerweise von DCC‑Software verwendet, um dem Benutzer das Skelett anzuzeigen.

**Returns:**
[Node](../../com.aspose.threed/node) - the node. The bone node is the bone which skin attached to, the [SkinDeformer](../../com.aspose.threed/skindeformer) will use bone node to influence the displacement of the control points. Bone node usually has a [Skeleton](../../com.aspose.threed/skeleton) attached, but it's not required. Attached [Skeleton](../../com.aspose.threed/skeleton) is usually used by DCC software to show skeleton to user.
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
### getTransform() {#getTransform--}
```
public Matrix4 getTransform()
```


Liest die Transformationsmatrix des Knotens, der den Knochen enthält.

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4) - the transform matrix of the node containing the bone.
### getWeight(int index) {#getWeight-int-}
```
public double getWeight(int index)
```


Liest das Gewicht für den Kontrollpunkt, der durch den Index angegeben ist

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Index des Kontrollpunkts |

**Returns:**
double - das Gewicht am angegebenen Index oder 0, wenn der Index ungültig ist
### getWeightCount() {#getWeightCount--}
```
public int getWeightCount()
```


Liest die Anzahl der Gewichte, diese wird automatisch durch [setWeight](../../com.aspose.threed/bone\#setWeight) erweitert

**Returns:**
int - die Anzahl der Gewichte, diese wird automatisch durch [setWeight](../../com.aspose.threed/bone\#setWeight) erweitert
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
### set(int index, double value) {#set-int-double-}
```
public void set(int index, double value)
```


Setzt das Mischgewicht des angegebenen Kontrollpunkts

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Index des Gewichts |
| Wert | double | Neuer Wert |

### setBoneTransform(Matrix4 value) {#setBoneTransform-com.aspose.threed.Matrix4-}
```
public void setBoneTransform(Matrix4 value)
```


Setzt die Transformationsmatrix des Knochens.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Matrix4](../../com.aspose.threed/matrix4) | Neuer Wert |

### setLinkMode(BoneLinkMode value) {#setLinkMode-com.aspose.threed.BoneLinkMode-}
```
public void setLinkMode(BoneLinkMode value)
```


Der Verbindungsmodus eines Knochens bezieht sich darauf, wie ein Knochen innerhalb einer hierarchischen Struktur mit seinem übergeordneten Knochen verbunden oder verknüpft ist.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [BoneLinkMode](../../com.aspose.threed/bonelinkmode) | Neuer Wert |

### setName(String value) {#setName-java.lang.String-}
```
public void setName(String value)
```


Setzt den Namen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert |

### setNode(Node value) {#setNode-com.aspose.threed.Node-}
```
public void setNode(Node value)
```


Setzt den Knoten. Der Knochenknoten ist der Knochen, an dem die Haut befestigt ist, der [SkinDeformer](../../com.aspose.threed/skindeformer) verwendet den Knochenknoten, um die Verschiebung der Kontrollpunkte zu beeinflussen. Der Knochenknoten hat normalerweise ein [Skeleton](../../com.aspose.threed/skeleton) angehängt, aber das ist nicht erforderlich. Das angehängte [Skeleton](../../com.aspose.threed/skeleton) wird normalerweise von DCC‑Software verwendet, um dem Benutzer das Skelett anzuzeigen.

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

### setTransform(Matrix4 value) {#setTransform-com.aspose.threed.Matrix4-}
```
public void setTransform(Matrix4 value)
```


Setzt die Transformationsmatrix des Knotens, der den Knochen enthält.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Matrix4](../../com.aspose.threed/matrix4) | Neuer Wert |

### setWeight(int index, double weight) {#setWeight-int-double-}
```
public void setWeight(int index, double weight)
```


Setzt das Gewicht für den Kontrollpunkt, der durch den Index angegeben ist

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Index des Kontrollpunkts |
| Gewicht | double | Neues Gewicht |

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

