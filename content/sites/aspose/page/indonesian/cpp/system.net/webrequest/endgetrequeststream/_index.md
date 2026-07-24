---
title: "System::Net::WebRequest::EndGetRequestStream metode"
linktitle: "EndGetRequestStream"
second_title: "Aspose.Page untuk C++"
description: "System::Net::WebRequest::EndGetRequestStream metode. Menunggu hingga operasi asinkron yang ditentukan untuk mendapatkan stream selesai dalam C++."
type: docs
weight: 1200
url: /id/cpp/system.net/webrequest/endgetrequeststream/
---
## WebRequest::EndGetRequestStream method


Menunggu hingga operasi asinkron yang ditentukan untuk mendapatkan aliran selesai.

```cpp
virtual System::SharedPtr<IO::Stream> System::Net::WebRequest::EndGetRequestStream(System::SharedPtr<IAsyncResult> asyncResult)=0
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Sebuah objek [IAsyncResult](../../../system/iasyncresult/) yang mewakili operasi asinkron untuk mendapatkan stream. |

### ReturnValue

Aliran untuk menulis data ke sumber daya.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
