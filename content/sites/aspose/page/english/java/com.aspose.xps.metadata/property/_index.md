---
title: Property
second_title: Aspose.Page for Java API Reference
description: Class implementing print ticket property.
type: docs
weight: 143
url: /java/com.aspose.xps.metadata/property/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IPrintTicketItem](../../com.aspose.xps.metadata/iprintticketitem), [com.aspose.xps.metadata.IFeatureItem](../../com.aspose.xps.metadata/ifeatureitem), [com.aspose.xps.metadata.IOptionItem](../../com.aspose.xps.metadata/ioptionitem), [com.aspose.xps.metadata.IScoredPropertyItem](../../com.aspose.xps.metadata/iscoredpropertyitem), [com.aspose.xps.metadata.IPropertyItem](../../com.aspose.xps.metadata/ipropertyitem)
```
public class Property extends CompositePrintTicketElement implements IPrintTicketItem, IFeatureItem, IOptionItem, IScoredPropertyItem, IPropertyItem
```

Class implementing print ticket property. The class that implements a common PrintTicket  Property . The base class for all schema-defined properties. A  Property  element declares a device, job formatting, or other relevant property whose name is given by its name attribute. A  Value  element is used to assign a value to the  Property . A  Property  can be complex, possibly containing multiple subproperties. Subproperties are also represented by  Property  elements. https://docs.microsoft.com/en-us/windows/win32/printdocs/property
## Constructors

| Constructor | Description |
| --- | --- |
| [Property(String name, Property property, IPropertyItem[] items)](#Property-java.lang.String-com.aspose.xps.metadata.Property-com.aspose.xps.metadata.IPropertyItem...-) | Creates a new instance. |
| [Property(String name, Value value, IPropertyItem[] items)](#Property-java.lang.String-com.aspose.xps.metadata.Value-com.aspose.xps.metadata.IPropertyItem...-) | Creates a new instance. |
### Property(String name, Property property, IPropertyItem[] items) {#Property-java.lang.String-com.aspose.xps.metadata.Property-com.aspose.xps.metadata.IPropertyItem...-}
```
public Property(String name, Property property, IPropertyItem[] items)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | A property name. |
| property | [Property](../../com.aspose.xps.metadata/property) | A mandatory  Property  instance. |
| items | com.aspose.xps.metadata.IPropertyItem[] | An arbitrary array of  IPropertyItem  instance. Each one must be a  Property  or a  Value  instance. |

### Property(String name, Value value, IPropertyItem[] items) {#Property-java.lang.String-com.aspose.xps.metadata.Value-com.aspose.xps.metadata.IPropertyItem...-}
```
public Property(String name, Value value, IPropertyItem[] items)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | A property name. |
| value | [Value](../../com.aspose.xps.metadata/value) | A mandatory  Value  instance. |
| items | com.aspose.xps.metadata.IPropertyItem[] | An arbitrary array of  IPropertyItem  instance. Each one must be a  Property  or a  Value  instance. |

