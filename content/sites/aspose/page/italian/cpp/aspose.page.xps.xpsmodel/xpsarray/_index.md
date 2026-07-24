---
title: "Aspose::Page::XPS::XpsModel::XpsArray class"
linktitle: "XpsArray"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsModel::XpsArray class. Classe che incapsula le caratteristiche comuni degli oggetti array del modello XPS in C++."
type: docs
weight: 300
url: /it/cpp/aspose.page.xps.xpsmodel/xpsarray/
---
## XpsArray class


Classe che incapsula le caratteristiche comuni degli oggetti array del modello [XPS](../../aspose.page.xps/).

```cpp
template<typename T>class XpsArray : public Aspose::Page::XPS::XpsModel::XpsObject
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo degli elementi dell'array. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(T) | Aggiunge un nuovo oggetto nell'array. |
| [get_Count](./get_count/)() | Restituisce il numero di elementi. |
| [idx_get](./idx_get/)(int32_t) | Fornisce l'accesso all'elemento dell'array tramite l'indice *i*. |
| [Insert](./insert/)(int32_t, T) | Inserisce un nuovo oggetto nell'array nella posizione specificata. |
| [Remove](./remove/)(T) | Rimuove un oggetto dall'array. |
| [RemoveAt](./removeat/)(int32_t) | Rimuove un oggetto dall'array nella posizione specificata. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Imposta il n‑esimo argomento del modello come puntatore debole (anziché condiviso). Consente di cambiare i puntatori nei contenitori in modalità debole. |

## Vedi anche

* Class [XpsObject](../xpsobject/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
