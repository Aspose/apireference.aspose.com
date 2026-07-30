---
title: "System::Net::Sockets::NetworkStream::EndRead metodu"
linktitle: "EndRead"
second_title: "Aspose.Font için C++"
description: "System::Net::Sockets::NetworkStream::EndRead metodu. Belirtilen asenkron okuma işlemi C++'ta tamamlanana kadar bekler."
type: docs
weight: 600
url: /tr/cpp/system.net.sockets/networkstream/endread/
---
## NetworkStream::EndRead method


Belirtilen eşzamansız okuma işlemi tamamlanana kadar bekler.

```cpp
int32_t System::Net::Sockets::NetworkStream::EndRead(System::SharedPtr<IAsyncResult> asyncResult) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Asenkron okuma işlemini temsil eden bir [IAsyncResult](../../../system/iasyncresult/) nesnesi |

### ReturnValue

**asyncResult** tarafından temsil edilen okuma işlemi sırasında okunan bayt sayısı

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
