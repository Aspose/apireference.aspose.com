---
title: "System::Xml::XmlReader::ReadToNextSibling 메서드"
linktitle: "ReadToNextSibling"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlReader::ReadToNextSibling 메서드. C++에서 지정된 로컬 이름과 네임스페이스 URI를 가진 다음 형제 요소로 XmlReader를 이동시킵니다."
type: docs
weight: 7300
url: /ko/cpp/system.xml/xmlreader/readtonextsibling/
---
## XmlReader::ReadToNextSibling(String, String) method


지정된 로컬 이름과 네임스페이스 URI를 가진 다음 형제 요소로 [XmlReader](../)를 이동시킵니다.

```cpp
virtual bool System::Xml::XmlReader::ReadToNextSibling(String localName, String namespaceURI)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| localName | String | 이동하려는 형제 요소의 로컬 이름입니다. |
| namespaceURI | String | 이동하려는 형제 요소의 네임스페이스 URI입니다. |

### ReturnValue

**true** if a matching sibling element is found; otherwise, **false**. If a matching sibling element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the parent element.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadToNextSibling(String) method


지정된 정규화된 이름을 가진 다음 형제 요소로 [XmlReader](../)를 이동시킵니다.

```cpp
virtual bool System::Xml::XmlReader::ReadToNextSibling(String name)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 이동하려는 형제 요소의 정규화된 이름입니다. |

### ReturnValue

**true** if a matching sibling element is found; otherwise **false**. If a matching sibling element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the parent element.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
