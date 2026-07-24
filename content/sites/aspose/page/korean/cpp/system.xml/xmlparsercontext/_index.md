---
title: "System::Xml::XmlParserContext 클래스"
linktitle: "XmlParserContext"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlParserContext 클래스. C++에서 XML 조각을 구문 분석하기 위해 XmlReader가 필요로 하는 모든 컨텍스트 정보를 제공합니다."
type: docs
weight: 3000
url: /ko/cpp/system.xml/xmlparsercontext/
---
## XmlParserContext class


XML 조각을 구문 분석하기 위해 [XmlReader](../xmlreader/)가 필요로 하는 모든 컨텍스트 정보를 제공합니다.

```cpp
class XmlParserContext : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_BaseURI](./get_baseuri/)() | 기본 URI를 반환합니다. |
| [get_DocTypeName](./get_doctypename/)() | 문서 유형 선언의 이름을 반환합니다. |
| [get_Encoding](./get_encoding/)() | 인코딩 유형을 반환합니다. |
| [get_InternalSubset](./get_internalsubset/)() | 내부 DTD 하위 집합을 반환합니다. |
| [get_NamespaceManager](./get_namespacemanager/)() | [XmlNamespaceManager](../xmlnamespacemanager/)를 반환합니다. |
| [get_NameTable](./get_nametable/)() | [XmlNameTable](../xmlnametable/)을(를) 반환합니다. 원자화된 문자열에 대한 자세한 내용은 [XmlNameTable](../xmlnametable/)을(를) 참조하십시오. |
| [get_PublicId](./get_publicid/)() | 공용 식별자를 반환합니다. |
| [get_SystemId](./get_systemid/)() | 시스템 식별자를 반환합니다. |
| [get_XmlLang](./get_xmllang/)() | 현재 **xml:lang** 범위를 반환합니다. |
| [get_XmlSpace](./get_xmlspace/)() | 현재 **xml:space** 범위를 반환합니다. |
| [set_BaseURI](./set_baseuri/)(const String\&) | 기본 URI를 설정합니다. |
| [set_DocTypeName](./set_doctypename/)(const String\&) | 문서 유형 선언의 이름을 설정합니다. |
| [set_Encoding](./set_encoding/)(const SharedPtr\<System::Text::Encoding\>\&) | 인코딩 유형을 설정합니다. |
| [set_InternalSubset](./set_internalsubset/)(const String\&) | 내부 DTD 하위 집합을 설정합니다. |
| [set_NamespaceManager](./set_namespacemanager/)(const SharedPtr\<XmlNamespaceManager\>\&) | [XmlNamespaceManager](../xmlnamespacemanager/)를 설정합니다. |
| [set_NameTable](./set_nametable/)(const SharedPtr\<XmlNameTable\>\&) | [XmlNameTable](../xmlnametable/)을(를) 원자화된 문자열에 사용하도록 설정합니다. 원자화된 문자열에 대한 자세한 내용은 [XmlNameTable](../xmlnametable/)을(를) 참조하십시오. |
| [set_PublicId](./set_publicid/)(const String\&) | 공용 식별자를 설정합니다. |
| [set_SystemId](./set_systemid/)(const String\&) | 시스템 식별자를 설정합니다. |
| [set_XmlLang](./set_xmllang/)(const String\&) | 현재 **xml:lang** 범위를 설정합니다. |
| [set_XmlSpace](./set_xmlspace/)(System::Xml::XmlSpace) | 현재 **xml:space** 범위를 설정합니다. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace) | 지정된 [XmlNameTable](../xmlnametable/), [XmlNamespaceManager](../xmlnamespacemanager/), **xml:lang**, 및 **xml:space** 값을 사용하여 [XmlParserContext](./) 클래스의 새 인스턴스를 초기화합니다. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) | 지정된 [XmlNameTable](../xmlnametable/), [XmlNamespaceManager](../xmlnamespacemanager/), **xml:lang**, **xml:space**, 및 인코딩 값을 사용하여 [XmlParserContext](./) 클래스의 새 인스턴스를 초기화합니다. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace) | 지정된 [XmlNameTable](../xmlnametable/), [XmlNamespaceManager](../xmlnamespacemanager/), 기본 URI, **xml:lang**, **xml:space**, 및 문서 유형 값을 사용하여 [XmlParserContext](./) 클래스의 새 인스턴스를 초기화합니다. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) | 지정된 [XmlNameTable](../xmlnametable/), [XmlNamespaceManager](../xmlnamespacemanager/), 기본 URI, **xml:lang**, **xml:space**, 인코딩 및 문서 유형 값을 사용하여 [XmlParserContext](./) 클래스의 새 인스턴스를 초기화합니다. |
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
