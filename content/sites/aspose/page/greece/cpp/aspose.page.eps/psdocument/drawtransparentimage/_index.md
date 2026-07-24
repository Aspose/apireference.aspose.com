---
title: "Aspose::Page::EPS::PsDocument::DrawTransparentImage μέθοδος"
linktitle: "DrawTransparentImage"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::EPS::PsDocument::DrawTransparentImage μέθοδος. Σχεδιάζει τη μετασχηματισμένη διαφανή εικόνα. Εάν η εικόνα δεν έχει κανάλι Alpha, θα σχεδιαστεί ως αδιαφανής εικόνα σε C++."
type: docs
weight: 2000
url: /el/cpp/aspose.page.eps/psdocument/drawtransparentimage/
---
## PsDocument::DrawTransparentImage method


Σχεδιάζει μετασχηματισμένη διαφανή εικόνα. Εάν η εικόνα δεν έχει κανάλι Alpha, θα σχεδιαστεί ως αδιαφανής εικόνα.

```cpp
void Aspose::Page::EPS::PsDocument::DrawTransparentImage(System::SharedPtr<System::Drawing::Bitmap> image, System::SharedPtr<System::Drawing::Drawing2D::Matrix> transform, int32_t transparencyThreshold)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| image | System::SharedPtr\<System::Drawing::Bitmap\> | Η εικόνα προς σχεδίαση. |
| μεταστροφή | System::SharedPtr\<System::Drawing::Drawing2D::Matrix\> | Ο πίνακας για μετασχηματισμό της εικόνας. |
| transparencyThreshold | int32_t | Ένα όριο που ορίζει από ποια τιμή διαφάνειας το pixel θα θεωρείται πλήρως διαφανές. Όλες οι τιμές κάτω από αυτό το όριο θα θεωρούνται πλήρως αδιαφανείς. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Bitmap](../../../system.drawing/bitmap/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
