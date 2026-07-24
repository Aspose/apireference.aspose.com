---
title: "System::Net::HttpWebRequest::EndGetRequestStream metode"
linktitle: "EndGetRequestStream"
second_title: "Aspose.Page untuk C++"
description: "System::Net::HttpWebRequest::EndGetRequestStream metode. Menunggu hingga operasi asinkron yang ditentukan untuk mendapatkan stream selesai dalam C++."
type: docs
weight: 600
url: /id/cpp/system.net/httpwebrequest/endgetrequeststream/
---
## HttpWebRequest::EndGetRequestStream method


Menunggu hingga operasi asinkron yang ditentukan untuk mendapatkan aliran selesai.

```cpp
System::SharedPtr<IO::Stream> System::Net::HttpWebRequest::EndGetRequestStream(System::SharedPtr<IAsyncResult> asyncResult) override
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
* Class [HttpWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
