---
title: "System::Xml::XmlElement::HasAttribute 메서드"
linktitle: "HasAttribute"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlElement::HasAttribute 메서드. C++에서 현재 노드가 지정된 로컬 이름 및 네임스페이스 URI를 가진 속성을 가지고 있는지 확인합니다."
type: docs
weight: 1600
url: /ko/cpp/system.xml/xmlelement/hasattribute/
---
## XmlElement::HasAttribute(String, String) method


현재 노드에 지정된 로컬 이름 및 네임스페이스 URI를 가진 속성이 있는지 확인합니다.

```cpp
virtual bool System::Xml::XmlElement::HasAttribute(String localName, String namespaceURI)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| localName | String | 찾을 속성의 로컬 이름. |
| namespaceURI | String | 찾을 속성의 네임스페이스 URI. |

### ReturnValue

**true** if the current node has the specified attribute; otherwise, **false**.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::HasAttribute(String) method


현재 노드에 지정된 이름을 가진 속성이 있는지 확인합니다.

```cpp
virtual bool System::Xml::XmlElement::HasAttribute(String name)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 찾을 속성의 이름. 이는 한정된 이름이며, 일치하는 노드의 **get_Name** 값과 비교됩니다. |

### ReturnValue

**true** if the current node has the specified attribute; otherwise, **false**.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
