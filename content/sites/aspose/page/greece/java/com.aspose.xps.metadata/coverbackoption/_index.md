---
title: "JobPrimaryCoverBack.CoverBackOption"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Περιγράφει τις επιλογές χαρακτηριστικού JobPrimaryCoverBack."
type: docs
weight: 10
url: /el/java/com.aspose.xps.metadata/jobprimarycoverback.coverbackoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class JobPrimaryCoverBack.CoverBackOption extends Option
```

Περιγράφει τις επιλογές δυνατότητας  JobPrimaryCoverBack .
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| [BlankCover](#BlankCover) | Καθορίζει ότι πρέπει να εκτυπωθεί ένα κενό φύλλο εξώφυλλου. |
| [NoCover](#NoCover) | Καθορίζει ότι δεν θα παραχθεί εξώφυλλο. |
| [PrintBack](#PrintBack) | Καθορίζει ότι το εξώφυλλο που υποδεικνύεται από "CoverBackSource" πρέπει να εκτυπωθεί στην πίσω πλευρά του φύλλου εξωφύλλου. |
| [PrintBoth](#PrintBoth) | Καθορίζει ότι το εξώφυλλο που υποδεικνύεται από "CoverBackSource" μπορεί να εκτυπωθεί σε οποιαδήποτε από τις δύο πλευρές του φύλλου εξωφύλλου. |
| [PrintFront](#PrintFront) | Καθορίζει ότι το εξώφυλλο που υποδεικνύεται από "CoverBackSource" πρέπει να εκτυπωθεί στην μπροστινή πλευρά του φύλλου εξωφύλλου. |
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
### BlankCover {#BlankCover}
```
public static final JobPrimaryCoverBack.CoverBackOption BlankCover
```


Καθορίζει ότι πρέπει να εκτυπωθεί ένα κενό φύλλο εξώφυλλου.

### NoCover {#NoCover}
```
public static final JobPrimaryCoverBack.CoverBackOption NoCover
```


Καθορίζει ότι δεν θα παραχθεί εξώφυλλο.

### PrintBack {#PrintBack}
```
public static final JobPrimaryCoverBack.CoverBackOption PrintBack
```


Καθορίζει ότι το εξώφυλλο που υποδεικνύεται από "CoverBackSource" πρέπει να εκτυπωθεί στην πίσω πλευρά του φύλλου εξωφύλλου. Εάν δεν καθοριστεί ένα στοιχείο  JobPrimaryCoverBackSource   ParameterInit , αυτή η Επιλογή πρέπει να αγνοηθεί.

### PrintBoth {#PrintBoth}
```
public static final JobPrimaryCoverBack.CoverBackOption PrintBoth
```


Καθορίζει ότι το εξώφυλλο που υποδεικνύεται από "CoverBackSource" μπορεί να εκτυπωθεί σε οποιαδήποτε από τις δύο πλευρές του φύλλου εξωφύλλου. Εάν δεν καθοριστεί ένα στοιχείο  JobPrimaryCoverBackSource   ParameterInit , αυτή η Επιλογή πρέπει να αγνοηθεί.

### PrintFront {#PrintFront}
```
public static final JobPrimaryCoverBack.CoverBackOption PrintFront
```


Καθορίζει ότι το εξώφυλλο που υποδεικνύεται από "CoverBackSource" πρέπει να εκτυπωθεί στην μπροστινή πλευρά του φύλλου εξωφύλλου. Εάν δεν καθοριστεί ένα στοιχείο  JobPrimaryCoverBackSource   ParameterInit , αυτή η Επιλογή πρέπει να αγνοηθεί.

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

