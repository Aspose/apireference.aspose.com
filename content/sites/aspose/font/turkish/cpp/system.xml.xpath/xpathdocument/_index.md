---
title: "System::Xml::XPath::XPathDocument sınıfı"
linktitle: "XPathDocument"
second_title: "Aspose.Font için C++"
description: "System::Xml::XPath::XPathDocument sınıfı. C++'da XPath veri modelini kullanarak bir XML belgesinin hızlı, yalnızca okunabilir, bellek içi temsili sağlar."
type: docs
weight: 200
url: /tr/cpp/system.xml.xpath/xpathdocument/
---
## XPathDocument class


Bir XML belgesinin hızlı, yalnızca okunabilir, bellek içi temsili, [XPath](../) veri modeli kullanılarak sağlanır.

```cpp
class XPathDocument : public System::Xml::XPath::IXPathNavigable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CreateNavigator](./createnavigator/)() override | Bu [XPathDocument](./) içindeki düğümler arasında gezinmek için yalnızca okunabilir bir [XPathNavigator](../xpathnavigator/) nesnesi başlatır. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<XmlReader\>\&) | Belirtilen [XmlReader](../../system.xml/xmlreader/) nesnesinde bulunan XML verisinden yeni bir [XPathDocument](./) sınıfı örneği başlatır. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<XmlReader\>\&, XmlSpace) | Belirtilen [XmlReader](../../system.xml/xmlreader/) nesnesinde bulunan XML verisini, belirtilen boşluk işleme ayarıyla yeni bir [XPathDocument](./) sınıfı örneği başlatır. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<IO::TextReader\>\&) | Belirtilen TextReader nesnesinde bulunan XML verisinden yeni bir [XPathDocument](./) sınıfı örneği başlatır. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<IO::Stream\>\&) | Belirtilen Stream nesnesindeki XML verisinden yeni bir [XPathDocument](./) sınıfı örneği başlatır. |
| [XPathDocument](./xpathdocument/)(const String\&) | Belirtilen dosyadaki XML verisinden yeni bir [XPathDocument](./) sınıfı örneği başlatır. |
| [XPathDocument](./xpathdocument/)(const String\&, XmlSpace) | Belirtilen boşluk işleme ayarıyla belirtilen dosyadaki XML verisinden yeni bir [XPathDocument](./) sınıfı örneği başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [IXPathNavigable](../ixpathnavigable/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Font for C++](../../)
