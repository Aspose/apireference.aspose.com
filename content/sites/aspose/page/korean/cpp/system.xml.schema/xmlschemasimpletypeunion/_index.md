---
title: "System::Xml::Schema::XmlSchemaSimpleTypeUnion 클래스"
linktitle: "XmlSchemaSimpleTypeUnion"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaSimpleTypeUnion 클래스. XML 스키마에서 단순 타입을 위한 union 요소를 World Wide Web Consortium (W3C)에서 지정한 대로 나타냅니다. union 데이터 타입은 simpleType의 내용을 지정하는 데 사용할 수 있습니다. simpleType 요소의 값은 union에서 지정된 대체 데이터 타입 집합 중 하나여야 합니다. Union 타입은 항상 파생 타입이며 C++에서 최소 두 개 이상의 대체 데이터 타입을 포함해야 합니다."
type: docs
weight: 6600
url: /ko/cpp/system.xml.schema/xmlschemasimpletypeunion/
---
## XmlSchemaSimpleTypeUnion class


XML [Schema](../)에서 단순 타입을 위한 **union** 요소를 World Wide [Web](../../system.web/) Consortium (W3C)에서 지정한 대로 나타냅니다. **union** 데이터 타입은 **simpleType**의 내용을 지정하는 데 사용할 수 있습니다. **simpleType** 요소의 값은 union에서 지정된 대체 데이터 타입 집합 중 하나여야 합니다. Union 타입은 항상 파생 타입이며 최소 두 개 이상의 대체 데이터 타입을 포함해야 합니다.

```cpp
class XmlSchemaSimpleTypeUnion : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_BaseMemberTypes](./get_basemembertypes/)() | simple type의 [XmlSchemaSimpleType](../xmlschemasimpletype/) 객체 배열을 반환합니다. 이 배열은 **simpleType** 요소의 유형을 [XmlSchemaSimpleTypeUnion::get_BaseTypes](./get_basetypes/) 및 [XmlSchemaSimpleTypeUnion::get_MemberTypes](./get_membertypes/) 값에 기반하여 나타냅니다. |
| [get_BaseTypes](./get_basetypes/)() | 기본 타입들의 컬렉션을 반환합니다. |
| [get_MemberTypes](./get_membertypes/)() | 이 스키마(또는 지정된 네임스페이스에 의해 지정된 다른 스키마)에서 정의된 내장 데이터 형식 또는 **simpleType** 요소의 한정된 멤버 이름 배열을 반환합니다. |
| [set_MemberTypes](./set_membertypes/)(const ArrayPtr\<SharedPtr\<XmlQualifiedName\>\>\&) | 이 스키마(또는 지정된 네임스페이스에 의해 지정된 다른 스키마)에서 정의된 내장 데이터 형식 또는 **simpleType** 요소의 한정된 멤버 이름 배열을 설정합니다. |
| [XmlSchemaSimpleTypeUnion](./xmlschemasimpletypeunion/)() | 새로운 [XmlSchemaSimpleTypeUnion](./) 클래스 인스턴스를 초기화합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [XmlSchemaSimpleTypeContent](../xmlschemasimpletypecontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
