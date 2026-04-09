---
title: PropertyCollection
second_title: Aspose.3D für Java API-Referenz
description: Die Sammlung von Eigenschaften
type: docs
weight: 140
url: /de/java/com.aspose.threed/propertycollection/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.lang.Iterable
```
public class PropertyCollection implements Iterable<Property>
```

Die Sammlung von Eigenschaften
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String property)](#findProperty-java.lang.String-) | Findet die Eigenschaft. |
| [get(int idx)](#get-int-) | Liefert die Eigenschaft nach Index. |
| [get(String property)](#get-java.lang.String-) | Liefert den Wert der Eigenschaft nach Eigenschaftsname. |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Gibt einen Enumerator zurück, der die Sammlung durchläuft. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Entfernt eine dynamische Eigenschaft. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Entfernt eine dynamische Eigenschaft. |
| [set(String property, Object value)](#set-java.lang.String-java.lang.Object-) | Setzt den Wert der Eigenschaft nach Eigenschaftsname. |
| [size()](#size--) | Liefert die Anzahl der deklarierten Eigenschaften. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### findProperty(String property) {#findProperty-java.lang.String-}
```
public Property findProperty(String property)
```


Findet die Eigenschaft. Sie kann eine dynamische Eigenschaft sein (erstellt durch CreateDynamicProperty/SetProperty) oder eine native Eigenschaft (identifiziert durch ihren Namen)

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eigenschaft | java.lang.String | Eigenschaftsname. |

**Returns:**
[Property](../../com.aspose.threed/property) - The property.
### get(int idx) {#get-int-}
```
public Property get(int idx)
```


Liefert die Eigenschaft nach Index.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| idx | int | Der nullbasierte Index der Eigenschaft |

**Returns:**
[Property](../../com.aspose.threed/property) - the property by index.
### get(String property) {#get-java.lang.String-}
```
public Object get(String property)
```


Liefert den Wert der Eigenschaft nach Eigenschaftsname.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eigenschaft | java.lang.String | Der Name der Eigenschaft |

**Returns:**
java.lang.Object - Der Wert der Eigenschaft
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### iterator() {#iterator--}
```
public Iterator<Property> iterator()
```


Gibt einen Enumerator zurück, der die Sammlung durchläuft.

**Returns:**
java.util.Iterator<com.aspose.threed.Property>
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


Entfernt eine dynamische Eigenschaft.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eigenschaft | java.lang.String | Welche Eigenschaft zu entfernen ist |

**Returns:**
boolean - true, wenn die Eigenschaft erfolgreich entfernt wurde
### set(String property, Object value) {#set-java.lang.String-java.lang.Object-}
```
public void set(String property, Object value)
```


Setzt den Wert der Eigenschaft nach Eigenschaftsname.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eigenschaft | java.lang.String | Der Name der Eigenschaft |
| Wert | java.lang.Object | Neuer Wert |

### size() {#size--}
```
public int size()
```


Liefert die Anzahl der deklarierten Eigenschaften.

**Returns:**
int - die Anzahl der deklarierten Eigenschaften.
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

