---
title: VertexElementIntsTemplate
second_title: Aspose.3D für Java API-Referenz
description: Eine Hilfsklasse zum Definieren konkreter Implementierungen.
type: docs
weight: 212
url: /de/java/com.aspose.threed/vertexelementintstemplate/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.VertexElement](../../com.aspose.threed/vertexelement)
```
public class VertexElementIntsTemplate extends VertexElement
```

Eine Hilfsklasse zum Definieren konkreter [VertexElement](../../com.aspose.threed/vertexelement)-Implementierungen.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [clear()](#clear--) | Entfernt alle Elemente aus den direkten und den Index-Arrays. |
| [clone(boolean withData)](#clone-boolean-) | Erstelle eine tiefe Kopie des Vertex-Elements. |
| [clone(boolean withDirect, boolean withIndice)](#clone-boolean-boolean-) |  |
| [copyTo(VertexElementIntsTemplate target)](#copyTo-com.aspose.threed.VertexElementIntsTemplate-) | Kopiert Daten in das angegebene Element. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getData()](#getData--) | Liefert die Vertex-Daten |
| [getIndices()](#getIndices--) | Liefert die Indexdaten |
| [getMappingMode()](#getMappingMode--) | Liefert, wie das Element zugeordnet ist. |
| [getName()](#getName--) | Liefert den Namen. |
| [getReferenceMode()](#getReferenceMode--) | Liefert, wie das Element referenziert wird. |
| [getVertexElementType()](#getVertexElementType--) | Liefert den Typ des [VertexElement](../../com.aspose.threed/vertexelement) |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setData(int[] data)](#setData-int---) | Daten laden |
| [setIndices(int[] data)](#setIndices-int---) | Indizes laden |
| [setMappingMode(MappingMode value)](#setMappingMode-com.aspose.threed.MappingMode-) | Setzt, wie das Element zugeordnet ist. |
| [setName(String value)](#setName-java.lang.String-) | Setzt den Namen. |
| [setReferenceMode(ReferenceMode value)](#setReferenceMode-com.aspose.threed.ReferenceMode-) | Setzt, wie das Element referenziert wird. |
| [toString()](#toString--) | String-Darstellung des Vertex-Elements. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### clear() {#clear--}
```
public void clear()
```


Entfernt alle Elemente aus den direkten und den Index-Arrays.

### clone(boolean withData) {#clone-boolean-}
```
public VertexElement clone(boolean withData)
```


Erstelle eine tiefe Kopie des Vertex-Elements.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| withData | boolean | Klonen Sie den Vertex mit direktem und Index-Array. |

**Returns:**
[VertexElement](../../com.aspose.threed/vertexelement)
### clone(boolean withDirect, boolean withIndice) {#clone-boolean-boolean-}
```
public VertexElement clone(boolean withDirect, boolean withIndice)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| withDirect | boolean |  |
| withIndice | boolean |  |

**Returns:**
[VertexElement](../../com.aspose.threed/vertexelement)
### copyTo(VertexElementIntsTemplate target) {#copyTo-com.aspose.threed.VertexElementIntsTemplate-}
```
public void copyTo(VertexElementIntsTemplate target)
```


Kopiert Daten in das angegebene Element.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| target | [VertexElementIntsTemplate](../../com.aspose.threed/vertexelementintstemplate) | Ziel. |

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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getData() {#getData--}
```
public List<Integer> getData()
```


Liefert die Vertex-Daten

**Returns:**
java.util.List<java.lang.Integer> - die Vertex-Daten
### getIndices() {#getIndices--}
```
public List<Integer> getIndices()
```


Liefert die Indexdaten

**Returns:**
java.util.List<java.lang.Integer> - die Indexdaten
### getMappingMode() {#getMappingMode--}
```
public MappingMode getMappingMode()
```


Liefert, wie das Element zugeordnet ist.

**Returns:**
[MappingMode](../../com.aspose.threed/mappingmode) - how the element is mapped.
### getName() {#getName--}
```
public String getName()
```


Liefert den Namen.

**Returns:**
java.lang.String - der Name.
### getReferenceMode() {#getReferenceMode--}
```
public ReferenceMode getReferenceMode()
```


Liefert, wie das Element referenziert wird.

**Returns:**
[ReferenceMode](../../com.aspose.threed/referencemode) - how the element is referenced.
### getVertexElementType() {#getVertexElementType--}
```
public VertexElementType getVertexElementType()
```


Liefert den Typ des [VertexElement](../../com.aspose.threed/vertexelement)

**Returns:**
[VertexElementType](../../com.aspose.threed/vertexelementtype) - the type of the [VertexElement](../../com.aspose.threed/vertexelement)
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




### setData(int[] data) {#setData-int---}
```
public void setData(int[] data)
```


Daten laden

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Daten | int[] |  |

### setIndices(int[] data) {#setIndices-int---}
```
public void setIndices(int[] data)
```


Indizes laden

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Daten | int[] |  |

### setMappingMode(MappingMode value) {#setMappingMode-com.aspose.threed.MappingMode-}
```
public void setMappingMode(MappingMode value)
```


Setzt, wie das Element zugeordnet ist.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [MappingMode](../../com.aspose.threed/mappingmode) | Neuer Wert |

### setName(String value) {#setName-java.lang.String-}
```
public void setName(String value)
```


Setzt den Namen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert |

### setReferenceMode(ReferenceMode value) {#setReferenceMode-com.aspose.threed.ReferenceMode-}
```
public void setReferenceMode(ReferenceMode value)
```


Setzt, wie das Element referenziert wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [ReferenceMode](../../com.aspose.threed/referencemode) | Neuer Wert |

### toString() {#toString--}
```
public String toString()
```


String-Darstellung des Vertex-Elements.

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

