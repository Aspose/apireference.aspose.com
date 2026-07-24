---
title: "System::Net::Dns::BeginGetHostByName yöntemi"
linktitle: "BeginGetHostByName"
second_title: "Aspose.Page için C++"
description: "System::Net::Dns::BeginGetHostByName yöntemi. C++'ta belirtilen ana bilgisayar adını kullanarak yeni bir IPHostEntry-class örneği oluşturmak için eşzamansız bir işlem başlatır."
type: docs
weight: 200
url: /tr/cpp/system.net/dns/begingethostbyname/
---
## Dns::BeginGetHostByName method


Belirtilen ana bilgisayar adını kullanarak yeni bir IPHostEntry-class örneği oluşturmak için eşzamansız bir işlem başlatır.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostByName(String hostName, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| hostName | String | Bir ana bilgisayar adı. |
| requestCallback | AsyncCallback | İşlem tamamlandığında çağrılacak bir geri arama. |
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
* Library [Aspose.Page for C++](../../../)
