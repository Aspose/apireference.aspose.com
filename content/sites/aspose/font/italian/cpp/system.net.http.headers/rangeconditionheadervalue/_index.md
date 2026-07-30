---
title: "System::Net::Http::Headers::RangeConditionHeaderValue classe"
linktitle: "RangeConditionHeaderValue"
second_title: "Aspose.Font per C++"
description: "System::Net::Http::Headers::RangeConditionHeaderValue class. Rappresenta un valore dell'intestazione ''If-Range''. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1900
url: /it/cpp/system.net.http.headers/rangeconditionheadervalue/
---
## RangeConditionHeaderValue class


Rappresenta un valore dell'intestazione 'If-Range'. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza tale puntatore per passarlo alle funzioni come argomento.

```cpp
class RangeConditionHeaderValue : public System::ICloneable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Confronta gli oggetti usando la semantica di C# [Object.Equals](../../system/object/equals/). |
| [get_Date](./get_date/)() | Informazioni RTTI. |
| [get_EntityTag](./get_entitytag/)() | Restituisce un valore di intestazione 'ETag'. |
| [GetHashCode](./gethashcode/)() const override | Analogo del metodo C# [Object.GetHashCode()](../../system/object/gethashcode/). Consente l'hashing di oggetti personalizzati. |
| static [GetRangeConditionLength](./getrangeconditionlength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Converte una stringa passata dall'indice specificato in un'istanza della classe [RangeConditionHeaderValue](./). |
| static [Parse](./parse/)(String) | Converte una stringa passata in un'istanza della classe [RangeConditionHeaderValue](./). |
| [RangeConditionHeaderValue](./rangeconditionheadervalue/)(DateTimeOffset) | Crea una nuova istanza. |
| [RangeConditionHeaderValue](./rangeconditionheadervalue/)(System::SharedPtr\<EntityTagHeaderValue\>) | Crea una nuova istanza. |
| [RangeConditionHeaderValue](./rangeconditionheadervalue/)(String) | Crea una nuova istanza. |
| [ToString](./tostring/)() const override | Analogo del metodo C# [Object.ToString()](../../system/object/tostring/). Consente la conversione di oggetti personalizzati in stringa. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<RangeConditionHeaderValue\>\&) | Prova a convertire una stringa passata in un'istanza della classe [RangeConditionHeaderValue](./). |
## Vedi anche

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
