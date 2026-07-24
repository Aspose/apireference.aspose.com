---
title: "System::Xml::Xsl::XslCompiledTransform::Transform method"
linktitle: "Transform"
second_title: "Aspose.Page för C++"
description: "System::Xml::Xsl::XslCompiledTransform::Transform method. Utför transformationen med hjälp av inmatningsdokumentet som anges av IXPathNavigable‑objektet och skriver ut resultaten till en XmlWriter i C++."
type: docs
weight: 400
url: /sv/cpp/system.xml.xsl/xslcompiledtransform/transform/
---
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XmlWriter\>\&) method


Utför transformationen med hjälp av inmatningsdokumentet som anges av IXPathNavigable‑objektet och skriver ut resultaten till en [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XmlWriter> &results)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ett objekt som implementerar IXPathNavigable‑gränssnittet. Det kan vara antingen en [XmlNode](../../../system.xml/xmlnode/) (vanligtvis ett [XmlDocument](../../../system.xml/xmldocument/)), eller ett XPathDocument som innehåller data som ska transformeras. |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) som du vill skriva ut till. Om stilmallen innehåller ett **xsl:output**‑element bör du skapa [XmlWriter](../../../system.xml/xmlwriter/) med hjälp av [XmlWriterSettings](../../../system.xml/xmlwritersettings/)‑objektet som returneras från [XslCompiledTransform::get_OutputSettings](../get_outputsettings/)‑värdet. Detta säkerställer att [XmlWriter](../../../system.xml/xmlwriter/) har rätt utdatainställningar. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


Utför transformationen med hjälp av inmatningsdokumentet som anges av IXPathNavigable‑objektet och skriver ut resultaten till en ström. [XsltArgumentList](../../xsltargumentlist/) tillhandahåller ytterligare körningsargument.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ett objekt som implementerar IXPathNavigable‑gränssnittet. Det kan vara antingen en [XmlNode](../../../system.xml/xmlnode/) (vanligtvis ett [XmlDocument](../../../system.xml/xmldocument/)), eller ett XPathDocument som innehåller data som ska transformeras. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | En [XsltArgumentList](../../xsltargumentlist/) som innehåller namnrymdkvalificerade argument som används som indata till transformationen. Detta värde kan vara **nullptr**. |
| resultat | const SharedPtr\<IO::Stream\>\& | Strömmen som du vill skriva ut till. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


Utför transformationen med hjälp av inmatningsdokumentet som anges av IXPathNavigable‑objektet och skriver ut resultaten till en TextWriter. [XsltArgumentList](../../xsltargumentlist/) tillhandahåller ytterligare körningsargument.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ett objekt som implementerar IXPathNavigable‑gränssnittet. Det kan vara antingen en [XmlNode](../../../system.xml/xmlnode/) (vanligtvis ett [XmlDocument](../../../system.xml/xmldocument/)), eller ett XPathDocument som innehåller data som ska transformeras. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | En [XsltArgumentList](../../xsltargumentlist/) som innehåller namnrymdkvalificerade argument som används som indata till transformationen. Detta värde kan vara **nullptr**. |
| resultat | const SharedPtr\<IO::TextWriter\>\& | Den TextWriter som du vill skriva ut till. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


Utför transformationen med hjälp av inmatningsdokumentet som anges av IXPathNavigable‑objektet och skriver ut resultaten till en [XmlWriter](../../../system.xml/xmlwriter/). [XsltArgumentList](../../xsltargumentlist/) tillhandahåller ytterligare körningsargument.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ett objekt som implementerar IXPathNavigable‑gränssnittet. Det kan vara antingen en [XmlNode](../../../system.xml/xmlnode/) (vanligtvis ett [XmlDocument](../../../system.xml/xmldocument/)), eller ett XPathDocument som innehåller data som ska transformeras. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | En [XsltArgumentList](../../xsltargumentlist/) som innehåller namnrymdkvalificerade argument som används som indata till transformationen. Detta värde kan vara **nullptr**. |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) som du vill skriva ut till. Om stilmallen innehåller ett **xsl:output**‑element bör du skapa [XmlWriter](../../../system.xml/xmlwriter/) med hjälp av [XmlWriterSettings](../../../system.xml/xmlwritersettings/)‑objektet som returneras från [XslCompiledTransform::get_OutputSettings](../get_outputsettings/)‑värdet. Detta säkerställer att [XmlWriter](../../../system.xml/xmlwriter/) har rätt utdatainställningar. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) method


