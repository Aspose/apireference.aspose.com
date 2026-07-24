---
title: "Aspose::Page::EPS::PsDocument::ResizeEps μέθοδος"
linktitle: "ResizeEps"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::EPS::PsDocument::ResizeEps μέθοδος. Αλλάζει το μέγεθος του δεδομένου PsDocument ως αρχείο EPS. Αυτή η μέθοδος χρησιμοποιείται μόνο μετά την εξαγωγή του μεγέθους EPS. Αποθηκεύει το αρχικό αρχείο EPS με ενημερωμένο υπάρχον %BoundingBox ή θα δημιουργηθεί νέο. Ο πίνακας μετασχηματισμού της σελίδας επίσης θα οριστεί σε C++."
type: docs
weight: 4000
url: /el/cpp/aspose.page.eps/psdocument/resizeeps/
---
## PsDocument::ResizeEps(System::SharedPtr\<System::IO::Stream\>, System::Drawing::SizeF, Units) method


Αλλάζει το μέγεθος του δεδομένου [PsDocument](../) ως αρχείο [EPS](../../). Αυτή η μέθοδος χρησιμοποιείται μόνο μετά την εξαγωγή του μεγέθους του [EPS](../../). Αποθηκεύει το αρχικό [EPS](../../) αρχείο με ενημερωμένο υπάρχον %BoundingBox ή θα δημιουργηθεί νέο. Ο μετασχηματισμός του [Page](../../../aspose.page/) επίσης θα οριστεί.

```cpp
void Aspose::Page::EPS::PsDocument::ResizeEps(System::SharedPtr<System::IO::Stream> epsStream, System::Drawing::SizeF newSizeInUnits, Units units)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | Ροή εξόδου αρχείου [EPS](../../). |
| newSizeInUnits | System::Drawing::SizeF | Νέο μέγεθος της εικόνας [EPS](../../) στις καθορισμένες μονάδες. |
| μονάδες | Μονάδες | Οι μονάδες του νέου μεγέθους. Μπορούν να είναι σημεία, ίντσες, χιλιοστά, εκατοστά και ποσοστά του αρχικού μεγέθους. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [Units](../../../aspose.page/units/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::ResizeEps(System::String, System::Drawing::SizeF, Units) method


Αλλάζει το μέγεθος του δεδομένου [PsDocument](../) ως αρχείο [EPS](../../). Αυτή η μέθοδος χρησιμοποιείται μόνο μετά την εξαγωγή του μεγέθους του [EPS](../../). Αποθηκεύει το αρχικό [EPS](../../) filD:\ASPOSE.GIT\aspose.pdf.cpp\cs_porter_produce\Aspose.Page.Cpp.Page.Cpp\eps\src_eps\PsDocument.hΟ φάκελος εξόδου όπου το αρχείο εικόνας θα αποθηκευτεί.e με ενημερωμένο υπάρχον %BoundingBox ή θα δημιουργηθεί νέο. Ο μετασχηματισμός του [Page](../../../aspose.page/) επίσης θα οριστεί.

```cpp
void Aspose::Page::EPS::PsDocument::ResizeEps(System::String outEpsFilePath, System::Drawing::SizeF newSizeInUnits, Units units)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| outEpsFilePath | System::String | Η διαδρομή εξόδου του αρχείου [EPS](../../). |
| newSizeInUnits | System::Drawing::SizeF | Νέο μέγεθος της εικόνας [EPS](../../) στις καθορισμένες μονάδες. |
| μονάδες | Μονάδες | Οι μονάδες του νέου μεγέθους. Μπορούν να είναι σημεία, ίντσες, χιλιοστά, εκατοστά και ποσοστά του αρχικού μεγέθους. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [Units](../../../aspose.page/units/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
