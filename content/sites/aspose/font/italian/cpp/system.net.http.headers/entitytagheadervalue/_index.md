---
title: "System::Net::Http::Headers::EntityTagHeaderValue class"
linktitle: "EntityTagHeaderValue"
second_title: "Aspose.Font per C++"
description: "System::Net::Http::Headers::EntityTagHeaderValue class. Rappresenta un valore dell'intestazione ''Entity-Tag''. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 500
url: /it/cpp/system.net.http.headers/entitytagheadervalue/
---
## EntityTagHeaderValue class


Rappresenta un valore dell'intestazione 'Entity-Tag'. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class EntityTagHeaderValue : public System::ICloneable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [EntityTagHeaderValue](./entitytagheadervalue/)(String) | Crea una nuova istanza. |
| [EntityTagHeaderValue](./entitytagheadervalue/)(String, bool) | Crea una nuova istanza. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Confronta gli oggetti usando la semantica di C# [Object.Equals](../../system/object/equals/). |
| static [get_Any](./get_any/)() | Restituisce un valore dell'intestazione 'ETag'. |
| [get_IsWeak](./get_isweak/)() | Restituisce un valore che indica se l'istanza corrente è un validatore debole. |
| [get_Tag](./get_tag/)() | Informazioni RTTI. |
| static [GetEntityTagLength](./getentitytaglength/)(String, int32_t, System::SharedPtr\<EntityTagHeaderValue\>\&) | Converte una stringa passata dall'indice specificato in un'istanza della classe [EntityTagHeaderValue](./). |
| [GetHashCode](./gethashcode/)() const override | Analogo del metodo C# [Object.GetHashCode()](../../system/object/gethashcode/). Consente l'hashing di oggetti personalizzati. |
| static [Parse](./parse/)(String) | Converte una stringa passata in un'istanza della classe [EntityTagHeaderValue](./). |
| [ToString](./tostring/)() const override | Analogo del metodo C# [Object.ToString()](../../system/object/tostring/). Consente la conversione di oggetti personalizzati in stringa. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<EntityTagHeaderValue\>\&) | Prova a convertire una stringa passata in un'istanza della classe [EntityTagHeaderValue](./). |
## Vedi anche

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
