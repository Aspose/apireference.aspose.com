---
title: "System::Xml::Xsl::XslTransform sınıfı"
linktitle: "XslTransform"
second_title: "Aspose.Font için C++"
description: "System::Xml::Xsl::XslTransform sınıfı. C++ içinde Dönüşümler için Genişletilebilir Stil Sayfası Dili (XSLT) stil sayfası kullanarak XML verilerini dönüştürür."
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
| [Load](./load/)(const SharedPtr\<XmlReader\>\&) | [XmlReader](../../system.xml/xmlreader/) içinde bulunan XSLT stil sayfasını yükler. |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | [XmlReader](../../system.xml/xmlreader/) içinde bulunan XSLT stil sayfasını yükler. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) | IXPathNavigable içinde bulunan XSLT stil sayfasını yükler. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | IXPathNavigable içinde bulunan XSLT stil sayfasını yükler. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&) | XPathNavigator içinde bulunan XSLT stil sayfasını yükler. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | XPathNavigator içinde bulunan XSLT stil sayfasını yükler. |
| [Load](./load/)(const String\&) | Bir URL tarafından belirtilen XSLT stil sayfasını yükler. |
| [Load](./load/)(const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Bir URL tarafından belirtilen XSLT stil sayfasını yükler. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | [XslTransform::Transform](./transform/) yöntemi çağrıldığında harici kaynakları çözmek için kullanılan [XmlResolver](../../system.xml/xmlresolver/) ayarlar. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | XPathNavigator içindeki XML verilerini belirtilen **args** kullanarak dönüştürür ve sonucu bir [XmlReader](../../system.xml/xmlreader/)'a yazar. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&) | XPathNavigator içindeki XML verilerini belirtilen **args** kullanarak dönüştürür ve sonucu bir [XmlReader](../../system.xml/xmlreader/)'a yazar. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | XPathNavigator içindeki XML verilerini belirtilen args kullanarak dönüştürür ve sonucu bir [XmlWriter](../../system.xml/xmlwriter/)'a yazar. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | XPathNavigator içindeki XML verilerini belirtilen args kullanarak dönüştürür ve sonucu bir [XmlWriter](../../system.xml/xmlwriter/)'a yazar. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | XPathNavigator içindeki XML verilerini belirtilen **args** kullanarak dönüştürür ve sonucu bir Stream'e yazar. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | XPathNavigator içindeki XML verilerini belirtilen **args** kullanarak dönüştürür ve sonucu bir Stream'e yazar. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | XPathNavigator içindeki XML verilerini belirtilen **args** kullanarak dönüştürür ve sonucu bir TextWriter'a yazar. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | XPathNavigator içindeki XML verilerini belirtilen **args** kullanarak dönüştürür ve sonucu bir TextWriter'a yazar. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | IXPathNavigable içindeki XML verilerini belirtilen **args** kullanarak dönüştürür ve sonucu bir [XmlReader](../../system.xml/xmlreader/)'a yazar. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&) | IXPathNavigable içindeki XML verilerini belirtilen **args** kullanarak dönüştürür ve sonucu bir [XmlReader](../../system.xml/xmlreader/)'a yazar. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | IXPathNavigable içindeki XML verilerini belirtilen **args** kullanarak dönüştürür ve sonucu bir TextWriter'a yazar. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | IXPathNavigable içindeki XML verilerini belirtilen **args** kullanarak dönüştürür ve sonucu bir TextWriter'a yazar. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | IXPathNavigable içindeki XML verilerini belirtilen **args** kullanarak dönüştürür ve sonucu bir Stream'e yazar. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | IXPathNavigable içindeki XML verilerini belirtilen **args** kullanarak dönüştürür ve sonucu bir Stream'e yazar. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | IXPathNavigable içindeki XML verilerini belirtilen **args** kullanarak dönüştürür ve sonucu bir [XmlWriter](../../system.xml/xmlwriter/)'a yazar. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | IXPathNavigable içindeki XML verilerini belirtilen **args** kullanarak dönüştürür ve sonucu bir [XmlWriter](../../system.xml/xmlwriter/)'a yazar. |
| [Transform](./transform/)(const String\&, const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Girdi dosyasındaki XML verilerini dönüştürür ve sonucu bir çıktı dosyasına yazar. |
| [Transform](./transform/)(const String\&, const String\&) | Girdi dosyasındaki XML verilerini dönüştürür ve sonucu bir çıktı dosyasına yazar. |
| [XslTransform](./xsltransform/)() | [XslTransform](./) sınıfının yeni bir örneğini başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Font for C++](../../)
