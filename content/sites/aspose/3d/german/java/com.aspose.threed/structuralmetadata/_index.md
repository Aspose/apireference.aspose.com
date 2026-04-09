---
title: StructuralMetadata
second_title: Aspose.3D für Java API-Referenz
description: Diese Klasse bietet Unterstützung für EXT_structural_metadata, das nur in glTF verwendet wird.
type: docs
weight: 180
url: /de/java/com.aspose.threed/structuralmetadata/
---

**Inheritance:**
java.lang.Object
```
public class StructuralMetadata
```

Diese Klasse bietet Unterstützung für EXT\_structural\_metadata, das nur in glTF verwendet wird.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [StructuralMetadata()](#StructuralMetadata--) |  |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [attach(Scene scene)](#attach-com.aspose.threed.Scene-) | Aktuelle Metadaten an angegebene Szene anhängen |
| [createClass(String name)](#createClass-java.lang.String-) | Einen Metaklassentyp erstellen |
| [createEnum(String name)](#createEnum-java.lang.String-) | Einen Aufzählungstyp erstellen |
| [createPropertyTable(String name, StructuralMetadata.ClassType clazz)](#createPropertyTable-java.lang.String-com.aspose.threed.StructuralMetadata.ClassType-) | Eine neue Property‑Tabelle mit dem angegebenen Metaklassentyp erstellen |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [from(Scene scene)](#from-com.aspose.threed.Scene-) | Abrufen von [StructuralMetadata](../../com.aspose.threed/structuralmetadata), die mit der angegebenen Szene verknüpft ist. |
| [getClass()](#getClass--) |  |
| [getClasses()](#getClasses--) | Die Klassendefinitionen. |
| [getEnums()](#getEnums--) | Die Aufzählungstypdefinitionen |
| [getPropertyTables()](#getPropertyTables--) | Die Property‑Tabellen in diesen Metadaten. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StructuralMetadata() {#StructuralMetadata--}
```
public StructuralMetadata()
```


### attach(Scene scene) {#attach-com.aspose.threed.Scene-}
```
public void attach(Scene scene)
```


Aktuelle Metadaten an angegebene Szene anhängen

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| scene | [Scene](../../com.aspose.threed/scene) |  |

### createClass(String name) {#createClass-java.lang.String-}
```
public StructuralMetadata.ClassType createClass(String name)
```


Einen Metaklassentyp erstellen

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Der Klassenname |

**Returns:**
[ClassType](../../com.aspose.threed/classtype) - Instance of the meta class
### createEnum(String name) {#createEnum-java.lang.String-}
```
public StructuralMetadata.EnumType createEnum(String name)
```


Einen Aufzählungstyp erstellen

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Der Name des Enum-Typs |

**Returns:**
[EnumType](../../com.aspose.threed/enumtype) - Instance of the enum type
### createPropertyTable(String name, StructuralMetadata.ClassType clazz) {#createPropertyTable-java.lang.String-com.aspose.threed.StructuralMetadata.ClassType-}
```
public StructuralMetadata.PropertyTable createPropertyTable(String name, StructuralMetadata.ClassType clazz)
```


Eine neue Property‑Tabelle mit dem angegebenen Metaklassentyp erstellen

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Der Name der Property-Tabelle |
| clazz | [ClassType](../../com.aspose.threed/classtype) | Der Klassentyp der neuen Property-Tabelle |

**Returns:**
[PropertyTable](../../com.aspose.threed/propertytable) - The new instance of property table
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
### from(Scene scene) {#from-com.aspose.threed.Scene-}
```
public static StructuralMetadata from(Scene scene)
```


Abrufen von [StructuralMetadata](../../com.aspose.threed/structuralmetadata), die mit der angegebenen Szene verknüpft ist.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| scene | [Scene](../../com.aspose.threed/scene) | Welche Szene nach den strukturellen Metadaten durchsucht werden soll |

**Returns:**
[StructuralMetadata](../../com.aspose.threed/structuralmetadata) - A valid instance of [StructuralMetadata](../../com.aspose.threed/structuralmetadata) if its found in the scene, otherwise null returned
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getClasses() {#getClasses--}
```
public HashMap<String,StructuralMetadata.ClassType> getClasses()
```


Die Klassendefinitionen.

**Returns:**
java.util.HashMap<java.lang.String,com.aspose.threed.StructuralMetadata.ClassType> - Die Klassendefinitionen .
### getEnums() {#getEnums--}
```
public HashMap<String,StructuralMetadata.EnumType> getEnums()
```


Die Aufzählungstypdefinitionen

**Returns:**
java.util.HashMap<java.lang.String,com.aspose.threed.StructuralMetadata.EnumType> - Die Enum-Typdefinitionen
### getPropertyTables() {#getPropertyTables--}
```
public ArrayList<StructuralMetadata.PropertyTable> getPropertyTables()
```


Die Property‑Tabellen in diesen Metadaten.

**Returns:**
java.util.ArrayList<com.aspose.threed.StructuralMetadata.PropertyTable> - Die Property-Tabellen in diesen Metadaten.
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

