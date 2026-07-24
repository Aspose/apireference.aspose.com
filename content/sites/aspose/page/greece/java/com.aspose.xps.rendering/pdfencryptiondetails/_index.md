---
title: "PdfEncryptionDetails"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Περιέχει λεπτομέρειες για κρυπτογράφηση pdf."
type: docs
weight: 13
url: /el/java/com.aspose.xps.rendering/pdfencryptiondetails/
---
**Inheritance:**
java.lang.Object
```
public class PdfEncryptionDetails
```

Περιέχει λεπτομέρειες για κρυπτογράφηση pdf.
## Κατασκευαστές

| Κατασκευαστής | Περιγραφή |
| --- | --- |
| [PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm)](#PdfEncryptionDetails-java.lang.String-java.lang.String-int-com.aspose.xps.rendering.PdfEncryptionAlgorithm-) | Αρχικοποιεί μια νέα παρουσία της κλάσης  PdfEncryptionDetailsCore . |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getEncryptionAlgorithm()](#getEncryptionAlgorithm--) | Επιστρέφει τη λειτουργία κρυπτογράφησης. |
| [getOwnerPassword()](#getOwnerPassword--) | Επιστρέφει τον κωδικό πρόσβασης ιδιοκτήτη. |
| [getPermissions()](#getPermissions--) | Επιστρέφει τα δικαιώματα. |
| [getUserPassword()](#getUserPassword--) | Επιστρέφει τον κωδικό πρόσβασης χρήστη. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setEncryptionAlgorithm(PdfEncryptionAlgorithm value)](#setEncryptionAlgorithm-com.aspose.xps.rendering.PdfEncryptionAlgorithm-) | Ορίζει τη λειτουργία κρυπτογράφησης. |
| [setOwnerPassword(String value)](#setOwnerPassword-java.lang.String-) | Ορίζει τον κωδικό πρόσβασης ιδιοκτήτη. |
| [setPermissions(int value)](#setPermissions-int-) | Ορίζει τα δικαιώματα. |
| [setUserPassword(String value)](#setUserPassword-java.lang.String-) | Ορίζει τον κωδικό πρόσβασης χρήστη. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm) {#PdfEncryptionDetails-java.lang.String-java.lang.String-int-com.aspose.xps.rendering.PdfEncryptionAlgorithm-}
```
public PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm)
```


Αρχικοποιεί μια νέα παρουσία της κλάσης  PdfEncryptionDetailsCore .

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| userPassword | java.lang.String | Ο κωδικός πρόσβασης χρήστη. |
| ownerPassword | java.lang.String | Ο κωδικός πρόσβασης ιδιοκτήτη. |
| permissions | int | Τα δικαιώματα. |
| encryptionAlgorithm | [PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) | Ο αλγόριθμος κρυπτογράφησης. |

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
### getEncryptionAlgorithm() {#getEncryptionAlgorithm--}
```
public PdfEncryptionAlgorithm getEncryptionAlgorithm()
```


Επιστρέφει τη λειτουργία κρυπτογράφησης.

**Returns:**
[PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) - The encryption algorithm.
### getOwnerPassword() {#getOwnerPassword--}
```
public String getOwnerPassword()
```


Επιστρέφει τον κωδικό πρόσβασης ιδιοκτήτη.

Το άνοιγμα του εγγράφου με τον σωστό κωδικό πρόσβασης ιδιοκτήτη (υποθέτοντας ότι δεν είναι ίδιος με τον κωδικό πρόσβασης χρήστη) επιτρέπει πλήρη (ιδιοκτήτη) πρόσβαση στο έγγραφο. Αυτή η απεριόριστη πρόσβαση περιλαμβάνει τη δυνατότητα αλλαγής των κωδικών πρόσβασης του εγγράφου\u2019s και των δικαιωμάτων πρόσβασης.

**Returns:**
java.lang.String - Ο κωδικός πρόσβασης του ιδιοκτήτη.
### getPermissions() {#getPermissions--}
```
public int getPermissions()
```


Επιστρέφει τα δικαιώματα.

**Returns:**
int - Τα δικαιώματα.
### getUserPassword() {#getUserPassword--}
```
public String getUserPassword()
```


Επιστρέφει τον κωδικό πρόσβασης χρήστη.

Το άνοιγμα του εγγράφου με τον σωστό κωδικό πρόσβασης χρήστη (ή το άνοιγμα ενός εγγράφου που δεν έχει κωδικό πρόσβασης χρήστη) επιτρέπει την εκτέλεση πρόσθετων λειτουργιών σύμφωνα με τα δικαιώματα πρόσβασης χρήστη που καθορίζονται στο λεξικό κρυπτογράφησης του εγγράφου.

**Returns:**
java.lang.String - Ο κωδικός πρόσβασης χρήστη.
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




### setEncryptionAlgorithm(PdfEncryptionAlgorithm value) {#setEncryptionAlgorithm-com.aspose.xps.rendering.PdfEncryptionAlgorithm-}
```
public void setEncryptionAlgorithm(PdfEncryptionAlgorithm value)
```


Ορίζει τη λειτουργία κρυπτογράφησης.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| value | [PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) | Ο αλγόριθμος κρυπτογράφησης. |

### setOwnerPassword(String value) {#setOwnerPassword-java.lang.String-}
```
public void setOwnerPassword(String value)
```


Ορίζει τον κωδικό πρόσβασης ιδιοκτήτη.

Το άνοιγμα του εγγράφου με τον σωστό κωδικό πρόσβασης ιδιοκτήτη (υποθέτοντας ότι δεν είναι ίδιος με τον κωδικό πρόσβασης χρήστη) επιτρέπει πλήρη (ιδιοκτήτη) πρόσβαση στο έγγραφο. Αυτή η απεριόριστη πρόσβαση περιλαμβάνει τη δυνατότητα αλλαγής των κωδικών πρόσβασης του εγγράφου\u2019s και των δικαιωμάτων πρόσβασης.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | java.lang.String | Ο κωδικός πρόσβασης ιδιοκτήτη. |

### setPermissions(int value) {#setPermissions-int-}
```
public void setPermissions(int value)
```


Ορίζει τα δικαιώματα.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | int | Τα δικαιώματα. |

### setUserPassword(String value) {#setUserPassword-java.lang.String-}
```
public void setUserPassword(String value)
```


Ορίζει τον κωδικό πρόσβασης χρήστη.

Το άνοιγμα του εγγράφου με τον σωστό κωδικό πρόσβασης χρήστη (ή το άνοιγμα ενός εγγράφου που δεν έχει κωδικό πρόσβασης χρήστη) επιτρέπει την εκτέλεση πρόσθετων λειτουργιών σύμφωνα με τα δικαιώματα πρόσβασης χρήστη που καθορίζονται στο λεξικό κρυπτογράφησης του εγγράφου.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | java.lang.String | Ο κωδικός πρόσβασης χρήστη. |

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

