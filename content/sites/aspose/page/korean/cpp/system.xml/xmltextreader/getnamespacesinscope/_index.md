---
title: "System::Xml::XmlTextReader::GetNamespacesInScope 메서드"
linktitle: "GetNamespacesInScope"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlTextReader::GetNamespacesInScope 메서드. 현재 C++에서 범위 내에 있는 모든 네임스페이스를 포함하는 컬렉션을 반환합니다."
type: docs
weight: 3400
url: /ko/cpp/system.xml/xmltextreader/getnamespacesinscope/
---
## XmlTextReader::GetNamespacesInScope method


현재 범위에 있는 모든 네임스페이스를 포함하는 컬렉션을 반환합니다.

```cpp
SharedPtr<Collections::Generic::IDictionary<String, String>> System::Xml::XmlTextReader::GetNamespacesInScope(XmlNamespaceScope scope) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| scope | XmlNamespaceScope | 반환할 네임스페이스 노드 유형을 지정하는 [XmlNamespaceScope](../../xmlnamespacescope/) 값입니다. |

### ReturnValue

현재 범위 내에 있는 모든 네임스페이스를 포함하는 IDictionary 객체입니다. 리더가 요소에 위치하지 않은 경우 빈 사전(네임스페이스 없음)이 반환됩니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [String](../../../system/string/)
* Enum [XmlNamespaceScope](../../xmlnamespacescope/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
