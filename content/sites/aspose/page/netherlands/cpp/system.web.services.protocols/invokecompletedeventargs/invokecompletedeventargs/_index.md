---
title: "System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs constructor"
linktitle: "InvokeCompletedEventArgs"
second_title: "Aspose.Page voor C++"
description: "System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs constructor. Maakt een nieuwe instantie in C++."
type: docs
weight: 100
url: /nl/cpp/system.web.services.protocols/invokecompletedeventargs/invokecompletedeventargs/
---
## InvokeCompletedEventArgs::InvokeCompletedEventArgs constructor


Construeert een nieuw exemplaar.

```cpp
System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs(Exception error, bool cancelled, System::SharedPtr<Object> userState, System::ArrayPtr<System::SharedPtr<Object>> results)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| fout | Exception | Elke fout die optrad tijdens een asynchrone bewerking. |
| geannuleerd | bool | Een waarde die aangeeft of een asynchrone bewerking is geannuleerd. |
| userState | System::SharedPtr\<Object\> | Het optionele door de gebruiker geleverde statusobject dat wordt doorgegeven aan de [System.ComponentModel.BackgroundWorker.RunWorkerAsync](../../../system.componentmodel/backgroundworker/runworkerasync/)([System.Object](../../../system/object/))‑methode. |
| resultaten | System::ArrayPtr\<System::SharedPtr\<Object\>\> | Een verzameling van asynchrone operatieresultaten. |

## Zie ook

* Typedef [Exception](../../../system/exception/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [InvokeCompletedEventArgs](../)
* Namespace [System::Web::Services::Protocols](../../)
* Library [Aspose.Page for C++](../../../)
