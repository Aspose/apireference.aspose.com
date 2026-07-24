---
title: "InputBin.InputBinOption"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Περιγράφει τις επιλογές χαρακτηριστικών του JobInputBin, DocumentInputBin και PageInputBin."
type: docs
weight: 14
url: /el/java/com.aspose.xps.metadata/inputbin.inputbinoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.InputBin.IInputBinItem](../../com.aspose.xps.metadata/iinputbinitem)
```
public static final class InputBin.InputBinOption extends Option implements InputBin.IInputBinItem
```

Περιγράφει τις επιλογές λειτουργιών JobInputBin, DocumentInputBin και PageInputBin.
## Κατασκευαστές

| Κατασκευαστής | Περιγραφή |
| --- | --- |
| [InputBinOption(String optionName, InputBin.IInputBinOptionItem[] items)](#InputBinOption-java.lang.String-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-) | Δημιουργεί μια νέα παρουσία. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| [AutoSelect](#AutoSelect) | Η συσκευή θα επιλέξει αυτόματα την καλύτερη επιλογή βάσει της διαμόρφωσης. |
| [AutoSheetFeeder](#AutoSheetFeeder) | Δίσκος εισόδου συσκευής για εκτυπωτές ψεκασμού. |
| [Cassette](#Cassette) | Καθορίζει ότι το δοχείο τροφοδοσίας είναι κασέτα. |
| [Manual](#Manual) | Καθορίζει το προεπιλεγμένο χειροκίνητο δοχείο τροφοδοσίας. |
| [Tractor](#Tractor) | Καθορίζει ότι το δοχείο τροφοδοσίας είναι τράκτορας. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Προσθέτει μια λίστα αντικειμένων στο τέλος της λίστας αντικειμένων αυτής της επιλογής. |
| [add(InputBin.IInputBinOptionItem[] items)](#add-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-) | Προσθέτει έναν πίνακα από αντικείμενα  IInputBinOptionItem  στην επιλογή. |
| [clone()](#clone--) | Κλωνοποιεί αυτήν την παρουσία επιλογής. |
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
### InputBinOption(String optionName, InputBin.IInputBinOptionItem[] items) {#InputBinOption-java.lang.String-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-}
```
public InputBinOption(String optionName, InputBin.IInputBinOptionItem[] items)
```


Δημιουργεί μια νέα παρουσία.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| optionName | java.lang.String | Ένα όνομα επιλογής. |
| items | [IInputBinOptionItem\[\]](../../com.aspose.xps.metadata/iinputbinoptionitem) | Ένας αυθαίρετος πίνακας από αντικείμενα  IInputBinOptionItem . |

### AutoSelect {#AutoSelect}
```
public static final InputBin.InputBinOption AutoSelect
```


Η συσκευή θα επιλέξει αυτόματα την καλύτερη επιλογή βάσει της διαμόρφωσης.

### AutoSheetFeeder {#AutoSheetFeeder}
```
public static final InputBin.InputBinOption AutoSheetFeeder
```


Δίσκος εισόδου συσκευής για εκτυπωτές ψεκασμού.

### Cassette {#Cassette}
```
public static final InputBin.InputBinOption Cassette
```


Καθορίζει ότι το δοχείο τροφοδοσίας είναι κασέτα.

### Manual {#Manual}
```
public static final InputBin.InputBinOption Manual
```


Καθορίζει το προεπιλεγμένο χειροκίνητο δοχείο τροφοδοσίας.

### Tractor {#Tractor}
```
public static final InputBin.InputBinOption Tractor
```


Καθορίζει ότι το δοχείο τροφοδοσίας είναι τράκτορας.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Προσθέτει μια λίστα αντικειμένων στο τέλος της λίστας αντικειμένων αυτής της επιλογής. Κάθε ένα πρέπει να είναι ένα  ScoredProperty  ή ένα  Property  αντικείμενο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Λίστα αντικειμένων προς προσθήκη. |

### add(InputBin.IInputBinOptionItem[] items) {#add-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-}
```
public InputBin.InputBinOption add(InputBin.IInputBinOptionItem[] items)
```


Προσθέτει έναν πίνακα από αντικείμενα  IInputBinOptionItem  στην επιλογή.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| items | [IInputBinOptionItem\[\]](../../com.aspose.xps.metadata/iinputbinoptionitem) | Ένας αυθαίρετος πίνακας από αντικείμενα  IInputBinOptionItem . |

**Returns:**
[InputBinOption](../../com.aspose.xps.metadata/inputbinoption) - This options instance.
### clone() {#clone--}
```
public InputBin.InputBinOption clone()
```


Κλωνοποιεί αυτήν την παρουσία επιλογής.

**Returns:**
[InputBinOption](../../com.aspose.xps.metadata/inputbinoption) - The clone of this option instance.
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

