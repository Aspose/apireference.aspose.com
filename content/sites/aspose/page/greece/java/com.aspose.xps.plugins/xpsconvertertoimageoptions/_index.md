---
title: "XpsConverterToImageOptions"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Αναπαριστά τις επιλογές μετατροπέα XPS σε Εικόνα για το πρόσθετο."
type: docs
weight: 12
url: /el/java/com.aspose.xps.plugins/xpsconvertertoimageoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.plugins.XpsConverterOptions](../../com.aspose.xps.plugins/xpsconverteroptions)
```
public class XpsConverterToImageOptions extends XpsConverterOptions
```

Αναπαριστά τις επιλογές μετατροπέα XPS σε Εικόνα για το πρόσθετο [XpsConverter](../../com.aspose.xps.plugins/xpsconverter).
## Κατασκευαστές

| Κατασκευαστής | Περιγραφή |
| --- | --- |
| [XpsConverterToImageOptions()](#XpsConverterToImageOptions--) | Αρχικοποιεί νέα παρουσία του αντικειμένου [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions). |
| [XpsConverterToImageOptions(ImageFormat imageFormat)](#XpsConverterToImageOptions-com.aspose.page.ImageFormat-) | Αρχικοποιεί νέα παρουσία του αντικειμένου [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) με μορφή εικόνας. |
| [XpsConverterToImageOptions(Dimension size)](#XpsConverterToImageOptions-java.awt.Dimension-) | Αρχικοποιεί νέα παρουσία του αντικειμένου [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) με μέγεθος της παραγόμενης εικόνας. |
| [XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size)](#XpsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-) | Αρχικοποιεί νέα παρουσία του αντικειμένου [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) με μορφή εικόνας. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | Προσθέτει νέα πηγή δεδομένων στη συλλογή δεδομένων του πρόσθετου XpsConverter. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | Προσθέτει νέα πηγή δεδομένων στη συλλογή δεδομένων του πρόσθετου XpsConverterOptions. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | Επιστρέφει τη συλλογή δεδομένων του πρόσθετου XpsConverterOptions. |
| [getImageFormat()](#getImageFormat--) | Λαμβάνει τη μορφή εικόνας. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Επιστρέφει την τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα. |
| [getOperationName()](#getOperationName--) | Επιστρέφει το όνομα της λειτουργίας. |
| [getPageNumbers()](#getPageNumbers--) | Λαμβάνει τον πίνακα αριθμών σελίδων του εγγράφου XPS προς μετατροπή. |
| [getResolution()](#getResolution--) | Λαμβάνει την ανάλυση της εικόνας. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Λαμβάνει τη συλλογή των προστεθειμένων στόχων για την αποθήκευση των αποτελεσμάτων της λειτουργίας. |
| [getSize()](#getSize--) | Λαμβάνει το μέγεθος της τελικής εικόνας. |
| [getSmoothingMode()](#getSmoothingMode--) | Λαμβάνει τη λειτουργία εξομάλυνσης για την απόδοση της εικόνας. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | Λαμβάνει τη μορφή εικόνας. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Ορίζει την τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα. |
| [setPageNumbers(int[] pageNumbers)](#setPageNumbers-int---) | Ορίζει τον πίνακα αριθμών σελίδων στο έγγραφο XPS για μετατροπή. |
| [setResolution(int resolution)](#setResolution-int-) | Ορίζει την ανάλυση της εικόνας. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Ορίζει το μέγεθος της τελικής εικόνας. |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-) | Ορίζει τη λειτουργία εξομάλυνσης για την απόδοση της εικόνας. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsConverterToImageOptions() {#XpsConverterToImageOptions--}
```
public XpsConverterToImageOptions()
```


Αρχικοποιεί νέα παρουσία του αντικειμένου [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions).

### XpsConverterToImageOptions(ImageFormat imageFormat) {#XpsConverterToImageOptions-com.aspose.page.ImageFormat-}
```
public XpsConverterToImageOptions(ImageFormat imageFormat)
```


Αρχικοποιεί νέα παρουσία του αντικειμένου [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) με μορφή εικόνας.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Μορφή της τελικής εικόνας. |

### XpsConverterToImageOptions(Dimension size) {#XpsConverterToImageOptions-java.awt.Dimension-}
```
public XpsConverterToImageOptions(Dimension size)
```


Αρχικοποιεί νέα παρουσία του αντικειμένου [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) με μέγεθος της παραγόμενης εικόνας.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| μέγεθος | java.awt.Dimension | Μέγεθος της τελικής εικόνας. |

### XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size) {#XpsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-}
```
public XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size)
```


Αρχικοποιεί νέα παρουσία του αντικειμένου [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) με μορφή εικόνας.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Μορφή της τελικής εικόνας. |
| μέγεθος | java.awt.Dimension |  |

### addDataSource(IDataSource dataSource) {#addDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addDataSource(IDataSource dataSource)
```


Προσθέτει νέα πηγή δεδομένων στη συλλογή δεδομένων του πρόσθετου XpsConverter.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Πηγή δεδομένων για προσθήκη. |

### addSaveDataSource(IDataSource saveDataSource) {#addSaveDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addSaveDataSource(IDataSource saveDataSource)
```


Προσθέτει νέα πηγή δεδομένων στη συλλογή δεδομένων του πρόσθετου XpsConverterOptions.

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


Επιστρέφει τη συλλογή δεδομένων του πρόσθετου XpsConverterOptions.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
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
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Λαμβάνει τον πίνακα αριθμών σελίδων του εγγράφου XPS προς μετατροπή.

**Returns:**
int[] - Ένας πίνακας αριθμών σελίδων στο έγγραφο XPS.
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
[SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) - A smoothing mode.
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

### setPageNumbers(int[] pageNumbers) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] pageNumbers)
```


Ορίζει τον πίνακα αριθμών σελίδων στο έγγραφο XPS για μετατροπή. Εάν δεν οριστεί, όλες οι σελίδες θα μετατραπούν.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| pageNumbers | int[] | Ένας πίνακας αριθμών σελίδων σε έγγραφο XPS. |

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

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


Ορίζει τη λειτουργία εξομάλυνσης για την απόδοση της εικόνας.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) | Μια λειτουργία εξομάλυνσης. |

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

