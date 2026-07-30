---
title: "System::Xml::Xsl::XslTransform::Transform-Methode"
linktitle: "Transformation"
second_title: "Aspose.Font für C++"
description: "System::Xml::Xsl::XslTransform::Transform-Methode. Transformiert die XML-Daten im IXPathNavigable mithilfe der angegebenen args und gibt das Ergebnis an einen XmlReader in C++ aus."
type: docs
weight: 400
url: /de/cpp/system.xml.xsl/xsltransform/transform/
---
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&) method


Transformiert die XML-Daten im IXPathNavigable mithilfe der angegebenen **args** und gibt das Ergebnis an einen [XmlReader](../../../system.xml/xmlreader/) aus.

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ein Objekt, das das IXPathNavigable-Interface implementiert. Es kann entweder ein [XmlNode](../../../system.xml/xmlnode/) (typischerweise ein [XmlDocument](../../../system.xml/xmldocument/)) oder ein XPathDocument sein, das die zu transformierenden Daten enthält. |
| args | const SharedPtr\<XsltArgumentList\>\& | Eine [XsltArgumentList](../../xsltargumentlist/) mit den namespacespezifischen Argumenten, die als Eingabe für die Transformation verwendet werden. |

### ReturnValue

Ein [XmlReader](../../../system.xml/xmlreader/) mit den Ergebnissen der Transformation.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


Transformiert die XML-Daten im IXPathNavigable mit den angegebenen **args** und gibt das Ergebnis an einen Stream aus.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ein Objekt, das das IXPathNavigable-Interface implementiert. Es kann entweder ein [XmlNode](../../../system.xml/xmlnode/) (typischerweise ein [XmlDocument](../../../system.xml/xmldocument/)) oder ein XPathDocument sein, das die zu transformierenden Daten enthält. |
| args | const SharedPtr\<XsltArgumentList\>\& | Eine [XsltArgumentList](../../xsltargumentlist/) mit den namespacespezifischen Argumenten, die als Eingabe für die Transformation verwendet werden. |
| Ausgabe | const SharedPtr\<IO::Stream\>\& | Der Stream, in den Sie ausgeben möchten. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Transformiert die XML-Daten im IXPathNavigable mit den angegebenen **args** und gibt das Ergebnis an einen Stream aus.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ein Objekt, das das IXPathNavigable-Interface implementiert. Es kann entweder ein [XmlNode](../../../system.xml/xmlnode/) (typischerweise ein [XmlDocument](../../../system.xml/xmldocument/)) oder ein XPathDocument sein, das die zu transformierenden Daten enthält. |
| args | const SharedPtr\<XsltArgumentList\>\& | Eine [XsltArgumentList](../../xsltargumentlist/) mit den namespacespezifischen Argumenten, die als Eingabe für die Transformation verwendet werden. |
| Ausgabe | const SharedPtr\<IO::Stream\>\& | Der Stream, in den Sie ausgeben möchten. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Der [XmlResolver](../../../system.xml/xmlresolver/), der zur Auflösung der XSLT **document()**-Funktion verwendet wird. Wenn dies **nullptr** ist, wird die **document()**-Funktion nicht aufgelöst. Der [XmlResolver](../../../system.xml/xmlresolver/) wird nach Abschluss der [XslTransform::Transform](./)-Methode nicht zwischengespeichert. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


