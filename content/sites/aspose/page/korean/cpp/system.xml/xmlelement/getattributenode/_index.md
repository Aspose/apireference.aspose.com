---
title: "System::Xml::XmlElement::GetAttributeNode 메서드"
linktitle: "GetAttributeNode"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlElement::GetAttributeNode 메서드. C++에서 지정된 로컬 이름 및 네임스페이스 URI를 가진 XmlAttribute를 반환합니다."
type: docs
weight: 1400
url: /ko/cpp/system.xml/xmlelement/getattributenode/
---
## XmlElement::GetAttributeNode(String, String) method


지정된 로컬 이름 및 네임스페이스 URI를 가진 [XmlAttribute](../../xmlattribute/)를 반환합니다.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::GetAttributeNode(String localName, String namespaceURI)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| localName | String | 속성의 로컬 이름입니다. |
| namespaceURI | String | 속성의 네임스페이스 URI입니다. |

### ReturnValue

일치하는 속성을 찾지 못한 경우 **nullptr**인 지정된 [XmlAttribute](../../xmlattribute/).

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::GetAttributeNode(String) method


지정된 이름을 가진 [XmlAttribute](../../xmlattribute/)를 반환합니다.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::GetAttributeNode(String name)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 검색할 속성의 이름. 이는 한정된 이름이며, 일치하는 노드의 **get_Name** 값과 비교됩니다. |

### ReturnValue

일치하는 속성을 찾지 못한 경우 **nullptr**인 지정된 [XmlAttribute](../../xmlattribute/).

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
