---
title: "PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Περιγράφει τις επιλογές χαρακτηριστικού PageDeviceColorSpaceUsage."
type: docs
weight: 10
url: /el/java/com.aspose.xps.metadata/pagedevicecolorspaceusage.pagedevicecolorspaceusageoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption extends Option
```

Περιγράφει τις επιλογές χαρακτηριστικού PageDeviceColorSpaceUsage.
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| [MatchToDefault](#MatchToDefault) | Εάν η συσκευή καθορίσει ότι το προφίλ που καθορίζεται από την παράμετρο PageDeviceColorSpaceProfileURI μπορεί να χρησιμοποιηθεί ως προφίλ χρωματικού χώρου της συσκευής, όλα τα στοιχεία που χρησιμοποιούν το ίδιο προφίλ θεωρούνται ήδη καθορισμένα στον χρωματικό χώρο της συσκευής. |
| [OverrideDeviceDefault](#OverrideDeviceDefault) | Εάν το προφίλ που καθορίζεται από την παράμετρο PageDeviceColorSpaceProfileURI έχει αριθμό καναλιών που ταιριάζει με τον αριθμό των πρωτογενών της συσκευής, θα SHOULD να χρησιμοποιείται αντί της εσωτερικής διαχείρισης χρώματος της συσκευής για όλα τα στοιχεία. |
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
### MatchToDefault {#MatchToDefault}
```
public static PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption MatchToDefault
```


Εάν η συσκευή καθορίσει ότι το προφίλ που καθορίζεται από την  PageDeviceColorSpaceProfileURI  παράμετρο μπορεί να χρησιμοποιηθεί ως προφίλ χρωματικού χώρου συσκευής, όλα τα στοιχεία που χρησιμοποιούν το ίδιο προφίλ θεωρούνται ότι έχουν ήδη καθοριστεί σε χρωματικό χώρο συσκευής. Όλα τα άλλα στοιχεία ΠΡΕΠΕΙ να χρησιμοποιούν το προφίλ που καθορίζεται για εκείνο το στοιχείο. Εάν το προφίλ δεν μπορεί να χρησιμοποιηθεί ως προφίλ χρωματικού χώρου συσκευής, τα στοιχεία που χρησιμοποιούν το προφίλ ΠΡΕΠΕΙ να διαχειρίζονται χρωματικά όπως οποιοδήποτε άλλο στοιχείο που χρησιμοποιεί το χρωματικό προφίλ.

### OverrideDeviceDefault {#OverrideDeviceDefault}
```
public static PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption OverrideDeviceDefault
```


Εάν το προφίλ που καθορίζεται από την παράμετρο PageDeviceColorSpaceProfileURI έχει αριθμό καναλιών που ταιριάζει με τον αριθμό πρωτογενών της συσκευής, θα ΠΡΕΠΕΙ να χρησιμοποιηθεί αντί για την εσωτερική διαχείριση χρωμάτων της συσκευής για όλα τα στοιχεία. Τα στοιχεία που χρησιμοποιούν αυτό το προφίλ θεωρούνται ότι βρίσκονται σε χρωματικό χώρο συσκευής και δεν θα υποβληθούν σε περαιτέρω χρωματική διαχείριση.

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

