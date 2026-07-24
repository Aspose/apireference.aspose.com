---
title: "IntegerParameterInit"
second_title: "Aspose.Page voor Java API-referentie"
description: "Basisklasse voor alle integer-parameterinitialisatoren."
type: docs
weight: 42
url: /nl/java/com.aspose.xps.metadata/integerparameterinit/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.ParameterInit](../../com.aspose.xps.metadata/parameterinit)
```
public abstract class IntegerParameterInit extends ParameterInit
```

Basisklasse voor alle integer-parameterinitialisatoren.
## Constructors

| Constructor | Beschrijving |
| --- | --- |
| [IntegerParameterInit(String name, int value)](#IntegerParameterInit-java.lang.String-int-) | Maakt een nieuw exemplaar aan. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getMaxValue()](#getMaxValue--) | Voor parameters met een geheel- of decimale waarde, definieert de grootste toegestane waarde. |
| [getMinValue()](#getMinValue--) | Voor parameters met een geheel- of decimale waarde, definieert de kleinste toegestane waarde. |
| [getMultiple()](#getMultiple--) | Voor parameters met een geheel- of decimale waarde, moet de waarde van de parameter een veelvoud zijn van dit getal. |
| [getName()](#getName--) | Haalt de elementnaam op. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### IntegerParameterInit(String name, int value) {#IntegerParameterInit-java.lang.String-int-}
```
public IntegerParameterInit(String name, int value)
```


Maakt een nieuw exemplaar aan.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| naam | java.lang.String | De parameternaam. |
| waarde | int | De parameterwaarde. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
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
### getMaxValue() {#getMaxValue--}
```
public int getMaxValue()
```


Voor parameters met een geheel- of decimale waarde, definieert de grootste toegestane waarde.

**Returns:**
int - De grootste toegestane waarde.
### getMinValue() {#getMinValue--}
```
public int getMinValue()
```


Voor parameters met een geheel- of decimale waarde, definieert de kleinste toegestane waarde.

**Returns:**
int - De kleinste toegestane waarde.
### getMultiple() {#getMultiple--}
```
public int getMultiple()
```


Voor parameters met een geheel- of decimale waarde, moet de waarde van de parameter een veelvoud zijn van dit getal.

**Returns:**
int - Het getal waarvan de parameter een veelvoud moet zijn.
### getName() {#getName--}
```
public String getName()
```


Haalt de elementnaam op.

**Returns:**
java.lang.String
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
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

