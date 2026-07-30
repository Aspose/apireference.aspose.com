---
title: "classe System::Net::Http::Headers::StringWithQualityHeaderValue"
linktitle: "StringWithQualityHeaderValue"
second_title: "Aspose.Font per C++"
description: "classe System::Net::Http::Headers::StringWithQualityHeaderValue. Rappresenta un valore con una qualità aggiuntiva di un'intestazione stringa. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject() . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2300
url: /it/cpp/system.net.http.headers/stringwithqualityheadervalue/
---
## StringWithQualityHeaderValue class


Rappresenta un valore con una qualità aggiuntiva di un'intestazione stringa. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class StringWithQualityHeaderValue : public System::ICloneable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Confronta gli oggetti usando la semantica di C# [Object.Equals](../../system/object/equals/). |
| [get_Quality](./get_quality/)() | Restituisce una qualità. |
| [get_Value](./get_value/)() | Informazioni RTTI. |
| [GetHashCode](./gethashcode/)() const override | Analogo del metodo C# [Object.GetHashCode()](../../system/object/gethashcode/). Consente l'hashing di oggetti personalizzati. |
| static [GetStringWithQualityLength](./getstringwithqualitylength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Converte una stringa fornita dall'indice specificato in un'istanza della classe [StringWithQualityHeaderValue](./). |
| static [Parse](./parse/)(String) | Converte una stringa fornita in un'istanza della classe [StringWithQualityHeaderValue](./). |
| [StringWithQualityHeaderValue](./stringwithqualityheadervalue/)(String) | Crea una nuova istanza. |
| [StringWithQualityHeaderValue](./stringwithqualityheadervalue/)(String, double) | Crea una nuova istanza. |
| [ToString](./tostring/)() const override | Analogo del metodo C# [Object.ToString()](../../system/object/tostring/). Consente la conversione di oggetti personalizzati in stringa. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<StringWithQualityHeaderValue\>\&) | Tenta di convertire una stringa fornita in un'istanza della classe [StringWithQualityHeaderValue](./). |
## Vedi anche

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
