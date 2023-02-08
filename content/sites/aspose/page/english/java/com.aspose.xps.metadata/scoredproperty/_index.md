---
title: ScoredProperty
second_title: Aspose.Page for Java API Reference
description: The class that implements a common PrintTicket ScoredProperty.
type: docs
weight: 146
url: /java/com.aspose.xps.metadata/scoredproperty/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IOptionItem](../../com.aspose.xps.metadata/ioptionitem), [com.aspose.xps.metadata.IScoredPropertyItem](../../com.aspose.xps.metadata/iscoredpropertyitem)
```
public class ScoredProperty extends CompositePrintTicketElement implements IOptionItem, IScoredPropertyItem
```

The class that implements a common PrintTicket  ScoredProperty . The base class for all schema-defined scored properties. A  ScoredProperty  element declares a property that is intrinsic to an  Option  definition. Such properties should be compared when evaluating how closely a requested  Option  matches a device-supported  Option . https://docs.microsoft.com/en-us/windows/win32/printdocs/scoredproperty
## Constructors

| Constructor | Description |
| --- | --- |
| [ScoredProperty(String name, ParameterRef parameterRef)](#ScoredProperty-java.lang.String-com.aspose.xps.metadata.ParameterRef-) | Creates a new instance. |
| [ScoredProperty(String name, Value value, IScoredPropertyItem[] items)](#ScoredProperty-java.lang.String-com.aspose.xps.metadata.Value-com.aspose.xps.metadata.IScoredPropertyItem...-) | Creates a new instance. |
### ScoredProperty(String name, ParameterRef parameterRef) {#ScoredProperty-java.lang.String-com.aspose.xps.metadata.ParameterRef-}
```
public ScoredProperty(String name, ParameterRef parameterRef)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | A property name. |
| parameterRef | [ParameterRef](../../com.aspose.xps.metadata/parameterref) | A  ParameterRef  instance. |

### ScoredProperty(String name, Value value, IScoredPropertyItem[] items) {#ScoredProperty-java.lang.String-com.aspose.xps.metadata.Value-com.aspose.xps.metadata.IScoredPropertyItem...-}
```
public ScoredProperty(String name, Value value, IScoredPropertyItem[] items)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | A property name. |
| value | [Value](../../com.aspose.xps.metadata/value) | A property value. |
| items | com.aspose.xps.metadata.IScoredPropertyItem[] | An arbitrary array of  IScoredPropertyItem  instance. Each one must be a  ScoredProperty , a  Property  or a  Value  instance. |

