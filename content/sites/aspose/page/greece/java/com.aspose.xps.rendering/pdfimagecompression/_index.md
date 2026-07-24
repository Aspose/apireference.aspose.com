---
title: "PdfImageCompression"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Καθορίζει τον τύπο συμπίεσης που εφαρμόζεται στις εικόνες του αρχείου PDF."
type: docs
weight: 22
url: /el/java/com.aspose.xps.rendering/pdfimagecompression/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum PdfImageCompression extends Enum<PdfImageCompression>
```

Καθορίζει τον τύπο συμπίεσης που εφαρμόζεται στις εικόνες του αρχείου PDF.
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| [Auto](#Auto) | Επιλέγει αυτόματα τη πιο κατάλληλη συμπίεση για κάθε εικόνα. |
| [Flate](#Flate) | Συμπίεση Flate. |
| [Jpeg](#Jpeg) | Συμπίεση JPEG. |
| [LzwBaselinePredictor](#LzwBaselinePredictor) | Η επιλογή προγνωστικού περιορίζεται στον προγνωστικό PNG Paeth για να επιταχύνει τη διαδικασία. |
| [LzwOptimizedPredictor](#LzwOptimizedPredictor) | Η επιλογή προγνωστικού είναι πιο περίπλοκη και θα πρέπει να καταλήξει σε μικρότερα μεγέθη εικόνας, αλλά απαιτεί περισσότερο χρόνο. |
| [None](#None) | Αποθηκεύει ακατέργαστα byte εικόνας, με αποτέλεσμα μεγαλύτερα μεγέθη αρχείων PDF. |
| [Rle](#Rle) | Συμπίεση Run Length. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [<T>valueOf(Class<T> arg0, String arg1)](#-T-valueOf-java.lang.Class-T--java.lang.String-) |  |
| [compareTo(E arg0)](#compareTo-E-) |  |
| [describeConstable()](#describeConstable--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDeclaringClass()](#getDeclaringClass--) |  |
| [hashCode()](#hashCode--) |  |
| [name()](#name--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [ordinal()](#ordinal--) |  |
| [toString()](#toString--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
| [values()](#values--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Auto {#Auto}
```
public static final PdfImageCompression Auto
```


Επιλέγει αυτόματα τη πιο κατάλληλη συμπίεση για κάθε εικόνα.

### Flate {#Flate}
```
public static final PdfImageCompression Flate
```


Συμπίεση Flate.

### Jpeg {#Jpeg}
```
public static final PdfImageCompression Jpeg
```


Συμπίεση JPEG. Δεν υποστηρίζει διαφάνεια.

### LzwBaselinePredictor {#LzwBaselinePredictor}
```
public static final PdfImageCompression LzwBaselinePredictor
```


Η επιλογή προγνωστικού περιορίζεται στον προγνωστικό PNG Paeth για να επιταχύνει τη διαδικασία. Στην πράξη αποδίδει εκπληκτικά καλά. Καλύτερο από το  LzwOptimizedPredictor .

### LzwOptimizedPredictor {#LzwOptimizedPredictor}
```
public static final PdfImageCompression LzwOptimizedPredictor
```


Η επιλογή προγνωστικού είναι πιο περίπλοκη και θα πρέπει να καταλήξει σε μικρότερα μεγέθη εικόνας, αλλά απαιτεί περισσότερο χρόνο.

### None {#None}
```
public static final PdfImageCompression None
```


Αποθηκεύει ακατέργαστα byte εικόνας, με αποτέλεσμα μεγαλύτερα μεγέθη αρχείων PDF.

### Rle {#Rle}
```
public static final PdfImageCompression Rle
```


Συμπίεση Run Length.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| arg0 | java.lang.Class<T> |  |
| arg1 | java.lang.String |  |

**Returns:**
T
### compareTo(E arg0) {#compareTo-E-}
```
public final int compareTo(E arg0)
```




**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| arg0 | E |  |

**Returns:**
int
### describeConstable() {#describeConstable--}
```
public final Optional<Enum.EnumDesc<E>> describeConstable()
```




**Returns:**
java.util.Optional<java.lang.Enum.EnumDesc<E>>
### equals(Object arg0) {#equals-java.lang.Object-}
```
public final boolean equals(Object arg0)
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
### getDeclaringClass() {#getDeclaringClass--}
```
public final Class<E> getDeclaringClass()
```




**Returns:**
java.lang.Class<E>
### hashCode() {#hashCode--}
```
public final int hashCode()
```




**Returns:**
int
### name() {#name--}
```
public final String name()
```




**Returns:**
java.lang.String
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### ordinal() {#ordinal--}
```
public final int ordinal()
```




**Returns:**
int
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static PdfImageCompression valueOf(String name)
```




**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| όνομα | java.lang.String |  |

**Returns:**
[PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression)
### values() {#values--}
```
public static PdfImageCompression[] values()
```




**Returns:**
com.aspose.xps.rendering.PdfImageCompression[]
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

