---
title: "System::Xml::Xsl::XslTransform::Transform‑metod"
linktitle: "Transform"
second_title: "Aspose.Page för C++"
description: "System::Xml::Xsl::XslTransform::Transform‑metod. Transformerar XML‑data i IXPathNavigable med de angivna argumenten och skriver ut resultatet till en XmlReader i C++."
type: docs
weight: 400
url: /sv/cpp/system.xml.xsl/xsltransform/transform/
---
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&) method


Transformerar XML‑data i IXPathNavigable med de angivna **args** och skriver ut resultatet till en [XmlReader](../../../system.xml/xmlreader/).

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ett objekt som implementerar IXPathNavigable‑gränssnittet. Det kan vara antingen en [XmlNode](../../../system.xml/xmlnode/) (vanligtvis ett [XmlDocument](../../../system.xml/xmldocument/)), eller ett XPathDocument som innehåller data som ska transformeras. |
| args | const SharedPtr\<XsltArgumentList\>\& | En [XsltArgumentList](../../xsltargumentlist/) som innehåller de namnrymdskvalificerade argumenten som används som indata till transformationen. |

### ReturnValue

En [XmlReader](../../../system.xml/xmlreader/) som innehåller resultaten av transformationen.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


Transformerar XML-data i IXPathNavigable med de angivna **args** och skriver ut resultatet till en Stream.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ett objekt som implementerar IXPathNavigable‑gränssnittet. Det kan vara antingen en [XmlNode](../../../system.xml/xmlnode/) (vanligtvis ett [XmlDocument](../../../system.xml/xmldocument/)), eller ett XPathDocument som innehåller data som ska transformeras. |
| args | const SharedPtr\<XsltArgumentList\>\& | En [XsltArgumentList](../../xsltargumentlist/) som innehåller de namnrymdskvalificerade argumenten som används som indata till transformationen. |
| utdata | const SharedPtr\<IO::Stream\>\& | Strömmen som du vill skriva ut till. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Transformerar XML-data i IXPathNavigable med de angivna **args** och skriver ut resultatet till en Stream.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ett objekt som implementerar IXPathNavigable‑gränssnittet. Det kan vara antingen en [XmlNode](../../../system.xml/xmlnode/) (vanligtvis ett [XmlDocument](../../../system.xml/xmldocument/)), eller ett XPathDocument som innehåller data som ska transformeras. |
| args | const SharedPtr\<XsltArgumentList\>\& | En [XsltArgumentList](../../xsltargumentlist/) som innehåller de namnrymdskvalificerade argumenten som används som indata till transformationen. |
| utdata | const SharedPtr\<IO::Stream\>\& | Strömmen som du vill skriva ut till. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Den [XmlResolver](../../../system.xml/xmlresolver/) som används för att lösa XSLT **document()**-funktionen. Om detta är **nullptr** löses inte **document()**-funktionen. [XmlResolver](../../../system.xml/xmlresolver/) cachas inte efter att [XslTransform::Transform](./)-metoden har slutförts. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


Transformerar XML-data i IXPathNavigable med de angivna **args** och skriver ut resultatet till en TextWriter.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ett objekt som implementerar IXPathNavigable‑gränssnittet. Det kan vara antingen en [XmlNode](../../../system.xml/xmlnode/) (vanligtvis ett [XmlDocument](../../../system.xml/xmldocument/)), eller ett XPathDocument som innehåller data som ska transformeras. |
| args | const SharedPtr\<XsltArgumentList\>\& | En [XsltArgumentList](../../xsltargumentlist/) som innehåller de namnrymdskvalificerade argumenten som används som indata till transformationen. |
| utdata | const SharedPtr\<IO::TextWriter\>\& | Den TextWriter som du vill skriva ut till. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Transformerar XML-data i IXPathNavigable med de angivna **args** och skriver ut resultatet till en TextWriter.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ett objekt som implementerar IXPathNavigable‑gränssnittet. Det kan vara antingen en [XmlNode](../../../system.xml/xmlnode/) (vanligtvis ett [XmlDocument](../../../system.xml/xmldocument/)), eller ett XPathDocument som innehåller data som ska transformeras. |
| args | const SharedPtr\<XsltArgumentList\>\& | En [XsltArgumentList](../../xsltargumentlist/) som innehåller de namnrymdskvalificerade argumenten som används som indata till transformationen. |
| utdata | const SharedPtr\<IO::TextWriter\>\& | Den TextWriter som du vill skriva ut till. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Den [XmlResolver](../../../system.xml/xmlresolver/) som används för att lösa XSLT **document()**-funktionen. Om detta är **nullptr** löses inte **document()**-funktionen. [XmlResolver](../../../system.xml/xmlresolver/) cachas inte efter att den här metoden har slutförts. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Transformerar XML‑data i IXPathNavigable med de angivna **args** och skriver ut resultatet till en [XmlReader](../../../system.xml/xmlreader/).

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ett objekt som implementerar IXPathNavigable‑gränssnittet. Det kan vara antingen en [XmlNode](../../../system.xml/xmlnode/) (vanligtvis ett [XmlDocument](../../../system.xml/xmldocument/)), eller ett XPathDocument som innehåller data som ska transformeras. |
| args | const SharedPtr\<XsltArgumentList\>\& | En [XsltArgumentList](../../xsltargumentlist/) som innehåller de namnrymdskvalificerade argumenten som används som indata till transformationen. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Den [XmlResolver](../../../system.xml/xmlresolver/) som används för att lösa XSLT **document()**-funktionen. Om detta är **nullptr** löses inte **document()**-funktionen. [XmlResolver](../../../system.xml/xmlresolver/) cachas inte efter att den här metoden har slutförts. |

