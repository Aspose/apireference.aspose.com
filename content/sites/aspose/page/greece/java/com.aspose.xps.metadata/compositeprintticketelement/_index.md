---
title: "CompositePrintTicketElement"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Η βασική κλάση για κλάσεις που μπορεί να είναι σύνθετα στοιχεία Print Schema, δηλαδή περιέχουν άλλα στοιχεία."
type: docs
weight: 11
url: /el/java/com.aspose.xps.metadata/compositeprintticketelement/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement)
```
public abstract class CompositePrintTicketElement extends PrintTicketElement
```

Η βασική κλάση για κλάσεις που μπορεί να είναι σύνθετα στοιχεία Print Schema (π.χ. περιέχοντας άλλα στοιχεία).
## Κατασκευαστές

| Κατασκευαστής | Περιγραφή |
| --- | --- |
| [CompositePrintTicketElement(String name, IPrintTicketElementChild[] items)](#CompositePrintTicketElement-java.lang.String-com.aspose.xps.metadata.IPrintTicketElementChild...-) | Δημιουργεί μια νέα παρουσία. |
| [CompositePrintTicketElement(CompositePrintTicketElement element)](#CompositePrintTicketElement-com.aspose.xps.metadata.CompositePrintTicketElement-) | Κλωνοποιεί αυτήν την παρουσία του στοιχείου. |
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
### CompositePrintTicketElement(String name, IPrintTicketElementChild[] items) {#CompositePrintTicketElement-java.lang.String-com.aspose.xps.metadata.IPrintTicketElementChild...-}
```
public CompositePrintTicketElement(String name, IPrintTicketElementChild[] items)
```


Δημιουργεί μια νέα παρουσία.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| όνομα | java.lang.String | Το όνομα του στοιχείου σύμφωνα με κάποιο σχήμα XML (Microsoft Print Schema Framework ή άλλο). |
| items | [IPrintTicketElementChild\[\]](../../com.aspose.xps.metadata/iprintticketelementchild) | Ένας αυθαίρετος πίνακας από θυγατρικά στοιχεία. |

### CompositePrintTicketElement(CompositePrintTicketElement element) {#CompositePrintTicketElement-com.aspose.xps.metadata.CompositePrintTicketElement-}
```
public CompositePrintTicketElement(CompositePrintTicketElement element)
```


Κλωνοποιεί αυτήν την παρουσία του στοιχείου.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| element | [CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement) | Μια παρουσία στοιχείου προς κλωνοποίηση. |

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

