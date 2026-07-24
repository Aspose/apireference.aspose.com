---
title: "Aspose::Page::XPS::Presentation::Pdf::PdfImageCompression enum"
linktitle: "PdfImageCompression"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::XPS::Presentation::Pdf::PdfImageCompression enum. Καθορίζει τον τύπο συμπίεσης που εφαρμόζεται στις εικόνες του αρχείου PDF στη C++."
type: docs
weight: 700
url: /el/cpp/aspose.page.xps.presentation.pdf/pdfimagecompression/
---
## PdfImageCompression enum


Καθορίζει τον τύπο συμπίεσης που εφαρμόζεται στις εικόνες στο αρχείο PDF.

```cpp
enum class PdfImageCompression
```

### Τιμές

| Όνομα | Τιμή | Περιγραφή |
| --- | --- | --- |
| Αυτόματο | 0 | Επιλέγει αυτόματα τη πιο κατάλληλη συμπίεση για κάθε εικόνα. |
| None | 1 | Αποθηκεύει ακατέργαστα bytes εικόνας, με αποτέλεσμα μεγαλύτερα μεγέθη αρχείων PDF. |
| Rle | 2 | Συμπίεση Run Length. |
| Flate | 3 | Συμπίεση Flate. |
| LzwBaselinePredictor | 4 | Η επιλογή προβλέπτη περιορίζεται στον προβλέπτη PNG Paeth για επιτάχυνση της διαδικασίας. Στην πράξη αποδίδει εκπληκτικά καλά. Καλύτερη από το [LzwOptimizedPredictor](./). |
| LzwOptimizedPredictor | 5 | Η επιλογή του προβλεπτικού μοντέλου είναι πιο πολύπλοκη και θα πρέπει να έχει ως αποτέλεσμα μικρότερα μεγέθη εικόνας, αλλά απαιτεί περισσότερο χρόνο. |
| Jpeg | 6 | Συμπίεση JPEG. Δεν υποστηρίζει διαφάνεια. |

## Δείτε επίσης

* Namespace [Aspose::Page::XPS::Presentation::Pdf](../)
* Library [Aspose.Page for C++](../../)
