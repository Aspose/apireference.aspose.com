---
title: "XpsConverter"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Αντιπροσωπεύει το πρόσθετο XpsConverter."
type: docs
weight: 10
url: /el/java/com.aspose.xps.plugins/xpsconverter/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IPlugin](../../com.aspose.page.plugins/iplugin)
```
public class XpsConverter implements IPlugin
```

Αντιπροσωπεύει το πρόσθετο XpsConverter.

Το παράδειγμα δείχνει πώς να μετατρέψετε ένα έγγραφο XPS σε έγγραφο PDF.

// δημιουργία XpsConverter XpsConverter converter = new XpsConverter(); // δημιουργία αντικειμένου XpsConverterToPdfOptions για ορισμό τύπου εξόδου ως αρχείο XpsConverterToPdfOptions opt = new XpsConverterToPdfOptions(); // προσθήκη διαδρομής αρχείου εισόδου opt.addDataSource(new FileDataSource(inputPath)); // ορισμός διαδρομής αρχείου εξόδου opt.addSaveDataSource(new FileDataSource(outputPath)); // εκκίνηση διαδικασίας μετατροπής ResultContainer results = converter.process(opt);

Το παράδειγμα δείχνει πώς να μετατρέψετε ένα έγγραφο XPS σε εικόνα με έξοδο αρχείου.

// δημιουργία XpsConverter XpsConverter converter = new XpsConverter(); // δημιουργία XpsConverterToImageOptions με μορφή εικόνας στόχο JPEG. Η προεπιλεγμένη μορφή εικόνας για το αποτέλεσμα είναι PNG. // Επίσης μπορούμε να ορίσουμε μέγεθος της τελικής εικόνας, ανάλυση, λειτουργία εξομάλυνσης και επίπεδο ποιότητας JPEG για τη μορφή εικόνας JPEG. XpsConverterToImageOptions opt = new XpsConverterToImageOptions(ImageFormat.Jpeg); // προσθήκη διαδρομής αρχείου εισόδου opt.addDataSource(new FileDataSource(inputPath)); // εάν το αρχείο XPS εισόδου είναι πολλαπλών σελίδων, τα αποτελέσματα θα είναι σύνολο αρχείων εικόνας με όνομα: [\"outputPath\" χωρίς επέκταση][αριθμός σελίδας ξεκινώντας από 0].[επέκταση από \"outputPath\"] opt.addSaveDataSource(new FileDataSource(outputPath)); // εκκίνηση διαδικασίας μετατροπής converter.process(opt);

Το παράδειγμα δείχνει πώς να μετατρέψετε ένα έγγραφο XPS σε εικόνα με έξοδο σε πίνακες byte.

Στην πηγή εξόδου με πίνακες byte (byte[][]) ένας πίνακας byte περιέχει την εικόνα μιας σελίδας. Έτσι, για έγγραφα μιας σελίδας το αποτέλεσμα θα περιέχει πίνακα [1][], για έγγραφα πολλαπλών σελίδων το αποτέλεσμα θα περιέχει πίνακα [αριθμός σελίδων στο εισερχόμενο έγγραφο XPS][]. // δημιουργία XpsConverter XpsConverter converter = new XpsConverter(); // δημιουργία XpsConverterToImageOptions με μορφή εικόνας στόχο JPEG. Η προεπιλεγμένη μορφή εικόνας για το αποτέλεσμα είναι PNG. // Επίσης μπορούμε να ορίσουμε μέγεθος της τελικής εικόνας, ανάλυση, λειτουργία εξομάλυνσης και επίπεδο ποιότητας JPEG για τη μορφή εικόνας JPEG. XpsConverterToImageOptions opt = new XpsConverterToImageOptions(ImageFormat.Jpeg); // προσθήκη διαδρομής αρχείου εισόδου opt.addDataSource(new FileDataSource(inputPath)); // εάν το αρχείο XPS εισόδου είναι πολλαπλών σελίδων, τα αποτελέσματα θα είναι σύνολο αρχείων εικόνας με όνομα: [\"outputPath\" χωρίς επέκταση][αριθμός σελίδας ξεκινώντας από 1].[επέκταση από \"outputPath\"] opt.addSaveDataSource(new ByteArrayDataSource()); // εκκίνηση διαδικασίας μετατροπής converter.process(opt); // λήψη των τελικών πινάκων byte byte[][] imagesBytes = (byte [][]) ((ByteArrayResult)results.ResultCollection[0]).Data;
## Κατασκευαστές

| Κατασκευαστής | Περιγραφή |
| --- | --- |
| [XpsConverter()](#XpsConverter--) |  |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [dispose()](#dispose--) | Υλοποίηση του IDisposable. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [process(IPluginOptions options)](#process-com.aspose.page.plugins.IPluginOptions-) | Ξεκινά την επεξεργασία του XpsConverter με τις καθορισμένες παραμέτρους. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsConverter() {#XpsConverter--}
```
public XpsConverter()
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


Ξεκινά την επεξεργασία του XpsConverter με τις καθορισμένες παραμέτρους.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| options | [IPluginOptions](../../com.aspose.page.plugins/ipluginoptions) | Ένα αντικείμενο επιλογών που περιέχει οδηγίες για το XpsConverter. |

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

