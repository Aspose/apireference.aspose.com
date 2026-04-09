---
title: StructuralMetadata.Property
second_title: Aspose.3D für Java API-Referenz
description: Die Eigenschaftsdefinition in Metadatenklassen
type: docs
weight: 13
url: /de/java/com.aspose.threed/structuralmetadata.property/
---

**Inheritance:**
java.lang.Object
```
public static class StructuralMetadata.Property
```

Die Property-Definition in den Klassen der Metadaten
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [Property(String name, String displayName, String description, Class<?> type, boolean normalized, Integer count)](#Property-java.lang.String-java.lang.String-java.lang.String-java.lang.Class----boolean-java.lang.Integer-) | Konstruktor der Metadaten‑Eigenschaft |
| [Property(String name, String displayName, String description, StructuralMetadata.EnumType type, boolean array, Integer count)](#Property-java.lang.String-java.lang.String-java.lang.String-com.aspose.threed.StructuralMetadata.EnumType-boolean-java.lang.Integer-) | Konstruktor der Metadaten‑Eigenschaft |
| [Property(String name, Class<?> type)](#Property-java.lang.String-java.lang.Class----) | Konstruktor der Metadaten‑Eigenschaft |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getCount()](#getCount--) | Anzahl der Daten für ein Array fester Größe. |
| [getDescription()](#getDescription--) | Die Beschreibung der Eigenschaft |
| [getDisplayName()](#getDisplayName--) | Der Name der Eigenschaft, verwendet von der UI zur Darstellung. |
| [getEnumType()](#getEnumType--) | Der Enum‑Typ |
| [getName()](#getName--) | Der eindeutige Name der Eigenschaft |
| [getNormalized()](#getNormalized--) | Ist die Daten normalisiert. |
| [getType()](#getType--) | Der Datentyp der Eigenschaft |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setCount(Integer value)](#setCount-java.lang.Integer-) | Anzahl der Daten für ein Array fester Größe. |
| [setDescription(String value)](#setDescription-java.lang.String-) | Die Beschreibung der Eigenschaft |
| [setDisplayName(String value)](#setDisplayName-java.lang.String-) | Der Name der Eigenschaft, verwendet von der UI zur Darstellung. |
| [setEnumType(StructuralMetadata.EnumType value)](#setEnumType-com.aspose.threed.StructuralMetadata.EnumType-) | Der Enum‑Typ |
| [setNormalized(boolean value)](#setNormalized-boolean-) | Ist die Daten normalisiert. |
| [toString()](#toString--) | Gibt die String-Darstellung dieser Instanz zurück. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Property(String name, String displayName, String description, Class<?> type, boolean normalized, Integer count) {#Property-java.lang.String-java.lang.String-java.lang.String-java.lang.Class----boolean-java.lang.Integer-}
```
public Property(String name, String displayName, String description, Class<?> type, boolean normalized, Integer count)
```


Konstruktor der Metadaten‑Eigenschaft

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Der eindeutige Name der Eigenschaft |
| displayName | java.lang.String | Der Name der Eigenschaft, verwendet von der UI zur Darstellung. |
| description | java.lang.String | Die Beschreibung der Eigenschaft |
| type | java.lang.Class<?> | Datentyp der Eigenschaft |
| normalized | boolean | Ist die Daten normalisiert |
| Anzahl | java.lang.Integer | Anzahl der Daten für ein Array fester Größe |

### Property(String name, String displayName, String description, StructuralMetadata.EnumType type, boolean array, Integer count) {#Property-java.lang.String-java.lang.String-java.lang.String-com.aspose.threed.StructuralMetadata.EnumType-boolean-java.lang.Integer-}
```
public Property(String name, String displayName, String description, StructuralMetadata.EnumType type, boolean array, Integer count)
```


Konstruktor der Metadaten‑Eigenschaft

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Der eindeutige Name der Eigenschaft |
| displayName | java.lang.String | Der Name der Eigenschaft, verwendet von der UI zur Darstellung. |
| description | java.lang.String | Die Beschreibung der Eigenschaft |
| type | [EnumType](../../com.aspose.threed/enumtype) | Datentyp der Eigenschaft |
| Array | boolean | Ist jeder Eigenschaftswert ein Array oder ein Skalar |
| Anzahl | java.lang.Integer | Anzahl der Daten für ein Array fester Größe |

### Property(String name, Class<?> type) {#Property-java.lang.String-java.lang.Class----}
```
public Property(String name, Class<?> type)
```


Konstruktor der Metadaten‑Eigenschaft

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Der eindeutige Name der Eigenschaft |
| type | java.lang.Class<?> | Datentyp der Eigenschaft |

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
### getCount() {#getCount--}
```
public Integer getCount()
```


Anzahl der Daten für ein Array fester Größe.

**Returns:**
java.lang.Integer - Anzahl der Daten für ein Array fester Größe.
### getDescription() {#getDescription--}
```
public String getDescription()
```


Die Beschreibung der Eigenschaft

**Returns:**
java.lang.String - Die Beschreibung der Eigenschaft
### getDisplayName() {#getDisplayName--}
```
public String getDisplayName()
```


Der Name der Eigenschaft, verwendet von der UI zur Darstellung.

**Returns:**
java.lang.String - Der Name der Eigenschaft, von der UI zur Darstellung verwendet.
### getEnumType() {#getEnumType--}
```
public StructuralMetadata.EnumType getEnumType()
```


Der Enum‑Typ

**Returns:**
[EnumType](../../com.aspose.threed/enumtype) - The enum type
### getName() {#getName--}
```
public String getName()
```


Der eindeutige Name der Eigenschaft

**Returns:**
java.lang.String - Der eindeutige Name der Eigenschaft
### getNormalized() {#getNormalized--}
```
public boolean getNormalized()
```


Ist die Daten normalisiert.

**Returns:**
boolean - Ist die Daten normalisiert.
### getType() {#getType--}
```
public Class<?> getType()
```


Der Datentyp der Eigenschaft

**Returns:**
java.lang.Class<?> - Der Datentyp der Eigenschaft
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




### setCount(Integer value) {#setCount-java.lang.Integer-}
```
public void setCount(Integer value)
```


Anzahl der Daten für ein Array fester Größe.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.Integer | Neuer Wert |

### setDescription(String value) {#setDescription-java.lang.String-}
```
public void setDescription(String value)
```


Die Beschreibung der Eigenschaft

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert |

### setDisplayName(String value) {#setDisplayName-java.lang.String-}
```
public void setDisplayName(String value)
```


Der Name der Eigenschaft, verwendet von der UI zur Darstellung.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert |

### setEnumType(StructuralMetadata.EnumType value) {#setEnumType-com.aspose.threed.StructuralMetadata.EnumType-}
```
public void setEnumType(StructuralMetadata.EnumType value)
```


Der Enum‑Typ

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [EnumType](../../com.aspose.threed/enumtype) | Neuer Wert |

### setNormalized(boolean value) {#setNormalized-boolean-}
```
public void setNormalized(boolean value)
```


Ist die Daten normalisiert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### toString() {#toString--}
```
public String toString()
```


Gibt die String-Darstellung dieser Instanz zurück.

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

