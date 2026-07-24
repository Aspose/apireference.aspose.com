---
title: "Aspose::Page::XPS::XpsDocument::CreateVisualBrush Methode"
linktitle: "CreateVisualBrush"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::XpsDocument::CreateVisualBrush Methode. Erstellt einen neuen visuellen Pinsel in C++."
type: docs
weight: 2900
url: /de/cpp/aspose.page.xps/xpsdocument/createvisualbrush/
---
## XpsDocument::CreateVisualBrush method


Erstellt einen neuen visuellen Pinsel.

```cpp
System::SharedPtr<XpsModel::XpsVisualBrush> Aspose::Page::XPS::XpsDocument::CreateVisualBrush(System::SharedPtr<XpsModel::XpsContentElement> element, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| element | System::SharedPtr\<XpsModel::XpsContentElement\> | Das [XPS](../../)-Element (Canvas, Path oder Glyphs) für die Visual‑Eigenschaft des visuellen Pinsels. |
| viewbox | System::Drawing::RectangleF | Die Position und Abmessungen des Quellinhalts des Pinsels. |
| Ansichtsfenster | System::Drawing::RectangleF | Der Bereich im umgebenden Koordinatenraum des primären Pinseltiles, der (möglicherweise wiederholt) angewendet wird, um den Bereich zu füllen, auf den der Pinsel angewendet wird. |

### ReturnValue

Neuer visueller Pinsel.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsVisualBrush](../../../aspose.page.xps.xpsmodel/xpsvisualbrush/)
* Class [XpsContentElement](../../../aspose.page.xps.xpsmodel/xpscontentelement/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
