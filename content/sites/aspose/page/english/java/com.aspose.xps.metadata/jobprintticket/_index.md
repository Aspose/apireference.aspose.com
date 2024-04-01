---
title: JobPrintTicket
second_title: Aspose.Page for Java API Reference
description: The class that incapsulates a job-level print ticket.
type: docs
weight: 70
url: /java/com.aspose.xps.metadata/jobprintticket/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicket](../../com.aspose.xps.metadata/printticket)
```
public final class JobPrintTicket extends PrintTicket
```

The class that incapsulates a job-level print ticket.
## Constructors

| Constructor | Description |
| --- | --- |
| [JobPrintTicket(IJobPrintTicketItem[] items)](#JobPrintTicket-com.aspose.xps.metadata.IJobPrintTicketItem...-) | Creates a job-level print ticket instance. |
## Methods

| Method | Description |
| --- | --- |
| [add(IJobPrintTicketItem[] items)](#add-com.aspose.xps.metadata.IJobPrintTicketItem...-) | Adds an array of items to the end of this PrintTicket item list. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Returns the print ticket item names iterator. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(String[] names)](#remove-java.lang.String...-) | Removes an item from this PrintTicket item list. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### JobPrintTicket(IJobPrintTicketItem[] items) {#JobPrintTicket-com.aspose.xps.metadata.IJobPrintTicketItem...-}
```
public JobPrintTicket(IJobPrintTicketItem[] items)
```


Creates a job-level print ticket instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| items | [IJobPrintTicketItem\[\]](../../com.aspose.xps.metadata/ijobprintticketitem) | An arbitrary array of  IJobPrintTicketItem  instances. Each one can be a  Feature , a  ParameterInit  or a  Property  instance. |

### add(IJobPrintTicketItem[] items) {#add-com.aspose.xps.metadata.IJobPrintTicketItem...-}
```
public void add(IJobPrintTicketItem[] items)
```


Adds an array of items to the end of this PrintTicket item list. Each one may be a  Feature , a  ParameterInit  or a  Property  instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| items | [IJobPrintTicketItem\[\]](../../com.aspose.xps.metadata/ijobprintticketitem) | An array of items to add. |

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
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### iterator() {#iterator--}
```
public Iterator<String> iterator()
```


Returns the print ticket item names iterator.

**Returns:**
java.util.Iterator<java.lang.String> - Returns iterator for the list.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### remove(String[] names) {#remove-java.lang.String...-}
```
public void remove(String[] names)
```


Removes an item from this PrintTicket item list.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| names | java.lang.String[] | An array of item names. |

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

