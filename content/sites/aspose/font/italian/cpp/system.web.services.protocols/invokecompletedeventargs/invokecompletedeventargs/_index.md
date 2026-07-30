---
title: "System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs costruttore"
linktitle: "InvokeCompletedEventArgs"
second_title: "Aspose.Font per C++"
description: "System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs costruttore. Costruisce una nuova istanza in C++."
type: docs
weight: 100
url: /it/cpp/system.web.services.protocols/invokecompletedeventargs/invokecompletedeventargs/
---
## InvokeCompletedEventArgs::InvokeCompletedEventArgs constructor


Crea una nuova istanza.

```cpp
System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs(Exception error, bool cancelled, System::SharedPtr<Object> userState, System::ArrayPtr<System::SharedPtr<Object>> results)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| errore | Exception | Qualsiasi errore che si è verificato durante un'operazione asincrona. |
| annullato | bool | Un valore che indica se un'operazione asincrona è annullata. |
| userState | System::SharedPtr\<Object\> | L'oggetto di stato opzionale fornito dall'utente passato al metodo [System.ComponentModel.BackgroundWorker.RunWorkerAsync](../../../system.componentmodel/backgroundworker/runworkerasync/)([System.Object](../../../system/object/)). |
| risultati | System::ArrayPtr\<System::SharedPtr\<Object\>\> | Una raccolta di risultati di operazioni asincrone. |

## Vedi anche

* Typedef [Exception](../../../system/exception/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [InvokeCompletedEventArgs](../)
* Namespace [System::Web::Services::Protocols](../../)
* Library [Aspose.Font for C++](../../../)
