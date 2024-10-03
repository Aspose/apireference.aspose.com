---
title: System::Web::Services::Protocols::SoapMessage::FindHeader method
linktitle: FindHeader
second_title: Aspose.Page for C++
description: 'System::Web::Services::Protocols::SoapMessage::FindHeader method. Find the header mapping by specified header type in C++.'
type: docs
weight: 2800
url: /cpp/system.web.services.protocols/soapmessage/findheader/
---
## SoapMessage::FindHeader method


Find the header mapping by specified header type.

```cpp
System::SharedPtr<SoapHeaderMapping> System::Web::Services::Protocols::SoapMessage::FindHeader(System::ArrayPtr<System::SharedPtr<SoapHeaderMapping>> headersInfo, const TypeInfo &headerType)
```


| Parameter | Type | Description |
| --- | --- | --- |
| headersInfo | System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\> | The collection of the header mappings. |
| headerType | const TypeInfo\& | The header type to look for. |

### ReturnValue

The header mapping.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [SoapMessage](../)
* Namespace [System::Web::Services::Protocols](../../)
* Library [Aspose.Page for C++](../../../)
