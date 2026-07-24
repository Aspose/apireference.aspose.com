---
title: "Duplex.DuplexOption"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Περιγράφει τις επιλογές χαρακτηριστικών JobDuplexAllDocumentsContiguously και DocumentDuplex."
type: docs
weight: 11
url: /el/java/com.aspose.xps.metadata/duplex.duplexoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class Duplex.DuplexOption extends Option
```

Περιγράφει τις επιλογές λειτουργιών JobDuplexAllDocumentsContiguously και DocumentDuplex.
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| [OneSided](#OneSided) | Καθορίζει εκτύπωση μονής όψης. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Προσθέτει μια λίστα αντικειμένων στο τέλος της λίστας αντικειμένων αυτής της επιλογής. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Λαμβάνει το όνομα του στοιχείου. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [twoSidedLongEdge(Duplex.DuplexMode duplexMode)](#twoSidedLongEdge-com.aspose.xps.metadata.Duplex.DuplexMode-) | Καθορίζει εκτύπωση διπλής όψης έτσι ώστε η σελίδα να αναστρέφεται παράλληλα προς την κατεύθυνση  MediaSizeHeight . |
| [twoSidedShortEdge(Duplex.DuplexMode duplexMode)](#twoSidedShortEdge-com.aspose.xps.metadata.Duplex.DuplexMode-) | Καθορίζει εκτύπωση διπλής όψης έτσι ώστε η σελίδα να αναστρέφεται παράλληλα προς την κατεύθυνση  MediaSizeWidth . |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### OneSided {#OneSided}
```
public static final Duplex.DuplexOption OneSided
```


Καθορίζει εκτύπωση μονής όψης.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Προσθέτει μια λίστα αντικειμένων στο τέλος της λίστας αντικειμένων αυτής της επιλογής. Κάθε ένα πρέπει να είναι ένα  ScoredProperty  ή ένα  Property  αντικείμενο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Λίστα αντικειμένων προς προσθήκη. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
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
### getName() {#getName--}
```
public String getName()
```


Λαμβάνει το όνομα του στοιχείου.

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
### twoSidedLongEdge(Duplex.DuplexMode duplexMode) {#twoSidedLongEdge-com.aspose.xps.metadata.Duplex.DuplexMode-}
```
public static final Duplex.DuplexOption twoSidedLongEdge(Duplex.DuplexMode duplexMode)
```


Καθορίζει εκτύπωση διπλής όψης έτσι ώστε η σελίδα να αναστρέφεται παράλληλα προς την κατεύθυνση  MediaSizeHeight .

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| duplexMode | [DuplexMode](../../com.aspose.xps.metadata/duplexmode) | Η  DuplexMode |

**Returns:**
[DuplexOption](../../com.aspose.xps.metadata/duplexoption) - The  Duplex  option.
### twoSidedShortEdge(Duplex.DuplexMode duplexMode) {#twoSidedShortEdge-com.aspose.xps.metadata.Duplex.DuplexMode-}
```
public static final Duplex.DuplexOption twoSidedShortEdge(Duplex.DuplexMode duplexMode)
```


Καθορίζει εκτύπωση διπλής όψης έτσι ώστε η σελίδα να αναστρέφεται παράλληλα προς την κατεύθυνση  MediaSizeWidth .

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| duplexMode | [DuplexMode](../../com.aspose.xps.metadata/duplexmode) | Η  DuplexMode |

**Returns:**
[DuplexOption](../../com.aspose.xps.metadata/duplexoption) - The

```
Duplex
```

επιλογή.
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

