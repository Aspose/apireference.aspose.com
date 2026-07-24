---
title: "System::Xml::XmlNamespaceManager::GetNamespacesInScope 메서드"
linktitle: "GetNamespacesInScope"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlNamespaceManager::GetNamespacesInScope 메서드. 현재 C++에서 범위에 있는 네임스페이스를 열거하는 데 사용할 수 있는, 접두사별로 키가 지정된 네임스페이스 이름 컬렉션을 반환합니다."
type: docs
weight: 600
url: /ko/cpp/system.xml/xmlnamespacemanager/getnamespacesinscope/
---
## XmlNamespaceManager::GetNamespacesInScope method


현재 범위에 있는 네임스페이스를 열거하는 데 사용할 수 있는 접두사별 키가 있는 네임스페이스 이름 컬렉션을 반환합니다.

```cpp
SharedPtr<Collections::Generic::IDictionary<String, String>> System::Xml::XmlNamespaceManager::GetNamespacesInScope(XmlNamespaceScope scope) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 범위 | XmlNamespaceScope | 반환할 네임스페이스 노드 유형을 지정하는 열거값입니다. |

### ReturnValue

현재 범위에 있는 네임스페이스와 접두사 쌍의 컬렉션입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [String](../../../system/string/)
* Enum [XmlNamespaceScope](../../xmlnamespacescope/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
