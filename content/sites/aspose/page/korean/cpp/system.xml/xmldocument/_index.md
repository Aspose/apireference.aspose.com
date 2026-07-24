---
title: "System::Xml::XmlDocument 클래스"
linktitle: "XmlDocument"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlDocument 클래스. XML 문서를 나타냅니다. 이 클래스를 사용하여 C++에서 문서의 XML을 로드, 검증, 편집, 추가 및 위치 지정할 수 있습니다."
type: docs
weight: 1400
url: /ko/cpp/system.xml/xmldocument/
---
## XmlDocument class


XML 문서를 나타냅니다. 이 클래스를 사용하여 문서에서 XML을 로드, 검증, 편집, 추가 및 위치 지정할 수 있습니다.

```cpp
class XmlDocument : public System::Xml::XmlNode
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | 이 노드의 복제본을 생성합니다. |
| [CreateAttribute](./createattribute/)(const String\&) | 지정된 이름으로 [XmlAttribute](../xmlattribute/)를 생성합니다. |
| [CreateAttribute](./createattribute/)(const String\&, const String\&) | 지정된 정규화된 이름과 [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/)를 사용하여 [XmlAttribute](../xmlattribute/)를 생성합니다. |
| virtual [CreateAttribute](./createattribute/)(const String\&, const String\&, const String\&) | 지정된 [XmlNode::get_Prefix](../xmlnode/get_prefix/), [XmlDocument::get_LocalName](./get_localname/), 및 [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/)를 사용하여 [XmlAttribute](../xmlattribute/)를 생성합니다. |
| virtual [CreateCDataSection](./createcdatasection/)(const String\&) | 지정된 데이터를 포함하는 [XmlCDataSection](../xmlcdatasection/)을 생성합니다. |
| virtual [CreateComment](./createcomment/)(const String\&) | 지정된 데이터를 포함하는 [XmlComment](../xmlcomment/)을 생성합니다. |
| virtual [CreateDocumentFragment](./createdocumentfragment/)() | [XmlDocumentFragment](../xmldocumentfragment/)을 생성합니다. |
| virtual [CreateDocumentType](./createdocumenttype/)(const String\&, const String\&, const String\&, const String\&) | 새로운 [XmlDocumentType](../xmldocumenttype/) 객체를 반환합니다. |
| [CreateElement](./createelement/)(const String\&) | 지정된 이름으로 요소를 생성합니다. |
| [CreateElement](./createelement/)(const String\&, const String\&) | 정규화된 이름과 [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/)를 사용하여 [XmlElement](../xmlelement/)을 생성합니다. |
| virtual [CreateElement](./createelement/)(const String\&, const String\&, const String\&) | 지정된 [XmlNode::get_Prefix](../xmlnode/get_prefix/), [XmlDocument::get_LocalName](./get_localname/), 및 [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/)를 사용하여 요소를 생성합니다. |
| virtual [CreateEntityReference](./createentityreference/)(const String\&) | 지정된 이름으로 [XmlEntityReference](../xmlentityreference/)를 생성합니다. |
| [CreateNavigator](./createnavigator/)() override | 이 문서를 탐색하기 위한 새로운 XPathNavigator 객체를 생성합니다. |
| virtual [CreateNode](./createnode/)(XmlNodeType, const String\&, const String\&, const String\&) | 지정된 [XmlNodeType](../xmlnodetype/), [XmlNode::get_Prefix](../xmlnode/get_prefix/), [XmlDocument::get_Name](./get_name/), 및 [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/)를 사용하여 [XmlNode](../xmlnode/)를 생성합니다. |
| virtual [CreateNode](./createnode/)(const String\&, const String\&, const String\&) | 지정된 노드 유형, [XmlDocument::get_Name](./get_name/), 및 [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/)를 사용하여 [XmlNode](../xmlnode/)를 생성합니다. |
| virtual [CreateNode](./createnode/)(XmlNodeType, const String\&, const String\&) | 지정된 [XmlNodeType](../xmlnodetype/), [XmlDocument::get_Name](./get_name/), 및 [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/)를 사용하여 [XmlNode](../xmlnode/)를 생성합니다. |
| virtual [CreateProcessingInstruction](./createprocessinginstruction/)(const String\&, const String\&) | 지정된 이름과 데이터를 사용하여 [XmlProcessingInstruction](../xmlprocessinginstruction/)를 생성합니다. |
| virtual [CreateSignificantWhitespace](./createsignificantwhitespace/)(const String\&) | [XmlSignificantWhitespace](../xmlsignificantwhitespace/) 노드를 생성합니다. |
| virtual [CreateTextNode](./createtextnode/)(const String\&) | 지정된 텍스트로 [XmlText](../xmltext/)를 생성합니다. |
| virtual [CreateWhitespace](./createwhitespace/)(const String\&) | [XmlWhitespace](../xmlwhitespace/) 노드를 생성합니다. |
| virtual [CreateXmlDeclaration](./createxmldeclaration/)(const String\&, const String\&, const String\&) | 지정된 값으로 [XmlDeclaration](../xmldeclaration/) 노드를 생성합니다. |
| [get_BaseURI](./get_baseuri/)() override | 현재 노드의 기본 URI를 반환합니다. |
| [get_DocumentElement](./get_documentelement/)() | 문서의 루트 [XmlElement](../xmlelement/)을 반환합니다. |
| virtual [get_DocumentType](./get_documenttype/)() | DOCTYPE 선언을 포함하는 노드를 반환합니다. |
| [get_Implementation](./get_implementation/)() | 현재 문서에 대한 [XmlImplementation](../xmlimplementation/) 객체를 반환합니다. |
| [get_InnerXml](./get_innerxml/)() override | 현재 노드의 자식을 나타내는 마크업을 반환합니다. |
| [get_IsReadOnly](./get_isreadonly/)() override | 현재 노드가 읽기 전용인지 여부를 나타내는 값을 반환합니다. |
| [get_LocalName](./get_localname/)() override | 노드의 로컬 이름을 반환합니다. |
| [get_Name](./get_name/)() override | 노드의 정규화된 이름을 반환합니다. |
| [get_NameTable](./get_nametable/)() | 이 구현과 연결된 [XmlNameTable](../xmlnametable/)을 반환합니다. |
| [get_NodeType](./get_nodetype/)() override | 현재 노드의 유형을 반환합니다. |
| [get_OwnerDocument](./get_ownerdocument/)() override | 현재 노드가 속한 [XmlDocument](./)을 반환합니다. |
| [get_PreserveWhitespace](./get_preservewhitespace/)() | 요소 내용에서 공백을 보존할지 여부를 나타내는 값을 반환합니다. |
| [get_SchemaInfo](./get_schemainfo/)() override | 노드의 Post-Schema-Validation-Infoset(PSVI)를 반환합니다. |
| [get_Schemas](./get_schemas/)() | 이 [XmlDocument](./)와 연결된 XmlSchemaSet 객체를 반환합니다. |
| virtual [GetElementById](./getelementbyid/)(String) | 지정된 ID를 가진 [XmlElement](../xmlelement/)을 반환합니다. |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String) | 지정된 이름과 일치하는 모든 하위 요소의 목록을 포함하는 [XmlNodeList](../xmlnodelist/)을 반환합니다. |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String, String) | 지정된 [XmlDocument::get_LocalName](./get_localname/) 및 [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/)와 일치하는 모든 하위 요소의 목록을 포함하는 [XmlNodeList](../xmlnodelist/)을 반환합니다. |
| virtual [ImportNode](./importnode/)(SharedPtr\<XmlNode\>, bool) | 다른 문서에서 현재 문서로 노드를 가져옵니다. |
| virtual [Load](./load/)(String) | 지정된 URL에서 XML 문서를 로드합니다. |
| virtual [Load](./load/)(SharedPtr\<IO::Stream\>) | 지정된 스트림에서 XML 문서를 로드합니다. |
| virtual [Load](./load/)(SharedPtr\<IO::TextReader\>) | 지정된 TextReader에서 XML 문서를 로드합니다. |
| virtual [Load](./load/)(SharedPtr\<XmlReader\>) | 지정된 [XmlReader](../xmlreader/)에서 XML 문서를 로드합니다. |
| virtual [LoadXml](./loadxml/)(String) | 지정된 문자열에서 XML 문서를 로드합니다. |
| virtual [ReadNode](./readnode/)(SharedPtr\<XmlReader\>) | [XmlReader](../xmlreader/)의 정보를 기반으로 [XmlNode](../xmlnode/) 객체를 생성합니다. 리더는 노드나 속성에 위치하고 있어야 합니다. |
| virtual [Save](./save/)(String) | XML 문서를 지정된 파일에 저장합니다. 지정된 파일이 존재하면 이 메서드가 덮어씁니다. |
| virtual [Save](./save/)(SharedPtr\<IO::Stream\>) | XML 문서를 지정된 스트림에 저장합니다. |
| virtual [Save](./save/)(SharedPtr\<IO::TextWriter\>) | XML 문서를 지정된 TextWriter에 저장합니다. |
| virtual [Save](./save/)(SharedPtr\<XmlWriter\>) | 지정된 [XmlWriter](../xmlwriter/)에 XML 문서를 저장합니다. |
| [set_InnerText](./set_innertext/)(String) override | 모든 경우에 InvalidOperationException을 발생시킵니다. |
| [set_InnerXml](./set_innerxml/)(String) override | 현재 노드의 자식을 나타내는 마크업을 설정합니다. |
| [set_PreserveWhitespace](./set_preservewhitespace/)(bool) | 요소 내용에서 공백을 보존할지 여부를 나타내는 값을 설정합니다. |
| [set_Schemas](./set_schemas/)(const SharedPtr\<Schema::XmlSchemaSet\>\&) | 이 [XmlDocument](./)와 연결된 XmlSchemaSet 객체를 설정합니다. |
| virtual [set_XmlResolver](./set_xmlresolver/)(SharedPtr\<System::Xml::XmlResolver\>) | 외부 리소스를 해결하는 데 사용할 [XmlResolver](../xmlresolver/)를 설정합니다. |
| [Validate](./validate/)(Schema::ValidationEventHandler) | [XmlDocument](./)을 XML [Schema](../../system.xml.schema/) 정의 언어(XSD) 스키마와, [XmlDocument::get_Schemas](./get_schemas/) 목록에 포함된 스키마를 사용해 검증합니다. |
| [Validate](./validate/)(Schema::ValidationEventHandler, const SharedPtr\<XmlNode\>\&) | 지정된 [XmlNode](../xmlnode/) 객체를 XML [Schema](../../system.xml.schema/) 정의 언어(XSD) 스키마와, [XmlDocument::get_Schemas](./get_schemas/) 목록에 있는 스키마를 사용해 검증합니다. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | [XmlDocument](./) 노드의 모든 자식을 지정된 [XmlWriter](../xmlwriter/)에 저장합니다. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | [XmlDocument](./) 노드를 지정된 [XmlWriter](../xmlwriter/)에 저장합니다. |
| [XmlDocument](./xmldocument/)() | [XmlDocument](./) 클래스의 새 인스턴스를 초기화합니다. |
| [XmlDocument](./xmldocument/)(const SharedPtr\<XmlNameTable\>\&) | 지정된 [XmlNameTable](../xmlnametable/)을 사용하여 [XmlDocument](./) 클래스의 새 인스턴스를 초기화합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [XmlNode](../xmlnode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
