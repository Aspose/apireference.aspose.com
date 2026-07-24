---
title: "SaveOptions"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Αυτή η κλάση περιέχει τις επιλογές που απαιτούνται για τη διαχείριση της διαδικασίας μετατροπής."
type: docs
weight: 16
url: /el/java/com.aspose.page/saveoptions/
---
**Inheritance:**
java.lang.Object
```
public class SaveOptions
```

Αυτή η κλάση περιέχει τις επιλογές που απαιτούνται για τη διαχείριση της διαδικασίας μετατροπής.
## Κατασκευαστές

| Κατασκευαστής | Περιγραφή |
| --- | --- |
| [SaveOptions()](#SaveOptions--) | Αρχικοποιήστε νέο αντικείμενο SaveOptions με προεπιλεγμένες τιμές για τις σημαίες  suppressErrors  (true) και  debug  (false). |
| [SaveOptions(boolean supressErrors)](#SaveOptions-boolean-) | Αρχικοποιήστε νέο αντικείμενο SaveOptions με προεπιλεγμένη τιμή για τη σημαία  debug  (false). |
| [SaveOptions(Dimension size)](#SaveOptions-java.awt.Dimension-) | Αρχικοποιεί νέο αντικείμενο  SaveOptions  με καθορισμένο μέγεθος. |
| [SaveOptions(boolean supressErrors, Dimension size)](#SaveOptions-boolean-java.awt.Dimension-) | Αρχικοποιήστε νέο αντικείμενο SaveOptions με προεπιλεγμένη τιμή για τη σημαία  debug  (false) και με καθορισμένο μέγεθος. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Επιστρέφει πρόσθετους φακέλους γραμματοσειρών όπου ο μετατροπέας πρέπει να βρει γραμματοσειρές για το έγγραφο εισόδου. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Λαμβάνει τη σημαία που δείχνει αν είναι απαραίτητο να αποθηκευτούν γραμματοσειρές μη-TrueType σε TTF. |
| [getExceptions()](#getExceptions--) | Επιστρέφει μια λίστα μη-κριτικών σφαλμάτων. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Επιστρέφει την τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα. |
| [getSize()](#getSize--) | Λαμβάνει το μέγεθος της σελίδας ή της εικόνας. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Λαμβάνει τη σημαία που επιτρέπει την έξοδο προειδοποιήσεων και μηνυμάτων κατά τη μετατροπή. |
| [isSupressErrors()](#isSupressErrors--) | Επιστρέφει μια τιμή που υποδεικνύει αν τα σφάλματα θα καταστούν κατά τη μετατροπή. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Καθορίζει πρόσθετους φακέλους γραμματοσειρών όπου ο μετατροπέας πρέπει να βρει γραμματοσειρές για το έγγραφο εισόδου. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Καθορίζει αν θα αποθηκευτούν γραμματοσειρές μη-TrueType σε TTF. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Καθορίζει τη σημαία που επιτρέπει την έξοδο προειδοποιήσεων και μηνυμάτων κατά τη μετατροπή. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Ορίζει την τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Καθορίζει το μέγεθος της σελίδας ή της εικόνας. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Καθορίζει τη σημαία που υποδεικνύει εάν τα σφάλματα θα κατασταλούν κατά τη μετατροπή. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### SaveOptions() {#SaveOptions--}
```
public SaveOptions()
```


Αρχικοποιήστε νέο αντικείμενο SaveOptions με προεπιλεγμένες τιμές για τις σημαίες  suppressErrors  (true) και  debug  (false).

### SaveOptions(boolean supressErrors) {#SaveOptions-boolean-}
```
public SaveOptions(boolean supressErrors)
```


Αρχικοποιήστε νέο αντικείμενο SaveOptions με προεπιλεγμένη τιμή για τη σημαία  debug  (false).

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| supressErrors | boolean | Εάν είναι true, η μετατροπή θα συνεχιστεί παρά τα μη κρίσιμα σφάλματα. |

### SaveOptions(Dimension size) {#SaveOptions-java.awt.Dimension-}
```
public SaveOptions(Dimension size)
```


Αρχικοποιεί νέο αντικείμενο  SaveOptions  με καθορισμένο μέγεθος.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| μέγεθος | java.awt.Dimension | Το μέγεθος. |

### SaveOptions(boolean supressErrors, Dimension size) {#SaveOptions-boolean-java.awt.Dimension-}
```
public SaveOptions(boolean supressErrors, Dimension size)
```


Αρχικοποιήστε νέο αντικείμενο SaveOptions με προεπιλεγμένη τιμή για τη σημαία  debug  (false) και με καθορισμένο μέγεθος.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| supressErrors | boolean | Εάν είναι true, η μετατροπή θα συνεχιστεί παρά τα μη κρίσιμα σφάλματα. |
| μέγεθος | java.awt.Dimension | Το μέγεθος. |

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
### getConvertFontsToTTF() {#getConvertFontsToTTF--}
```
public boolean getConvertFontsToTTF()
```


Λαμβάνει τη σημαία που δείχνει αν είναι απαραίτητο να αποθηκευτούν γραμματοσειρές μη-TrueType σε TTF.

**Returns:**
boolean - Η τιμή της σημαίας.
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


Επιστρέφει μια λίστα μη-κριτικών σφαλμάτων.

**Returns:**
java.util.List<java.lang.Exception> - Λίστα εξαιρέσεων
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Επιστρέφει την τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα. Οι διαθέσιμες τιμές είναι από 0 έως 100. Όσο μικρότερος είναι ο αριθμός, τόσο μεγαλύτερη είναι η συμπίεση και, κατά συνέπεια, τόσο χαμηλότερη η ποιότητα της εικόνας. Η τιμή 0 οδηγεί στην εικόνα χαμηλότερης ποιότητας, ενώ η τιμή 100 στην υψηλότερη.

**Returns:**
int - Η τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα.
### getSize() {#getSize--}
```
public Dimension getSize()
```


Λαμβάνει το μέγεθος της σελίδας ή της εικόνας.

**Returns:**
java.awt.Dimension - Το μέγεθος της σελίδας ή της εικόνας.
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

### setConvertFontsToTTF(boolean value) {#setConvertFontsToTTF-boolean-}
```
public void setConvertFontsToTTF(boolean value)
```


Καθορίζει εάν θα αποθηκευτούν οι μη-TrueType γραμματοσειρές σε TTF. Μειώνει σημαντικά τον όγκο του τελικού εγγράφου κατά τη μετατροπή από PS σε PDF και αυξάνει την ταχύτητα μετατροπής των αρχείων PS με μεγάλο όγκο κειμένου σε μη-TrueType γραμματοσειρές σε οποιαδήποτε μορφή εξόδου. Ωστόσο υπάρχει μικρή κάθετη μετατόπιση του κειμένου κατά τη μετατροπή αρχείου PostSctipt σε εικόνα.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | boolean | Η τιμή της σημαίας. |

### setDebug(boolean debug) {#setDebug-boolean-}
```
public void setDebug(boolean debug)
```


Καθορίζει τη σημαία που επιτρέπει την έξοδο προειδοποιήσεων και μηνυμάτων κατά τη μετατροπή.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| debug | boolean | Τιμή Boolean. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Ορίζει την τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα. Οι διαθέσιμες τιμές είναι από 0 έως 100. Όσο μικρότερος είναι ο αριθμός, τόσο μεγαλύτερη η συμπίεση και, κατά συνέπεια, τόσο χαμηλότερη η ποιότητα της εικόνας. Η τιμή 0 οδηγεί στην εικόνα χαμηλότερης ποιότητας, ενώ η τιμή 100 στην υψηλότερη.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | int | Η τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Καθορίζει το μέγεθος της σελίδας ή της εικόνας.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| μέγεθος | java.awt.Dimension | Μέγεθος της σελίδας ή της εικόνας. |

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

