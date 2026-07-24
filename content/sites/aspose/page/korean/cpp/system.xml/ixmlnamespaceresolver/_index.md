---
title: "System::Xml::IXmlNamespaceResolver 클래스"
linktitle: "IXmlNamespaceResolver"
second_title: "C++용 Aspose.Page"
description: "System::Xml::IXmlNamespaceResolver 클래스. C++에서 접두사 및 네임스페이스 매핑 집합에 대한 읽기 전용 액세스를 제공합니다."
type: docs
weight: 400
url: /ko/cpp/system.xml/ixmlnamespaceresolver/
---
## IXmlNamespaceResolver class


접두사 및 네임스페이스 매핑 집합에 대한 읽기 전용 액세스를 제공합니다.

```cpp
class IXmlNamespaceResolver : public virtual System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) | 현재 범위에 있는 정의된 접두사-네임스페이스 매핑 컬렉션을 반환합니다. |
| virtual [LookupNamespace](./lookupnamespace/)(const String\&) | 지정된 접두사에 매핑된 네임스페이스 URI를 반환합니다. |
| virtual [LookupPrefix](./lookupprefix/)(const String\&) | 지정된 네임스페이스 URI에 매핑된 접두사를 반환합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
