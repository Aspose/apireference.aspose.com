---
title: "FileResult"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Αντιπροσωπεύει το αποτέλεσμα της λειτουργίας με τη μορφή διαδρομής string προς το αρχείο."
type: docs
weight: 14
url: /el/java/com.aspose.page.plugins/fileresult/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IOperationResult](../../com.aspose.page.plugins/ioperationresult)
```
public final class FileResult implements IOperationResult
```

Αντιπροσωπεύει το αποτέλεσμα της λειτουργίας με τη μορφή διαδρομής string προς το αρχείο.
## Κατασκευαστές

| Κατασκευαστής | Περιγραφή |
| --- | --- |
| [FileResult(String path)](#FileResult-java.lang.String-) | Αρχικοποιεί μια νέα παρουσία με τη συγκεκριμένη διαδρομή σε ένα output file. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getData()](#getData--) | Αποκτά ακατέργαστα δεδομένα. |
| [hashCode()](#hashCode--) |  |
| [isByteArray()](#isByteArray--) | Δείχνει αν το αποτέλεσμα είναι ένας πίνακας bytes. |
| [isFile()](#isFile--) | Δείχνει αν το αποτέλεσμα είναι διαδρομή προς ένα αρχείο εξόδου. |
| [isStream()](#isStream--) | Δείχνει αν το αποτέλεσμα είναι ένα output stream. |
| [isString()](#isString--) | Δείχνει αν το αποτέλεσμα είναι μια συμβολοσειρά κειμένου. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toFile()](#toFile--) | Προσπαθεί να μετατρέψει το αποτέλεσμα σε αρχείο. |
| [toStream()](#toStream--) | Προσπαθεί να μετατρέψει το αποτέλεσμα σε αντικείμενο ροής. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FileResult(String path) {#FileResult-java.lang.String-}
```
public FileResult(String path)
```


Αρχικοποιεί μια νέα παρουσία με τη συγκεκριμένη διαδρομή σε ένα output file.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| path | java.lang.String | Διαδρομή προς ένα αρχείο. |

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
### getData() {#getData--}
```
public final Object getData()
```


Αποκτά ακατέργαστα δεδομένα.

**Returns:**
java.lang.Object - Ένα αντικείμενο που αντιπροσωπεύει τα δεδομένα εξόδου.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isByteArray() {#isByteArray--}
```
public final boolean isByteArray()
```


Δείχνει αν το αποτέλεσμα είναι ένας πίνακας bytes.

**Returns:**
boolean - true αν το αποτέλεσμα είναι ένας πίνακας bytes· διαφορετικά false.
### isFile() {#isFile--}
```
public final boolean isFile()
```


Δείχνει αν το αποτέλεσμα είναι διαδρομή προς ένα αρχείο εξόδου.

**Returns:**
boolean - true αν το αποτέλεσμα είναι αρχείο· διαφορετικά false.
### isStream() {#isStream--}
```
public final boolean isStream()
```


Δείχνει αν το αποτέλεσμα είναι ένα output stream.

**Returns:**
boolean - true αν το αποτέλεσμα είναι αντικείμενο ροής· διαφορετικά false.
### isString() {#isString--}
```
public final boolean isString()
```


Δείχνει αν το αποτέλεσμα είναι μια συμβολοσειρά κειμένου.

**Returns:**
boolean - true αν το αποτέλεσμα είναι συμβολοσειρά· διαφορετικά false.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### toFile() {#toFile--}
```
public final String toFile()
```


Προσπαθεί να μετατρέψει το αποτέλεσμα σε αρχείο.

**Returns:**
java.lang.String - Μια συμβολοσειρά που αντιπροσωπεύει τη διαδρομή προς το αρχείο εξόδου αν το αποτέλεσμα είναι αρχείο· διαφορετικά null.
### toStream() {#toStream--}
```
public final OutputStream toStream()
```


Προσπαθεί να μετατρέψει το αποτέλεσμα σε αντικείμενο ροής.

**Returns:**
java.io.OutputStream - Ένα αντικείμενο ροής που αντιπροσωπεύει τα δεδομένα εξόδου αν το αποτέλεσμα είναι ροή· διαφορετικά null.
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

