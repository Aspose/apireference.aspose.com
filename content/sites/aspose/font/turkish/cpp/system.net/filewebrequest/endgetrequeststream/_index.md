---
title: "System::Net::FileWebRequest::EndGetRequestStream metodu"
linktitle: "EndGetRequestStream"
second_title: "Aspose.Font için C++"
description: "System::Net::FileWebRequest::EndGetRequestStream metodu. C++'ta akış elde etmek için belirtilen asenkron işlemin tamamlanmasını bekler."
type: docs
weight: 500
url: /tr/cpp/system.net/filewebrequest/endgetrequeststream/
---
## FileWebRequest::EndGetRequestStream method


Belirtilen akış elde etme eşzamansız işlemi tamamlanana kadar bekler.

```cpp
System::SharedPtr<IO::Stream> System::Net::FileWebRequest::EndGetRequestStream(System::SharedPtr<IAsyncResult> asyncResult) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Bir [IAsyncResult](../../../system/iasyncresult/) nesnesi, bir akış elde etmek için asenkron bir işlemi temsil eder. |

### ReturnValue

Kaynağa veri yazmak için akış.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [FileWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
