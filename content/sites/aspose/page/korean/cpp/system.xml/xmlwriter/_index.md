---
title: "System::Xml::XmlWriter 클래스"
linktitle: "XmlWriter"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlWriter 클래스. 빠르고, 캐시되지 않으며, 순방향 전용 방식으로 C++에서 XML 데이터를 포함하는 스트림이나 파일을 생성하는 작성자를 나타냅니다."
type: docs
weight: 4400
url: /ko/cpp/system.xml/xmlwriter/
---
## XmlWriter class


XML 데이터를 포함하는 스트림 또는 파일을 빠르고 비캐시된 순방향 전용 방식으로 생성하는 라이터를 나타냅니다.

```cpp
class XmlWriter : public System::IDisposable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [Close](./close/)() | 파생 클래스에서 재정의될 때, 이 스트림과 기본 스트림을 닫습니다. |
| static [Create](./create/)(const String\&) | 지정된 파일 이름을 사용하여 새로운 [XmlWriter](./) 인스턴스를 생성합니다. |
| static [Create](./create/)(const String\&, SharedPtr\<XmlWriterSettings\>) | 파일 이름과 [XmlWriterSettings](../xmlwritersettings/) 객체를 사용하여 새로운 [XmlWriter](./) 인스턴스를 생성합니다. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&) | 지정된 스트림을 사용하여 새로운 [XmlWriter](./) 인스턴스를 생성합니다. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlWriterSettings\>) | 스트림과 [XmlWriterSettings](../xmlwritersettings/) 객체를 사용하여 새로운 [XmlWriter](./) 인스턴스를 생성합니다. |
| static [Create](./create/)(const SharedPtr\<IO::TextWriter\>\&) | 지정된 TextWriter를 사용하여 새로운 [XmlWriter](./) 인스턴스를 생성합니다. |
| static [Create](./create/)(const SharedPtr\<IO::TextWriter\>\&, SharedPtr\<XmlWriterSettings\>) | TextWriter와 [XmlWriterSettings](../xmlwritersettings/) 객체를 사용하여 새로운 [XmlWriter](./) 인스턴스를 생성합니다. |
| static [Create](./create/)(const SharedPtr\<Text::StringBuilder\>\&) | 지정된 [Text::StringBuilder](../../system.text/stringbuilder/)를 사용하여 새로운 [XmlWriter](./) 인스턴스를 생성합니다. |
| static [Create](./create/)(const SharedPtr\<Text::StringBuilder\>\&, SharedPtr\<XmlWriterSettings\>) | [Text::StringBuilder](../../system.text/stringbuilder/)와 [XmlWriterSettings](../xmlwritersettings/) 객체를 사용하여 새로운 [XmlWriter](./) 인스턴스를 생성합니다. |
| static [Create](./create/)(const SharedPtr\<XmlWriter\>\&) | 지정된 [XmlWriter](./) 객체를 사용하여 새로운 [XmlWriter](./) 인스턴스를 생성합니다. |
| static [Create](./create/)(const SharedPtr\<XmlWriter\>\&, SharedPtr\<XmlWriterSettings\>) | 지정된 [XmlWriter](./)와 [XmlWriterSettings](../xmlwritersettings/) 객체를 사용하여 새로운 [XmlWriter](./) 인스턴스를 생성합니다. |
| [Dispose](./dispose/)() override | 현재 [XmlWriter](./) 클래스 인스턴스가 사용한 모든 리소스를 해제합니다. |
| virtual [Flush](./flush/)() | 파생 클래스에서 재정의될 때, 버퍼에 있는 내용을 기본 스트림으로 플러시하고 기본 스트림도 플러시합니다. |
| virtual [get_Settings](./get_settings/)() | 이 [XmlWriter](./) 인스턴스를 생성하는 데 사용된 [XmlWriterSettings](../xmlwritersettings/) 객체를 반환합니다. |
| virtual [get_WriteState](./get_writestate/)() | 파생 클래스에서 재정의될 때, 작성자의 상태를 가져옵니다. |
| virtual [get_XmlLang](./get_xmllang/)() | 파생 클래스에서 재정의될 때, 현재 **xml:lang** 범위를 가져옵니다. |
| virtual [get_XmlSpace](./get_xmlspace/)() | 파생 클래스에서 재정의될 때, 현재 **xml:space** 범위를 나타내는 [XmlSpace](../xmlspace/)를 가져옵니다. |
| virtual [LookupPrefix](./lookupprefix/)(String) | 파생 클래스에서 재정의될 때, 현재 네임스페이스 범위에서 해당 네임스페이스 URI에 대해 정의된 가장 가까운 접두사를 반환합니다. |
| virtual [WriteAttributes](./writeattributes/)(SharedPtr\<XmlReader\>, bool) | 파생 클래스에서 재정의될 때, [XmlReader](../xmlreader/)의 현재 위치에서 찾은 모든 속성을 기록합니다. |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&, const String\&) | 파생 클래스에서 재정의될 때, 지정된 로컬 이름, 네임스페이스 URI 및 값을 가진 속성을 기록합니다. |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&) | 파생 클래스에서 재정의될 때, 지정된 로컬 이름과 값을 가진 속성을 기록합니다. |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&, const String\&, const String\&) | 파생 클래스에서 재정의될 때, 지정된 접두사, 로컬 이름, 네임스페이스 URI 및 값을 가진 속성을 기록합니다. |
| virtual [WriteBase64](./writebase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | 파생 클래스에서 재정의될 때, 지정된 바이너리 바이트를 Base64으로 인코딩하고 결과 텍스트를 기록합니다. |
| virtual [WriteBinHex](./writebinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | 파생 클래스에서 재정의될 때, 지정된 바이너리 바이트를 **BinHex**로 인코딩하고 결과 텍스트를 기록합니다. |
| virtual [WriteCData](./writecdata/)(String) | 파생 클래스에서 재정의될 때, 지정된 텍스트를 포함하는 **...** 블록을 출력합니다. |
| virtual [WriteCharEntity](./writecharentity/)(char16_t) | 파생 클래스에서 재정의될 때, 지정된 유니코드 문자 값에 대한 문자 엔터티 생성을 강제합니다. |
| virtual [WriteChars](./writechars/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | 파생 클래스에서 재정의될 때, 텍스트를 한 번에 하나의 버퍼씩 씁니다. |
| virtual [WriteComment](./writecomment/)(String) | 파생 클래스에서 재정의될 때, 지정된 텍스트를 포함하는 주석 ****을 출력합니다. |
| virtual [WriteDocType](./writedoctype/)(const String\&, const String\&, const String\&, const String\&) | 파생 클래스에서 재정의될 때, 지정된 이름과 선택적 속성을 사용하여 DOCTYPE 선언을 출력합니다. |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&) | 지정된 로컬 이름과 값을 가진 요소를 씁니다. |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&, const String\&) | 지정된 로컬 이름, 네임스페이스 URI 및 값을 가진 요소를 씁니다. |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&, const String\&, const String\&) | 지정된 접두사, 로컬 이름, 네임스페이스 URI 및 값을 가진 요소를 씁니다. |
| virtual [WriteEndAttribute](./writeendattribute/)() | 파생 클래스에서 재정의될 때, 이전 XmlWriter::WriteStartAttribute(String,String) 호출을 닫습니다. |
| virtual [WriteEndDocument](./writeenddocument/)() | 파생 클래스에서 재정의될 때, 열려 있는 모든 요소나 속성을 닫고 작성기를 시작 상태로 되돌립니다. |
| virtual [WriteEndElement](./writeendelement/)() | 파생 클래스에서 재정의될 때, 하나의 요소를 닫고 해당 네임스페이스 범위를 팝합니다. |
| virtual [WriteEntityRef](./writeentityref/)(const String\&) | 파생 클래스에서 재정의될 때, 엔터티 참조를 **&name**; 형태로 출력합니다. |
| virtual [WriteFullEndElement](./writefullendelement/)() | 파생 클래스에서 재정의될 때, 하나의 요소를 닫고 해당 네임스페이스 범위를 팝합니다. |
| virtual [WriteName](./writename/)(const String\&) | 파생 클래스에서 재정의될 때, 지정된 이름을 출력하며, 해당 이름이 W3C XML 1.0 권고안([https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name))에 따라 유효한 이름인지 확인합니다. |
| virtual [WriteNmToken](./writenmtoken/)(const String\&) | 파생 클래스에서 재정의될 때, 지정된 이름을 출력하며, 해당 이름이 W3C XML 1.0 권고안([https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name))에 따라 유효한 NmToken인지 확인합니다. |
| virtual [WriteNode](./writenode/)(SharedPtr\<XmlReader\>, bool) | 파생 클래스에서 재정의될 때, 리더의 모든 내용을 라이터로 복사하고 리더를 다음 형제의 시작 위치로 이동합니다. |
| virtual [WriteNode](./writenode/)(SharedPtr\<XPath::XPathNavigator\>, bool) | XPathNavigator 객체의 모든 내용을 라이터로 복사합니다. XPathNavigator의 위치는 변경되지 않습니다. |
| virtual [WriteProcessingInstruction](./writeprocessinginstruction/)(String, String) | 파생 클래스에서 재정의될 때, 이름과 텍스트 사이에 공백을 두고 다음과 같이 처리 지시문을 출력합니다: **<?name text?>**. |
| virtual [WriteQualifiedName](./writequalifiedname/)(const String\&, const String\&) | 파생 클래스에서 재정의될 때, 네임스페이스가 지정된 이름을 출력합니다. 이 메서드는 주어진 네임스페이스에 대해 범위 내에 있는 접두사를 찾아 사용합니다. |
| virtual [WriteRaw](./writeraw/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | 파생 클래스에서 재정의될 때, 문자 버퍼에서 원시 마크업을 수동으로 출력합니다. |
| virtual [WriteRaw](./writeraw/)(const String\&) | 파생 클래스에서 재정의될 때, 문자열에서 원시 마크업을 수동으로 출력합니다. |
| [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&) | 지정된 로컬 이름과 네임스페이스 URI를 가진 속성 시작을 씁니다. |
| virtual [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&, const String\&) | 파생 클래스에서 재정의될 때, 지정된 접두사, 로컬 이름 및 네임스페이스 URI를 가진 속성 시작을 씁니다. |
| [WriteStartAttribute](./writestartattribute/)(const String\&) | 지정된 로컬 이름을 가진 속성 시작을 씁니다. |
| virtual [WriteStartDocument](./writestartdocument/)() | 파생 클래스에서 재정의될 때, 버전 "1.0"을 사용하여 XML 선언을 씁니다. |
| virtual [WriteStartDocument](./writestartdocument/)(bool) | 파생 클래스에서 재정의될 때, 버전 "1.0"과 standalone 속성을 사용하여 XML 선언을 씁니다. |
| [WriteStartElement](./writestartelement/)(const String\&, const String\&) | 파생 클래스에서 재정의될 때, 지정된 시작 태그를 작성하고 해당 네임스페이스와 연결합니다. |
| virtual [WriteStartElement](./writestartelement/)(const String\&, const String\&, const String\&) | 파생 클래스에서 재정의될 때, 지정된 시작 태그를 작성하고 주어진 네임스페이스와 접두사와 연결합니다. |
| [WriteStartElement](./writestartelement/)(const String\&) | 파생 클래스에서 재정의될 때, 지정된 로컬 이름을 가진 시작 태그를 출력합니다. |
| virtual [WriteString](./writestring/)(const String\&) | 파생 클래스에서 재정의될 때, 지정된 텍스트 내용을 씁니다. |
| virtual [WriteSurrogateCharEntity](./writesurrogatecharentity/)(char16_t, char16_t) | 파생 클래스에서 재정의될 때, 서러게이트 문자 쌍에 대한 서러게이트 문자 엔터티를 생성하고 씁니다. |
| virtual [WriteValue](./writevalue/)(SharedPtr\<Object\>) | 객체 값을 씁니다. |
| virtual [WriteValue](./writevalue/)(const String\&) | [String](../../system/string/) 값을 씁니다. |
| virtual [WriteValue](./writevalue/)(bool) | [Boolean](../../system/boolean/) 값을 씁니다. |
| virtual [WriteValue](./writevalue/)(DateTime) | [DateTime](../../system/datetime/) 값을 씁니다. |
| virtual [WriteValue](./writevalue/)(DateTimeOffset) | [DateTimeOffset](../../system/datetimeoffset/) 값을 씁니다. |
| virtual [WriteValue](./writevalue/)(double) | [Double](../../system/double/) 값을 씁니다. |
| virtual [WriteValue](./writevalue/)(float) | 단정밀 부동소수점 숫자를 씁니다. |
| virtual [WriteValue](./writevalue/)(Decimal) | [Decimal](../../system/decimal/) 값을 씁니다. |
| virtual [WriteValue](./writevalue/)(int32_t) | [Int32](../../system/int32/) 값을 씁니다. |
| virtual [WriteValue](./writevalue/)(int64_t) | [Int64](../../system/int64/) 값을 씁니다. |
| virtual [WriteWhitespace](./writewhitespace/)(String) | 파생 클래스에서 재정의될 때, 지정된 공백을 출력합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 또 보기

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
