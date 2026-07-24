---
title: "classe System::Net::Http::Headers::HttpHeaderValueCollection"
linktitle: "HttpHeaderValueCollection"
second_title: "Aspose.Page per C++"
description: "classe System::Net::Http::Headers::HttpHeaderValueCollection. Rappresenta la collezione dei valori delle intestazioni. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 800
url: /it/cpp/system.net.http.headers/httpheadervaluecollection/
---
## HttpHeaderValueCollection class


Rappresenta la collezione dei valori delle intestazioni. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
template<typename T>class HttpHeaderValueCollection : public System::Collections::Generic::ICollection<T>
```


| Parametro | Descrizione |
| --- | --- |
| Il | tipo dei valori delle intestazioni rappresentati nella collezione. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(const T\&) override | Aggiunge un elemento alla collezione. |
| [Clear](./clear/)() override | Elimina tutti gli elementi dalla collezione. |
| [Contains](./contains/)(const T\&) const override | Verifica se l'elemento è presente nella collezione. |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int32_t) override | Copia tutti gli elementi della collezione in elementi di un array esistente. |
| [get_Count](./get_count/)() const override | Informazioni RTTI. |
| [get_IsReadOnly](./get_isreadonly/)() | Ottiene un valore che indica se la raccolta corrente è di sola lettura. |
| [get_IsSpecialValueSet](./get_isspecialvalueset/)() | Ottiene un valore che indica se la raccolta corrente contiene un "valore speciale". |
| [GetEnumerator](./getenumerator/)() override | Ottiene l'enumeratore. |
| [GetHeaderStringWithoutSpecial](./getheaderstringwithoutspecial/)() | Restituisce una rappresentazione stringa della raccolta corrente senza un "valore speciale". |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>) | Crea una nuova istanza. |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, Action\<System::SharedPtr\<HttpHeaderValueCollection\<T\>\>, T\>) | Crea una nuova istanza. |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, T) | Crea una nuova istanza. |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, T, Action\<System::SharedPtr\<HttpHeaderValueCollection\<T\>\>, T\>) | Crea una nuova istanza. |
| [ParseAdd](./parseadd/)(String) | Analizza una rappresentazione stringa dell'intestazione e la aggiunge alla raccolta corrente. |
| [Remove](./remove/)(const T\&) override | Elimina l'elemento dalla collezione. |
| [RemoveSpecialValue](./removespecialvalue/)() | Rimuove un "valore speciale". |
| [SetSpecialValue](./setspecialvalue/)() | Imposta un "valore speciale". |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Imposta il n‑esimo argomento del modello come puntatore debole (anziché condiviso). Consente di cambiare i puntatori nei contenitori in modalità debole. |
| [ToString](./tostring/)() const override | Analogo del metodo C# [Object.ToString()](../../system/object/tostring/). Consente la conversione di oggetti personalizzati in stringa. |
| [TryParseAdd](./tryparseadd/)(String) | Tenta di analizzare una rappresentazione stringa dell'intestazione e aggiungerla alla raccolta corrente. |

## Vedi anche

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
