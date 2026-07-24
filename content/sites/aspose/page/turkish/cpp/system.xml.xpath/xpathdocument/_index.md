---
title: "System::Xml::XPath::XPathDocument sınıfı"
linktitle: "XPathDocument"
second_title: "Aspose.Page için C++"
description: "System::Xml::XPath::XPathDocument sınıfı. C++'da XPath veri modelini kullanarak XML belgesinin hızlı, yalnızca okunabilir, bellek içi bir temsilini sağlar."
type: docs
weight: 200
url: /tr/cpp/system.xml.xpath/xpathdocument/
---
## XPathDocument class


[XPath](../) veri modelini kullanarak XML belgesinin hızlı, yalnızca okunabilir, bellek içi bir temsilini sağlar.

```cpp
class XPathDocument : public System::Xml::XPath::IXPathNavigable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CreateNavigator](./createnavigator/)() override | Bu [XPathDocument](./) içindeki düğümler arasında gezinmek için yalnızca okunabilir bir [XPathNavigator](../xpathnavigator/) nesnesi başlatır. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<XmlReader\>\&) | Belirtilen [XmlReader](../../system.xml/xmlreader/) nesnesinde bulunan XML verisinden [XPathDocument](./) sınıfının yeni bir örneğini başlatır. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<XmlReader\>\&, XmlSpace) | Belirtilen boşluk işleme ayarıyla, belirtilen [XmlReader](../../system.xml/xmlreader/) nesnesinde bulunan XML verisinden [XPathDocument](./) sınıfının yeni bir örneğini başlatır. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<IO::TextReader\>\&) | Belirtilen TextReader nesnesinde bulunan XML verisinden [XPathDocument](./) sınıfının yeni bir örneğini başlatır. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<IO::Stream\>\&) | Belirtilen Stream nesnesindeki XML verisinden [XPathDocument](./) sınıfının yeni bir örneğini başlatır. |
| [XPathDocument](./xpathdocument/)(const String\&) | Belirtilen dosyadaki XML verisinden [XPathDocument](./) sınıfının yeni bir örneğini başlatır. |
| [XPathDocument](./xpathdocument/)(const String\&, XmlSpace) | Belirtilen boşluk işleme ayarıyla, belirtilen dosyadaki XML verisinden [XPathDocument](./) sınıfının yeni bir örneğini başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma addır. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını üzerinde veya new operatörüyle bu tipin örneklerini asla oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [IXPathNavigable](../ixpathnavigable/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
