---
title: "System::Xml::Serialization::XmlSerializer 클래스"
linktitle: "XmlSerializer"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Serialization::XmlSerializer 클래스. 객체를 XML 문서로 직렬화하고 역직렬화합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 600
url: /ko/cpp/system.xml.serialization/xmlserializer/
---
## XmlSerializer class


객체를 XML 문서로 직렬화하고 역직렬화합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class XmlSerializer : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [CanDeserialize](./candeserialize/)(System::SharedPtr\<XmlReader\>) | 특정 리더가 역직렬화 가능한 상태인지 확인합니다. |
| [Deserialize](./deserialize/)(System::SharedPtr\<IO::Stream\>) | XML 문서를 객체로 역직렬화합니다. |
| [Deserialize](./deserialize/)(System::SharedPtr\<IO::TextReader\>) | XML 문서를 객체로 역직렬화합니다. |
| [Deserialize](./deserialize/)(System::SharedPtr\<XmlReader\>) | XML 문서를 객체로 역직렬화합니다. |
| [Deserialize](./deserialize/)(System::SharedPtr\<XmlReader\>, String) | XML 문서를 객체로 역직렬화합니다. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::Stream\>, System::SharedPtr\<Object\>) | 문서를 XML로 직렬화합니다. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::TextWriter\>, System::SharedPtr\<Object\>) | 문서를 XML로 직렬화합니다. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>) | 문서를 XML로 직렬화합니다. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::Stream\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | 문서를 XML로 직렬화합니다. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::TextWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | 문서를 XML로 직렬화합니다. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | 문서를 XML로 직렬화합니다. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>, String) | 문서를 XML로 직렬화합니다. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>, String, String) | 문서를 XML로 직렬화합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [EncodingNamespace](./encodingnamespace/) | 인코딩 네임스페이스 이름. |
| static [WsdlNamespace](./wsdlnamespace/) | RTTI. |
| static [WsdlTypesNamespace](./wsdltypesnamespace/) | WSDL 타입 네임스페이스 이름. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Page for C++](../../)
