---
title: "System::Xml::XmlWriter::WriteNode 메서드"
linktitle: "WriteNode"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlWriter::WriteNode 메서드. 파생 클래스에서 재정의될 경우, 리더에서 라이터로 모든 내용을 복사하고 리더를 다음 형제의 시작으로 이동시킵니다(C++)."
type: docs
weight: 2600
url: /ko/cpp/system.xml/xmlwriter/writenode/
---
## XmlWriter::WriteNode(SharedPtr\<XmlReader\>, bool) method


파생 클래스에서 재정의될 때, 리더의 모든 내용을 라이터로 복사하고 리더를 다음 형제의 시작 위치로 이동합니다.

```cpp
virtual void System::Xml::XmlWriter::WriteNode(SharedPtr<XmlReader> reader, bool defattr)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| reader | SharedPtr\<XmlReader\> | 읽어올 [XmlReader](../../xmlreader/). |
| defattr | bool | 기본 속성을 [XmlReader](../../xmlreader/)에서 복사하려면 **true**; 그렇지 않으면 **false**. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../xmlreader/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::WriteNode(SharedPtr\<XPath::XPathNavigator\>, bool) method


XPathNavigator 객체의 모든 내용을 라이터로 복사합니다. XPathNavigator의 위치는 변경되지 않습니다.

```cpp
virtual void System::Xml::XmlWriter::WriteNode(SharedPtr<XPath::XPathNavigator> navigator, bool defattr)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 네비게이터 | SharedPtr\<XPath::XPathNavigator\> | 복사할 XPathNavigator. |
| defattr | bool | **true**를 사용하면 기본 속성을 복사하고; 그렇지 않으면 **false**. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
