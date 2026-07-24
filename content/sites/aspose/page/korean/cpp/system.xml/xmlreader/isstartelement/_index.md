---
title: "System::Xml::XmlReader::IsStartElement 메서드"
linktitle: "IsStartElement"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlReader::IsStartElement 메서드. XmlReader::MoveToContent를 호출하고 현재 콘텐츠 노드가 시작 태그인지 빈 요소 태그인지 C++에서 테스트합니다."
type: docs
weight: 3000
url: /ko/cpp/system.xml/xmlreader/isstartelement/
---
## XmlReader::IsStartElement() method


[XmlReader::MoveToContent](../movetocontent/)를 호출하고 현재 콘텐츠 노드가 시작 태그인지 빈 요소 태그인지 테스트합니다.

```cpp
virtual bool System::Xml::XmlReader::IsStartElement()
```


### ReturnValue

**true** if [XmlReader::MoveToContent](../movetocontent/) finds a start tag or empty element tag; **false** if a node type other than [XmlNodeType::Element](../../xmlnodetype/) was found.

## 또 보기

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::IsStartElement(String, String) method


[XmlReader::MoveToContent](../movetocontent/)를 호출하고 현재 콘텐츠 노드가 시작 태그인지 빈 요소 태그인지, 그리고 찾은 요소의 [XmlReader::get_LocalName](../get_localname/) 및 [XmlReader::get_NamespaceURI](../get_namespaceuri/) 값이 주어진 문자열과 일치하는지 테스트합니다.

```cpp
virtual bool System::Xml::XmlReader::IsStartElement(String localname, String ns)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| localname | String | 찾은 요소의 **LocalName** 값과 일치시킬 문자열입니다. |
| ns | String | 찾은 요소의 **NamespaceURI** 값과 일치시킬 문자열입니다. |

### ReturnValue

**true** if the resulting node is an element. **false** if a node type other than [XmlNodeType::Element](../../xmlnodetype/) was found or if the **LocalName** and **NamespaceURI** values of the element do not match the specified strings.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::IsStartElement(String) method


[XmlReader::MoveToContent](../movetocontent/)를 호출하고 현재 콘텐츠 노드가 시작 태그인지 빈 요소 태그인지, 그리고 찾은 요소의 [XmlReader::get_Name](../get_name/) 값이 주어진 인수와 일치하는지 테스트합니다.

```cpp
virtual bool System::Xml::XmlReader::IsStartElement(String name)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 찾은 요소의 **Name** 값과 일치시킨 문자열입니다. |

### ReturnValue

**true** if the resulting node is an element and the **Name** value matches the specified string. **false** if a node type other than [XmlNodeType::Element](../../xmlnodetype/) was found or if the element **Name** value does not match the specified string.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
