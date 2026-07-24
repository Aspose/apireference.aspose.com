---
title: "PageInputBin"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Περιγράφει το εγκατεστημένο εισαγωγικό κάδο σε μια συσκευή ή τη πλήρη λίστα των υποστηριζόμενων κάδων για μια συσκευή."
type: docs
weight: 100
url: /el/java/com.aspose.xps.metadata/pageinputbin/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature), [com.aspose.xps.metadata.InputBin](../../com.aspose.xps.metadata/inputbin)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem), [com.aspose.xps.metadata.IPagePrintTicketItem](../../com.aspose.xps.metadata/ipageprintticketitem)
```
public final class PageInputBin extends InputBin implements IJobPrintTicketItem, IDocumentPrintTicketItem, IPagePrintTicketItem
```

Περιγράφει το εγκατεστημένο εισαγωγικό κουτί σε μια συσκευή ή τη πλήρη λίστα των υποστηριζόμενων κουτιών για μια συσκευή. Επιτρέπει τον καθορισμό του εισαγωγικού κουτιού ανά σελίδα. Οι λέξεις-κλειδιά  JobInputBin ,  DocumentInputBin  και  PageInputBin  είναι αμοιβαία αποκλειστικές. Δεν πρέπει να καθορίζονται ταυτόχρονα σε ένα έγγραφο PrintTicket ή Print Capabilities. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin
## Κατασκευαστές

| Κατασκευαστής | Περιγραφή |
| --- | --- |
| [PageInputBin(InputBin.IInputBinItem[] items)](#PageInputBin-com.aspose.xps.metadata.InputBin.IInputBinItem...-) | Δημιουργεί μια νέα παρουσία. |
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
### PageInputBin(InputBin.IInputBinItem[] items) {#PageInputBin-com.aspose.xps.metadata.InputBin.IInputBinItem...-}
```
public PageInputBin(InputBin.IInputBinItem[] items)
```


Δημιουργεί μια νέα παρουσία.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| items | [IInputBinItem\[\]](../../com.aspose.xps.metadata/iinputbinitem) | Ένας πίνακας στοιχείων συγκεκριμένων για το χαρακτηριστικό. |

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

