---
title: "System::Xml::Xsl::XslCompiledTransform::Transform method"
linktitle: "Transform"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Xsl::XslCompiledTransform::Transform method. Voert de transformatie uit met het invoerdocument dat is gespecificeerd door het IXPathNavigable-object en geeft de resultaten door aan een XmlWriter in C++."
type: docs
weight: 400
url: /nl/cpp/system.xml.xsl/xslcompiledtransform/transform/
---
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XmlWriter\>\&) method


Voert de transformatie uit met het invoerdocument dat is gespecificeerd door het IXPathNavigable-object en geeft de resultaten door aan een [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XmlWriter> &results)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Een object dat de IXPathNavigable-interface implementeert. Het kan een [XmlNode](../../../system.xml/xmlnode/) zijn (meestal een [XmlDocument](../../../system.xml/xmldocument/)), of een XPathDocument dat de te transformeren gegevens bevat. |
| results | const SharedPtr\<XmlWriter\>\& | De [XmlWriter](../../../system.xml/xmlwriter/) waarin u wilt schrijven. Als het stylesheet een **xsl:output**-element bevat, moet u de [XmlWriter](../../../system.xml/xmlwriter/) maken met behulp van het [XmlWriterSettings](../../../system.xml/xmlwritersettings/)-object dat wordt geretourneerd door de waarde van [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). Dit zorgt ervoor dat de [XmlWriter](../../../system.xml/xmlwriter/) de juiste uitvoerinstellingen heeft. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


Voert de transformatie uit met het invoerdocument dat is gespecificeerd door het IXPathNavigable-object en geeft de resultaten door naar een stream. De [XsltArgumentList](../../xsltargumentlist/) biedt extra runtime‑argumenten.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Een object dat de IXPathNavigable-interface implementeert. Het kan een [XmlNode](../../../system.xml/xmlnode/) zijn (meestal een [XmlDocument](../../../system.xml/xmldocument/)), of een XPathDocument dat de te transformeren gegevens bevat. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Een [XsltArgumentList](../../xsltargumentlist/) die de namespace‑gekwalificeerde argumenten bevat die als invoer voor de transformatie worden gebruikt. Deze waarde kan **nullptr** zijn. |
| resultaten | const SharedPtr\<IO::Stream\>\& | De stream waarnaar u wilt schrijven. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


Voert de transformatie uit met het invoerdocument dat is gespecificeerd door het IXPathNavigable-object en geeft de resultaten door aan een TextWriter. De [XsltArgumentList](../../xsltargumentlist/) biedt extra run‑time‑argumenten.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Een object dat de IXPathNavigable-interface implementeert. Het kan een [XmlNode](../../../system.xml/xmlnode/) zijn (meestal een [XmlDocument](../../../system.xml/xmldocument/)), of een XPathDocument dat de te transformeren gegevens bevat. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Een [XsltArgumentList](../../xsltargumentlist/) die de namespace‑gekwalificeerde argumenten bevat die als invoer voor de transformatie worden gebruikt. Deze waarde kan **nullptr** zijn. |
| resultaten | const SharedPtr\<IO::TextWriter\>\& | De TextWriter waarnaar u wilt schrijven. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


Voert de transformatie uit met het invoerdocument dat is gespecificeerd door het IXPathNavigable-object en geeft de resultaten door aan een [XmlWriter](../../../system.xml/xmlwriter/). De [XsltArgumentList](../../xsltargumentlist/) biedt extra run‑time‑argumenten.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Een object dat de IXPathNavigable-interface implementeert. Het kan een [XmlNode](../../../system.xml/xmlnode/) zijn (meestal een [XmlDocument](../../../system.xml/xmldocument/)), of een XPathDocument dat de te transformeren gegevens bevat. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Een [XsltArgumentList](../../xsltargumentlist/) die de namespace‑gekwalificeerde argumenten bevat die als invoer voor de transformatie worden gebruikt. Deze waarde kan **nullptr** zijn. |
| results | const SharedPtr\<XmlWriter\>\& | De [XmlWriter](../../../system.xml/xmlwriter/) waarin u wilt schrijven. Als het stylesheet een **xsl:output**-element bevat, moet u de [XmlWriter](../../../system.xml/xmlwriter/) maken met behulp van het [XmlWriterSettings](../../../system.xml/xmlwritersettings/)-object dat wordt geretourneerd door de waarde van [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). Dit zorgt ervoor dat de [XmlWriter](../../../system.xml/xmlwriter/) de juiste uitvoerinstellingen heeft. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) method


