---
title: "System::Xml::Xsl::XslTransform::Transform method"
linktitle: "Transform"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Xsl::XslTransform::Transform method. Transformeert de XML-gegevens in de IXPathNavigable met behulp van de opgegeven args en geeft het resultaat door aan een XmlReader in C++."
type: docs
weight: 400
url: /nl/cpp/system.xml.xsl/xsltransform/transform/
---
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&) method


Transformeert de XML-gegevens in de IXPathNavigable met de opgegeven **args** en geeft het resultaat door aan een [XmlReader](../../../system.xml/xmlreader/).

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Een object dat de IXPathNavigable-interface implementeert. Het kan een [XmlNode](../../../system.xml/xmlnode/) zijn (meestal een [XmlDocument](../../../system.xml/xmldocument/)), of een XPathDocument dat de te transformeren gegevens bevat. |
| args | const SharedPtr\<XsltArgumentList\>\& | Een [XsltArgumentList](../../xsltargumentlist/) die de namespace-gekwalificeerde argumenten bevat die als invoer voor de transformatie worden gebruikt. |

### ReturnValue

Een [XmlReader](../../../system.xml/xmlreader/) die de resultaten van de transformatie bevat.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


Transformeert de XML-gegevens in de IXPathNavigable met de opgegeven **args** en schrijft het resultaat naar een Stream.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Een object dat de IXPathNavigable-interface implementeert. Het kan een [XmlNode](../../../system.xml/xmlnode/) zijn (meestal een [XmlDocument](../../../system.xml/xmldocument/)), of een XPathDocument dat de te transformeren gegevens bevat. |
| args | const SharedPtr\<XsltArgumentList\>\& | Een [XsltArgumentList](../../xsltargumentlist/) die de namespace-gekwalificeerde argumenten bevat die als invoer voor de transformatie worden gebruikt. |
| uitvoer | const SharedPtr\<IO::Stream\>\& | De stream waarnaar u wilt schrijven. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Transformeert de XML-gegevens in de IXPathNavigable met de opgegeven **args** en schrijft het resultaat naar een Stream.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Een object dat de IXPathNavigable-interface implementeert. Het kan een [XmlNode](../../../system.xml/xmlnode/) zijn (meestal een [XmlDocument](../../../system.xml/xmldocument/)), of een XPathDocument dat de te transformeren gegevens bevat. |
| args | const SharedPtr\<XsltArgumentList\>\& | Een [XsltArgumentList](../../xsltargumentlist/) die de namespace-gekwalificeerde argumenten bevat die als invoer voor de transformatie worden gebruikt. |
| uitvoer | const SharedPtr\<IO::Stream\>\& | De stream waarnaar u wilt schrijven. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | De [XmlResolver](../../../system.xml/xmlresolver/) die wordt gebruikt om de XSLT **document()**-functie op te lossen. Als dit **nullptr** is, wordt de **document()**-functie niet opgelost. De [XmlResolver](../../../system.xml/xmlresolver/) wordt niet gecachet nadat de [XslTransform::Transform](./) methode is voltooid. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


Transformeert de XML-gegevens in de IXPathNavigable met de opgegeven **args** en schrijft het resultaat naar een TextWriter.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Een object dat de IXPathNavigable-interface implementeert. Het kan een [XmlNode](../../../system.xml/xmlnode/) zijn (meestal een [XmlDocument](../../../system.xml/xmldocument/)), of een XPathDocument dat de te transformeren gegevens bevat. |
| args | const SharedPtr\<XsltArgumentList\>\& | Een [XsltArgumentList](../../xsltargumentlist/) die de namespace-gekwalificeerde argumenten bevat die als invoer voor de transformatie worden gebruikt. |
| uitvoer | const SharedPtr\<IO::TextWriter\>\& | De TextWriter waarnaar u wilt schrijven. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Transformeert de XML-gegevens in de IXPathNavigable met de opgegeven **args** en schrijft het resultaat naar een TextWriter.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Een object dat de IXPathNavigable-interface implementeert. Het kan een [XmlNode](../../../system.xml/xmlnode/) zijn (meestal een [XmlDocument](../../../system.xml/xmldocument/)), of een XPathDocument dat de te transformeren gegevens bevat. |
| args | const SharedPtr\<XsltArgumentList\>\& | Een [XsltArgumentList](../../xsltargumentlist/) die de namespace-gekwalificeerde argumenten bevat die als invoer voor de transformatie worden gebruikt. |
| uitvoer | const SharedPtr\<IO::TextWriter\>\& | De TextWriter waarnaar u wilt schrijven. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | De [XmlResolver](../../../system.xml/xmlresolver/) die wordt gebruikt om de XSLT **document()**-functie op te lossen. Als dit **nullptr** is, wordt de **document()**-functie niet opgelost. De [XmlResolver](../../../system.xml/xmlresolver/) wordt niet gecachet nadat deze methode is voltooid. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Transformeert de XML-gegevens in de IXPathNavigable met de opgegeven **args** en geeft het resultaat door aan een [XmlReader](../../../system.xml/xmlreader/).

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Een object dat de IXPathNavigable-interface implementeert. Het kan een [XmlNode](../../../system.xml/xmlnode/) zijn (meestal een [XmlDocument](../../../system.xml/xmldocument/)), of een XPathDocument dat de te transformeren gegevens bevat. |
| args | const SharedPtr\<XsltArgumentList\>\& | Een [XsltArgumentList](../../xsltargumentlist/) die de namespace-gekwalificeerde argumenten bevat die als invoer voor de transformatie worden gebruikt. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | De [XmlResolver](../../../system.xml/xmlresolver/) die wordt gebruikt om de XSLT **document()**-functie op te lossen. Als dit **nullptr** is, wordt de **document()**-functie niet opgelost. De [XmlResolver](../../../system.xml/xmlresolver/) wordt niet gecachet nadat deze methode is voltooid. |

