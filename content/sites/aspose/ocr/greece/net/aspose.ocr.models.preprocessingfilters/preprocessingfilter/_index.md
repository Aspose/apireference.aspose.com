---
title: Class PreprocessingFilter
second_title: Aspose.OCR για Αναφορά API .NET
description: Aspose.OCR.Models.PreprocessingFilters.PreprocessingFilter τάξη. Βασική κλάση για εντολές επεξεργασίας εικόνας.
type: docs
weight: 170
url: /el/net/aspose.ocr.models.preprocessingfilters/preprocessingfilter/
---
## PreprocessingFilter class

Βασική κλάση για εντολές επεξεργασίας εικόνας.

Βασική κλάση για εντολές επεξεργασίας εικόνας.

```csharp
public class PreprocessingFilter : IEnumerable
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [PreprocessingFilter](preprocessingfilter/)() | Ο προεπιλεγμένος κατασκευαστής. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| static [AutoDenoising](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodenoising/#autodenoising)() | Επιτρέπει τη χρήση ενός πρόσθετου νευρωνικού δικτύου για τη βελτίωση της εικόνας - μείωση του θορύβου. Χρήσιμο για εικόνες με τεχνουργήματα σάρωσης, παραμόρφωση, κηλίδες, φωτοβολίδες, διαβαθμίσεις, ξένα στοιχεία. |
| static [AutoDenoising](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodenoising/#autodenoising_1)(Rectangle) | Επιτρέπει τη χρήση ενός πρόσθετου νευρωνικού δικτύου για τη βελτίωση του τμήματος της εικόνας - μείωση του θορύβου. Χρήσιμο για εικόνες με τεχνουργήματα σάρωσης, παραμόρφωση, κηλίδες, φωτοβολίδες, διαβαθμίσεις, ξένα στοιχεία. |
| static [AutoDewarping](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodewarping/)() | Διορθώνει αυτόματα τις γεωμετρικές παραμορφώσεις στην εικόνα. Εξαιρετικά μεγάλη ένταση πόρων! |
| static [AutoSkew](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autoskew/#autoskew)() | Ενεργοποιεί την αυτόματη διόρθωση λοξής εικόνας. |
| static [AutoSkew](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autoskew/#autoskew_1)(Rectangle) | Ενεργοποιεί την αυτόματη διόρθωση λοξού μέρους της εικόνας. |
| static [Binarize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/binarize/#binarize)() | Μετατρέπει μια εικόνα σε ασπρόμαυρη εικόνα. Οι δυαδικές εικόνες είναι εικόνες των οποίων τα pixel έχουν μόνο δύο πιθανές τιμές έντασης. Συνήθως εμφανίζονται ως ασπρόμαυρα. Αριθμητικά, οι δύο τιμές είναι συχνά 0 για το μαύρο και 255 για το λευκό. Οι δυαδικές εικόνες παράγονται με αυτόματο όριο κατωφλίου μιας εικόνας. |
| static [Binarize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/binarize/#binarize_1)(Rectangle) | Μετατρέπει ένα μέρος της εικόνας σε ασπρόμαυρη εικόνα. Οι δυαδικές εικόνες είναι εικόνες των οποίων τα pixel έχουν μόνο δύο πιθανές τιμές έντασης. Συνήθως εμφανίζονται ως ασπρόμαυρα. Αριθμητικά, οι δύο τιμές είναι συχνά 0 για το μαύρο και 255 για το λευκό. Οι δυαδικές εικόνες παράγονται με αυτόματο όριο κατωφλίου μιας εικόνας. |
| static [ContrastCorrectionFilter](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/contrastcorrectionfilter/#contrastcorrectionfilter)() | Φίλτρο διόρθωσης αντίθεσης. |
| static [ContrastCorrectionFilter](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/contrastcorrectionfilter/#contrastcorrectionfilter_1)(Rectangle) | Φίλτρο διόρθωσης αντίθεσης για το τμήμα της εικόνας. |
| static [Dilate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/dilate/#dilate)() | Η διαστολή προσθέτει pixel στα όρια των αντικειμένων σε μια εικόνα. |
| static [Dilate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/dilate/#dilate_1)(Rectangle) | Η διαστολή προσθέτει pixel στα όρια των αντικειμένων σε ένα μέρος της εικόνας. |
| static [Invert](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/invert/#invert)() | Αντιστρέφει αυτόματα τα χρώματα σε μια εικόνα εγγράφου. |
| static [Invert](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/invert/#invert_1)(Rectangle) | Αντιστρέφει αυτόματα τα χρώματα σε ένα μέρος της εικόνας. |
| static [Median](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/median/#median)() | Το διάμεσο φίλτρο διατρέχει κάθε στοιχείο της εικόνας και αντικαθιστά κάθε εικονοστοιχείο με το διάμεσο των γειτονικών εικονοστοιχείων του. |
| static [Median](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/median/#median_1)(Rectangle) | Το διάμεσο φίλτρο διατρέχει κάθε στοιχείο του τμήματος εικόνας και αντικαθιστά κάθε εικονοστοιχείο με το διάμεσο των γειτονικών εικονοστοιχείων του. |
| static [Resize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/resize/#resize)(int, int) | Rescale image - Upscale ή downscale ανάλυση εικόνας. InterpolationFilterType = Lanczos8 |
| static [Resize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/resize/#resize_1)(int, int, InterpolationFilterType) | Rescale image - Upscale ή downscale ανάλυση εικόνας. |
| static [Rotate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/rotate/#rotate)(float) | Περιστροφή αρχικής εικόνας. |
| static [Rotate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/rotate/#rotate_1)(float, Rectangle) | Περιστρέψτε ένα μέρος της εικόνας. |
| static [Scale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/scale/#scale)(float) | Rescale image - Upscale ή downscale ανάλυση εικόνας. InterpolationFilterType = Lanczos8 |
| static [Scale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/scale/#scale_1)(float, InterpolationFilterType) | Rescale image - Upscale ή downscale ανάλυση εικόνας. |
| static [Threshold](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/threshold/#threshold)(int) | Δημιουργήστε μια δυαδική εικόνα με βάση τον ορισμό μιας τιμής κατωφλίου στην ένταση pixel της αρχικής εικόνας. |
| static [Threshold](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/threshold/#threshold_1)(int, Rectangle) | Δημιουργήστε ένα δυαδικό τμήμα της εικόνας με βάση τον ορισμό μιας τιμής κατωφλίου στην ένταση pixel του αρχικού τμήματος εικόνας. |
| static [ToGrayscale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/tograyscale/)() | Μετατρέπει μια εικόνα σε εικόνα σε κλίμακα του γκρι. Η εικόνα σε κλίμακα του γκρι έχει 256 επίπεδα φωτός στην εικόνα (0 έως 255). |
| [Add](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/add/)(PreprocessingFilter) | Προσθέστε το νέο φίλτρο στη συλλογή για περαιτέρω εκτέλεση όλων των λειτουργιών. Η συνέπεια στη συλλογή έχει σημασία. |
| [GetEnumerator](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/getenumerator/)() | Για υλοποίηση IEnumarable interface. |

### Δείτε επίσης

* χώρος ονομάτων [Aspose.OCR.Models.PreprocessingFilters](../../aspose.ocr.models.preprocessingfilters/)
* συνέλευση [Aspose.OCR](../../)


