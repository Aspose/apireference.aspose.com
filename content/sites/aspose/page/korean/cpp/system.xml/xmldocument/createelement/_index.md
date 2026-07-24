---
title: "System::Xml::XmlDocument::CreateElement method"
linktitle: "CreateElement"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlDocument::CreateElement 메서드. 지정된 이름으로 C++에서 요소를 생성합니다."
type: docs
weight: 800
url: /ko/cpp/system.xml/xmldocument/createelement/
---
## XmlDocument::CreateElement(const String\&) method


지정된 이름으로 요소를 생성합니다.

```cpp
SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &name)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | const String\& | 요소의 정규화된 이름입니다. 이름에 콜론이 포함된 경우 [XmlNode::get_Prefix](../../xmlnode/get_prefix/) 값은 콜론 앞 부분을, [XmlDocument::get_LocalName](../get_localname/) 값은 콜론 뒤 부분을 나타냅니다. 정규화된 이름에는 **xmlns** 접두사를 포함할 수 없습니다. |

### ReturnValue

새 [XmlElement](../../xmlelement/)입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateElement(const String\&, const String\&, const String\&) method


지정된 [XmlNode::get_Prefix](../../xmlnode/get_prefix/), [XmlDocument::get_LocalName](../get_localname/), 및 [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/)을 사용하여 요소를 생성합니다.

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &prefix, const String &localName, const String &namespaceURI)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| prefix | const String\& | 새 요소의 접두사(있는 경우)입니다. [String::Empty](../../../system/string/empty/)와 **nullptr**는 동일합니다. |
| localName | const String\& | 새 요소의 로컬 이름입니다. |
| namespaceURI | const String\& | 새 요소의 네임스페이스 URI (있는 경우). [String::Empty](../../../system/string/empty/) 및 **nullptr**는 동등합니다. |

### ReturnValue

새 [XmlElement](../../xmlelement/)입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateElement(const String\&, const String\&) method


[XmlElement](../../xmlelement/)을 정규화된 이름과 [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/)와 함께 생성합니다.

```cpp
SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &qualifiedName, const String &namespaceURI)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| qualifiedName | const String\& | 요소의 정규화된 이름입니다. 이름에 콜론이 포함되어 있으면 [XmlNode::get_Prefix](../../xmlnode/get_prefix/) 값은 콜론 앞부분을, [XmlDocument::get_LocalName](../get_localname/) 값은 콜론 뒤부분을 반영합니다. 정규화된 이름에는 **xmlns** 접두사가 포함될 수 없습니다. |
| namespaceURI | const String\& | 요소의 네임스페이스 URI. |

### ReturnValue

새 [XmlElement](../../xmlelement/)입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
