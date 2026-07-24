---
title: "Aspose::Page::XPS::XpsDocument::CreateImageBrush methode"
linktitle: "CreateImageBrush"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::XpsDocument::CreateImageBrush methode. Maakt een nieuwe afbeeldingskwast in C++."
type: docs
weight: 1800
url: /nl/cpp/aspose.page.xps/xpsdocument/createimagebrush/
---
## XpsDocument::CreateImageBrush(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) method


Maakt een nieuwe afbeeldingspenseel.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::XpsDocument::CreateImageBrush(System::SharedPtr<XpsModel::XpsImage> image, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
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
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateImageBrush(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) method


Maakt een nieuwe afbeeldingspenseel.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::XpsDocument::CreateImageBrush(System::String imagePath, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
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
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
