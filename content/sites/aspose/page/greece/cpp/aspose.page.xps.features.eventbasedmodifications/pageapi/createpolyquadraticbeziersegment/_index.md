---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyQuadraticBezierSegment method"
linktitle: "CreatePolyQuadraticBezierSegment"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyQuadraticBezierSegment method. Δημιουργεί ένα νέο σύνολο τετραγωνικών καμπυλών Bézier από το προηγούμενο σημείο στη φιγούρα του μονοπατιού μέσω ενός συνόλου κορυφών, χρησιμοποιώντας καθορισμένα σημεία ελέγχου σε C++."
type: docs
weight: 1900
url: /el/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createpolyquadraticbeziersegment/
---
## PageAPI::CreatePolyQuadraticBezierSegment method


Δημιουργεί ένα νέο σύνολο τετραγωνικών καμπυλών Bézier από το προηγούμενο σημείο στη μορφή μονοπατιού μέσω ενός συνόλου κορυφών, χρησιμοποιώντας καθορισμένα σημεία ελέγχου.

```cpp
System::SharedPtr<XpsModel::XpsPolyQuadraticBezierSegment> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyQuadraticBezierSegment(System::ArrayPtr<System::Drawing::PointF> points, bool isStroked=true)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| points | System::ArrayPtr\<System::Drawing::PointF\> | Σημεία ελέγχου για πολλαπλά τετραγωνικά τμήματα Bézier. |
| isStroked | bool | Καθορίζει εάν το περίγραμμα για αυτό το τμήμα της διαδρομής σχεδιάζεται. |

### ReturnValue

Νέο τμήμα τετραγωνικών καμπυλών Bézier.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPolyQuadraticBezierSegment](../../../aspose.page.xps.xpsmodel/xpspolyquadraticbeziersegment/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
