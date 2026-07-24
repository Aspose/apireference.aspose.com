---
title: "JobDuplexAllDocumentsContiguously"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Περιγράφει τα χαρακτηριστικά διπλής όψης της εξόδου."
type: docs
weight: 52
url: /el/java/com.aspose.xps.metadata/jobduplexalldocumentscontiguously/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature), [com.aspose.xps.metadata.Duplex](../../com.aspose.xps.metadata/duplex)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem)
```
public final class JobDuplexAllDocumentsContiguously extends Duplex implements IJobPrintTicketItem
```

Περιγράφει τα χαρακτηριστικά διπλής όψης του αποτελέσματος. Η δυνατότητα duplex επιτρέπει την εκτύπωση και στις δύο πλευρές του μέσου. Όλα τα Documents στη δουλειά εκτυπώνονται διπλής όψης μαζί συνεχόμενα.  JobDuplexAllDocumentsContiguously  και  DocumentDuplex  είναι αμοιβαία αποκλειστικά. Εξαρτάται από τον οδηγό να καθορίσει τη διαχείριση περιορισμών μεταξύ αυτών των λέξεων-κλειδιών. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobduplexalldocumentscontiguously
## Κατασκευαστές

| Κατασκευαστής | Περιγραφή |
| --- | --- |
| [JobDuplexAllDocumentsContiguously(Duplex.DuplexOption[] options)](#JobDuplexAllDocumentsContiguously-com.aspose.xps.metadata.Duplex.DuplexOption...-) | Δημιουργεί μια νέα παρουσία. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [add(IFeatureItem[] items)](#add-com.aspose.xps.metadata.IFeatureItem...-) | Προσθέτει μια λίστα αντικειμένων στο τέλος της λίστας αντικειμένων αυτής της λειτουργίας. |
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
### JobDuplexAllDocumentsContiguously(Duplex.DuplexOption[] options) {#JobDuplexAllDocumentsContiguously-com.aspose.xps.metadata.Duplex.DuplexOption...-}
```
public JobDuplexAllDocumentsContiguously(Duplex.DuplexOption[] options)
```


Δημιουργεί μια νέα παρουσία.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| options | [DuplexOption\[\]](../../com.aspose.xps.metadata/duplexoption) | Ένας πίνακας επιλογών συγκεκριμένων για τη λειτουργία. |

### add(IFeatureItem[] items) {#add-com.aspose.xps.metadata.IFeatureItem...-}
```
public void add(IFeatureItem[] items)
```


Προσθέτει μια λίστα αντικειμένων στο τέλος της λίστας αντικειμένων αυτής της λειτουργίας. Κάθε ένα πρέπει να είναι ένα  Feature , ένα  Option , ή ένα  Property  αντικείμενο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | Λίστα αντικειμένων προς προσθήκη. |

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