### ReturnValue

En [XmlReader](../../../system.xml/xmlreader/) som innehåller resultaten av transformationen.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


Transformerar XML-data i IXPathNavigable med de angivna **args** och skriver ut resultatet till en [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ett objekt som implementerar IXPathNavigable‑gränssnittet. Det kan vara antingen en [XmlNode](../../../system.xml/xmlnode/) (vanligtvis ett [XmlDocument](../../../system.xml/xmldocument/)), eller ett XPathDocument som innehåller data som ska transformeras. |
| args | const SharedPtr\<XsltArgumentList\>\& | En [XsltArgumentList](../../xsltargumentlist/) som innehåller de namnrymdskvalificerade argumenten som används som indata till transformationen. |
| output | const SharedPtr\<XmlWriter\>\& | Den [XmlWriter](../../../system.xml/xmlwriter/) som du vill skriva ut till. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Transformerar XML-data i IXPathNavigable med de angivna **args** och skriver ut resultatet till en [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ett objekt som implementerar IXPathNavigable‑gränssnittet. Det kan vara antingen en [XmlNode](../../../system.xml/xmlnode/) (vanligtvis ett [XmlDocument](../../../system.xml/xmldocument/)), eller ett XPathDocument som innehåller data som ska transformeras. |
| args | const SharedPtr\<XsltArgumentList\>\& | En [XsltArgumentList](../../xsltargumentlist/) som innehåller de namnrymdskvalificerade argumenten som används som indata till transformationen. |
| output | const SharedPtr\<XmlWriter\>\& | Den [XmlWriter](../../../system.xml/xmlwriter/) som du vill skriva ut till. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Den [XmlResolver](../../../system.xml/xmlresolver/) som används för att lösa XSLT **document()**-funktionen. Om detta är **nullptr** löses inte **document()**-funktionen. [XmlResolver](../../../system.xml/xmlresolver/) cachas inte efter att den här metoden har slutförts. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&) method


Transformerar XML-data i XPathNavigator med de angivna **args** och skriver ut resultatet till en [XmlReader](../../../system.xml/xmlreader/).

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| inmatning | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | En XPathNavigator som innehåller data som ska transformeras. |
| args | const SharedPtr\<XsltArgumentList\>\& | En [XsltArgumentList](../../xsltargumentlist/) som innehåller de namnrymdskvalificerade argumenten som används som indata till transformationen. |

### ReturnValue

En [XmlReader](../../../system.xml/xmlreader/) som innehåller resultaten av transformationen.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


Transformerar XML-data i XPathNavigator med de angivna **args** och skriver ut resultatet till en Stream.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| inmatning | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | En XPathNavigator som innehåller data som ska transformeras. |
| args | const SharedPtr\<XsltArgumentList\>\& | En [XsltArgumentList](../../xsltargumentlist/) som innehåller de namnrymdskvalificerade argumenten som används som indata till transformationen. |
| utdata | const SharedPtr\<IO::Stream\>\& | Strömmen som du vill skriva ut till. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Transformerar XML-data i XPathNavigator med de angivna **args** och skriver ut resultatet till en Stream.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| inmatning | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | En XPathNavigator som innehåller data som ska transformeras. |
| args | const SharedPtr\<XsltArgumentList\>\& | En [XsltArgumentList](../../xsltargumentlist/) som innehåller de namnrymdskvalificerade argumenten som används som indata till transformationen. |
| utdata | const SharedPtr\<IO::Stream\>\& | Strömmen som du vill skriva ut till. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Den [XmlResolver](../../../system.xml/xmlresolver/) som används för att lösa XSLT **document()**-funktionen. Om detta är **nullptr** löses inte **document()**-funktionen. [XmlResolver](../../../system.xml/xmlresolver/) cachas inte efter att den här metoden har slutförts. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


Transformerar XML-data i XPathNavigator med de angivna **args** och skriver ut resultatet till en TextWriter.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| inmatning | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | En XPathNavigator som innehåller data som ska transformeras. |
| args | const SharedPtr\<XsltArgumentList\>\& | En [XsltArgumentList](../../xsltargumentlist/) som innehåller de namnrymdskvalificerade argumenten som används som indata till transformationen. |
| utdata | const SharedPtr\<IO::TextWriter\>\& | Den TextWriter som du vill skriva ut till. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Transformerar XML-data i XPathNavigator med de angivna **args** och skriver ut resultatet till en TextWriter.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| inmatning | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | En XPathNavigator som innehåller data som ska transformeras. |
| args | const SharedPtr\<XsltArgumentList\>\& | En [XsltArgumentList](../../xsltargumentlist/) som innehåller de namnrymdskvalificerade argumenten som används som indata till transformationen. |
| utdata | const SharedPtr\<IO::TextWriter\>\& | Den TextWriter som du vill skriva ut till. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Den [XmlResolver](../../../system.xml/xmlresolver/) som används för att lösa XSLT **document()**-funktionen. Om detta är **nullptr** löses inte **document()**-funktionen. [XmlResolver](../../../system.xml/xmlresolver/) cachas inte efter att den här metoden har slutförts. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Transformerar XML-data i XPathNavigator med de angivna **args** och skriver ut resultatet till en [XmlReader](../../../system.xml/xmlreader/).

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| inmatning | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | En XPathNavigator som innehåller data som ska transformeras. |
| args | const SharedPtr\<XsltArgumentList\>\& | En [XsltArgumentList](../../xsltargumentlist/) som innehåller de namnrymdskvalificerade argumenten som används som indata till transformationen. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Den [XmlResolver](../../../system.xml/xmlresolver/) som används för att lösa XSLT **document()**-funktionen. Om detta är **nullptr** löses inte **document()**-funktionen. [XmlResolver](../../../system.xml/xmlresolver/) cachas inte efter att den här metoden har slutförts. |

### ReturnValue

En [XmlReader](../../../system.xml/xmlreader/) som innehåller resultaten av transformationen.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


Transformerar XML-data i XPathNavigator med de angivna args och skriver ut resultatet till en [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| inmatning | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | En XPathNavigator som innehåller data som ska transformeras. |
| args | const SharedPtr\<XsltArgumentList\>\& | En [XsltArgumentList](../../xsltargumentlist/) som innehåller de namnrymdskvalificerade argumenten som används som indata till transformationen. |
| output | const SharedPtr\<XmlWriter\>\& | Den [XmlWriter](../../../system.xml/xmlwriter/) som du vill skriva ut till. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Transformerar XML-data i XPathNavigator med de angivna args och skriver ut resultatet till en [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| inmatning | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | En XPathNavigator som innehåller data som ska transformeras. |
| args | const SharedPtr\<XsltArgumentList\>\& | En [XsltArgumentList](../../xsltargumentlist/) som innehåller de namnrymdskvalificerade argumenten som används som indata till transformationen. |
| output | const SharedPtr\<XmlWriter\>\& | Den [XmlWriter](../../../system.xml/xmlwriter/) som du vill skriva ut till. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Den [XmlResolver](../../../system.xml/xmlresolver/) som används för att lösa XSLT **document()**-funktionen. Om detta är **nullptr** löses inte **document()**-funktionen. [XmlResolver](../../../system.xml/xmlresolver/) cachas inte efter att den här metoden har slutförts. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const String\&, const String\&) method


Transformerar XML-data i indatafilen och skriver ut resultatet till en utdatafil.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const String &inputfile, const String &outputfile)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| indatafil | const String\& | URL:en för källdokumentet som ska transformeras. |
| utdatafil | const String\& | URL:en för utdatafilen. |

## Se även

* Class [String](../../../system/string/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const String\&, const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Transformerar XML-data i indatafilen och skriver ut resultatet till en utdatafil.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const String &inputfile, const String &outputfile, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| indatafil | const String\& | URL:en för källdokumentet som ska transformeras. |
| utdatafil | const String\& | URL:en för utdatafilen. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Den [XmlResolver](../../../system.xml/xmlresolver/) som används för att lösa XSLT **document()**-funktionen. Om detta är **nullptr** löses inte **document()**-funktionen. [XmlResolver](../../../system.xml/xmlresolver/) cachas inte efter att [XslTransform::Transform](./)-metoden har slutförts. |

## Se även

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
