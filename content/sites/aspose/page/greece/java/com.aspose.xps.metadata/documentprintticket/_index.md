---
title: "DocumentPrintTicket"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Η κλάση που ενσωματώνει ένα εισιτήριο εκτύπωσης επιπέδου εγγράφου."
type: docs
weight: 32
url: /el/java/com.aspose.xps.metadata/documentprintticket/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicket](../../com.aspose.xps.metadata/printticket)
```
public final class DocumentPrintTicket extends PrintTicket
```

Η κλάση που ενσωματώνει ένα εισιτήριο εκτύπωσης επιπέδου εγγράφου.
## Κατασκευαστές

| Κατασκευαστής | Περιγραφή |
| --- | --- |
| [DocumentPrintTicket(IDocumentPrintTicketItem[] items)](#DocumentPrintTicket-com.aspose.xps.metadata.IDocumentPrintTicketItem...-) | Δημιουργεί ένα στιγμιότυπο εισιτηρίου εκτύπωσης επιπέδου εγγράφου. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [add(IDocumentPrintTicketItem[] items)](#add-com.aspose.xps.metadata.IDocumentPrintTicketItem...-) | Προσθέτει έναν πίνακα αντικειμένων στο τέλος της λίστας στοιχείων του PrintTicket. |
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
### DocumentPrintTicket(IDocumentPrintTicketItem[] items) {#DocumentPrintTicket-com.aspose.xps.metadata.IDocumentPrintTicketItem...-}
```
public DocumentPrintTicket(IDocumentPrintTicketItem[] items)
```


Δημιουργεί ένα στιγμιότυπο εισιτηρίου εκτύπωσης επιπέδου εγγράφου.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| items | [IDocumentPrintTicketItem\[\]](../../com.aspose.xps.metadata/idocumentprintticketitem) | Ένας αυθαίρετος πίνακας αντικειμένων τύπου IDocumentPrintTicketItem. Κάθε ένα πρέπει να είναι μια Feature, μια ParameterInit ή μια Property. |

### add(IDocumentPrintTicketItem[] items) {#add-com.aspose.xps.metadata.IDocumentPrintTicketItem...-}
```
public void add(IDocumentPrintTicketItem[] items)
```


Προσθέτει έναν πίνακα αντικειμένων στο τέλος της λίστας στοιχείων του PrintTicket. Κάθε ένα μπορεί να είναι μια Feature, μια Option ή μια Property.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| items | [IDocumentPrintTicketItem\[\]](../../com.aspose.xps.metadata/idocumentprintticketitem) | Ένας πίνακας αντικειμένων προς προσθήκη. |

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

