---
title: "System::Net::FileWebRequest::BeginGetRequestStream methode"
linktitle: "BeginGetRequestStream"
second_title: "Aspose.Page voor C++"
description: "System::Net::FileWebRequest::BeginGetRequestStream methode. Initialiseert een asynchrone bewerking om een stream te verkrijgen voor het schrijven van gegevens naar de bron in C++."
type: docs
weight: 300
url: /nl/cpp/system.net/filewebrequest/begingetrequeststream/
---
## FileWebRequest::BeginGetRequestStream method


Initieert een asynchrone bewerking om een stream te verkrijgen voor het schrijven van gegevens naar de bron.

```cpp
System::SharedPtr<IAsyncResult> System::Net::FileWebRequest::BeginGetRequestStream(AsyncCallback callback, System::SharedPtr<Object> state) override
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
* Class [FileWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
