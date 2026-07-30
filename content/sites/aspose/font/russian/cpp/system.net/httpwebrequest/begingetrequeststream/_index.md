---
title: "System::Net::HttpWebRequest::BeginGetRequestStream метод"
linktitle: "BeginGetRequestStream"
second_title: "Aspose.Font для C++"
description: "System::Net::HttpWebRequest::BeginGetRequestStream метод. Инициирует асинхронную операцию получения потока для записи данных в ресурс в C++."
type: docs
weight: 400
url: /ru/cpp/system.net/httpwebrequest/begingetrequeststream/
---
## HttpWebRequest::BeginGetRequestStream method


Инициирует асинхронную операцию получения потока для записи данных в ресурс.

```cpp
System::SharedPtr<IAsyncResult> System::Net::HttpWebRequest::BeginGetRequestStream(AsyncCallback callback, System::SharedPtr<Object> state) override
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
