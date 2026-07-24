---
title: "System::Xml::XmlReaderSettings 클래스"
linktitle: "XmlReaderSettings"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlReaderSettings 클래스. C++에서 XmlReader::Create 메서드로 생성된 XmlReader 객체가 지원하도록 기능 집합을 지정합니다."
type: docs
weight: 3400
url: /ko/cpp/system.xml/xmlreadersettings/
---
## XmlReaderSettings class


[XmlReader](../xmlreader/) 객체가 [XmlReader::Create](../xmlreader/create/) 메서드에 의해 생성될 때 지원할 기능 집합을 지정합니다.

```cpp
class XmlReaderSettings : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [CheckReadOnly](./checkreadonly/)(const String\&) |  |
| [Clone](./clone/)() | [XmlReaderSettings](./) 인스턴스의 복사본을 생성합니다. |
| [get_CheckCharacters](./get_checkcharacters/)() | 문자 검사 수행 여부를 나타내는 값을 반환합니다. |
| [get_CloseInput](./get_closeinput/)() | 리더가 닫힐 때 기본 스트림 또는 TextReader를 닫아야 하는지 여부를 나타내는 값을 반환합니다. |
| [get_ConformanceLevel](./get_conformancelevel/)() | [XmlReader](../xmlreader/)가 따를 호환성 수준을 반환합니다. |
| [get_DtdProcessing](./get_dtdprocessing/)() | DTD 처리 방식을 결정하는 값을 반환합니다. |
| [get_IgnoreComments](./get_ignorecomments/)() | 주석을 무시할지 여부를 나타내는 값을 반환합니다. |
| [get_IgnoreProcessingInstructions](./get_ignoreprocessinginstructions/)() | 처리 명령을 무시할지 여부를 나타내는 값을 반환합니다. |
| [get_IgnoreWhitespace](./get_ignorewhitespace/)() | 중요하지 않은 공백을 무시할지 여부를 나타내는 값을 반환합니다. |
| [get_LineNumberOffset](./get_linenumberoffset/)() | [XmlReader](../xmlreader/) 객체의 행 번호 오프셋을 반환합니다. |
| [get_LinePositionOffset](./get_linepositionoffset/)() | [XmlReader](../xmlreader/) 객체의 행 위치 오프셋을 반환합니다. |
| [get_MaxCharactersFromEntities](./get_maxcharactersfromentities/)() | 엔터티 확장으로 인해 문서에 허용되는 최대 문자 수를 나타내는 값을 반환합니다. |
| [get_MaxCharactersInDocument](./get_maxcharactersindocument/)() | XML 문서에서 허용되는 최대 문자 수를 나타내는 값을 반환합니다. 0(0) 값은 XML 문서 크기에 제한이 없음을 의미합니다. 0이 아닌 값은 문자 단위로 최대 크기를 지정합니다. |
| [get_NameTable](./get_nametable/)() | 원자화된 문자열 비교에 사용되는 [XmlNameTable](../xmlnametable/)을 반환합니다. |
| [get_ProhibitDtd](./get_prohibitdtd/)() | 문서 유형 정의(DTD) 처리를 금지할지 여부를 나타내는 값을 반환합니다. |
| [get_Schemas](./get_schemas/)() | 스키마 검증을 수행할 때 사용할 XmlSchemaSet을 반환합니다. |
| [get_ValidationFlags](./get_validationflags/)() | 스키마 검증 설정을 나타내는 값을 반환합니다. 이 설정은 스키마를 검증하는 [XmlReader](../xmlreader/) 객체에 적용됩니다([XmlReaderSettings::get_ValidationType](./get_validationtype/) 값이 [ValidationType::Schema](../validationtype/)인 경우). |
| [get_ValidationType](./get_validationtype/)() | [XmlReader](../xmlreader/)가 읽는 동안 검증 또는 유형 할당을 수행할지 여부를 나타내는 값을 반환합니다. |
| [Reset](./reset/)() | 설정 클래스의 멤버를 기본값으로 재설정합니다. |
| [set_CheckCharacters](./set_checkcharacters/)(bool) | 문자 검사 여부를 나타내는 값을 설정합니다. |
| [set_CloseInput](./set_closeinput/)(bool) | 리더가 닫힐 때 기본 스트림 또는 TextReader를 닫을지 여부를 나타내는 값을 설정합니다. |
| [set_ConformanceLevel](./set_conformancelevel/)(System::Xml::ConformanceLevel) | [XmlReader](../xmlreader/)가 준수할 호환성 수준을 설정합니다. |
| [set_DtdProcessing](./set_dtdprocessing/)(System::Xml::DtdProcessing) | DTD 처리 방식을 결정하는 값을 설정합니다. |
| [set_IgnoreComments](./set_ignorecomments/)(bool) | 주석을 무시할지 여부를 나타내는 값을 설정합니다. |
| [set_IgnoreProcessingInstructions](./set_ignoreprocessinginstructions/)(bool) | 처리 지시문을 무시할지 여부를 나타내는 값을 설정합니다. |
| [set_IgnoreWhitespace](./set_ignorewhitespace/)(bool) | 중요하지 않은 공백을 무시할지 여부를 나타내는 값을 설정합니다. |
| [set_LineNumberOffset](./set_linenumberoffset/)(int32_t) | [XmlReader](../xmlreader/) 객체의 행 번호 오프셋을 설정합니다. |
| [set_LinePositionOffset](./set_linepositionoffset/)(int32_t) | [XmlReader](../xmlreader/) 객체의 열 위치 오프셋을 설정합니다. |
| [set_MaxCharactersFromEntities](./set_maxcharactersfromentities/)(int64_t) | 엔터티 확장으로 인해 문서에 허용되는 최대 문자 수를 나타내는 값을 설정합니다. |
| [set_MaxCharactersInDocument](./set_maxcharactersindocument/)(int64_t) | XML 문서에서 허용되는 최대 문자 수를 나타내는 값을 설정합니다. 0(0) 값은 XML 문서 크기에 제한이 없음을 의미합니다. 0이 아닌 값은 문자 단위로 최대 크기를 지정합니다. |
| [set_NameTable](./set_nametable/)(const SharedPtr\<XmlNameTable\>\&) | 원자화된 문자열 비교에 사용되는 [XmlNameTable](../xmlnametable/)을 설정합니다. |
| [set_ProhibitDtd](./set_prohibitdtd/)(bool) | 문서 유형 정의(DTD) 처리를 금지할지 여부를 나타내는 값을 설정합니다. |
| [set_Schemas](./set_schemas/)(const SharedPtr\<Schema::XmlSchemaSet\>\&) | 스키마 검증을 수행할 때 사용할 XmlSchemaSet을 설정합니다. |
| [set_ValidationFlags](./set_validationflags/)(Schema::XmlSchemaValidationFlags) | 스키마 검증 설정을 나타내는 값을 설정합니다. 이 설정은 스키마를 검증하는 [XmlReader](../xmlreader/) 객체에 적용됩니다([XmlReaderSettings::get_ValidationType](./get_validationtype/) 값이 [ValidationType::Schema](../validationtype/)인 경우). |
| [set_ValidationType](./set_validationtype/)(System::Xml::ValidationType) | [XmlReader](../xmlreader/)가 읽는 동안 검증 또는 유형 할당을 수행할지 여부를 나타내는 값을 설정합니다. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | 외부 문서에 접근하는 데 사용되는 [XmlResolver](../xmlresolver/)을 설정합니다. |
| [ValidationEventHandler_add](./validationeventhandler_add/)(Args...) | 리더가 검증 오류를 만나면 발생하는 이벤트 핸들러를 추가합니다. |
| [ValidationEventHandler_remove](./validationeventhandler_remove/)(Args...) | 리더가 검증 오류를 만나면 발생하는 이벤트 핸들러를 제거합니다. |
| [XmlReaderSettings](./xmlreadersettings/)() | [XmlReaderSettings](./) 클래스의 새 인스턴스를 초기화합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
