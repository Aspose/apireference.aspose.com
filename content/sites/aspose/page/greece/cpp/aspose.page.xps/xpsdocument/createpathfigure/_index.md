---
title: "Aspose::Page::XPS::XpsDocument::CreatePathFigure μέθοδος"
linktitle: "CreatePathFigure"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::XPS::XpsDocument::CreatePathFigure μέθοδος. Δημιουργεί μια νέα μορφή διαδρομής σε C++."
type: docs
weight: 2200
url: /el/cpp/aspose.page.xps/xpsdocument/createpathfigure/
---
## XpsDocument::CreatePathFigure(System::Drawing::PointF, bool) method


Δημιουργεί μια νέα μορφή μονοπατιού.

```cpp
System::SharedPtr<XpsModel::XpsPathFigure> Aspose::Page::XPS::XpsDocument::CreatePathFigure(System::Drawing::PointF startPoint, bool isClosed=false)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| startPoint | System::Drawing::PointF | Το αρχικό σημείο για το πρώτο τμήμα του σχήματος διαδρομής. |
| isClosed | bool | Καθορίζει εάν η διαδρομή είναι κλειστή. Εάν οριστεί σε true, το στίγμα σχεδιάζεται \"closed\", δηλαδή το τελευταίο σημείο στο τελευταίο τμήμα του σχήματος διαδρομής συνδέεται με το σημείο που καθορίζεται στην ιδιότητα StartPoint, διαφορετικά το στίγμα σχεδιάζεται \"open\" και το τελευταίο σημείο δεν συνδέεται με το αρχικό σημείο. Ισχύει μόνο εάν το σχήμα διαδρομής χρησιμοποιείται σε στοιχείο Path που καθορίζει στίγμα. |

### ReturnValue

Νέο σχήμα διαδρομής.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreatePathFigure(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) method


Δημιουργεί μια νέα μορφή μονοπατιού.

```cpp
System::SharedPtr<XpsModel::XpsPathFigure> Aspose::Page::XPS::XpsDocument::CreatePathFigure(System::Drawing::PointF startPoint, System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<XpsModel::XpsPathSegment>>> segments, bool isClosed=false)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| startPoint | System::Drawing::PointF | Το αρχικό σημείο για το πρώτο τμήμα του σχήματος διαδρομής. |
| segments | System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\> | Λίστα τμημάτων διαδρομής. |
| isClosed | bool | Καθορίζει εάν η διαδρομή είναι κλειστή. Εάν οριστεί σε true, το στίγμα σχεδιάζεται \"closed\", δηλαδή το τελευταίο σημείο στο τελευταίο τμήμα του σχήματος διαδρομής συνδέεται με το σημείο που καθορίζεται στην ιδιότητα StartPoint, διαφορετικά το στίγμα σχεδιάζεται \"open\" και το τελευταίο σημείο δεν συνδέεται με το αρχικό σημείο. Ισχύει μόνο εάν το σχήμα διαδρομής χρησιμοποιείται σε στοιχείο Path που καθορίζει στίγμα. |

### ReturnValue

Νέο σχήμα διαδρομής.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [List](../../../system.collections.generic/list/)
* Class [XpsPathSegment](../../../aspose.page.xps.xpsmodel/xpspathsegment/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
