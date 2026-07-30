---
title: "System::Net::WebRequest::BeginGetResponse yöntemi"
linktitle: "BeginGetResponse"
second_title: "Aspose.Font için C++"
description: "System::Net::WebRequest::BeginGetResponse yöntemi. C++'da kaynak için eşzamansız bir istek başlatır."
type: docs
weight: 1100
url: /tr/cpp/system.net/webrequest/begingetresponse/
---
## WebRequest::BeginGetResponse method


Kaynak için eşzamansız bir isteği başlatır.

```cpp
virtual System::SharedPtr<IAsyncResult> System::Net::WebRequest::BeginGetResponse(AsyncCallback callback, System::SharedPtr<Object> state)=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| geri arama | AsyncCallback | İşlem tamamlandığında çağrılacak bir geri çağırma. |
| durum | System::SharedPtr\<Object\> | Kullanıcı tarafından sağlanan veri, her eşzamansız işlemi benzersiz şekilde tanımlamak için kullanılır. |

### ReturnValue

Başlatılan eşzamansız işlemi temsil eden bir [IAsyncResult](../../../system/iasyncresult/) nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
