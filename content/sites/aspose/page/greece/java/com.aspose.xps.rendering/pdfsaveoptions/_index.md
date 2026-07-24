---
title: "PdfSaveOptions"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Κλάση για επιλογές αποθήκευσης XPS-as-PDF."
type: docs
weight: 14
url: /el/java/com.aspose.xps.rendering/pdfsaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPageSaveOptions](../../com.aspose.page/imultipagesaveoptions), [com.aspose.xps.rendering.IXpsTextConversionOptions](../../com.aspose.xps.rendering/ixpstextconversionoptions), [com.aspose.xps.rendering.IPipelineOptions](../../com.aspose.xps.rendering/ipipelineoptions), [com.aspose.xps.rendering.IEventBasedModificationOptions](../../com.aspose.xps.rendering/ieventbasedmodificationoptions)
```
public class PdfSaveOptions extends SaveOptions implements IMultiPageSaveOptions, IXpsTextConversionOptions, IPipelineOptions, IEventBasedModificationOptions
```

Κλάση για επιλογές αποθήκευσης XPS-as-PDF.
## Κατασκευαστές

| Κατασκευαστής | Περιγραφή |
| --- | --- |
| [PdfSaveOptions()](#PdfSaveOptions--) | Δημιουργεί νέα παρουσία των επιλογών. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Επιστρέφει πρόσθετους φακέλους γραμματοσειρών όπου ο μετατροπέας πρέπει να βρει γραμματοσειρές για το έγγραφο εισόδου. |
| [getBatchSize()](#getBatchSize--) | Επιστρέφει το μέγεθος ενός τμήματος σελίδων που θα περάσει από κόμβο σε κόμβο. |
| [getBeforePageSavingEventHandlers()](#getBeforePageSavingEventHandlers--) | Επιστρέφει τη συλλογή των χειριστών συμβάντων που εκτελούν τροποποιήσεις σε μια σελίδα XPS ακριβώς πριν αποθηκευτεί. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Λαμβάνει τη σημαία που δείχνει αν είναι απαραίτητο να αποθηκευτούν γραμματοσειρές μη-TrueType σε TTF. |
| [getEncryptionDetails()](#getEncryptionDetails--) | Επιστρέφει τα στοιχεία κρυπτογράφησης. |
| [getExceptions()](#getExceptions--) | Επιστρέφει μια λίστα μη-κριτικών σφαλμάτων. |
| [getImageCompression()](#getImageCompression--) | Επιστρέφει τον τύπο συμπίεσης που θα χρησιμοποιηθεί για όλες τις εικόνες στο έγγραφο. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Επιστρέφει την τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα. |
| [getOutlineTreeExpansionLevel()](#getOutlineTreeExpansionLevel--) | Λαμβάνει μέχρι ποιο επίπεδο πρέπει να επεκταθεί το περίγραμμα του εγγράφου όταν το αρχείο PDF ανοίγει σε προβολέα. 1 - εμφανίζονται μόνο τα στοιχεία του πρώτου επιπέδου, 2 - εμφανίζονται τα στοιχεία του πρώτου και του δεύτερου επιπέδου, κ.λπ. |
| [getOutlineTreeHeight()](#getOutlineTreeHeight--) | Λαμβάνει το ύψος του δέντρου περιγράμματος του εγγράφου για αποθήκευση. 0 - το δέντρο περιγράμματος δεν θα μετατραπεί, 1 - θα μετατραπούν μόνο τα στοιχεία του πρώτου επιπέδου, κ.λπ. |
| [getPageNumbers()](#getPageNumbers--) | Λαμβάνει τον πίνακα αριθμών σελίδων προς απόδοση. |
| [getSize()](#getSize--) | Λαμβάνει το μέγεθος της σελίδας ή της εικόνας. |
| [getTextCompression()](#getTextCompression--) | Επιστρέφει τον τύπο συμπίεσης που θα χρησιμοποιηθεί για όλα τα ρεύματα περιεχομένου εκτός από τις εικόνες. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Λαμβάνει τη σημαία που επιτρέπει την έξοδο προειδοποιήσεων και μηνυμάτων κατά τη μετατροπή. |
| [isSupressErrors()](#isSupressErrors--) | Επιστρέφει μια τιμή που υποδεικνύει αν τα σφάλματα θα καταστούν κατά τη μετατροπή. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [preserveText()](#preserveText--) | Στο XPS, ορισμένα στοιχεία κειμένου μπορεί να περιέχουν αναφορές σε εναλλακτικές μορφές γλύφων που δεν αντιστοιχούν σε κανέναν κωδικό χαρακτήρα στη γραμματοσειρά. |
| [preserveText(boolean value)](#preserveText-boolean-) | Στο XPS, ορισμένα στοιχεία κειμένου μπορεί να περιέχουν αναφορές σε εναλλακτικές μορφές γλύφων που δεν αντιστοιχούν σε κανέναν κωδικό χαρακτήρα στη γραμματοσειρά. |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Καθορίζει πρόσθετους φακέλους γραμματοσειρών όπου ο μετατροπέας πρέπει να βρει γραμματοσειρές για το έγγραφο εισόδου. |
| [setBatchSize(int value)](#setBatchSize-int-) | Ορίζει το μέγεθος ενός τμήματος σελίδων που θα περάσει από κόμβο σε κόμβο. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Καθορίζει αν θα αποθηκευτούν γραμματοσειρές μη-TrueType σε TTF. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Καθορίζει τη σημαία που επιτρέπει την έξοδο προειδοποιήσεων και μηνυμάτων κατά τη μετατροπή. |
| [setEncryptionDetails(PdfEncryptionDetails value)](#setEncryptionDetails-com.aspose.xps.rendering.PdfEncryptionDetails-) | Ορίζει τα στοιχεία κρυπτογράφησης. |
| [setImageCompression(PdfImageCompression value)](#setImageCompression-com.aspose.xps.rendering.PdfImageCompression-) | Ορίζει τον τύπο συμπίεσης που θα χρησιμοποιηθεί για όλες τις εικόνες στο έγγραφο. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Ορίζει την τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα. |
| [setOutlineTreeExpansionLevel(int value)](#setOutlineTreeExpansionLevel-int-) | Ορίζει μέχρι ποιο επίπεδο πρέπει να επεκταθεί το περίγραμμα του εγγράφου όταν το αρχείο PDF ανοίγει σε προβολέα. 1 - εμφανίζονται μόνο τα στοιχεία του πρώτου επιπέδου, 2 - εμφανίζονται τα στοιχεία του πρώτου και του δεύτερου επιπέδου, κ.λπ. |
| [setOutlineTreeHeight(int value)](#setOutlineTreeHeight-int-) | Ορίζει το ύψος του δέντρου περιγράμματος του εγγράφου για αποθήκευση. 0 - το δέντρο περιγράμματος δεν θα μετατραπεί, 1 - θα μετατραπούν μόνο τα στοιχεία του πρώτου επιπέδου, κ.λπ. |
| [setPageNumbers(int[] value)](#setPageNumbers-int---) | Ορίζει τον πίνακα αριθμών σελίδων προς απόδοση. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Καθορίζει το μέγεθος της σελίδας ή της εικόνας. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Καθορίζει τη σημαία που υποδεικνύει εάν τα σφάλματα θα κατασταλούν κατά τη μετατροπή. |
| [setTextCompression(PdfTextCompression value)](#setTextCompression-com.aspose.xps.rendering.PdfTextCompression-) | Ορίζει τον τύπο συμπίεσης που θα χρησιμοποιηθεί για όλα τα ρεύματα περιεχομένου εκτός από τις εικόνες. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PdfSaveOptions() {#PdfSaveOptions--}
```
public PdfSaveOptions()
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
java.util.List<com.aspose.xps.features.EventBasedModifications.BeforePageSavingEventHandler> - Η συλλογή των χειριστών συμβάντων που εκτελεί τροποποιήσεις σε μια σελίδα XPS ακριβώς πριν αποθηκευτεί.
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
### getEncryptionDetails() {#getEncryptionDetails--}
```
public PdfEncryptionDetails getEncryptionDetails()
```


Επιστρέφει τα στοιχεία κρυπτογράφησης. Εάν δεν οριστεί, τότε δεν θα εκτελεστεί κρυπτογράφηση.

**Returns:**
[PdfEncryptionDetails](../../com.aspose.xps.rendering/pdfencryptiondetails) - The encryption details.
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


Επιστρέφει μια λίστα μη-κριτικών σφαλμάτων.

**Returns:**
java.util.List<java.lang.Exception> - Λίστα εξαιρέσεων
### getImageCompression() {#getImageCompression--}
```
public PdfImageCompression getImageCompression()
```


Επιστρέφει τον τύπο συμπίεσης που θα χρησιμοποιηθεί για όλες τις εικόνες στο έγγραφο. Η προεπιλογή είναι  PdfImageCompression.Auto .

**Returns:**
[PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression) - The compression type.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Επιστρέφει την τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα. Οι διαθέσιμες τιμές είναι από 0 έως 100. Όσο μικρότερος είναι ο αριθμός, τόσο μεγαλύτερη είναι η συμπίεση και, κατά συνέπεια, τόσο χαμηλότερη η ποιότητα της εικόνας. Η τιμή 0 οδηγεί στην εικόνα χαμηλότερης ποιότητας, ενώ η τιμή 100 στην υψηλότερη.

**Returns:**
int - Η τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα.
### getOutlineTreeExpansionLevel() {#getOutlineTreeExpansionLevel--}
```
public int getOutlineTreeExpansionLevel()
```


Λαμβάνει μέχρι ποιο επίπεδο πρέπει να επεκταθεί το περίγραμμα του εγγράφου όταν το αρχείο PDF ανοίγει σε προβολέα. 1 - εμφανίζονται μόνο τα στοιχεία του πρώτου επιπέδου, 2 - εμφανίζονται τα στοιχεία του πρώτου και του δεύτερου επιπέδου, κ.λπ.

**Returns:**
int - Το επίπεδο επέκτασης του δέντρου περιγράμματος.
### getOutlineTreeHeight() {#getOutlineTreeHeight--}
```
public int getOutlineTreeHeight()
```


Λαμβάνει το ύψος του δέντρου περιγράμματος του εγγράφου για αποθήκευση. 0 - το δέντρο περιγράμματος δεν θα μετατραπεί, 1 - θα μετατραπούν μόνο τα στοιχεία του πρώτου επιπέδου, κ.λπ. Η προεπιλογή είναι 10.

**Returns:**
int - Το ύψος του δέντρου περιγράμματος.
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Λαμβάνει τον πίνακα αριθμών σελίδων προς απόδοση.

**Returns:**
int[] - Αριθμοί σελίδων.
### getSize() {#getSize--}
```
public Dimension getSize()
```


Λαμβάνει το μέγεθος της σελίδας ή της εικόνας.

**Returns:**
java.awt.Dimension - Το μέγεθος της σελίδας ή της εικόνας.
### getTextCompression() {#getTextCompression--}
```
public PdfTextCompression getTextCompression()
```


Επιστρέφει τον τύπο συμπίεσης που θα χρησιμοποιηθεί για όλες τις ροές περιεχομένου εκτός από εικόνες. Η προεπιλογή είναι  PdfTextCompression.Flate .

**Returns:**
[PdfTextCompression](../../com.aspose.xps.rendering/pdftextcompression) - The compression type.
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




### preserveText() {#preserveText--}
```
public boolean preserveText()
```


Στο XPS, ορισμένα στοιχεία κειμένου ενδέχεται να περιέχουν αναφορές σε εναλλακτικές μορφές γλύφων που δεν αντιστοιχούν σε κανέναν κωδικό χαρακτήρα στη γραμματοσειρά. Εάν αυτή η σημαία οριστεί σε true, το κείμενο από τέτοια στοιχεία XPS μετατρέπεται σε γραφικά σχήματα. Στη συνέχεια, το ίδιο το κείμενο εμφανίζεται διαφανές από πάνω. Αυτό αφήνει το κείμενο των στοιχείων επιλέξιμο. Ωστόσο, η παρενέργεια είναι ότι το αρχείο εξόδου μπορεί να είναι πολύ μεγαλύτερο από το αρχικό. Εάν αυτή η σημαία οριστεί σε false, οι χαρακτήρες που θα έπρεπε να εμφανιστούν ως εναλλακτικές μορφές αντικαθίστανται με άλλους χαρακτήρες που αντιστοιχούν στις εναλλακτικές μορφές γλύφων. Συνεπώς, το κείμενο, αν και παραμένει επιλέξιμο, θα τροποποιηθεί και πιθανότατα θα γίνει ακατανόητο.

**Returns:**
boolean - Η τιμή της σημαίας.
### preserveText(boolean value) {#preserveText-boolean-}
```
public void preserveText(boolean value)
```


Στο XPS, ορισμένα στοιχεία κειμένου ενδέχεται να περιέχουν αναφορές σε εναλλακτικές μορφές γλύφων που δεν αντιστοιχούν σε κανέναν κωδικό χαρακτήρα στη γραμματοσειρά. Εάν αυτή η σημαία οριστεί σε true, το κείμενο από τέτοια στοιχεία XPS μετατρέπεται σε γραφικά σχήματα. Στη συνέχεια, το ίδιο το κείμενο εμφανίζεται διαφανές από πάνω. Αυτό αφήνει το κείμενο των στοιχείων επιλέξιμο. Ωστόσο, η παρενέργεια είναι ότι το αρχείο εξόδου μπορεί να είναι πολύ μεγαλύτερο από το αρχικό. Εάν αυτή η σημαία οριστεί σε false, οι χαρακτήρες που θα έπρεπε να εμφανιστούν ως εναλλακτικές μορφές αντικαθίστανται με άλλους χαρακτήρες που αντιστοιχούν στις εναλλακτικές μορφές γλύφων. Συνεπώς, το κείμενο, αν και παραμένει επιλέξιμο, θα τροποποιηθεί και πιθανότατα θα γίνει ακατανόητο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | boolean | Η τιμή της σημαίας. |

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

### setEncryptionDetails(PdfEncryptionDetails value) {#setEncryptionDetails-com.aspose.xps.rendering.PdfEncryptionDetails-}
```
public void setEncryptionDetails(PdfEncryptionDetails value)
```


Ορίζει τις λεπτομέρειες κρυπτογράφησης. Εάν δεν οριστεί, δεν θα εκτελεστεί κρυπτογράφηση.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| value | [PdfEncryptionDetails](../../com.aspose.xps.rendering/pdfencryptiondetails) | Οι λεπτομέρειες κρυπτογράφησης. |

### setImageCompression(PdfImageCompression value) {#setImageCompression-com.aspose.xps.rendering.PdfImageCompression-}
```
public void setImageCompression(PdfImageCompression value)
```


Ορίζει τον τύπο συμπίεσης που θα χρησιμοποιηθεί για όλες τις εικόνες στο έγγραφο. Η προεπιλογή είναι  PdfImageCompression.Auto .

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| value | [PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression) | Ο τύπος συμπίεσης. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Ορίζει την τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα. Οι διαθέσιμες τιμές είναι από 0 έως 100. Όσο μικρότερος είναι ο αριθμός, τόσο μεγαλύτερη η συμπίεση και, κατά συνέπεια, τόσο χαμηλότερη η ποιότητα της εικόνας. Η τιμή 0 οδηγεί στην εικόνα χαμηλότερης ποιότητας, ενώ η τιμή 100 στην υψηλότερη.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | int | Η τιμή που καθορίζει το επίπεδο συμπίεσης για μια εικόνα. |

### setOutlineTreeExpansionLevel(int value) {#setOutlineTreeExpansionLevel-int-}
```
public void setOutlineTreeExpansionLevel(int value)
```


Ορίζει μέχρι ποιο επίπεδο πρέπει να επεκταθεί το περίγραμμα του εγγράφου όταν το αρχείο PDF ανοίγει σε προβολέα. 1 - εμφανίζονται μόνο τα στοιχεία του πρώτου επιπέδου, 2 - εμφανίζονται τα στοιχεία του πρώτου και του δεύτερου επιπέδου, κ.λπ.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | int | Το επίπεδο επέκτασης του δέντρου περιγράμματος. |

### setOutlineTreeHeight(int value) {#setOutlineTreeHeight-int-}
```
public void setOutlineTreeHeight(int value)
```


Ορίζει το ύψος του δέντρου περιγράμματος του εγγράφου για αποθήκευση. 0 - το δέντρο περιγράμματος δεν θα μετατραπεί, 1 - θα μετατραπούν μόνο τα στοιχεία του πρώτου επιπέδου, κ.λπ.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | int | Το ύψος του δέντρου περιγράμματος. |

### setPageNumbers(int[] value) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] value)
```


Ορίζει τον πίνακα αριθμών σελίδων προς απόδοση.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | int[] | Αριθμός σελίδων. |

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

### setTextCompression(PdfTextCompression value) {#setTextCompression-com.aspose.xps.rendering.PdfTextCompression-}
```
public void setTextCompression(PdfTextCompression value)
```


Ορίζει τον τύπο συμπίεσης που θα χρησιμοποιηθεί για όλες τις ροές περιεχομένου εκτός από εικόνες. Η προεπιλογή είναι  PdfTextCompression.Flate .

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| value | [PdfTextCompression](../../com.aspose.xps.rendering/pdftextcompression) | Ο τύπος συμπίεσης. |

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

