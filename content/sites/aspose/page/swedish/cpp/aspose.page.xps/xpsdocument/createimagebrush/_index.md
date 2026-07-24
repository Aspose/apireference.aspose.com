---
title: "Aspose::Page::XPS::XpsDocument::CreateImageBrush method"
linktitle: "CreateImageBrush"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsDocument::CreateImageBrush method. Skapar en ny bildpensel i C++."
type: docs
weight: 1800
url: /sv/cpp/aspose.page.xps/xpsdocument/createimagebrush/
---
## XpsDocument::CreateImageBrush(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) method


Skapar en ny bildpensel.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::XpsDocument::CreateImageBrush(System::SharedPtr<XpsModel::XpsImage> image, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
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
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateImageBrush(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) method


Skapar en ny bildpensel.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::XpsDocument::CreateImageBrush(System::String imagePath, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
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
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
