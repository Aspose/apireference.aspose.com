---
title: Option
second_title: Aspose.Page for Java API Reference
description: The class that implements a common PrintTicket Option.
type: docs
weight: 76
url: /java/com.aspose.xps.metadata/option/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IFeatureItem](../../com.aspose.xps.metadata/ifeatureitem)
```
public class Option extends CompositePrintTicketElement implements IFeatureItem
```

The class that implements a common PrintTicket  Option . The base class for all schema-defined options. An Option element contains all of the  Property  and  ScoredProperty  elements associated with this option. https://docs.microsoft.com/en-us/windows/win32/printdocs/option
## Constructors

| Constructor | Description |
| --- | --- |
| [Option(String name, IOptionItem[] items)](#Option-java.lang.String-com.aspose.xps.metadata.IOptionItem...-) | Creates a new PrintTicket option instance. |
| [Option(IOptionItem[] items)](#Option-com.aspose.xps.metadata.IOptionItem...-) | Creates a new PrintTicket option instance. |
| [Option(Option option)](#Option-com.aspose.xps.metadata.Option-) | Creates a clone option instance. |
## Methods

| Method | Description |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Adds a list of items to the end of this option's item list. |
### Option(String name, IOptionItem[] items) {#Option-java.lang.String-com.aspose.xps.metadata.IOptionItem...-}
```
public Option(String name, IOptionItem[] items)
```


Creates a new PrintTicket option instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | An arbitrary option name. |
| items | com.aspose.xps.metadata.IOptionItem[] | An arbitrary array of  IOptionItem  instance. Each one must be a  ScoredProperty  or a  Property  instance. |

### Option(IOptionItem[] items) {#Option-com.aspose.xps.metadata.IOptionItem...-}
```
public Option(IOptionItem[] items)
```


Creates a new PrintTicket option instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| items | com.aspose.xps.metadata.IOptionItem[] | An arbitrary array of  IOptionItem  instance. Each one must be a  ScoredProperty  or a  Property  instance. |

### Option(Option option) {#Option-com.aspose.xps.metadata.Option-}
```
public Option(Option option)
```


Creates a clone option instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| option | [Option](../../com.aspose.xps.metadata/option) | An option instance to clone. |

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Adds a list of items to the end of this option's item list. Each one must be a  ScoredProperty  or a  Property  instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| items | com.aspose.xps.metadata.IOptionItem[] | List of items to add. |

