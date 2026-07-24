---
title: "Aspose::Page::XPS::XpsDocument::CreateImageBrush method"
linktitle: "CreateImageBrush"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::XpsDocument::CreateImageBrush method. Erstellt einen neuen Image-Brush in C++."
type: docs
weight: 1800
url: /de/cpp/aspose.page.xps/xpsdocument/createimagebrush/
---
## XpsDocument::CreateImageBrush(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) method


Erstellt einen neuen Bildpinsel.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::XpsDocument::CreateImageBrush(System::SharedPtr<XpsModel::XpsImage> image, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
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
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateImageBrush(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) method


Erstellt einen neuen Bildpinsel.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::XpsDocument::CreateImageBrush(System::String imagePath, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
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
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
