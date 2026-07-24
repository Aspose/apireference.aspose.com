---
title: "System::Net::Dns::EndGetHostEntry yöntemi"
linktitle: "EndGetHostEntry"
second_title: "Aspose.Page için C++"
description: "System::Net::Dns::EndGetHostEntry yöntemi. Belirtilen asenkron işlemin yeni bir IPHostEntry sınıfı örneği oluşturması C++'da tamamlanana kadar bekler."
type: docs
weight: 700
url: /tr/cpp/system.net/dns/endgethostentry/
---
## Dns::EndGetHostEntry method


Belirtilen eşzamansız işlem yeni bir IPHostEntry-class örneği oluşturana kadar bekler.

```cpp
static System::SharedPtr<IPHostEntry> System::Net::Dns::EndGetHostEntry(System::SharedPtr<IAsyncResult> asyncResult)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Bir [IAsyncResult](../../../system/iasyncresult/) nesnesi, eşzamansız bir işlemi temsil eder. |

### ReturnValue

Yeni oluşturulmuş IPHostEntry-class örneği.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPHostEntry](../../iphostentry/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
