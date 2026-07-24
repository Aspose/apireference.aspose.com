---
title: "DocumentBannerSheet"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Περιγράφει το φύλλο banner που θα εκτυπωθεί για ένα συγκεκριμένο έγγραφο."
type: docs
weight: 13
url: /el/java/com.aspose.xps.metadata/documentbannersheet/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem)
```
public final class DocumentBannerSheet extends Feature implements IJobPrintTicketItem, IDocumentPrintTicketItem
```

Περιγράφει το φύλλο banner που θα εκτυπωθεί για ένα συγκεκριμένο έγγραφο. Το φύλλο banner πρέπει να εκτυπωθεί στο προεπιλεγμένο  PageMediaSize  και χρησιμοποιώντας το προεπιλεγμένο  PageMediaType . Το φύλλο banner πρέπει επίσης να είναι απομονωμένο από το υπόλοιπο της εργασίας. Αυτό σημαίνει ότι οποιεσδήποτε επιλογές φινιρίσματος ή επεξεργασίας (όπως  DocumentDuplex ,  DocumentStaple , ή  DocumentBinding ) δεν πρέπει να περιλαμβάνουν το φύλλο banner. Το φύλλο banner μπορεί ή δεν μπορεί να είναι απομονωμένο από το υπόλοιπο της εργασίας. Αυτό σημαίνει ότι οποιεσδήποτε επιλογές φινιρίσματος ή επεξεργασίας εργασίας, μπορεί να περιλαμβάνουν το banner του εγγράφου. Το φύλλο banner πρέπει να εμφανίζεται ως το πρώτο φύλλο του εγγράφου. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet
## Κατασκευαστές

| Κατασκευαστής | Περιγραφή |
| --- | --- |
| [DocumentBannerSheet(DocumentBannerSheet.BannerSheetOption[] options)](#DocumentBannerSheet-com.aspose.xps.metadata.DocumentBannerSheet.BannerSheetOption...-) | Δημιουργεί μια νέα παρουσία. |
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
### DocumentBannerSheet(DocumentBannerSheet.BannerSheetOption[] options) {#DocumentBannerSheet-com.aspose.xps.metadata.DocumentBannerSheet.BannerSheetOption...-}
```
public DocumentBannerSheet(DocumentBannerSheet.BannerSheetOption[] options)
```


Δημιουργεί μια νέα παρουσία.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| options | [BannerSheetOption\[\]](../../com.aspose.xps.metadata/bannersheetoption) | Ένας πίνακας επιλογών συγκεκριμένων για τη λειτουργία. |

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

