---
title: "Aspose::Page::XPS::XpsDocument::CreateImageBrush metodo"
linktitle: "CreateImageBrush"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsDocument::CreateImageBrush metodo. Crea un nuovo pennello immagine in C++."
type: docs
weight: 1800
url: /it/cpp/aspose.page.xps/xpsdocument/createimagebrush/
---
## XpsDocument::CreateImageBrush(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) method


Crea un nuovo pennello immagine.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::XpsDocument::CreateImageBrush(System::SharedPtr<XpsModel::XpsImage> image, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
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
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateImageBrush(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) method


Crea un nuovo pennello immagine.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::XpsDocument::CreateImageBrush(System::String imagePath, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
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
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
