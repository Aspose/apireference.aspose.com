---
title: "System::Xml::Schema::XmlSchemaAnnotated 클래스"
linktitle: "XmlSchemaAnnotated"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaAnnotated 클래스. C++에서 주석 요소를 포함할 수 있는 모든 요소의 기본 클래스입니다."
type: docs
weight: 600
url: /ko/cpp/system.xml.schema/xmlschemaannotated/
---
## XmlSchemaAnnotated class


주석 요소를 포함할 수 있는 모든 요소의 기본 클래스입니다.

```cpp
class XmlSchemaAnnotated : public System::Xml::Schema::XmlSchemaObject
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Annotation](./get_annotation/)() | **annotation** 속성을 반환합니다. |
| [get_Id](./get_id/)() | 문자열 ID를 반환합니다. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | 현재 스키마의 대상 네임스페이스에 속하지 않는 정규화된 속성을 반환합니다. |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | **annotation** 속성을 설정합니다. |
| [set_Id](./set_id/)(const String\&) | 문자열 ID를 설정합니다. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | 현재 스키마의 대상 네임스페이스에 속하지 않는 정규화된 속성을 설정합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
