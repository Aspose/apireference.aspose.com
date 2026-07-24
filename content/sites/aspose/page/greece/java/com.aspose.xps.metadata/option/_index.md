---
title: "Option"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Η κλάση που υλοποιεί μια κοινή PrintTicket Option."
type: docs
weight: 76
url: /el/java/com.aspose.xps.metadata/option/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IFeatureItem](../../com.aspose.xps.metadata/ifeatureitem)
```
public class Option extends CompositePrintTicketElement implements IFeatureItem
```

Η κλάση που υλοποιεί μια κοινή PrintTicket  Option . Η βασική κλάση για όλες τις επιλογές που ορίζονται από το σχήμα. Ένα στοιχείο Option περιέχει όλα τα στοιχεία  Property  και  ScoredProperty  που σχετίζονται με αυτήν την επιλογή. https://docs.microsoft.com/en-us/windows/win32/printdocs/option
## Κατασκευαστές

| Κατασκευαστής | Περιγραφή |
| --- | --- |
| [Option(String name, IOptionItem[] items)](#Option-java.lang.String-com.aspose.xps.metadata.IOptionItem...-) | Δημιουργεί ένα νέο PrintTicket option στιγμιότυπο. |
| [Option(IOptionItem[] items)](#Option-com.aspose.xps.metadata.IOptionItem...-) | Δημιουργεί ένα νέο PrintTicket option στιγμιότυπο. |
| [Option(Option option)](#Option-com.aspose.xps.metadata.Option-) | Δημιουργεί ένα στιγμιότυπο clone option. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Προσθέτει μια λίστα αντικειμένων στο τέλος της λίστας αντικειμένων αυτής της επιλογής. |
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
### Option(String name, IOptionItem[] items) {#Option-java.lang.String-com.aspose.xps.metadata.IOptionItem...-}
```
public Option(String name, IOptionItem[] items)
```


Δημιουργεί ένα νέο PrintTicket option στιγμιότυπο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| όνομα | java.lang.String | Ένα αυθαίρετο όνομα επιλογής. |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Ένας αυθαίρετος πίνακας αντικειμένων  IOptionItem . Κάθε ένα πρέπει να είναι ένα  ScoredProperty  ή ένα  Property  αντικείμενο. |

### Option(IOptionItem[] items) {#Option-com.aspose.xps.metadata.IOptionItem...-}
```
public Option(IOptionItem[] items)
```


Δημιουργεί ένα νέο PrintTicket option στιγμιότυπο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Ένας αυθαίρετος πίνακας αντικειμένων  IOptionItem . Κάθε ένα πρέπει να είναι ένα  ScoredProperty  ή ένα  Property  αντικείμενο. |

### Option(Option option) {#Option-com.aspose.xps.metadata.Option-}
```
public Option(Option option)
```


Δημιουργεί ένα στιγμιότυπο clone option.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| option | [Option](../../com.aspose.xps.metadata/option) | Ένα option στιγμιότυπο για κλωνοποίηση. |

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Προσθέτει μια λίστα αντικειμένων στο τέλος της λίστας αντικειμένων αυτής της επιλογής. Κάθε ένα πρέπει να είναι ένα  ScoredProperty  ή ένα  Property  αντικείμενο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Λίστα αντικειμένων προς προσθήκη. |

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

