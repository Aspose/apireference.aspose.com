---
title: "System::Net::FileWebRequest::EndGetRequestStream metodu"
linktitle: "EndGetRequestStream"
second_title: "Aspose.Page için C++"
description: "System::Net::FileWebRequest::EndGetRequestStream metodu. C++'ta belirtilen eşzamansız akış elde etme işlemi tamamlanana kadar bekler."
type: docs
weight: 500
url: /tr/cpp/system.net/filewebrequest/endgetrequeststream/
---
## FileWebRequest::EndGetRequestStream method


Akış elde etmeye yönelik belirtilen asenkron işlemin tamamlanmasını bekler.

```cpp
System::SharedPtr<IO::Stream> System::Net::FileWebRequest::EndGetRequestStream(System::SharedPtr<IAsyncResult> asyncResult) override
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
* Class [FileWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
