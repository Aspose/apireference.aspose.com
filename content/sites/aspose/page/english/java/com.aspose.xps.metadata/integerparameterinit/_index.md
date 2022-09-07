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
| [getMinValue()](#getMinValue--) | For integer- or decimal-valued parameters, defines the smallest allowed value. |
| [getMaxValue()](#getMaxValue--) | For integer- or decimal-valued parameters, defines the largest allowed value. |
| [getMultiple()](#getMultiple--) | For integer- or decimal-valued parameters, the value of the parameter should be a multiple of this number. |
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

### getMinValue() {#getMinValue--}
```
public int getMinValue()
```


For integer- or decimal-valued parameters, defines the smallest allowed value.

**Returns:**
int - The smallest allowed value.
### getMaxValue() {#getMaxValue--}
```
public int getMaxValue()
```


For integer- or decimal-valued parameters, defines the largest allowed value.

**Returns:**
int - The largest allowed value.
### getMultiple() {#getMultiple--}
```
public int getMultiple()
```


For integer- or decimal-valued parameters, the value of the parameter should be a multiple of this number.

**Returns:**
int - The number of which the parameter should be a multiple.
