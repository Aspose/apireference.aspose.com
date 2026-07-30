---
title: "Classe System::Net::Http::Headers::NameValueWithParametersHeaderValue"
linktitle: "NameValueWithParametersHeaderValue"
second_title: "Aspose.Font per C++"
description: "Classe System::Net::Http::Headers::NameValueWithParametersHeaderValue. Rappresenta una coppia chiave/valore con parametri da utilizzare negli header. Gli oggetti di questa classe devono essere allocati solo tramite la funzione System::MakeObject() . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza tale puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 1500
url: /it/cpp/system.net.http.headers/namevaluewithparametersheadervalue/
---
## NameValueWithParametersHeaderValue class


Rappresenta una coppia chiave/valore con parametri da utilizzare negli header. Gli oggetti di questa classe devono essere allocati solo tramite la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza tale puntatore per passarla alle funzioni come argomento.

```cpp
class NameValueWithParametersHeaderValue : public System::Net::Http::Headers::NameValueHeaderValue
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Confronta gli oggetti usando la semantica di C# [Object.Equals](../../system/object/equals/). |
| [get_Parameters](./get_parameters/)() | Informazioni RTTI. |
| [GetHashCode](./gethashcode/)() const override | Analogo del metodo C# [Object.GetHashCode()](../../system/object/gethashcode/). Consente l'hashing di oggetti personalizzati. |
| static [GetNameValueWithParametersLength](./getnamevaluewithparameterslength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Converte una stringa fornita dall'indice specificato in un'istanza della classe [NameValueWithParametersHeaderValue](./). |
| [NameValueWithParametersHeaderValue](./namevaluewithparametersheadervalue/)(String) | Crea una nuova istanza. |
| [NameValueWithParametersHeaderValue](./namevaluewithparametersheadervalue/)(String, String) | Crea una nuova istanza. |
| [NameValueWithParametersHeaderValue](./namevaluewithparametersheadervalue/)() | Crea una nuova istanza. |
| static [Parse](./parse/)(String) | Converte una stringa fornita in un'istanza della classe [NameValueWithParametersHeaderValue](./). |
| [ToString](./tostring/)() const override | Analogo del metodo C# [Object.ToString()](../../system/object/tostring/). Consente la conversione di oggetti personalizzati in stringa. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<NameValueWithParametersHeaderValue\>\&) | Tenta di convertire una stringa fornita in un'istanza della classe [NameValueWithParametersHeaderValue](./). |
## Vedi anche

* Class [NameValueHeaderValue](../namevalueheadervalue/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
