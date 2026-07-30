---
title: "System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs Konstruktor"
linktitle: "InvokeCompletedEventArgs"
second_title: "Aspose.Font für C++"
description: "System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs Konstruktor. Erstellt eine neue Instanz in C++."
type: docs
weight: 100
url: /de/cpp/system.web.services.protocols/invokecompletedeventargs/invokecompletedeventargs/
---
## InvokeCompletedEventArgs::InvokeCompletedEventArgs constructor


Erstellt eine neue Instanz.

```cpp
System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs(Exception error, bool cancelled, System::SharedPtr<Object> userState, System::ArrayPtr<System::SharedPtr<Object>> results)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Fehler | Exception | Jeder Fehler, der während einer asynchronen Operation aufgetreten ist. |
| abgebrochen | bool | Ein Wert, der angibt, ob eine asynchrone Operation abgebrochen wurde. |
| userState | System::SharedPtr\<Object\> | Das optionale vom Benutzer bereitgestellte Zustandsobjekt, das an die [System.ComponentModel.BackgroundWorker.RunWorkerAsync](../../../system.componentmodel/backgroundworker/runworkerasync/)([System.Object](../../../system/object/)) Methode übergeben wird. |
| results | System::ArrayPtr\<System::SharedPtr\<Object\>\> | Eine Sammlung von Ergebnissen asynchroner Operationen. |

## Siehe auch

* Typedef [Exception](../../../system/exception/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [InvokeCompletedEventArgs](../)
* Namespace [System::Web::Services::Protocols](../../)
* Library [Aspose.Font for C++](../../../)
