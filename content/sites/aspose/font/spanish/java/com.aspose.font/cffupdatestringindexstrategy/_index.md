---
title: "CffUpdateStringIndexStrategy"
second_title: "Referencia de API de Aspose.Font para Java"
description: "Especifica cómo agregar cadenas al almacenamiento CFF String INDEX."
type: docs
weight: 134
url: /es/java/com.aspose.font/cffupdatestringindexstrategy/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum CffUpdateStringIndexStrategy extends Enum<CffUpdateStringIndexStrategy>
```

Especifica cómo agregar cadenas al almacenamiento CFF String INDEX. Cuando intentamos agregar una cadena al CFF String INDEX, puede haber una situación en la que esa cadena ya esté presente en String INDEX. Usando la opción SearchForDuplicates podemos forzar la búsqueda en String INDEX para detectar si la cadena ya está presente o no. Este enfoque ahorra espacio en la estructura String INDEX, pero requiere más tiempo para agregar la cadena.
## Campos

| Campo | Descripción |
| --- | --- |
| [AddStringAsIs](#AddStringAsIs) | Especifica que no se deben realizar comprobaciones de duplicados al agregar una cadena. |
| [SearchForDuplicates](#SearchForDuplicates) | Especifica que la búsqueda de la cadena a agregar debe realizarse en la estructura String INDEX para evitar agregar duplicados. |
## Métodos

| Método | Descripción |
| --- | --- |
| [<T>valueOf(Class<T> arg0, String arg1)](#-T-valueOf-java.lang.Class-T--java.lang.String-) |  |
| [compareTo(E arg0)](#compareTo-E-) |  |
| [describeConstable()](#describeConstable--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDeclaringClass()](#getDeclaringClass--) |  |
| [hashCode()](#hashCode--) |  |
| [name()](#name--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [ordinal()](#ordinal--) |  |
| [toString()](#toString--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
| [values()](#values--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### AddStringAsIs {#AddStringAsIs}
```
public static final CffUpdateStringIndexStrategy AddStringAsIs
```


Especifica que no se deben realizar comprobaciones de duplicados al agregar una cadena. Este enfoque funciona más rápido, pero puede resultar en un uso ineficiente de la memoria para String INDEX.

### SearchForDuplicates {#SearchForDuplicates}
```
public static final CffUpdateStringIndexStrategy SearchForDuplicates
```


Especifica que la búsqueda de la cadena a agregar debe realizarse en la estructura String INDEX para evitar agregar duplicados.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | java.lang.Class<T> |  |
| arg1 | java.lang.String |  |

**Returns:**
T
### compareTo(E arg0) {#compareTo-E-}
```
public final int compareTo(E arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | E |  |

**Returns:**
int
### describeConstable() {#describeConstable--}
```
public final Optional<Enum.EnumDesc<E>> describeConstable()
```




**Returns:**
java.util.Optional<java.lang.Enum.EnumDesc<E>>
### equals(Object arg0) {#equals-java.lang.Object-}
```
public final boolean equals(Object arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
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
### getDeclaringClass() {#getDeclaringClass--}
```
public final Class<E> getDeclaringClass()
```




**Returns:**
java.lang.Class<E>
### hashCode() {#hashCode--}
```
public final int hashCode()
```




**Returns:**
int
### name() {#name--}
```
public final String name()
```




**Returns:**
java.lang.String
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### ordinal() {#ordinal--}
```
public final int ordinal()
```




**Returns:**
int
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static CffUpdateStringIndexStrategy valueOf(String name)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| nombre | java.lang.String |  |

**Returns:**
[CffUpdateStringIndexStrategy](../../com.aspose.font/cffupdatestringindexstrategy)
### values() {#values--}
```
public static CffUpdateStringIndexStrategy[] values()
```




**Returns:**
com.aspose.font.CffUpdateStringIndexStrategy[]
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

