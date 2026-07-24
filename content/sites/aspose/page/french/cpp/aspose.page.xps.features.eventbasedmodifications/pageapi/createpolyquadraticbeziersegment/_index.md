---
title: "Méthode Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyQuadraticBezierSegment"
linktitle: "CreatePolyQuadraticBezierSegment"
second_title: "Aspose.Page pour C++"
description: "Méthode Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyQuadraticBezierSegment. Crée un nouvel ensemble de courbes de Bézier quadratiques depuis le point précédent dans la figure du chemin à travers un ensemble de sommets, en utilisant les points de contrôle spécifiés en C++."
type: docs
weight: 1900
url: /fr/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createpolyquadraticbeziersegment/
---
## PageAPI::CreatePolyQuadraticBezierSegment method


Crée un nouvel ensemble de courbes de Bézier quadratiques depuis le point précédent dans la figure de chemin à travers un ensemble de sommets, en utilisant des points de contrôle spécifiés.

```cpp
System::SharedPtr<XpsModel::XpsPolyQuadraticBezierSegment> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyQuadraticBezierSegment(System::ArrayPtr<System::Drawing::PointF> points, bool isStroked=true)
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
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
