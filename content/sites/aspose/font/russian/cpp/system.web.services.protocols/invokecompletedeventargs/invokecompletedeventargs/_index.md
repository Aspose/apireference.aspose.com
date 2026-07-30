---
title: "System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs конструктор"
linktitle: "InvokeCompletedEventArgs"
second_title: "Aspose.Font для C++"
description: "System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs конструктор. Создаёт новый экземпляр в C++."
type: docs
weight: 100
url: /ru/cpp/system.web.services.protocols/invokecompletedeventargs/invokecompletedeventargs/
---
## InvokeCompletedEventArgs::InvokeCompletedEventArgs constructor


Создаёт новый экземпляр.

```cpp
System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs(Exception error, bool cancelled, System::SharedPtr<Object> userState, System::ArrayPtr<System::SharedPtr<Object>> results)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| ошибка | Exception | Любая ошибка, возникшая во время асинхронной операции. |
| отменено | bool | Значение, указывающее, отменена ли асинхронная операция. |
| userState | System::SharedPtr\<Object\> | Необязательный объект состояния, предоставляемый пользователем, передаваемый методу [System.ComponentModel.BackgroundWorker.RunWorkerAsync](../../../system.componentmodel/backgroundworker/runworkerasync/)([System.Object](../../../system/object/)). |
| results | System::ArrayPtr\<System::SharedPtr\<Object\>\> | Коллекция результатов асинхронных операций. |

## См. также

* Typedef [Exception](../../../system/exception/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [InvokeCompletedEventArgs](../)
* Namespace [System::Web::Services::Protocols](../../)
* Library [Aspose.Font for C++](../../../)
