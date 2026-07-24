---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush method"
linktitle: "CreateImageBrush"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush method. Erstellt einen neuen Bildpinsel in C++."
type: docs
weight: 1100
url: /de/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createimagebrush/
---
## PageAPI::CreateImageBrush(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) method


Erstellt einen neuen Bildpinsel.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush(System::SharedPtr<XpsModel::XpsImage> image, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Bild | System::SharedPtr\<XpsModel::XpsImage\> | Eine Bildressource. |
| viewbox | System::Drawing::RectangleF | Die Position und Abmessungen des Quellinhalts des Pinsels. |
| Ansichtsfenster | System::Drawing::RectangleF | Der Bereich im umgebenden Koordinatenraum des primären Pinseltiles, der (möglicherweise wiederholt) angewendet wird, um den Bereich zu füllen, auf den der Pinsel angewendet wird. |

### ReturnValue

Neuer Bildpinsel.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsImageBrush](../../../aspose.page.xps.xpsmodel/xpsimagebrush/)
* Class [XpsImage](../../../aspose.page.xps.xpsmodel/xpsimage/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreateImageBrush(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) method


Erstellt einen neuen Bildpinsel.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush(System::String imagePath, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| imagePath | System::String | Der Pfad zum Bild, das als Pinselkachel verwendet wird. |
| viewbox | System::Drawing::RectangleF | Die Position und Abmessungen des Quellinhalts des Pinsels. |
| Ansichtsfenster | System::Drawing::RectangleF | Der Bereich im umgebenden Koordinatenraum des primären Pinseltiles, der (möglicherweise wiederholt) angewendet wird, um den Bereich zu füllen, auf den der Pinsel angewendet wird. |

### ReturnValue

Neuer Bildpinsel.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsImageBrush](../../../aspose.page.xps.xpsmodel/xpsimagebrush/)
* Class [String](../../../system/string/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
