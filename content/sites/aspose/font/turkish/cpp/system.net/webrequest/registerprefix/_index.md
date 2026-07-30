---
title: "System::Net::WebRequest::RegisterPrefix yöntemi"
linktitle: "RegisterPrefix"
second_title: "Aspose.Font için C++"
description: "System::Net::WebRequest::RegisterPrefix yöntemi. C++'da belirtilen URI için WebRequest türevini kaydeder."
type: docs
weight: 600
url: /tr/cpp/system.net/webrequest/registerprefix/
---
## WebRequest::RegisterPrefix method


Belirtilen URI için [WebRequest](../) türevini kaydeder.

```cpp
static bool System::Net::WebRequest::RegisterPrefix(String prefix, System::SharedPtr<IWebRequestCreate> creator)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| önek | Dize | URI veya URI öneki. |
| creator | System::SharedPtr\<IWebRequestCreate\> | [WebRequest](../) sınıfının yeni örneklerini oluşturur. |

### ReturnValue

Belirtilen URI için [WebRequest](../) türevi başarıyla kaydedildiğinde doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IWebRequestCreate](../../iwebrequestcreate/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
