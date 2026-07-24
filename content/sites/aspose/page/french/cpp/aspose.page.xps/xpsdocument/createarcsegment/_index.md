---
title: "Aspose::Page::XPS::XpsDocument::CreateArcSegment méthode"
linktitle: "CreateArcSegment"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsDocument::CreateArcSegment méthode. Crée un nouveau segment d'arc elliptique en C++."
type: docs
weight: 1000
url: /fr/cpp/aspose.page.xps/xpsdocument/createarcsegment/
---
## XpsDocument::CreateArcSegment method


Crée un nouveau segment d'arc elliptique.

```cpp
System::SharedPtr<XpsModel::XpsArcSegment> Aspose::Page::XPS::XpsDocument::CreateArcSegment(System::Drawing::PointF point, System::Drawing::SizeF size, float rotationAngle, bool isLargeArc, XpsModel::XpsSweepDirection sweepDirection, bool isStroked=true)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| point | System::Drawing::PointF | Le point final de l'arc elliptique. |
| size | System::Drawing::SizeF | Le rayon x et y de l'arc elliptique sous forme de paire x,y. |
| rotationAngle | float | Indique comment l'ellipse est tournée par rapport au système de coordonnées actuel. |
| isLargeArc | bool | Détermine si l'arc est tracé avec un balayage de 180 degrés ou plus. |
| sweepDirection | XpsModel::XpsSweepDirection | La direction dans laquelle l'arc est tracé. |
| isStroked | bool | Spécifie si le trait pour ce segment du chemin est dessiné. |

### ReturnValue

Nouveau segment d'arc elliptique.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsArcSegment](../../../aspose.page.xps.xpsmodel/xpsarcsegment/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [XpsSweepDirection](../../../aspose.page.xps.xpsmodel/xpssweepdirection/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
