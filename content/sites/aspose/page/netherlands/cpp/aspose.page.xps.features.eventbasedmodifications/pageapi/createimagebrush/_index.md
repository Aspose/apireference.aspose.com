---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush method"
linktitle: "CreateImageBrush"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush method. Maakt een nieuwe afbeeldingskwast in C++."
type: docs
weight: 1100
url: /nl/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createimagebrush/
---
## PageAPI::CreateImageBrush(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) method


Maakt een nieuwe afbeeldingspenseel.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush(System::SharedPtr<XpsModel::XpsImage> image, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| afbeelding | System::SharedPtr\<XpsModel::XpsImage\> | Een afbeeldingsbron. |
| viewbox | System::Drawing::RectangleF | De positie en afmetingen van de broninhoud van de kwast. |
| viewport | System::Drawing::RectangleF | Het gebied in de omvattende coördinatenruimte van de primaire penseel-tegel dat (mogelijk herhaaldelijk) wordt toegepast om het gebied te vullen waarop de penseel wordt toegepast |

### ReturnValue

Nieuwe afbeeldingskwast.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsImageBrush](../../../aspose.page.xps.xpsmodel/xpsimagebrush/)
* Class [XpsImage](../../../aspose.page.xps.xpsmodel/xpsimage/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreateImageBrush(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) method


Maakt een nieuwe afbeeldingspenseel.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush(System::String imagePath, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| imagePath | System::String | Het pad naar de afbeelding die als kwasttegel wordt gebruikt. |
| viewbox | System::Drawing::RectangleF | De positie en afmetingen van de broninhoud van de kwast. |
| viewport | System::Drawing::RectangleF | Het gebied in de omvattende coördinatenruimte van de primaire penseel-tegel dat (mogelijk herhaaldelijk) wordt toegepast om het gebied te vullen waarop de penseel wordt toegepast |

### ReturnValue

Nieuwe afbeeldingskwast.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsImageBrush](../../../aspose.page.xps.xpsmodel/xpsimagebrush/)
* Class [String](../../../system/string/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
