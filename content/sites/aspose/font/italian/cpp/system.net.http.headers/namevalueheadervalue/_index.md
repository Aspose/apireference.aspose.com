---
title: "System::Net::Http::Headers::NameValueHeaderValue class"
linktitle: "NameValueHeaderValue"
second_title: "Aspose.Font per C++"
description: "Classe System::Net::Http::Headers::NameValueHeaderValue. Rappresenta una coppia chiave/valore da utilizzare nelle intestazioni. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 1400
url: /it/cpp/system.net.http.headers/namevalueheadervalue/
---
## NameValueHeaderValue class


Rappresenta una coppia chiave/valore da utilizzare nelle intestazioni. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarla alle funzioni come argomento.

```cpp
class NameValueHeaderValue : public virtual System::ICloneable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Confronta gli oggetti usando la semantica di C# [Object.Equals](../../system/object/equals/). |
| static [Find](./find/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, String) | Trova l'istanza della classe NameValueHeaderValue in una collezione per il nome specificato. |
| [get_Name](./get_name/)() | Restituisce il nome dell'istanza corrente. |
| [get_Value](./get_value/)() | Ottiene il valore dell'istanza corrente. |
| [GetHashCode](./gethashcode/)() const override | Analogo del metodo C# [Object.GetHashCode()](../../system/object/gethashcode/). Consente l'hashing di oggetti personalizzati. |
| static [GetHashCode](./gethashcode/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>) | Restituisce un codice hash di tutti gli elementi della collezione. |
| static [GetNameValueLength](./getnamevaluelength/)(String, int32_t, System::SharedPtr\<NameValueHeaderValue\>\&) | Converte una stringa passata dall'indice specificato in un'istanza della classe [NameValueHeaderValue](./). |
| static [GetNameValueLength](./getnamevaluelength/)(String, int32_t, HeaderFunc\<System::SharedPtr\<NameValueHeaderValue\>\>, System::SharedPtr\<NameValueHeaderValue\>\&) | Converte una stringa passata dall'indice specificato in un'istanza della classe [NameValueHeaderValue](./). |
| static [GetNameValueListLength](./getnamevaluelistlength/)(String, int32_t, char16_t, System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>) | Converte una stringa passata dall'indice specificato nella raccolta delle istanze della classe NameValueHeaderValue e restituisce la lunghezza di una sottostringa analizzata. |
| static [GetValueLength](./getvaluelength/)(String, int32_t) | Restituisce la lunghezza di un valore dall'indice specificato. |
| [NameValueHeaderValue](./namevalueheadervalue/)() | Crea una nuova istanza. |
| [NameValueHeaderValue](./namevalueheadervalue/)(String) | Crea una nuova istanza. |
| [NameValueHeaderValue](./namevalueheadervalue/)(String, String) | Crea una nuova istanza. |
| static [Parse](./parse/)(String) | Converte una stringa passata in un'istanza della classe [NameValueHeaderValue](./). |
| [set_Value](./set_value/)(String) | Imposta un valore dell'istanza corrente. |
| [ToString](./tostring/)() const override | Analogo del metodo C# [Object.ToString()](../../system/object/tostring/). Consente la conversione di oggetti personalizzati in stringa. |
| static [ToString](./tostring/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, char16_t, bool, System::SharedPtr\<Text::StringBuilder\>) | Restituisce una rappresentazione stringa della raccolta delle istanze della classe NameValueHeaderValue. |
| static [ToString](./tostring/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, char16_t, bool) | Restituisce una rappresentazione stringa della raccolta delle istanze della classe NameValueHeaderValue. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<NameValueHeaderValue\>\&) | Prova a convertire una stringa passata in un'istanza della classe [NameValueHeaderValue](./). |
## Vedi anche

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
