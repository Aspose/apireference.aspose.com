---
title: "System::Xml::Xsl::XslTransform class"
linktitle: "XslTransform"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Xsl::XslTransform 클래스. C++에서 확장 가능한 스타일시트 변환 언어(XSLT) 스타일시트를 사용하여 XML 데이터를 변환합니다."
type: docs
weight: 700
url: /ko/cpp/system.xml.xsl/xsltransform/
---
## XslTransform class


변환용 확장 스타일시트 언어 (XSLT) 스타일시트를 사용하여 XML 데이터를 변환합니다.

```cpp
class XslTransform : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&) | [XmlReader](../../system.xml/xmlreader/)에 포함된 XSLT 스타일 시트를 로드합니다. |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | [XmlReader](../../system.xml/xmlreader/)에 포함된 XSLT 스타일 시트를 로드합니다. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) | IXPathNavigable에 포함된 XSLT 스타일 시트를 로드합니다. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | IXPathNavigable에 포함된 XSLT 스타일 시트를 로드합니다. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&) | XPathNavigator에 포함된 XSLT 스타일 시트를 로드합니다. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | XPathNavigator에 포함된 XSLT 스타일 시트를 로드합니다. |
| [Load](./load/)(const String\&) | URL로 지정된 XSLT 스타일 시트를 로드합니다. |
| [Load](./load/)(const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | URL로 지정된 XSLT 스타일 시트를 로드합니다. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | [XslTransform::Transform](./transform/) 메서드가 호출될 때 외부 리소스를 해결하는 데 사용되는 [XmlResolver](../../system.xml/xmlresolver/)을 설정합니다. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | 지정된 **args**를 사용하여 XPathNavigator의 XML 데이터를 변환하고 결과를 [XmlReader](../../system.xml/xmlreader/)에 출력합니다. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&) | 지정된 **args**를 사용하여 XPathNavigator의 XML 데이터를 변환하고 결과를 [XmlReader](../../system.xml/xmlreader/)에 출력합니다. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | 지정된 args를 사용하여 XPathNavigator의 XML 데이터를 변환하고 결과를 [XmlWriter](../../system.xml/xmlwriter/)에 출력합니다. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | 지정된 args를 사용하여 XPathNavigator의 XML 데이터를 변환하고 결과를 [XmlWriter](../../system.xml/xmlwriter/)에 출력합니다. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | 지정된 **args**를 사용하여 XPathNavigator의 XML 데이터를 변환하고 결과를 스트림에 출력합니다. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | 지정된 **args**를 사용하여 XPathNavigator의 XML 데이터를 변환하고 결과를 스트림에 출력합니다. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | 지정된 **args**를 사용하여 XPathNavigator의 XML 데이터를 변환하고 결과를 TextWriter에 출력합니다. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | 지정된 **args**를 사용하여 XPathNavigator의 XML 데이터를 변환하고 결과를 TextWriter에 출력합니다. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | 지정된 **args**를 사용하여 IXPathNavigable의 XML 데이터를 변환하고 결과를 [XmlReader](../../system.xml/xmlreader/)에 출력합니다. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&) | 지정된 **args**를 사용하여 IXPathNavigable의 XML 데이터를 변환하고 결과를 [XmlReader](../../system.xml/xmlreader/)에 출력합니다. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | 지정된 **args**를 사용하여 IXPathNavigable의 XML 데이터를 변환하고 결과를 TextWriter에 출력합니다. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | 지정된 **args**를 사용하여 IXPathNavigable의 XML 데이터를 변환하고 결과를 TextWriter에 출력합니다. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | 지정된 **args**를 사용하여 IXPathNavigable의 XML 데이터를 변환하고 결과를 스트림에 출력합니다. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | 지정된 **args**를 사용하여 IXPathNavigable의 XML 데이터를 변환하고 결과를 스트림에 출력합니다. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | 지정된 **args**를 사용하여 IXPathNavigable의 XML 데이터를 변환하고 결과를 [XmlWriter](../../system.xml/xmlwriter/)에 출력합니다. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | 지정된 **args**를 사용하여 IXPathNavigable의 XML 데이터를 변환하고 결과를 [XmlWriter](../../system.xml/xmlwriter/)에 출력합니다. |
| [Transform](./transform/)(const String\&, const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | 입력 파일의 XML 데이터를 변환하고 결과를 출력 파일에 저장합니다. |
| [Transform](./transform/)(const String\&, const String\&) | 입력 파일의 XML 데이터를 변환하고 결과를 출력 파일에 저장합니다. |
| [XslTransform](./xsltransform/)() | [XslTransform](./) 클래스의 새 인스턴스를 초기화합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
