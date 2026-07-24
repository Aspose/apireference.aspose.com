---
title: "System::Xml::XmlElement::SetAttributeNode 메서드"
linktitle: "SetAttributeNode"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlElement::SetAttributeNode method. 지정된 XmlAttribute를 C++에서 추가합니다."
type: docs
weight: 2700
url: /ko/cpp/system.xml/xmlelement/setattributenode/
---
## XmlElement::SetAttributeNode(SharedPtr\<XmlAttribute\>) method


지정된 [XmlAttribute](../../xmlattribute/)을 추가합니다.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::SetAttributeNode(SharedPtr<XmlAttribute> newAttr)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| newAttr | SharedPtr\<XmlAttribute\> | 이 요소의 속성 컬렉션에 추가할 [XmlAttribute](../../xmlattribute/) 노드입니다. |

### ReturnValue

속성이 동일한 이름의 기존 속성을 교체하면, 이전 [XmlAttribute](../../xmlattribute/)이 반환됩니다; 그렇지 않으면 **nullptr**이 반환됩니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::SetAttributeNode(String, String) method


지정된 [XmlAttribute](../../xmlattribute/)을 추가합니다.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::SetAttributeNode(String localName, String namespaceURI)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| localName | String | 속성의 로컬 이름입니다. |
| namespaceURI | String | 속성의 네임스페이스 URI입니다. |

### ReturnValue

추가할 [XmlAttribute](../../xmlattribute/)입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
