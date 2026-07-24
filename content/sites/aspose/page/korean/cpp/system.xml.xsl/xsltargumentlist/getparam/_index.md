---
title: "System::Xml::Xsl::XsltArgumentList::GetParam 메서드"
linktitle: "GetParam"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Xsl::XsltArgumentList::GetParam 메서드. C++에서 네임스페이스가 지정된 이름과 연결된 매개변수를 반환합니다."
type: docs
weight: 600
url: /ko/cpp/system.xml.xsl/xsltargumentlist/getparam/
---
## XsltArgumentList::GetParam method


네임스페이스 한정 이름과 연결된 매개변수를 반환합니다.

```cpp
SharedPtr<Object> System::Xml::Xsl::XsltArgumentList::GetParam(const String &name, const String &namespaceUri)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | const String\& | 매개변수의 이름입니다. [XsltArgumentList](../)은 전달된 이름이 유효한 로컬 이름인지 확인하지 않지만, 이름은 **nullptr**일 수 없습니다. |
| namespaceUri | const String\& | 매개변수와 연결된 네임스페이스 URI. |

### ReturnValue

매개변수 객체, 찾지 못한 경우 **nullptr**.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XsltArgumentList](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
