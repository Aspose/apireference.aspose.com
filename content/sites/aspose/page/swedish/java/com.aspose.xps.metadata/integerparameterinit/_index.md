---
title: "IntegerParameterInit"
second_title: "Aspose.Page för Java API-referens"
description: "Bas‑klass för alla heltalsparameterinitialiserare."
type: docs
weight: 42
url: /sv/java/com.aspose.xps.metadata/integerparameterinit/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.ParameterInit](../../com.aspose.xps.metadata/parameterinit)
```
public abstract class IntegerParameterInit extends ParameterInit
```

Bas‑klass för alla heltalsparameterinitialiserare.
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [IntegerParameterInit(String name, int value)](#IntegerParameterInit-java.lang.String-int-) | Skapar en ny instans. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getMaxValue()](#getMaxValue--) | För parametrar med heltals- eller decimalvärde definierar den största tillåtna värdet. |
| [getMinValue()](#getMinValue--) | För parametrar med heltals- eller decimalvärde definierar den minsta tillåtna värdet. |
| [getMultiple()](#getMultiple--) | För parametrar med heltals- eller decimalvärde ska parametervärdet vara en multipel av detta tal. |
| [getName()](#getName--) | Hämtar elementets namn. |
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


Skapar en ny instans.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| name | java.lang.String | Parameterns namn. |
| value | int | Parametervärdet. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
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


För parametrar med heltals- eller decimalvärde definierar den största tillåtna värdet.

**Returns:**
int - Det största tillåtna värdet.
### getMinValue() {#getMinValue--}
```
public int getMinValue()
```


För parametrar med heltals- eller decimalvärde definierar den minsta tillåtna värdet.

**Returns:**
int - Det minsta tillåtna värdet.
### getMultiple() {#getMultiple--}
```
public int getMultiple()
```


För parametrar med heltals- eller decimalvärde ska parametervärdet vara en multipel av detta tal.

**Returns:**
int - Det tal som parametern ska vara en multipel av.
### getName() {#getName--}
```
public String getName()
```


Hämtar elementets namn.

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
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

