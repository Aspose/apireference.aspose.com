---
title: "System::Xml::XmlElement::RemoveAttributeNode 메서드"
linktitle: "RemoveAttributeNode"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlElement::RemoveAttributeNode 메서드. 지정된 XmlAttribute를 C++에서 제거합니다."
type: docs
weight: 2100
url: /ko/cpp/system.xml/xmlelement/removeattributenode/
---
## XmlElement::RemoveAttributeNode(SharedPtr\<XmlAttribute\>) method


지정된 [XmlAttribute](../../xmlattribute/)을 제거합니다.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::RemoveAttributeNode(SharedPtr<XmlAttribute> oldAttr)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| oldAttr | SharedPtr\<XmlAttribute\> | 제거할 [XmlAttribute](../../xmlattribute/) 노드입니다. 제거된 속성에 기본값이 있는 경우 즉시 대체됩니다. |

### ReturnValue

제거된 [XmlAttribute](../../xmlattribute/) 또는 **oldAttr**가 [XmlElement](../)의 속성 노드가 아닌 경우 **nullptr**입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::RemoveAttributeNode(String, String) method


로컬 이름 및 네임스페이스 URI로 지정된 [XmlAttribute](../../xmlattribute/)을 제거합니다. (제거된 속성에 기본값이 있는 경우 즉시 대체됩니다.)

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::RemoveAttributeNode(String localName, String namespaceURI)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| localName | String | 속성의 로컬 이름입니다. |
| namespaceURI | String | 속성의 네임스페이스 URI입니다. |

### ReturnValue

제거된 [XmlAttribute](../../xmlattribute/) 또는 [XmlElement](../)에 일치하는 속성 노드가 없을 경우 **nullptr**입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
