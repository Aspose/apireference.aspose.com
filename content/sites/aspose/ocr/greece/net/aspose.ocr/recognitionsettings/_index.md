---
title: Class RecognitionSettings
second_title: Aspose.OCR για Αναφορά API .NET
description: Aspose.OCR.RecognitionSettings τάξη. Ρυθμίσεις για την αναγνώριση εικόνας. Περιέχει στοιχεία που επιτρέπουν την προσαρμογή της διαδικασίας αναγνώρισης.
type: docs
weight: 240
url: /el/net/aspose.ocr/recognitionsettings/
---
## RecognitionSettings class

Ρυθμίσεις για την αναγνώριση εικόνας. Περιέχει στοιχεία που επιτρέπουν την προσαρμογή της διαδικασίας αναγνώρισης.

```csharp
public class RecognitionSettings : BaseRecognitionSettings
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [RecognitionSettings](recognitionsettings/)(Language, List&lt;Rectangle&gt;, bool, bool, float, bool, int) | Αρχικοποιεί μια νέα παρουσία του`RecognitionSettings`κλάση με πλήρες σύνολο ιδιοτήτων. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [AllowedCharacters](../../aspose.ocr/baserecognitionsettings/allowedcharacters/) { get; set; } | Σύνολο επιτρεπόμενων χαρακτήρων. Καθορίζει τον τύπο των χαρακτήρων που επιτρέπεται για το αποτέλεσμα αναγνώρισης. |
| [AutoContrast](../../aspose.ocr/baserecognitionsettings/autocontrast/) { get; set; } | Επιτρέπει τη χρήση ενός πρόσθετου αλγόριθμου διόρθωσης αντίθεσης για την εικόνα πριν από την αναγνώριση. |
| [AutoDenoising](../../aspose.ocr/baserecognitionsettings/autodenoising/) { get; set; } | Επιτρέπει τη χρήση ενός πρόσθετου νευρωνικού δικτύου για τη βελτίωση της εικόνας - μείωση του θορύβου. Χρήσιμο για εικόνες με τεχνουργήματα σάρωσης, παραμόρφωση, κηλίδες, φωτοβολίδες, διαβαθμίσεις, ξένα στοιχεία. |
| [AutoSkew](../../aspose.ocr/baserecognitionsettings/autoskew/) { set; } | Λαμβάνει ή ορίζει μια σημαία που υποδεικνύει εάν θα πρέπει να είναι ενεργοποιημένη η αυτόματη διόρθωση λοξής εικόνας. Ενεργοποιημένο (true) από προεπιλογή. |
| [DetectAreasMode](../../aspose.ocr/baserecognitionsettings/detectareasmode/) { get; set; } | Επιτρέπει την επιλογή της βέλτιστης λειτουργίας για περιοχές τύπου εγγράφου: έγγραφο, φωτογραφία, απλό κείμενο, στήλη, εικόνα. |
| [IgnoredCharacters](../../aspose.ocr/baserecognitionsettings/ignoredcharacters/) { get; set; } | Ορίζει τη μαύρη λίστα για σύμβολα αναγνώρισης. |
| [Language](../../aspose.ocr/baserecognitionsettings/language/) { set; } | Λαμβάνει ή ορίζει τη γλώσσα που χρησιμοποιείται για το OCR.  Καθορίζει το αλφάβητο που χρησιμοποιείται κατά την αναγνώριση. Πολυγλωσσική από προεπιλογή. |
| [LinesFiltration](../../aspose.ocr/baserecognitionsettings/linesfiltration/) { get; set; } | Επιτρέπει την αναγνώριση κειμένου στους πίνακες (περιοχές που περιβάλλουν γραμμές). |
| [PreprocessingFilters](../../aspose.ocr/baserecognitionsettings/preprocessingfilters/) { get; set; } | Επιτρέπει την προετοιμασία της εικόνας για OCR προσαρμόζοντας μεθόδους προεπεξεργασίας. |
| [RecognitionAreas](../../aspose.ocr/recognitionsettings/recognitionareas/) { set; } | Λαμβάνει ή ορίζει τη λίστα περιοχών κειμένου για επεξεργασία.  Επιτρέπει τον μη αυτόματο καθορισμό των περιοχών με κείμενο για πιο ακριβή αναγνώριση. Εάν έχουν οριστεί προσαρμοσμένες περιοχέςDetectAreas και!:AutoSkew οι ιδιότητες θα αγνοηθούν.  Απενεργοποιεί το DetectAreas και το AutoSkew. |
| [RecognizeSingleLine](../../aspose.ocr/recognitionsettings/recognizesingleline/) { set; } | Ορίζει την αναγνώριση εικόνας μίας γραμμής. Απενεργοποιημένο (false) από προεπιλογή. Απενεργοποιήστε όλα τα βήματα επεξεργασίας που σχετίζονται με τη διαίρεση σε γραμμές. Ορίστε αυτήν την παράμετρο σε true εάν η εικόνα σας περιέχει μόνο μία γραμμή. Απενεργοποιεί τις ρυθμίσεις Recognition Areas, επομένως όλες οι ρυθμίσεις περιοχών θα αγνοηθούν. |
| [SkewAngle](../../aspose.ocr/baserecognitionsettings/skewangle/) { set; } | Λαμβάνει ή ρυθμίζει τη γωνία σε μοίρες για την περιστροφή της εικόνας.  Η ρύθμιση αυτής της τιμής θα απενεργοποιήσει το[`AutoSkew`](../baserecognitionsettings/autoskew/) ιδιότητα, έτσι ώστε να μην εφαρμόζεται η αυτόματη διόρθωση λοξού. Μηδέν από προεπιλογή. |
| [ThreadsCount](../../aspose.ocr/baserecognitionsettings/threadscount/) { set; } | Λαμβάνει ή ορίζει τον αριθμό των νημάτων για επεξεργασία. Από προεπιλογή, το 0 σημαίνει ότι η εικόνα θα υποβληθεί σε επεξεργασία με τον αριθμό των νημάτων ίσο με τον αριθμό των επεξεργαστών σας. ThreadsCount = 1 σημαίνει ότι η εικόνα θα υποβληθεί σε επεξεργασία στο κύριο νήμα. |
| [ThresholdValue](../../aspose.ocr/baserecognitionsettings/thresholdvalue/) { set; } | Λαμβάνει ή ορίζει προσαρμοσμένη τιμή κατωφλίου για δυαδοποίηση εικόνας. Εύρος από 1 έως 255. |
| [UpscaleSmallFont](../../aspose.ocr/baserecognitionsettings/upscalesmallfont/) { get; set; } | Σας επιτρέπει να χρησιμοποιείτε πρόσθετους αλγόριθμους ειδικά για την αναγνώριση μικρών γραμματοσειρών. Χρήσιμο για εικόνες με χαρακτήρες μικρού μεγέθους. |

### Δείτε επίσης

* class [BaseRecognitionSettings](../baserecognitionsettings/)
* χώρος ονομάτων [Aspose.OCR](../../aspose.ocr/)
* συνέλευση [Aspose.OCR](../../)


