---
title: "Άδεια"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Παρέχει μεθόδους για την άδεια του στοιχείου."
type: docs
weight: 14
url: /el/java/com.aspose.page/license/
---
**Inheritance:**
java.lang.Object
```
public class License
```

Παρέχει μεθόδους για την άδεια του στοιχείου.

Σε αυτό το παράδειγμα, θα γίνει προσπάθεια να βρεθεί ένα αρχείο άδειας με όνομα MyLicense.lic στον φάκελο που περιέχει το στοιχείο, στον φάκελο που περιέχει το καλούντα assembly, στον φάκελο του entry assembly και, τέλος, στους ενσωματωμένους πόρους του καλούντος assembly.

License license = new License();
license.setLicense("MyLicense.lic");
## Κατασκευαστές

| Κατασκευαστής | Περιγραφή |
| --- | --- |
| [License()](#License--) | Αρχικοποιεί μια νέα παρουσία αυτής της κλάσης. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [isInternalFIPSSecurity()](#isInternalFIPSSecurity--) | Από προεπιλογή χρησιμοποιούμε την προεπιλεγμένη ασφάλεια jdk. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setInternalFIPSSecurity(boolean internalFIPSSecurity)](#setInternalFIPSSecurity-boolean-) | Από προεπιλογή χρησιμοποιούμε την προεπιλεγμένη ασφάλεια jre. |
| [setLicense(InputStream stream)](#setLicense-java.io.InputStream-) | Παρέχει άδεια στο στοιχείο. |
| [setLicense(String licenseName)](#setLicense-java.lang.String-) | Παρέχει άδεια στο στοιχείο. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### License() {#License--}
```
public License()
```


Αρχικοποιεί μια νέα παρουσία αυτής της κλάσης.

Σε αυτό το παράδειγμα, θα γίνει προσπάθεια να βρεθεί ένα αρχείο άδειας με όνομα MyLicense.lic στον φάκελο που περιέχει το στοιχείο, στον φάκελο που περιέχει το καλούντα assembly, στον φάκελο του entry assembly και, τέλος, στους ενσωματωμένους πόρους του καλούντος assembly.

License license = new License();
license.setLicense("MyLicense.lic");

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
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isInternalFIPSSecurity() {#isInternalFIPSSecurity--}
```
public static boolean isInternalFIPSSecurity()
```


Από προεπιλογή χρησιμοποιούμε την προεπιλεγμένη ασφάλεια jdk. Η προεπιλεγμένη τιμή == false. Σε ορισμένες περιπτώσεις το προσαρμοσμένο περιβάλλον java δεν μπορεί να υποστηρίξει τους απαιτούμενους αλγόριθμους, οπότε μπορούμε να προτείνουμε τη χρήση της ενσωματωμένης ασφάλειας FIPS.

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




### setInternalFIPSSecurity(boolean internalFIPSSecurity) {#setInternalFIPSSecurity-boolean-}
```
public static void setInternalFIPSSecurity(boolean internalFIPSSecurity)
```


Από προεπιλογή χρησιμοποιούμε την προεπιλεγμένη ασφάλεια jre. Η προεπιλεγμένη τιμή == false. Σε ορισμένες περιπτώσεις το προσαρμοσμένο περιβάλλον java δεν μπορεί να υποστηρίξει τους απαιτούμενους αλγόριθμους, οπότε μπορούμε να προτείνουμε τη χρήση της ενσωματωμένης ασφάλειας FIPS.

Σημειώστε επίσης: Σύμφωνα με τον αλγόριθμο JVM SecureRandom σε ορισμένα λειτουργικά συστήματα το /dev/random περιμένει να παραχθεί μια συγκεκριμένη ποσότητα \u201cnoise\u201d στο κεντρικό σύστημα πριν επιστρέψει αποτέλεσμα. Η βιβλιοθήκη που χρησιμοποιείται για τη δημιουργία τυχαίων αριθμών στην JVM της Oracle\u2019s βασίζεται προεπιλεγμένα στο /dev/random για πλατφόρμες UNIX. Αν και το /dev/random είναι πιο ασφαλές, συνιστάται η χρήση του /dev/urandom εάν η προεπιλεγμένη διαμόρφωση JVM έχει καθυστερήσεις, ή η προσθήκη συσκευών που παράγουν εντροπία για το /dev/random.

Η παρακάτω επιλογή java μπορεί να βοηθήσει στην αποφυγή καθυστερήσεων και να παρακάμψει τη ρύθμιση securerandom.source. -Djava.security.egd=file:/dev/./urandom

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| internalFIPSSecurity | boolean | boolean τιμή |

### setLicense(InputStream stream) {#setLicense-java.io.InputStream-}
```
public void setLicense(InputStream stream)
```


Παρέχει άδεια στο στοιχείο.

Μία ροή που περιέχει την άδεια.

Χρησιμοποιήστε αυτή τη μέθοδο για να φορτώσετε μια άδεια από μια ροή.

License license = new License();
license.setLicense(myStream);

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| ροή | java.io.InputStream | license Ροή |

### setLicense(String licenseName) {#setLicense-java.lang.String-}
```
public void setLicense(String licenseName)
```


Παρέχει άδεια στο στοιχείο.

Προσπαθεί να βρει την άδεια στις ακόλουθες τοποθεσίες:

1. Σαφής διαδρομή.

2. Ο φάκελος του αρχείου jar του στοιχείου.

Σε αυτό το παράδειγμα, θα γίνει προσπάθεια να βρεθεί ένα αρχείο άδειας με όνομα MyLicense.lic στον φάκελο που περιέχει το στοιχείο, στον φάκελο που περιέχει το καλούντα assembly, στον φάκελο του entry assembly και, τέλος, στους ενσωματωμένους πόρους του καλούντος assembly.

License license = new License();
license.setLicense("MyLicense.lic");

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| licenseName | java.lang.String | Μπορεί να είναι πλήρες ή σύντομο όνομα αρχείου ή όνομα ενσωματωμένου πόρου. Χρησιμοποιήστε κενό string για να μεταβείτε σε λειτουργία αξιολόγησης. |

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

