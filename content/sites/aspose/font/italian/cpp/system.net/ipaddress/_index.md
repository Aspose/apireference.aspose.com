---
title: "Classe System::Net::IPAddress"
linktitle: "IPAddress"
second_title: "Aspose.Font per C++"
description: "Classe System::Net::IPAddress. Rappresenta l'indirizzo IP. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject() . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2400
url: /it/cpp/system.net/ipaddress/
---
## IPAddress class


Rappresenta l'indirizzo IP. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class IPAddress : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Confronta gli oggetti usando la semantica di C# [Object.Equals](../../system/object/equals/). |
| [get_AddressFamily](./get_addressfamily/)() | Restituisce la famiglia di indirizzi. |
| [get_IsIPv4MappedToIPv6](./get_isipv4mappedtoipv6/)() | Restituisce un valore che indica se l'indirizzo è un indirizzo IPv4 e viene mappato a un indirizzo IPv6. |
| [get_IsIPv6LinkLocal](./get_isipv6linklocal/)() | Restituisce un valore che indica se l'indirizzo è un indirizzo link-local IPv6. |
| [get_IsIPv6Multicast](./get_isipv6multicast/)() | Restituisce un valore che indica se l'indirizzo è un indirizzo multicast IPv6 globale. |
| [get_IsIPv6SiteLocal](./get_isipv6sitelocal/)() | Restituisce un valore che indica se l'indirizzo è un indirizzo site-local IPv6. |
| [get_IsIPv6Teredo](./get_isipv6teredo/)() | Restituisce un valore che indica se l'indirizzo è un indirizzo IPv6 Teredo. |
| [get_ScopeId](./get_scopeid/)() | Ottiene l'identificatore di ambito dell'indirizzo IPv6. |
| [GetAddressBytes](./getaddressbytes/)() | Restituisce un array di byte dell'indirizzo IP. |
| [GetHashCode](./gethashcode/)() const override | Analogo del metodo C# [Object.GetHashCode()](../../system/object/gethashcode/). Consente l'hashing di oggetti personalizzati. |
| [GetImpl](./getimpl/)() const | Restituisce un puntatore all'implementazione. |
| static [HostToNetworkOrder](./hosttonetworkorder/)(int64_t) | Converte l'ordine dei byte dell'host specificato nell'ordine dei byte di rete corrispondente. |
| static [HostToNetworkOrder](./hosttonetworkorder/)(int32_t) | Converte l'ordine dei byte dell'host specificato nell'ordine dei byte di rete corrispondente. |
| static [HostToNetworkOrder](./hosttonetworkorder/)(int16_t) | Converte l'ordine dei byte dell'host specificato nell'ordine dei byte di rete corrispondente. |
| [IPAddress](./ipaddress/)(int64_t) | Crea una nuova istanza. |
| [IPAddress](./ipaddress/)(System::ArrayPtr\<uint8_t\>, int64_t) | Crea una nuova istanza. |
| [IPAddress](./ipaddress/)(System::ArrayPtr\<uint8_t\>) | Crea una nuova istanza. |
| [IPAddress](./ipaddress/)() | Crea una nuova istanza. |
| static [IsLoopback](./isloopback/)(System::SharedPtr\<IPAddress\>) | Restituisce un valore che indica se l'indirizzo specificato è un indirizzo di loopback. |
| [MapToIPv4](./maptoipv4/)() | Mappa l'indirizzo all'indirizzo IPv4. |
| [MapToIPv6](./maptoipv6/)() | Mappa l'indirizzo all'indirizzo IPv6. |
| static [NetworkToHostOrder](./networktohostorder/)(int64_t) | Converte l'ordine dei byte di rete specificato nell'ordine dei byte dell'host corrispondente. |
| static [NetworkToHostOrder](./networktohostorder/)(int32_t) | Converte l'ordine dei byte di rete specificato nell'ordine dei byte dell'host corrispondente. |
| static [NetworkToHostOrder](./networktohostorder/)(int16_t) | Converte l'ordine dei byte di rete specificato nell'ordine dei byte dell'host corrispondente. |
| static [Parse](./parse/)(String) | Converte una stringa passata in un'istanza della classe [IPAddress](./). |
| [set_ScopeId](./set_scopeid/)(int64_t) | Imposta l'identificatore di ambito dell'indirizzo IPv6. |
| [SetImpl](./setimpl/)(ImplPtr) | Imposta un puntatore all'implementazione. |
| [ToString](./tostring/)() const override | Analogo del metodo C# [Object.ToString()](../../system/object/tostring/). Consente la conversione di oggetti personalizzati in stringa. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<IPAddress\>\&) | Prova a convertire una stringa passata in un'istanza della classe [IPAddress](./). |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [Any](./any/) | Informazioni RTTI. |
| static [Broadcast](./broadcast/) | L'indirizzo di broadcast IPv4. |
| static [IPv6Any](./ipv6any/) | L'indirizzo IPv6 che indica se il server deve ascoltare tutte le interfacce di rete. |
| static [IPv6Loopback](./ipv6loopback/) | L'indirizzo di loopback IPv6. |
| static [IPv6None](./ipv6none/) | L'indirizzo IPv6 che indica se il server non deve ascoltare alcuna interfaccia di rete. |
| static [Loopback](./loopback/) | L'indirizzo di loopback IPv4. |
| static [None](./none/) | L'indirizzo IPv4 che indica se il server non deve ascoltare alcuna interfaccia di rete. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [ImplPtr](./implptr/) | Un puntatore al tipo di implementazione. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