Transformiert die XML-Daten im IXPathNavigable mit den angegebenen **args** und gibt das Ergebnis an einen TextWriter aus.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ein Objekt, das das IXPathNavigable-Interface implementiert. Es kann entweder ein [XmlNode](../../../system.xml/xmlnode/) (typischerweise ein [XmlDocument](../../../system.xml/xmldocument/)) oder ein XPathDocument sein, das die zu transformierenden Daten enthält. |
| args | const SharedPtr\<XsltArgumentList\>\& | Eine [XsltArgumentList](../../xsltargumentlist/) mit den namespacespezifischen Argumenten, die als Eingabe für die Transformation verwendet werden. |
| Ausgabe | const SharedPtr\<IO::TextWriter\>\& | Der TextWriter, in den Sie ausgeben möchten. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Transformiert die XML-Daten im IXPathNavigable mit den angegebenen **args** und gibt das Ergebnis an einen TextWriter aus.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ein Objekt, das das IXPathNavigable-Interface implementiert. Es kann entweder ein [XmlNode](../../../system.xml/xmlnode/) (typischerweise ein [XmlDocument](../../../system.xml/xmldocument/)) oder ein XPathDocument sein, das die zu transformierenden Daten enthält. |
| args | const SharedPtr\<XsltArgumentList\>\& | Eine [XsltArgumentList](../../xsltargumentlist/) mit den namespacespezifischen Argumenten, die als Eingabe für die Transformation verwendet werden. |
| Ausgabe | const SharedPtr\<IO::TextWriter\>\& | Der TextWriter, in den Sie ausgeben möchten. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Der [XmlResolver](../../../system.xml/xmlresolver/), der zur Auflösung der XSLT **document()**-Funktion verwendet wird. Wenn dies **nullptr** ist, wird die **document()**-Funktion nicht aufgelöst. Der [XmlResolver](../../../system.xml/xmlresolver/) wird nach Abschluss dieser Methode nicht zwischengespeichert. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Transformiert die XML-Daten im IXPathNavigable mithilfe der angegebenen **args** und gibt das Ergebnis an einen [XmlReader](../../../system.xml/xmlreader/) aus.

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ein Objekt, das das IXPathNavigable-Interface implementiert. Es kann entweder ein [XmlNode](../../../system.xml/xmlnode/) (typischerweise ein [XmlDocument](../../../system.xml/xmldocument/)) oder ein XPathDocument sein, das die zu transformierenden Daten enthält. |
| args | const SharedPtr\<XsltArgumentList\>\& | Eine [XsltArgumentList](../../xsltargumentlist/) mit den namespacespezifischen Argumenten, die als Eingabe für die Transformation verwendet werden. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Der [XmlResolver](../../../system.xml/xmlresolver/), der zur Auflösung der XSLT **document()**-Funktion verwendet wird. Wenn dies **nullptr** ist, wird die **document()**-Funktion nicht aufgelöst. Der [XmlResolver](../../../system.xml/xmlresolver/) wird nach Abschluss dieser Methode nicht zwischengespeichert. |

### ReturnValue

Ein [XmlReader](../../../system.xml/xmlreader/) mit den Ergebnissen der Transformation.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


Transformiert die XML-Daten im IXPathNavigable mithilfe der angegebenen **args** und gibt das Ergebnis an einen [XmlWriter](../../../system.xml/xmlwriter/) aus.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ein Objekt, das das IXPathNavigable-Interface implementiert. Es kann entweder ein [XmlNode](../../../system.xml/xmlnode/) (typischerweise ein [XmlDocument](../../../system.xml/xmldocument/)) oder ein XPathDocument sein, das die zu transformierenden Daten enthält. |
| args | const SharedPtr\<XsltArgumentList\>\& | Eine [XsltArgumentList](../../xsltargumentlist/) mit den namespacespezifischen Argumenten, die als Eingabe für die Transformation verwendet werden. |
| output | const SharedPtr\<XmlWriter\>\& | Der [XmlWriter](../../../system.xml/xmlwriter/), in den Sie ausgeben möchten. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Transformiert die XML-Daten im IXPathNavigable mithilfe der angegebenen **args** und gibt das Ergebnis an einen [XmlWriter](../../../system.xml/xmlwriter/) aus.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ein Objekt, das das IXPathNavigable-Interface implementiert. Es kann entweder ein [XmlNode](../../../system.xml/xmlnode/) (typischerweise ein [XmlDocument](../../../system.xml/xmldocument/)) oder ein XPathDocument sein, das die zu transformierenden Daten enthält. |
| args | const SharedPtr\<XsltArgumentList\>\& | Eine [XsltArgumentList](../../xsltargumentlist/) mit den namespacespezifischen Argumenten, die als Eingabe für die Transformation verwendet werden. |
| output | const SharedPtr\<XmlWriter\>\& | Der [XmlWriter](../../../system.xml/xmlwriter/), in den Sie ausgeben möchten. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Der [XmlResolver](../../../system.xml/xmlresolver/), der zur Auflösung der XSLT **document()**-Funktion verwendet wird. Wenn dies **nullptr** ist, wird die **document()**-Funktion nicht aufgelöst. Der [XmlResolver](../../../system.xml/xmlresolver/) wird nach Abschluss dieser Methode nicht zwischengespeichert. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&) method


