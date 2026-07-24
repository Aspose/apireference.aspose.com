---
title: "System::Xml::XmlReader class"
linktitle: "XmlReader"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlReader class. C++에서 XML 데이터를 빠르고, 캐시되지 않으며, 순방향 전용으로 액세스할 수 있는 리더를 나타냅니다."
type: docs
weight: 3300
url: /ko/cpp/system.xml/xmlreader/
---
## XmlReader class


XML 데이터에 대해 빠르고 비캐시된 순방향 전용 액세스를 제공하는 리더를 나타냅니다.

```cpp
class XmlReader : public System::IDisposable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [Close](./close/)() | 파생 클래스에서 재정의될 경우, [XmlReader::get_ReadState](./get_readstate/)를 [ReadState::Closed](../readstate/)로 변경합니다. |
| static [Create](./create/)(const String\&) | 지정된 URI를 사용하여 새로운 [XmlReader](./) 인스턴스를 생성합니다. |
| static [Create](./create/)(const String\&, const SharedPtr\<XmlReaderSettings\>\&) | 지정된 URI와 설정을 사용하여 새로운 [XmlReader](./) 인스턴스를 생성합니다. |
| static [Create](./create/)(const String\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | 지정된 URI, 설정 및 구문 분석을 위한 컨텍스트 정보를 사용하여 새로운 [XmlReader](./) 인스턴스를 생성합니다. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&) | 지정된 스트림을 기본 설정과 함께 사용하여 새로운 [XmlReader](./) 인스턴스를 생성합니다. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlReaderSettings\>\&) | 지정된 스트림 및 설정으로 새로운 [XmlReader](./) 인스턴스를 생성합니다. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) | 지정된 스트림, 기본 URI 및 설정을 사용하여 새로운 [XmlReader](./) 인스턴스를 생성합니다. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | 지정된 스트림, 설정 및 구문 분석을 위한 컨텍스트 정보를 사용하여 새로운 [XmlReader](./) 인스턴스를 생성합니다. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&) | 지정된 텍스트 리더를 사용하여 새로운 [XmlReader](./) 인스턴스를 생성합니다. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlReaderSettings\>\&) | 지정된 텍스트 리더와 설정을 사용하여 새로운 [XmlReader](./) 인스턴스를 생성합니다. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) | 지정된 텍스트 리더, 설정 및 기본 URI를 사용하여 새로운 [XmlReader](./) 인스턴스를 생성합니다. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | 지정된 텍스트 리더, 설정 및 구문 분석을 위한 컨텍스트 정보를 사용하여 새로운 [XmlReader](./) 인스턴스를 생성합니다. |
| static [Create](./create/)(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlReaderSettings\>) | 지정된 XML 리더와 설정을 사용하여 새로운 [XmlReader](./) 인스턴스를 생성합니다. |
| [Dispose](./dispose/)() override | 현재 [XmlReader](./) 클래스 인스턴스가 사용한 모든 리소스를 해제합니다. |
| virtual [get_AttributeCount](./get_attributecount/)() | 파생 클래스에서 재정의될 경우, 현재 노드의 속성 수를 가져옵니다. |
| virtual [get_BaseURI](./get_baseuri/)() | 파생 클래스에서 재정의될 경우, 현재 노드의 기본 URI를 가져옵니다. |
| virtual [get_CanReadBinaryContent](./get_canreadbinarycontent/)() | [XmlReader](./)가 바이너리 콘텐츠 읽기 메서드를 구현하는지 여부를 나타내는 값을 반환합니다. |
| virtual [get_CanReadValueChunk](./get_canreadvaluechunk/)() | [XmlReader](./)가 [XmlReader::ReadValueChunk](./readvaluechunk/) 메서드를 구현하는지 여부를 나타내는 값을 반환합니다. |
| virtual [get_CanResolveEntity](./get_canresolveentity/)() | 이 리더가 엔터티를 구문 분석하고 해결할 수 있는지 여부를 나타내는 값을 반환합니다. |
| virtual [get_Depth](./get_depth/)() | 파생 클래스에서 재정의될 경우, XML 문서에서 현재 노드의 깊이를 가져옵니다. |
| virtual [get_EOF](./get_eof/)() | 파생 클래스에서 재정의될 경우, 리더가 스트림 끝에 위치했는지 여부를 나타내는 값을 가져옵니다. |
| virtual [get_HasAttributes](./get_hasattributes/)() | 현재 노드에 속성이 있는지 여부를 나타내는 값을 반환합니다. |
| virtual [get_HasValue](./get_hasvalue/)() | 파생 클래스에서 재정의될 경우, 현재 노드가 [XmlReader::get_Value](./get_value/) 값을 가질 수 있는지 여부를 나타내는 값을 가져옵니다. |
| virtual [get_IsDefault](./get_isdefault/)() | 파생 클래스에서 재정의될 경우, 현재 노드가 DTD 또는 스키마에 정의된 기본값에서 생성된 속성인지 여부를 나타내는 값을 가져옵니다. |
| virtual [get_IsEmptyElement](./get_isemptyelement/)() | 파생 클래스에서 재정의될 경우, 현재 노드가 빈 요소인지 여부를 나타내는 값을 가져옵니다 (예: **<MyElement/>**). |
| virtual [get_LocalName](./get_localname/)() | 파생 클래스에서 재정의될 경우, 현재 노드의 로컬 이름을 가져옵니다. |
| virtual [get_Name](./get_name/)() | 파생 클래스에서 재정의될 경우, 현재 노드의 정규화된 이름을 가져옵니다. |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | 파생 클래스에서 재정의될 경우, 리더가 위치한 노드의 네임스페이스 URI를 가져옵니다 (W3C 네임스페이스 사양에 정의된 대로). |
| virtual [get_NameTable](./get_nametable/)() | 파생 클래스에서 재정의될 때, 이 구현과 연결된 [XmlNameTable](../xmlnametable/)을 가져옵니다. |
| virtual [get_NodeType](./get_nodetype/)() | 파생 클래스에서 재정의될 때, 현재 노드의 유형을 가져옵니다. |
| virtual [get_Prefix](./get_prefix/)() | 파생 클래스에서 재정의될 때, 현재 노드와 연결된 네임스페이스 접두사를 가져옵니다. |
| virtual [get_QuoteChar](./get_quotechar/)() | 파생 클래스에서 재정의될 때, 속성 노드 값을 둘러싸는 따옴표 문자를 가져옵니다. |
| virtual [get_ReadState](./get_readstate/)() | 파생 클래스에서 재정의될 때, 리더의 상태를 가져옵니다. |
| virtual [get_SchemaInfo](./get_schemainfo/)() | 스키마 검증 결과 현재 노드에 할당된 스키마 정보를 반환합니다. |
| virtual [get_Settings](./get_settings/)() | 이 [XmlReader](./) 인스턴스를 생성하는 데 사용된 [XmlReaderSettings](../xmlreadersettings/) 객체를 반환합니다. |
| virtual [get_Value](./get_value/)() | 파생 클래스에서 재정의될 때, 현재 노드의 텍스트 값을 가져옵니다. |
| virtual [get_ValueType](./get_valuetype/)() | 현재 노드의 유형을 반환합니다. |
| virtual [get_XmlLang](./get_xmllang/)() | 파생 클래스에서 재정의될 때, 현재 **xml:lang** 범위를 가져옵니다. |
| virtual [get_XmlSpace](./get_xmlspace/)() | 파생 클래스에서 재정의될 때, 현재 **xml:space** 범위를 가져옵니다. |
| virtual [GetAttribute](./getattribute/)(String) | 파생 클래스에서 재정의될 때, 지정된 [XmlReader::get_Name](./get_name/) 값과 일치하는 속성의 값을 가져옵니다. |
| virtual [GetAttribute](./getattribute/)(String, String) | 파생 클래스에서 재정의될 때, 지정된 [XmlReader::get_LocalName](./get_localname/) 및 [XmlReader::get_NamespaceURI](./get_namespaceuri/) 값과 일치하는 속성의 값을 가져옵니다. |
| virtual [GetAttribute](./getattribute/)(int32_t) | 파생 클래스에서 재정의될 때, 지정된 인덱스에 해당하는 속성의 값을 가져옵니다. |
| virtual [idx_get](./idx_get/)(int32_t) | 파생 클래스에서 재정의될 때, 지정된 인덱스에 해당하는 속성의 값을 가져옵니다. |
| virtual [idx_get](./idx_get/)(String) | 파생 클래스에서 재정의될 때, 지정된 [XmlReader::get_Name](./get_name/) 값과 일치하는 속성의 값을 가져옵니다. |
| virtual [idx_get](./idx_get/)(String, String) | 파생 클래스에서 재정의될 때, 지정된 [XmlReader::get_LocalName](./get_localname/) 및 [XmlReader::get_NamespaceURI](./get_namespaceuri/) 값과 일치하는 속성의 값을 가져옵니다. |
| static [IsName](./isname/)(const String\&) | 문자열 인수가 유효한 XML 이름인지 여부를 나타내는 값을 반환합니다. |
| static [IsNameToken](./isnametoken/)(const String\&) | 문자열 인수가 유효한 XML 이름 토큰인지 여부를 나타내는 값을 반환합니다. |
| virtual [IsStartElement](./isstartelement/)() | [XmlReader::MoveToContent](./movetocontent/)을 호출하고 현재 콘텐츠 노드가 시작 태그 또는 빈 요소 태그인지 테스트합니다. |
| virtual [IsStartElement](./isstartelement/)(String) | [XmlReader::MoveToContent](./movetocontent/)을 호출하고 현재 콘텐츠 노드가 시작 태그 또는 빈 요소 태그인지, 그리고 찾은 요소의 [XmlReader::get_Name](./get_name/) 값이 제공된 인수와 일치하는지 테스트합니다. |
| virtual [IsStartElement](./isstartelement/)(String, String) | [XmlReader::MoveToContent](./movetocontent/)을 호출하고 현재 콘텐츠 노드가 시작 태그 또는 빈 요소 태그인지, 그리고 찾은 요소의 [XmlReader::get_LocalName](./get_localname/) 및 [XmlReader::get_NamespaceURI](./get_namespaceuri/) 값이 제공된 문자열과 일치하는지 테스트합니다. |
| virtual [LookupNamespace](./lookupnamespace/)(const String\&) | 파생 클래스에서 재정의될 때, 현재 요소 범위에서 네임스페이스 접두사를 해석합니다. |
| virtual [MoveToAttribute](./movetoattribute/)(String) | 파생 클래스에서 재정의될 때, 지정된 [XmlReader::get_Name](./get_name/) 값을 가진 속성으로 이동합니다. |
| virtual [MoveToAttribute](./movetoattribute/)(String, String) | 파생 클래스에서 재정의될 때, 지정된 [XmlReader::get_LocalName](./get_localname/) 및 [XmlReader::get_NamespaceURI](./get_namespaceuri/) 값을 가진 속성으로 이동합니다. |
| virtual [MoveToAttribute](./movetoattribute/)(int32_t) | 파생 클래스에서 재정의될 때, 지정된 인덱스에 해당하는 속성으로 이동합니다. |
| virtual [MoveToContent](./movetocontent/)() | 현재 노드가 콘텐츠(공백이 아닌 텍스트, **CDATA**, **Element**, **EndElement**, **EntityReference**, 또는 **EndEntity**) 노드인지 확인합니다. 노드가 콘텐츠 노드가 아니면, 리더는 다음 콘텐츠 노드나 파일 끝까지 건너뜁니다. 다음 유형의 노드를 건너뜁니다: **ProcessingInstruction**, **DocumentType**, **Comment**, **Whitespace**, 또는 **SignificantWhitespace**. |
| virtual [MoveToElement](./movetoelement/)() | 파생 클래스에서 재정의될 때, 현재 속성 노드를 포함하는 요소로 이동합니다. |
| virtual [MoveToFirstAttribute](./movetofirstattribute/)() | 파생 클래스에서 재정의될 때, 첫 번째 속성으로 이동합니다. |
| virtual [MoveToNextAttribute](./movetonextattribute/)() | 파생 클래스에서 재정의될 때, 다음 속성으로 이동합니다. |
| virtual [Read](./read/)() | 파생 클래스에서 재정의될 때, 스트림에서 다음 노드를 읽습니다. |
| virtual [ReadAttributeValue](./readattributevalue/)() | 파생 클래스에서 재정의될 때, 속성 값을 하나 이상의 **[Text](../../system.text/)**, **EntityReference**, 또는 **EndEntity** 노드로 구문 분석합니다. |
| virtual [ReadContentAs](./readcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | 지정된 유형의 객체로 내용을 읽습니다. |
| virtual [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | 내용을 읽고 Base64 디코딩된 바이너리 바이트를 반환합니다. |
| virtual [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | 내용을 읽고 **BinHex** 디코딩된 바이너리 바이트를 반환합니다. |
| virtual [ReadContentAsBoolean](./readcontentasboolean/)() | 현재 위치에서 텍스트 내용을 [Boolean](../../system/boolean/) 형식으로 읽습니다. |
| virtual [ReadContentAsDateTime](./readcontentasdatetime/)() | 현재 위치에서 텍스트 내용을 [DateTime](../../system/datetime/) 객체로 읽습니다. |
| virtual [ReadContentAsDateTimeOffset](./readcontentasdatetimeoffset/)() | 현재 위치에서 텍스트 내용을 [DateTimeOffset](../../system/datetimeoffset/) 객체로 읽습니다. |
| virtual [ReadContentAsDecimal](./readcontentasdecimal/)() | 현재 위치에서 텍스트 내용을 [Decimal](../../system/decimal/) 객체로 읽습니다. |
| virtual [ReadContentAsDouble](./readcontentasdouble/)() | 현재 위치에서 텍스트 내용을 배정밀도 부동 소수점 숫자로 읽습니다. |
| virtual [ReadContentAsFloat](./readcontentasfloat/)() | 현재 위치에서 텍스트 내용을 단정밀도 부동 소수점 숫자로 읽습니다. |
| virtual [ReadContentAsInt](./readcontentasint/)() | 현재 위치에서 텍스트 내용을 32비트 부호 있는 정수로 읽습니다. |
| virtual [ReadContentAsLong](./readcontentaslong/)() | 현재 위치에서 텍스트 내용을 64비트 부호 있는 정수로 읽습니다. |
| virtual [ReadContentAsObject](./readcontentasobject/)() | 현재 위치에서 텍스트 내용을 [Object](../../system/object/) 로 읽습니다. |
| virtual [ReadContentAsString](./readcontentasstring/)() | 현재 위치에서 텍스트 내용을 [String](../../system/string/) 객체로 읽습니다. |
| virtual [ReadElementContentAs](./readelementcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | 요청된 유형으로 요소 내용을 읽습니다. |
| virtual [ReadElementContentAs](./readelementcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>, String, String) | 지정된 로컬 이름과 네임스페이스 URI가 현재 요소와 일치하는지 확인한 다음, 요청된 유형으로 요소 내용을 읽습니다. |
| virtual [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | 요소를 읽고 **Base64** 콘텐츠를 디코딩합니다. |
| virtual [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | 요소를 읽고 **BinHex** 콘텐츠를 디코딩합니다. |
| virtual [ReadElementContentAsBoolean](./readelementcontentasboolean/)() | 현재 요소를 읽고 내용을 [Boolean](../../system/boolean/) 객체로 반환합니다. |
| virtual [ReadElementContentAsBoolean](./readelementcontentasboolean/)(String, String) | 지정된 로컬 이름과 네임스페이스 URI가 현재 요소와 일치하는지 확인한 다음, 현재 요소를 읽고 내용을 [Boolean](../../system/boolean/) 객체로 반환합니다. |
| virtual [ReadElementContentAsDateTime](./readelementcontentasdatetime/)() | 현재 요소를 읽고 내용을 [DateTime](../../system/datetime/) 객체로 반환합니다. |
| virtual [ReadElementContentAsDateTime](./readelementcontentasdatetime/)(String, String) | 지정된 로컬 이름과 네임스페이스 URI가 현재 요소와 일치하는지 확인한 다음, 현재 요소를 읽고 내용을 [DateTime](../../system/datetime/) 객체로 반환합니다. |
| virtual [ReadElementContentAsDecimal](./readelementcontentasdecimal/)() | 현재 요소를 읽고 내용을 [Decimal](../../system/decimal/) 객체로 반환합니다. |
| virtual [ReadElementContentAsDecimal](./readelementcontentasdecimal/)(String, String) | 지정된 로컬 이름과 네임스페이스 URI가 현재 요소와 일치하는지 확인한 다음, 현재 요소를 읽고 내용을 [Decimal](../../system/decimal/) 객체로 반환합니다. |
| virtual [ReadElementContentAsDouble](./readelementcontentasdouble/)() | 현재 요소를 읽고 내용을 배정밀도 부동 소수점 숫자로 반환합니다. |
| virtual [ReadElementContentAsDouble](./readelementcontentasdouble/)(String, String) | 지정된 로컬 이름과 네임스페이스 URI가 현재 요소와 일치하는지 확인한 다음 현재 요소를 읽고 내용을 배정밀도 부동소수점 숫자로 반환합니다. |
| virtual [ReadElementContentAsFloat](./readelementcontentasfloat/)() | 현재 요소를 읽고 내용을 단정밀도 부동소수점 숫자로 반환합니다. |
| virtual [ReadElementContentAsFloat](./readelementcontentasfloat/)(String, String) | 지정된 로컬 이름과 네임스페이스 URI가 현재 요소와 일치하는지 확인한 다음 현재 요소를 읽고 내용을 단정밀도 부동소수점 숫자로 반환합니다. |
| virtual [ReadElementContentAsInt](./readelementcontentasint/)() | 현재 요소를 읽고 내용을 32비트 부호 있는 정수로 반환합니다. |
| virtual [ReadElementContentAsInt](./readelementcontentasint/)(String, String) | 지정된 로컬 이름과 네임스페이스 URI가 현재 요소와 일치하는지 확인한 다음 현재 요소를 읽고 내용을 32비트 부호 있는 정수로 반환합니다. |
| virtual [ReadElementContentAsLong](./readelementcontentaslong/)() | 현재 요소를 읽고 내용을 64비트 부호 있는 정수로 반환합니다. |
| virtual [ReadElementContentAsLong](./readelementcontentaslong/)(String, String) | 지정된 로컬 이름과 네임스페이스 URI가 현재 요소와 일치하는지 확인한 다음 현재 요소를 읽고 내용을 64비트 부호 있는 정수로 반환합니다. |
| virtual [ReadElementContentAsObject](./readelementcontentasobject/)() | 현재 요소를 읽고 내용을 [Object](../../system/object/) 로 반환합니다. |
| virtual [ReadElementContentAsObject](./readelementcontentasobject/)(String, String) | 지정된 로컬 이름과 네임스페이스 URI가 현재 요소와 일치하는지 확인한 다음 현재 요소를 읽고 내용을 [Object](../../system/object/) 로 반환합니다. |
| virtual [ReadElementContentAsString](./readelementcontentasstring/)() | 현재 요소를 읽고 내용을 [String](../../system/string/) 객체로 반환합니다. |
| virtual [ReadElementContentAsString](./readelementcontentasstring/)(String, String) | 지정된 로컬 이름과 네임스페이스 URI가 현재 요소와 일치하는지 확인한 다음 현재 요소를 읽고 내용을 [String](../../system/string/) 객체로 반환합니다. |
| virtual [ReadElementString](./readelementstring/)() | 텍스트 전용 요소를 읽습니다. 그러나 이 작업을 보다 간단하게 처리할 수 있기 때문에 대신 [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) 메서드를 사용하는 것이 권장됩니다. |
| virtual [ReadElementString](./readelementstring/)(String) | 텍스트 전용 요소를 읽기 전에 찾은 요소의 [XmlReader::get_Name](./get_name/) 값이 지정된 문자열과 일치하는지 확인합니다. 그러나 이 작업을 보다 간단하게 처리할 수 있기 때문에 대신 [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) 메서드를 사용하는 것이 권장됩니다. |
| virtual [ReadElementString](./readelementstring/)(String, String) | 텍스트 전용 요소를 읽기 전에 찾은 요소의 [XmlReader::get_LocalName](./get_localname/) 및 [XmlReader::get_NamespaceURI](./get_namespaceuri/) 값이 지정된 문자열과 일치하는지 확인합니다. 그러나 이 작업을 보다 간단하게 처리할 수 있기 때문에 대신 [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) 메서드를 사용하는 것이 권장됩니다. |
| virtual [ReadEndElement](./readendelement/)() | 현재 콘텐츠 노드가 종료 태그인지 확인하고 리더를 다음 노드로 이동합니다. |
| virtual [ReadInnerXml](./readinnerxml/)() | 파생 클래스에서 재정의될 경우, 마크업을 포함한 모든 콘텐츠를 문자열로 읽습니다. |
| virtual [ReadOuterXml](./readouterxml/)() | 파생 클래스에서 재정의될 경우, 이 노드와 모든 자식을 나타내는 마크업을 포함한 콘텐츠를 읽습니다. |
| virtual [ReadStartElement](./readstartelement/)() | 현재 노드가 요소인지 확인하고 리더를 다음 노드로 이동합니다. |
| virtual [ReadStartElement](./readstartelement/)(String) | 현재 콘텐츠 노드가 주어진 [XmlReader::get_Name](./get_name/) 값을 가진 요소인지 확인하고 리더를 다음 노드로 이동합니다. |
| virtual [ReadStartElement](./readstartelement/)(String, String) | 현재 콘텐츠 노드가 주어진 [XmlReader::get_LocalName](./get_localname/) 및 [XmlReader::get_NamespaceURI](./get_namespaceuri/) 값을 가진 요소인지 확인하고 리더를 다음 노드로 이동합니다. |
| virtual [ReadString](./readstring/)() | 파생 클래스에서 재정의될 경우, 요소 또는 텍스트 노드의 내용을 문자열로 읽습니다. 그러나 이 작업을 보다 간단하게 처리할 수 있기 때문에 대신 [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) 메서드를 사용하는 것이 권장됩니다. |
| virtual [ReadSubtree](./readsubtree/)() | 현재 노드와 모든 하위 노드를 읽는 데 사용할 수 있는 새로운 [XmlReader](./) 인스턴스를 반환합니다. |
| virtual [ReadToDescendant](./readtodescendant/)(String) | [XmlReader](./)를 지정된 한정 이름을 가진 다음 하위 요소로 이동합니다. |
| virtual [ReadToDescendant](./readtodescendant/)(String, String) | [XmlReader](./)를 지정된 로컬 이름과 네임스페이스 URI를 가진 다음 하위 요소로 이동합니다. |
| virtual [ReadToFollowing](./readtofollowing/)(String) | 지정된 한정 이름을 가진 요소가 발견될 때까지 읽습니다. |
| virtual [ReadToFollowing](./readtofollowing/)(String, String) | 지정된 로컬 이름 및 네임스페이스 URI를 가진 요소가 발견될 때까지 읽습니다. |
| virtual [ReadToNextSibling](./readtonextsibling/)(String) | 지정된 정규화된 이름을 가진 다음 형제 요소로 [XmlReader](./)를 이동합니다. |
| virtual [ReadToNextSibling](./readtonextsibling/)(String, String) | 지정된 로컬 이름 및 네임스페이스 URI를 가진 다음 형제 요소로 [XmlReader](./)를 이동합니다. |
| virtual [ReadValueChunk](./readvaluechunk/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | XML 문서에 포함된 큰 텍스트 스트림을 읽습니다. |
| virtual [ResolveEntity](./resolveentity/)() | 파생 클래스에서 재정의될 경우, **EntityReference** 노드에 대한 엔터티 참조를 해결합니다. |
| virtual [Skip](./skip/)() | 현재 노드의 자식들을 건너뜁니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 또 보기

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
