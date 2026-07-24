---
title: "Aspose::Page::XPS::XpsModel::XpsCanvas classe"
linktitle: "XpsCanvas"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsModel::XpsCanvas classe. Classe che incapsula le funzionalità dell'elemento Canvas. Questo elemento raggruppa gli elementi insieme. Ad esempio, gli elementi Glyphs e Path possono essere raggruppati in un canvas per essere identificati come un'unità (come destinazione di un collegamento ipertestuale) o per applicare un valore di proprietà composto a ciascun elemento figlio e antenato in C++."
type: docs
weight: 500
url: /it/cpp/aspose.page.xps.xpsmodel/xpscanvas/
---
## XpsCanvas class


Classe che incapsula le funzionalità dell'elemento Canvas. Questo elemento raggruppa gli elementi insieme. Ad esempio, gli elementi Glyphs e Path possono essere raggruppati in un canvas in modo da essere identificati come un'unità (come destinazione di un collegamento ipertestuale) o per applicare un valore di proprietà composto a ciascun elemento figlio e antenato.

```cpp
class XpsCanvas : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(T) | Aggiunge un elemento all'elenco dei figli di questo canvas. |
| [AddCanvas](./addcanvas/)() | Aggiunge un nuovo canvas all'elenco dei figli di questo canvas. |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Aggiunge nuovi glyphs all'elenco dei figli di questo canvas. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsPathGeometry\>) | Aggiunge un nuovo path all'elenco dei figli di questo canvas. |
| [Clone](./clone/)() | Clona questo canvas. |
| [get_EdgeMode](./get_edgemode/)() const | Restituisce/imposta il valore che controlla come vengono renderizzati i bordi dei path all'interno del canvas. |
| [Insert](./insert/)(int32_t, T) | Inserisce un elemento nell'elenco dei figli di questo canvas nella posizione *index*. |
| [InsertCanvas](./insertcanvas/)(int32_t) | Inserisce un nuovo canvas nell'elenco dei figli di questo canvas nella posizione *index*. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | Inserisce nuovi glyphs nell'elenco dei figli di questo canvas nella posizione *index*. |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsPathGeometry\>) | Inserisce un nuovo path nell'elenco dei figli di questo canvas nella posizione *index*. |
| [set_EdgeMode](./set_edgemode/)(XpsEdgeMode) | Restituisce/imposta il valore che controlla come vengono renderizzati i bordi dei path all'interno del canvas. |
## Vedi anche

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