Voert de transformatie uit door het invoerdocument te gebruiken dat is gespecificeerd door het IXPathNavigable-object en geeft de resultaten door aan een [XmlWriter](../../../system.xml/xmlwriter/). De [XsltArgumentList](../../xsltargumentlist/) biedt extra run‑time‑argumenten en de [XmlResolver](../../../system.xml/xmlresolver/) lost de XSLT **document()**‑functie op.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results, const SharedPtr<XmlResolver> &documentResolver)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| invoer | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Het document dat moet worden getransformeerd en dat is gespecificeerd door het IXPathNavigable-object. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Argumentenlijst als [XsltArgumentList](../../xsltargumentlist/). |
| results | const SharedPtr\<XmlWriter\>\& | De [XmlWriter](../../../system.xml/xmlwriter/) waarin u wilt schrijven. Als het stylesheet een **xsl:output**-element bevat, moet u de [XmlWriter](../../../system.xml/xmlwriter/) maken door gebruik te maken van het [XmlWriterSettings](../../../system.xml/xmlwritersettings/)-object dat wordt geretourneerd door de waarde van [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). Dit zorgt ervoor dat de [XmlWriter](../../../system.xml/xmlwriter/) de juiste uitvoerinstellingen heeft. |
| documentResolver | const SharedPtr\<XmlResolver\>\& | De [XmlResolver](../../../system.xml/xmlresolver/) die wordt gebruikt om de XSLT **document()**‑functie op te lossen. Als dit **nullptr** is, wordt de **document()**‑functie niet opgelost. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XmlWriter\>\&) method


Voert de transformatie uit met het invoerdocument dat is gespecificeerd door het [XmlReader](../../../system.xml/xmlreader/)-object en geeft de resultaten door aan een [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XmlWriter> &results)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | De [XmlReader](../../../system.xml/xmlreader/) die het invoerdocument bevat. |
| results | const SharedPtr\<XmlWriter\>\& | De [XmlWriter](../../../system.xml/xmlwriter/) waarin u wilt schrijven. Als het stylesheet een **xsl:output**-element bevat, moet u de [XmlWriter](../../../system.xml/xmlwriter/) maken met behulp van het [XmlWriterSettings](../../../system.xml/xmlwritersettings/)-object dat wordt geretourneerd door de waarde van [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). Dit zorgt ervoor dat de [XmlWriter](../../../system.xml/xmlwriter/) de juiste uitvoerinstellingen heeft. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


Voert de transformatie uit met het invoerdocument dat is gespecificeerd door het [XmlReader](../../../system.xml/xmlreader/)-object en geeft de resultaten door naar een stream. De [XsltArgumentList](../../xsltargumentlist/) biedt extra run‑time‑argumenten.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | Een [XmlReader](../../../system.xml/xmlreader/) die het invoerdocument bevat. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Een [XsltArgumentList](../../xsltargumentlist/) die de namespace‑gekwalificeerde argumenten bevat die als invoer voor de transformatie worden gebruikt. Deze waarde kan **nullptr** zijn. |
| resultaten | const SharedPtr\<IO::Stream\>\& | De stream waarnaar u wilt schrijven. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


Voert de transformatie uit met het invoerdocument dat is gespecificeerd door het [XmlReader](../../../system.xml/xmlreader/)-object en geeft de resultaten door aan een TextWriter. De [XsltArgumentList](../../xsltargumentlist/) biedt extra run‑time‑argumenten.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | Een [XmlReader](../../../system.xml/xmlreader/) die het invoerdocument bevat. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Een [XsltArgumentList](../../xsltargumentlist/) die de namespace‑gekwalificeerde argumenten bevat die als invoer voor de transformatie worden gebruikt. Deze waarde kan **nullptr** zijn. |
| resultaten | const SharedPtr\<IO::TextWriter\>\& | De TextWriter waarnaar u wilt schrijven. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


Voert de transformatie uit met het invoerdocument dat is gespecificeerd door het [XmlReader](../../../system.xml/xmlreader/)-object en geeft de resultaten door aan een [XmlWriter](../../../system.xml/xmlwriter/). De [XsltArgumentList](../../xsltargumentlist/) biedt extra run‑time‑argumenten.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | Een [XmlReader](../../../system.xml/xmlreader/) die het invoerdocument bevat. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Een [XsltArgumentList](../../xsltargumentlist/) die de namespace‑gekwalificeerde argumenten bevat die als invoer voor de transformatie worden gebruikt. Deze waarde kan **nullptr** zijn. |
| results | const SharedPtr\<XmlWriter\>\& | De [XmlWriter](../../../system.xml/xmlwriter/) waarin u wilt schrijven. Als het stylesheet een **xsl:output**-element bevat, moet u de [XmlWriter](../../../system.xml/xmlwriter/) maken met behulp van het [XmlWriterSettings](../../../system.xml/xmlwritersettings/)-object dat wordt geretourneerd door de waarde van [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). Dit zorgt ervoor dat de [XmlWriter](../../../system.xml/xmlwriter/) de juiste uitvoerinstellingen heeft. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) method


