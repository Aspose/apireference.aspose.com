---
title: "System::Net::HttpWebRequest::EndGetRequestStream yöntemi"
linktitle: "EndGetRequestStream"
second_title: "Aspose.Font için C++"
description: "System::Net::HttpWebRequest::EndGetRequestStream yöntemi. C++'ta bir akış elde etmek için belirtilen eşzamansız işlemin tamamlanmasını bekler."
type: docs
weight: 600
url: /tr/cpp/system.net/httpwebrequest/endgetrequeststream/
---
## HttpWebRequest::EndGetRequestStream method


Belirtilen akış elde etme eşzamansız işlemi tamamlanana kadar bekler.

```cpp
System::SharedPtr<IO::Stream> System::Net::HttpWebRequest::EndGetRequestStream(System::SharedPtr<IAsyncResult> asyncResult) override
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
* Class [HttpWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
