---
title: "System::Xml::XmlNodeReader 클래스"
linktitle: "XmlNodeReader"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlNodeReader 클래스. C++에서 XmlNode의 XML 데이터에 대해 빠르고 캐시되지 않은 순방향 전용 액세스를 제공하는 리더를 나타냅니다."
type: docs
weight: 2800
url: /ko/cpp/system.xml/xmlnodereader/
---
## XmlNodeReader class


[XmlNode](../xmlnode/)의 XML 데이터에 대해 빠르고 캐시되지 않은 순방향 전용 액세스를 제공하는 리더를 나타냅니다.

```cpp
class XmlNodeReader : public System::Xml::XmlReader,
                      public System::Xml::IXmlNamespaceResolver
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Close](./close/)() override | [XmlNodeReader::get_ReadState](./get_readstate/)을 [ReadState::Closed](../readstate/)으로 변경합니다. |
| [get_AttributeCount](./get_attributecount/)() override | 현재 노드의 속성 개수를 반환합니다. |
| [get_BaseURI](./get_baseuri/)() override | 현재 노드의 기본 URI를 반환합니다. |
| [get_CanReadBinaryContent](./get_canreadbinarycontent/)() override | [XmlNodeReader](./)가 바이너리 콘텐츠 읽기 메서드를 구현하는지 여부를 나타내는 값을 반환합니다. |
| [get_CanResolveEntity](./get_canresolveentity/)() override | 이 리더가 엔터티를 구문 분석하고 해결할 수 있는지 여부를 나타내는 값을 반환합니다. |
| [get_Depth](./get_depth/)() override | XML 문서에서 현재 노드의 깊이를 반환합니다. |
| [get_EOF](./get_eof/)() override | 리더가 스트림 끝에 위치했는지 여부를 나타내는 값을 반환합니다. |
| [get_HasAttributes](./get_hasattributes/)() override | 현재 노드에 속성이 있는지 여부를 나타내는 값을 반환합니다. |
| [get_HasValue](./get_hasvalue/)() override | 현재 노드가 [XmlNodeReader::get_Value](./get_value/) 값을 가질 수 있는지 여부를 나타내는 값을 반환합니다. |
| [get_IsDefault](./get_isdefault/)() override | 현재 노드가 문서 유형 정의(DTD) 또는 스키마에 정의된 기본값에서 생성된 속성인지 여부를 나타내는 값을 반환합니다. |
| [get_IsEmptyElement](./get_isemptyelement/)() override | 현재 노드가 빈 요소인지 여부를 나타내는 값을 반환합니다(예: **<MyElement/>**). |
| [get_LocalName](./get_localname/)() override | 현재 노드의 로컬 이름을 반환합니다. |
| [get_Name](./get_name/)() override | 현재 노드의 정규화된 이름을 반환합니다. |
| [get_NamespaceURI](./get_namespaceuri/)() override | 리더가 위치한 노드의 네임스페이스 URI를 반환합니다(W3C 네임스페이스 사양에 정의된 대로). |
| [get_NameTable](./get_nametable/)() override | 이 구현과 연결된 [XmlNameTable](../xmlnametable/)을 반환합니다. |
| [get_NodeType](./get_nodetype/)() override | 현재 노드의 유형을 반환합니다. |
| [get_Prefix](./get_prefix/)() override | 현재 노드와 연결된 네임스페이스 접두사를 반환합니다. |
| [get_ReadState](./get_readstate/)() override | 리더의 상태를 반환합니다. |
| [get_SchemaInfo](./get_schemainfo/)() override | 현재 노드에 할당된 스키마 정보를 반환합니다. |
| [get_Value](./get_value/)() override | 현재 노드의 텍스트 값을 반환합니다. |
| [get_XmlLang](./get_xmllang/)() override | 현재 **xml:lang** 범위를 반환합니다. |
| [get_XmlSpace](./get_xmlspace/)() override | 현재 **xml:space** 범위를 반환합니다. |
| [GetAttribute](./getattribute/)(String) override | 지정된 이름을 가진 속성의 값을 반환합니다. |
| [GetAttribute](./getattribute/)(String, String) override | 지정된 로컬 이름 및 네임스페이스 URI를 가진 속성의 값을 반환합니다. |
| [GetAttribute](./getattribute/)(int32_t) override | 지정된 인덱스를 가진 속성의 값을 반환합니다. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | 현재 요소의 범위에서 네임스페이스 접두사를 해석합니다. |
| [MoveToAttribute](./movetoattribute/)(String) override | 지정된 이름을 가진 속성으로 이동합니다. |
| [MoveToAttribute](./movetoattribute/)(String, String) override | 지정된 로컬 이름 및 네임스페이스 URI를 가진 속성으로 이동합니다. |
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
| [ResolveEntity](./resolveentity/)() override | **EntityReference** 노드에 대한 엔터티 참조를 해결합니다. |
| [Skip](./skip/)() override | 현재 노드의 자식들을 건너뜁니다. |
| [XmlNodeReader](./xmlnodereader/)(const SharedPtr\<XmlNode\>\&) | 지정된 [XmlNode](../xmlnode/)을 사용하여 [XmlNodeReader](./) 클래스의 인스턴스를 생성합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [XmlReader](../xmlreader/)
* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
