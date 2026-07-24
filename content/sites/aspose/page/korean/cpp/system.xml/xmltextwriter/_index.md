---
title: "System::Xml::XmlTextWriter 클래스"
linktitle: "XmlTextWriter"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlTextWriter 클래스. W3C Extensible Markup Language (XML) 1.0 및 Namespaces in XML 권고안에 부합하는 XML 데이터를 포함하는 스트림 또는 파일을 빠르고, 캐시되지 않으며, 순방향 전용 방식으로 생성하는 writer를 나타냅니다."
type: docs
weight: 4000
url: /ko/cpp/system.xml/xmltextwriter/
---
## XmlTextWriter class


W3C Extensible Markup Language (XML) 1.0 및 XML 네임스페이스 권고에 부합하는 XML 데이터를 포함하는 스트림 또는 파일을 빠르고 비캐시된 순방향 전용 방식으로 생성하는 라이터를 나타냅니다.

```cpp
class XmlTextWriter : public System::Xml::XmlWriter
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Close](./close/)() override | 이 스트림과 기본 스트림을 닫습니다. |
| [Flush](./flush/)() override | 버퍼에 있는 모든 내용을 기본 스트림에 플러시하고 기본 스트림도 플러시합니다. |
| [get_BaseStream](./get_basestream/)() | 기본 스트림 객체를 반환합니다. |
| [get_Formatting](./get_formatting/)() | 출력 형식이 어떻게 지정되는지 나타냅니다. |
| [get_Indentation](./get_indentation/)() | 계층 구조의 각 레벨에 대해 [XmlTextWriter::set_Formatting](./set_formatting/)이 [Formatting::Indented](../formatting/)로 설정된 경우 쓸 IndentChars 수를 반환합니다. |
| [get_IndentChar](./get_indentchar/)() | [XmlTextWriter::set_Formatting](./set_formatting/)이 [Formatting::Indented](../formatting/)로 설정된 경우 들여쓰기에 사용할 문자를 반환합니다. |
| [get_Namespaces](./get_namespaces/)() | 네임스페이스 지원을 할지 여부를 나타내는 값을 반환합니다. |
| [get_QuoteChar](./get_quotechar/)() | 속성 값을 인용할 때 사용할 문자를 반환합니다. |
| [get_WriteState](./get_writestate/)() override | writer의 상태를 반환합니다. |
| [get_XmlLang](./get_xmllang/)() override | 현재 **xml:lang** 범위를 반환합니다. |
| [get_XmlSpace](./get_xmlspace/)() override | 현재 **xml:space** 범위를 나타내는 [XmlSpace](../xmlspace/)를 반환합니다. |
| [LookupPrefix](./lookupprefix/)(String) override | 네임스페이스 URI에 대해 현재 네임스페이스 범위에서 정의된 가장 가까운 접두사를 반환합니다. |
| [set_Formatting](./set_formatting/)(System::Xml::Formatting) | 출력 형식이 어떻게 지정되는지 나타냅니다. |
| [set_Indentation](./set_indentation/)(int32_t) | [XmlTextWriter::set_Formatting](./set_formatting/)이 [Formatting::Indented](../formatting/)로 설정된 경우 계층 구조의 각 레벨에 쓸 IndentChars 수를 설정합니다. |
| [set_IndentChar](./set_indentchar/)(char16_t) | [XmlTextWriter::set_Formatting](./set_formatting/)이 [Formatting::Indented](../formatting/)로 설정된 경우 들여쓰기에 사용할 문자를 설정합니다. |
| [set_Namespaces](./set_namespaces/)(bool) | 네임스페이스 지원을 수행할지 여부를 나타내는 값을 설정합니다. |
| [set_QuoteChar](./set_quotechar/)(char16_t) | 속성 값을 인용할 때 사용할 문자를 설정합니다. |
| [WriteBase64](./writebase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | 지정된 바이너리 바이트를 base64로 인코딩하고 결과 텍스트를 기록합니다. |
| [WriteBinHex](./writebinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | 지정된 바이너리 바이트를 binhex로 인코딩하고 결과 텍스트를 기록합니다. |
| [WriteCData](./writecdata/)(String) override | 지정된 텍스트를 포함하는 **...** 블록을 기록합니다. |
| [WriteCharEntity](./writecharentity/)(char16_t) override | 지정된 유니코드 문자 값에 대한 문자 엔터티 생성을 강제합니다. |
| [WriteChars](./writechars/)(ArrayPtr\<char16_t\>, int32_t, int32_t) override | 텍스트를 한 번에 하나의 버퍼씩 기록합니다. |
| [WriteComment](./writecomment/)(String) override | 지정된 텍스트를 포함하는 주석 ****을 기록합니다. |
| [WriteDocType](./writedoctype/)(const String\&, const String\&, const String\&, const String\&) override | 지정된 이름과 선택적 속성을 사용하여 DOCTYPE 선언을 기록합니다. |
| [WriteEndAttribute](./writeendattribute/)() override | 이전 [XmlTextWriter::WriteStartAttribute](./writestartattribute/) 호출을 닫습니다. |
| [WriteEndDocument](./writeenddocument/)() override | 열려 있는 모든 요소나 속성을 닫고 작성기를 시작 상태로 되돌립니다. |
| [WriteEndElement](./writeendelement/)() override | 하나의 요소를 닫고 해당 네임스페이스 범위를 팝합니다. |
| [WriteEntityRef](./writeentityref/)(const String\&) override | 엔터티 참조를 **&name**; 형태로 기록합니다. |
| [WriteFullEndElement](./writefullendelement/)() override | 하나의 요소를 닫고 해당 네임스페이스 범위를 팝합니다. |
| [WriteName](./writename/)(const String\&) override | 지정된 이름을 기록하고, 해당 이름이 [W3C XML 1.0 recommendation](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name)에 따라 유효한 이름인지 확인합니다. |
| [WriteNmToken](./writenmtoken/)(const String\&) override | 지정된 이름을 기록하고, 해당 이름이 [W3C XML 1.0 recommendation](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name)에 따라 유효한 **NmToken**인지 확인합니다. |
| [WriteProcessingInstruction](./writeprocessinginstruction/)(String, String) override | 다음과 같이 이름과 텍스트 사이에 공백이 있는 처리 지시문을 **<?name text?>** 형태로 기록합니다. |
| [WriteQualifiedName](./writequalifiedname/)(const String\&, const String\&) override | 네임스페이스가 지정된 이름을 기록합니다. 이 메서드는 주어진 네임스페이스에 대해 범위 내에 있는 접두사를 찾습니다. |
| [WriteRaw](./writeraw/)(ArrayPtr\<char16_t\>, int32_t, int32_t) override | 문자 버퍼에서 원시 마크업을 수동으로 기록합니다. |
| [WriteRaw](./writeraw/)(const String\&) override | 문자열에서 원시 마크업을 수동으로 기록합니다. |
| [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&, const String\&) override | 속성의 시작을 기록합니다. |
| [WriteStartDocument](./writestartdocument/)() override | 버전 "1.0"이 포함된 XML 선언을 기록합니다. |
| [WriteStartDocument](./writestartdocument/)(bool) override | 버전 "1.0" 및 standalone 속성이 포함된 XML 선언을 기록합니다. |
| [WriteStartElement](./writestartelement/)(const String\&, const String\&, const String\&) override | 지정된 시작 태그를 기록하고, 이를 주어진 네임스페이스와 접두사에 연결합니다. |
| [WriteString](./writestring/)(const String\&) override | 주어진 텍스트 내용을 기록합니다. |
| [WriteSurrogateCharEntity](./writesurrogatecharentity/)(char16_t, char16_t) override | 서러게이트 문자 쌍에 대한 서러게이트 문자 엔터티를 생성하고 기록합니다. |
| [WriteWhitespace](./writewhitespace/)(String) override | 주어진 공백을 출력합니다. |
| [XmlTextWriter](./xmltextwriter/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Text::Encoding\>\&) | 지정된 스트림과 인코딩을 사용하여 [XmlTextWriter](./) 클래스의 인스턴스를 생성합니다. |
| [XmlTextWriter](./xmltextwriter/)(const String\&, const SharedPtr\<Text::Encoding\>\&) | 지정된 파일을 사용하여 [XmlTextWriter](./) 클래스의 인스턴스를 생성합니다. |
| [XmlTextWriter](./xmltextwriter/)(const SharedPtr\<IO::TextWriter\>\&) | 지정된 TextWriter를 사용하여 [XmlTextWriter](./) 클래스의 인스턴스를 생성합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



대신 [XmlWriter](../xmlwriter/) 클래스를 사용하는 것이 권장됩니다.

이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [XmlWriter](../xmlwriter/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
