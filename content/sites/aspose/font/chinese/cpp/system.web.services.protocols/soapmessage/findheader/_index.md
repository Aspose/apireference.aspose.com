---
title: "System::Web::Services::Protocols::SoapMessage::FindHeader 方法"
linktitle: "FindHeader"
second_title: "Aspose.Font 适用于 C++"
description: "System::Web::Services::Protocols::SoapMessage::FindHeader 方法。通过指定的标头类型在 C++ 中查找标头映射。"
type: docs
weight: 300
url: /zh/cpp/system.web.services.protocols/soapmessage/findheader/
---
## SoapMessage::FindHeader method


通过指定的标头类型查找标头映射。

```cpp
System::SharedPtr<SoapHeaderMapping> System::Web::Services::Protocols::SoapMessage::FindHeader(System::ArrayPtr<System::SharedPtr<SoapHeaderMapping>> headersInfo, const TypeInfo &headerType)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| headersInfo | System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\> | 标头映射的集合。 |
| headerType | const TypeInfo\& | 要查找的标头类型。 |

### ReturnValue

标头映射。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [SoapMessage](../)
* Namespace [System::Web::Services::Protocols](../../)
* Library [Aspose.Font for C++](../../../)
