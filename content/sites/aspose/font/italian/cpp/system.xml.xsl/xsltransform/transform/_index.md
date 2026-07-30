---
title: "Metodo System::Xml::Xsl::XslTransform::Transform"
linktitle: "Trasformazione"
second_title: "Aspose.Font per C++"
description: "Metodo System::Xml::Xsl::XslTransform::Transform. Trasforma i dati XML nell'IXPathNavigable usando gli **args** specificati e restituisce il risultato a un XmlReader in C++."
type: docs
weight: 400
url: /it/cpp/system.xml.xsl/xsltransform/transform/
---
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&) method


Trasforma i dati XML nell'IXPathNavigable usando gli **args** specificati e restituisce il risultato a un [XmlReader](../../../system.xml/xmlreader/).

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Un oggetto che implementa l'interfaccia IXPathNavigable. Può essere un [XmlNode](../../../system.xml/xmlnode/) (tipicamente un [XmlDocument](../../../system.xml/xmldocument/)), oppure un XPathDocument contenente i dati da trasformare. |
| args | const SharedPtr\<XsltArgumentList\>\& | Un [XsltArgumentList](../../xsltargumentlist/) contenente gli argomenti qualificati per namespace usati come input per la trasformazione. |

### ReturnValue

Un [XmlReader](../../../system.xml/xmlreader/) contenente i risultati della trasformazione.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


Trasforma i dati XML nell'IXPathNavigable usando i **args** specificati e restituisce il risultato a uno Stream.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Un oggetto che implementa l'interfaccia IXPathNavigable. Può essere un [XmlNode](../../../system.xml/xmlnode/) (tipicamente un [XmlDocument](../../../system.xml/xmldocument/)), oppure un XPathDocument contenente i dati da trasformare. |
| args | const SharedPtr\<XsltArgumentList\>\& | Un [XsltArgumentList](../../xsltargumentlist/) contenente gli argomenti qualificati per namespace usati come input per la trasformazione. |
| output | const SharedPtr\<IO::Stream\>\& | Il flusso su cui si desidera scrivere l'output. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Trasforma i dati XML nell'IXPathNavigable usando i **args** specificati e restituisce il risultato a uno Stream.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Un oggetto che implementa l'interfaccia IXPathNavigable. Può essere un [XmlNode](../../../system.xml/xmlnode/) (tipicamente un [XmlDocument](../../../system.xml/xmldocument/)), oppure un XPathDocument contenente i dati da trasformare. |
| args | const SharedPtr\<XsltArgumentList\>\& | Un [XsltArgumentList](../../xsltargumentlist/) contenente gli argomenti qualificati per namespace usati come input per la trasformazione. |
| output | const SharedPtr\<IO::Stream\>\& | Il flusso su cui si desidera scrivere l'output. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Il [XmlResolver](../../../system.xml/xmlresolver/) usato per risolvere la funzione XSLT **document()**. Se è **nullptr**, la funzione **document()** non viene risolta. Il [XmlResolver](../../../system.xml/xmlresolver/) non viene memorizzato nella cache dopo il completamento del metodo [XslTransform::Transform](./). |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


Trasforma i dati XML nell'IXPathNavigable usando i **args** specificati e restituisce il risultato a un TextWriter.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Un oggetto che implementa l'interfaccia IXPathNavigable. Può essere un [XmlNode](../../../system.xml/xmlnode/) (tipicamente un [XmlDocument](../../../system.xml/xmldocument/)), oppure un XPathDocument contenente i dati da trasformare. |
| args | const SharedPtr\<XsltArgumentList\>\& | Un [XsltArgumentList](../../xsltargumentlist/) contenente gli argomenti qualificati per namespace usati come input per la trasformazione. |
| output | const SharedPtr\<IO::TextWriter\>\& | Il TextWriter su cui si desidera scrivere l'output. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Trasforma i dati XML nell'IXPathNavigable usando i **args** specificati e restituisce il risultato a un TextWriter.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Un oggetto che implementa l'interfaccia IXPathNavigable. Può essere un [XmlNode](../../../system.xml/xmlnode/) (tipicamente un [XmlDocument](../../../system.xml/xmldocument/)), oppure un XPathDocument contenente i dati da trasformare. |
| args | const SharedPtr\<XsltArgumentList\>\& | Un [XsltArgumentList](../../xsltargumentlist/) contenente gli argomenti qualificati per namespace usati come input per la trasformazione. |
| output | const SharedPtr\<IO::TextWriter\>\& | Il TextWriter su cui si desidera scrivere l'output. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Il [XmlResolver](../../../system.xml/xmlresolver/) usato per risolvere la funzione XSLT **document()**. Se è **nullptr**, la funzione **document()** non viene risolta. Il [XmlResolver](../../../system.xml/xmlresolver/) non viene memorizzato nella cache dopo il completamento di questo metodo. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Trasforma i dati XML nell'IXPathNavigable usando gli **args** specificati e restituisce il risultato a un [XmlReader](../../../system.xml/xmlreader/).

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Un oggetto che implementa l'interfaccia IXPathNavigable. Può essere un [XmlNode](../../../system.xml/xmlnode/) (tipicamente un [XmlDocument](../../../system.xml/xmldocument/)), oppure un XPathDocument contenente i dati da trasformare. |
| args | const SharedPtr\<XsltArgumentList\>\& | Un [XsltArgumentList](../../xsltargumentlist/) contenente gli argomenti qualificati per namespace usati come input per la trasformazione. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Il [XmlResolver](../../../system.xml/xmlresolver/) usato per risolvere la funzione XSLT **document()**. Se è **nullptr**, la funzione **document()** non viene risolta. Il [XmlResolver](../../../system.xml/xmlresolver/) non viene memorizzato nella cache dopo il completamento di questo metodo. |

