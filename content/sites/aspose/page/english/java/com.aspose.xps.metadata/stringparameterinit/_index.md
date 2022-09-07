---
title: StringParameterInit
second_title: Aspose.Page for Java API Reference
description: Base class for all string parameter initializers.
type: docs
weight: 149
url: /java/com.aspose.xps.metadata/stringparameterinit/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.ParameterInit](../../com.aspose.xps.metadata/parameterinit)
```
public abstract class StringParameterInit extends ParameterInit
```

Base class for all string parameter initializers.
## Constructors

| Constructor | Description |
| --- | --- |
| [StringParameterInit(String name, String value)](#StringParameterInit-java.lang.String-java.lang.String-) | Creates a new instance. |
## Methods

| Method | Description |
| --- | --- |
| [getMinLength()](#getMinLength--) | For string values, defines the shortest allowed string. |
| [getMaxLength()](#getMaxLength--) | For string values, defines the shortest longest string. |
### StringParameterInit(String name, String value) {#StringParameterInit-java.lang.String-java.lang.String-}
```
public StringParameterInit(String name, String value)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | The parameter name. |
| value | java.lang.String | The parameter value. |

### getMinLength() {#getMinLength--}
```
public int getMinLength()
```


For string values, defines the shortest allowed string.

**Returns:**
int - The shortest allowed string.
### getMaxLength() {#getMaxLength--}
```
public int getMaxLength()
```


For string values, defines the shortest longest string.

**Returns:**
int - The longest allowed string.
