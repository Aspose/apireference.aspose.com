---
title: "XpsConverterOptions"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Αντιπροσωπεύει τη βασική κλάση των επιλογών για το plugin."
type: docs
weight: 11
url: /el/java/com.aspose.xps.plugins/xpsconverteroptions/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IPluginOptions](../../com.aspose.page.plugins/ipluginoptions), [com.aspose.page.plugins.IDataContainer](../../com.aspose.page.plugins/idatacontainer), [com.aspose.page.plugins.ISaveInstruction](../../com.aspose.page.plugins/isaveinstruction)
```
public class XpsConverterOptions implements IPluginOptions, IDataContainer, ISaveInstruction
```

Αντιπροσωπεύει τη βασική κλάση των επιλογών για το plugin [XpsConverter](../../com.aspose.xps.plugins/xpsconverter).
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | Προσθέτει νέα πηγή δεδομένων στη συλλογή δεδομένων του πρόσθετου XpsConverter. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | Προσθέτει νέα πηγή δεδομένων στη συλλογή δεδομένων του πρόσθετου XpsConverterOptions. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | Επιστρέφει τη συλλογή δεδομένων του πρόσθετου XpsConverterOptions. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Επιστρέφει την τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα. |
| [getOperationName()](#getOperationName--) | Επιστρέφει το όνομα της λειτουργίας. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Λαμβάνει τη συλλογή των προστεθειμένων στόχων για την αποθήκευση των αποτελεσμάτων της λειτουργίας. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Ορίζει την τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Επιστρέφει την τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα. Οι διαθέσιμες τιμές είναι από 0 έως 100. Όσο μικρότερος είναι ο αριθμός, τόσο μεγαλύτερη είναι η συμπίεση και, κατά συνέπεια, τόσο χαμηλότερη η ποιότητα της εικόνας. Η τιμή 0 οδηγεί στην εικόνα χαμηλότερης ποιότητας, ενώ η τιμή 100 στην υψηλότερη.

**Returns:**
int - Η τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα.
### getOperationName() {#getOperationName--}
```
public String getOperationName()
```


Επιστρέφει το όνομα της λειτουργίας.

**Returns:**
java.lang.String
### getSaveTargetsCollection() {#getSaveTargetsCollection--}
```
public final List<IDataSource> getSaveTargetsCollection()
```


Λαμβάνει τη συλλογή των προστεθειμένων στόχων για την αποθήκευση των αποτελεσμάτων της λειτουργίας.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
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




### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Ορίζει την τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα. Οι διαθέσιμες τιμές είναι από 0 έως 100. Όσο μικρότερος είναι ο αριθμός, τόσο μεγαλύτερη η συμπίεση και, κατά συνέπεια, τόσο χαμηλότερη η ποιότητα της εικόνας. Η τιμή 0 οδηγεί στην εικόνα χαμηλότερης ποιότητας, ενώ η τιμή 100 στην υψηλότερη.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | int | Η τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα. |

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

