---
title: "System::Xml::Xsl::XslCompiledTransform::Transform Methode"
linktitle: "Transformation"
second_title: "Aspose.Font für C++"
description: "System::Xml::Xsl::XslCompiledTransform::Transform Methode. Führt die Transformation mit dem Eingabedokument aus, das durch das IXPathNavigable-Objekt angegeben ist, und gibt die Ergebnisse an einen XmlWriter in C++ aus."
type: docs
weight: 400
url: /de/cpp/system.xml.xsl/xslcompiledtransform/transform/
---
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XmlWriter\>\&) method


Führt die Transformation mit dem Eingabedokument aus, das durch das IXPathNavigable-Objekt angegeben ist, und gibt die Ergebnisse an einen [XmlWriter](../../../system.xml/xmlwriter/) aus.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XmlWriter> &results)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ein Objekt, das das IXPathNavigable-Interface implementiert. Es kann entweder ein [XmlNode](../../../system.xml/xmlnode/) (typischerweise ein [XmlDocument](../../../system.xml/xmldocument/)) oder ein XPathDocument sein, das die zu transformierenden Daten enthält. |
| results | const SharedPtr\<XmlWriter\>\& | Der [XmlWriter](../../../system.xml/xmlwriter/), in den Sie ausgeben möchten. Wenn das Stylesheet ein **xsl:output**-Element enthält, sollten Sie den [XmlWriter](../../../system.xml/xmlwriter/) mit dem [XmlWriterSettings](../../../system.xml/xmlwritersettings/)-Objekt erstellen, das vom [XslCompiledTransform::get_OutputSettings](../get_outputsettings/)-Wert zurückgegeben wird. Dies stellt sicher, dass der [XmlWriter](../../../system.xml/xmlwriter/) die korrekten Ausgabeeinstellungen hat. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


Führt die Transformation mit dem Eingabedokument aus, das durch das IXPathNavigable-Objekt angegeben ist, und gibt die Ergebnisse an einen Stream aus. Die [XsltArgumentList](../../xsltargumentlist/) liefert zusätzliche Laufzeitargumente.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ein Objekt, das das IXPathNavigable-Interface implementiert. Es kann entweder ein [XmlNode](../../../system.xml/xmlnode/) (typischerweise ein [XmlDocument](../../../system.xml/xmldocument/)) oder ein XPathDocument sein, das die zu transformierenden Daten enthält. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Eine [XsltArgumentList](../../xsltargumentlist/) mit den namespacespezifischen Argumenten, die als Eingabe für die Transformation verwendet werden. Dieser Wert kann **nullptr** sein. |
| results | const SharedPtr\<IO::Stream\>\& | Der Stream, in den Sie ausgeben möchten. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


Führt die Transformation mit dem Eingabedokument aus, das durch das IXPathNavigable-Objekt angegeben ist, und gibt die Ergebnisse an einen TextWriter aus. Die [XsltArgumentList](../../xsltargumentlist/) liefert zusätzliche Laufzeitargumente.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ein Objekt, das das IXPathNavigable-Interface implementiert. Es kann entweder ein [XmlNode](../../../system.xml/xmlnode/) (typischerweise ein [XmlDocument](../../../system.xml/xmldocument/)) oder ein XPathDocument sein, das die zu transformierenden Daten enthält. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Eine [XsltArgumentList](../../xsltargumentlist/) mit den namespacespezifischen Argumenten, die als Eingabe für die Transformation verwendet werden. Dieser Wert kann **nullptr** sein. |
| results | const SharedPtr\<IO::TextWriter\>\& | Der TextWriter, in den Sie ausgeben möchten. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


