---
title: "System::Net::WebRequest::BeginGetResponse methode"
linktitle: "BeginGetResponse"
second_title: "Aspose.Page voor C++"
description: "System::Net::WebRequest::BeginGetResponse methode. Initialiseert een asynchrone aanvraag voor de bron in C++."
type: docs
weight: 1100
url: /nl/cpp/system.net/webrequest/begingetresponse/
---
## WebRequest::BeginGetResponse method


Initieert een asynchrone aanvraag voor de bron.

```cpp
virtual System::SharedPtr<IAsyncResult> System::Net::WebRequest::BeginGetResponse(AsyncCallback callback, System::SharedPtr<Object> state)=0
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| callback | AsyncCallback | Een callback die wordt aangeroepen wanneer de bewerking is voltooid. |
| state | System::SharedPtr\<Object\> | Door de gebruiker geleverde gegevens die worden gebruikt om elke asynchrone bewerking uniek te identificeren. |

### ReturnValue

Een [IAsyncResult](../../../system/iasyncresult/) object dat de geïnitieerde asynchrone bewerking vertegenwoordigt.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
