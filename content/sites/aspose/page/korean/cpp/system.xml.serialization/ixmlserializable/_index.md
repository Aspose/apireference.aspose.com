---
title: "System::Xml::Serialization::IXmlSerializable 클래스"
linktitle: "IXmlSerializable"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Serialization::IXmlSerializable 클래스. XML 직렬화 및 역직렬화를 위한 사용자 지정 포맷을 제공합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오. C++에서."
type: docs
weight: 100
url: /ko/cpp/system.xml.serialization/ixmlserializable/
---
## IXmlSerializable class


XML 직렬화 및 역직렬화를 위한 사용자 지정 포맷을 제공합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

```cpp
class IXmlSerializable : public virtual System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [GetSchema](./getschema/)() | [WriteXml()](./writexml/) 메서드가 반환하고 [ReadXml()](./readxml/) 메서드가 수락하는 객체의 XML 표현을 설명하는 XmlSchema 객체. |
| virtual [ReadXml](./readxml/)(System::SharedPtr\<System::Xml::XmlReader\>) | 객체를 XML 표현으로부터 역직렬화합니다. |
| virtual [WriteXml](./writexml/)(System::SharedPtr\<System::Xml::XmlWriter\>) | 현재 객체를 XML 표현으로 직렬화합니다. |
| virtual [~IXmlSerializable](./~ixmlserializable/)() | 소멸자. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Page for C++](../../)
