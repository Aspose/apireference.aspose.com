---
title: "System::Xml::XmlReaderSettings::get_NameTable 메서드"
linktitle: "get_NameTable"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlReaderSettings::get_NameTable 메서드. C++에서 원자화된 문자열 비교에 사용되는 XmlNameTable을 반환합니다."
type: docs
weight: 1500
url: /ko/cpp/system.xml/xmlreadersettings/get_nametable/
---
## XmlReaderSettings::get_NameTable method


원자화된 문자열 비교에 사용되는 [XmlNameTable](../../xmlnametable/)을 반환합니다.

```cpp
SharedPtr<XmlNameTable> System::Xml::XmlReaderSettings::get_NameTable()
```


### ReturnValue

[XmlNameTable](../../xmlnametable/)은 이 [XmlReaderSettings](../) 객체를 사용하여 생성된 모든 [XmlReader](../../xmlreader/) 인스턴스가 사용하는 모든 원자화된 문자열을 저장합니다. 기본값은 **nullptr**입니다. 생성된 [XmlReader](../../xmlreader/) 인스턴스는 이 값이 **nullptr**인 경우 새 빈 [NameTable](../../nametable/)을 사용합니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlReaderSettings](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
