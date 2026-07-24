---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush method"
linktitle: "CreateImageBrush"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush method. Skapar en ny bildpensel i C++."
type: docs
weight: 1100
url: /sv/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createimagebrush/
---
## PageAPI::CreateImageBrush(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) method


Skapar en ny bildpensel.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush(System::SharedPtr<XpsModel::XpsImage> image, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| bild | System::SharedPtr\<XpsModel::XpsImage\> | En bildresurs. |
| viewbox | System::Drawing::RectangleF | Positionen och dimensionerna för borstens källinnehåll. |
| visningsområde | System::Drawing::RectangleF | Regionen i det omgivande koordinatrymmet för den primära borstplattan som (möjligen upprepade gånger) appliceras för att fylla den region som borsten appliceras på. |

### ReturnValue

Ny bildpensel.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsImageBrush](../../../aspose.page.xps.xpsmodel/xpsimagebrush/)
* Class [XpsImage](../../../aspose.page.xps.xpsmodel/xpsimage/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreateImageBrush(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) method


Skapar en ny bildpensel.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush(System::String imagePath, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| imagePath | System::String | Sökvägen till bilden som ska användas som penseltegel. |
| viewbox | System::Drawing::RectangleF | Positionen och dimensionerna för borstens källinnehåll. |
| visningsområde | System::Drawing::RectangleF | Regionen i det omgivande koordinatrymmet för den primära borstplattan som (möjligen upprepade gånger) appliceras för att fylla den region som borsten appliceras på. |

### ReturnValue

Ny bildpensel.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsImageBrush](../../../aspose.page.xps.xpsmodel/xpsimagebrush/)
* Class [String](../../../system/string/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
