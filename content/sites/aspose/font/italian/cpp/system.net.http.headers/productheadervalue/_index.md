---
title: "System::Net::Http::Headers::ProductHeaderValue classe"
linktitle: "ProductHeaderValue"
second_title: "Aspose.Font per C++"
description: "System::Net::Http::Headers::ProductHeaderValue classe. Rappresenta un token di prodotto in un valore dell'intestazione ''User-Agent''. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject() . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1700
url: /it/cpp/system.net.http.headers/productheadervalue/
---
## ProductHeaderValue class


Rappresenta un token di prodotto in un valore dell'intestazione 'User-Agent'. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class ProductHeaderValue : public System::ICloneable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Confronta gli oggetti usando la semantica di C# [Object.Equals](../../system/object/equals/). |
| [get_Name](./get_name/)() | Informazioni RTTI. |
| [get_Version](./get_version/)() | Restituisce la versione del token di prodotto. |
| [GetHashCode](./gethashcode/)() const override | Analogo del metodo C# [Object.GetHashCode()](../../system/object/gethashcode/). Consente l'hashing di oggetti personalizzati. |
| static [GetProductLength](./getproductlength/)(String, int32_t, System::SharedPtr\<ProductHeaderValue\>\&) | Converte una stringa fornita dall'indice specificato in un'istanza della classe [ProductHeaderValue](./). |
| static [Parse](./parse/)(String) | Converte una stringa fornita in un'istanza della classe [ProductHeaderValue](./). |
| [ProductHeaderValue](./productheadervalue/)(String) | Crea una nuova istanza. |
| [ProductHeaderValue](./productheadervalue/)(String, String) | Crea una nuova istanza. |
| [ToString](./tostring/)() const override | Analogo del metodo C# [Object.ToString()](../../system/object/tostring/). Consente la conversione di oggetti personalizzati in stringa. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ProductHeaderValue\>\&) | Tenta di convertire una stringa fornita in un'istanza della classe [ProductHeaderValue](./). |
## Vedi anche

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
