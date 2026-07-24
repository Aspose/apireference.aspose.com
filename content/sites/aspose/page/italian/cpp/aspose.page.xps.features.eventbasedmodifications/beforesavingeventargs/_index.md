---
title: "Aspose::Page::XPS::Features::EventBasedModifications::BeforeSavingEventArgs classe"
linktitle: "BeforeSavingEventArgs"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::BeforeSavingEventArgs classe. Definisce la classe base per gli argomenti di vari eventi di pre-salvataggio in C++."
type: docs
weight: 200
url: /it/cpp/aspose.page.xps.features.eventbasedmodifications/beforesavingeventargs/
---
## BeforeSavingEventArgs class


Definisce la classe base per gli argomenti di vari eventi di pre-salvataggio.

```cpp
template<typename T>class BeforeSavingEventArgs : public System::Object
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo di API di modifica. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_AbsolutePageNumber](./get_absolutepagenumber/)() const | Il numero di pagina assoluto corrente su tutti i documenti all'interno del pacchetto [XPS](../../aspose.page.xps/). |
| [get_DocumentNumber](./get_documentnumber/)() const | Il numero di documento corrente all'interno del pacchetto [XPS](../../aspose.page.xps/). |
| [get_ElementAPI](./get_elementapi/)() const | Ottiene l'API di modifica dell'elemento che sta per essere salvato. |
| [get_OutputPageNumber](./get_outputpagenumber/)() const | Il numero di output corrente. È diverso da **AbsolutePageNumber** se è specificata l'opzione di salvataggio **PageNumbers**. |
| [get_RelativePageNumber](./get_relativepagenumber/)() const | Il numero di pagina corrente relativo al documento corrente all'interno del pacchetto [XPS](../../aspose.page.xps/). |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Imposta il n‑esimo argomento del modello come puntatore debole (anziché condiviso). Consente di cambiare i puntatori nei contenitori in modalità debole. |

## Vedi anche

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../)
* Library [Aspose.Page for C++](../../)
