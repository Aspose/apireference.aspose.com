---
title: "System::Net::Http::Headers::RetryConditionHeaderValue class"
linktitle: "RetryConditionHeaderValue"
second_title: "Aspose.Font per C++"
description: "System::Net::Http::Headers::RetryConditionHeaderValue class. Rappresenta un valore dell'intestazione ''Retry-After''. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2200
url: /it/cpp/system.net.http.headers/retryconditionheadervalue/
---
## RetryConditionHeaderValue class


Rappresenta un valore dell'intestazione 'Retry-After'. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class RetryConditionHeaderValue : public System::ICloneable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Confronta gli oggetti usando la semantica di C# [Object.Equals](../../system/object/equals/). |
| [get_Date](./get_date/)() | Informazioni RTTI. |
| [get_Delta](./get_delta/)() | Restituisce il valore delta. |
| [GetHashCode](./gethashcode/)() const override | Analogo del metodo C# [Object.GetHashCode()](../../system/object/gethashcode/). Consente l'hashing di oggetti personalizzati. |
| static [GetRetryConditionLength](./getretryconditionlength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Converte una stringa passata dall'indice specificato in un'istanza della classe [RetryConditionHeaderValue](./). |
| static [Parse](./parse/)(String) | Converte una stringa passata in un'istanza della classe [RetryConditionHeaderValue](./). |
| [RetryConditionHeaderValue](./retryconditionheadervalue/)(DateTimeOffset) | Crea una nuova istanza. |
| [RetryConditionHeaderValue](./retryconditionheadervalue/)(TimeSpan) | Crea una nuova istanza. |
| [ToString](./tostring/)() const override | Analogo del metodo C# [Object.ToString()](../../system/object/tostring/). Consente la conversione di oggetti personalizzati in stringa. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<RetryConditionHeaderValue\>\&) | Tenta di convertire una stringa passata in un'istanza della classe [RetryConditionHeaderValue](./). |
## Vedi anche

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
