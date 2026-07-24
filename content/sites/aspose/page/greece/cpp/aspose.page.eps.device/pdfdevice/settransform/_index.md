---
title: "Aspose::Page::EPS::Device::PdfDevice::SetTransform method"
linktitle: "SetTransform"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::EPS::Device::PdfDevice::SetTransform method. Καθορίζει τη τρέχουσα μεταστροφή. Δεδομένου ότι οι περισσότερες μορφές εξόδου δεν υλοποιούν αυτή τη λειτουργία, υπολογίζεται η αντίστροφη μεταστροφή του currentTransform και πολλαπλασιάζεται με τη μεταστροφή που θα οριστεί. Το αποτέλεσμα προωθείται στη συνέχεια με κλήση της writeTransform(Transform) σε C++."
type: docs
weight: 5800
url: /el/cpp/aspose.page.eps.device/pdfdevice/settransform/
---
## PdfDevice::SetTransform method


Καθορίζει τον τρέχοντα μετασχηματισμό. Δεδομένου ότι οι περισσότερες μορφές εξόδου δεν υλοποιούν αυτή τη λειτουργία, υπολογίζεται ο αντίστροφος μετασχηματισμός του currentTransform και πολλαπλασιάζεται με τον μετασχηματισμό που θα οριστεί. Το αποτέλεσμα προωθείται στη συνέχεια με κλήση της writeTransform(Transform).

```cpp
void Aspose::Page::EPS::Device::PdfDevice::SetTransform(System::SharedPtr<System::Drawing::Drawing2D::Matrix> transform) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| μεταστροφή | System::SharedPtr\<System::Drawing::Drawing2D::Matrix\> | Μεταστροφή που θα εφαρμοστεί. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Class [PdfDevice](../)
* Namespace [Aspose::Page::EPS::Device](../../)
* Library [Aspose.Page for C++](../../../)
