---
title: "System::Net::WebRequest::EndGetRequestStream yöntemi"
linktitle: "EndGetRequestStream"
second_title: "Aspose.Font için C++"
description: "System::Net::WebRequest::EndGetRequestStream yöntemi. C++'ta bir akış elde etmek için belirtilen eşzamansız işlemin tamamlanmasını bekler."
type: docs
weight: 1200
url: /tr/cpp/system.net/webrequest/endgetrequeststream/
---
## WebRequest::EndGetRequestStream method


Belirtilen akış elde etme eşzamansız işlemi tamamlanana kadar bekler.

```cpp
virtual System::SharedPtr<IO::Stream> System::Net::WebRequest::EndGetRequestStream(System::SharedPtr<IAsyncResult> asyncResult)=0
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
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
