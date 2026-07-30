---
title: "System::Net::DnsEndPoint classe"
linktitle: "DnsEndPoint"
second_title: "Aspose.Font per C++"
description: "Classe System::Net::DnsEndPoint. Contiene le informazioni utilizzate dall'applicazione per connettersi al servizio. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 800
url: /it/cpp/system.net/dnsendpoint/
---
## DnsEndPoint class


Contiene le informazioni utilizzate dall'applicazione per connettersi al servizio. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class DnsEndPoint : public System::Net::EndPoint
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [DnsEndPoint](./dnsendpoint/)(String, int32_t) | Crea una nuova istanza. |
| [DnsEndPoint](./dnsendpoint/)(String, int32_t, System::Net::Sockets::AddressFamily) | Crea una nuova istanza. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Confronta gli oggetti usando la semantica di C# [Object.Equals](../../system/object/equals/). |
| [get_AddressFamily](./get_addressfamily/)() override | Informazioni RTTI. |
| [get_Host](./get_host/)() | Informazioni RTTI. |
| [get_Port](./get_port/)() | Restituisce il numero di porta. |
| [GetHashCode](./gethashcode/)() const override | Analogo del metodo C# [Object.GetHashCode()](../../system/object/gethashcode/). Consente l'hashing di oggetti personalizzati. |
| [ToString](./tostring/)() const override | Analogo del metodo C# [Object.ToString()](../../system/object/tostring/). Consente la conversione di oggetti personalizzati in stringa. |
## Vedi anche

* Class [EndPoint](../endpoint/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
