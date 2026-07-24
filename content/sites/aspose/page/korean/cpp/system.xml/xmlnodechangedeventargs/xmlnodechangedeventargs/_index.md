---
title: "System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs 생성자"
linktitle: "XmlNodeChangedEventArgs"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs 생성자. C++에서 XmlNodeChangedEventArgs 클래스의 새 인스턴스를 초기화합니다."
type: docs
weight: 100
url: /ko/cpp/system.xml/xmlnodechangedeventargs/xmlnodechangedeventargs/
---
## XmlNodeChangedEventArgs::XmlNodeChangedEventArgs constructor


[XmlNodeChangedEventArgs](../) 클래스의 새 인스턴스를 초기화합니다.

```cpp
System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs(const SharedPtr<XmlNode> &node, const SharedPtr<XmlNode> &oldParent, const SharedPtr<XmlNode> &newParent, const String &oldValue, const String &newValue, XmlNodeChangedAction action)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| node | const SharedPtr\<XmlNode\>\& | 이벤트를 발생시킨 [XmlNode](../../xmlnode/)입니다. |
| oldParent | const SharedPtr\<XmlNode\>\& | 이벤트를 발생시킨 [XmlNode](../../xmlnode/)의 이전 부모 [XmlNode](../../xmlnode/)입니다. |
| newParent | const SharedPtr\<XmlNode\>\& | 이벤트를 발생시킨 [XmlNode](../../xmlnode/)의 새로운 부모 [XmlNode](../../xmlnode/)입니다. |
| oldValue | const String\& | 이벤트를 발생시킨 [XmlNode](../../xmlnode/)의 이전 값입니다. |
| newValue | const String\& | 이벤트를 발생시킨 [XmlNode](../../xmlnode/)의 새로운 값입니다. |
| action | XmlNodeChangedAction | 다음은 [XmlNodeChangedAction](../../xmlnodechangedaction/)입니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Enum [XmlNodeChangedAction](../../xmlnodechangedaction/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
