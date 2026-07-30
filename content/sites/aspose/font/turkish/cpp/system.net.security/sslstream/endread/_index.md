---
title: "System::Net::Security::SslStream::EndRead metodu"
linktitle: "EndRead"
second_title: "Aspose.Font için C++"
description: "System::Net::Security::SslStream::EndRead metodu. C++'ta belirtilen asenkron okuma işlemi tamamlanana kadar bekler."
type: docs
weight: 700
url: /tr/cpp/system.net.security/sslstream/endread/
---
## SslStream::EndRead method


Belirtilen eşzamansız okuma işlemi tamamlanana kadar bekler.

```cpp
int32_t System::Net::Security::SslStream::EndRead(System::SharedPtr<IAsyncResult> asyncResult) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Asenkron okuma işlemini temsil eden bir [IAsyncResult](../../../system/iasyncresult/) nesnesi |

### ReturnValue

**asyncResult** tarafından temsil edilen okuma işlemi sırasında okunan bayt sayısı

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
