---
title: "System::Net::Security::SslStream::EndRead method"
linktitle: "EndRead"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Security::SslStream::EndRead method. Menunggu hingga operasi baca asinkron yang ditentukan selesai dalam C++."
type: docs
weight: 700
url: /id/cpp/system.net.security/sslstream/endread/
---
## SslStream::EndRead method


Menunggu hingga operasi baca asynchronous yang ditentukan selesai.

```cpp
int32_t System::Net::Security::SslStream::EndRead(System::SharedPtr<IAsyncResult> asyncResult) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Sebuah objek [IAsyncResult](../../../system/iasyncresult/) yang mewakili operasi baca asynchronous |

### ReturnValue

Jumlah byte yang dibaca selama operasi baca yang diwakili oleh **asyncResult**

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
