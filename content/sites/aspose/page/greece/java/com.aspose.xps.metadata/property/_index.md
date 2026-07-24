---
title: "Property"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Κλάση που υλοποιεί την ιδιότητα του δελτίου εκτύπωσης."
type: docs
weight: 143
url: /el/java/com.aspose.xps.metadata/property/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IPrintTicketItem](../../com.aspose.xps.metadata/iprintticketitem), [com.aspose.xps.metadata.IFeatureItem](../../com.aspose.xps.metadata/ifeatureitem), [com.aspose.xps.metadata.IOptionItem](../../com.aspose.xps.metadata/ioptionitem), [com.aspose.xps.metadata.IScoredPropertyItem](../../com.aspose.xps.metadata/iscoredpropertyitem), [com.aspose.xps.metadata.IPropertyItem](../../com.aspose.xps.metadata/ipropertyitem)
```
public class Property extends CompositePrintTicketElement implements IPrintTicketItem, IFeatureItem, IOptionItem, IScoredPropertyItem, IPropertyItem
```

Κλάση που υλοποιεί ιδιότητα εισιτηρίου εκτύπωσης. Η κλάση που υλοποιεί μια κοινή PrintTicket  Property . Η βασική κλάση για όλες τις ιδιότητες που ορίζονται από το σχήμα. Ένα στοιχείο  Property  δηλώνει μια συσκευή, μορφοποίηση εργασίας ή άλλη σχετική ιδιότητα του οποίου το όνομα δίνεται από το χαρακτηριστικό name. Ένα στοιχείο  Value  χρησιμοποιείται για την ανάθεση μιας τιμής στην  Property . Μια  Property  μπορεί να είναι σύνθετη, ενδεχομένως περιέχοντας πολλαπλές υπο-ιδιότητες. Οι υπο-ιδιότητες επίσης αναπαριστώνται από στοιχεία  Property . https://docs.microsoft.com/en-us/windows/win32/printdocs/property
## Κατασκευαστές

| Κατασκευαστής | Περιγραφή |
| --- | --- |
| [Property(String name, Property property, IPropertyItem[] items)](#Property-java.lang.String-com.aspose.xps.metadata.Property-com.aspose.xps.metadata.IPropertyItem...-) | Δημιουργεί μια νέα παρουσία. |
| [Property(String name, Value value, IPropertyItem[] items)](#Property-java.lang.String-com.aspose.xps.metadata.Value-com.aspose.xps.metadata.IPropertyItem...-) | Δημιουργεί μια νέα παρουσία. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
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
### Property(String name, Property property, IPropertyItem[] items) {#Property-java.lang.String-com.aspose.xps.metadata.Property-com.aspose.xps.metadata.IPropertyItem...-}
```
public Property(String name, Property property, IPropertyItem[] items)
```


Δημιουργεί μια νέα παρουσία.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| όνομα | java.lang.String | Ένα όνομα ιδιότητας. |
| property | [Property](../../com.aspose.xps.metadata/property) | Μια υποχρεωτική  Property  παρουσία. |
| items | [IPropertyItem\[\]](../../com.aspose.xps.metadata/ipropertyitem) | Ένας αυθαίρετος πίνακας  IPropertyItem  παρουσιών. Κάθε ένα πρέπει να είναι μια  Property  ή μια  Value  παρουσία. |

### Property(String name, Value value, IPropertyItem[] items) {#Property-java.lang.String-com.aspose.xps.metadata.Value-com.aspose.xps.metadata.IPropertyItem...-}
```
public Property(String name, Value value, IPropertyItem[] items)
```


Δημιουργεί μια νέα παρουσία.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| όνομα | java.lang.String | Ένα όνομα ιδιότητας. |
| value | [Value](../../com.aspose.xps.metadata/value) | Μία υποχρεωτική  Value  παρουσία. |
| items | [IPropertyItem\[\]](../../com.aspose.xps.metadata/ipropertyitem) | Ένας αυθαίρετος πίνακας  IPropertyItem  παρουσιών. Κάθε ένα πρέπει να είναι μια  Property  ή μια  Value  παρουσία. |

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