Führt die Transformation mit dem Eingabedokument aus, das durch das IXPathNavigable-Objekt angegeben ist, und gibt die Ergebnisse an einen [XmlWriter](../../../system.xml/xmlwriter/) aus. Die [XsltArgumentList](../../xsltargumentlist/) liefert zusätzliche Laufzeitargumente.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ein Objekt, das das IXPathNavigable-Interface implementiert. Es kann entweder ein [XmlNode](../../../system.xml/xmlnode/) (typischerweise ein [XmlDocument](../../../system.xml/xmldocument/)) oder ein XPathDocument sein, das die zu transformierenden Daten enthält. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Eine [XsltArgumentList](../../xsltargumentlist/) mit den namespacespezifischen Argumenten, die als Eingabe für die Transformation verwendet werden. Dieser Wert kann **nullptr** sein. |
| results | const SharedPtr\<XmlWriter\>\& | Der [XmlWriter](../../../system.xml/xmlwriter/), in den Sie ausgeben möchten. Wenn das Stylesheet ein **xsl:output**-Element enthält, sollten Sie den [XmlWriter](../../../system.xml/xmlwriter/) mit dem [XmlWriterSettings](../../../system.xml/xmlwritersettings/)-Objekt erstellen, das vom [XslCompiledTransform::get_OutputSettings](../get_outputsettings/)-Wert zurückgegeben wird. Dies stellt sicher, dass der [XmlWriter](../../../system.xml/xmlwriter/) die korrekten Ausgabeeinstellungen hat. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) method


Führt die Transformation unter Verwendung des Eingabedokuments aus, das durch das IXPathNavigable-Objekt angegeben ist, und gibt die Ergebnisse an einen [XmlWriter](../../../system.xml/xmlwriter/) aus. Die [XsltArgumentList](../../xsltargumentlist/) liefert zusätzliche Laufzeitargumente und der [XmlResolver](../../../system.xml/xmlresolver/) löst die XSLT **document()**-Funktion auf.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results, const SharedPtr<XmlResolver> &documentResolver)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Das Dokument, das transformiert werden soll und durch das IXPathNavigable-Objekt angegeben ist. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Argumentliste als [XsltArgumentList](../../xsltargumentlist/). |
| results | const SharedPtr\<XmlWriter\>\& | Der [XmlWriter](../../../system.xml/xmlwriter/), in den Sie ausgeben möchten. Wenn das Stylesheet ein **xsl:output**-Element enthält, sollten Sie den [XmlWriter](../../../system.xml/xmlwriter/) mithilfe des [XmlWriterSettings](../../../system.xml/xmlwritersettings/)-Objekts erstellen, das vom Wert [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) zurückgegeben wird. Dadurch wird sichergestellt, dass der [XmlWriter](../../../system.xml/xmlwriter/) die korrekten Ausgabeeinstellungen hat. |
| documentResolver | const SharedPtr\<XmlResolver\>\& | Der [XmlResolver](../../../system.xml/xmlresolver/) wird verwendet, um die XSLT-**document()**-Funktion aufzulösen. Wenn dies **nullptr** ist, wird die **document()**-Funktion nicht aufgelöst. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XmlWriter\>\&) method


Führt die Transformation mit dem Eingabedokument aus, das durch das [XmlReader](../../../system.xml/xmlreader/)-Objekt angegeben ist, und gibt die Ergebnisse an einen [XmlWriter](../../../system.xml/xmlwriter/) aus.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XmlWriter> &results)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | Der [XmlReader](../../../system.xml/xmlreader/), der das Eingabedokument enthält. |
| results | const SharedPtr\<XmlWriter\>\& | Der [XmlWriter](../../../system.xml/xmlwriter/), in den Sie ausgeben möchten. Wenn das Stylesheet ein **xsl:output**-Element enthält, sollten Sie den [XmlWriter](../../../system.xml/xmlwriter/) mit dem [XmlWriterSettings](../../../system.xml/xmlwritersettings/)-Objekt erstellen, das vom [XslCompiledTransform::get_OutputSettings](../get_outputsettings/)-Wert zurückgegeben wird. Dies stellt sicher, dass der [XmlWriter](../../../system.xml/xmlwriter/) die korrekten Ausgabeeinstellungen hat. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


