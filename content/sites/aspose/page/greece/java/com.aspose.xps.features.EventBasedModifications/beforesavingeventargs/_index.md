---
title: "BeforeSavingEventArgs"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Ορίζει τη βασική κλάση για τα επιχειρήματα διαφόρων συμβάντων πριν από την αποθήκευση."
type: docs
weight: 11
url: /el/java/com.aspose.xps.features.eventbasedmodifications/beforesavingeventargs/
---
**Inheritance:**
java.lang.Object
```
public class BeforeSavingEventArgs<T>
```

Ορίζει τη βασική κλάση για τα επιχειρήματα διαφόρων συμβάντων πριν από την αποθήκευση.
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAbsolutePageNumber()](#getAbsolutePageNumber--) | Επιστρέφει τον τρέχοντα απόλυτο αριθμό σελίδας σε όλα τα έγγραφα του πακέτου XPS. |
| [getClass()](#getClass--) |  |
| [getDocumentNumber()](#getDocumentNumber--) | Επιστρέφει τον τρέχοντα αριθμό εγγράφου μέσα στο πακέτο XPS. |
| [getElementAPI()](#getElementAPI--) | Επιστρέφει το API τροποποίησης του στοιχείου που πρόκειται να αποθηκευτεί. |
| [getOutputPageNumber()](#getOutputPageNumber--) | Επιστρέφει τον τρέχοντα αριθμό εξόδου. |
| [getRelativePageNumber()](#getRelativePageNumber--) | Επιστρέφει τον τρέχοντα αριθμό σελίδας σε σχέση με το τρέχον έγγραφο μέσα στο πακέτο XPS. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### getAbsolutePageNumber() {#getAbsolutePageNumber--}
```
public int getAbsolutePageNumber()
```


Επιστρέφει τον τρέχοντα απόλυτο αριθμό σελίδας σε όλα τα έγγραφα του πακέτου XPS.

**Returns:**
int - Ο τρέχων απόλυτος αριθμός σελίδας σε όλα τα έγγραφα του πακέτου XPS.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDocumentNumber() {#getDocumentNumber--}
```
public int getDocumentNumber()
```


Επιστρέφει τον τρέχοντα αριθμό εγγράφου μέσα στο πακέτο XPS.

**Returns:**
int - Ο τρέχων αριθμός εγγράφου μέσα στο πακέτο XPS.
### getElementAPI() {#getElementAPI--}
```
public T getElementAPI()
```


Επιστρέφει το API τροποποίησης του στοιχείου που πρόκειται να αποθηκευτεί.

**Returns:**
T - Το API τροποποίησης του στοιχείου που πρόκειται να αποθηκευτεί.
### getOutputPageNumber() {#getOutputPageNumber--}
```
public int getOutputPageNumber()
```


Επιστρέφει τον τρέχοντα αριθμό εξόδου. Διαφέρει από **AbsolutePageNumber** εάν έχει οριστεί η επιλογή αποθήκευσης **PageNumbers**.

**Returns:**
int - Ο τρέχων αριθμός εξόδου.
### getRelativePageNumber() {#getRelativePageNumber--}
```
public int getRelativePageNumber()
```


Επιστρέφει τον τρέχοντα αριθμό σελίδας σε σχέση με το τρέχον έγγραφο μέσα στο πακέτο XPS.

**Returns:**
int - Ο τρέχων αριθμός σελίδας σε σχέση με το τρέχον έγγραφο μέσα στο πακέτο XPS.
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

