---
title: "System::Net::Dns::EndGetHostAddresses yöntemi"
linktitle: "EndGetHostAddresses"
second_title: "Aspose.Page için C++"
description: "System::Net::Dns::EndGetHostAddresses yöntemi. C++'ta yeni bir IPHostEntry-class örneği oluşturmak için belirtilen eşzamansız işlemin tamamlanmasını bekler."
type: docs
weight: 500
url: /tr/cpp/system.net/dns/endgethostaddresses/
---
## Dns::EndGetHostAddresses method


Belirtilen eşzamansız işlem yeni bir IPHostEntry-class örneği oluşturana kadar bekler.

```cpp
static System::ArrayPtr<System::SharedPtr<IPAddress>> System::Net::Dns::EndGetHostAddresses(System::SharedPtr<IAsyncResult> asyncResult)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Bir [IAsyncResult](../../../system/iasyncresult/) nesnesi, eşzamansız bir işlemi temsil eder. |

### ReturnValue

Yeni oluşturulmuş IPHostEntry-class örneği.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPAddress](../../ipaddress/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
