---
title: "Aspose::Page::XPS::XpsDocument::CreateVisualBrush metodo"
linktitle: "CreateVisualBrush"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsDocument::CreateVisualBrush metodo. Crea un nuovo pennello visivo in C++."
type: docs
weight: 2900
url: /it/cpp/aspose.page.xps/xpsdocument/createvisualbrush/
---
## XpsDocument::CreateVisualBrush method


Crea un nuovo pennello visivo.

```cpp
System::SharedPtr<XpsModel::XpsVisualBrush> Aspose::Page::XPS::XpsDocument::CreateVisualBrush(System::SharedPtr<XpsModel::XpsContentElement> element, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| element | System::SharedPtr\<XpsModel::XpsContentElement\> | L'elemento [XPS](../../) (Canvas, Path o Glyphs) per la proprietà Visual del pennello visivo. |
| viewbox | System::Drawing::RectangleF | La posizione e le dimensioni del contenuto sorgente del pennello. |
| viewport | System::Drawing::RectangleF | La regione nello spazio di coordinate contenente della tessera principale del pennello che è (possibilmente ripetutamente) applicata per riempire la regione a cui il pennello è applicato |

### ReturnValue

Nuovo pennello visivo.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsVisualBrush](../../../aspose.page.xps.xpsmodel/xpsvisualbrush/)
* Class [XpsContentElement](../../../aspose.page.xps.xpsmodel/xpscontentelement/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
