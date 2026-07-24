---
title: "Aspose::Page::XPS::XpsDocument::CreatePolyQuadraticBezierSegment méthode"
linktitle: "CreatePolyQuadraticBezierSegment"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsDocument::CreatePolyQuadraticBezierSegment méthode. Crée un nouvel ensemble de courbes de Bézier quadratiques à partir du point précédent dans la figure du chemin à travers un ensemble de sommets, en utilisant les points de contrôle spécifiés en C++."
type: docs
weight: 2600
url: /fr/cpp/aspose.page.xps/xpsdocument/createpolyquadraticbeziersegment/
---
## XpsDocument::CreatePolyQuadraticBezierSegment method


Crée un nouvel ensemble de courbes de Bézier quadratiques depuis le point précédent dans la figure de chemin à travers un ensemble de sommets, en utilisant des points de contrôle spécifiés.

```cpp
System::SharedPtr<XpsModel::XpsPolyQuadraticBezierSegment> Aspose::Page::XPS::XpsDocument::CreatePolyQuadraticBezierSegment(System::ArrayPtr<System::Drawing::PointF> points, bool isStroked=true)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| points | System::ArrayPtr\<System::Drawing::PointF\> | Points de contrôle pour plusieurs segments de Bézier quadratiques. |
| isStroked | bool | Spécifie si le trait pour ce segment du chemin est dessiné. |

### ReturnValue

Nouveau segment de courbes quadratiques de Bézier.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPolyQuadraticBezierSegment](../../../aspose.page.xps.xpsmodel/xpspolyquadraticbeziersegment/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
