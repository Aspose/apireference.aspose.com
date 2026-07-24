---
title: "System::Xml::XmlNodeChangedEventArgs::get_OldValue 메서드"
linktitle: "get_OldValue"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlNodeChangedEventArgs::get_OldValue 메서드. C++에서 노드의 원래 값을 반환합니다."
type: docs
weight: 700
url: /ko/cpp/system.xml/xmlnodechangedeventargs/get_oldvalue/
---
## XmlNodeChangedEventArgs::get_OldValue method


노드의 원래 값을 반환합니다.

```cpp
String System::Xml::XmlNodeChangedEventArgs::get_OldValue()
```


### ReturnValue

노드의 원래 값입니다. 이 메서드는 노드가 속성도 텍스트 노드도 아니거나 노드가 삽입되는 경우 **nullptr**를 반환합니다. **XmlDocument::NodeChanging** 이벤트에서 호출되면, **get_OldValue**는 변경이 성공했을 때 교체될 현재 노드 값을 반환합니다. **XmlDocument::NodeChanged** 이벤트에서 호출되면, **get_OldValue**는 변경 이전의 노드 값을 반환합니다.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
