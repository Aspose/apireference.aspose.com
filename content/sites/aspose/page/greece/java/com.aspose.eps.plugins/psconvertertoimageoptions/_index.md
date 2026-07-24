---
title: "PsConverterToImageOptions"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Αναπαριστά τις επιλογές του μετατροπέα PS/EPS σε εικόνα για το plugin."
type: docs
weight: 12
url: /el/java/com.aspose.eps.plugins/psconvertertoimageoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.eps.plugins.PsConverterOptions](../../com.aspose.eps.plugins/psconverteroptions)
```
public class PsConverterToImageOptions extends PsConverterOptions
```

Αναπαριστά τις επιλογές του μετατροπέα PS/EPS σε εικόνα για το πρόσθετο [PsConverter](../../com.aspose.eps.plugins/psconverter) plugin.
## Κατασκευαστές

| Κατασκευαστής | Περιγραφή |
| --- | --- |
| [PsConverterToImageOptions()](#PsConverterToImageOptions--) | Αρχικοποιεί νέα παρουσία του αντικειμένου [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions). |
| [PsConverterToImageOptions(ImageFormat imageFormat)](#PsConverterToImageOptions-com.aspose.page.ImageFormat-) | Αρχικοποιεί νέα παρουσία του αντικειμένου [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) με μορφή εικόνας. |
| [PsConverterToImageOptions(Dimension size)](#PsConverterToImageOptions-java.awt.Dimension-) | Αρχικοποιεί νέα παρουσία του αντικειμένου [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) με μέγεθος της παραγόμενης εικόνας. |
| [PsConverterToImageOptions(ImageFormat imageFormat, Dimension size)](#PsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-) | Αρχικοποιεί νέα παρουσία του αντικειμένου [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) με μορφή εικόνας. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | Προσθέτει νέα πηγή δεδομένων στη συλλογή δεδομένων του πρόσθετου PsConverter. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | Προσθέτει νέα πηγή δεδομένων στη συλλογή δεδομένων του πρόσθετου PsConverterOptions. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Επιστρέφει πρόσθετους φακέλους γραμματοσειρών όπου ο μετατροπέας πρέπει να βρει γραμματοσειρές για το έγγραφο εισόδου. |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | Επιστρέφει τη συλλογή δεδομένων του πρόσθετου PsConverterOptions. |
| [getExceptions()](#getExceptions--) | Επιστρέφει μια λίστα μη-κριτικών σφαλμάτων. |
| [getImageFormat()](#getImageFormat--) | Λαμβάνει τη μορφή εικόνας. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Επιστρέφει την τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα. |
| [getOperationName()](#getOperationName--) | Επιστρέφει το όνομα της λειτουργίας. |
| [getResolution()](#getResolution--) | Λαμβάνει την ανάλυση της εικόνας. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Λαμβάνει τη συλλογή των προστεθειμένων στόχων για την αποθήκευση των αποτελεσμάτων της λειτουργίας. |
| [getSize()](#getSize--) | Λαμβάνει το μέγεθος της τελικής εικόνας. |
| [getSmoothingMode()](#getSmoothingMode--) | Λαμβάνει τη λειτουργία εξομάλυνσης για την απόδοση της εικόνας. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Λαμβάνει τη σημαία που επιτρέπει την έξοδο προειδοποιήσεων και μηνυμάτων κατά τη μετατροπή. |
| [isSupressErrors()](#isSupressErrors--) | Επιστρέφει μια τιμή που υποδεικνύει αν τα σφάλματα θα καταστούν κατά τη μετατροπή. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Καθορίζει πρόσθετους φακέλους γραμματοσειρών όπου ο μετατροπέας πρέπει να βρει γραμματοσειρές για το έγγραφο εισόδου. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Καθορίζει τη σημαία που επιτρέπει την έξοδο προειδοποιήσεων και μηνυμάτων κατά τη μετατροπή. |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | Λαμβάνει τη μορφή εικόνας. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Ορίζει την τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα. |
| [setResolution(int resolution)](#setResolution-int-) | Ορίζει την ανάλυση της εικόνας. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Ορίζει το μέγεθος της τελικής εικόνας. |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.eps.device.SmoothingMode-) | Ορίζει τη λειτουργία εξομάλυνσης για την απόδοση της εικόνας. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Καθορίζει τη σημαία που υποδεικνύει εάν τα σφάλματα θα κατασταλούν κατά τη μετατροπή. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PsConverterToImageOptions() {#PsConverterToImageOptions--}
```
public PsConverterToImageOptions()
```


Αρχικοποιεί νέα παρουσία του αντικειμένου [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions).

### PsConverterToImageOptions(ImageFormat imageFormat) {#PsConverterToImageOptions-com.aspose.page.ImageFormat-}
```
public PsConverterToImageOptions(ImageFormat imageFormat)
```


Αρχικοποιεί νέα παρουσία του αντικειμένου [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) με μορφή εικόνας.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Μορφή της τελικής εικόνας. |

### PsConverterToImageOptions(Dimension size) {#PsConverterToImageOptions-java.awt.Dimension-}
```
public PsConverterToImageOptions(Dimension size)
```


Αρχικοποιεί νέα παρουσία του αντικειμένου [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) με μέγεθος της παραγόμενης εικόνας.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| μέγεθος | java.awt.Dimension | Μέγεθος της τελικής εικόνας. |

### PsConverterToImageOptions(ImageFormat imageFormat, Dimension size) {#PsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-}
```
public PsConverterToImageOptions(ImageFormat imageFormat, Dimension size)
```


Αρχικοποιεί νέα παρουσία του αντικειμένου [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) με μορφή εικόνας.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Μορφή της τελικής εικόνας. |
| μέγεθος | java.awt.Dimension |  |

### addDataSource(IDataSource dataSource) {#addDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addDataSource(IDataSource dataSource)
```


Προσθέτει νέα πηγή δεδομένων στη συλλογή δεδομένων του πρόσθετου PsConverter.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Πηγή δεδομένων για προσθήκη. |

### addSaveDataSource(IDataSource saveDataSource) {#addSaveDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addSaveDataSource(IDataSource saveDataSource)
```


Προσθέτει νέα πηγή δεδομένων στη συλλογή δεδομένων του πρόσθετου PsConverterOptions.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| saveDataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Πηγή δεδομένων (αρχείο ή ροή) για την αποθήκευση των αποτελεσμάτων της λειτουργίας. |

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
### getAdditionalFontsFolders() {#getAdditionalFontsFolders--}
```
public String[] getAdditionalFontsFolders()
```


Επιστρέφει πρόσθετους φακέλους γραμματοσειρών όπου ο μετατροπέας πρέπει να βρει γραμματοσειρές για το έγγραφο εισόδου. Ο προεπιλεγμένος φάκελος είναι ο τυπικός φάκελος γραμματοσειρών όπου το λειτουργικό σύστημα βρίσκει γραμματοσειρές για εσωτερικές ανάγκες.

**Returns:**
java.lang.String[] - Μια σειρά από φακέλους γραμματοσειρών.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDataCollection() {#getDataCollection--}
```
public final List<IDataSource> getDataCollection()
```


Επιστρέφει τη συλλογή δεδομένων του πρόσθετου PsConverterOptions.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


Επιστρέφει μια λίστα μη-κριτικών σφαλμάτων.

**Returns:**
java.util.List<java.lang.Exception> - Λίστα εξαιρέσεων
### getImageFormat() {#getImageFormat--}
```
public ImageFormat getImageFormat()
```


Λαμβάνει τη μορφή εικόνας.

**Returns:**
[ImageFormat](../../com.aspose.page/imageformat) - An image format.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Επιστρέφει την τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα. Οι διαθέσιμες τιμές είναι από 0 έως 100. Όσο μικρότερος είναι ο αριθμός, τόσο μεγαλύτερη είναι η συμπίεση και, κατά συνέπεια, τόσο χαμηλότερη η ποιότητα της εικόνας. Η τιμή 0 οδηγεί στην εικόνα χαμηλότερης ποιότητας, ενώ η τιμή 100 στην υψηλότερη.

**Returns:**
int - Η τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα.
### getOperationName() {#getOperationName--}
```
public final String getOperationName()
```


Επιστρέφει το όνομα της λειτουργίας.

**Returns:**
java.lang.String
### getResolution() {#getResolution--}
```
public int getResolution()
```


Λαμβάνει την ανάλυση της εικόνας.

**Returns:**
int - Μια ανάλυση εικόνας.
### getSaveTargetsCollection() {#getSaveTargetsCollection--}
```
public final List<IDataSource> getSaveTargetsCollection()
```


Λαμβάνει τη συλλογή των προστεθειμένων στόχων για την αποθήκευση των αποτελεσμάτων της λειτουργίας.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### getSize() {#getSize--}
```
public Dimension getSize()
```


Λαμβάνει το μέγεθος της τελικής εικόνας.

**Returns:**
java.awt.Dimension - Μέγεθος εικόνας.
### getSmoothingMode() {#getSmoothingMode--}
```
public SmoothingMode getSmoothingMode()
```


Λαμβάνει τη λειτουργία εξομάλυνσης για την απόδοση της εικόνας.

**Returns:**
[SmoothingMode](../../com.aspose.eps.device/smoothingmode) - A smoothing mode.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isDebug() {#isDebug--}
```
public boolean isDebug()
```


Λαμβάνει τη σημαία που επιτρέπει την έξοδο προειδοποιήσεων και μηνυμάτων κατά τη μετατροπή.

**Returns:**
boolean - τιμή debug.
### isSupressErrors() {#isSupressErrors--}
```
public boolean isSupressErrors()
```


Επιστρέφει μια τιμή που υποδεικνύει αν τα σφάλματα θα καταστούν κατά τη μετατροπή.

**Returns:**
boolean - τιμή boolean
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setAdditionalFontsFolders(String[] fontsFolders) {#setAdditionalFontsFolders-java.lang.String---}
```
public void setAdditionalFontsFolders(String[] fontsFolders)
```


Καθορίζει πρόσθετους φακέλους γραμματοσειρών όπου ο μετατροπέας πρέπει να βρει γραμματοσειρές για το έγγραφο εισόδου. Ο προεπιλεγμένος φάκελος είναι ο τυπικός φάκελος γραμματοσειρών όπου το λειτουργικό σύστημα βρίσκει γραμματοσειρές για εσωτερικές ανάγκες.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| fontsFolders | java.lang.String[] | Μια σειρά από φακέλους γραμματοσειρών. |

### setDebug(boolean debug) {#setDebug-boolean-}
```
public void setDebug(boolean debug)
```


Καθορίζει τη σημαία που επιτρέπει την έξοδο προειδοποιήσεων και μηνυμάτων κατά τη μετατροπή.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| debug | boolean | Τιμή Boolean. |

### setImageFormat(ImageFormat imageFormat) {#setImageFormat-com.aspose.page.ImageFormat-}
```
public void setImageFormat(ImageFormat imageFormat)
```


Λαμβάνει τη μορφή εικόνας.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Μορφή της τελικής εικόνας. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Ορίζει την τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα. Οι διαθέσιμες τιμές είναι από 0 έως 100. Όσο μικρότερος είναι ο αριθμός, τόσο μεγαλύτερη η συμπίεση και, κατά συνέπεια, τόσο χαμηλότερη η ποιότητα της εικόνας. Η τιμή 0 οδηγεί στην εικόνα χαμηλότερης ποιότητας, ενώ η τιμή 100 στην υψηλότερη.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | int | Η τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα. |

### setResolution(int resolution) {#setResolution-int-}
```
public void setResolution(int resolution)
```


Ορίζει την ανάλυση της εικόνας.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| ανάλυση | int | Μια ανάλυση της παραγόμενης εικόνας. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Ορίζει το μέγεθος της τελικής εικόνας.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| μέγεθος | java.awt.Dimension | Μέγεθος της παραγόμενης εικόνας. |

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.eps.device.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


Ορίζει τη λειτουργία εξομάλυνσης για την απόδοση της εικόνας.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.eps.device/smoothingmode) | Μια λειτουργία εξομάλυνσης. |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Καθορίζει τη σημαία που υποδεικνύει εάν τα σφάλματα θα κατασταλούν κατά τη μετατροπή.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| supressErrors | boolean | Τιμή Boolean. |

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

