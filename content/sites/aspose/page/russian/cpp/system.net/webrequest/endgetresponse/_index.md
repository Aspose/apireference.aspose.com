---
title: "System::Net::WebRequest::EndGetResponse method"
linktitle: "EndGetResponse"
second_title: "Aspose.Page для C++"
description: "System::Net::WebRequest::EndGetResponse method. Ожидает завершения указанного асинхронного запроса ресурса в C++."
type: docs
weight: 1300
url: /ru/cpp/system.net/webrequest/endgetresponse/
---
## WebRequest::EndGetResponse method


Ожидает завершения указанного асинхронного запроса к ресурсу.

```cpp
virtual System::SharedPtr<WebResponse> System::Net::WebRequest::EndGetResponse(System::SharedPtr<IAsyncResult> asyncResult)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Объект [IAsyncResult](../../../system/iasyncresult/) , представляющий асинхронный запрос ресурса. |

### ReturnValue

Веб‑ответ.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WebResponse](../../webresponse/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
