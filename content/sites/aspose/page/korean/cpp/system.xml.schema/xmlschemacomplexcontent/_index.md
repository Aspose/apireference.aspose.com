---
title: "System::Xml::Schema::XmlSchemaComplexContent class"
linktitle: "XmlSchemaComplexContent"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaComplexContent 클래스. World Wide Web Consortium (W3C)에서 지정한 XML Schema의 complexContent 요소를 나타냅니다. 이 클래스는 복합 타입을 위한 복합 콘텐츠 모델을 나타냅니다. C++에서 요소만 있거나 혼합 콘텐츠를 가진 복합 타입에 대한 확장 또는 제한을 포함합니다."
type: docs
weight: 1800
url: /ko/cpp/system.xml.schema/xmlschemacomplexcontent/
---
## XmlSchemaComplexContent class


World Wide [Web](../../system.web/) Consortium (W3C)에서 지정한 XML [Schema](../)의 **complexContent** 요소를 나타냅니다. 이 클래스는 복합 타입을 위한 복합 콘텐츠 모델을 나타냅니다. 요소만 있거나 혼합 콘텐츠를 가진 복합 타입에 대한 확장 또는 제한을 포함합니다.

```cpp
class XmlSchemaComplexContent : public System::Xml::Schema::XmlSchemaContentModel
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Content](./get_content/)() override | 콘텐츠를 반환합니다. |
| [get_IsMixed](./get_ismixed/)() | 형식에 혼합 콘텐츠 모델이 있는지 여부를 결정하는 정보를 반환합니다. |
| [set_Content](./set_content/)(SharedPtr\<XmlSchemaContent\>) override | 콘텐츠를 설정합니다. |
| [set_IsMixed](./set_ismixed/)(bool) | 형식에 혼합 콘텐츠 모델이 있는지 여부를 결정하는 정보를 설정합니다. |
| [XmlSchemaComplexContent](./xmlschemacomplexcontent/)() | [XmlSchemaComplexContent](./) 클래스의 새 인스턴스를 초기화합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [XmlSchemaContentModel](../xmlschemacontentmodel/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
