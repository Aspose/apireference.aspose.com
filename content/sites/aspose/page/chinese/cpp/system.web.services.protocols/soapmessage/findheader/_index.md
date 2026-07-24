---
title: "System::Web::Services::Protocols::SoapMessage::FindHeader method"
linktitle: "FindHeader"
second_title: "Aspose.Page 适用于 C++"
description: "System::Web::Services::Protocols::SoapMessage::FindHeader 方法。根据指定的头类型在 C++ 中查找头映射。"
type: docs
weight: 300
url: /zh/cpp/system.web.services.protocols/soapmessage/findheader/
---
## SoapMessage::FindHeader method


通过指定的头类型查找头映射。

```cpp
System::SharedPtr<SoapHeaderMapping> System::Web::Services::Protocols::SoapMessage::FindHeader(System::ArrayPtr<System::SharedPtr<SoapHeaderMapping>> headersInfo, const TypeInfo &headerType)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| headersInfo | System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\> | 头映射的集合。 |
| headerType | const TypeInfo\& | 要查找的头类型。 |

### ReturnValue

头映射。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [SoapMessage](../)
* Namespace [System::Web::Services::Protocols](../../)
* Library [Aspose.Page for C++](../../../)
