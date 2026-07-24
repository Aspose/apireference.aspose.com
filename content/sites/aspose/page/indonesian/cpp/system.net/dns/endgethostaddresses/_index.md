---
title: "metode System::Net::Dns::EndGetHostAddresses"
linktitle: "EndGetHostAddresses"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Net::Dns::EndGetHostAddresses. Menunggu hingga operasi asynchronous yang ditentukan untuk membuat instance kelas IPHostEntry baru selesai di C++."
type: docs
weight: 500
url: /id/cpp/system.net/dns/endgethostaddresses/
---
## Dns::EndGetHostAddresses method


Menunggu hingga operasi asynchronous yang ditentukan untuk membuat instance IPHostEntry-class selesai.

```cpp
static System::ArrayPtr<System::SharedPtr<IPAddress>> System::Net::Dns::EndGetHostAddresses(System::SharedPtr<IAsyncResult> asyncResult)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Sebuah objek [IAsyncResult](../../../system/iasyncresult/) yang mewakili operasi asynchronous. |

### ReturnValue

Instance kelas IPHostEntry yang baru dibuat.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPAddress](../../ipaddress/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
