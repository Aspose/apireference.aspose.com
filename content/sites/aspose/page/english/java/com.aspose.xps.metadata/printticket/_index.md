---
title: PrintTicket
second_title: Aspose.Page for Java API Reference
description: The class that implements a common PrintTicket of any scope.
type: docs
weight: 141
url: /java/com.aspose.xps.metadata/printticket/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.lang.Iterable
```
public abstract class PrintTicket implements Iterable<String>
```

The class that implements a common PrintTicket of any scope. The base class for job-, document- and page-level print tickets. A \`\`\` PrintTicket \`\`\` element is the root element of the PrintTicket document. A \`\`\` PrintTicket \`\`\` element contains all job formatting information required to output a job. https://docs.microsoft.com/en-us/windows/win32/printdocs/printticket
## Constructors

| Constructor | Description |
| --- | --- |
| [PrintTicket(IPrintTicketItem[] items)](#PrintTicket-com.aspose.xps.metadata.IPrintTicketItem...-) | Creates a new instance. |
## Methods

| Method | Description |
| --- | --- |
| [remove(String[] names)](#remove-java.lang.String...-) | Removes an item from this PrintTicket item list. |
| [iterator()](#iterator--) | Returns the print ticket item names iterator. |
### PrintTicket(IPrintTicketItem[] items) {#PrintTicket-com.aspose.xps.metadata.IPrintTicketItem...-}
```
public PrintTicket(IPrintTicketItem[] items)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| items | com.aspose.xps.metadata.IPrintTicketItem[] | An arbitrary array of \`\`\` IPrintTicketItem \`\`\` instances. Each one must be a \`\`\` Feature \`\`\`, a \`\`\` ParameterInit \`\`\` or a \`\`\` Property \`\`\` instance. |

### remove(String[] names) {#remove-java.lang.String...-}
```
public void remove(String[] names)
```


Removes an item from this PrintTicket item list.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| names | java.lang.String[] | An array of item names. |

### iterator() {#iterator--}
```
public Iterator<String> iterator()
```


Returns the print ticket item names iterator.

**Returns:**
java.util.Iterator<java.lang.String> - Returns iterator for the list.
