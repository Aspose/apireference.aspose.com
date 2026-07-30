---
title: "System::Net::FileWebRequest::BeginGetResponse метод"
linktitle: "BeginGetResponse"
second_title: "Aspose.Font для C++"
description: "System::Net::FileWebRequest::BeginGetResponse метод. Инициирует асинхронный запрос ресурса в C++."
type: docs
weight: 400
url: /ru/cpp/system.net/filewebrequest/begingetresponse/
---
## FileWebRequest::BeginGetResponse method


Инициирует асинхронный запрос к ресурсу.

```cpp
System::SharedPtr<IAsyncResult> System::Net::FileWebRequest::BeginGetResponse(AsyncCallback callback, System::SharedPtr<Object> state) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| обратный вызов | AsyncCallback | Обратный вызов, который будет вызван после завершения операции. |
| состояние | System::SharedPtr\<Object\> | Пользовательские данные, используемые для уникальной идентификации каждой асинхронной операции. |

### ReturnValue

Объект [IAsyncResult](../../../system/iasyncresult/), представляющий инициированную асинхронную операцию.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [FileWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
