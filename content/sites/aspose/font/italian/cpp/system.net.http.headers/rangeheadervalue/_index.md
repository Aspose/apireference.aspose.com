---
title: "System::Net::Http::Headers::RangeHeaderValue class"
linktitle: "RangeHeaderValue"
second_title: "Aspose.Font per C++"
description: "System::Net::Http::Headers::RangeHeaderValue class. Rappresenta un valore dell'intestazione ''Range''. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2000
url: /it/cpp/system.net.http.headers/rangeheadervalue/
---
## RangeHeaderValue class


Rappresenta un valore dell'intestazione 'Range'. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class RangeHeaderValue : public System::ICloneable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Confronta gli oggetti usando la semantica di C# [Object.Equals](../../system/object/equals/). |
| [get_Ranges](./get_ranges/)() | Restituisce la raccolta degli intervalli. |
| [get_Unit](./get_unit/)() | Informazioni RTTI. |
| [GetHashCode](./gethashcode/)() const override | Analogo del metodo C# [Object.GetHashCode()](../../system/object/gethashcode/). Consente l'hashing di oggetti personalizzati. |
| static [GetRangeLength](./getrangelength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Converte una stringa passata dall'indice specificato in un'istanza della classe [RangeHeaderValue](./). |
| static [Parse](./parse/)(String) | Converte una stringa passata in un'istanza della classe [RangeHeaderValue](./). |
| [RangeHeaderValue](./rangeheadervalue/)() | Crea una nuova istanza. |
| [RangeHeaderValue](./rangeheadervalue/)(Nullable\<int64_t\>, Nullable\<int64_t\>) | Crea una nuova istanza. |
| [set_Unit](./set_unit/)(String) | Imposta un'unità. |
| [ToString](./tostring/)() const override | Analogo del metodo C# [Object.ToString()](../../system/object/tostring/). Consente la conversione di oggetti personalizzati in stringa. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<RangeHeaderValue\>\&) | Prova a convertire una stringa passata in un'istanza della classe [RangeHeaderValue](./). |
## Vedi anche

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
