---
title: "System::Xml::Xsl::XslCompiledTransform class"
linktitle: "XslCompiledTransform"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Xsl::XslCompiledTransform 클래스. C++에서 XSLT 스타일 시트를 사용하여 XML 데이터를 변환합니다."
type: docs
weight: 300
url: /ko/cpp/system.xml.xsl/xslcompiledtransform/
---
## XslCompiledTransform class


XSLT 스타일시트를 사용하여 XML 데이터를 변환합니다.

```cpp
class XslCompiledTransform : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_OutputSettings](./get_outputsettings/)() | 스타일 시트의 **xsl:output** 요소에서 파생된 출력 정보를 포함하는 [XmlWriterSettings](../../system.xml/xmlwritersettings/) 객체를 반환합니다. |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&) | [XmlReader](../../system.xml/xmlreader/)에 포함된 스타일 시트를 컴파일합니다. |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) | [XmlReader](../../system.xml/xmlreader/)에 포함된 XSLT 스타일 시트를 컴파일합니다. [XmlResolver](../../system.xml/xmlresolver/)는 모든 XSLT **import** 또는 **include** 요소를 해결하고 XSLT 설정은 스타일 시트에 대한 권한을 결정합니다. |
| [Load](./load/)(const String\&) | 지정된 URI에 위치한 스타일 시트를 로드하고 컴파일합니다. |
| [Load](./load/)(const String\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) | URI로 지정된 XSLT 스타일 시트를 로드하고 컴파일합니다. [XmlResolver](../../system.xml/xmlresolver/)는 모든 XSLT **import** 또는 **include** 요소를 해결하고 XSLT 설정은 스타일 시트에 대한 권한을 결정합니다. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) | IXPathNavigable 객체에 포함된 스타일 시트를 컴파일합니다. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, SharedPtr\<XsltSettings\>, SharedPtr\<XmlResolver\>) | IXPathNavigable에 포함된 XSLT 스타일 시트를 컴파일합니다. [XmlResolver](../../system.xml/xmlresolver/)는 모든 XSLT **import** 또는 **include** 요소를 해결하고 XSLT 설정은 스타일 시트에 대한 권한을 결정합니다. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XmlWriter\>\&) | IXPathNavigable 객체가 지정한 입력 문서를 사용하여 변환을 실행하고 결과를 [XmlWriter](../../system.xml/xmlwriter/)에 출력합니다. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | IXPathNavigable 객체가 지정한 입력 문서를 사용하여 변환을 실행하고 결과를 [XmlWriter](../../system.xml/xmlwriter/)에 출력합니다. [XsltArgumentList](../xsltargumentlist/)는 추가 런타임 인수를 제공합니다. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | IXPathNavigable 객체가 지정한 입력 문서를 사용하여 변환을 실행하고 결과를 TextWriter에 출력합니다. [XsltArgumentList](../xsltargumentlist/)는 추가 런타임 인수를 제공합니다. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | IXPathNavigable 객체가 지정한 입력 문서를 사용하여 변환을 실행하고 결과를 스트림에 출력합니다. [XsltArgumentList](../xsltargumentlist/)는 추가 런타임 인수를 제공합니다. |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XmlWriter\>\&) | [XmlReader](../../system.xml/xmlreader/) 객체가 지정한 입력 문서를 사용하여 변환을 실행하고 결과를 [XmlWriter](../../system.xml/xmlwriter/)에 출력합니다. |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | [XmlReader](../../system.xml/xmlreader/) 객체가 지정한 입력 문서를 사용하여 변환을 실행하고 결과를 [XmlWriter](../../system.xml/xmlwriter/)에 출력합니다. [XsltArgumentList](../xsltargumentlist/)는 추가 런타임 인수를 제공합니다. |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | [XmlReader](../../system.xml/xmlreader/) 객체가 지정한 입력 문서를 사용하여 변환을 실행하고 결과를 TextWriter에 출력합니다. [XsltArgumentList](../xsltargumentlist/)는 추가 런타임 인수를 제공합니다. |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | [XmlReader](../../system.xml/xmlreader/) 객체가 지정한 입력 문서를 사용하여 변환을 실행하고 결과를 스트림에 출력합니다. [XsltArgumentList](../xsltargumentlist/)는 추가 런타임 인수를 제공합니다. |
| [Transform](./transform/)(const String\&, const SharedPtr\<XmlWriter\>\&) | URI가 지정한 입력 문서를 사용하여 변환을 실행하고 결과를 [XmlWriter](../../system.xml/xmlwriter/)에 출력합니다. |
| [Transform](./transform/)(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | URI가 지정한 입력 문서를 사용하여 변환을 실행하고 결과를 [XmlWriter](../../system.xml/xmlwriter/)에 출력합니다. [XsltArgumentList](../xsltargumentlist/)는 추가 런타임 인수를 제공합니다. |
| [Transform](./transform/)(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | URI가 지정한 입력 문서를 사용하여 변환을 실행하고 결과를 TextWriter에 출력합니다. |
| [Transform](./transform/)(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | URI가 지정한 입력 문서를 사용하여 변환을 실행하고 결과를 스트림에 출력합니다. [XsltArgumentList](../xsltargumentlist/)는 추가 런타임 인수를 제공합니다. |
| [Transform](./transform/)(const String\&, const String\&) | URI가 지정한 입력 문서를 사용하여 변환을 실행하고 결과를 파일에 출력합니다. |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) | [XmlReader](../../system.xml/xmlreader/) 객체가 지정한 입력 문서를 사용하여 변환을 실행하고 결과를 [XmlWriter](../../system.xml/xmlwriter/)에 출력합니다. [XsltArgumentList](../xsltargumentlist/)는 추가 런타임 인수를 제공하고 [XmlResolver](../../system.xml/xmlresolver/)는 XSLT **document()** 함수를 해결합니다. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) | IXPathNavigable 객체가 지정한 입력 문서를 사용하여 변환을 실행하고 결과를 [XmlWriter](../../system.xml/xmlwriter/)에 출력합니다. [XsltArgumentList](../xsltargumentlist/)는 추가 런타임 인수를 제공하고 [XmlResolver](../../system.xml/xmlresolver/)는 XSLT **document()** 함수를 해결합니다. |
| [XslCompiledTransform](./xslcompiledtransform/)() | [XslCompiledTransform](./) 클래스의 새 인스턴스를 초기화합니다. |
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
