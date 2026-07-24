---
title: "System::Net::Sockets::NetworkStream::EndRead method"
linktitle: "EndRead"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Sockets::NetworkStream::EndRead method. Menunggu hingga operasi baca asynchronous yang ditentukan selesai dalam C++."
type: docs
weight: 600
url: /id/cpp/system.net.sockets/networkstream/endread/
---
## NetworkStream::EndRead method


Menunggu hingga operasi baca asynchronous yang ditentukan selesai.

```cpp
int32_t System::Net::Sockets::NetworkStream::EndRead(System::SharedPtr<IAsyncResult> asyncResult) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Sebuah objek [IAsyncResult](../../../system/iasyncresult/) yang mewakili operasi baca asynchronous |

### ReturnValue

Jumlah byte yang dibaca selama operasi baca yang diwakili oleh **asyncResult**

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
