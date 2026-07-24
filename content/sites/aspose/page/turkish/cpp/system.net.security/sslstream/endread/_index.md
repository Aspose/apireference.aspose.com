---
title: "System::Net::Security::SslStream::EndRead yöntemi"
linktitle: "EndRead"
second_title: "Aspose.Page için C++"
description: "System::Net::Security::SslStream::EndRead yöntemi. Belirtilen eşzamansız okuma işlemi tamamlanana kadar bekler C++'da."
type: docs
weight: 700
url: /tr/cpp/system.net.security/sslstream/endread/
---
## SslStream::EndRead method


Belirtilen asenkron okuma işlemi tamamlanana kadar bekler.

```cpp
int32_t System::Net::Security::SslStream::EndRead(System::SharedPtr<IAsyncResult> asyncResult) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Asenkron bir okuma işlemini temsil eden bir [IAsyncResult](../../../system/iasyncresult/) nesnesi |

### ReturnValue

**asyncResult** tarafından temsil edilen okuma işlemi sırasında okunan bayt sayısı

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
