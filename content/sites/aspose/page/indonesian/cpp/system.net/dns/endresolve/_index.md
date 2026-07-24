---
title: "System::Net::Dns::EndResolve metode"
linktitle: "EndResolve"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Dns::EndResolve metode. Menunggu sampai operasi asynchronous yang ditentukan untuk membuat instance kelas IPHostEntry baru selesai dalam C++."
type: docs
weight: 800
url: /id/cpp/system.net/dns/endresolve/
---
## Dns::EndResolve method


Menunggu hingga operasi asynchronous yang ditentukan untuk membuat instance IPHostEntry-class selesai.

```cpp
static System::SharedPtr<IPHostEntry> System::Net::Dns::EndResolve(System::SharedPtr<IAsyncResult> asyncResult)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Sebuah objek [IAsyncResult](../../../system/iasyncresult/) yang mewakili operasi asynchronous. |

### ReturnValue

Instance kelas IPHostEntry yang baru dibuat.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPHostEntry](../../iphostentry/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
