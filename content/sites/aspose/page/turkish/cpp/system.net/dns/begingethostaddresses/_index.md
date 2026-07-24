---
title: "System::Net::Dns::BeginGetHostAddresses yöntemi"
linktitle: "BeginGetHostAddresses"
second_title: "Aspose.Page için C++"
description: "System::Net::Dns::BeginGetHostAddresses yöntemi. Belirtilen, bir ana bilgisayar adı veya IP adresi içeren dizeyi kullanarak C++'ta yeni bir IPHostEntry-class örneği oluşturmak için eşzamanlı olmayan bir işlem başlatır."
type: docs
weight: 100
url: /tr/cpp/system.net/dns/begingethostaddresses/
---
## Dns::BeginGetHostAddresses method


Belirtilen ana bilgisayar adı veya IP adresi içeren dizeyi kullanarak yeni bir IPHostEntry-class örneği oluşturmak için eşzamansız bir işlem başlatır.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostAddresses(String hostNameOrAddress, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| hostNameOrAddress | String | Bir ana bilgisayar adı veya IP adresi içeren bir dize. |
| requestCallback | AsyncCallback | İşlem tamamlandığında çağrılacak bir geri arama. |
| durum | System::SharedPtr\<Object\> | Kullanıcı tarafından sağlanan veri, her eşzamansız işlemi benzersiz şekilde tanımlamak için kullanılır. |

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
* Library [Aspose.Page for C++](../../../)
