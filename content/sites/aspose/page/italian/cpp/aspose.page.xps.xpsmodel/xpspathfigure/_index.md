---
title: "Aspose::Page::XPS::XpsModel::XpsPathFigure classe"
linktitle: "XpsPathFigure"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsModel::XpsPathFigure classe. Classe che incapsula le funzionalità dell'elemento PathFigure. Questo elemento è composto da un insieme di uno o più segmenti di linea o curva in C++."
type: docs
weight: 3100
url: /it/cpp/aspose.page.xps.xpsmodel/xpspathfigure/
---
## XpsPathFigure class


Classe che incapsula le funzionalità dell'elemento PathFigure. Questo elemento è composto da un insieme di uno o più segmenti di linea o curva.

```cpp
class XpsPathFigure : public Aspose::Page::XPS::XpsModel::XpsArray<System::SharedPtr<XpsPathSegment>>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clone](./clone/)() | Clona questa figura di percorso. |
| [get_IsClosed](./get_isclosed/)() const | Restituisce/imposta il valore che indica se la figura di percorso è chiusa. |
| [get_IsFilled](./get_isfilled/)() const | Restituisce/imposta il valore che indica se la figura di percorso è utilizzata nel calcolo dell'area della geometria di percorso contenente. |
| [get_Segments](./get_segments/)() | Restituisce l'elenco dei segmenti di percorso figli. |
| [get_StartPoint](./get_startpoint/)() const | Restituisce/imposta il punto di partenza per il primo segmento della figura di percorso. |
| [set_IsClosed](./set_isclosed/)(bool) | Restituisce/imposta il valore che indica se la figura di percorso è chiusa. |
| [set_IsFilled](./set_isfilled/)(bool) | Restituisce/imposta il valore che indica se la figura di percorso è utilizzata nel calcolo dell'area della geometria di percorso contenente. |
| [set_StartPoint](./set_startpoint/)(System::Drawing::PointF) | Restituisce/imposta il punto di partenza per il primo segmento della figura di percorso. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Imposta il n‑esimo argomento del modello come puntatore debole (anziché condiviso). Consente di cambiare i puntatori nei contenitori in modalità debole. |
## Vedi anche

* Class [XpsArray](../xpsarray/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
