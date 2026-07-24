---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateVisualBrush method"
linktitle: "CreateVisualBrush"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateVisualBrush method. Crea un nuovo pennello visivo in C++."
type: docs
weight: 2200
url: /it/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createvisualbrush/
---
## PageAPI::CreateVisualBrush method


Crea un nuovo pennello visivo.

```cpp
System::SharedPtr<XpsModel::XpsVisualBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateVisualBrush(System::SharedPtr<XpsModel::XpsContentElement> element, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| element | System::SharedPtr\<XpsModel::XpsContentElement\> | L'elemento [XPS](../../../aspose.page.xps/) (Canvas, Path o Glyphs) per la proprietà Visual del pennello visivo. |
| viewbox | System::Drawing::RectangleF | La posizione e le dimensioni del contenuto sorgente del pennello. |
| viewport | System::Drawing::RectangleF | La regione nello spazio di coordinate contenente della tessera principale del pennello che è (possibilmente ripetutamente) applicata per riempire la regione a cui il pennello è applicato |

### ReturnValue

Nuovo pennello visivo.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsVisualBrush](../../../aspose.page.xps.xpsmodel/xpsvisualbrush/)
* Class [XpsContentElement](../../../aspose.page.xps.xpsmodel/xpscontentelement/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
