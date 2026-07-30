---
title: "Classe System::Net::Http::Headers::HttpHeaders"
linktitle: "HttpHeaders"
second_title: "Aspose.Font per C++"
description: "Classe System::Net::Http::Headers::HttpHeaders. La raccolta degli header HTTP. Gli oggetti di questa classe devono essere allocati solo tramite la funzione System::MakeObject() . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza tale puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 700
url: /it/cpp/system.net.http.headers/httpheaders/
---
## HttpHeaders class


La raccolta degli header HTTP. Gli oggetti di questa classe devono essere allocati solo tramite la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza tale puntatore per passarla alle funzioni come argomento.

```cpp
class HttpHeaders : public System::Collections::Generic::IEnumerable<System::Collections::Generic::KeyValuePair<System::String, System::SharedPtr<System::Collections::Generic::IEnumerable<System::String>>>>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(String, System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>) | Convalida una nuova coppia nome-valori e la aggiunge alla raccolta corrente. |
| [Add](./add/)(String, String) | Convalida una nuova coppia nome-valore e la aggiunge alla raccolta corrente. |
| virtual [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) | Concatena l'istanza della classe HttpHeaders specificata con quella corrente. |
| [AddParsedValue](./addparsedvalue/)(String, System::SharedPtr\<Object\>) | Ottiene un'intestazione con il nome specificato e aggiunge un valore analizzato all'intestazione. |
| [Clear](./clear/)() | Rimuove tutti gli elementi dalla raccolta. |
| [Contains](./contains/)(String) |  |
| [ContainsParsedValue](./containsparsedvalue/)(String, System::SharedPtr\<Object\>) | Verifica se l'intestazione contiene il valore specificato. |
| [GetEnumerator](./getenumerator/)() override | Ottiene l'enumeratore. |
| [GetHeaderString](./getheaderstring/)(String) | Restituisce una rappresentazione stringa dei valori per il nome dell'intestazione specificato. |
| [GetHeaderString](./getheaderstring/)(String, System::SharedPtr\<Object\>) | Restituisce una rappresentazione stringa dei valori per il nome dell'intestazione specificato. |
| [GetHeaderStrings](./getheaderstrings/)() | Restituisce una raccolta che contiene rappresentazioni stringa dei valori delle intestazioni. |
| [GetParsedValues](./getparsedvalues/)(String) | Restituisce i valori analizzati per il nome dell'intestazione specificato. |
| [GetValues](./getvalues/)(String) | Restituisce i valori corrispondenti per il nome specificato. |
| static [ParsedValuesAsList](./parsedvaluesaslist/)(const System::SharedPtr\<Object\>) | Converte i valori analizzati in un elenco. |
| [Remove](./remove/)(String) | Tenta di rimuovere un elemento con il nome specificato. |
| [RemoveParsedValue](./removeparsedvalue/)(String, System::SharedPtr\<Object\>) | Ottiene un'intestazione con il nome specificato e rimuove un valore analizzato dall'intestazione. |
| [SetConfiguration](./setconfiguration/)(System::SharedPtr\<Collections::Generic::Dictionary\<String, System::SharedPtr\<HttpHeaderParser\>\>\>, System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) |  |
| [SetOrRemoveParsedValue](./setorremoveparsedvalue/)(String, System::SharedPtr\<Object\>) | Ottiene un'intestazione con il nome specificato e imposta o rimuove il suo valore. Il valore dell'intestazione verrà rimosso quando il parametro 'value' è nullptr, altrimenti verrà impostato un valore analizzato. |
| [SetParsedValue](./setparsedvalue/)(String, System::SharedPtr\<Object\>) | Ottiene un'intestazione con il nome specificato e imposta un valore analizzato sull'intestazione. |
| [ToString](./tostring/)() const override | Analogo del metodo C# [Object.ToString()](../../system/object/tostring/). Consente la conversione di oggetti personalizzati in stringa. |
| [TryAddWithoutValidation](./tryaddwithoutvalidation/)(String, String) | Tenta di aggiungere una nuova coppia nome-valore alla raccolta corrente. |
| [TryAddWithoutValidation](./tryaddwithoutvalidation/)(String, System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>) | Aggiunge una raccolta di coppie nome-valore alla raccolta corrente. |
| [TryGetValues](./trygetvalues/)(String, System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&) | Tenta di ottenere i valori corrispondenti per il nome specificato. |
| [TryParseAndAddValue](./tryparseandaddvalue/)(String, String) | Tenta di analizzare il valore specificato e aggiungerlo ai valori dell'intestazione. |
## Vedi anche

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
