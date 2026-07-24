---
title: "System::Net::WebRequest::EndGetRequestStream yöntemi"
linktitle: "EndGetRequestStream"
second_title: "Aspose.Page için C++"
description: "System::Net::WebRequest::EndGetRequestStream yöntemi. Belirtilen asenkron akış alma işlemi C++'ta tamamlanana kadar bekler."
type: docs
weight: 1200
url: /tr/cpp/system.net/webrequest/endgetrequeststream/
---
## WebRequest::EndGetRequestStream method


Akış elde etmeye yönelik belirtilen asenkron işlemin tamamlanmasını bekler.

```cpp
virtual System::SharedPtr<IO::Stream> System::Net::WebRequest::EndGetRequestStream(System::SharedPtr<IAsyncResult> asyncResult)=0
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Bir [IAsyncResult](../../../system/iasyncresult/) nesnesi, bir akış elde etme asenkron işlemini temsil eder. |

### ReturnValue

Kaynağa veri yazmak için akış.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
