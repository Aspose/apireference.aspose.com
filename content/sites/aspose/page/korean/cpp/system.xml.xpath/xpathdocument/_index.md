---
title: "System::Xml::XPath::XPathDocument 클래스"
linktitle: "XPathDocument"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XPath::XPathDocument 클래스. C++에서 XPath 데이터 모델을 사용하여 XML 문서를 빠르고 읽기 전용이며 메모리 내에 표현합니다."
type: docs
weight: 200
url: /ko/cpp/system.xml.xpath/xpathdocument/
---
## XPathDocument class


[XPath](../) 데이터 모델을 사용하여 XML 문서를 빠르고 읽기 전용이며 메모리 내에 표현합니다.

```cpp
class XPathDocument : public System::Xml::XPath::IXPathNavigable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [CreateNavigator](./createnavigator/)() override | 이 [XPathDocument](./)의 노드를 탐색하기 위해 읽기 전용 [XPathNavigator](../xpathnavigator/) 객체를 초기화합니다. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<XmlReader\>\&) | 지정된 [XmlReader](../../system.xml/xmlreader/) 객체에 포함된 XML 데이터에서 [XPathDocument](./) 클래스의 새 인스턴스를 초기화합니다. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<XmlReader\>\&, XmlSpace) | 지정된 공백 처리 옵션과 함께 지정된 [XmlReader](../../system.xml/xmlreader/) 객체에 포함된 XML 데이터에서 [XPathDocument](./) 클래스의 새 인스턴스를 초기화합니다. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<IO::TextReader\>\&) | 지정된 TextReader 객체에 포함된 XML 데이터에서 [XPathDocument](./) 클래스의 새 인스턴스를 초기화합니다. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<IO::Stream\>\&) | 지정된 Stream 객체의 XML 데이터에서 [XPathDocument](./) 클래스의 새 인스턴스를 초기화합니다. |
| [XPathDocument](./xpathdocument/)(const String\&) | 지정된 파일의 XML 데이터에서 [XPathDocument](./) 클래스의 새 인스턴스를 초기화합니다. |
| [XPathDocument](./xpathdocument/)(const String\&, XmlSpace) | 지정된 공백 처리 옵션과 함께 지정된 파일의 XML 데이터에서 [XPathDocument](./) 클래스의 새 인스턴스를 초기화합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [IXPathNavigable](../ixpathnavigable/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
