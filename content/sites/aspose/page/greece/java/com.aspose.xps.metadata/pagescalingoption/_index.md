---
title: "PageScaling.PageScalingOption"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Περιγράφει τις επιλογές των χαρακτηριστικών PageScaling."
type: docs
weight: 10
url: /el/java/com.aspose.xps.metadata/pagescaling.pagescalingoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageScaling.IPageScalingItem](../../com.aspose.xps.metadata/ipagescalingitem)
```
public static final class PageScaling.PageScalingOption extends Option implements PageScaling.IPageScalingItem
```

Περιγράφει τις επιλογές χαρακτηριστικού PageScaling.
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| [Custom](#Custom) | Καθορίζει ότι πρέπει να εφαρμοστεί προσαρμοσμένη κλιμάκωση στο μέγεθος μέσου της εφαρμογής. |
| [CustomSquare](#CustomSquare) | Καθορίζει ότι πρέπει να εφαρμοστεί προσαρμοσμένη τετράγωνη κλιμάκωση στο μέγεθος μέσου της εφαρμογής. |
| [FitApplicationBleedSizeToPageImageableSize](#FitApplicationBleedSizeToPageImageableSize) | Καθορίζει ότι το μέγεθος υπερχείλισης της εφαρμογής πρέπει να κλιμακωθεί στο  PageImageableSize  διατηρώντας την αναλογία διαστάσεων. |
| [FitApplicationContentSizeToPageImageableSize](#FitApplicationContentSizeToPageImageableSize) | Καθορίζει ότι το μέγεθος περιεχομένου της εφαρμογής πρέπει να κλιμακωθεί στο  PageImageableSize  διατηρώντας την αναλογία διαστάσεων. |
| [FitApplicationMediaSizeToPageImageableSize](#FitApplicationMediaSizeToPageImageableSize) | Καθορίζει ότι το μέγεθος μέσου της εφαρμογής πρέπει να κλιμακωθεί στο  PageImageableSize  διατηρώντας την αναλογία διαστάσεων. |
| [FitApplicationMediaSizeToPageMediaSize](#FitApplicationMediaSizeToPageMediaSize) | Καθορίζει ότι το μέγεθος μέσου της εφαρμογής πρέπει να κλιμακωθεί στο  PageMediaSize  διατηρώντας την αναλογία διαστάσεων. |
| [None](#None) | Καθορίζει ότι δεν πρέπει να εφαρμοστεί κλιμάκωση. |
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
### Custom {#Custom}
```
public static PageScaling.PageScalingOption Custom
```


Καθορίζει ότι πρέπει να εφαρμοστεί προσαρμοσμένη κλιμάκωση στο μέγεθος μέσου της εφαρμογής.

### CustomSquare {#CustomSquare}
```
public static PageScaling.PageScalingOption CustomSquare
```


Καθορίζει ότι πρέπει να εφαρμοστεί προσαρμοσμένη τετράγωνη κλιμάκωση στο μέγεθος μέσου της εφαρμογής.

### FitApplicationBleedSizeToPageImageableSize {#FitApplicationBleedSizeToPageImageableSize}
```
public static PageScaling.PageScalingOption FitApplicationBleedSizeToPageImageableSize
```


Καθορίζει ότι το μέγεθος υπερχείλισης της εφαρμογής πρέπει να κλιμακωθεί στο  PageImageableSize  διατηρώντας την αναλογία διαστάσεων.

### FitApplicationContentSizeToPageImageableSize {#FitApplicationContentSizeToPageImageableSize}
```
public static PageScaling.PageScalingOption FitApplicationContentSizeToPageImageableSize
```


Καθορίζει ότι το μέγεθος περιεχομένου της εφαρμογής πρέπει να κλιμακωθεί στο  PageImageableSize  διατηρώντας την αναλογία διαστάσεων.

### FitApplicationMediaSizeToPageImageableSize {#FitApplicationMediaSizeToPageImageableSize}
```
public static PageScaling.PageScalingOption FitApplicationMediaSizeToPageImageableSize
```


Καθορίζει ότι το μέγεθος μέσου της εφαρμογής πρέπει να κλιμακωθεί στο  PageImageableSize  διατηρώντας την αναλογία διαστάσεων.

### FitApplicationMediaSizeToPageMediaSize {#FitApplicationMediaSizeToPageMediaSize}
```
public static PageScaling.PageScalingOption FitApplicationMediaSizeToPageMediaSize
```


Καθορίζει ότι το μέγεθος μέσου της εφαρμογής πρέπει να κλιμακωθεί στο  PageMediaSize  διατηρώντας την αναλογία διαστάσεων.

### None {#None}
```
public static PageScaling.PageScalingOption None
```


Καθορίζει ότι δεν πρέπει να εφαρμοστεί κλιμάκωση.

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

