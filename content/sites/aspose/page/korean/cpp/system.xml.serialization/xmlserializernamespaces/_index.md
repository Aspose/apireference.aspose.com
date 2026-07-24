---
title: "System::Xml::Serialization::XmlSerializerNamespaces 클래스"
linktitle: "XmlSerializerNamespaces"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Serialization::XmlSerializerNamespaces 클래스. C++에서 XML 문서 인스턴스에 대한 정규화된 이름을 생성하기 위해 Serialization::XmlSerializer가 사용하는 XML 네임스페이스와 접두사를 포함합니다."
type: docs
weight: 800
url: /ko/cpp/system.xml.serialization/xmlserializernamespaces/
---
## XmlSerializerNamespaces class


XML 문서 인스턴스에 대한 정규화된 이름을 생성하기 위해 [Serialization::XmlSerializer](../xmlserializer/)가 사용하는 XML 네임스페이스와 접두사를 포함합니다.

```cpp
class XmlSerializerNamespaces : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(const String\&, const String\&) | 접두사와 네임스페이스 쌍을 [Serialization::XmlSerializerNamespaces](./) 객체에 추가합니다. |
| [get_Count](./get_count/)() | 컬렉션에 있는 접두사와 네임스페이스 쌍의 수를 반환합니다. |
| [get_NamespaceList](./get_namespacelist/)() |  |
| [get_Namespaces](./get_namespaces/)() |  |
| [set_Namespaces](./set_namespaces/)(const SharedPtr\<Collections::Generic::Dictionary\<String, String\>\>\&) |  |
| [ToArray](./toarray/)() | [Serialization::XmlSerializerNamespaces](./) 객체에 있는 접두사와 네임스페이스 쌍의 배열을 반환합니다. |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)() | [Serialization::XmlSerializerNamespaces](./) 클래스의 새 인스턴스를 초기화합니다. |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)(const SharedPtr\<XmlSerializerNamespaces\>\&) | [Serialization::XmlSerializerNamespaces](./) 클래스의 새 인스턴스를 초기화합니다. 접두사와 네임스페이스 쌍 컬렉션을 포함하는 지정된 **[XmlSerializerNamespaces](./)** 인스턴스를 사용합니다. |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)(const ArrayPtr\<SharedPtr\<XmlQualifiedName\>\>\&) | [Serialization::XmlSerializerNamespaces](./) 클래스의 새 인스턴스를 초기화합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Page for C++](../../)