Utför transformationen genom att använda inmatningsdokumentet som anges av IXPathNavigable‑objektet och skriver ut resultaten till en [XmlWriter](../../../system.xml/xmlwriter/). [XsltArgumentList](../../xsltargumentlist/) tillhandahåller ytterligare körningsargument och [XmlResolver](../../../system.xml/xmlresolver/) löser XSLT **document()**‑funktionen.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results, const SharedPtr<XmlResolver> &documentResolver)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| inmatning | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Dokumentet som ska transformeras och som anges av IXPathNavigable‑objektet. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Argumentlista som [XsltArgumentList](../../xsltargumentlist/). |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) som du vill skriva ut till. Om stilmallen innehåller ett **xsl:output**‑element bör du skapa [XmlWriter](../../../system.xml/xmlwriter/) genom att använda [XmlWriterSettings](../../../system.xml/xmlwritersettings/)‑objektet som returneras från [XslCompiledTransform::get_OutputSettings](../get_outputsettings/)‑värdet. Detta säkerställer att [XmlWriter](../../../system.xml/xmlwriter/) har rätt utdatainställningar. |
| documentResolver | const SharedPtr\<XmlResolver\>\& | Den [XmlResolver](../../../system.xml/xmlresolver/) som används för att lösa XSLT **document()**-funktionen. Om detta är **nullptr**, så löses **document()**-funktionen inte. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XmlWriter\>\&) method


Utför transformationen med inmatningsdokumentet som anges av [XmlReader](../../../system.xml/xmlreader/)-objektet och skriver ut resultaten till en [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XmlWriter> &results)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | Den [XmlReader](../../../system.xml/xmlreader/) som innehåller inmatningsdokumentet. |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) som du vill skriva ut till. Om stilmallen innehåller ett **xsl:output**‑element bör du skapa [XmlWriter](../../../system.xml/xmlwriter/) med hjälp av [XmlWriterSettings](../../../system.xml/xmlwritersettings/)‑objektet som returneras från [XslCompiledTransform::get_OutputSettings](../get_outputsettings/)‑värdet. Detta säkerställer att [XmlWriter](../../../system.xml/xmlwriter/) har rätt utdatainställningar. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


Utför transformationen med inmatningsdokumentet som anges av [XmlReader](../../../system.xml/xmlreader/)-objektet och skriver ut resultaten till en ström. [XsltArgumentList](../../xsltargumentlist/) tillhandahåller ytterligare körningsargument.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | En [XmlReader](../../../system.xml/xmlreader/) som innehåller inmatningsdokumentet. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | En [XsltArgumentList](../../xsltargumentlist/) som innehåller namnrymdkvalificerade argument som används som indata till transformationen. Detta värde kan vara **nullptr**. |
| resultat | const SharedPtr\<IO::Stream\>\& | Strömmen som du vill skriva ut till. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


Utför transformationen med inmatningsdokumentet som anges av [XmlReader](../../../system.xml/xmlreader/)-objektet och skriver ut resultaten till en TextWriter. [XsltArgumentList](../../xsltargumentlist/) tillhandahåller ytterligare körningsargument.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | En [XmlReader](../../../system.xml/xmlreader/) som innehåller inmatningsdokumentet. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | En [XsltArgumentList](../../xsltargumentlist/) som innehåller namnrymdkvalificerade argument som används som indata till transformationen. Detta värde kan vara **nullptr**. |
| resultat | const SharedPtr\<IO::TextWriter\>\& | Den TextWriter som du vill skriva ut till. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


Utför transformationen med inmatningsdokumentet som anges av [XmlReader](../../../system.xml/xmlreader/)-objektet och skriver ut resultaten till en [XmlWriter](../../../system.xml/xmlwriter/). [XsltArgumentList](../../xsltargumentlist/) tillhandahåller ytterligare körningsargument.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | En [XmlReader](../../../system.xml/xmlreader/) som innehåller inmatningsdokumentet. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | En [XsltArgumentList](../../xsltargumentlist/) som innehåller namnrymdkvalificerade argument som används som indata till transformationen. Detta värde kan vara **nullptr**. |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) som du vill skriva ut till. Om stilmallen innehåller ett **xsl:output**‑element bör du skapa [XmlWriter](../../../system.xml/xmlwriter/) med hjälp av [XmlWriterSettings](../../../system.xml/xmlwritersettings/)‑objektet som returneras från [XslCompiledTransform::get_OutputSettings](../get_outputsettings/)‑värdet. Detta säkerställer att [XmlWriter](../../../system.xml/xmlwriter/) har rätt utdatainställningar. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) method


