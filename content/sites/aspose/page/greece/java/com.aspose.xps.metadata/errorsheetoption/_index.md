---
title: "JobErrorSheet.ErrorSheetOption"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Περιγράφει τις επιλογές χαρακτηριστικού JobErrorSheet."
type: docs
weight: 10
url: /el/java/com.aspose.xps.metadata/joberrorsheet.errorsheetoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.JobErrorSheet.IJobErrorSheetItem](../../com.aspose.xps.metadata/ijoberrorsheetitem)
```
public static final class JobErrorSheet.ErrorSheetOption extends Option implements JobErrorSheet.IJobErrorSheetItem
```

Περιγράφει τις επιλογές λειτουργίας JobErrorSheet.
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| [Custom](#Custom) | Καθορίζει ότι πρέπει να παραχθεί ένα προσαρμοσμένο φύλλο σφάλματος. |
| [None](#None) | Καθορίζει ότι δεν πρέπει να εκτυπωθεί φύλλο σφάλματος. |
| [Standard](#Standard) | Καθορίζει ότι πρέπει να εκτυπωθεί το τυπικό (ορίζεται από τη συσκευή) φύλλο σφάλματος. |
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
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Custom {#Custom}
```
public static final JobErrorSheet.ErrorSheetOption Custom
```


Καθορίζει ότι πρέπει να εκτυπωθεί προσαρμοσμένο φύλλο σφάλματος. Εάν δεν καθοριστεί ένα στοιχείο  JobErrorSheetSource   ParameterInit , αυτή η επιλογή πρέπει να αγνοηθεί.

### None {#None}
```
public static final JobErrorSheet.ErrorSheetOption None
```


Καθορίζει ότι δεν πρέπει να εκτυπωθεί φύλλο σφάλματος.

### Standard {#Standard}
```
public static final JobErrorSheet.ErrorSheetOption Standard
```


Καθορίζει ότι πρέπει να εκτυπωθεί το τυπικό (ορίζεται από τη συσκευή) φύλλο σφάλματος.

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

