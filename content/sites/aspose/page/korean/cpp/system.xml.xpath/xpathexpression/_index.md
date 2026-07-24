---
title: "System::Xml::XPath::XPathExpression 클래스"
linktitle: "XPathExpression"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XPath::XPathExpression 클래스. C++에서 컴파일된 XPath 식을 나타내는 형식화된 클래스를 제공합니다."
type: docs
weight: 300
url: /ko/cpp/system.xml.xpath/xpathexpression/
---
## XPathExpression class


컴파일된 [XPath](../) 식을 나타내는 형식화된 클래스를 제공합니다.

```cpp
class XPathExpression : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [AddSort](./addsort/)(SharedPtr\<Object\>, SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\>) | 파생 클래스에서 재정의될 때, 지정된 IComparer 객체에 따라 [XPath](../) 식으로 선택된 노드를 정렬합니다. |
| virtual [AddSort](./addsort/)(SharedPtr\<Object\>, XmlSortOrder, XmlCaseOrder, String, XmlDataType) | 파생 클래스에서 재정의될 때, 제공된 매개변수에 따라 [XPath](../) 식으로 선택된 노드를 정렬합니다. |
| virtual [Clone](./clone/)() | 파생 클래스에서 재정의될 때, 이 [XPathExpression](./)의 복제본을 반환합니다. |
| static [Compile](./compile/)(const String\&) | 지정된 [XPath](../) 식을 컴파일하고 해당 [XPath](../) 식을 나타내는 [XPathExpression](./) 객체를 반환합니다. |
| static [Compile](./compile/)(const String\&, const SharedPtr\<IXmlNamespaceResolver\>\&) | 네임스페이스 해석을 위해 지정된 [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) 객체와 함께 지정된 [XPath](../) 식을 컴파일하고, 해당 [XPath](../) 식을 나타내는 [XPathExpression](./) 객체를 반환합니다. |
| virtual [get_Expression](./get_expression/)() | 파생 클래스에서 재정의될 때, [XPathExpression](./)의 **string** 표현을 가져옵니다. |
| virtual [get_ReturnType](./get_returntype/)() | 파생 클래스에서 재정의될 때, [XPath](../) 식의 결과 유형을 가져옵니다. |
| virtual [SetContext](./setcontext/)(SharedPtr\<XmlNamespaceManager\>) | 파생 클래스에서 재정의될 때, 네임스페이스 해석에 사용할 [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/) 객체를 지정합니다. |
| virtual [SetContext](./setcontext/)(SharedPtr\<IXmlNamespaceResolver\>) | 파생 클래스에서 재정의될 때, 네임스페이스 해석에 사용할 [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) 객체를 지정합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
