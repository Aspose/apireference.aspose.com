---
title: "Classe System::Net::Http::Headers::WarningHeaderValue"
linktitle: "WarningHeaderValue"
second_title: "Aspose.Font per C++"
description: "Classe System::Net::Http::Headers::WarningHeaderValue. Rappresenta un valore dell'intestazione ''Warning''. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 2700
url: /it/cpp/system.net.http.headers/warningheadervalue/
---
## WarningHeaderValue class


Rappresenta un valore dell'intestazione 'Warning'. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare questo puntatore per passarla alle funzioni come argomento.

```cpp
class WarningHeaderValue : public System::ICloneable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Confronta gli oggetti usando la semantica di C# [Object.Equals](../../system/object/equals/). |
| [get_Agent](./get_agent/)() | Restituisce l'host associato all'avviso. |
| [get_Code](./get_code/)() | Informazioni RTTI. |
| [get_Date](./get_date/)() | Restituisce la data e ora dell'avviso. |
| [get_Text](./get_text/)() | Restituisce il testo dell'avviso. |
| [GetHashCode](./gethashcode/)() const override | Analogo del metodo C# [Object.GetHashCode()](../../system/object/gethashcode/). Consente l'hashing di oggetti personalizzati. |
| static [GetWarningLength](./getwarninglength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Converte una stringa passata dall'indice specificato in un'istanza della classe [WarningHeaderValue](./). |
| static [Parse](./parse/)(String) | Converte una stringa passata in un'istanza della classe [WarningHeaderValue](./). |
| [ToString](./tostring/)() const override | Analogo del metodo C# [Object.ToString()](../../system/object/tostring/). Consente la conversione di oggetti personalizzati in stringa. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<WarningHeaderValue\>\&) | Tenta di convertire una stringa passata in un'istanza della classe [WarningHeaderValue](./). |
| [WarningHeaderValue](./warningheadervalue/)(int32_t, String, String) | Crea una nuova istanza. |
| [WarningHeaderValue](./warningheadervalue/)(int32_t, String, String, DateTimeOffset) | Crea una nuova istanza. |
## Vedi anche

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
