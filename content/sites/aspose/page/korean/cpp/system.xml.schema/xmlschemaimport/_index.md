---
title: "System::Xml::Schema::XmlSchemaImport 클래스"
linktitle: "XmlSchemaImport"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaImport 클래스. World Wide Web Consortium (W3C)에서 정의한 XML 스키마의 import 요소를 나타냅니다. 이 클래스는 C++에서 다른 스키마의 스키마 구성 요소를 가져오는 데 사용됩니다."
type: docs
weight: 3500
url: /ko/cpp/system.xml.schema/xmlschemaimport/
---
## XmlSchemaImport class


World Wide [Web](../../system.web/) Consortium (W3C)에서 정의한 XML [Schema](../)의 **import** 요소를 나타냅니다. 이 클래스는 다른 스키마에서 스키마 구성 요소를 가져오는 데 사용됩니다.

```cpp
class XmlSchemaImport : public System::Xml::Schema::XmlSchemaExternal
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Annotation](./get_annotation/)() | **annotation** 값을 반환합니다. |
| [get_Namespace](./get_namespace/)() | 가져온 스키마의 대상 네임스페이스를 Uniform Resource Identifier (URI) 참조로 반환합니다. |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | **annotation** 값을 설정합니다. |
| [set_Namespace](./set_namespace/)(const String\&) | 가져온 스키마의 대상 네임스페이스를 Uniform Resource Identifier (URI) 참조로 설정합니다. |
| [XmlSchemaImport](./xmlschemaimport/)() | [XmlSchemaImport](./) 클래스의 새 인스턴스를 초기화합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [XmlSchemaExternal](../xmlschemaexternal/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
