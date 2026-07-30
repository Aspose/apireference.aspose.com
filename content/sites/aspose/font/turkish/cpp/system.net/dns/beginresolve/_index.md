---
title: "System::Net::Dns::BeginResolve yöntemi"
linktitle: "BeginResolve"
second_title: "Aspose.Font için C++"
description: "System::Net::Dns::BeginResolve yöntemi. Belirtilen ana bilgisayar adını kullanarak yeni bir IPHostEntry-sınıfı örneği oluşturmak için eşzamansız bir işlem başlatır C++'ta."
type: docs
weight: 400
url: /tr/cpp/system.net/dns/beginresolve/
---
## Dns::BeginResolve method


Belirtilen ana bilgisayar adını kullanarak yeni bir IPHostEntry-class örneği oluşturmak için eşzamanlı bir işlem başlatır.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginResolve(String hostName, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| hostName | String | Yeni bir [IPHostEntry](../../iphostentry/) sınıfı örneği oluşturmak için kullanılan bir ana bilgisayar adı. |
| requestCallback | AsyncCallback | İşlem tamamlandığında çağrılacak bir geri çağırma. |
| stateObject | System::SharedPtr\<Object\> | Kullanıcı tarafından sağlanan veri, her eşzamansız işlemi benzersiz şekilde tanımlamak için kullanılır. |

### ReturnValue

Başlatılan eşzamansız işlemi temsil eden bir [IAsyncResult](../../../system/iasyncresult/) nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [String](../../../system/string/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