### ReturnValue

Een [XmlReader](../../../system.xml/xmlreader/) die de resultaten van de transformatie bevat.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


Transformeert de XML-gegevens in de IXPathNavigable met de opgegeven **args** en geeft het resultaat door aan een [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Een object dat de IXPathNavigable-interface implementeert. Het kan een [XmlNode](../../../system.xml/xmlnode/) zijn (meestal een [XmlDocument](../../../system.xml/xmldocument/)), of een XPathDocument dat de te transformeren gegevens bevat. |
| args | const SharedPtr\<XsltArgumentList\>\& | Een [XsltArgumentList](../../xsltargumentlist/) die de namespace-gekwalificeerde argumenten bevat die als invoer voor de transformatie worden gebruikt. |
| output | const SharedPtr\<XmlWriter\>\& | De [XmlWriter](../../../system.xml/xmlwriter/) waarnaar u wilt schrijven. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Transformeert de XML-gegevens in de IXPathNavigable met de opgegeven **args** en geeft het resultaat door aan een [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Een object dat de IXPathNavigable-interface implementeert. Het kan een [XmlNode](../../../system.xml/xmlnode/) zijn (meestal een [XmlDocument](../../../system.xml/xmldocument/)), of een XPathDocument dat de te transformeren gegevens bevat. |
| args | const SharedPtr\<XsltArgumentList\>\& | Een [XsltArgumentList](../../xsltargumentlist/) die de namespace-gekwalificeerde argumenten bevat die als invoer voor de transformatie worden gebruikt. |
| output | const SharedPtr\<XmlWriter\>\& | De [XmlWriter](../../../system.xml/xmlwriter/) waarnaar u wilt schrijven. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | De [XmlResolver](../../../system.xml/xmlresolver/) die wordt gebruikt om de XSLT **document()**-functie op te lossen. Als dit **nullptr** is, wordt de **document()**-functie niet opgelost. De [XmlResolver](../../../system.xml/xmlresolver/) wordt niet gecachet nadat deze methode is voltooid. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&) method


Transformeert de XML-gegevens in de XPathNavigator met de opgegeven **args** en geeft het resultaat door aan een [XmlReader](../../../system.xml/xmlreader/).

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| invoer | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Een XPathNavigator die de te transformeren gegevens bevat. |
| args | const SharedPtr\<XsltArgumentList\>\& | Een [XsltArgumentList](../../xsltargumentlist/) die de namespace-gekwalificeerde argumenten bevat die als invoer voor de transformatie worden gebruikt. |

### ReturnValue

Een [XmlReader](../../../system.xml/xmlreader/) die de resultaten van de transformatie bevat.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


Transformeert de XML-gegevens in de XPathNavigator met de opgegeven **args** en schrijft het resultaat naar een Stream.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| invoer | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Een XPathNavigator die de te transformeren gegevens bevat. |
| args | const SharedPtr\<XsltArgumentList\>\& | Een [XsltArgumentList](../../xsltargumentlist/) die de namespace-gekwalificeerde argumenten bevat die als invoer voor de transformatie worden gebruikt. |
| uitvoer | const SharedPtr\<IO::Stream\>\& | De stream waarnaar u wilt schrijven. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Transformeert de XML-gegevens in de XPathNavigator met de opgegeven **args** en schrijft het resultaat naar een Stream.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| invoer | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Een XPathNavigator die de te transformeren gegevens bevat. |
| args | const SharedPtr\<XsltArgumentList\>\& | Een [XsltArgumentList](../../xsltargumentlist/) die de namespace-gekwalificeerde argumenten bevat die als invoer voor de transformatie worden gebruikt. |
| uitvoer | const SharedPtr\<IO::Stream\>\& | De stream waarnaar u wilt schrijven. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | De [XmlResolver](../../../system.xml/xmlresolver/) die wordt gebruikt om de XSLT **document()**-functie op te lossen. Als dit **nullptr** is, wordt de **document()**-functie niet opgelost. De [XmlResolver](../../../system.xml/xmlresolver/) wordt niet gecachet nadat deze methode is voltooid. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


Transformeert de XML-gegevens in de XPathNavigator met de opgegeven **args** en schrijft het resultaat naar een TextWriter.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| invoer | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Een XPathNavigator die de te transformeren gegevens bevat. |
| args | const SharedPtr\<XsltArgumentList\>\& | Een [XsltArgumentList](../../xsltargumentlist/) die de namespace-gekwalificeerde argumenten bevat die als invoer voor de transformatie worden gebruikt. |
| uitvoer | const SharedPtr\<IO::TextWriter\>\& | De TextWriter waarnaar u wilt schrijven. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Transformeert de XML-gegevens in de XPathNavigator met de opgegeven **args** en schrijft het resultaat naar een TextWriter.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| invoer | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Een XPathNavigator die de te transformeren gegevens bevat. |
| args | const SharedPtr\<XsltArgumentList\>\& | Een [XsltArgumentList](../../xsltargumentlist/) die de namespace-gekwalificeerde argumenten bevat die als invoer voor de transformatie worden gebruikt. |
| uitvoer | const SharedPtr\<IO::TextWriter\>\& | De TextWriter waarnaar u wilt schrijven. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | De [XmlResolver](../../../system.xml/xmlresolver/) die wordt gebruikt om de XSLT **document()**-functie op te lossen. Als dit **nullptr** is, wordt de **document()**-functie niet opgelost. De [XmlResolver](../../../system.xml/xmlresolver/) wordt niet gecachet nadat deze methode is voltooid. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Transformeert de XML-gegevens in de XPathNavigator met de opgegeven **args** en geeft het resultaat door aan een [XmlReader](../../../system.xml/xmlreader/).

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| invoer | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Een XPathNavigator die de te transformeren gegevens bevat. |
| args | const SharedPtr\<XsltArgumentList\>\& | Een [XsltArgumentList](../../xsltargumentlist/) die de namespace-gekwalificeerde argumenten bevat die als invoer voor de transformatie worden gebruikt. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | De [XmlResolver](../../../system.xml/xmlresolver/) die wordt gebruikt om de XSLT **document()**-functie op te lossen. Als dit **nullptr** is, wordt de **document()**-functie niet opgelost. De [XmlResolver](../../../system.xml/xmlresolver/) wordt niet gecachet nadat deze methode is voltooid. |

### ReturnValue

Een [XmlReader](../../../system.xml/xmlreader/) die de resultaten van de transformatie bevat.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


Transformeert de XML-gegevens in de XPathNavigator met de opgegeven argumenten en geeft het resultaat uit naar een [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| invoer | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Een XPathNavigator die de te transformeren gegevens bevat. |
| args | const SharedPtr\<XsltArgumentList\>\& | Een [XsltArgumentList](../../xsltargumentlist/) die de namespace-gekwalificeerde argumenten bevat die als invoer voor de transformatie worden gebruikt. |
| output | const SharedPtr\<XmlWriter\>\& | De [XmlWriter](../../../system.xml/xmlwriter/) waarnaar u wilt schrijven. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Transformeert de XML-gegevens in de XPathNavigator met de opgegeven argumenten en geeft het resultaat uit naar een [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| invoer | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Een XPathNavigator die de te transformeren gegevens bevat. |
| args | const SharedPtr\<XsltArgumentList\>\& | Een [XsltArgumentList](../../xsltargumentlist/) die de namespace-gekwalificeerde argumenten bevat die als invoer voor de transformatie worden gebruikt. |
| output | const SharedPtr\<XmlWriter\>\& | De [XmlWriter](../../../system.xml/xmlwriter/) waarnaar u wilt schrijven. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | De [XmlResolver](../../../system.xml/xmlresolver/) die wordt gebruikt om de XSLT **document()**-functie op te lossen. Als dit **nullptr** is, wordt de **document()**-functie niet opgelost. De [XmlResolver](../../../system.xml/xmlresolver/) wordt niet gecachet nadat deze methode is voltooid. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const String\&, const String\&) method


Transformeert de XML-gegevens in het invoerbestand en schrijft het resultaat naar een uitvoerbestand.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const String &inputfile, const String &outputfile)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| inputfile | const String\& | De URL van het brondocument dat moet worden getransformeerd. |
| outputfile | const String\& | De URL van het uitvoerbestand. |

## Zie ook

* Class [String](../../../system/string/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const String\&, const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Transformeert de XML-gegevens in het invoerbestand en schrijft het resultaat naar een uitvoerbestand.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const String &inputfile, const String &outputfile, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| inputfile | const String\& | De URL van het brondocument dat moet worden getransformeerd. |
| outputfile | const String\& | De URL van het uitvoerbestand. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | De [XmlResolver](../../../system.xml/xmlresolver/) die wordt gebruikt om de XSLT **document()**-functie op te lossen. Als dit **nullptr** is, wordt de **document()**-functie niet opgelost. De [XmlResolver](../../../system.xml/xmlresolver/) wordt niet gecachet nadat de [XslTransform::Transform](./) methode is voltooid. |

## Zie ook

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
