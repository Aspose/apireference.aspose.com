---
title: "System::Web::Services::Protocols::SoapMessage::FindHeader 메서드"
linktitle: "FindHeader"
second_title: "C++용 Aspose.Page"
description: "System::Web::Services::Protocols::SoapMessage::FindHeader 메서드. C++에서 지정된 헤더 유형으로 헤더 매핑을 찾습니다."
type: docs
weight: 300
url: /ko/cpp/system.web.services.protocols/soapmessage/findheader/
---
## SoapMessage::FindHeader method


지정된 헤더 유형으로 헤더 매핑을 찾습니다.

```cpp
System::SharedPtr<SoapHeaderMapping> System::Web::Services::Protocols::SoapMessage::FindHeader(System::ArrayPtr<System::SharedPtr<SoapHeaderMapping>> headersInfo, const TypeInfo &headerType)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| headersInfo | System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\> | 헤더 매핑의 컬렉션입니다. |
| headerType | const TypeInfo\& | 찾을 헤더 유형입니다. |

### ReturnValue

헤더 매핑입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [SoapMessage](../)
* Namespace [System::Web::Services::Protocols](../../)
* Library [Aspose.Page for C++](../../../)
