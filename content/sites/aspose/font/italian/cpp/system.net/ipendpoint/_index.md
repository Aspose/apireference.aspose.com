---
title: "System::Net::IPEndPoint classe"
linktitle: "IPEndPoint"
second_title: "Aspose.Font per C++"
description: "System::Net::IPEndPoint classe. Rappresenta un endpoint di rete che contiene un indirizzo IP e una porta. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2500
url: /it/cpp/system.net/ipendpoint/
---
## IPEndPoint class


Rappresenta un endpoint di rete che contiene un indirizzo IP e una porta. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare questo puntatore per passarlo alle funzioni come argomento.

```cpp
class IPEndPoint : public System::Net::EndPoint
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Create](./create/)(System::SharedPtr\<SocketAddress\>) override | Crea una nuova istanza della classe [EndPoint](../endpoint/) utilizzando l'indirizzo socket specificato. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Confronta gli oggetti usando la semantica di C# [Object.Equals](../../system/object/equals/). |
| [get_Address](./get_address/)() | Ottiene l'indirizzo dell'endpoint. |
| [get_AddressFamily](./get_addressfamily/)() override | Informazioni RTTI. |
| [get_Port](./get_port/)() | Ottiene il numero della porta. |
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
| static [AnyPort](./anyport/) | Un valore che indica se è possibile utilizzare qualsiasi porta. |
| static [IPv6Any](./ipv6any/) | L'endpoint per qualsiasi indirizzo IPv6 e qualsiasi porta. |
| static [MaxPort](./maxport/) | Il numero massimo di porta. |
| static [MinPort](./minport/) | Informazioni RTTI. |
## Vedi anche

* Class [EndPoint](../endpoint/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
