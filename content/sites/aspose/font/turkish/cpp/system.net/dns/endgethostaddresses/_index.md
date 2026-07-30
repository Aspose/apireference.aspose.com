---
title: "System::Net::Dns::EndGetHostAddresses yöntemi"
linktitle: "EndGetHostAddresses"
second_title: "Aspose.Font için C++"
description: "System::Net::Dns::EndGetHostAddresses yöntemi. C++'ta yeni bir IPHostEntry-sınıfı örneği oluşturmak için belirtilen eşzamansız işlemin tamamlanmasını bekler."
type: docs
weight: 500
url: /tr/cpp/system.net/dns/endgethostaddresses/
---
## Dns::EndGetHostAddresses method


Belirtilen eşzamanlı işlemin yeni bir IPHostEntry-class örneği oluşturması tamamlanana kadar bekler.

```cpp
static System::ArrayPtr<System::SharedPtr<IPAddress>> System::Net::Dns::EndGetHostAddresses(System::SharedPtr<IAsyncResult> asyncResult)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Bir [IAsyncResult](../../../system/iasyncresult/) nesnesi, eşzamansız bir işlemi temsil eder. |

### ReturnValue

Yeni oluşturulmuş bir IPHostEntry-sınıfı örneği.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPAddress](../../ipaddress/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
