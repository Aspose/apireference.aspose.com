---
title: StructuralMetadata.PropertyTable
second_title: Aspose.3D für Java API-Referenz
description: Property‑Tabelle.
type: docs
weight: 14
url: /de/java/com.aspose.threed/structuralmetadata.propertytable/
---

**Inheritance:**
java.lang.Object
```
public static class StructuralMetadata.PropertyTable
```

Property‑Tabelle.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [PropertyTable(String name, StructuralMetadata.ClassType mclass)](#PropertyTable-java.lang.String-com.aspose.threed.StructuralMetadata.ClassType-) | Konstruktor der Eigenschaftstabelle. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [addValue(StructuralMetadata.Property prop, Object value)](#addValue-com.aspose.threed.StructuralMetadata.Property-java.lang.Object-) | Füge eine neue Eigenschaft zur Eigenschaftstabelle hinzu. |
| [addValue(String propName, Object value)](#addValue-java.lang.String-java.lang.Object-) | Füge eine neue Eigenschaft zur Eigenschaftstabelle hinzu. |
| [attach(VertexElementUserData userData)](#attach-com.aspose.threed.VertexElementUserData-) | Hänge die aktuelle Eigenschaftstabelle an die angegebene Benutzerdaten an. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [from(VertexElementUserData userData)](#from-com.aspose.threed.VertexElementUserData-) | Extrahiere die angehängte Eigenschaftstabelle aus den angegebenen Benutzerdaten. |
| [getClass()](#getClass--) |  |
| [getMetaClass()](#getMetaClass--) | Die Metaklasse dieser Eigenschaftstabelle. |
| [getName()](#getName--) | Name der Eigenschaftstabelle. |
| [getValue(String name)](#getValue-java.lang.String-) | Gibt den Wert des angegebenen Eigenschaftsnamens zurück. |
| [getValues()](#getValues--) | Werte der Eigenschaftstabelle. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PropertyTable(String name, StructuralMetadata.ClassType mclass) {#PropertyTable-java.lang.String-com.aspose.threed.StructuralMetadata.ClassType-}
```
public PropertyTable(String name, StructuralMetadata.ClassType mclass)
```


Konstruktor der Eigenschaftstabelle.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Der Name dieser Tabelleninstanz. |
| mclass | [ClassType](../../com.aspose.threed/classtype) | Die Metaklassendefinition dieser Eigenschaftstabelle. |

### addValue(StructuralMetadata.Property prop, Object value) {#addValue-com.aspose.threed.StructuralMetadata.Property-java.lang.Object-}
```
public void addValue(StructuralMetadata.Property prop, Object value)
```


Füge eine neue Eigenschaft zur Eigenschaftstabelle hinzu.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| prop | [Property](../../com.aspose.threed/property) | Welche Eigenschaft mit Wert hinzuzufügen ist. |
| Wert | java.lang.Object | Array von Werten. |

### addValue(String propName, Object value) {#addValue-java.lang.String-java.lang.Object-}
```
public void addValue(String propName, Object value)
```


Füge eine neue Eigenschaft zur Eigenschaftstabelle hinzu.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| propName | java.lang.String | Welche Eigenschaft mit Wert hinzuzufügen ist. |
| Wert | java.lang.Object | Array von Werten. |

### attach(VertexElementUserData userData) {#attach-com.aspose.threed.VertexElementUserData-}
```
public void attach(VertexElementUserData userData)
```


Hänge die aktuelle Eigenschaftstabelle an die angegebene Benutzerdaten an.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| userData | [VertexElementUserData](../../com.aspose.threed/vertexelementuserdata) |  |

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
### from(VertexElementUserData userData) {#from-com.aspose.threed.VertexElementUserData-}
```
public static StructuralMetadata.PropertyTable from(VertexElementUserData userData)
```


Extrahiere die angehängte Eigenschaftstabelle aus den angegebenen Benutzerdaten.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| userData | [VertexElementUserData](../../com.aspose.threed/vertexelementuserdata) | Die Benutzerdaten, die mit einer Eigenschaftstabelle verknüpft sind. |

**Returns:**
[PropertyTable](../../com.aspose.threed/propertytable) - The associated property table instance
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getMetaClass() {#getMetaClass--}
```
public StructuralMetadata.ClassType getMetaClass()
```


Die Metaklasse dieser Eigenschaftstabelle.

**Returns:**
[ClassType](../../com.aspose.threed/classtype) - The meta class of this property table.
### getName() {#getName--}
```
public String getName()
```


Name der Eigenschaftstabelle.

**Returns:**
java.lang.String – Name der Eigenschaftstabelle.
### getValue(String name) {#getValue-java.lang.String-}
```
public Object getValue(String name)
```


Gibt den Wert des angegebenen Eigenschaftsnamens zurück.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Eigenschaftsname |

**Returns:**
java.lang.Object – Eigenschaftswert oder null, falls nicht gefunden.
### getValues() {#getValues--}
```
public HashMap<String,Object> getValues()
```


Werte der Eigenschaftstabelle.

**Returns:**
java.util.HashMap<java.lang.String,java.lang.Object> – Werte der Eigenschaftstabelle.
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

