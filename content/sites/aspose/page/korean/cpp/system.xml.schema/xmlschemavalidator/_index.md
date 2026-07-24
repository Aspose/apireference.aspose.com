---
title: "System::Xml::Schema::XmlSchemaValidator 클래스"
linktitle: "XmlSchemaValidator"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaValidator 클래스. XML 스키마 정의 언어 (XSD) 스키마 검증 엔진을 나타냅니다. XmlSchemaValidator 클래스는 C++에서 상속할 수 없습니다."
type: docs
weight: 7000
url: /ko/cpp/system.xml.schema/xmlschemavalidator/
---
## XmlSchemaValidator class


XML [Schema](../) 정의 언어 (XSD) [Schema](../) 검증 엔진을 나타냅니다. [XmlSchemaValidator](./) 클래스는 상속할 수 없습니다.

```cpp
class XmlSchemaValidator : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [AddSchema](./addschema/)(const SharedPtr\<XmlSchema\>\&) | XML [Schema](../) 정의 언어 (XSD) 스키마를 검증에 사용되는 스키마 집합에 추가합니다. |
| [EndValidation](./endvalidation/)() | 검증을 종료하고 전체 XML 문서에 대한 동일성 제약 조건을 확인합니다. |
| [get_LineInfoProvider](./get_lineinfoprovider/)() | 검증 중인 XML 노드의 행 번호 정보를 반환합니다. |
| [get_SourceUri](./get_sourceuri/)() | 검증 중인 XML 노드의 소스 URI를 반환합니다. |
| [get_ValidationEventSender](./get_validationeventsender/)() | 검증 이벤트의 발신자 객체로 전송된 객체를 반환합니다. |
| [GetExpectedAttributes](./getexpectedattributes/)() | 현재 요소 컨텍스트에 대한 예상 속성을 반환합니다. |
| [GetExpectedParticles](./getexpectedparticles/)() | 현재 요소 컨텍스트에 대한 예상 파티클을 반환합니다. |
| [GetUnspecifiedDefaultAttributes](./getunspecifieddefaultattributes/)(const SharedPtr\<Collections::Generic::List\<SharedPtr\<Object\>\>\>\&) | 요소 컨텍스트에서 [XmlSchemaValidator::ValidateAttribute](./validateattribute/) 메서드를 사용하여 이전에 검증되지 않은 기본값을 가진 속성에 대해, 기본 속성에 대한 식별 제약 조건을 검증하고 지정된 List를 [XmlSchemaAttribute](../xmlschemaattribute/) 객체로 채웁니다. |
| [Initialize](./initialize/)() | [XmlSchemaValidator](./) 객체의 상태를 초기화합니다. |
| [Initialize](./initialize/)(const SharedPtr\<XmlSchemaObject\>\&) | 부분 검증을 위해 지정된 [XmlSchemaObject](../xmlschemaobject/)을 사용하여 [XmlSchemaValidator](./) 객체의 상태를 초기화합니다. |
| [set_LineInfoProvider](./set_lineinfoprovider/)(const SharedPtr\<IXmlLineInfo\>\&) | 검증 중인 XML 노드에 대한 행 번호 정보를 설정합니다. |
| [set_SourceUri](./set_sourceuri/)(const SharedPtr\<Uri\>\&) | 검증 중인 XML 노드에 대한 소스 URI를 설정합니다. |
| [set_ValidationEventSender](./set_validationeventsender/)(const SharedPtr\<Object\>\&) | 검증 이벤트의 발신자 객체로 전송된 객체를 설정합니다. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | [XmlResolver](../../system.xml/xmlresolver/) 객체를 설정하여 **xs:import** 및 **xs:include** 요소와 **xsi:schemaLocation**, **xsi:noNamespaceSchemaLocation** 속성을 해결합니다. |
| [SkipToEndElement](./skiptoendelement/)(const SharedPtr\<XmlSchemaInfo\>\&) | 현재 요소 내용의 검증을 건너뛰고, 상위 요소 컨텍스트에서 내용을 검증하도록 [XmlSchemaValidator](./) 객체를 준비합니다. |
| [ValidateAttribute](./validateattribute/)(const String\&, const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) | 현재 요소 컨텍스트에서 속성 이름, 네임스페이스 URI 및 값을 검증합니다. |
| [ValidateAttribute](./validateattribute/)(const String\&, const String\&, XmlValueGetter, const SharedPtr\<XmlSchemaInfo\>\&) | 현재 요소 컨텍스트에서 속성 이름, 네임스페이스 URI 및 값을 검증합니다. |
| [ValidateElement](./validateelement/)(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) | 현재 컨텍스트에서 요소를 검증합니다. |
| [ValidateElement](./validateelement/)(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&, const String\&, const String\&, const String\&, const String\&) | 지정된 **xsi:Type**, **xsi:Nil**, **xsi:SchemaLocation**, **xsi:NoNamespaceSchemaLocation** 속성 값을 사용하여 현재 컨텍스트에서 요소를 검증합니다. |
| [ValidateEndElement](./validateendelement/)(const SharedPtr\<XmlSchemaInfo\>\&) | 단순 내용 요소의 경우 요소 텍스트 내용이 데이터 유형에 따라 유효한지 확인하고, 복합 내용 요소의 경우 현재 요소의 내용이 완전한지 확인합니다. |
| [ValidateEndElement](./validateendelement/)(const SharedPtr\<XmlSchemaInfo\>\&, const SharedPtr\<Object\>\&) | 지정된 요소의 텍스트 내용이 데이터 유형에 따라 유효한지 확인합니다. |
| [ValidateEndOfAttributes](./validateendofattributes/)(const SharedPtr\<XmlSchemaInfo\>\&) | 요소 컨텍스트에 모든 필수 속성이 존재하는지 확인하고, 요소의 하위 내용을 검증하도록 [XmlSchemaValidator](./) 객체를 준비합니다. |
| [ValidateText](./validatetext/)(const String\&) | 지정된 텍스트 **string**이 현재 요소 컨텍스트에서 허용되는지 검증하고, 현재 요소가 단순 내용을 가지고 있는 경우 검증을 위해 텍스트를 누적합니다. |
| [ValidateText](./validatetext/)(XmlValueGetter) | 지정된 [XmlValueGetter](../xmlvaluegetter/) 객체가 반환한 텍스트가 현재 요소 컨텍스트에서 허용되는지 검증하고, 현재 요소가 단순 내용을 가지고 있는 경우 검증을 위해 텍스트를 누적합니다. |
| [ValidateWhitespace](./validatewhitespace/)(const String\&) | 지정된 **string** 내의 공백이 현재 요소 컨텍스트에서 허용되는지 검증하고, 현재 요소가 단순 내용을 가지고 있는 경우 검증을 위해 공백을 누적합니다. |
| [ValidateWhitespace](./validatewhitespace/)(XmlValueGetter) | 지정된 [XmlValueGetter](../xmlvaluegetter/) 객체가 반환한 공백이 현재 요소 컨텍스트에서 허용되는지 검증하고, 현재 요소가 단순 내용을 가지고 있는 경우 검증을 위해 공백을 누적합니다. |
| [XmlSchemaValidator](./xmlschemavalidator/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlSchemaSet\>\&, const SharedPtr\<IXmlNamespaceResolver\>\&, XmlSchemaValidationFlags) | [XmlSchemaValidator](./) 클래스의 새 인스턴스를 초기화합니다. |
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
