---
title: "System::Net::Dns::EndGetHostByName yöntemi"
linktitle: "EndGetHostByName"
second_title: "Aspose.Page için C++"
description: "System::Net::Dns::EndGetHostByName yöntemi. Belirtilen asenkron işlemin yeni bir IPHostEntry sınıfı örneği oluşturması C++'da tamamlanana kadar bekler."
type: docs
weight: 600
url: /tr/cpp/system.net/dns/endgethostbyname/
---
## Dns::EndGetHostByName method


Belirtilen eşzamansız işlem yeni bir IPHostEntry-class örneği oluşturana kadar bekler.

```cpp
static System::SharedPtr<IPHostEntry> System::Net::Dns::EndGetHostByName(System::SharedPtr<IAsyncResult> asyncResult)
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
