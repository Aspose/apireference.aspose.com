---
title: "System::Net::Dns::BeginGetHostAddresses methode"
linktitle: "BeginGetHostAddresses"
second_title: "Aspose.Page voor C++"
description: "System::Net::Dns::BeginGetHostAddresses methode. Initialiseert een asynchrone bewerking om een nieuw IPHostEntry-klasse‑object te maken met behulp van de opgegeven tekenreeks die een hostnaam of IP-adres bevat in C++."
type: docs
weight: 100
url: /nl/cpp/system.net/dns/begingethostaddresses/
---
## Dns::BeginGetHostAddresses method


Initieert een asynchrone bewerking om een nieuw IPHostEntry-class‑instance te maken met de opgegeven tekenreeks die een hostnaam of IP-adres bevat.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostAddresses(String hostNameOrAddress, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| hostNameOrAddress | String | Een string die een hostnaam of IP-adres bevat. |
| requestCallback | AsyncCallback | Een callback die wordt aangeroepen wanneer de bewerking is voltooid. |
| state | System::SharedPtr\<Object\> | Door de gebruiker geleverde gegevens die worden gebruikt om elke asynchrone bewerking uniek te identificeren. |

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