Führt die Transformation mit dem Eingabedokument aus, das durch das [XmlReader](../../../system.xml/xmlreader/)-Objekt angegeben ist, und gibt die Ergebnisse an einen Stream aus. Die [XsltArgumentList](../../xsltargumentlist/) liefert zusätzliche Laufzeitargumente.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | Ein [XmlReader](../../../system.xml/xmlreader/), der das Eingabedokument enthält. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Eine [XsltArgumentList](../../xsltargumentlist/) mit den namespacespezifischen Argumenten, die als Eingabe für die Transformation verwendet werden. Dieser Wert kann **nullptr** sein. |
| results | const SharedPtr\<IO::Stream\>\& | Der Stream, in den Sie ausgeben möchten. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


Führt die Transformation mit dem Eingabedokument aus, das durch das [XmlReader](../../../system.xml/xmlreader/)-Objekt angegeben ist, und gibt die Ergebnisse an einen TextWriter aus. Die [XsltArgumentList](../../xsltargumentlist/) liefert zusätzliche Laufzeitargumente.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | Ein [XmlReader](../../../system.xml/xmlreader/), der das Eingabedokument enthält. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Eine [XsltArgumentList](../../xsltargumentlist/) mit den namespacespezifischen Argumenten, die als Eingabe für die Transformation verwendet werden. Dieser Wert kann **nullptr** sein. |
| results | const SharedPtr\<IO::TextWriter\>\& | Der TextWriter, in den Sie ausgeben möchten. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


Führt die Transformation mit dem Eingabedokument aus, das durch das [XmlReader](../../../system.xml/xmlreader/)-Objekt angegeben ist, und gibt die Ergebnisse an einen [XmlWriter](../../../system.xml/xmlwriter/) aus. Die [XsltArgumentList](../../xsltargumentlist/) liefert zusätzliche Laufzeitargumente.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | Ein [XmlReader](../../../system.xml/xmlreader/), der das Eingabedokument enthält. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Eine [XsltArgumentList](../../xsltargumentlist/) mit den namespacespezifischen Argumenten, die als Eingabe für die Transformation verwendet werden. Dieser Wert kann **nullptr** sein. |
| results | const SharedPtr\<XmlWriter\>\& | Der [XmlWriter](../../../system.xml/xmlwriter/), in den Sie ausgeben möchten. Wenn das Stylesheet ein **xsl:output**-Element enthält, sollten Sie den [XmlWriter](../../../system.xml/xmlwriter/) mit dem [XmlWriterSettings](../../../system.xml/xmlwritersettings/)-Objekt erstellen, das vom [XslCompiledTransform::get_OutputSettings](../get_outputsettings/)-Wert zurückgegeben wird. Dies stellt sicher, dass der [XmlWriter](../../../system.xml/xmlwriter/) die korrekten Ausgabeeinstellungen hat. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) method


Führt die Transformation mit dem Eingabedokument aus, das durch das [XmlReader](../../../system.xml/xmlreader/)-Objekt angegeben ist, und gibt die Ergebnisse an einen [XmlWriter](../../../system.xml/xmlwriter/) aus. Die [XsltArgumentList](../../xsltargumentlist/) liefert zusätzliche Laufzeitargumente und der [XmlResolver](../../../system.xml/xmlresolver/) löst die XSLT-**document()**-Funktion auf.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results, const SharedPtr<XmlResolver> &documentResolver)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | Ein [XmlReader](../../../system.xml/xmlreader/), der das Eingabedokument enthält. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Eine [XsltArgumentList](../../xsltargumentlist/) mit den namespacespezifischen Argumenten, die als Eingabe für die Transformation verwendet werden. Dieser Wert kann **nullptr** sein. |
| results | const SharedPtr\<XmlWriter\>\& | Der [XmlWriter](../../../system.xml/xmlwriter/), in den Sie ausgeben möchten. Wenn das Stylesheet ein **xsl:output**-Element enthält, sollten Sie den [XmlWriter](../../../system.xml/xmlwriter/) mit dem [XmlWriterSettings](../../../system.xml/xmlwritersettings/)-Objekt erstellen, das vom [XslCompiledTransform::get_OutputSettings](../get_outputsettings/)-Wert zurückgegeben wird. Dies stellt sicher, dass der [XmlWriter](../../../system.xml/xmlwriter/) die korrekten Ausgabeeinstellungen hat. |
| documentResolver | const SharedPtr\<XmlResolver\>\& | Der [XmlResolver](../../../system.xml/xmlresolver/) wird verwendet, um die XSLT-**document()**-Funktion aufzulösen. Wenn dies **nullptr** ist, wird die **document()**-Funktion nicht aufgelöst. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XmlWriter\>\&) method


