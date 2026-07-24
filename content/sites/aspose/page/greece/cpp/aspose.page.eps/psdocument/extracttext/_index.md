---
title: "Aspose::Page::EPS::PsDocument::ExtractText μέθοδος"
linktitle: "ExtractText"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::EPS::PsDocument::ExtractText μέθοδος. Εξάγει κείμενο από αρχείο PS. Το κείμενο μπορεί να εξαχθεί μόνο εάν είναι γραμμένο με γραμματοσειρά Type 42 (TrueType) ή γραμματοσειρά Type 0 με γραμματοσειρές Type 42 στον Vector Map της σε C++."
type: docs
weight: 2300
url: /el/cpp/aspose.page.eps/psdocument/extracttext/
---
## PsDocument::ExtractText method


Εξάγει κείμενο από αρχείο PS. Το κείμενο μπορεί να εξαχθεί μόνο εάν είναι γραμμένο με γραμματοσειρά Type 42 (**TrueType**) ή γραμματοσειρά Type 0 με γραμματοσειρές Type 42 στον Vector Map της.

```cpp
System::String Aspose::Page::EPS::PsDocument::ExtractText(System::SharedPtr<SaveOptions> options, int32_t startPage=0, int32_t endPage=0)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| επιλογές | System::SharedPtr\<SaveOptions\> | Οι επιλογές αποθήκευσης. |
| startPage | int32_t | Η σελίδα από την οποία ξεκινά η εξαγωγή κειμένου. Αυτή η παράμετρος είναι χρήσιμη για έγγραφα πολλαπλών σελίδων. |
| endPage | int32_t | Η σελίδα μέχρι την οποία ολοκληρώνεται η εξαγωγή κειμένου. Αυτή η παράμετρος είναι χρήσιμη για έγγραφα πολλαπλών σελίδων. |

### ReturnValue

Το εξαγόμενο κείμενο.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [SaveOptions](../../../aspose.page/saveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
