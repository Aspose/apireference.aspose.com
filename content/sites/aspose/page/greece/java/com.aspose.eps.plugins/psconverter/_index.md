---
title: "PsConverter"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Αναπαριστά την προσθήκη PsConverter."
type: docs
weight: 10
url: /el/java/com.aspose.eps.plugins/psconverter/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IPlugin](../../com.aspose.page.plugins/iplugin)
```
public class PsConverter implements IPlugin
```

Αναπαριστά την προσθήκη PsConverter.

Το παράδειγμα δείχνει πώς να μετατρέψετε ένα αρχείο PS/EPS σε έγγραφο PDF.

// δημιουργία PsConverter PsConverter converter = new PsConverter(); // δημιουργία αντικειμένου PsConverterToPdfOptions για ορισμό του τύπου εξόδου ως αρχείο PsConverterToPdfOptions opt = new PsConverterToPdfOptions(); // προσθήκη διαδρομής αρχείου εισόδου opt.addDataSource(new FileDataSource(inputPath)); // ορισμός διαδρομής αρχείου εξόδου opt.addSaveDataSource(new FileDataSource(outputPath)); // εκκίνηση διαδικασίας μετατροπής ResultContainer results = converter.process(opt);

Το παράδειγμα δείχνει πώς να μετατρέψετε ένα αρχείο PS/EPS σε εικόνα με έξοδο αρχείου.

// δημιουργία PsConverter PsConverter converter = new PsConverter(); // δημιουργία PsConverterToImageOptions με μορφή εικόνας στόχο JPEG. Η προεπιλεγμένη μορφή εικόνας για την παραγόμενη εικόνα είναι PNG. // Επίσης μπορούμε να ορίσουμε το μέγεθος της παραγόμενης εικόνας, την ανάλυση, τη λειτουργία εξομάλυνσης και το επίπεδο ποιότητας JPEG για τη μορφή JPEG της παραγόμενης εικόνας. PsConverterToImageOptions opt = new PsConverterToImageOptions(ImageFormat.Jpeg); // προσθήκη διαδρομής αρχείου εισόδου opt.addDataSource(new FileDataSource(inputPath)); // εάν το αρχείο PS εισόδου είναι πολλαπλών σελίδων, τα αποτελέσματα θα είναι ένα σύνολο αρχείων εικόνας με όνομα: [\"outputPath\" χωρίς επέκταση][αριθμόςΣελίδας ξεκινώντας από 0].[επέκταση από \"outputPath\"] opt.addSaveDataSource(new FileDataSource(outputPath)); // εκκίνηση διαδικασίας μετατροπής converter.process(opt);

Το παράδειγμα δείχνει πώς να μετατρέψετε ένα αρχείο PS/EPS σε εικόνα με έξοδο σε πίνακες byte.

Στην πηγή εξόδου πίνακες byte (byte [][]) ένας πίνακας byte περιέχει μια εικόνα μιας σελίδας. Έτσι, για έγγραφα μίας σελίδας το αποτέλεσμα θα περιέχει πίνακα [1][], για έγγραφα πολλαπλών σελίδων το αποτέλεσμα θα περιέχει πίνακα [αριθμός σελίδων στο εισερχόμενο έγγραφο PS][]. // δημιουργία PsConverter PsConverter converter = new PsConverter(); // δημιουργία PsConverterToImageOptions με μορφή εικόνας στόχο JPEG. Η προεπιλεγμένη μορφή εικόνας για την παραγόμενη εικόνα είναι PNG. // Επίσης μπορούμε να ορίσουμε το μέγεθος της παραγόμενης εικόνας, την ανάλυση, τη λειτουργία εξομάλυνσης και το επίπεδο ποιότητας JPEG για τη μορφή JPEG της παραγόμενης εικόνας. PsConverterToImageOptions opt = new PsConverterToImageOptions(ImageFormat.Jpeg); // προσθήκη διαδρομής αρχείου εισόδου opt.addDataSource(new FileDataSource(inputPath)); // εάν το αρχείο PS εισόδου είναι πολλαπλών σελίδων, τα αποτελέσματα θα είναι ένα σύνολο αρχείων εικόνας με όνομα: [\"outputPath\" χωρίς επέκταση][αριθμόςΣελίδας ξεκινώντας από 0].[επέκταση από \"outputPath\"] opt.addSaveDataSource(new ByteArrayDataSource()); // εκκίνηση διαδικασίας μετατροπής converter.process(opt); // λήψη των παραγόμενων πινάκων byte byte[][] imagesBytes = (byte [][]) ((ByteArrayResult)results.ResultCollection[0]).Data;
## Κατασκευαστές

| Κατασκευαστής | Περιγραφή |
| --- | --- |
| [PsConverter()](#PsConverter--) |  |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [dispose()](#dispose--) | Υλοποίηση του IDisposable. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [process(IPluginOptions options)](#process-com.aspose.page.plugins.IPluginOptions-) | Ξεκινά την επεξεργασία του PsConverter με τις καθορισμένες παραμέτρους. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PsConverter() {#PsConverter--}
```
public PsConverter()
```


### dispose() {#dispose--}
```
public final void dispose()
```


Υλοποίηση του IDisposable.

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
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### process(IPluginOptions options) {#process-com.aspose.page.plugins.IPluginOptions-}
```
public final ResultContainer process(IPluginOptions options)
```


Ξεκινά την επεξεργασία του PsConverter με τις καθορισμένες παραμέτρους.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| options | [IPluginOptions](../../com.aspose.page.plugins/ipluginoptions) | Ένα αντικείμενο επιλογών που περιέχει οδηγίες για το PsConverter. |

**Returns:**
[ResultContainer](../../com.aspose.page.plugins/resultcontainer) - An ResultContainer object containing the result of the operation.
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

