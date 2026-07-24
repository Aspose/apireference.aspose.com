---
title: "ImageSaveOptions"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Αυτή η κλάση περιέχει τις επιλογές που απαιτούνται για τη διαχείριση της διαδικασίας μετατροπής."
type: docs
weight: 10
url: /el/java/com.aspose.eps.device/imagesaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)
```
public class ImageSaveOptions extends SaveOptions
```

Αυτή η κλάση περιέχει τις επιλογές που απαιτούνται για τη διαχείριση της διαδικασίας μετατροπής.
## Κατασκευαστές

| Κατασκευαστής | Περιγραφή |
| --- | --- |
| [ImageSaveOptions()](#ImageSaveOptions--) | Αρχικοποιήστε νέα παρουσία της κλάσης  ImageSaveOptions  με προεπιλεγμένες τιμές για τις σημαίες  suppressErrors  (true) και  debug  (false). |
| [ImageSaveOptions(ImageFormat imageFormat)](#ImageSaveOptions-com.aspose.page.ImageFormat-) | Αρχικοποιεί νέα παρουσία της  ImageSaveOptions  με καθορισμένη μορφή εικόνας. |
| [ImageSaveOptions(Dimension size)](#ImageSaveOptions-java.awt.Dimension-) | Αρχικοποιεί νέα παρουσία της  ImageSaveOptions  με καθορισμένο μέγεθος της εικόνας. |
| [ImageSaveOptions(Dimension size, ImageFormat imageFormat)](#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-) | Αρχικοποιεί νέα παρουσία της  ImageSaveOptions  με καθορισμένο μέγεθος της εικόνας και μορφή εικόνας. |
| [ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors)](#ImageSaveOptions-com.aspose.page.ImageFormat-boolean-) | Αρχικοποιεί νέα παρουσία της  ImageSaveOptions  με καθορισμένη μορφή εικόνας και σημαία suppressErrors. |
| [ImageSaveOptions(Dimension size, boolean supressErrors)](#ImageSaveOptions-java.awt.Dimension-boolean-) | Αρχικοποιεί νέα παρουσία της  ImageSaveOptions  με καθορισμένο μέγεθος της εικόνας και σημαία suppressErrors. |
| [ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors)](#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-boolean-) | Αρχικοποιεί νέα παρουσία της  ImageSaveOptions  με καθορισμένο μέγεθος της εικόνας, μορφή εικόνας και σημαία suppressErrors. |
| [ImageSaveOptions(boolean supressErrors)](#ImageSaveOptions-boolean-) | Αρχικοποιήστε νέα παρουσία της κλάσης  ImageSaveOptions  με προεπιλεγμένη τιμή για τη σημαία  debug  (false). |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Επιστρέφει πρόσθετους φακέλους γραμματοσειρών όπου ο μετατροπέας πρέπει να βρει γραμματοσειρές για το έγγραφο εισόδου. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Λαμβάνει τη σημαία που δείχνει αν είναι απαραίτητο να αποθηκευτούν γραμματοσειρές μη-TrueType σε TTF. |
| [getExceptions()](#getExceptions--) | Επιστρέφει μια λίστα μη-κριτικών σφαλμάτων. |
| [getImageFormat()](#getImageFormat--) | Λαμβάνει μια μορφή εικόνας για την τελική εικόνα. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Επιστρέφει την τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα. |
| [getResolution()](#getResolution--) | Επιστρέφει την ανάλυση της τελική εικόνας. |
| [getSize()](#getSize--) | Λαμβάνει το μέγεθος της σελίδας ή της εικόνας. |
| [getSmoothingMode()](#getSmoothingMode--) | Λαμβάνει τη λειτουργία εξομάλυνσης. |
| [getTryJoinImageFragments()](#getTryJoinImageFragments--) | Δείχνει εάν η βιβλιοθήκη θα προσπαθήσει να ενώσει τα τμήματα της εικόνας. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Λαμβάνει τη σημαία που επιτρέπει την έξοδο προειδοποιήσεων και μηνυμάτων κατά τη μετατροπή. |
| [isSupressErrors()](#isSupressErrors--) | Επιστρέφει μια τιμή που υποδεικνύει αν τα σφάλματα θα καταστούν κατά τη μετατροπή. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Καθορίζει πρόσθετους φακέλους γραμματοσειρών όπου ο μετατροπέας πρέπει να βρει γραμματοσειρές για το έγγραφο εισόδου. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Καθορίζει αν θα αποθηκευτούν γραμματοσειρές μη-TrueType σε TTF. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Καθορίζει τη σημαία που επιτρέπει την έξοδο προειδοποιήσεων και μηνυμάτων κατά τη μετατροπή. |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | Καθορίζει μια μορφή εικόνας για την τελική εικόνα. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Ορίζει την τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα. |
| [setResolution(float resolution)](#setResolution-float-) | Καθορίζει την ανάλυση της τελικής εικόνας. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Καθορίζει το μέγεθος της σελίδας ή της εικόνας. |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.eps.device.SmoothingMode-) | Ορίζει τη λειτουργία εξομάλυνσης. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Καθορίζει τη σημαία που υποδεικνύει εάν τα σφάλματα θα κατασταλούν κατά τη μετατροπή. |
| [setTryJoinImageFragments(boolean tryJoinImageFragments)](#setTryJoinImageFragments-boolean-) | Καθορίζει αν η βιβλιοθήκη πρέπει να προσπαθήσει να ενώσει τα τμήματα εικόνας. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ImageSaveOptions() {#ImageSaveOptions--}
```
public ImageSaveOptions()
```


Αρχικοποιήστε νέα παρουσία της κλάσης  ImageSaveOptions  με προεπιλεγμένες τιμές για τις σημαίες  suppressErrors  (true) και  debug  (false).

### ImageSaveOptions(ImageFormat imageFormat) {#ImageSaveOptions-com.aspose.page.ImageFormat-}
```
public ImageSaveOptions(ImageFormat imageFormat)
```


Αρχικοποιεί νέα παρουσία της  ImageSaveOptions  με καθορισμένη μορφή εικόνας.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Η μορφή της εικόνας. |

### ImageSaveOptions(Dimension size) {#ImageSaveOptions-java.awt.Dimension-}
```
public ImageSaveOptions(Dimension size)
```


Αρχικοποιεί νέα παρουσία της  ImageSaveOptions  με καθορισμένο μέγεθος της εικόνας.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| μέγεθος | java.awt.Dimension | Μέγεθος εικόνας. |

### ImageSaveOptions(Dimension size, ImageFormat imageFormat) {#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-}
```
public ImageSaveOptions(Dimension size, ImageFormat imageFormat)
```


Αρχικοποιεί νέα παρουσία της  ImageSaveOptions  με καθορισμένο μέγεθος της εικόνας και μορφή εικόνας.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| μέγεθος | java.awt.Dimension | Μέγεθος εικόνας. |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Μορφή της εικόνας. |

### ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors) {#ImageSaveOptions-com.aspose.page.ImageFormat-boolean-}
```
public ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors)
```


Αρχικοποιεί νέα παρουσία της  ImageSaveOptions  με καθορισμένη μορφή εικόνας και σημαία suppressErrors.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Μορφή της εικόνας. |
| supressErrors | boolean | Εάν είναι true, η μετατροπή θα συνεχιστεί παρά τα μη κρίσιμα σφάλματα. |

### ImageSaveOptions(Dimension size, boolean supressErrors) {#ImageSaveOptions-java.awt.Dimension-boolean-}
```
public ImageSaveOptions(Dimension size, boolean supressErrors)
```


Αρχικοποιεί νέα παρουσία της  ImageSaveOptions  με καθορισμένο μέγεθος της εικόνας και σημαία suppressErrors.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| μέγεθος | java.awt.Dimension | Μέγεθος εικόνας. |
| supressErrors | boolean | Εάν είναι true, η μετατροπή θα συνεχιστεί παρά τα μη κρίσιμα σφάλματα. |

### ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors) {#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-boolean-}
```
public ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors)
```


Αρχικοποιεί νέα παρουσία της  ImageSaveOptions  με καθορισμένο μέγεθος της εικόνας, μορφή εικόνας και σημαία suppressErrors.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| μέγεθος | java.awt.Dimension | Μέγεθος εικόνας. |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Μορφή της εικόνας. |
| supressErrors | boolean | Εάν είναι true, η μετατροπή θα συνεχιστεί παρά τα μη κρίσιμα σφάλματα. |

### ImageSaveOptions(boolean supressErrors) {#ImageSaveOptions-boolean-}
```
public ImageSaveOptions(boolean supressErrors)
```


Αρχικοποιήστε νέα παρουσία της κλάσης  ImageSaveOptions  με προεπιλεγμένη τιμή για τη σημαία  debug  (false).

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| supressErrors | boolean | Εάν είναι true, η μετατροπή θα συνεχιστεί παρά τα μη κρίσιμα σφάλματα. |

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
### getImageFormat() {#getImageFormat--}
```
public ImageFormat getImageFormat()
```


Λαμβάνει μια μορφή εικόνας για την τελική εικόνα.

**Returns:**
[ImageFormat](../../com.aspose.page/imageformat) - An output image format.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Επιστρέφει την τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα. Οι διαθέσιμες τιμές είναι από 0 έως 100. Όσο μικρότερος είναι ο αριθμός, τόσο μεγαλύτερη είναι η συμπίεση και, κατά συνέπεια, τόσο χαμηλότερη η ποιότητα της εικόνας. Η τιμή 0 οδηγεί στην εικόνα χαμηλότερης ποιότητας, ενώ η τιμή 100 στην υψηλότερη.

**Returns:**
int - Η τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα.
### getResolution() {#getResolution--}
```
public float getResolution()
```


Επιστρέφει την ανάλυση της τελική εικόνας.

**Returns:**
float - Η ανάλυση της εικόνας.
### getSize() {#getSize--}
```
public Dimension getSize()
```


Λαμβάνει το μέγεθος της σελίδας ή της εικόνας.

**Returns:**
java.awt.Dimension - Το μέγεθος της σελίδας ή της εικόνας.
### getSmoothingMode() {#getSmoothingMode--}
```
public SmoothingMode getSmoothingMode()
```


Λαμβάνει τη λειτουργία εξομάλυνσης.

**Returns:**
[SmoothingMode](../../com.aspose.eps.device/smoothingmode) - the smoothingMode.
### getTryJoinImageFragments() {#getTryJoinImageFragments--}
```
public boolean getTryJoinImageFragments()
```


Δείχνει αν η βιβλιοθήκη θα προσπαθήσει να ενώσει τα τμήματα εικόνας. Χρησιμοποιείται όταν η εικόνα σε ένα αρχείο πηγής PS/EPS είναι κομμένη σε τμήματα. Σε αυτήν την περίπτωση, χωρίς αυτή τη σημαία, αφήνονται λεπτά κενά μεταξύ των τμημάτων.

**Returns:**
boolean - η τιμή της σημαίας.
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

### setImageFormat(ImageFormat imageFormat) {#setImageFormat-com.aspose.page.ImageFormat-}
```
public void setImageFormat(ImageFormat imageFormat)
```


Καθορίζει μια μορφή εικόνας για την τελική εικόνα.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Μία μορφή εξόδου εικόνας. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Ορίζει την τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα. Οι διαθέσιμες τιμές είναι από 0 έως 100. Όσο μικρότερος είναι ο αριθμός, τόσο μεγαλύτερη η συμπίεση και, κατά συνέπεια, τόσο χαμηλότερη η ποιότητα της εικόνας. Η τιμή 0 οδηγεί στην εικόνα χαμηλότερης ποιότητας, ενώ η τιμή 100 στην υψηλότερη.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | int | Η τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα. |

### setResolution(float resolution) {#setResolution-float-}
```
public void setResolution(float resolution)
```


Καθορίζει την ανάλυση της τελικής εικόνας.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| ανάλυση | float | Η ανάλυση της εικόνας. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Καθορίζει το μέγεθος της σελίδας ή της εικόνας.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| μέγεθος | java.awt.Dimension | Μέγεθος της σελίδας ή της εικόνας. |

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.eps.device.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


Ορίζει τη λειτουργία εξομάλυνσης.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.eps.device/smoothingmode) | το smoothingMode για ορισμό |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Καθορίζει τη σημαία που υποδεικνύει εάν τα σφάλματα θα κατασταλούν κατά τη μετατροπή.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| supressErrors | boolean | Τιμή Boolean. |

### setTryJoinImageFragments(boolean tryJoinImageFragments) {#setTryJoinImageFragments-boolean-}
```
public void setTryJoinImageFragments(boolean tryJoinImageFragments)
```


Καθορίζει αν η βιβλιοθήκη πρέπει να προσπαθήσει να ενώσει τα τμήματα εικόνας. Χρησιμοποιείται όταν η εικόνα σε ένα αρχείο πηγής PS/EPS είναι κομμένη σε τμήματα. Σε αυτήν την περίπτωση, χωρίς αυτή τη σημαία, αφήνονται λεπτά κενά μεταξύ των τμημάτων.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| tryJoinImageFragments | boolean | η τιμή της σημαίας. |

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

