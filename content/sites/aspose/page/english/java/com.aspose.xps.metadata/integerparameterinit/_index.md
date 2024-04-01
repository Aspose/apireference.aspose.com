---
title: IntegerParameterInit
second_title: Aspose.Page for Java API Reference
description: Base class for all integer parameter initializers.
type: docs
weight: 42
url: /java/com.aspose.xps.metadata/integerparameterinit/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.ParameterInit](../../com.aspose.xps.metadata/parameterinit)
```
public abstract class IntegerParameterInit extends ParameterInit
```

Base class for all integer parameter initializers.
## Constructors

| Constructor | Description |
| --- | --- |
| [IntegerParameterInit(String name, int value)](#IntegerParameterInit-java.lang.String-int-) | Creates a new instance. |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getMaxValue()](#getMaxValue--) | For integer- or decimal-valued parameters, defines the largest allowed value. |
| [getMinValue()](#getMinValue--) | For integer- or decimal-valued parameters, defines the smallest allowed value. |
| [getMultiple()](#getMultiple--) | For integer- or decimal-valued parameters, the value of the parameter should be a multiple of this number. |
| [getName()](#getName--) | Gets the element name. |
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


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | The parameter name. |
| value | int | The parameter value. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
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


For integer- or decimal-valued parameters, defines the largest allowed value.

**Returns:**
int - The largest allowed value.
### getMinValue() {#getMinValue--}
```
public int getMinValue()
```


For integer- or decimal-valued parameters, defines the smallest allowed value.

**Returns:**
int - The smallest allowed value.
### getMultiple() {#getMultiple--}
```
public int getMultiple()
```


For integer- or decimal-valued parameters, the value of the parameter should be a multiple of this number.

**Returns:**
int - The number of which the parameter should be a multiple.
### getName() {#getName--}
```
public String getName()
```


Gets the element name.

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
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

