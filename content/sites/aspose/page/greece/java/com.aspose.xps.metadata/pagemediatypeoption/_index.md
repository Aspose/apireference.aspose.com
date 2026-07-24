---
title: "PageMediaType.PageMediaTypeOption"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Περιγράφει τις επιλογές της λειτουργίας PageMediaType."
type: docs
weight: 13
url: /el/java/com.aspose.xps.metadata/pagemediatype.pagemediatypeoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageMediaType.IPageMediaTypeItem](../../com.aspose.xps.metadata/ipagemediatypeitem)
```
public static final class PageMediaType.PageMediaTypeOption extends Option implements PageMediaType.IPageMediaTypeItem
```

Περιγράφει τις  PageMediaType  επιλογές χαρακτηριστικού.
## Κατασκευαστές

| Κατασκευαστής | Περιγραφή |
| --- | --- |
| [PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items)](#PageMediaTypeOption-java.lang.String-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-) | Δημιουργεί μια νέα παρουσία. |
| [PageMediaTypeOption(PageMediaType.PageMediaTypeOption option)](#PageMediaTypeOption-com.aspose.xps.metadata.PageMediaType.PageMediaTypeOption-) | Κλωνοποιεί αυτήν την παρουσία επιλογής. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| [Archival](#Archival) | Καθορίζει μέσα αρχειοθέτησης υψηλής ποιότητας. |
| [AutoSelect](#AutoSelect) | Καθορίζει ότι τα μέσα θα επιλεγούν αυτόματα. |
| [BackPrintFilm](#BackPrintFilm) | Καθορίζει ειδικό φιλμ εκτύπωσης πίσω. |
| [Bond](#Bond) | Καθορίζει τυπικό χαρτί σύνδεσης. |
| [CardStock](#CardStock) | Καθορίζει τυπικό χαρτόνι. |
| [Continous](#Continous) | Καθορίζει μέσα συνεχούς τροφοδοσίας. |
| [EnvelopePlain](#EnvelopePlain) | Καθορίζει τυπικά μέσα φακέλου. |
| [EnvelopeWindow](#EnvelopeWindow) | Καθορίζει μέσα φακέλου με παράθυρο. |
| [Fabric](#Fabric) | Καθορίζει υφασματικά μέσα. |
| [HighResolution](#HighResolution) | Καθορίζει ειδικά μέσα υψηλής ανάλυσης. |
| [Label](#Label) | Καθορίζει μέσα ετικετών. |
| [MultiLayerForm](#MultiLayerForm) | Καθορίζει μέσα συνδεδεμένων πολυτμηματικών εντύπων. |
| [MultiPartForm](#MultiPartForm) | Καθορίζει μέσα ξεχωριστών πολυτμηματικών εντύπων. |
| [None](#None) | Καθορίζει άγνωστα ή μη καταχωρημένα μέσα. |
| [Photographic](#Photographic) | Καθορίζει τυπικά φωτογραφικά μέσα. |
| [PhotographicFilm](#PhotographicFilm) | Καθορίζει φιλμ φωτογραφικά μέσα. |
| [PhotographicGlossy](#PhotographicGlossy) | Καθορίζει γυαλιστερά φωτογραφικά μέσα. |
| [PhotographicHighGloss](#PhotographicHighGloss) | Καθορίζει υψηλού γυαλάσματος φωτογραφικά μέσα. |
| [PhotographicMatte](#PhotographicMatte) | Καθορίζει ματ φωτογραφικά μέσα. |
| [PhotographicSatin](#PhotographicSatin) | Καθορίζει σατέν φωτογραφικά μέσα. |
| [PhotographicSemiGloss](#PhotographicSemiGloss) | Καθορίζει ημικυαλά φωτογραφικά μέσα. |
| [Plain](#Plain) | Καθορίζει τυπικά χαρτικά μέσα. |
| [Screen](#Screen) | Καθορίζει έξοδο σε οθόνη εξόδου σε συνεχή μορφή. |
| [ScreenPaged](#ScreenPaged) | Καθορίζει έξοδο σε οθόνη εξόδου σε σελίδες. |
| [Stationary](#Stationary) | Καθορίζει ειδικά μέσα γραφικής ύλης. |
| [TShirtTransfer](#TShirtTransfer) | Καθορίζει ειδικά μέσα μεταφοράς για T‑shirt. |
| [TabStockFull](#TabStockFull) | Καθορίζει τα μέσα αποθέματος καρτελών που δεν είναι προκομμένα (μονές καρτέλες). |
| [TabStockPreCut](#TabStockPreCut) | Καθορίζει τα μέσα αποθέματος καρτελών που είναι προκομμένα (πολλαπλές καρτέλες). |
| [Transparency](#Transparency) | Καθορίζει μέσα διαφάνειας. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Προσθέτει μια λίστα αντικειμένων στο τέλος της λίστας αντικειμένων αυτής της επιλογής. |
| [add(PageMediaType.IPageMediaTypeOptionItem[] items)](#add-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-) | Προσθέτει έναν πίνακα των  IPageMediaTypeOptionItem  αντικειμένων στην επιλογή. |
| [clone()](#clone--) | Κλωνοποιεί αυτήν την παρουσία επιλογής. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Λαμβάνει το όνομα του στοιχείου. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setWeight(int weight)](#setWeight-int-) | Ορίζει μια τιμή ιδιότητας  Weight . |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items) {#PageMediaTypeOption-java.lang.String-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-}
```
public PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items)
```


Δημιουργεί μια νέα παρουσία.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| optionName | java.lang.String | Ένα όνομα επιλογής. |
| items | [IPageMediaTypeOptionItem\[\]](../../com.aspose.xps.metadata/ipagemediatypeoptionitem) | Ένας αυθαίρετος πίνακας των  IPageMediaTypeOptionItem  αντικειμένων. |

### PageMediaTypeOption(PageMediaType.PageMediaTypeOption option) {#PageMediaTypeOption-com.aspose.xps.metadata.PageMediaType.PageMediaTypeOption-}
```
public PageMediaTypeOption(PageMediaType.PageMediaTypeOption option)
```


Κλωνοποιεί αυτήν την παρουσία επιλογής.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| option | [PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) | Ένα στιγμιότυπο προς κλωνοποίηση. |

### Archival {#Archival}
```
public static PageMediaType.PageMediaTypeOption Archival
```


Καθορίζει μέσα αρχειοθέτησης υψηλής ποιότητας.

### AutoSelect {#AutoSelect}
```
public static PageMediaType.PageMediaTypeOption AutoSelect
```


Καθορίζει ότι τα μέσα θα επιλεγούν αυτόματα.

### BackPrintFilm {#BackPrintFilm}
```
public static PageMediaType.PageMediaTypeOption BackPrintFilm
```


Καθορίζει ειδικό φιλμ εκτύπωσης πίσω.

### Bond {#Bond}
```
public static PageMediaType.PageMediaTypeOption Bond
```


Καθορίζει τυπικό χαρτί σύνδεσης.

### CardStock {#CardStock}
```
public static PageMediaType.PageMediaTypeOption CardStock
```


Καθορίζει τυπικό χαρτόνι.

### Continous {#Continous}
```
public static PageMediaType.PageMediaTypeOption Continous
```


Καθορίζει μέσα συνεχούς τροφοδοσίας.

### EnvelopePlain {#EnvelopePlain}
```
public static PageMediaType.PageMediaTypeOption EnvelopePlain
```


Καθορίζει τυπικά μέσα φακέλου.

### EnvelopeWindow {#EnvelopeWindow}
```
public static PageMediaType.PageMediaTypeOption EnvelopeWindow
```


Καθορίζει μέσα φακέλου με παράθυρο.

### Fabric {#Fabric}
```
public static PageMediaType.PageMediaTypeOption Fabric
```


Καθορίζει υφασματικά μέσα.

### HighResolution {#HighResolution}
```
public static PageMediaType.PageMediaTypeOption HighResolution
```


Καθορίζει ειδικά μέσα υψηλής ανάλυσης.

### Label {#Label}
```
public static PageMediaType.PageMediaTypeOption Label
```


Καθορίζει μέσα ετικετών.

### MultiLayerForm {#MultiLayerForm}
```
public static PageMediaType.PageMediaTypeOption MultiLayerForm
```


Καθορίζει μέσα συνδεδεμένων πολυτμηματικών εντύπων.

### MultiPartForm {#MultiPartForm}
```
public static PageMediaType.PageMediaTypeOption MultiPartForm
```


Καθορίζει μέσα ξεχωριστών πολυτμηματικών εντύπων.

### None {#None}
```
public static PageMediaType.PageMediaTypeOption None
```


Καθορίζει άγνωστα ή μη καταχωρημένα μέσα.

### Photographic {#Photographic}
```
public static PageMediaType.PageMediaTypeOption Photographic
```


Καθορίζει τυπικά φωτογραφικά μέσα.

### PhotographicFilm {#PhotographicFilm}
```
public static PageMediaType.PageMediaTypeOption PhotographicFilm
```


Καθορίζει φιλμ φωτογραφικά μέσα.

### PhotographicGlossy {#PhotographicGlossy}
```
public static PageMediaType.PageMediaTypeOption PhotographicGlossy
```


Καθορίζει γυαλιστερά φωτογραφικά μέσα.

### PhotographicHighGloss {#PhotographicHighGloss}
```
public static PageMediaType.PageMediaTypeOption PhotographicHighGloss
```


Καθορίζει υψηλού γυαλάσματος φωτογραφικά μέσα.

### PhotographicMatte {#PhotographicMatte}
```
public static PageMediaType.PageMediaTypeOption PhotographicMatte
```


Καθορίζει ματ φωτογραφικά μέσα.

### PhotographicSatin {#PhotographicSatin}
```
public static PageMediaType.PageMediaTypeOption PhotographicSatin
```


Καθορίζει σατέν φωτογραφικά μέσα.

### PhotographicSemiGloss {#PhotographicSemiGloss}
```
public static PageMediaType.PageMediaTypeOption PhotographicSemiGloss
```


Καθορίζει ημικυαλά φωτογραφικά μέσα.

### Plain {#Plain}
```
public static PageMediaType.PageMediaTypeOption Plain
```


Καθορίζει τυπικά χαρτικά μέσα.

### Screen {#Screen}
```
public static PageMediaType.PageMediaTypeOption Screen
```


Καθορίζει έξοδο σε οθόνη εξόδου σε συνεχή μορφή.

### ScreenPaged {#ScreenPaged}
```
public static PageMediaType.PageMediaTypeOption ScreenPaged
```


Καθορίζει έξοδο σε οθόνη εξόδου σε σελίδες.

### Stationary {#Stationary}
```
public static PageMediaType.PageMediaTypeOption Stationary
```


Καθορίζει ειδικά μέσα γραφικής ύλης.

### TShirtTransfer {#TShirtTransfer}
```
public static PageMediaType.PageMediaTypeOption TShirtTransfer
```


Καθορίζει ειδικά μέσα μεταφοράς για T‑shirt.

### TabStockFull {#TabStockFull}
```
public static PageMediaType.PageMediaTypeOption TabStockFull
```


Καθορίζει τα μέσα αποθέματος καρτελών που δεν είναι προκομμένα (μονές καρτέλες).

### TabStockPreCut {#TabStockPreCut}
```
public static PageMediaType.PageMediaTypeOption TabStockPreCut
```


Καθορίζει τα μέσα αποθέματος καρτελών που είναι προκομμένα (πολλαπλές καρτέλες).

### Transparency {#Transparency}
```
public static PageMediaType.PageMediaTypeOption Transparency
```


Καθορίζει μέσα διαφάνειας.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Προσθέτει μια λίστα αντικειμένων στο τέλος της λίστας αντικειμένων αυτής της επιλογής. Κάθε ένα πρέπει να είναι ένα  ScoredProperty  ή ένα  Property  αντικείμενο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Λίστα αντικειμένων προς προσθήκη. |

### add(PageMediaType.IPageMediaTypeOptionItem[] items) {#add-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-}
```
public PageMediaType.PageMediaTypeOption add(PageMediaType.IPageMediaTypeOptionItem[] items)
```


Προσθέτει έναν πίνακα των  IPageMediaTypeOptionItem  αντικειμένων στην επιλογή.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| items | [IPageMediaTypeOptionItem\[\]](../../com.aspose.xps.metadata/ipagemediatypeoptionitem) | Ένας αυθαίρετος πίνακας των  IPageMediaTypeOptionItem  αντικειμένων. |

**Returns:**
[PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) - This options instance.
### clone() {#clone--}
```
public PageMediaType.PageMediaTypeOption clone()
```


Κλωνοποιεί αυτό το στιγμιότυπο επιλογής. Η συντόμευση για τον κατασκευαστή κλωνοποίησης.

**Returns:**
[PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) - The clone of this option instance.
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




### setWeight(int weight) {#setWeight-int-}
```
public PageMediaType.PageMediaTypeOption setWeight(int weight)
```


Ορίζει μια τιμή ιδιότητας  Weight .

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| βάρος | int | Μια τιμή ιδιότητας  Weight . |

**Returns:**
[PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) - This option instance.
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

