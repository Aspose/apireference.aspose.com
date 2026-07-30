---
title: "System::Net::Dns::EndGetHostEntry yöntemi"
linktitle: "EndGetHostEntry"
second_title: "Aspose.Font için C++"
description: "System::Net::Dns::EndGetHostEntry yöntemi. Belirtilen eşzamansız işlemin yeni bir IPHostEntry-sınıfı örneği oluşturması C++'ta tamamlanana kadar bekler."
type: docs
weight: 700
url: /tr/cpp/system.net/dns/endgethostentry/
---
## Dns::EndGetHostEntry method


Belirtilen eşzamanlı işlemin yeni bir IPHostEntry-class örneği oluşturması tamamlanana kadar bekler.

```cpp
static System::SharedPtr<IPHostEntry> System::Net::Dns::EndGetHostEntry(System::SharedPtr<IAsyncResult> asyncResult)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Bir [IAsyncResult](../../../system/iasyncresult/) nesnesi, eşzamansız bir işlemi temsil eder. |

### ReturnValue

Yeni oluşturulmuş bir IPHostEntry-sınıfı örneği.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPHostEntry](../../iphostentry/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