Utför transformationen med inmatningsdokumentet som anges av [XmlReader](../../../system.xml/xmlreader/)-objektet och skriver ut resultaten till en [XmlWriter](../../../system.xml/xmlwriter/). [XsltArgumentList](../../xsltargumentlist/) tillhandahåller ytterligare körningsargument och [XmlResolver](../../../system.xml/xmlresolver/) löser XSLT **document()**-funktionen.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results, const SharedPtr<XmlResolver> &documentResolver)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | En [XmlReader](../../../system.xml/xmlreader/) som innehåller inmatningsdokumentet. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | En [XsltArgumentList](../../xsltargumentlist/) som innehåller namnrymdkvalificerade argument som används som indata till transformationen. Detta värde kan vara **nullptr**. |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) som du vill skriva ut till. Om stilmallen innehåller ett **xsl:output**‑element bör du skapa [XmlWriter](../../../system.xml/xmlwriter/) med hjälp av [XmlWriterSettings](../../../system.xml/xmlwritersettings/)‑objektet som returneras från [XslCompiledTransform::get_OutputSettings](../get_outputsettings/)‑värdet. Detta säkerställer att [XmlWriter](../../../system.xml/xmlwriter/) har rätt utdatainställningar. |
| documentResolver | const SharedPtr\<XmlResolver\>\& | Den [XmlResolver](../../../system.xml/xmlresolver/) som används för att lösa XSLT **document()**-funktionen. Om detta är **nullptr**, så löses **document()**-funktionen inte. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XmlWriter\>\&) method


Utför transformationen med inmatningsdokumentet som anges av URI:n och skriver ut resultaten till en [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XmlWriter> &results)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| inputUri | const String\& | URI:n för inmatningsdokumentet. |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) som du vill skriva ut till. Om stilmallen innehåller ett **xsl:output**‑element bör du skapa [XmlWriter](../../../system.xml/xmlwriter/) med hjälp av [XmlWriterSettings](../../../system.xml/xmlwritersettings/)‑objektet som returneras från [XslCompiledTransform::get_OutputSettings](../get_outputsettings/)‑värdet. Detta säkerställer att [XmlWriter](../../../system.xml/xmlwriter/) har rätt utdatainställningar. |

## Se även

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


Utför transformationen med inmatningsdokumentet som anges av URI:n och skriver ut resultaten till en ström. [XsltArgumentList](../../xsltargumentlist/) tillhandahåller ytterligare körningsargument.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| inputUri | const String\& | URI:n för inmatningsdokumentet. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | En [XsltArgumentList](../../xsltargumentlist/) som innehåller namnrymdkvalificerade argument som används som indata till transformationen. Detta värde kan vara **nullptr**. |
| resultat | const SharedPtr\<IO::Stream\>\& | Strömmen som du vill skriva ut till. |

## Se även

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


Utför transformationen med inmatningsdokumentet som anges av URI:n och skriver ut resultaten till en TextWriter.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| inputUri | const String\& | URI:n för inmatningsdokumentet. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | En [XsltArgumentList](../../xsltargumentlist/) som innehåller namnrymdkvalificerade argument som används som indata till transformationen. Detta värde kan vara **nullptr**. |
| resultat | const SharedPtr\<IO::TextWriter\>\& | Den TextWriter som du vill skriva ut till. |

## Se även

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


Utför transformationen med inmatningsdokumentet som anges av URI:n och skriver ut resultaten till en [XmlWriter](../../../system.xml/xmlwriter/). [XsltArgumentList](../../xsltargumentlist/) tillhandahåller ytterligare körningsargument.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| inputUri | const String\& | URI:n för inmatningsdokumentet. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | En [XsltArgumentList](../../xsltargumentlist/) som innehåller namnrymdkvalificerade argument som används som indata till transformationen. Detta värde kan vara **nullptr**. |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) som du vill skriva ut till. Om stilmallen innehåller ett **xsl:output**‑element bör du skapa [XmlWriter](../../../system.xml/xmlwriter/) med hjälp av [XmlWriterSettings](../../../system.xml/xmlwritersettings/)‑objektet som returneras från [XslCompiledTransform::get_OutputSettings](../get_outputsettings/)‑värdet. Detta säkerställer att [XmlWriter](../../../system.xml/xmlwriter/) har rätt utdatainställningar. |

## Se även

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const String\&) method


Utför transformationen med inmatningsdokumentet som anges av URI:n och skriver ut resultaten till en fil.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const String &resultsFile)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| inputUri | const String\& | URI:n för inmatningsdokumentet. |
| resultsFile | const String\& | URI:n för utdatafilen. |

## Se även

* Class [String](../../../system/string/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
