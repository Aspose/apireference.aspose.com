---
title: "System::Net::IPEndPoint class"
linktitle: "IPEndPoint"
second_title: "Aspose.Page per C++"
description: "System::Net::IPEndPoint class. Rappresenta un endpoint di rete che contiene un indirizzo IP e una porta. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 2500
url: /it/cpp/system.net/ipendpoint/
---
## IPEndPoint class


Rappresenta un endpoint di rete che contiene un indirizzo IP e una porta. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class IPEndPoint : public System::Net::EndPoint
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Create](./create/)(System::SharedPtr\<SocketAddress\>) override | Crea una nuova istanza della classe [EndPoint](../endpoint/) usando l'indirizzo socket specificato. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Confronta gli oggetti usando la semantica di C# [Object.Equals](../../system/object/equals/). |
| [get_Address](./get_address/)() | Restituisce l'indirizzo dell'endpoint. |
| [get_AddressFamily](./get_addressfamily/)() override | Informazioni RTTI. |
| [get_Port](./get_port/)() | Restituisce il numero della porta. |
| [GetHashCode](./gethashcode/)() const override | Analogo del metodo C# [Object.GetHashCode()](../../system/object/gethashcode/). Consente l'hashing di oggetti personalizzati. |
| [GetImpl](./getimpl/)() const override | Restituisce un puntatore all'implementazione. |
| [IPEndPoint](./ipendpoint/)(int64_t, int32_t) | Crea una nuova istanza. |
| [IPEndPoint](./ipendpoint/)(System::SharedPtr\<IPAddress\>, int32_t) | Crea una nuova istanza. |
| [set_Address](./set_address/)(System::SharedPtr\<IPAddress\>) | Imposta l'indirizzo dell'endpoint. |
| [set_Port](./set_port/)(int32_t) | Imposta il numero della porta. |
| [ToString](./tostring/)() const override | Analogo del metodo C# [Object.ToString()](../../system/object/tostring/). Consente la conversione di oggetti personalizzati in stringa. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [Any](./any/) | L'endpoint per qualsiasi indirizzo IPv4 e qualsiasi porta. |
| static [AnyPort](./anyport/) | Un valore che indica se può essere usata qualsiasi porta. |
| static [IPv6Any](./ipv6any/) | L'endpoint per qualsiasi indirizzo IPv6 e qualsiasi porta. |
| static [MaxPort](./maxport/) | Il numero massimo di porta. |
| static [MinPort](./minport/) | Informazioni RTTI. |
## Vedi anche

* Class [EndPoint](../endpoint/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
