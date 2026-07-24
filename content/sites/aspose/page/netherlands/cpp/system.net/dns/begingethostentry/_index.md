---
title: "System::Net::Dns::BeginGetHostEntry methode"
linktitle: "BeginGetHostEntry"
second_title: "Aspose.Page voor C++"
description: "System::Net::Dns::BeginGetHostEntry methode. Initialiseert een asynchrone bewerking om een nieuw IPHostEntry-class instance te maken met de opgegeven string die een hostnaam of IP-adres bevat in C++."
type: docs
weight: 300
url: /nl/cpp/system.net/dns/begingethostentry/
---
## Dns::BeginGetHostEntry(String, AsyncCallback, System::SharedPtr\<Object\>) method


Initieert een asynchrone bewerking om een nieuw IPHostEntry-class‑instance te maken met de opgegeven tekenreeks die een hostnaam of IP-adres bevat.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostEntry(String hostNameOrAddress, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| hostNameOrAddress | String | De string die een hostnaam of IP-adres bevat. |
| requestCallback | AsyncCallback | Een callback die wordt aangeroepen wanneer de bewerking is voltooid. |
| stateObject | System::SharedPtr\<Object\> | Door de gebruiker geleverde gegevens die worden gebruikt om elke asynchrone bewerking uniek te identificeren. |

### ReturnValue

Een [IAsyncResult](../../../system/iasyncresult/) object dat de geïnitieerde asynchrone bewerking vertegenwoordigt.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [String](../../../system/string/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
## Dns::BeginGetHostEntry(System::SharedPtr\<IPAddress\>, AsyncCallback, System::SharedPtr\<Object\>) method


Initieert een asynchrone bewerking om een nieuw IPHostEntry-class‑instance te maken met het opgegeven IP-adres.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostEntry(System::SharedPtr<IPAddress> address, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| adres | System::SharedPtr\<IPAddress\> | Het IP-adres. |
| requestCallback | AsyncCallback | Een callback die wordt aangeroepen wanneer de bewerking is voltooid. |
| stateObject | System::SharedPtr\<Object\> | Door de gebruiker geleverde gegevens die worden gebruikt om elke asynchrone bewerking uniek te identificeren. |

### ReturnValue

Een [IAsyncResult](../../../system/iasyncresult/) object dat de geïnitieerde asynchrone bewerking vertegenwoordigt.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [IPAddress](../../ipaddress/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
