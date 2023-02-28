---
title: AsposeOcr.PreprocessImage
second_title: Aspose.OCR για Αναφορά API .NET
description: AsposeOcr μέθοδος. Χρησιμοποιήστε την προεπεξεργασία εικόνας για να βελτιώσετε την ακρίβεια του OCR. Δημιουργήστε μια λίστα φίλτρων που θα εφαρμοστούν στην εικόνα εισόδου με τη σειρά που καθορίζετε. παράδειγμα για να δημιουργήσετε φίλτρα PreprocessingFilter filters  new PreprocessingFilterd___000  PreprocessingFilter.Threshold150 PreprocessingFilter.Binarize PreprocessingFilter.Rotate180 PreprocessingFilter.Resize.6.  PreprocessingFilter.Dilate  Δεν τα χρειάζεστε όλα. Ρυθμίστε μόνο ότι χρειάζεστε.
type: docs
weight: 100
url: /el/net/aspose.ocr/asposeocr/preprocessimage/
---
## PreprocessImage(string, PreprocessingFilter) {#preprocessimage_1}

Χρησιμοποιήστε την προεπεξεργασία εικόνας για να βελτιώσετε την ακρίβεια του OCR. Δημιουργήστε μια λίστα φίλτρων που θα εφαρμοστούν στην εικόνα εισόδου με τη σειρά που καθορίζετε. παράδειγμα για να δημιουργήσετε φίλτρα: PreprocessingFilter filters = new PreprocessingFilterd___000 , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize.6. ), PreprocessingFilter.Dilate() }; Δεν τα χρειάζεστε όλα. Ρυθμίστε μόνο ό,τι χρειάζεστε.

```csharp
public MemoryStream PreprocessImage(string fullPath, PreprocessingFilter filters)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| fullPath | String | Πλήρης διαδρομή προς την εικόνα. |
| filters | PreprocessingFilter | Φίλτρα βελτιστοποίησης εικόνας[`PreprocessingFilter`](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/). |

### Επιστρεφόμενη Αξία

Κάντε ροή με τροποποιημένη εικόνα, ώστε να μπορείτε να την αποθηκεύσετε ή να την αναγνωρίσετε.

### Δείτε επίσης

* class [PreprocessingFilter](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/)
* class [AsposeOcr](../)
* χώρος ονομάτων [Aspose.OCR](../../asposeocr/)
* συνέλευση [Aspose.OCR](../../../)

---

## PreprocessImage(MemoryStream, PreprocessingFilter) {#preprocessimage}

Χρησιμοποιήστε την προεπεξεργασία εικόνας για να βελτιώσετε την ακρίβεια του OCR. Δημιουργήστε μια λίστα φίλτρων που θα εφαρμοστούν στην εικόνα εισόδου με τη σειρά που καθορίζετε. παράδειγμα για να δημιουργήσετε φίλτρα: PreprocessingFilter filters = new PreprocessingFilterd___000 , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize.6. ), PreprocessingFilter.Dilate() }; Δεν τα χρειάζεστε όλα. Ρυθμίστε μόνο ό,τι χρειάζεστε.

```csharp
public MemoryStream PreprocessImage(MemoryStream stream, PreprocessingFilter filters)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| stream | MemoryStream | Ροή μνήμης που περιέχει την εικόνα. |
| filters | PreprocessingFilter | Φίλτρα βελτιστοποίησης εικόνας[`PreprocessingFilter`](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/). |

### Επιστρεφόμενη Αξία

Κάντε ροή με τροποποιημένη εικόνα, ώστε να μπορείτε να την αποθηκεύσετε ή να την αναγνωρίσετε.

### Δείτε επίσης

* class [PreprocessingFilter](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/)
* class [AsposeOcr](../)
* χώρος ονομάτων [Aspose.OCR](../../asposeocr/)
* συνέλευση [Aspose.OCR](../../../)