Transformiert die XML-Daten im XPathNavigator mithilfe der angegebenen **args** und gibt das Ergebnis an einen [XmlReader](../../../system.xml/xmlreader/) aus.

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Ein XPathNavigator, der die zu transformierenden Daten enthält. |
| args | const SharedPtr\<XsltArgumentList\>\& | Eine [XsltArgumentList](../../xsltargumentlist/) mit den namespacespezifischen Argumenten, die als Eingabe für die Transformation verwendet werden. |

### ReturnValue

Ein [XmlReader](../../../system.xml/xmlreader/) mit den Ergebnissen der Transformation.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


Transformiert die XML-Daten im XPathNavigator mit den angegebenen **args** und gibt das Ergebnis an einen Stream aus.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Ein XPathNavigator, der die zu transformierenden Daten enthält. |
| args | const SharedPtr\<XsltArgumentList\>\& | Eine [XsltArgumentList](../../xsltargumentlist/) mit den namespacespezifischen Argumenten, die als Eingabe für die Transformation verwendet werden. |
| Ausgabe | const SharedPtr\<IO::Stream\>\& | Der Stream, in den Sie ausgeben möchten. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Transformiert die XML-Daten im XPathNavigator mit den angegebenen **args** und gibt das Ergebnis an einen Stream aus.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Ein XPathNavigator, der die zu transformierenden Daten enthält. |
| args | const SharedPtr\<XsltArgumentList\>\& | Eine [XsltArgumentList](../../xsltargumentlist/) mit den namespacespezifischen Argumenten, die als Eingabe für die Transformation verwendet werden. |
| Ausgabe | const SharedPtr\<IO::Stream\>\& | Der Stream, in den Sie ausgeben möchten. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Der [XmlResolver](../../../system.xml/xmlresolver/), der zur Auflösung der XSLT **document()**-Funktion verwendet wird. Wenn dies **nullptr** ist, wird die **document()**-Funktion nicht aufgelöst. Der [XmlResolver](../../../system.xml/xmlresolver/) wird nach Abschluss dieser Methode nicht zwischengespeichert. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


Transformiert die XML-Daten im XPathNavigator mit den angegebenen **args** und gibt das Ergebnis an einen TextWriter aus.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Ein XPathNavigator, der die zu transformierenden Daten enthält. |
| args | const SharedPtr\<XsltArgumentList\>\& | Eine [XsltArgumentList](../../xsltargumentlist/) mit den namespacespezifischen Argumenten, die als Eingabe für die Transformation verwendet werden. |
| Ausgabe | const SharedPtr\<IO::TextWriter\>\& | Der TextWriter, in den Sie ausgeben möchten. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Transformiert die XML-Daten im XPathNavigator mit den angegebenen **args** und gibt das Ergebnis an einen TextWriter aus.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Ein XPathNavigator, der die zu transformierenden Daten enthält. |
| args | const SharedPtr\<XsltArgumentList\>\& | Eine [XsltArgumentList](../../xsltargumentlist/) mit den namespacespezifischen Argumenten, die als Eingabe für die Transformation verwendet werden. |
| Ausgabe | const SharedPtr\<IO::TextWriter\>\& | Der TextWriter, in den Sie ausgeben möchten. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Der [XmlResolver](../../../system.xml/xmlresolver/), der zur Auflösung der XSLT **document()**-Funktion verwendet wird. Wenn dies **nullptr** ist, wird die **document()**-Funktion nicht aufgelöst. Der [XmlResolver](../../../system.xml/xmlresolver/) wird nach Abschluss dieser Methode nicht zwischengespeichert. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Transformiert die XML-Daten im XPathNavigator mithilfe der angegebenen **args** und gibt das Ergebnis an einen [XmlReader](../../../system.xml/xmlreader/) aus.

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Ein XPathNavigator, der die zu transformierenden Daten enthält. |
| args | const SharedPtr\<XsltArgumentList\>\& | Eine [XsltArgumentList](../../xsltargumentlist/) mit den namespacespezifischen Argumenten, die als Eingabe für die Transformation verwendet werden. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Der [XmlResolver](../../../system.xml/xmlresolver/), der zur Auflösung der XSLT **document()**-Funktion verwendet wird. Wenn dies **nullptr** ist, wird die **document()**-Funktion nicht aufgelöst. Der [XmlResolver](../../../system.xml/xmlresolver/) wird nach Abschluss dieser Methode nicht zwischengespeichert. |

