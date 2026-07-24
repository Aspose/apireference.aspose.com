---
title: "System::Net::FileWebRequest::EndGetRequestStream metode"
linktitle: "EndGetRequestStream"
second_title: "Aspose.Page untuk C++"
description: "System::Net::FileWebRequest::EndGetRequestStream metode. Menunggu hingga operasi asynchronous yang ditentukan untuk mendapatkan aliran selesai dalam C++."
type: docs
weight: 500
url: /id/cpp/system.net/filewebrequest/endgetrequeststream/
---
## FileWebRequest::EndGetRequestStream method


Menunggu hingga operasi asinkron yang ditentukan untuk mendapatkan aliran selesai.

```cpp
System::SharedPtr<IO::Stream> System::Net::FileWebRequest::EndGetRequestStream(System::SharedPtr<IAsyncResult> asyncResult) override
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
* Class [FileWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
