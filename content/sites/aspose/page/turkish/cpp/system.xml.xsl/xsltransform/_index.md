---
title: "System::Xml::Xsl::XslTransform class"
linktitle: "XslTransform"
second_title: "Aspose.Page için C++"
description: "System::Xml::Xsl::XslTransform sınıfı. XML verilerini C++'ta Extensible Stylesheet Language for Transformations (XSLT) stil sayfası kullanarak dönüştürür."
type: docs
weight: 700
url: /tr/cpp/system.xml.xsl/xsltransform/
---
## XslTransform class


XML verilerini bir Extensible Stylesheet Language for Transformations (XSLT) stil sayfası kullanarak dönüştürür.

```cpp
class XslTransform : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&) | XSLT stil sayfasını [XmlReader](../../system.xml/xmlreader/) içinde yükler. |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | XSLT stil sayfasını [XmlReader](../../system.xml/xmlreader/) içinde yükler. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) | XSLT stil sayfasını IXPathNavigable içinde yükler. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | XSLT stil sayfasını IXPathNavigable içinde yükler. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&) | XSLT stil sayfasını XPathNavigator içinde yükler. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | XSLT stil sayfasını XPathNavigator içinde yükler. |
| [Load](./load/)(const String\&) | Bir URL tarafından belirtilen XSLT stil sayfasını yükler. |
| [Load](./load/)(const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Bir URL tarafından belirtilen XSLT stil sayfasını yükler. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | [XslTransform::Transform](./transform/) yöntemi çağrıldığında harici kaynakları çözmek için kullanılan [XmlResolver](../../system.xml/xmlresolver/) ayarlar. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Belirtilen **args** kullanarak XPathNavigator içindeki XML verilerini dönüştürür ve sonucu bir [XmlReader](../../system.xml/xmlreader/)'a yazar. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&) | Belirtilen **args** kullanarak XPathNavigator içindeki XML verilerini dönüştürür ve sonucu bir [XmlReader](../../system.xml/xmlreader/)'a yazar. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Belirtilen args kullanarak XPathNavigator içindeki XML verilerini dönüştürür ve sonucu bir [XmlWriter](../../system.xml/xmlwriter/)'a yazar. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | Belirtilen args kullanarak XPathNavigator içindeki XML verilerini dönüştürür ve sonucu bir [XmlWriter](../../system.xml/xmlwriter/)'a yazar. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Belirtilen **args** kullanarak XPathNavigator içindeki XML verilerini dönüştürür ve sonucu bir Stream'e yazar. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | Belirtilen **args** kullanarak XPathNavigator içindeki XML verilerini dönüştürür ve sonucu bir Stream'e yazar. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Belirtilen **args** kullanarak XPathNavigator içindeki XML verilerini dönüştürür ve sonucu bir TextWriter'a yazar. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | Belirtilen **args** kullanarak XPathNavigator içindeki XML verilerini dönüştürür ve sonucu bir TextWriter'a yazar. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Belirtilen **args** kullanarak IXPathNavigable içindeki XML verilerini dönüştürür ve sonucu bir [XmlReader](../../system.xml/xmlreader/)'a yazar. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&) | Belirtilen **args** kullanarak IXPathNavigable içindeki XML verilerini dönüştürür ve sonucu bir [XmlReader](../../system.xml/xmlreader/)'a yazar. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Belirtilen **args** kullanarak IXPathNavigable içindeki XML verilerini dönüştürür ve sonucu bir TextWriter'a yazar. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | Belirtilen **args** kullanarak IXPathNavigable içindeki XML verilerini dönüştürür ve sonucu bir TextWriter'a yazar. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Belirtilen **args** kullanarak IXPathNavigable içindeki XML verilerini dönüştürür ve sonucu bir Stream'e yazar. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | Belirtilen **args** kullanarak IXPathNavigable içindeki XML verilerini dönüştürür ve sonucu bir Stream'e yazar. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Belirtilen **args** kullanarak IXPathNavigable içindeki XML verilerini dönüştürür ve sonucu bir [XmlWriter](../../system.xml/xmlwriter/)'a yazar. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | Belirtilen **args** kullanarak IXPathNavigable içindeki XML verilerini dönüştürür ve sonucu bir [XmlWriter](../../system.xml/xmlwriter/)'a yazar. |
| [Transform](./transform/)(const String\&, const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Girdi dosyasındaki XML verilerini dönüştürür ve sonucu bir çıktı dosyasına yazar. |
| [Transform](./transform/)(const String\&, const String\&) | Girdi dosyasındaki XML verilerini dönüştürür ve sonucu bir çıktı dosyasına yazar. |
| [XslTransform](./xsltransform/)() | [XslTransform](./) sınıfının yeni bir örneğini başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma addır. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını üzerinde veya new operatörüyle bu tipin örneklerini asla oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
