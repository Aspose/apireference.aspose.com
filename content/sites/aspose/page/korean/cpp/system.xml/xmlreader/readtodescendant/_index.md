---
title: "System::Xml::XmlReader::ReadToDescendant 메서드"
linktitle: "ReadToDescendant"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlReader::ReadToDescendant 메서드. C++에서 지정된 로컬 이름과 네임스페이스 URI를 가진 다음 하위 요소로 XmlReader를 이동합니다."
type: docs
weight: 7100
url: /ko/cpp/system.xml/xmlreader/readtodescendant/
---
## XmlReader::ReadToDescendant(String, String) method


지정된 로컬 이름 및 네임스페이스 URI를 가진 다음 하위 요소로 [XmlReader](../)를 이동합니다.

```cpp
virtual bool System::Xml::XmlReader::ReadToDescendant(String localName, String namespaceURI)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| localName | String | 이동하려는 요소의 로컬 이름입니다. |
| namespaceURI | String | 이동하려는 요소의 네임스페이스 URI입니다. |

### ReturnValue

**true** if a matching descendant element is found; otherwise **false**. If a matching child element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the element. If the [XmlReader](../) is not positioned on an element when [XmlReader::ReadToDescendant(String,String)](./) was called, this method returns **false** and the position of the [XmlReader](../) is not changed.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadToDescendant(String) method


지정된 정규화된 이름을 가진 다음 하위 요소로 [XmlReader](../)를 이동합니다.

```cpp
virtual bool System::Xml::XmlReader::ReadToDescendant(String name)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 이동하려는 요소의 정규화된 이름입니다. |

### ReturnValue

**true** if a matching descendant element is found; otherwise **false**. If a matching child element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the element. If the [XmlReader](../) is not positioned on an element when [XmlReader::ReadToDescendant(String)](./) was called, this method returns **false** and the position of the [XmlReader](../) is not changed.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
