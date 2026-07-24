---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure méthode"
linktitle: "CreatePathFigure"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure méthode. Crée une nouvelle figure de chemin en C++."
type: docs
weight: 1500
url: /fr/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createpathfigure/
---
## PageAPI::CreatePathFigure(System::Drawing::PointF, bool) method


Crée une nouvelle figure de chemin.

```cpp
System::SharedPtr<XpsModel::XpsPathFigure> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure(System::Drawing::PointF startPoint, bool isClosed=false)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| startPoint | System::Drawing::PointF | Le point de départ du premier segment de la figure de chemin. |
| isClosed | bool | Spécifie si le chemin est fermé. Si la valeur est true, le tracé est dessiné "fermé", c’est‑à‑dire que le dernier point du dernier segment de la figure de chemin est connecté au point spécifié dans l’attribut StartPoint, sinon le tracé est dessiné "ouvert", et le dernier point n’est pas connecté au point de départ. Applicable uniquement si la figure de chemin est utilisée dans un élément Path qui spécifie un tracé. |

### ReturnValue

Nouvelle figure de chemin.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreatePathFigure(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) method


Crée une nouvelle figure de chemin.

```cpp
System::SharedPtr<XpsModel::XpsPathFigure> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure(System::Drawing::PointF startPoint, System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<XpsModel::XpsPathSegment>>> segments, bool isClosed=false)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| startPoint | System::Drawing::PointF | Le point de départ du premier segment de la figure de chemin. |
| segments | System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\> | Liste des segments de chemin. |
| isClosed | bool | Spécifie si le chemin est fermé. Si la valeur est true, le tracé est dessiné "fermé", c’est‑à‑dire que le dernier point du dernier segment de la figure de chemin est connecté au point spécifié dans l’attribut StartPoint, sinon le tracé est dessiné "ouvert", et le dernier point n’est pas connecté au point de départ. Applicable uniquement si la figure de chemin est utilisée dans un élément Path qui spécifie un tracé. |

### ReturnValue

Nouvelle figure de chemin.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [List](../../../system.collections.generic/list/)
* Class [XpsPathSegment](../../../aspose.page.xps.xpsmodel/xpspathsegment/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
