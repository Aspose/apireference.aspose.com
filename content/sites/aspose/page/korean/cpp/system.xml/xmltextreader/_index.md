---
title: "System::Xml::XmlTextReader 클래스"
linktitle: "XmlTextReader"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlTextReader 클래스. C++에서 XML 데이터를 빠르고, 캐시되지 않으며, 순방향 전용으로 액세스할 수 있는 리더를 나타냅니다."
type: docs
weight: 3900
url: /ko/cpp/system.xml/xmltextreader/
---
## XmlTextReader class


XML 데이터에 대해 빠르고 비캐시된 순방향 전용 액세스를 제공하는 리더를 나타냅니다.

```cpp
class XmlTextReader : public System::Xml::XmlReader,
                      public System::Xml::IXmlLineInfo,
                      public System::Xml::IXmlNamespaceResolver
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Close](./close/)() override | 읽기 상태를 [XmlReader::get_ReadState](../xmlreader/get_readstate/)를 **Closed** 로 변경합니다. |
| [get_AttributeCount](./get_attributecount/)() override | 현재 노드의 속성 개수를 반환합니다. |
| [get_BaseURI](./get_baseuri/)() override | 현재 노드의 기본 URI를 반환합니다. |
| [get_CanReadBinaryContent](./get_canreadbinarycontent/)() override | [XmlTextReader](./)가 바이너리 콘텐츠 읽기 메서드를 구현했는지 여부를 나타내는 값을 반환합니다. |
| [get_CanReadValueChunk](./get_canreadvaluechunk/)() override | [XmlTextReader](./)가 [XmlReader::ReadValueChunk](../xmlreader/readvaluechunk/) 메서드를 구현했는지 여부를 나타내는 값을 반환합니다. |
| [get_CanResolveEntity](./get_canresolveentity/)() override | 이 리더가 엔터티를 구문 분석하고 해결할 수 있는지 여부를 나타내는 값을 반환합니다. |
| [get_Depth](./get_depth/)() override | XML 문서에서 현재 노드의 깊이를 반환합니다. |
| [get_DtdProcessing](./get_dtdprocessing/)() | [DtdProcessing](../dtdprocessing/) 열거형을 반환합니다. |
| [get_Encoding](./get_encoding/)() | 문서의 인코딩을 반환합니다. |
| [get_EntityHandling](./get_entityhandling/)() | 리더가 엔터티를 처리하는 방식을 지정하는 값을 반환합니다. |
| [get_EOF](./get_eof/)() override | 리더가 스트림 끝에 위치했는지 여부를 나타내는 값을 반환합니다. |
| [get_HasValue](./get_hasvalue/)() override | 현재 노드가 [XmlTextReader::get_Value](./get_value/)에 [String::Empty](../../system/string/empty/)와 다른 값을 가질 수 있는지 여부를 나타내는 값을 반환합니다. |
| [get_IsDefault](./get_isdefault/)() override | 현재 노드가 DTD 또는 스키마에 정의된 기본값에서 생성된 속성인지 여부를 나타내는 값을 반환합니다. |
| [get_IsEmptyElement](./get_isemptyelement/)() override | 현재 노드가 빈 요소인지 여부를 나타내는 값을 반환합니다(예: **<MyElement/>**). |
| [get_LineNumber](./get_linenumber/)() override | 현재 행 번호를 반환합니다. |
| [get_LinePosition](./get_lineposition/)() override | 현재 행 위치를 반환합니다. |
| [get_LocalName](./get_localname/)() override | 현재 노드의 로컬 이름을 반환합니다. |
| [get_Name](./get_name/)() override | 현재 노드의 정규화된 이름을 반환합니다. |
| [get_Namespaces](./get_namespaces/)() | 네임스페이스 지원을 할지 여부를 나타내는 값을 반환합니다. |
| [get_NamespaceURI](./get_namespaceuri/)() override | 리더가 위치한 노드의 네임스페이스 URI를 반환합니다(W3C 네임스페이스 사양에 정의된 대로). |
| [get_NameTable](./get_nametable/)() override | 이 구현과 연결된 [XmlNameTable](../xmlnametable/)을 반환합니다. |
| [get_NodeType](./get_nodetype/)() override | 현재 노드의 유형을 반환합니다. |
| [get_Normalization](./get_normalization/)() | 공백 및 속성 값을 정규화할지 여부를 나타내는 값을 반환합니다. |
| [get_Prefix](./get_prefix/)() override | 현재 노드와 연결된 네임스페이스 접두사를 반환합니다. |
| [get_ProhibitDtd](./get_prohibitdtd/)() | DTD 처리를 허용할지 여부를 나타내는 값을 반환합니다. |
| [get_QuoteChar](./get_quotechar/)() override | 속성 노드 값을 둘러싸는 데 사용되는 따옴표 문자를 반환합니다. |
| [get_ReadState](./get_readstate/)() override | 리더의 상태를 반환합니다. |
| [get_Value](./get_value/)() override | 현재 노드의 텍스트 값을 반환합니다. |
| [get_WhitespaceHandling](./get_whitespacehandling/)() | 공백을 처리하는 방식을 지정하는 값을 반환합니다. |
| [get_XmlLang](./get_xmllang/)() override | 현재 **xml:lang** 범위를 반환합니다. |
| [get_XmlSpace](./get_xmlspace/)() override | 현재 **xml:space** 범위를 반환합니다. |
| [GetAttribute](./getattribute/)(String) override | 지정된 이름을 가진 속성의 값을 반환합니다. |
| [GetAttribute](./getattribute/)(String, String) override | 지정된 로컬 이름 및 네임스페이스 URI를 가진 속성의 값을 반환합니다. |
| [GetAttribute](./getattribute/)(int32_t) override | 지정된 인덱스를 가진 속성의 값을 반환합니다. |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | 현재 범위에 있는 모든 네임스페이스를 포함하는 컬렉션을 반환합니다. |
| [GetRemainder](./getremainder/)() | 버퍼링된 XML의 나머지를 반환합니다. |
| [HasLineInfo](./haslineinfo/)() override | 클래스가 행 정보를 반환할 수 있는지 여부를 나타내는 값을 반환합니다. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | 현재 요소의 범위에서 네임스페이스 접두사를 해석합니다. |
| [MoveToAttribute](./movetoattribute/)(String) override | 지정된 이름을 가진 속성으로 이동합니다. |
| [MoveToAttribute](./movetoattribute/)(String, String) override | 지정된 로컬 이름 및 네임스페이스 URI를 가진 속성으로 이동합니다. |
| [MoveToAttribute](./movetoattribute/)(int32_t) override | 지정된 인덱스를 가진 속성으로 이동합니다. |
| [MoveToElement](./movetoelement/)() override | 현재 속성 노드를 포함하는 요소로 이동합니다. |
| [MoveToFirstAttribute](./movetofirstattribute/)() override | 첫 번째 속성으로 이동합니다. |
| [MoveToNextAttribute](./movetonextattribute/)() override | 다음 속성으로 이동합니다. |
| [Read](./read/)() override | 스트림에서 다음 노드를 읽습니다. |
| [ReadAttributeValue](./readattributevalue/)() override | 속성 값을 하나 이상의 **[Text](../../system.text/)**, **EntityReference**, 또는 **EndEntity** 노드로 구문 분석합니다. |
| [ReadBase64](./readbase64/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Base64을 디코딩하고 디코딩된 바이너리 바이트를 반환합니다. |
| [ReadBinHex](./readbinhex/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | **BinHex**을 디코딩하고 디코딩된 바이너리 바이트를 반환합니다. |
| [ReadChars](./readchars/)(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) | 요소의 텍스트 내용을 문자 버퍼에 읽어들입니다. 이 메서드는 연속적으로 호출하여 큰 규모의 삽입 텍스트 스트림을 읽도록 설계되었습니다. |
| [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | 내용을 읽고 **Base64** 디코딩된 바이너리 바이트를 반환합니다. |
| [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | 내용을 읽고 **BinHex** 디코딩된 바이너리 바이트를 반환합니다. |
| [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | 요소를 읽고 Base64 콘텐츠를 디코딩합니다. |
| [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | 요소를 읽고 **BinHex** 콘텐츠를 디코딩합니다. |
| [ReadString](./readstring/)() override | 요소 또는 텍스트 노드의 내용을 문자열로 읽어들입니다. |
| [ResetState](./resetstate/)() | 리더의 상태를 [ReadState::Initial](../readstate/)으로 재설정합니다. |
| [ResolveEntity](./resolveentity/)() override | **EntityReference** 노드에 대한 엔터티 참조를 해결합니다. |
| [set_DtdProcessing](./set_dtdprocessing/)(System::Xml::DtdProcessing) | [DtdProcessing](../dtdprocessing/) 열거형을 설정합니다. |
| [set_EntityHandling](./set_entityhandling/)(System::Xml::EntityHandling) | 리더가 엔터티를 처리하는 방식을 지정하는 값을 설정합니다. |
| [set_Namespaces](./set_namespaces/)(bool) | 네임스페이스 지원을 수행할지 여부를 나타내는 값을 설정합니다. |
| [set_Normalization](./set_normalization/)(bool) | 공백 및 속성 값을 정규화할지 여부를 나타내는 값을 설정합니다. |
| [set_ProhibitDtd](./set_prohibitdtd/)(bool) | DTD 처리를 허용할지 여부를 나타내는 값을 설정합니다. |
| [set_WhitespaceHandling](./set_whitespacehandling/)(System::Xml::WhitespaceHandling) | 공백이 처리되는 방식을 지정하는 값을 설정합니다. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | DTD 참조를 해결하는 데 사용되는 [XmlResolver](../xmlresolver/)을 설정합니다. |
| [Skip](./skip/)() override | 현재 노드의 자식들을 건너뜁니다. |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::Stream\>\&) | 지정된 스트림으로 [XmlTextReader](./) 클래스의 새 인스턴스를 초기화합니다. |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::Stream\>\&) | 지정된 URL 및 스트림으로 [XmlTextReader](./) 클래스의 새 인스턴스를 초기화합니다. |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) | 지정된 스트림 및 [XmlNameTable](../xmlnametable/)으로 [XmlTextReader](./) 클래스의 새 인스턴스를 초기화합니다. |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) | 지정된 URL, 스트림 및 [XmlNameTable](../xmlnametable/)으로 [XmlTextReader](./) 클래스의 새 인스턴스를 초기화합니다. |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::TextReader\>\&) | 지정된 TextReader로 [XmlTextReader](./) 클래스의 새 인스턴스를 초기화합니다. |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::TextReader\>\&) | 지정된 URL 및 TextReader로 [XmlTextReader](./) 클래스의 새 인스턴스를 초기화합니다. |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) | 지정된 TextReader 및 [XmlNameTable](../xmlnametable/)으로 [XmlTextReader](./) 클래스의 새 인스턴스를 초기화합니다. |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) | 지정된 URL, TextReader 및 [XmlNameTable](../xmlnametable/)으로 [XmlTextReader](./) 클래스의 새 인스턴스를 초기화합니다. |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | 지정된 스트림, [XmlNodeType](../xmlnodetype/), 및 [XmlParserContext](../xmlparsercontext/)으로 [XmlTextReader](./) 클래스의 새 인스턴스를 초기화합니다. |
| [XmlTextReader](./xmltextreader/)(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | 지정된 문자열, [XmlNodeType](../xmlnodetype/), 및 [XmlParserContext](../xmlparsercontext/)으로 [XmlTextReader](./) 클래스의 새 인스턴스를 초기화합니다. |
| [XmlTextReader](./xmltextreader/)(const String\&) | 지정된 파일로 [XmlTextReader](./) 클래스의 새 인스턴스를 초기화합니다. |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<XmlNameTable\>\&) | 지정된 파일 및 [XmlNameTable](../xmlnametable/)으로 [XmlTextReader](./) 클래스의 새 인스턴스를 초기화합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



대신 [XmlReader](../xmlreader/) 클래스를 사용하는 것이 권장됩니다.

이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [XmlReader](../xmlreader/)
* Class [IXmlLineInfo](../ixmllineinfo/)
* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
