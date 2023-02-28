---
title: Class AsposeOcr
second_title: Aspose.OCR για Αναφορά API .NET
description: Aspose.OCR.AsposeOcr τάξη. Κύριο API για Aspose OCR library
type: docs
weight: 20
url: /el/net/aspose.ocr/asposeocr/
---
## AsposeOcr class

Κύριο API για Aspose OCR library

```csharp
public class AsposeOcr
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [AsposeOcr](asposeocr/#constructor)() | Αρχικοποιεί μια νέα παρουσία του`AsposeOcr` class. Κενός κατασκευαστής. |
| [AsposeOcr](asposeocr/#constructor_1)(string) | Αρχικοποιεί μια νέα παρουσία του`AsposeOcr` class. Ορίστε τους επιτρεπόμενους χαρακτήρες με την ιδιότητα αλφαβήτου. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew/#calculateskew)(MemoryStream) | Υπολογίζει τη γωνία κλίσης μιας εικόνας. |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew/#calculateskew_1)(string) | Υπολογίζει τη γωνία κλίσης μιας εικόνας. |
| [CalculateSkewFromUri](../../aspose.ocr/asposeocr/calculateskewfromuri/)(string) | Υπολογίζει τη γωνία κλίσης μιας εικόνας από το URI. |
| [CompareImageTexts](../../aspose.ocr/asposeocr/compareimagetexts/)(string, string, RecognitionSettings, bool) | Ελέγξτε αν δύο εικόνες περιέχουν το ίδιο κείμενο. |
| [CorrectSpelling](../../aspose.ocr/asposeocr/correctspelling/)(string, SpellCheckLanguage, string) | Διορθώνει κείμενο (αντικαθιστά ανορθόγραφες λέξεις). |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles/#getrectangles)(MemoryStream, AreasType, bool) | Ανιχνεύει περιοχές κειμένου στην εικόνα.  Δεν εφαρμόζεται αυτόματη διόρθωση λοξής εικόνας. Υποστηρίζει GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles/#getrectangles_1)(string, AreasType, bool) | Ανιχνεύει περιοχές κειμένου στην εικόνα.  Δεν εφαρμόζεται αυτόματη διόρθωση λοξής εικόνας. Υποστηρίζει GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [ImageHasText](../../aspose.ocr/asposeocr/imagehastext/#imagehastext_1)(string, Regex, RecognitionSettings) | Ελέγξτε αν το κείμενο της εικόνας ταιριάζει με την παρεχόμενη κανονική έκφραση. |
| [ImageHasText](../../aspose.ocr/asposeocr/imagehastext/#imagehastext)(string, string, RecognitionSettings, bool) | Ελέγξτε αν η εικόνα περιέχει το παρεχόμενο τμήμα κειμένου. |
| [ImageTextDiff](../../aspose.ocr/asposeocr/imagetextdiff/)(string, string, RecognitionSettings, bool) | Συγκρίνετε τα κείμενα στις δύο εικόνες και επιστρέψτε έναν αριθμό που αντιπροσωπεύει πόσο μοιάζουν (0 έως 1). |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage/#preprocessimage)(MemoryStream, PreprocessingFilter) | Χρησιμοποιήστε την προεπεξεργασία εικόνας για να βελτιώσετε την ακρίβεια του OCR. Δημιουργήστε μια λίστα φίλτρων που θα εφαρμοστούν στην εικόνα εισόδου με τη σειρά που καθορίζετε. παράδειγμα για να δημιουργήσετε φίλτρα: PreprocessingFilter filters = new PreprocessingFilterd___000 , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize.6. ), PreprocessingFilter.Dilate() }; Δεν τα χρειάζεστε όλα. Ρυθμίστε μόνο ό,τι χρειάζεστε. |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage/#preprocessimage_1)(string, PreprocessingFilter) | Χρησιμοποιήστε την προεπεξεργασία εικόνας για να βελτιώσετε την ακρίβεια του OCR. Δημιουργήστε μια λίστα φίλτρων που θα εφαρμοστούν στην εικόνα εισόδου με τη σειρά που καθορίζετε. παράδειγμα για να δημιουργήσετε φίλτρα: PreprocessingFilter filters = new PreprocessingFilterd___000 , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize.6. ), PreprocessingFilter.Dilate() }; Δεν τα χρειάζεστε όλα. Ρυθμίστε μόνο ό,τι χρειάζεστε. |
| [RecognizeCarPlate](../../aspose.ocr/asposeocr/recognizecarplate/#recognizecarplate)(MemoryStream, CarPlateRecognitionSettings) | Αναγνωρίζει πινακίδα αυτοκινήτου. |
| [RecognizeCarPlate](../../aspose.ocr/asposeocr/recognizecarplate/#recognizecarplate_1)(string, CarPlateRecognitionSettings) | Αναγνωρίζει πινακίδα αυτοκινήτου. |
| [RecognizeDjvu](../../aspose.ocr/asposeocr/recognizedjvu/#recognizedjvu)(MemoryStream, DocumentRecognitionSettings) | Αναγνώριση κειμένου από πολυσέλιδη εικόνα DJVU.  Αναγνωρίζει το αρχείο DJVU με δυνατότητα καθορισμού[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Υποστηρίζει μόνο DJVU. Δεν υποστηρίζει άλλους τύπους εικόνας. |
| [RecognizeDjvu](../../aspose.ocr/asposeocr/recognizedjvu/#recognizedjvu_1)(string, DocumentRecognitionSettings) | Αναγνώριση κειμένου από πολυσέλιδη εικόνα DJVU.  Αναγνωρίζει το αρχείο DJVU με δυνατότητα καθορισμού[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Υποστηρίζει μόνο DJVU. Δεν υποστηρίζει άλλους τύπους εικόνας. |
| [RecognizeIDCard](../../aspose.ocr/asposeocr/recognizeidcard/#recognizeidcard)(MemoryStream, IDCardRecognitionSettings) | Αναγνωρίζει κείμενο στην ταυτότητα. |
| [RecognizeIDCard](../../aspose.ocr/asposeocr/recognizeidcard/#recognizeidcard_1)(string, IDCardRecognitionSettings) | Αναγνωρίζει κείμενο στην ταυτότητα. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_4)(MemoryStream) | Αναγνωρίζει κείμενο στην εικόνα. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_5)(string) | Αναγνωρίζει κείμενο στην εικόνα. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_2)(MemoryStream, RecognitionSettings) | Αναγνωρίζει κείμενο στην εικόνα.  Αναγνωρίζει εικόνα με δυνατότητα καθορισμού[`RecognitionSettings`](../recognitionsettings/) . Υποστηρίζει GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_3)(string, RecognitionSettings) | Αναγνωρίζει κείμενο στην εικόνα. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage)(Color[], int, int, RecognitionSettings) | Αναγνωρίζει κείμενο στην εικόνα. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_1)(byte[], int, int, PixelType, RecognitionSettings) | Αναγνωρίζει κείμενο στην εικόνα. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast/#recognizeimagefast)(MemoryStream) | Αναγνώριση κειμένου στην εικόνα με καλή ποιότητα. Δεν χρησιμοποιεί διόρθωση κλίσης και ανίχνευση περιοχών. Λειτουργεί σε γρήγορη λειτουργία. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast/#recognizeimagefast_1)(string) | Αναγνώριση κειμένου στην εικόνα με καλή ποιότητα. Δεν χρησιμοποιεί διόρθωση κλίσης και ανίχνευση περιοχών. Λειτουργεί σε γρήγορη λειτουργία. |
| [RecognizeImageFromBase64](../../aspose.ocr/asposeocr/recognizeimagefrombase64/)(string, RecognitionSettings) | Αναγνωρίζει κείμενο στην εικόνα που παρέχεται σε τύπο base64. |
| [RecognizeImageFromUri](../../aspose.ocr/asposeocr/recognizeimagefromuri/)(string, RecognitionSettings) | Αναγνωρίζει κείμενο στην εικόνα που παρέχεται από τον σύνδεσμο URI. |
| [RecognizeInvoice](../../aspose.ocr/asposeocr/recognizeinvoice/#recognizeinvoice)(MemoryStream, InvoiceRecognitionSettings) | Αναγνωρίζει κείμενο στην εικόνα τιμολογίου. |
| [RecognizeInvoice](../../aspose.ocr/asposeocr/recognizeinvoice/#recognizeinvoice_1)(string, InvoiceRecognitionSettings) | Αναγνωρίζει κείμενο στην εικόνα τιμολογίου. |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline/#recognizeline)(MemoryStream) | Αναγνωρίζει την εικόνα που περιέχει μία γραμμή κειμένου.  Δεν εφαρμόζεται αυτόματη διόρθωση λοξής εικόνας. Υποστηρίζει GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline/#recognizeline_1)(string) | Αναγνωρίζει την εικόνα που περιέχει μία γραμμή κειμένου.  Δεν εφαρμόζεται αυτόματη διόρθωση λοξής εικόνας. Υποστηρίζει GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages)(List&lt;string&gt;) | Αναγνωρίζει πολλές εικόνες από λίστα με προεπιλεγμένες ρυθμίσεις.  Τα αρχεία και οι φάκελοι δεν υποστηρίζονται. Ο μέγιστος αριθμός επεξεργασμένων εικόνων είναι 20. Υποστηρίζει GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_2)(string) | Αναγνωρίζει πολλές εικόνες συσκευασμένες σε αρχείο ZIP ή από φάκελο με προεπιλεγμένες ρυθμίσεις.  Τα ένθετα αρχεία και οι φάκελοι δεν υποστηρίζονται. Ο μέγιστος αριθμός επεξεργασμένων εικόνων είναι 20. Υποστηρίζει GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_1)(List&lt;string&gt;, RecognitionSettings) | Αναγνωρίζει πολλές εικόνες από τη λίστα.  Τα αρχεία και οι φάκελοι δεν υποστηρίζονται. Ο μέγιστος αριθμός επεξεργασμένων εικόνων είναι 20. Υποστηρίζει GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_3)(string, RecognitionSettings) | Αναγνωρίζει πολλές εικόνες συσκευασμένες σε αρχείο ZIP ή από φάκελο.  Τα ένθετα αρχεία και οι φάκελοι δεν υποστηρίζονται. Ο μέγιστος αριθμός επεξεργασμένων εικόνων είναι 20. Υποστηρίζει GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizePassport](../../aspose.ocr/asposeocr/recognizepassport/#recognizepassport)(MemoryStream, PassportRecognitionSettings) | Αναγνωρίζει κείμενο στα διαβατήρια. |
| [RecognizePassport](../../aspose.ocr/asposeocr/recognizepassport/#recognizepassport_1)(string, PassportRecognitionSettings) | Αναγνωρίζει κείμενο στα διαβατήρια. |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf/#recognizepdf)(MemoryStream, DocumentRecognitionSettings) | Αναγνώριση κειμένου από σαρωμένο pdf (εξαγωγή εικόνων).  Αναγνωρίζει αρχείο pdf με δυνατότητα καθορισμού[`RecognitionSettings`](../recognitionsettings/) . Υποστηρίζει μόνο σαρωμένο PDF. Δεν υποστηρίζει PDF με δυνατότητα αναζήτησης. |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf/#recognizepdf_1)(string, DocumentRecognitionSettings) | Αναγνώριση κειμένου από σαρωμένο pdf (εξαγωγή εικόνων).  Αναγνωρίζει αρχείο pdf με δυνατότητα καθορισμού[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Υποστηρίζει μόνο σαρωμένο PDF. Δεν υποστηρίζει PDF με δυνατότητα αναζήτησης. |
| [RecognizeReceipt](../../aspose.ocr/asposeocr/recognizereceipt/#recognizereceipt)(MemoryStream, ReceiptRecognitionSettings) | Αναγνωρίζει κείμενο στην εικόνα. |
| [RecognizeReceipt](../../aspose.ocr/asposeocr/recognizereceipt/#recognizereceipt_1)(string, ReceiptRecognitionSettings) | Αναγνωρίζει κείμενο στην εικόνα. |
| [RecognizeTiff](../../aspose.ocr/asposeocr/recognizetiff/#recognizetiff)(MemoryStream, DocumentRecognitionSettings) | Αναγνώριση κειμένου από πολυσέλιδη εικόνα TIFF.  Αναγνωρίζει το αρχείο TIFF με δυνατότητα καθορισμού[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Υποστηρίζει μόνο TIFF (TIF). Δεν υποστηρίζει άλλους τύπους εικόνας. |
| [RecognizeTiff](../../aspose.ocr/asposeocr/recognizetiff/#recognizetiff_1)(string, DocumentRecognitionSettings) | Αναγνώριση κειμένου από πολυσέλιδη εικόνα TIFF.  Αναγνωρίζει το αρχείο TIFF με δυνατότητα καθορισμού[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Υποστηρίζει μόνο TIFF (TIF). Δεν υποστηρίζει άλλους τύπους εικόνας. |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument/#savemultipagedocument)(MemoryStream, SaveFormat, List&lt;RecognitionResult&gt;) | Επιτρέπει τη λήψη πολυσέλιδου εγγράφου από τη λίστα αντικειμένων RecognitionResult |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument/#savemultipagedocument_1)(string, SaveFormat, List&lt;RecognitionResult&gt;) | Επιτρέπει τη λήψη πολυσέλιδου εγγράφου από τη λίστα αντικειμένων RecognitionResult |

## Εκδηλώσεις

| Ονομα | Περιγραφή |
| --- | --- |
| event [OcrProgress](../../aspose.ocr/asposeocr/ocrprogress/) | Ένα συμβάν για την παρακολούθηση της προόδου της αναγνώρισης εικόνων πολλών σελίδων. |

### Δείτε επίσης

* χώρος ονομάτων [Aspose.OCR](../../aspose.ocr/)
* συνέλευση [Aspose.OCR](../../)


