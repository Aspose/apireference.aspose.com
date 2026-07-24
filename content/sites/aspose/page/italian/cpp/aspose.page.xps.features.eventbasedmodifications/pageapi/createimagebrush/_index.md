---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush metodo"
linktitle: "CreateImageBrush"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush metodo. Crea un nuovo pennello immagine in C++."
type: docs
weight: 1100
url: /it/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createimagebrush/
---
## PageAPI::CreateImageBrush(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) method


Crea un nuovo pennello immagine.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush(System::SharedPtr<XpsModel::XpsImage> image, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| immagine | System::SharedPtr\\<XpsModel::XpsImage\\> | Una risorsa immagine. |
| viewbox | System::Drawing::RectangleF | La posizione e le dimensioni del contenuto sorgente del pennello. |
| viewport | System::Drawing::RectangleF | La regione nello spazio di coordinate contenente della tessera principale del pennello che è (possibilmente ripetutamente) applicata per riempire la regione a cui il pennello è applicato |

### ReturnValue

Nuovo pennello immagine.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsImageBrush](../../../aspose.page.xps.xpsmodel/xpsimagebrush/)
* Class [XpsImage](../../../aspose.page.xps.xpsmodel/xpsimage/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreateImageBrush(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) method


Crea un nuovo pennello immagine.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush(System::String imagePath, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| imagePath | System::String | Il percorso dell'immagine da utilizzare come tile del pennello. |
| viewbox | System::Drawing::RectangleF | La posizione e le dimensioni del contenuto sorgente del pennello. |
| viewport | System::Drawing::RectangleF | La regione nello spazio di coordinate contenente della tessera principale del pennello che è (possibilmente ripetutamente) applicata per riempire la regione a cui il pennello è applicato |

### ReturnValue

Nuovo pennello immagine.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsImageBrush](../../../aspose.page.xps.xpsmodel/xpsimagebrush/)
* Class [String](../../../system/string/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
