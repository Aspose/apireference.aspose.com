---
title: "PageDeviceColorSpaceProfileURI"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Καθορίζει μια σχετική URI στη ρίζα του πακέτου για ένα προφίλ ICC που περιέχεται σε ένα έγγραφο XPS."
type: docs
weight: 94
url: /el/java/com.aspose.xps.metadata/pagedevicecolorspaceprofileuri/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.ParameterInit](../../com.aspose.xps.metadata/parameterinit), [com.aspose.xps.metadata.StringParameterInit](../../com.aspose.xps.metadata/stringparameterinit)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem), [com.aspose.xps.metadata.IPagePrintTicketItem](../../com.aspose.xps.metadata/ipageprintticketitem)
```
public final class PageDeviceColorSpaceProfileURI extends StringParameterInit implements IJobPrintTicketItem, IDocumentPrintTicketItem, IPagePrintTicketItem
```

Καθορίζει ένα σχετικό URI προς τη ρίζα του πακέτου για ένα προφίλ ICC που περιέχεται σε ένα έγγραφο XPS. Η επεξεργασία αυτής της επιλογής εξαρτάται από τη ρύθμιση της δυνατότητας PageDeviceColorSpaceUsage. Υποτίθεται ότι όλα τα στοιχεία που χρησιμοποιούν αυτό το προφίλ βρίσκονται ήδη στον κατάλληλο χρωματικό χώρο συσκευής και δεν θα υποστούν διαχείριση χρώματος στον οδηγό ή στη συσκευή. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagedevicecolorspaceprofileuri
## Κατασκευαστές

| Κατασκευαστής | Περιγραφή |
| --- | --- |
| [PageDeviceColorSpaceProfileURI(String value)](#PageDeviceColorSpaceProfileURI-java.lang.String-) | Δημιουργεί μια νέα παρουσία. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getMaxLength()](#getMaxLength--) | Για τιμές συμβολοσειράς, ορίζει τη συντομότερη και τη μεγαλύτερη συμβολοσειρά. |
| [getMinLength()](#getMinLength--) | Για τιμές συμβολοσειράς, ορίζει τη συντομότερη επιτρεπόμενη συμβολοσειρά. |
| [getName()](#getName--) | Λαμβάνει το όνομα του στοιχείου. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PageDeviceColorSpaceProfileURI(String value) {#PageDeviceColorSpaceProfileURI-java.lang.String-}
```
public PageDeviceColorSpaceProfileURI(String value)
```


Δημιουργεί μια νέα παρουσία.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | java.lang.String | Η τιμή παραμέτρου. |

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
### getMaxLength() {#getMaxLength--}
```
public int getMaxLength()
```


Για τιμές συμβολοσειράς, ορίζει τη συντομότερη και τη μεγαλύτερη συμβολοσειρά.

**Returns:**
int - Η μεγαλύτερη επιτρεπόμενη συμβολοσειρά.
### getMinLength() {#getMinLength--}
```
public int getMinLength()
```


Για τιμές συμβολοσειράς, ορίζει τη συντομότερη επιτρεπόμενη συμβολοσειρά.

**Returns:**
int - Η μικρότερη επιτρεπόμενη συμβολοσειρά.
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

