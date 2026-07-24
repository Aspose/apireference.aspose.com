---
title: "System::Net::WebRequest::BeginGetResponse method"
linktitle: "BeginGetResponse"
second_title: "Aspose.Page для C++"
description: "System::Net::WebRequest::BeginGetResponse method. Инициирует асинхронный запрос ресурса в C++."
type: docs
weight: 1100
url: /ru/cpp/system.net/webrequest/begingetresponse/
---
## WebRequest::BeginGetResponse method


Инициирует асинхронный запрос к ресурсу.

```cpp
virtual System::SharedPtr<IAsyncResult> System::Net::WebRequest::BeginGetResponse(AsyncCallback callback, System::SharedPtr<Object> state)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| обратный вызов | AsyncCallback | Обратный вызов, который будет вызван после завершения операции. |
| state | System::SharedPtr\<Object\> | Пользовательские данные, используемые для уникальной иденфикации каждой асинхронной операции. |

### ReturnValue

Объект [IAsyncResult](../../../system/iasyncresult/), представляющий инициированную асинхронную операцию.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
