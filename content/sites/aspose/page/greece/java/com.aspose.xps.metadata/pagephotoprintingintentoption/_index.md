---
title: "PagePhotoPrintingIntent.PagePhotoPrintingIntentOption"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Ορίζει τις επιλογές χαρακτηριστικού PagePhotoPrintingIntent."
type: docs
weight: 10
url: /el/java/com.aspose.xps.metadata/pagephotoprintingintent.pagephotoprintingintentoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PagePhotoPrintingIntent.PagePhotoPrintingIntentOption extends Option
```

Ορίζει τις επιλογές χαρακτηριστικού PagePhotoPrintingIntent.
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| [None](#None) | Καμία πρόθεση φωτοεκτύπωσης (Επιτρέπει στην εφαρμογή να καθορίσει ότι δεν υπάρχει ανάλυση πρόθεσης. |
| [PhotoBest](#PhotoBest) | Καλύτερης Ποιότητας Φωτοεκτύπωση (Παρέχεται κυρίως για λόγους μάρκετινγκ· αξιοποιεί τις υψηλότερες δυνατότητες της συσκευής) |
| [PhotoDraft](#PhotoDraft) | Πρόχειρης Ποιότητας Φωτοεκτύπωση (Γρήγορη εκτύπωση με χαμηλό όγκο μελανιού για σκοπούς απόδειξης) |
| [PhotoStandard](#PhotoStandard) | Τυπικής Ποιότητας Φωτοεκτύπωση (Προτεινόμενες ρυθμίσεις OEM για τυπική φωτοεκτύπωση) |
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
### None {#None}
```
public static PagePhotoPrintingIntent.PagePhotoPrintingIntentOption None
```


Καμία πρόθεση φωτοεκτύπωσης (Επιτρέπει στην εφαρμογή να καθορίσει ότι δεν υπάρχει ανάλυση πρόθεσης. Οι ρυθμίσεις PrintTicket δεν πρέπει να τροποποιηθούν)

### PhotoBest {#PhotoBest}
```
public static PagePhotoPrintingIntent.PagePhotoPrintingIntentOption PhotoBest
```


Καλύτερης Ποιότητας Φωτοεκτύπωση (Παρέχεται κυρίως για λόγους μάρκετινγκ· αξιοποιεί τις υψηλότερες δυνατότητες της συσκευής)

### PhotoDraft {#PhotoDraft}
```
public static PagePhotoPrintingIntent.PagePhotoPrintingIntentOption PhotoDraft
```


Πρόχειρης Ποιότητας Φωτοεκτύπωση (Γρήγορη εκτύπωση με χαμηλό όγκο μελανιού για σκοπούς απόδειξης)

### PhotoStandard {#PhotoStandard}
```
public static PagePhotoPrintingIntent.PagePhotoPrintingIntentOption PhotoStandard
```


Τυπικής Ποιότητας Φωτοεκτύπωση (Προτεινόμενες ρυθμίσεις OEM για τυπική φωτοεκτύπωση)

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

