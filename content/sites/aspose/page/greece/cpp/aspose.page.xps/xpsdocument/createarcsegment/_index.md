---
title: "Aspose::Page::XPS::XpsDocument::CreateArcSegment μέθοδος"
linktitle: "CreateArcSegment"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::XPS::XpsDocument::CreateArcSegment μέθοδος. Δημιουργεί ένα νέο ελλειπτικό τμήμα τόξου σε C++."
type: docs
weight: 1000
url: /el/cpp/aspose.page.xps/xpsdocument/createarcsegment/
---
## XpsDocument::CreateArcSegment method


Δημιουργεί ένα νέο τμήμα ελλειπτικού τόξου.

```cpp
System::SharedPtr<XpsModel::XpsArcSegment> Aspose::Page::XPS::XpsDocument::CreateArcSegment(System::Drawing::PointF point, System::Drawing::SizeF size, float rotationAngle, bool isLargeArc, XpsModel::XpsSweepDirection sweepDirection, bool isStroked=true)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| σημείο | System::Drawing::PointF | Το τελικό σημείο του ελλειπτικού τόξου. |
| size | System::Drawing::SizeF | Οι ακτίνες x και y του ελλειπτικού τόξου ως ζεύγος x,y. |
| rotationAngle | float | Δείχνει πώς η έλλειψη περιστρέφεται σε σχέση με το τρέχον σύστημα συντεταγμένων. |
| isLargeArc | bool | Καθορίζει αν το τόξο σχεδιάζεται με σάρωση 180 μοιρών ή μεγαλύτερη. |
| sweepDirection | XpsModel::XpsSweepDirection | Η κατεύθυνση στην οποία σχεδιάζεται το τόξο. |
| isStroked | bool | Καθορίζει εάν το περίγραμμα για αυτό το τμήμα της διαδρομής σχεδιάζεται. |

### ReturnValue

Νέο ελλειπτικό τμήμα τόξου.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsArcSegment](../../../aspose.page.xps.xpsmodel/xpsarcsegment/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [XpsSweepDirection](../../../aspose.page.xps.xpsmodel/xpssweepdirection/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