Voert de transformatie uit met het invoerdocument dat is gespecificeerd door het [XmlReader](../../../system.xml/xmlreader/)-object en geeft de resultaten door aan een [XmlWriter](../../../system.xml/xmlwriter/). De [XsltArgumentList](../../xsltargumentlist/) biedt extra run‑time‑argumenten en de [XmlResolver](../../../system.xml/xmlresolver/) lost de XSLT **document()**‑functie op.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results, const SharedPtr<XmlResolver> &documentResolver)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | Een [XmlReader](../../../system.xml/xmlreader/) die het invoerdocument bevat. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Een [XsltArgumentList](../../xsltargumentlist/) die de namespace‑gekwalificeerde argumenten bevat die als invoer voor de transformatie worden gebruikt. Deze waarde kan **nullptr** zijn. |
| results | const SharedPtr\<XmlWriter\>\& | De [XmlWriter](../../../system.xml/xmlwriter/) waarin u wilt schrijven. Als het stylesheet een **xsl:output**-element bevat, moet u de [XmlWriter](../../../system.xml/xmlwriter/) maken met behulp van het [XmlWriterSettings](../../../system.xml/xmlwritersettings/)-object dat wordt geretourneerd door de waarde van [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). Dit zorgt ervoor dat de [XmlWriter](../../../system.xml/xmlwriter/) de juiste uitvoerinstellingen heeft. |
| documentResolver | const SharedPtr\<XmlResolver\>\& | De [XmlResolver](../../../system.xml/xmlresolver/) die wordt gebruikt om de XSLT **document()**‑functie op te lossen. Als dit **nullptr** is, wordt de **document()**‑functie niet opgelost. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XmlWriter\>\&) method


Voert de transformatie uit met het invoerdocument dat is gespecificeerd door de URI en geeft de resultaten door aan een [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XmlWriter> &results)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| inputUri | const String\& | De URI van het invoerdocument. |
| results | const SharedPtr\<XmlWriter\>\& | De [XmlWriter](../../../system.xml/xmlwriter/) waarin u wilt schrijven. Als het stylesheet een **xsl:output**-element bevat, moet u de [XmlWriter](../../../system.xml/xmlwriter/) maken met behulp van het [XmlWriterSettings](../../../system.xml/xmlwritersettings/)-object dat wordt geretourneerd door de waarde van [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). Dit zorgt ervoor dat de [XmlWriter](../../../system.xml/xmlwriter/) de juiste uitvoerinstellingen heeft. |

## Zie ook

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


Voert de transformatie uit met het invoerdocument dat door de URI is opgegeven en geeft de resultaten naar een stream. De [XsltArgumentList](../../xsltargumentlist/) biedt extra runtime‑argumenten.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| inputUri | const String\& | De URI van het invoerdocument. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Een [XsltArgumentList](../../xsltargumentlist/) die de namespace‑gekwalificeerde argumenten bevat die als invoer voor de transformatie worden gebruikt. Deze waarde kan **nullptr** zijn. |
| resultaten | const SharedPtr\<IO::Stream\>\& | De stream waarnaar u wilt schrijven. |

## Zie ook

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


Voert de transformatie uit met het invoerdocument dat is opgegeven door de URI en geeft de resultaten weer naar een TextWriter.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| inputUri | const String\& | De URI van het invoerdocument. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Een [XsltArgumentList](../../xsltargumentlist/) die de namespace‑gekwalificeerde argumenten bevat die als invoer voor de transformatie worden gebruikt. Deze waarde kan **nullptr** zijn. |
| resultaten | const SharedPtr\<IO::TextWriter\>\& | De TextWriter waarnaar u wilt schrijven. |

## Zie ook

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


Voert de transformatie uit met het invoerdocument dat door de URI is opgegeven en geeft de resultaten naar een [XmlWriter](../../../system.xml/xmlwriter/). De [XsltArgumentList](../../xsltargumentlist/) biedt extra runtime‑argumenten.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| inputUri | const String\& | De URI van het invoerdocument. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Een [XsltArgumentList](../../xsltargumentlist/) die de namespace‑gekwalificeerde argumenten bevat die als invoer voor de transformatie worden gebruikt. Deze waarde kan **nullptr** zijn. |
| results | const SharedPtr\<XmlWriter\>\& | De [XmlWriter](../../../system.xml/xmlwriter/) waarin u wilt schrijven. Als het stylesheet een **xsl:output**-element bevat, moet u de [XmlWriter](../../../system.xml/xmlwriter/) maken met behulp van het [XmlWriterSettings](../../../system.xml/xmlwritersettings/)-object dat wordt geretourneerd door de waarde van [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). Dit zorgt ervoor dat de [XmlWriter](../../../system.xml/xmlwriter/) de juiste uitvoerinstellingen heeft. |

## Zie ook

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const String\&) method


Voert de transformatie uit met het invoerdocument dat is opgegeven door de URI en geeft de resultaten weer naar een bestand.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const String &resultsFile)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| inputUri | const String\& | De URI van het invoerdocument. |
| resultsFile | const String\& | De URI van het uitvoerbestand. |

## Zie ook

* Class [String](../../../system/string/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
