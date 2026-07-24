---
title: "System::Xml::XmlValidatingReader 클래스"
linktitle: "XmlValidatingReader"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlValidatingReader 클래스. C++에서 문서 유형 정의(DTD), XML-Data Reduced (XDR) 스키마 및 XML 스키마 정의 언어(XSD) 검증을 제공하는 리더를 나타냅니다."
type: docs
weight: 4200
url: /ko/cpp/system.xml/xmlvalidatingreader/
---
## XmlValidatingReader class


문서 유형 정의(DTD), XML-Data Reduced (XDR) 스키마 및 XML [Schema](../../system.xml.schema/) 정의 언어(XSD) 검증을 제공하는 리더를 나타냅니다.

```cpp
class XmlValidatingReader : public System::Xml::XmlReader,
                            public System::Xml::IXmlLineInfo,
                            public System::Xml::IXmlNamespaceResolver
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Close](./close/)() override | [XmlReader::get_ReadState](../xmlreader/get_readstate/)를 Closed로 변경합니다. |
| [get_AttributeCount](./get_attributecount/)() override | 현재 노드의 속성 개수를 반환합니다. |
| [get_BaseURI](./get_baseuri/)() override | 현재 노드의 기본 URI를 반환합니다. |
| [get_CanReadBinaryContent](./get_canreadbinarycontent/)() override | [XmlValidatingReader](./)이 바이너리 콘텐츠 읽기 메서드를 구현하는지 여부를 나타내는 값을 반환합니다. |
| [get_CanResolveEntity](./get_canresolveentity/)() override | 이 리더가 엔터티를 구문 분석하고 해결할 수 있는지 여부를 나타내는 값을 반환합니다. |
| [get_Depth](./get_depth/)() override | XML 문서에서 현재 노드의 깊이를 반환합니다. |
| [get_Encoding](./get_encoding/)() | 문서의 인코딩 속성을 반환합니다. |
| [get_EntityHandling](./get_entityhandling/)() | 리더가 엔터티를 처리하는 방식을 지정하는 값을 반환합니다. |
| [get_EOF](./get_eof/)() override | 리더가 스트림 끝에 위치했는지 여부를 나타내는 값을 반환합니다. |
| [get_HasValue](./get_hasvalue/)() override | 현재 노드가 [String::Empty](../../system/string/empty/)가 아닌 [XmlValidatingReader::get_Value](./get_value/) 값을 가질 수 있는지 여부를 나타내는 값을 반환합니다. |
| [get_IsDefault](./get_isdefault/)() override | 현재 노드가 문서 유형 정의(DTD) 또는 스키마에 정의된 기본값에서 생성된 속성인지 여부를 나타내는 값을 반환합니다. |
| [get_IsEmptyElement](./get_isemptyelement/)() override | 현재 노드가 빈 요소인지 여부를 나타내는 값을 반환합니다(예: **<MyElement/>**). |
| [get_LineNumber](./get_linenumber/)() override | 현재 행 번호를 반환합니다. |
| [get_LinePosition](./get_lineposition/)() override | 현재 행 위치를 반환합니다. |
| [get_LocalName](./get_localname/)() override | 현재 노드의 로컬 이름을 반환합니다. |
| [get_Name](./get_name/)() override | 현재 노드의 정규화된 이름을 반환합니다. |
| [get_Namespaces](./get_namespaces/)() | 네임스페이스 지원을 할지 여부를 나타내는 값을 반환합니다. |
| [get_NamespaceURI](./get_namespaceuri/)() override | 리더가 위치한 노드의 네임스페이스 Uniform Resource Identifier (URI)를 반환합니다(월드 와이드 [Web](../../system.web/) 컨소시엄(W3C) 네임스페이스 사양에 정의된 대로). |
| [get_NameTable](./get_nametable/)() override | 이 구현과 연결된 [XmlNameTable](../xmlnametable/)을 반환합니다. |
| [get_NodeType](./get_nodetype/)() override | 현재 노드의 유형을 반환합니다. |
| [get_Prefix](./get_prefix/)() override | 현재 노드와 연결된 네임스페이스 접두사를 반환합니다. |
| [get_QuoteChar](./get_quotechar/)() override | 속성 노드 값을 둘러싸는 데 사용되는 따옴표 문자를 반환합니다. |
| [get_Reader](./get_reader/)() | 이 [XmlValidatingReader](./)를 구성하는 데 사용된 [XmlReader](../xmlreader/)를 반환합니다. |
| [get_ReadState](./get_readstate/)() override | 리더의 상태를 반환합니다. |
| [get_Schemas](./get_schemas/)() | 검증에 사용할 XmlSchemaCollection을 반환합니다. |
| [get_SchemaType](./get_schematype/)() | 스키마 유형 객체를 반환합니다. |
| [get_ValidationType](./get_validationtype/)() | 수행할 검증 유형을 나타내는 값을 반환합니다. |
| [get_Value](./get_value/)() override | 현재 노드의 텍스트 값을 반환합니다. |
| [get_XmlLang](./get_xmllang/)() override | 현재 **xml:lang** 범위를 반환합니다. |
| [get_XmlSpace](./get_xmlspace/)() override | 현재 **xml:space** 범위를 반환합니다. |
| [GetAttribute](./getattribute/)(String) override | 지정된 이름을 가진 속성의 값을 반환합니다. |
| [GetAttribute](./getattribute/)(String, String) override | 지정된 로컬 이름 및 네임스페이스 Uniform Resource Identifier (URI)를 가진 속성의 값을 반환합니다. |
| [GetAttribute](./getattribute/)(int32_t) override | 지정된 인덱스를 가진 속성의 값을 반환합니다. |
| [HasLineInfo](./haslineinfo/)() override | 클래스가 행 정보를 반환할 수 있는지 여부를 나타내는 값을 반환합니다. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | 현재 요소의 범위에서 네임스페이스 접두사를 해석합니다. |
| [MoveToAttribute](./movetoattribute/)(String) override | 지정된 이름을 가진 속성으로 이동합니다. |
| [MoveToAttribute](./movetoattribute/)(String, String) override | 지정된 로컬 이름 및 네임스페이스 Uniform Resource Identifier (URI)의 속성으로 이동합니다. |
| [MoveToAttribute](./movetoattribute/)(int32_t) override | 지정된 인덱스를 가진 속성으로 이동합니다. |
| [MoveToElement](./movetoelement/)() override | 현재 속성 노드를 포함하는 요소로 이동합니다. |
| [MoveToFirstAttribute](./movetofirstattribute/)() override | 첫 번째 속성으로 이동합니다. |
| [MoveToNextAttribute](./movetonextattribute/)() override | 다음 속성으로 이동합니다. |
| [Read](./read/)() override | 스트림에서 다음 노드를 읽습니다. |
| [ReadAttributeValue](./readattributevalue/)() override | 속성 값을 하나 이상의 **[Text](../../system.text/)**, **EntityReference**, 또는 **EndEntity** 노드로 구문 분석합니다. |
| [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | 내용을 읽고 Base64 디코딩된 바이너리 바이트를 반환합니다. |
| [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | 내용을 읽고 BinHex 디코딩된 바이너리 바이트를 반환합니다. |
| [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | 요소를 읽고 Base64 콘텐츠를 디코딩합니다. |
| [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | 요소를 읽고 BinHex 콘텐츠를 디코딩합니다. |
| [ReadString](./readstring/)() override | 요소 또는 텍스트 노드의 내용을 문자열로 읽습니다. |
| [ReadTypedValue](./readtypedvalue/)() | 지정된 XML [Schema](../../system.xml.schema/) 정의 언어 (XSD) 유형에 대한 런타임 유형을 반환합니다. |
| [ResolveEntity](./resolveentity/)() override | **EntityReference** 노드에 대한 엔터티 참조를 해결합니다. |
| [set_EntityHandling](./set_entityhandling/)(System::Xml::EntityHandling) | 리더가 엔터티를 처리하는 방식을 지정하는 값을 설정합니다. |
| [set_Namespaces](./set_namespaces/)(bool) | 네임스페이스 지원을 수행할지 여부를 나타내는 값을 설정합니다. |
| [set_ValidationType](./set_validationtype/)(System::Xml::ValidationType) | 수행할 검증 유형을 나타내는 값을 설정합니다. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | [XmlResolver](../xmlresolver/)를 설정하여 외부 문서 유형 정의(DTD) 및 스키마 위치 참조를 해결합니다. 또한 [XmlResolver](../xmlresolver/)는 XML [Schema](../../system.xml.schema/) 정의 언어 (XSD) 스키마에서 발견되는 import 또는 include 요소를 처리하는 데 사용됩니다. |
| [ValidationEventHandler_add](./validationeventhandler_add/)(Args...) | 문서 유형 정의(DTD), XML-Data Reduced (XDR) 스키마 및 XML [Schema](../../system.xml.schema/) 정의 언어 (XSD) 스키마 검증 오류에 대한 정보를 수신하기 위한 이벤트 핸들러를 추가합니다. |
| [ValidationEventHandler_remove](./validationeventhandler_remove/)(Args...) | 문서 유형 정의(DTD), XML-Data Reduced (XDR) 스키마 및 XML [Schema](../../system.xml.schema/) 정의 언어 (XSD) 스키마 검증 오류에 대한 정보를 수신하기 위한 이벤트 핸들러를 제거합니다. |
| [XmlValidatingReader](./xmlvalidatingreader/)(const SharedPtr\<XmlReader\>\&) | 주어진 [XmlReader](../xmlreader/)에서 반환된 내용을 검증하는 [XmlValidatingReader](./) 클래스의 새 인스턴스를 초기화합니다. |
| [XmlValidatingReader](./xmlvalidatingreader/)(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | 지정된 값으로 [XmlValidatingReader](./) 클래스의 새 인스턴스를 초기화합니다. |
| [XmlValidatingReader](./xmlvalidatingreader/)(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | 지정된 값으로 [XmlValidatingReader](./) 클래스의 새 인스턴스를 초기화합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고


## Deprecated
이 클래스는 사용되지 않습니다. 검증 XML 리더를 만들기 위해 XmlReaderSettings 클래스와 XmlReader::Create 메서드를 사용하는 것이 권장됩니다.

이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [XmlReader](../xmlreader/)
* Class [IXmlLineInfo](../ixmllineinfo/)
* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
