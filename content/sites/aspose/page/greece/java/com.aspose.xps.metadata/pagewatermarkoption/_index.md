---
title: "PageWatermark.PageWatermarkOption"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Περιγράφει τις επιλογές χαρακτηριστικών του PageWatermark."
type: docs
weight: 12
url: /el/java/com.aspose.xps.metadata/pagewatermark.pagewatermarkoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageWatermark.IPageWatermarkItem](../../com.aspose.xps.metadata/ipagewatermarkitem)
```
public static final class PageWatermark.PageWatermarkOption extends Option implements PageWatermark.IPageWatermarkItem
```

Περιγράφει το  PageWatermark  επιλογές χαρακτηριστικών.
## Κατασκευαστές

| Κατασκευαστής | Περιγραφή |
| --- | --- |
| [PageWatermarkOption(String optionName, PageWatermark.IPageWatermarkOptionItem[] items)](#PageWatermarkOption-java.lang.String-com.aspose.xps.metadata.PageWatermark.IPageWatermarkOptionItem...-) | Δημιουργεί μια νέα παρουσία. |
| [PageWatermarkOption(PageWatermark.PageWatermarkOption option)](#PageWatermarkOption-com.aspose.xps.metadata.PageWatermark.PageWatermarkOption-) | Κλωνοποιεί αυτήν την παρουσία επιλογής. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| [Text](#Text) | Καθορίζει υδατογράφημα μόνο κειμένου. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Προσθέτει μια λίστα αντικειμένων στο τέλος της λίστας αντικειμένων αυτής της επιλογής. |
| [add(PageWatermark.IPageWatermarkOptionItem[] items)](#add-com.aspose.xps.metadata.PageWatermark.IPageWatermarkOptionItem...-) | Προσθέτει έναν πίνακα από  IPageWatermarkOptionItem  αντικείμενα στην επιλογή. |
| [clone()](#clone--) | Κλωνοποιεί αυτήν την παρουσία επιλογής. |
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
### PageWatermarkOption(String optionName, PageWatermark.IPageWatermarkOptionItem[] items) {#PageWatermarkOption-java.lang.String-com.aspose.xps.metadata.PageWatermark.IPageWatermarkOptionItem...-}
```
public PageWatermarkOption(String optionName, PageWatermark.IPageWatermarkOptionItem[] items)
```


Δημιουργεί μια νέα παρουσία.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| optionName | java.lang.String | Ένα όνομα επιλογής. |
| items | [IPageWatermarkOptionItem\[\]](../../com.aspose.xps.metadata/ipagewatermarkoptionitem) | Ένας αυθαίρετος πίνακας από  IPageWatermarkOptionItem  αντικείμενα. |

### PageWatermarkOption(PageWatermark.PageWatermarkOption option) {#PageWatermarkOption-com.aspose.xps.metadata.PageWatermark.PageWatermarkOption-}
```
public PageWatermarkOption(PageWatermark.PageWatermarkOption option)
```


Κλωνοποιεί αυτήν την παρουσία επιλογής.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| option | [PageWatermarkOption](../../com.aspose.xps.metadata/pagewatermarkoption) | Ένα στιγμιότυπο προς κλωνοποίηση. |

### Text {#Text}
```
public static PageWatermark.PageWatermarkOption Text
```


Καθορίζει υδατογράφημα μόνο κειμένου.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Προσθέτει μια λίστα αντικειμένων στο τέλος της λίστας αντικειμένων αυτής της επιλογής. Κάθε ένα πρέπει να είναι ένα  ScoredProperty  ή ένα  Property  αντικείμενο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Λίστα αντικειμένων προς προσθήκη. |

### add(PageWatermark.IPageWatermarkOptionItem[] items) {#add-com.aspose.xps.metadata.PageWatermark.IPageWatermarkOptionItem...-}
```
public PageWatermark.PageWatermarkOption add(PageWatermark.IPageWatermarkOptionItem[] items)
```


Προσθέτει έναν πίνακα από  IPageWatermarkOptionItem  αντικείμενα στην επιλογή.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| items | [IPageWatermarkOptionItem\[\]](../../com.aspose.xps.metadata/ipagewatermarkoptionitem) | Ένας αυθαίρετος πίνακας από  IPageWatermarkOptionItem  αντικείμενα. |

**Returns:**
[PageWatermarkOption](../../com.aspose.xps.metadata/pagewatermarkoption) - This options instance.
### clone() {#clone--}
```
public PageWatermark.PageWatermarkOption clone()
```


Κλωνοποιεί αυτό το στιγμιότυπο επιλογής. Η συντόμευση για τον κατασκευαστή κλωνοποίησης.

**Returns:**
[PageWatermarkOption](../../com.aspose.xps.metadata/pagewatermarkoption) - The clone of this option instance.
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

