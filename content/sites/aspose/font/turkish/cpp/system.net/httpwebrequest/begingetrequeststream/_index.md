---
title: "System::Net::HttpWebRequest::BeginGetRequestStream yöntemi"
linktitle: "BeginGetRequestStream"
second_title: "Aspose.Font için C++"
description: "System::Net::HttpWebRequest::BeginGetRequestStream yöntemi. C++'ta kaynağa veri yazmak için bir akış elde etmeyi sağlayan eşzamansız bir işlemi başlatır."
type: docs
weight: 400
url: /tr/cpp/system.net/httpwebrequest/begingetrequeststream/
---
## HttpWebRequest::BeginGetRequestStream method


Kaynağa veri yazmak için bir akış elde etmeye yönelik eşzamansız bir işlemi başlatır.

```cpp
System::SharedPtr<IAsyncResult> System::Net::HttpWebRequest::BeginGetRequestStream(AsyncCallback callback, System::SharedPtr<Object> state) override
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
* Class [HttpWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
