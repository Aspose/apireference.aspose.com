---
title: "System::Net::WebRequest::RegisterPrefix yöntemi"
linktitle: "RegisterPrefix"
second_title: "Aspose.Page için C++"
description: "System::Net::WebRequest::RegisterPrefix yöntemi. C++'de belirtilen URI için WebRequest türetilmiş sınıfını kaydeder."
type: docs
weight: 600
url: /tr/cpp/system.net/webrequest/registerprefix/
---
## WebRequest::RegisterPrefix method


Belirtilen URI için [WebRequest](../) türetilmiş sınıfını kaydeder.

```cpp
static bool System::Net::WebRequest::RegisterPrefix(String prefix, System::SharedPtr<IWebRequestCreate> creator)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| önek | String | URI veya URI öneki. |
| creator | System::SharedPtr\<IWebRequestCreate\> | Yeni [WebRequest](../) sınıfı örnekleri oluşturur. |

### ReturnValue

Belirtilen URI için [WebRequest](../) türetilmiş sınıfı başarıyla kaydedildiğinde true, aksi takdirde false.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IWebRequestCreate](../../iwebrequestcreate/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
