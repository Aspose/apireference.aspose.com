---
title: "Aspose::Page::XPS::XpsModel::XpsPathGeometry classe"
linktitle: "XpsPathGeometry"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsModel::XpsPathGeometry classe. Classe che incapsula le funzionalità dell'elemento proprietà PathGeometry. Questo elemento contiene un insieme di figure di percorso specificate sia con l'attributo Figures sia con un elemento figlio PathFigure in C++."
type: docs
weight: 3200
url: /it/cpp/aspose.page.xps.xpsmodel/xpspathgeometry/
---
## XpsPathGeometry class


Classe che incapsula le funzionalità dell'elemento proprietà PathGeometry. Questo elemento contiene un insieme di figure di percorso specificate sia con l'attributo Figures sia con un elemento figlio PathFigure.

```cpp
class XpsPathGeometry : public Aspose::Page::XPS::XpsModel::XpsArray<System::SharedPtr<XpsPathFigure>>,
                        public Aspose::Page::XPS::XpsModel::ITransformableProperty
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AddSegment](./addsegment/)(System::SharedPtr\<XpsPathSegment\>) | Aggiunge un segmento di percorso all'elenco dei segmenti figli dell'ultima figura di percorso. |
| [Clone](./clone/)() | Clona questa geometria di percorso. |
| [get_FillRule](./get_fillrule/)() const | Restituisce/imposta il valore che specifica come le aree di intersezione delle forme geometriche vengono combinate per formare una regione. |
| [get_PathFigures](./get_pathfigures/)() | Restituisce l'elenco delle figure di percorso figlie. |
| [get_Transform](./get_transform/)() override | Restituisce/imposta la matrice di trasformazione affine che stabilisce la trasformazione matriciale locale applicata a tutti gli elementi figli e discendenti della geometria di percorso prima che venga usata per il riempimento, il ritaglio o il contorno. |
| [InsertSegment](./insertsegment/)(int32_t, System::SharedPtr\<XpsPathSegment\>) | Inserisce un segmento di percorso nell'elenco dei segmenti figli dell'ultima figura di percorso nella posizione *index*. |
| [RemoveSegment](./removesegment/)(System::SharedPtr\<XpsPathSegment\>) | Rimuove un segmento di percorso dall'elenco dei segmenti figli dell'ultima figura di percorso. |
| [RemoveSegmentAt](./removesegmentat/)(int32_t) | Rimuove un segmento di percorso dall'elenco dei segmenti figli dell'ultima figura di percorso nella posizione *index*. |
| [set_FillRule](./set_fillrule/)(XpsFillRule) | Restituisce/imposta il valore che specifica come le aree di intersezione delle forme geometriche vengono combinate per formare una regione. |
| [set_Transform](./set_transform/)(System::SharedPtr\<XpsMatrix\>) override | Restituisce/imposta la matrice di trasformazione affine che stabilisce la trasformazione matriciale locale applicata a tutti gli elementi figli e discendenti della geometria di percorso prima che venga usata per il riempimento, il ritaglio o il contorno. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Imposta il n‑esimo argomento del modello come puntatore debole (anziché condiviso). Consente di cambiare i puntatori nei contenitori in modalità debole. |
## Vedi anche

* Class [XpsArray](../xpsarray/)
* Class [ITransformableProperty](../itransformableproperty/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
