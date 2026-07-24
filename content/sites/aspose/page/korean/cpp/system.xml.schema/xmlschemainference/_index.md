---
title: "System::Xml::Schema::XmlSchemaInference 클래스"
linktitle: "XmlSchemaInference"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaInference 클래스. XML 문서에서 XML 스키마 정의 언어 (XSD) 스키마를 추론합니다. XmlSchemaInference 클래스는 C++에서 상속할 수 없습니다."
type: docs
weight: 3700
url: /ko/cpp/system.xml.schema/xmlschemainference/
---
## XmlSchemaInference class


XML 문서에서 XML [Schema](../) 정의 언어 (XSD) 스키마를 추론합니다. [XmlSchemaInference](./) 클래스는 상속할 수 없습니다.

```cpp
class XmlSchemaInference : public System::Object
```

## Enums

| 열거형 | 설명 |
| --- | --- |
| [InferenceOption](./inferenceoption/) | [XmlSchemaInference](./) 클래스가 XML 문서의 요소와 속성에 대해 추론한 발생 및 유형 정보에 영향을 줍니다. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Occurrence](./get_occurrence/)() | XML 문서에서 추론된 스키마 발생 선언에 영향을 주는 [XmlSchemaInference::InferenceOption](./inferenceoption/) 값을 반환합니다. |
| [get_TypeInference](./get_typeinference/)() | XML 문서에서 추론된 유형에 영향을 주는 [XmlSchemaInference::InferenceOption](./inferenceoption/) 값을 반환합니다. |
| [InferSchema](./inferschema/)(const SharedPtr\<XmlReader\>\&) | 지정된 [XmlReader](../../system.xml/xmlreader/) 객체에 포함된 XML 문서에서 XML [Schema](../) 정의 언어 (XSD) 스키마를 추론합니다. |
| [InferSchema](./inferschema/)(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlSchemaSet\>) | 지정된 [XmlReader](../../system.xml/xmlreader/) 객체에 포함된 XML 문서에서 XML [Schema](../) 정의 언어 (XSD) 스키마를 추론하고, 동일한 대상 네임스페이스를 가진 지정된 [XmlSchemaSet](../xmlschemaset/) 객체에 있는 기존 스키마를 사용하여 추론된 스키마를 정제합니다. |
| [set_Occurrence](./set_occurrence/)(XmlSchemaInference::InferenceOption) | XML 문서에서 추론된 스키마 발생 선언에 영향을 주는 [XmlSchemaInference::InferenceOption](./inferenceoption/) 값을 설정합니다. |
| [set_TypeInference](./set_typeinference/)(XmlSchemaInference::InferenceOption) | XML 문서에서 추론된 유형에 영향을 주는 [XmlSchemaInference::InferenceOption](./inferenceoption/) 값을 설정합니다. |
| [XmlSchemaInference](./xmlschemainference/)() | [XmlSchemaInference](./) 클래스의 새 인스턴스를 초기화합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
