---
title: "System::Net::Dns::BeginResolve methode"
linktitle: "BeginResolve"
second_title: "Aspose.Page voor C++"
description: "System::Net::Dns::BeginResolve methode. Initialiseert een asynchrone bewerking om een nieuw IPHostEntry-class instance te maken met de opgegeven hostnaam in C++."
type: docs
weight: 400
url: /nl/cpp/system.net/dns/beginresolve/
---
## Dns::BeginResolve method


Initieert een asynchrone bewerking om een nieuw IPHostEntry-class‑instance te maken met de opgegeven hostnaam.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginResolve(String hostName, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| hostName | String | Een hostnaam die wordt gebruikt om een nieuw exemplaar van de [IPHostEntry](../../iphostentry/) klasse te maken. |
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
