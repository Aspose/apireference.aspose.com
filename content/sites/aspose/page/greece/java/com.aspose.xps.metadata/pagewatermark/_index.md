---
title: "PageWatermark"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Περιγράφει τη ρύθμιση υδατογραφήματος της εξόδου και τα χαρακτηριστικά του υδατογραφήματος."
type: docs
weight: 131
url: /el/java/com.aspose.xps.metadata/pagewatermark/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem), [com.aspose.xps.metadata.IPagePrintTicketItem](../../com.aspose.xps.metadata/ipageprintticketitem)
```
public final class PageWatermark extends Feature implements IJobPrintTicketItem, IDocumentPrintTicketItem, IPagePrintTicketItem
```

Περιγράφει τη ρύθμιση υδατογραφήματος της εξόδου και τα χαρακτηριστικά του υδατογραφήματος. Τα υδατογραφήματα εφαρμόζονται στη λογική σελίδα, όχι στη φυσική σελίδα. Για παράδειγμα, εάν το  DocumentDuplex  είναι ενεργοποιημένο, ένα υδατογράφημα θα εμφανίζεται σε κάθε σελίδα  NUp  σε κάθε φύλλο. Εάν το  DocumentDuplex ,  PagesPerSheet =2, τότε κάθε φύλλο θα έχει 2 υδατογραφήματα. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark
## Κατασκευαστές

| Κατασκευαστής | Περιγραφή |
| --- | --- |
| [PageWatermark(PageWatermark.IPageWatermarkItem[] items)](#PageWatermark-com.aspose.xps.metadata.PageWatermark.IPageWatermarkItem...-) | Δημιουργεί μια νέα παρουσία. |
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
### PageWatermark(PageWatermark.IPageWatermarkItem[] items) {#PageWatermark-com.aspose.xps.metadata.PageWatermark.IPageWatermarkItem...-}
```
public PageWatermark(PageWatermark.IPageWatermarkItem[] items)
```


Δημιουργεί μια νέα παρουσία.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| items | [IPageWatermarkItem\[\]](../../com.aspose.xps.metadata/ipagewatermarkitem) | Ένας πίνακας στοιχείων συγκεκριμένων για το χαρακτηριστικό. |

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

