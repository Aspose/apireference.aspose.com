---
title: "System::Net::Http::Headers::HttpHeaderValueCollection classe"
linktitle: "HttpHeaderValueCollection"
second_title: "Aspose.Font per C++"
description: "System::Net::Http::Headers::HttpHeaderValueCollection classe. Rappresenta la collezione dei valori delle intestazioni. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 800
url: /it/cpp/system.net.http.headers/httpheadervaluecollection/
---
## HttpHeaderValueCollection class


Rappresenta la collezione dei valori delle intestazioni. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

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
| [get_IsReadOnly](./get_isreadonly/)() | Ottiene un valore che indica se la collezione corrente è di sola lettura. |
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
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Imposta il n‑esimo argomento del template a un puntatore debole (invece di condiviso). Consente di passare i puntatori nei contenitori alla modalità debole. |
| [ToString](./tostring/)() const override | Analogo del metodo C# [Object.ToString()](../../system/object/tostring/). Consente la conversione di oggetti personalizzati in stringa. |
| [TryParseAdd](./tryparseadd/)(String) | Tenta di analizzare una rappresentazione stringa dell'intestazione e aggiungerla alla raccolta corrente. |

## Vedi anche

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
