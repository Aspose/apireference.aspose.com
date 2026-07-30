---
title: "System::Net::Http::Headers::RangeItemHeaderValue classe"
linktitle: "RangeItemHeaderValue"
second_title: "Aspose.Font per C++"
description: "System::Net::Http::Headers::RangeItemHeaderValue class. Rappresenta un intervallo di byte in un valore dell'intestazione ''Range''. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2100
url: /it/cpp/system.net.http.headers/rangeitemheadervalue/
---
## RangeItemHeaderValue class


Rappresenta un intervallo di byte in un valore dell'intestazione 'Range'. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza tale puntatore per passarlo alle funzioni come argomento.

```cpp
class RangeItemHeaderValue : public System::ICloneable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Confronta gli oggetti usando la semantica di C# [Object.Equals](../../system/object/equals/). |
| [get_From](./get_from/)() | Informazioni RTTI. |
| [get_To](./get_to/)() | Restituisce una posizione in cui l'invio dei dati deve fermarsi. |
| [GetHashCode](./gethashcode/)() const override | Analogo del metodo C# [Object.GetHashCode()](../../system/object/gethashcode/). Consente l'hashing di oggetti personalizzati. |
| static [GetRangeItemLength](./getrangeitemlength/)(String, int32_t, System::SharedPtr\<RangeItemHeaderValue\>\&) | Converte una stringa passata dall'indice specificato in un'istanza della classe [RangeItemHeaderValue](./). |
| static [GetRangeItemListLength](./getrangeitemlistlength/)(String, int32_t, System::SharedPtr\<Collections::Generic::ICollection\<System::SharedPtr\<RangeItemHeaderValue\>\>\>) | Converte una stringa passata dalla posizione specificata nella collezione di istanze della classe RangeItemHeaderValue. |
| [RangeItemHeaderValue](./rangeitemheadervalue/)(Nullable\<int64_t\>, Nullable\<int64_t\>) | Crea una nuova istanza. |
| [ToString](./tostring/)() const override | Analogo del metodo C# [Object.ToString()](../../system/object/tostring/). Consente la conversione di oggetti personalizzati in stringa. |
## Vedi anche

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
