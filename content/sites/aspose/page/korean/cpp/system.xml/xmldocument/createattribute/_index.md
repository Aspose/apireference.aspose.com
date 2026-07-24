---
title: "System::Xml::XmlDocument::CreateAttribute 메서드"
linktitle: "CreateAttribute"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlDocument::CreateAttribute 메서드. C++에서 지정된 이름을 가진 XmlAttribute를 생성합니다."
type: docs
weight: 300
url: /ko/cpp/system.xml/xmldocument/createattribute/
---
## XmlDocument::CreateAttribute(const String\&) method


지정된 이름을 가진 [XmlAttribute](../../xmlattribute/)을 생성합니다.

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &name)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | const String\& | 속성의 정규화된 이름입니다. 이름에 콜론이 포함된 경우, [XmlNode::get_Prefix](../../xmlnode/get_prefix/) 값은 첫 번째 콜론 앞부분을 반영하고, [XmlDocument::get_LocalName](../get_localname/) 값은 첫 번째 콜론 뒤부분을 반영합니다. [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/)는 접두사가 **xmlns**과 같은 인식된 내장 접두사가 아닌 한 비어 있습니다. 이 경우 get_NamespaceURI는 [http://www.w3.org/2000/xmlns/](http://www.w3.org/2000/xmlns/) 값을 가집니다. |

### ReturnValue

새로운 [XmlAttribute](../../xmlattribute/)입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateAttribute(const String\&, const String\&, const String\&) method


지정된 [XmlNode::get_Prefix](../../xmlnode/get_prefix/), [XmlDocument::get_LocalName](../get_localname/), 및 [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/)를 사용하여 [XmlAttribute](../../xmlattribute/)를 생성합니다.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &prefix, const String &localName, const String &namespaceURI)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| prefix | const String\& | 속성의 접두사(있는 경우). [String::Empty](../../../system/string/empty/)와 **nullptr**는 동등합니다. |
| localName | const String\& | 속성의 로컬 이름입니다. |
| namespaceURI | const String\& | 속성의 네임스페이스 URI(있는 경우). [String::Empty](../../../system/string/empty/)와 **nullptr**는 동등합니다. **prefix**가 **xmlns**인 경우, 이 매개변수는 [http://www.w3.org/2000/xmlns/;](http://www.w3.org/2000/xmlns/;)이어야 하며, 그렇지 않으면 예외가 발생합니다. |

### ReturnValue

새로운 [XmlAttribute](../../xmlattribute/)입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateAttribute(const String\&, const String\&) method


지정된 정규화된 이름과 [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/)를 사용하여 [XmlAttribute](../../xmlattribute/)를 생성합니다.

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &qualifiedName, const String &namespaceURI)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| qualifiedName | const String\& | 속성의 정규화된 이름입니다. 이름에 콜론이 포함된 경우, [XmlNode::get_Prefix](../../xmlnode/get_prefix/) 값은 콜론 앞부분을 반영하고, [XmlDocument::get_LocalName](../get_localname/) 값은 콜론 뒤부분을 반영합니다. |
| namespaceURI | const String\& | 속성의 namespaceURI입니다. 정규화된 이름에 **xmlns** 접두사가 포함된 경우, 이 매개변수는 [http://www.w3.org/2000/xmlns/](http://www.w3.org/2000/xmlns/)이어야 합니다. |

### ReturnValue

새로운 [XmlAttribute](../../xmlattribute/)입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
