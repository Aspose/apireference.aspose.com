---
title: "Aspose::Page::EPS::PsDocument::Save method"
linktitle: "Αποθήκευση"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::EPS::PsDocument::Save method. Αποθηκεύει το δοσμένο PsDocument ως αρχείο PS ή EPS. Αυτή η μέθοδος χρησιμοποιείται μόνο όταν το PsDocument δημιουργήθηκε από την αρχή σε C++."
type: docs
weight: 4200
url: /el/cpp/aspose.page.eps/psdocument/save/
---
## PsDocument::Save() method


Αποθηκεύει το δοσμένο [PsDocument](../) ως αρχείο PS ή [EPS](../../). Αυτή η μέθοδος χρησιμοποιείται μόνο όταν το [PsDocument](../) δημιουργήθηκε από την αρχή.

```cpp
void Aspose::Page::EPS::PsDocument::Save()
```

## Δείτε επίσης

* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::Save(System::SharedPtr\<System::IO::Stream\>) method


Αποθηκεύει το δοσμένο [PsDocument](../) στη ροή. Αυτή η μέθοδος χρησιμοποιείται μόνο μετά την ενημέρωση των μεταδεδομένων [XMP](../../../aspose.page.eps.xmp/). Αποθηκεύει το αρχικό αρχείο [EPS](../../) με ενημερωμένα υπάρχοντα μεταδεδομένα ή νέο που δημιουργήθηκε κατά την κλήση της μεθόδου GetMetadata. Στην τελευταία περίπτωση προστίθεται όλος ο απαραίτητος κώδικας PostScript και τα σχόλια [EPS](../../).

```cpp
void Aspose::Page::EPS::PsDocument::Save(System::SharedPtr<System::IO::Stream> epsStream)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | Ροή εξόδου αρχείου [EPS](../../). |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::Save(System::String) method


Αποθηκεύει το δοσμένο [PsDocument](../) ως αρχείο [EPS](../../). Αυτή η μέθοδος χρησιμοποιείται μόνο μετά την ενημέρωση των μεταδεδομένων [XMP](../../../aspose.page.eps.xmp/). Αποθηκεύει το αρχικό αρχείο [EPS](../../) με ενημερωμένα υπάρχοντα μεταδεδομένα ή νέο που δημιουργήθηκε κατά την κλήση της μεθόδου GetMetadata. Στην τελευταία περίπτωση προστίθεται όλος ο απαραίτητος κώδικας PostScript και τα σχόλια [EPS](../../).

```cpp
void Aspose::Page::EPS::PsDocument::Save(System::String outEpsFilePath)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| outEpsFilePath | System::String | Διαδρομή αρχείου εξόδου [EPS](../../). |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