Führt die Transformation mit dem Eingabedokument aus, das durch die URI angegeben ist, und gibt die Ergebnisse an einen [XmlWriter](../../../system.xml/xmlwriter/) aus.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XmlWriter> &results)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| inputUri | const String\& | Die URI des Eingabedokuments. |
| results | const SharedPtr\<XmlWriter\>\& | Der [XmlWriter](../../../system.xml/xmlwriter/), in den Sie ausgeben möchten. Wenn das Stylesheet ein **xsl:output**-Element enthält, sollten Sie den [XmlWriter](../../../system.xml/xmlwriter/) mit dem [XmlWriterSettings](../../../system.xml/xmlwritersettings/)-Objekt erstellen, das vom [XslCompiledTransform::get_OutputSettings](../get_outputsettings/)-Wert zurückgegeben wird. Dies stellt sicher, dass der [XmlWriter](../../../system.xml/xmlwriter/) die korrekten Ausgabeeinstellungen hat. |

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


Führt die Transformation mit dem Eingabedokument aus, das durch die URI angegeben ist, und gibt die Ergebnisse an einen Stream aus. Die [XsltArgumentList](../../xsltargumentlist/) liefert zusätzliche Laufzeitargumente.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| inputUri | const String\& | Die URI des Eingabedokuments. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Eine [XsltArgumentList](../../xsltargumentlist/) mit den namespacespezifischen Argumenten, die als Eingabe für die Transformation verwendet werden. Dieser Wert kann **nullptr** sein. |
| results | const SharedPtr\<IO::Stream\>\& | Der Stream, in den Sie ausgeben möchten. |

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


Führt die Transformation mit dem durch die URI angegebenen Eingabedokument aus und gibt die Ergebnisse an einen TextWriter aus.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| inputUri | const String\& | Die URI des Eingabedokuments. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Eine [XsltArgumentList](../../xsltargumentlist/) mit den namespacespezifischen Argumenten, die als Eingabe für die Transformation verwendet werden. Dieser Wert kann **nullptr** sein. |
| results | const SharedPtr\<IO::TextWriter\>\& | Der TextWriter, in den Sie ausgeben möchten. |

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


Führt die Transformation mit dem Eingabedokument aus, das durch die URI angegeben ist, und gibt die Ergebnisse an einen [XmlWriter](../../../system.xml/xmlwriter/) aus. Die [XsltArgumentList](../../xsltargumentlist/) liefert zusätzliche Laufzeitargumente.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| inputUri | const String\& | Die URI des Eingabedokuments. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Eine [XsltArgumentList](../../xsltargumentlist/) mit den namespacespezifischen Argumenten, die als Eingabe für die Transformation verwendet werden. Dieser Wert kann **nullptr** sein. |
| results | const SharedPtr\<XmlWriter\>\& | Der [XmlWriter](../../../system.xml/xmlwriter/), in den Sie ausgeben möchten. Wenn das Stylesheet ein **xsl:output**-Element enthält, sollten Sie den [XmlWriter](../../../system.xml/xmlwriter/) mit dem [XmlWriterSettings](../../../system.xml/xmlwritersettings/)-Objekt erstellen, das vom [XslCompiledTransform::get_OutputSettings](../get_outputsettings/)-Wert zurückgegeben wird. Dies stellt sicher, dass der [XmlWriter](../../../system.xml/xmlwriter/) die korrekten Ausgabeeinstellungen hat. |

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const String\&) method


Führt die Transformation mit dem durch die URI angegebenen Eingabedokument aus und gibt die Ergebnisse in einer Datei aus.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const String &resultsFile)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| inputUri | const String\& | Die URI des Eingabedokuments. |
| resultsFile | const String\& | Die URI der Ausgabedatei. |

## Siehe auch

* Class [String](../../../system/string/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
