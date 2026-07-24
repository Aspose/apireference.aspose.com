---
title: "classe System::Net::Http::Headers::ViaHeaderValue"
linktitle: "ViaHeaderValue"
second_title: "Aspose.Page per C++"
description: "classe System::Net::Http::Headers::ViaHeaderValue. Rappresenta un valore dell'intestazione ''Via''. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2600
url: /it/cpp/system.net.http.headers/viaheadervalue/
---
## ViaHeaderValue class


Rappresenta un valore dell'intestazione 'Via'. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class ViaHeaderValue : public System::ICloneable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Confronta gli oggetti usando la semantica di C# [Object.Equals](../../system/object/equals/). |
| [get_Comment](./get_comment/)() | Restituisce il commento dal valore dell'intestazione 'Via'. |
| [get_ProtocolName](./get_protocolname/)() | Informazioni RTTI. |
| [get_ProtocolVersion](./get_protocolversion/)() | Restituisce la versione del protocollo dal valore dell'intestazione 'Via'. |
| [get_ReceivedBy](./get_receivedby/)() | Restituisce l'host e la porta a cui è stata ricevuta la richiesta o la risposta. |
| [GetHashCode](./gethashcode/)() const override | Analogo del metodo C# [Object.GetHashCode()](../../system/object/gethashcode/). Consente l'hashing di oggetti personalizzati. |
| static [GetViaLength](./getvialength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Converte una stringa passata dall'indice specificato in un'istanza della classe [ViaHeaderValue](./). |
| static [Parse](./parse/)(String) | Converte una stringa passata in un'istanza della classe [ViaHeaderValue](./). |
| [ToString](./tostring/)() const override | Analogo del metodo C# [Object.ToString()](../../system/object/tostring/). Consente la conversione di oggetti personalizzati in stringa. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ViaHeaderValue\>\&) | Tenta di convertire una stringa passata in un'istanza della classe [ViaHeaderValue](./). |
| [ViaHeaderValue](./viaheadervalue/)(String, String) | Crea una nuova istanza. |
| [ViaHeaderValue](./viaheadervalue/)(String, String, String) | Crea una nuova istanza. |
| [ViaHeaderValue](./viaheadervalue/)(String, String, String, String) | Crea una nuova istanza. |
## Vedi anche

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
