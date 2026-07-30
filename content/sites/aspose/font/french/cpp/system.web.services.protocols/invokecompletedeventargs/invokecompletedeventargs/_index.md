---
title: "Constructeur System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs"
linktitle: "InvokeCompletedEventArgs"
second_title: "Aspose.Font pour C++"
description: "Constructeur System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs. Crée une nouvelle instance en C++."
type: docs
weight: 100
url: /fr/cpp/system.web.services.protocols/invokecompletedeventargs/invokecompletedeventargs/
---
## InvokeCompletedEventArgs::InvokeCompletedEventArgs constructor


Construit une nouvelle instance.

```cpp
System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs(Exception error, bool cancelled, System::SharedPtr<Object> userState, System::ArrayPtr<System::SharedPtr<Object>> results)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| error | Exception | Toute erreur survenue lors d'une opération asynchrone. |
| annulé | bool | Une valeur indiquant si une opération asynchrone est annulée. |
| userState | System::SharedPtr\<Object\> | L'objet d'état optionnel fourni par l'utilisateur passé à la méthode [System.ComponentModel.BackgroundWorker.RunWorkerAsync](../../../system.componentmodel/backgroundworker/runworkerasync/)([System.Object](../../../system/object/)). |
| résultats | System::ArrayPtr\<System::SharedPtr\<Object\>\> | Une collection de résultats d'opérations asynchrones. |

## Voir aussi

* Typedef [Exception](../../../system/exception/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [InvokeCompletedEventArgs](../)
* Namespace [System::Web::Services::Protocols](../../)
* Library [Aspose.Font for C++](../../../)
