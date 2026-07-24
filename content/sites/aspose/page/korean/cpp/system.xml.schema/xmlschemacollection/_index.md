---
title: "System::Xml::Schema::XmlSchemaCollection 클래스"
linktitle: "XmlSchemaCollection"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaCollection 클래스. C++에서 XML 스키마 정의 언어 (XSD) 및 XML-Data Reduced (XDR) 스키마의 캐시를 포함합니다."
type: docs
weight: 1500
url: /ko/cpp/system.xml.schema/xmlschemacollection/
---
## XmlSchemaCollection class


XML [Schema](../) 정의 언어 (XSD) 및 XML-Data Reduced (XDR) 스키마의 캐시를 포함합니다.

```cpp
class XmlSchemaCollection : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::Schema::XmlSchema>>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(const String\&, const String\&) | 지정된 URL로 위치한 스키마를 스키마 컬렉션에 추가합니다. |
| [Add](./add/)(const String\&, const SharedPtr\<XmlReader\>\&) | [XmlReader](../../system.xml/xmlreader/)에 포함된 스키마를 스키마 컬렉션에 추가합니다. |
| [Add](./add/)(const String\&, const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | [XmlReader](../../system.xml/xmlreader/)에 포함된 스키마를 스키마 컬렉션에 추가합니다. 지정된 [XmlResolver](../../system.xml/xmlresolver/)가 외부 리소스를 해결하는 데 사용됩니다. |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&) | [XmlSchema](../xmlschema/)을 컬렉션에 추가합니다. |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | [XmlSchema](../xmlschema/)을 컬렉션에 추가합니다. 지정된 [XmlResolver](../../system.xml/xmlresolver/)가 외부 참조를 해결하는 데 사용됩니다. |
| [Add](./add/)(const SharedPtr\<XmlSchemaCollection\>\&) | 주어진 컬렉션에 정의된 모든 네임스페이스(연관된 스키마 포함)를 이 컬렉션에 추가합니다. |
| [Contains](./contains/)(const SharedPtr\<XmlSchema\>\&) | 지정된 [XmlSchema](../xmlschema/)의 **targetNamespace**가 컬렉션에 있는지 여부를 나타내는 값을 반환합니다. |
| [Contains](./contains/)(const String\&) | 지정된 네임스페이스를 가진 스키마가 컬렉션에 있는지 여부를 나타내는 값을 반환합니다. |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchema\>\>\&, int32_t) | 이 컬렉션의 모든 [XmlSchema](../xmlschema/) 객체를 지정된 인덱스부터 시작하여 주어진 배열에 복사합니다. |
| [get_Count](./get_count/)() | 이 컬렉션에 정의된 네임스페이스 수를 반환합니다. |
| [get_NameTable](./get_nametable/)() | 새 스키마를 로드할 때 [XmlSchemaCollection](./)이 사용하는 기본 [XmlNameTable](../../system.xml/xmlnametable/)을 반환합니다. |
| [GetEnumerator](./getenumerator/)() override | 스키마 컬렉션을 반복할 수 있는 지원을 제공합니다. |
| [idx_get](./idx_get/)(const String\&) | 주어진 네임스페이스 URI와 연결된 [XmlSchema](../xmlschema/)을 반환합니다. |
| [XmlSchemaCollection](./xmlschemacollection/)() | [XmlSchemaCollection](./) 클래스의 새 인스턴스를 초기화합니다. |
| [XmlSchemaCollection](./xmlschemacollection/)(const SharedPtr\<XmlNameTable\>\&) | 지정된 [XmlNameTable](../../system.xml/xmlnametable/)을 사용하여 [XmlSchemaCollection](./) 클래스의 새 인스턴스를 초기화합니다. [XmlNameTable](../../system.xml/xmlnametable/)은 스키마를 로드할 때 사용됩니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고


## Deprecated
XmlSchemaCollection 클래스는 사용되지 않습니다. 대신 XmlSchemaSet을 사용하십시오.

이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
