---
title: "System::Net::FileWebRequest::BeginGetResponse metodu"
linktitle: "BeginGetResponse"
second_title: "Aspose.Font için C++"
description: "System::Net::FileWebRequest::BeginGetResponse metodu. C++'ta kaynak için asenkron bir istek başlatır."
type: docs
weight: 400
url: /tr/cpp/system.net/filewebrequest/begingetresponse/
---
## FileWebRequest::BeginGetResponse method


Kaynak için eşzamansız bir isteği başlatır.

```cpp
System::SharedPtr<IAsyncResult> System::Net::FileWebRequest::BeginGetResponse(AsyncCallback callback, System::SharedPtr<Object> state) override
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
* Class [FileWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