### ReturnValue

Un [XmlReader](../../../system.xml/xmlreader/) contenente i risultati della trasformazione.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


Trasforma i dati XML nell'IXPathNavigable usando gli **args** specificati e restituisce il risultato a un [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Un oggetto che implementa l'interfaccia IXPathNavigable. Può essere un [XmlNode](../../../system.xml/xmlnode/) (tipicamente un [XmlDocument](../../../system.xml/xmldocument/)), oppure un XPathDocument contenente i dati da trasformare. |
| args | const SharedPtr\<XsltArgumentList\>\& | Un [XsltArgumentList](../../xsltargumentlist/) contenente gli argomenti qualificati per namespace usati come input per la trasformazione. |
| output | const SharedPtr\<XmlWriter\>\& | Il [XmlWriter](../../../system.xml/xmlwriter/) su cui si desidera scrivere l'output. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Trasforma i dati XML nell'IXPathNavigable usando gli **args** specificati e restituisce il risultato a un [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Un oggetto che implementa l'interfaccia IXPathNavigable. Può essere un [XmlNode](../../../system.xml/xmlnode/) (tipicamente un [XmlDocument](../../../system.xml/xmldocument/)), oppure un XPathDocument contenente i dati da trasformare. |
| args | const SharedPtr\<XsltArgumentList\>\& | Un [XsltArgumentList](../../xsltargumentlist/) contenente gli argomenti qualificati per namespace usati come input per la trasformazione. |
| output | const SharedPtr\<XmlWriter\>\& | Il [XmlWriter](../../../system.xml/xmlwriter/) su cui si desidera scrivere l'output. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Il [XmlResolver](../../../system.xml/xmlresolver/) usato per risolvere la funzione XSLT **document()**. Se è **nullptr**, la funzione **document()** non viene risolta. Il [XmlResolver](../../../system.xml/xmlresolver/) non viene memorizzato nella cache dopo il completamento di questo metodo. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&) method


Trasforma i dati XML nel XPathNavigator usando gli **args** specificati e restituisce il risultato a un [XmlReader](../../../system.xml/xmlreader/).

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Un XPathNavigator contenente i dati da trasformare. |
| args | const SharedPtr\<XsltArgumentList\>\& | Un [XsltArgumentList](../../xsltargumentlist/) contenente gli argomenti qualificati per namespace usati come input per la trasformazione. |

### ReturnValue

Un [XmlReader](../../../system.xml/xmlreader/) contenente i risultati della trasformazione.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


Trasforma i dati XML nel XPathNavigator usando i **args** specificati e restituisce il risultato a uno Stream.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Un XPathNavigator contenente i dati da trasformare. |
| args | const SharedPtr\<XsltArgumentList\>\& | Un [XsltArgumentList](../../xsltargumentlist/) contenente gli argomenti qualificati per namespace usati come input per la trasformazione. |
| output | const SharedPtr\<IO::Stream\>\& | Il flusso su cui si desidera scrivere l'output. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Trasforma i dati XML nel XPathNavigator usando i **args** specificati e restituisce il risultato a uno Stream.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Un XPathNavigator contenente i dati da trasformare. |
| args | const SharedPtr\<XsltArgumentList\>\& | Un [XsltArgumentList](../../xsltargumentlist/) contenente gli argomenti qualificati per namespace usati come input per la trasformazione. |
| output | const SharedPtr\<IO::Stream\>\& | Il flusso su cui si desidera scrivere l'output. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Il [XmlResolver](../../../system.xml/xmlresolver/) usato per risolvere la funzione XSLT **document()**. Se è **nullptr**, la funzione **document()** non viene risolta. Il [XmlResolver](../../../system.xml/xmlresolver/) non viene memorizzato nella cache dopo il completamento di questo metodo. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


Trasforma i dati XML nel XPathNavigator usando i **args** specificati e restituisce il risultato a un TextWriter.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Un XPathNavigator contenente i dati da trasformare. |
| args | const SharedPtr\<XsltArgumentList\>\& | Un [XsltArgumentList](../../xsltargumentlist/) contenente gli argomenti qualificati per namespace usati come input per la trasformazione. |
| output | const SharedPtr\<IO::TextWriter\>\& | Il TextWriter su cui si desidera scrivere l'output. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Trasforma i dati XML nel XPathNavigator usando i **args** specificati e restituisce il risultato a un TextWriter.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Un XPathNavigator contenente i dati da trasformare. |
| args | const SharedPtr\<XsltArgumentList\>\& | Un [XsltArgumentList](../../xsltargumentlist/) contenente gli argomenti qualificati per namespace usati come input per la trasformazione. |
| output | const SharedPtr\<IO::TextWriter\>\& | Il TextWriter su cui si desidera scrivere l'output. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Il [XmlResolver](../../../system.xml/xmlresolver/) usato per risolvere la funzione XSLT **document()**. Se è **nullptr**, la funzione **document()** non viene risolta. Il [XmlResolver](../../../system.xml/xmlresolver/) non viene memorizzato nella cache dopo il completamento di questo metodo. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Trasforma i dati XML nel XPathNavigator usando gli **args** specificati e restituisce il risultato a un [XmlReader](../../../system.xml/xmlreader/).

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Un XPathNavigator contenente i dati da trasformare. |
| args | const SharedPtr\<XsltArgumentList\>\& | Un [XsltArgumentList](../../xsltargumentlist/) contenente gli argomenti qualificati per namespace usati come input per la trasformazione. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Il [XmlResolver](../../../system.xml/xmlresolver/) usato per risolvere la funzione XSLT **document()**. Se è **nullptr**, la funzione **document()** non viene risolta. Il [XmlResolver](../../../system.xml/xmlresolver/) non viene memorizzato nella cache dopo il completamento di questo metodo. |

### ReturnValue

Un [XmlReader](../../../system.xml/xmlreader/) contenente i risultati della trasformazione.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


Trasforma i dati XML nel XPathNavigator usando gli args specificati e restituisce il risultato a un [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Un XPathNavigator contenente i dati da trasformare. |
| args | const SharedPtr\<XsltArgumentList\>\& | Un [XsltArgumentList](../../xsltargumentlist/) contenente gli argomenti qualificati per namespace usati come input per la trasformazione. |
| output | const SharedPtr\<XmlWriter\>\& | Il [XmlWriter](../../../system.xml/xmlwriter/) su cui si desidera scrivere l'output. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Trasforma i dati XML nel XPathNavigator usando gli args specificati e restituisce il risultato a un [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Un XPathNavigator contenente i dati da trasformare. |
| args | const SharedPtr\<XsltArgumentList\>\& | Un [XsltArgumentList](../../xsltargumentlist/) contenente gli argomenti qualificati per namespace usati come input per la trasformazione. |
| output | const SharedPtr\<XmlWriter\>\& | Il [XmlWriter](../../../system.xml/xmlwriter/) su cui si desidera scrivere l'output. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Il [XmlResolver](../../../system.xml/xmlresolver/) usato per risolvere la funzione XSLT **document()**. Se è **nullptr**, la funzione **document()** non viene risolta. Il [XmlResolver](../../../system.xml/xmlresolver/) non viene memorizzato nella cache dopo il completamento di questo metodo. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const String\&, const String\&) method


Trasforma i dati XML nel file di input e restituisce il risultato in un file di output.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const String &inputfile, const String &outputfile)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| inputfile | const String\& | L'URL del documento sorgente da trasformare. |
| outputfile | const String\& | L'URL del file di output. |

## Vedi anche

* Class [String](../../../system/string/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const String\&, const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Trasforma i dati XML nel file di input e restituisce il risultato in un file di output.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const String &inputfile, const String &outputfile, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| inputfile | const String\& | L'URL del documento sorgente da trasformare. |
| outputfile | const String\& | L'URL del file di output. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Il [XmlResolver](../../../system.xml/xmlresolver/) usato per risolvere la funzione XSLT **document()**. Se è **nullptr**, la funzione **document()** non viene risolta. Il [XmlResolver](../../../system.xml/xmlresolver/) non viene memorizzato nella cache dopo il completamento del metodo [XslTransform::Transform](./). |

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