### ReturnValue

Ein [XmlReader](../../../system.xml/xmlreader/) mit den Ergebnissen der Transformation.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


Transformiert die XML-Daten im XPathNavigator mithilfe der angegebenen args und gibt das Ergebnis an einen [XmlWriter](../../../system.xml/xmlwriter/) aus.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Ein XPathNavigator, der die zu transformierenden Daten enthält. |
| args | const SharedPtr\<XsltArgumentList\>\& | Eine [XsltArgumentList](../../xsltargumentlist/) mit den namespacespezifischen Argumenten, die als Eingabe für die Transformation verwendet werden. |
| output | const SharedPtr\<XmlWriter\>\& | Der [XmlWriter](../../../system.xml/xmlwriter/), in den Sie ausgeben möchten. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Transformiert die XML-Daten im XPathNavigator mithilfe der angegebenen args und gibt das Ergebnis an einen [XmlWriter](../../../system.xml/xmlwriter/) aus.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Ein XPathNavigator, der die zu transformierenden Daten enthält. |
| args | const SharedPtr\<XsltArgumentList\>\& | Eine [XsltArgumentList](../../xsltargumentlist/) mit den namespacespezifischen Argumenten, die als Eingabe für die Transformation verwendet werden. |
| output | const SharedPtr\<XmlWriter\>\& | Der [XmlWriter](../../../system.xml/xmlwriter/), in den Sie ausgeben möchten. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Der [XmlResolver](../../../system.xml/xmlresolver/), der zur Auflösung der XSLT **document()**-Funktion verwendet wird. Wenn dies **nullptr** ist, wird die **document()**-Funktion nicht aufgelöst. Der [XmlResolver](../../../system.xml/xmlresolver/) wird nach Abschluss dieser Methode nicht zwischengespeichert. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const String\&, const String\&) method


Transformiert die XML-Daten in der Eingabedatei und gibt das Ergebnis in einer Ausgabedatei aus.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const String &inputfile, const String &outputfile)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| inputfile | const String\& | Die URL des Quelldokuments, das transformiert werden soll. |
| outputfile | const String\& | Die URL der Ausgabedatei. |

## Siehe auch

* Class [String](../../../system/string/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const String\&, const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Transformiert die XML-Daten in der Eingabedatei und gibt das Ergebnis in einer Ausgabedatei aus.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const String &inputfile, const String &outputfile, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| inputfile | const String\& | Die URL des Quelldokuments, das transformiert werden soll. |
| outputfile | const String\& | Die URL der Ausgabedatei. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Der [XmlResolver](../../../system.xml/xmlresolver/), der zur Auflösung der XSLT **document()**-Funktion verwendet wird. Wenn dies **nullptr** ist, wird die **document()**-Funktion nicht aufgelöst. Der [XmlResolver](../../../system.xml/xmlresolver/) wird nach Abschluss der [XslTransform::Transform](./)-Methode nicht zwischengespeichert. |

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
