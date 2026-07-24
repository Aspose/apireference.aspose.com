---
title: "JobPrintTicket"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Η κλάση που περιλαμβάνει ένα εισιτήριο εκτύπωσης επιπέδου εργασίας."
type: docs
weight: 70
url: /el/java/com.aspose.xps.metadata/jobprintticket/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicket](../../com.aspose.xps.metadata/printticket)
```
public final class JobPrintTicket extends PrintTicket
```

Η κλάση που περιλαμβάνει ένα εισιτήριο εκτύπωσης επιπέδου εργασίας.
## Κατασκευαστές

| Κατασκευαστής | Περιγραφή |
| --- | --- |
| [JobPrintTicket(IJobPrintTicketItem[] items)](#JobPrintTicket-com.aspose.xps.metadata.IJobPrintTicketItem...-) | Δημιουργεί ένα στιγμιότυπο εκτυπωτικού εισιτηρίου επιπέδου εργασίας. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [add(IJobPrintTicketItem[] items)](#add-com.aspose.xps.metadata.IJobPrintTicketItem...-) | Προσθέτει έναν πίνακα αντικειμένων στο τέλος της λίστας στοιχείων του PrintTicket. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Επιστρέφει τον επαναλήπτη ονομάτων στοιχείων του εκτυπωτικού εισιτηρίου. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(String[] names)](#remove-java.lang.String...-) | Αφαιρεί ένα στοιχείο από αυτή τη λίστα στοιχείων του PrintTicket. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### JobPrintTicket(IJobPrintTicketItem[] items) {#JobPrintTicket-com.aspose.xps.metadata.IJobPrintTicketItem...-}
```
public JobPrintTicket(IJobPrintTicketItem[] items)
```


Δημιουργεί ένα στιγμιότυπο εκτυπωτικού εισιτηρίου επιπέδου εργασίας.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| items | [IJobPrintTicketItem\[\]](../../com.aspose.xps.metadata/ijobprintticketitem) | Ένας αυθαίρετος πίνακας αντικειμένων  IJobPrintTicketItem . Κάθε ένα μπορεί να είναι ένα  Feature , ένα  ParameterInit  ή ένα  Property  αντικείμενο. |

### add(IJobPrintTicketItem[] items) {#add-com.aspose.xps.metadata.IJobPrintTicketItem...-}
```
public void add(IJobPrintTicketItem[] items)
```


Προσθέτει έναν πίνακα στοιχείων στο τέλος της λίστας στοιχείων PrintTicket. Κάθε στοιχείο μπορεί να είναι μια παρουσία Feature, ParameterInit ή Property.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| items | [IJobPrintTicketItem\[\]](../../com.aspose.xps.metadata/ijobprintticketitem) | Ένας πίνακας αντικειμένων προς προσθήκη. |

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
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### iterator() {#iterator--}
```
public Iterator<String> iterator()
```


Επιστρέφει τον επαναλήπτη ονομάτων στοιχείων του εκτυπωτικού εισιτηρίου.

**Returns:**
java.util.Iterator<java.lang.String> - Επιστρέφει επαναλήπτη για τη λίστα.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### remove(String[] names) {#remove-java.lang.String...-}
```
public void remove(String[] names)
```


Αφαιρεί ένα στοιχείο από αυτή τη λίστα στοιχείων του PrintTicket.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| ονόματα | java.lang.String[] | Ένας πίνακας ονομάτων στοιχείων. |

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

