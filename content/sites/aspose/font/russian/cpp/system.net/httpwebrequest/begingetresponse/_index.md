---
title: "Метод System::Net::HttpWebRequest::BeginGetResponse"
linktitle: "BeginGetResponse"
second_title: "Aspose.Font для C++"
description: "Метод System::Net::HttpWebRequest::BeginGetResponse. Инициирует асинхронный запрос ресурса в C++."
type: docs
weight: 500
url: /ru/cpp/system.net/httpwebrequest/begingetresponse/
---
## HttpWebRequest::BeginGetResponse method


Инициирует асинхронный запрос к ресурсу.

```cpp
System::SharedPtr<IAsyncResult> System::Net::HttpWebRequest::BeginGetResponse(AsyncCallback callback, System::SharedPtr<Object> state) override
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
* Class [HttpWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
