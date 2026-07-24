---
title: "PrintTicket"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Η κλάση που υλοποιεί ένα κοινό PrintTicket οποιασδήποτε εμβέλειας."
type: docs
weight: 141
url: /el/java/com.aspose.xps.metadata/printticket/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.lang.Iterable
```
public abstract class PrintTicket implements Iterable<String>
```

Η κλάση που υλοποιεί ένα κοινό PrintTicket οποιασδήποτε εμβέλειας. Η βασική κλάση για τα PrintTicket επιπέδου εργασίας, εγγράφου και σελίδας. Ένα στοιχείο  PrintTicket  είναι το ριζικό στοιχείο του εγγράφου PrintTicket. Ένα στοιχείο  PrintTicket  περιέχει όλες τις πληροφορίες μορφοποίησης εργασίας που απαιτούνται για την εκτύπωση μιας εργασίας. https://docs.microsoft.com/en-us/windows/win32/printdocs/printticket
## Κατασκευαστές

| Κατασκευαστής | Περιγραφή |
| --- | --- |
| [PrintTicket(IPrintTicketItem[] items)](#PrintTicket-com.aspose.xps.metadata.IPrintTicketItem...-) | Δημιουργεί μια νέα παρουσία. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
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
### PrintTicket(IPrintTicketItem[] items) {#PrintTicket-com.aspose.xps.metadata.IPrintTicketItem...-}
```
public PrintTicket(IPrintTicketItem[] items)
```


Δημιουργεί μια νέα παρουσία.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| items | [IPrintTicketItem\[\]](../../com.aspose.xps.metadata/iprintticketitem) | Ένας αυθαίρετος πίνακας από αντικείμενα  IPrintTicketItem . Κάθε ένα πρέπει να είναι ένα  Feature , ένα  ParameterInit  ή ένα  Property  αντικείμενο. |

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

