---
title: "System::Net::Http::Headers::TransferCodingHeaderValue classe"
linktitle: "TransferCodingHeaderValue"
second_title: "Aspose.Font per C++"
description: "System::Net::Http::Headers::TransferCodingHeaderValue classe. Rappresenta un valore dell'intestazione ''Accept-Encoding''. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e usare questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 2400
url: /it/cpp/system.net.http.headers/transfercodingheadervalue/
---
## TransferCodingHeaderValue class


Rappresenta un valore dell'intestazione 'Accept-Encoding'. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usare questo puntatore per passarla alle funzioni come argomento.

```cpp
class TransferCodingHeaderValue : public virtual System::ICloneable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Confronta gli oggetti usando la semantica di C# [Object.Equals](../../system/object/equals/). |
| [get_Parameters](./get_parameters/)() | Restituisce i parametri. |
| [get_Value](./get_value/)() | Informazioni RTTI. |
| [GetHashCode](./gethashcode/)() const override | Analogo del metodo C# [Object.GetHashCode()](../../system/object/gethashcode/). Consente l'hashing di oggetti personalizzati. |
| static [GetTransferCodingLength](./gettransfercodinglength/)(String, int32_t, const HeaderFunc\<System::SharedPtr\<TransferCodingHeaderValue\>\>\&, System::SharedPtr\<TransferCodingHeaderValue\>\&) | Converte una stringa passata dall'indice specificato in un'istanza della classe [TransferCodingHeaderValue](./). |
| static [Parse](./parse/)(String) | Converte una stringa passata in un'istanza della classe [TransferCodingHeaderValue](./). |
| [ToString](./tostring/)() const override | Analogo del metodo C# [Object.ToString()](../../system/object/tostring/). Consente la conversione di oggetti personalizzati in stringa. |
| [TransferCodingHeaderValue](./transfercodingheadervalue/)() | Crea una nuova istanza. |
| [TransferCodingHeaderValue](./transfercodingheadervalue/)(String) | Crea una nuova istanza. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<TransferCodingHeaderValue\>\&) | Tenta di convertire una stringa passata in un'istanza della classe [TransferCodingHeaderValue](./). |
## Vedi anche

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
