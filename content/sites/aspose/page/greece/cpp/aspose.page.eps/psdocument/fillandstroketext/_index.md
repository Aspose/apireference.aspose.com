---
title: "Aspose::Page::EPS::PsDocument::FillAndStrokeText μέθοδος"
linktitle: "FillAndStrokeText"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::EPS::PsDocument::FillAndStrokeText μέθοδος. Προσθέτει μια συμβολοσειρά κειμένου γεμίζοντας το εσωτερικό των γλυφών και σχεδιάζοντας τα περιγράμματα των γλυφών σε C++."
type: docs
weight: 2500
url: /el/cpp/aspose.page.eps/psdocument/fillandstroketext/
---
## PsDocument::FillAndStrokeText(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) method


Προσθέτει μια συμβολοσειρά κειμένου γεμίζοντας το εσωτερικό των γλυφών και σχεδιάζοντας τα περιγράμματα των γλυφών.

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| text | System::String | Το κείμενο προς προσθήκη. |
| προοδεύει | System::ArrayPtr\<float\> | Ένας πίνακας πλάτους γλυφών. Το μήκος του πρέπει να συμφωνεί με τον αριθμό των γλυφών στη συμβολοσειρά. |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../) που θα χρησιμοποιηθεί για τη σχεδίαση κειμένου. Μπορεί να χρησιμοποιηθεί με προσαρμοσμένη γραμματοσειρά που βρίσκεται σε προσαρμοσμένο φάκελο. |
| x | float | Συντεταγμένη X για την αρχή του κειμένου. |
| y | float | Συντεταγμένη Y για την αρχή του κειμένου. |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | Το γέμισμα που χρησιμοποιείται για τη βαφή του εσωτερικού των γλυφών. |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | Το stroke που χρησιμοποιείται για τη σχεδίαση των περιγραμμάτων των γλυφών. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [Brush](../../../system.drawing/brush/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillAndStrokeText(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) method


Προσθέτει μια συμβολοσειρά κειμένου γεμίζοντας το εσωτερικό των γλυφών και σχεδιάζοντας τα περιγράμματα των γλυφών.

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<System::Drawing::Font> font, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| text | System::String | Το κείμενο προς προσθήκη. |
| προοδεύει | System::ArrayPtr\<float\> | Ένας πίνακας πλάτους γλυφών. Το μήκος του πρέπει να συμφωνεί με τον αριθμό των γλυφών στη συμβολοσειρά. |
| font | System::SharedPtr\<System::Drawing::Font\> | [System](../../../system/) γραμματοσειρά που θα χρησιμοποιηθεί για τη σχεδίαση κειμένου. |
| x | float | Συντεταγμένη X για την αρχή του κειμένου. |
| y | float | Συντεταγμένη Y για την αρχή του κειμένου. |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | Το γέμισμα που χρησιμοποιείται για τη βαφή του εσωτερικού των γλυφών. |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | Το stroke που χρησιμοποιείται για τη σχεδίαση των περιγραμμάτων των γλυφών. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [Brush](../../../system.drawing/brush/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillAndStrokeText(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) method


Προσθέτει μια συμβολοσειρά κειμένου γεμίζοντας το εσωτερικό των γλυφών και σχεδιάζοντας τα περιγράμματα των γλυφών.

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| text | System::String | Το κείμενο προς προσθήκη. |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../) που θα χρησιμοποιηθεί για τη σχεδίαση κειμένου. Μπορεί να χρησιμοποιηθεί με προσαρμοσμένη γραμματοσειρά που βρίσκεται σε προσαρμοσμένο φάκελο. |
| x | float | Συντεταγμένη X για την αρχή του κειμένου. |
| y | float | Συντεταγμένη Y για την αρχή του κειμένου. |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | Το γέμισμα που χρησιμοποιείται για τη βαφή του εσωτερικού των γλυφών. |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | Το stroke που χρησιμοποιείται για τη σχεδίαση των περιγραμμάτων των γλυφών. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [Brush](../../../system.drawing/brush/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillAndStrokeText(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) method


Προσθέτει μια συμβολοσειρά κειμένου γεμίζοντας το εσωτερικό των γλυφών και σχεδιάζοντας τα περιγράμματα των γλυφών.

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::SharedPtr<System::Drawing::Font> font, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| text | System::String | Το κείμενο προς προσθήκη. |
| font | System::SharedPtr\<System::Drawing::Font\> | [System](../../../system/) γραμματοσειρά που θα χρησιμοποιηθεί για τη σχεδίαση κειμένου. |
| x | float | Συντεταγμένη X για την αρχή του κειμένου. |
| y | float | Συντεταγμένη Y για την αρχή του κειμένου. |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | Το γέμισμα που χρησιμοποιείται για τη βαφή του εσωτερικού των γλυφών. |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | Το stroke που χρησιμοποιείται για τη σχεδίαση των περιγραμμάτων των γλυφών. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [Brush](../../../system.drawing/brush/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
