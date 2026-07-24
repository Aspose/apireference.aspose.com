---
title: "OutputBin.OutputBinOption"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Περιγράφει τις επιλογές χαρακτηριστικών του JobOutputBin, DocumentOutputBin και PageOutputBin."
type: docs
weight: 12
url: /el/java/com.aspose.xps.metadata/outputbin.outputbinoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.OutputBin.IOutputBinItem](../../com.aspose.xps.metadata/ioutputbinitem)
```
public static final class OutputBin.OutputBinOption extends Option implements OutputBin.IOutputBinItem
```

Περιγράφει τις επιλογές δυνατοτήτων  JobOutputBin ,  DocumentOutputBin  και  PageOutputBin .
## Κατασκευαστές

| Κατασκευαστής | Περιγραφή |
| --- | --- |
| [OutputBinOption(OutputBin.IOutputBinOptionItem[] items)](#OutputBinOption-com.aspose.xps.metadata.OutputBin.IOutputBinOptionItem...-) | Δημιουργεί μια νέα παρουσία. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Προσθέτει μια λίστα αντικειμένων στο τέλος της λίστας αντικειμένων αυτής της επιλογής. |
| [add(OutputBin.IOutputBinOptionItem[] items)](#add-com.aspose.xps.metadata.OutputBin.IOutputBinOptionItem...-) | Προσθέτει έναν πίνακα από στιγμιότυπα του IOutputBinOptionItem στη δυνατότητα. |
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
### OutputBinOption(OutputBin.IOutputBinOptionItem[] items) {#OutputBinOption-com.aspose.xps.metadata.OutputBin.IOutputBinOptionItem...-}
```
public OutputBinOption(OutputBin.IOutputBinOptionItem[] items)
```


Δημιουργεί μια νέα παρουσία.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| items | [IOutputBinOptionItem\[\]](../../com.aspose.xps.metadata/ioutputbinoptionitem) | Ένας αυθαίρετος πίνακας από στιγμιότυπα του IOutputBinOptionItem. |

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Προσθέτει μια λίστα αντικειμένων στο τέλος της λίστας αντικειμένων αυτής της επιλογής. Κάθε ένα πρέπει να είναι ένα  ScoredProperty  ή ένα  Property  αντικείμενο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Λίστα αντικειμένων προς προσθήκη. |

### add(OutputBin.IOutputBinOptionItem[] items) {#add-com.aspose.xps.metadata.OutputBin.IOutputBinOptionItem...-}
```
public OutputBin.OutputBinOption add(OutputBin.IOutputBinOptionItem[] items)
```


Προσθέτει έναν πίνακα από στιγμιότυπα του IOutputBinOptionItem στη δυνατότητα.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| items | [IOutputBinOptionItem\[\]](../../com.aspose.xps.metadata/ioutputbinoptionitem) | Ένας αυθαίρετος πίνακας από στιγμιότυπα του IOutputBinOptionItem. |

**Returns:**
[OutputBinOption](../../com.aspose.xps.metadata/outputbinoption) - This options instance.
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

