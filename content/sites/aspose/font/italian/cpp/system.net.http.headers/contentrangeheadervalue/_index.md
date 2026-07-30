---
title: "System::Net::Http::Headers::ContentRangeHeaderValue class"
linktitle: "ContentRangeHeaderValue"
second_title: "Aspose.Font per C++"
description: "System::Net::Http::Headers::ContentRangeHeaderValue class. Rappresenta un valore dell'intestazione ''Content-Range''. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 400
url: /it/cpp/system.net.http.headers/contentrangeheadervalue/
---
## ContentRangeHeaderValue class


Rappresenta un valore dell'intestazione 'Content-Range'. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class ContentRangeHeaderValue : public System::ICloneable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t, int64_t, int64_t) | Crea una nuova istanza. |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t) | Crea una nuova istanza. |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t, int64_t) | Crea una nuova istanza. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Confronta gli oggetti usando la semantica di C# [Object.Equals](../../system/object/equals/). |
| [get_From](./get_from/)() | Ottiene una posizione in cui l'invio dei dati deve iniziare. |
| [get_HasLength](./get_haslength/)() const | Ottiene un valore che indica se la lunghezza è specificata per l'intestazione corrente. |
| [get_HasRange](./get_hasrange/)() const | Restituisce un valore che indica se l'intervallo è specificato per l'intestazione corrente. |
| [get_Length](./get_length/)() | Restituisce la lunghezza del corpo dell'entità. |
| [get_To](./get_to/)() | Restituisce una posizione in cui l'invio dei dati deve fermarsi. |
| [get_Unit](./get_unit/)() | Informazioni RTTI. |
| static [GetContentRangeLength](./getcontentrangelength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Converte una stringa passata dalla posizione specificata in un'istanza della classe [ContentRangeHeaderValue](./). |
| [GetHashCode](./gethashcode/)() const override | Analogo del metodo C# [Object.GetHashCode()](../../system/object/gethashcode/). Consente l'hashing di oggetti personalizzati. |
| static [Parse](./parse/)(String) | Converte una stringa passata in un'istanza della classe [ContentRangeHeaderValue](./). |
| [set_Unit](./set_unit/)(String) | Imposta le unità utilizzate nell'intervallo. |
| [ToString](./tostring/)() const override | Analogo del metodo C# [Object.ToString()](../../system/object/tostring/). Consente la conversione di oggetti personalizzati in stringa. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ContentRangeHeaderValue\>\&) | Prova a convertire una stringa passata in un'istanza della classe [ContentRangeHeaderValue](./). |
## Vedi anche

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
