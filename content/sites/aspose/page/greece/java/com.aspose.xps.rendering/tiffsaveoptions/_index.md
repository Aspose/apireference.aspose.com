---
title: "TiffSaveOptions"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Κλάση για επιλογές αποθήκευσης XPS-as-TIFF."
type: docs
weight: 16
url: /el/java/com.aspose.xps.rendering/tiffsaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions), [com.aspose.xps.rendering.ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions)
```
public class TiffSaveOptions extends ImageSaveOptions
```

Κλάση για επιλογές αποθήκευσης XPS-as-TIFF.
## Κατασκευαστές

| Κατασκευαστής | Περιγραφή |
| --- | --- |
| [TiffSaveOptions()](#TiffSaveOptions--) | Δημιουργεί νέα παρουσία των επιλογών. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Επιστρέφει πρόσθετους φακέλους γραμματοσειρών όπου ο μετατροπέας πρέπει να βρει γραμματοσειρές για το έγγραφο εισόδου. |
| [getBatchSize()](#getBatchSize--) | Επιστρέφει το μέγεθος ενός τμήματος σελίδων που θα περάσει από κόμβο σε κόμβο. |
| [getBeforePageSavingEventHandlers()](#getBeforePageSavingEventHandlers--) | Επιστρέφει τη συλλογή των χειριστών συμβάντων που εκτελούν τροποποιήσεις σε μια σελίδα XPS ακριβώς πριν αποθηκευτεί. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Λαμβάνει τη σημαία που δείχνει αν είναι απαραίτητο να αποθηκευτούν γραμματοσειρές μη-TrueType σε TTF. |
| [getExceptions()](#getExceptions--) | Επιστρέφει μια λίστα μη-κριτικών σφαλμάτων. |
| [getImageSize()](#getImageSize--) | Λαμβάνει το μέγεθος των εξαγόμενων εικόνων σε εικονοστοιχεία. |
| [getInterpolationMode()](#getInterpolationMode--) | Λαμβάνει τη λειτουργία παρεμβολής. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Επιστρέφει την τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα. |
| [getPageNumbers()](#getPageNumbers--) | Λαμβάνει τον πίνακα αριθμών σελίδων προς απόδοση. |
| [getResolution()](#getResolution--) | Λαμβάνει την ανάλυση της εικόνας. |
| [getSize()](#getSize--) | Λαμβάνει το μέγεθος της σελίδας ή της εικόνας. |
| [getSmoothingMode()](#getSmoothingMode--) | Λαμβάνει τη λειτουργία εξομάλυνσης. |
| [getTextRenderingHint()](#getTextRenderingHint--) | Λαμβάνει τη συμβουλή απόδοσης κειμένου. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Λαμβάνει τη σημαία που επιτρέπει την έξοδο προειδοποιήσεων και μηνυμάτων κατά τη μετατροπή. |
| [isSupressErrors()](#isSupressErrors--) | Επιστρέφει μια τιμή που υποδεικνύει αν τα σφάλματα θα καταστούν κατά τη μετατροπή. |
| [multipage()](#multipage--) | Λαμβάνει τη σημαία που ορίζει αν πολλές εικόνες πρέπει να αποθηκευτούν σε ένα ενιαίο αρχείο TIFF πολλαπλών σελίδων. |
| [multipage(boolean value)](#multipage-boolean-) | Ορίζει τη σημαία που ορίζει αν πολλές εικόνες πρέπει να αποθηκευτούν σε ένα ενιαίο αρχείο TIFF πολλαπλών σελίδων. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Καθορίζει πρόσθετους φακέλους γραμματοσειρών όπου ο μετατροπέας πρέπει να βρει γραμματοσειρές για το έγγραφο εισόδου. |
| [setBatchSize(int value)](#setBatchSize-int-) | Ορίζει το μέγεθος ενός τμήματος σελίδων που θα περάσει από κόμβο σε κόμβο. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Καθορίζει αν θα αποθηκευτούν γραμματοσειρές μη-TrueType σε TTF. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Καθορίζει τη σημαία που επιτρέπει την έξοδο προειδοποιήσεων και μηνυμάτων κατά τη μετατροπή. |
| [setImageSize(Dimension value)](#setImageSize-java.awt.Dimension-) | Ορίζει το μέγεθος των εξαγόμενων εικόνων σε εικονοστοιχεία. |
| [setInterpolationMode(InterpolationMode value)](#setInterpolationMode-com.aspose.xps.rendering.InterpolationMode-) | Ορίζει τη λειτουργία παρεμβολής. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Ορίζει την τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα. |
| [setPageNumbers(int[] value)](#setPageNumbers-int---) | Ορίζει τον πίνακα αριθμών σελίδων προς απόδοση. |
| [setResolution(float value)](#setResolution-float-) | Ορίζει την ανάλυση της εικόνας. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Καθορίζει το μέγεθος της σελίδας ή της εικόνας. |
| [setSmoothingMode(SmoothingMode value)](#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-) | Ορίζει τη λειτουργία εξομάλυνσης. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Καθορίζει τη σημαία που υποδεικνύει εάν τα σφάλματα θα κατασταλούν κατά τη μετατροπή. |
| [setTextRenderingHint(TextRenderingHint value)](#setTextRenderingHint-com.aspose.xps.rendering.TextRenderingHint-) | Ορίζει τη συμβουλή απόδοσης κειμένου. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TiffSaveOptions() {#TiffSaveOptions--}
```
public TiffSaveOptions()
```


Δημιουργεί νέα παρουσία των επιλογών.

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
### getBatchSize() {#getBatchSize--}
```
public int getBatchSize()
```


Επιστρέφει το μέγεθος ενός τμήματος σελίδων που θα περάσει από κόμβο σε κόμβο.

**Returns:**
int - Το μέγεθος ενός τμήματος σελίδων που θα περάσει από κόμβο σε κόμβο.
### getBeforePageSavingEventHandlers() {#getBeforePageSavingEventHandlers--}
```
public List<EventBasedModifications.BeforePageSavingEventHandler> getBeforePageSavingEventHandlers()
```


Επιστρέφει τη συλλογή των χειριστών συμβάντων που εκτελούν τροποποιήσεις σε μια σελίδα XPS ακριβώς πριν αποθηκευτεί.

**Returns:**
java.util.List<com.aspose.xps.features.EventBasedModifications.BeforePageSavingEventHandler>
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
### getImageSize() {#getImageSize--}
```
public Dimension getImageSize()
```


Λαμβάνει το μέγεθος των εξαγόμενων εικόνων σε εικονοστοιχεία.

**Returns:**
java.awt.Dimension - Το μέγεθος των εξαγόμενων εικόνων σε εικονοστοιχεία.
### getInterpolationMode() {#getInterpolationMode--}
```
public InterpolationMode getInterpolationMode()
```


Λαμβάνει τη λειτουργία παρεμβολής.

**Returns:**
[InterpolationMode](../../com.aspose.xps.rendering/interpolationmode) - The interpolation mode.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Επιστρέφει την τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα. Οι διαθέσιμες τιμές είναι από 0 έως 100. Όσο μικρότερος είναι ο αριθμός, τόσο μεγαλύτερη είναι η συμπίεση και, κατά συνέπεια, τόσο χαμηλότερη η ποιότητα της εικόνας. Η τιμή 0 οδηγεί στην εικόνα χαμηλότερης ποιότητας, ενώ η τιμή 100 στην υψηλότερη.

**Returns:**
int - Η τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα.
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Λαμβάνει τον πίνακα αριθμών σελίδων προς απόδοση.

**Returns:**
int[] - Αριθμοί σελίδων.
### getResolution() {#getResolution--}
```
public float getResolution()
```


Λαμβάνει την ανάλυση της εικόνας.

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
[SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) - The smoothing mode.
### getTextRenderingHint() {#getTextRenderingHint--}
```
public TextRenderingHint getTextRenderingHint()
```


Λαμβάνει τη συμβουλή απόδοσης κειμένου.

**Returns:**
[TextRenderingHint](../../com.aspose.xps.rendering/textrenderinghint) - The text rendering hint.
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
### multipage() {#multipage--}
```
public boolean multipage()
```


Λαμβάνει τη σημαία που ορίζει αν πολλές εικόνες πρέπει να αποθηκευτούν σε ένα ενιαίο αρχείο TIFF πολλαπλών σελίδων.

**Returns:**
boolean - Η σημαία που ορίζει αν πολλές εικόνες πρέπει να αποθηκευτούν σε ένα ενιαίο αρχείο multipage TIFF.
### multipage(boolean value) {#multipage-boolean-}
```
public void multipage(boolean value)
```


Ορίζει τη σημαία που ορίζει αν πολλές εικόνες πρέπει να αποθηκευτούν σε ένα ενιαίο αρχείο TIFF πολλαπλών σελίδων.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | boolean | Η σημαία που ορίζει αν πολλές εικόνες πρέπει να αποθηκευτούν σε ένα ενιαίο αρχείο multipage TIFF. |

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

### setBatchSize(int value) {#setBatchSize-int-}
```
public void setBatchSize(int value)
```


Ορίζει το μέγεθος ενός τμήματος σελίδων που θα περάσει από κόμβο σε κόμβο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | int | Το μέγεθος ενός τμήματος σελίδων που θα μεταφερθεί από κόμβο σε κόμβο. |

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

### setImageSize(Dimension value) {#setImageSize-java.awt.Dimension-}
```
public void setImageSize(Dimension value)
```


Ορίζει το μέγεθος των εξαγόμενων εικόνων σε εικονοστοιχεία.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | java.awt.Dimension | Το μέγεθος των εξόδων εικόνων σε εικονοστοιχεία. |

### setInterpolationMode(InterpolationMode value) {#setInterpolationMode-com.aspose.xps.rendering.InterpolationMode-}
```
public void setInterpolationMode(InterpolationMode value)
```


Ορίζει τη λειτουργία παρεμβολής.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| value | [InterpolationMode](../../com.aspose.xps.rendering/interpolationmode) | Η λειτουργία παρεμβολής. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Ορίζει την τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα. Οι διαθέσιμες τιμές είναι από 0 έως 100. Όσο μικρότερος είναι ο αριθμός, τόσο μεγαλύτερη η συμπίεση και, κατά συνέπεια, τόσο χαμηλότερη η ποιότητα της εικόνας. Η τιμή 0 οδηγεί στην εικόνα χαμηλότερης ποιότητας, ενώ η τιμή 100 στην υψηλότερη.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | int | Η τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα. |

### setPageNumbers(int[] value) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] value)
```


Ορίζει τον πίνακα αριθμών σελίδων προς απόδοση.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | int[] | Αριθμός σελίδων. |

### setResolution(float value) {#setResolution-float-}
```
public void setResolution(float value)
```


Ορίζει την ανάλυση της εικόνας.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | float | Η ανάλυση της εικόνας. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Καθορίζει το μέγεθος της σελίδας ή της εικόνας.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| μέγεθος | java.awt.Dimension | Μέγεθος της σελίδας ή της εικόνας. |

### setSmoothingMode(SmoothingMode value) {#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode value)
```


Ορίζει τη λειτουργία εξομάλυνσης.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| value | [SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) | Η λειτουργία εξομάλυνσης. |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Καθορίζει τη σημαία που υποδεικνύει εάν τα σφάλματα θα κατασταλούν κατά τη μετατροπή.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| supressErrors | boolean | Τιμή Boolean. |

### setTextRenderingHint(TextRenderingHint value) {#setTextRenderingHint-com.aspose.xps.rendering.TextRenderingHint-}
```
public void setTextRenderingHint(TextRenderingHint value)
```


Ορίζει τη συμβουλή απόδοσης κειμένου.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| value | [TextRenderingHint](../../com.aspose.xps.rendering/textrenderinghint) | Η υπόδειξη απόδοσης κειμένου. |

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

