---
title: "System::Xml::Xsl::XslCompiledTransform::Transform metodo"
linktitle: "Trasformazione"
second_title: "Aspose.Font per C++"
description: "System::Xml::Xsl::XslCompiledTransform::Transform metodo. Esegue la trasformazione utilizzando il documento di input specificato dall'oggetto IXPathNavigable e restituisce i risultati a un XmlWriter in C++."
type: docs
weight: 400
url: /it/cpp/system.xml.xsl/xslcompiledtransform/transform/
---
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XmlWriter\>\&) method


Esegue la trasformazione utilizzando il documento di input specificato dall'oggetto IXPathNavigable e restituisce i risultati a un [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XmlWriter> &results)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Un oggetto che implementa l'interfaccia IXPathNavigable. Può essere un [XmlNode](../../../system.xml/xmlnode/) (tipicamente un [XmlDocument](../../../system.xml/xmldocument/)), oppure un XPathDocument contenente i dati da trasformare. |
| results | const SharedPtr\<XmlWriter\>\& | Il [XmlWriter](../../../system.xml/xmlwriter/) a cui desideri scrivere. Se il foglio di stile contiene un elemento **xsl:output**, dovresti creare il [XmlWriter](../../../system.xml/xmlwriter/) utilizzando l'oggetto [XmlWriterSettings](../../../system.xml/xmlwritersettings/) restituito dal valore [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). Questo garantisce che il [XmlWriter](../../../system.xml/xmlwriter/) abbia le impostazioni di output corrette. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


Esegue la trasformazione utilizzando il documento di input specificato dall'oggetto IXPathNavigable e restituisce i risultati a un flusso. Il [XsltArgumentList](../../xsltargumentlist/) fornisce argomenti di runtime aggiuntivi.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Un oggetto che implementa l'interfaccia IXPathNavigable. Può essere un [XmlNode](../../../system.xml/xmlnode/) (tipicamente un [XmlDocument](../../../system.xml/xmldocument/)), oppure un XPathDocument contenente i dati da trasformare. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Un [XsltArgumentList](../../xsltargumentlist/) contenente gli argomenti qualificati per namespace usati come input per la trasformazione. Questo valore può essere **nullptr**. |
| risultati | const SharedPtr\<IO::Stream\>\& | Il flusso su cui si desidera scrivere l'output. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


Esegue la trasformazione utilizzando il documento di input specificato dall'oggetto IXPathNavigable e restituisce i risultati a un TextWriter. Il [XsltArgumentList](../../xsltargumentlist/) fornisce argomenti di runtime aggiuntivi.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Un oggetto che implementa l'interfaccia IXPathNavigable. Può essere un [XmlNode](../../../system.xml/xmlnode/) (tipicamente un [XmlDocument](../../../system.xml/xmldocument/)), oppure un XPathDocument contenente i dati da trasformare. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Un [XsltArgumentList](../../xsltargumentlist/) contenente gli argomenti qualificati per namespace usati come input per la trasformazione. Questo valore può essere **nullptr**. |
| risultati | const SharedPtr\<IO::TextWriter\>\& | Il TextWriter su cui si desidera scrivere l'output. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


Esegue la trasformazione utilizzando il documento di input specificato dall'oggetto IXPathNavigable e restituisce i risultati a un [XmlWriter](../../../system.xml/xmlwriter/). Il [XsltArgumentList](../../xsltargumentlist/) fornisce argomenti di runtime aggiuntivi.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Un oggetto che implementa l'interfaccia IXPathNavigable. Può essere un [XmlNode](../../../system.xml/xmlnode/) (tipicamente un [XmlDocument](../../../system.xml/xmldocument/)), oppure un XPathDocument contenente i dati da trasformare. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Un [XsltArgumentList](../../xsltargumentlist/) contenente gli argomenti qualificati per namespace usati come input per la trasformazione. Questo valore può essere **nullptr**. |
| results | const SharedPtr\<XmlWriter\>\& | Il [XmlWriter](../../../system.xml/xmlwriter/) a cui desideri scrivere. Se il foglio di stile contiene un elemento **xsl:output**, dovresti creare il [XmlWriter](../../../system.xml/xmlwriter/) utilizzando l'oggetto [XmlWriterSettings](../../../system.xml/xmlwritersettings/) restituito dal valore [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). Questo garantisce che il [XmlWriter](../../../system.xml/xmlwriter/) abbia le impostazioni di output corrette. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) method


Esegue la trasformazione utilizzando il documento di input specificato dall'oggetto IXPathNavigable e restituisce i risultati a un [XmlWriter](../../../system.xml/xmlwriter/). Il [XsltArgumentList](../../xsltargumentlist/) fornisce argomenti di runtime aggiuntivi e il [XmlResolver](../../../system.xml/xmlresolver/) risolve la funzione XSLT **document()**.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results, const SharedPtr<XmlResolver> &documentResolver)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Il documento da trasformare specificato dall'oggetto IXPathNavigable. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Elenco degli argomenti come [XsltArgumentList](../../xsltargumentlist/). |
| results | const SharedPtr\<XmlWriter\>\& | Il [XmlWriter](../../../system.xml/xmlwriter/) su cui desideri scrivere l'output. Se il foglio di stile contiene un elemento **xsl:output**, dovresti creare il [XmlWriter](../../../system.xml/xmlwriter/) utilizzando l'oggetto [XmlWriterSettings](../../../system.xml/xmlwritersettings/) restituito dal valore [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). Questo garantisce che il [XmlWriter](../../../system.xml/xmlwriter/) abbia le impostazioni di output corrette. |
| documentResolver | const SharedPtr\<XmlResolver\>\& | Il [XmlResolver](../../../system.xml/xmlresolver/) utilizzato per risolvere la funzione XSLT **document()**. Se è **nullptr**, la funzione **document()** non viene risolta. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XmlWriter\>\&) method


Esegue la trasformazione utilizzando il documento di input specificato dall'oggetto [XmlReader](../../../system.xml/xmlreader/) e produce i risultati in un [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XmlWriter> &results)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | Il [XmlReader](../../../system.xml/xmlreader/) contenente il documento di input. |
| results | const SharedPtr\<XmlWriter\>\& | Il [XmlWriter](../../../system.xml/xmlwriter/) a cui desideri scrivere. Se il foglio di stile contiene un elemento **xsl:output**, dovresti creare il [XmlWriter](../../../system.xml/xmlwriter/) utilizzando l'oggetto [XmlWriterSettings](../../../system.xml/xmlwritersettings/) restituito dal valore [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). Questo garantisce che il [XmlWriter](../../../system.xml/xmlwriter/) abbia le impostazioni di output corrette. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


Esegue la trasformazione utilizzando il documento di input specificato dall'oggetto [XmlReader](../../../system.xml/xmlreader/) e produce i risultati in uno stream. Il [XsltArgumentList](../../xsltargumentlist/) fornisce argomenti di runtime aggiuntivi.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | Un [XmlReader](../../../system.xml/xmlreader/) contenente il documento di input. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Un [XsltArgumentList](../../xsltargumentlist/) contenente gli argomenti qualificati per namespace usati come input per la trasformazione. Questo valore può essere **nullptr**. |
| risultati | const SharedPtr\<IO::Stream\>\& | Il flusso su cui si desidera scrivere l'output. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


Esegue la trasformazione utilizzando il documento di input specificato dall'oggetto [XmlReader](../../../system.xml/xmlreader/) e produce i risultati in un TextWriter. Il [XsltArgumentList](../../xsltargumentlist/) fornisce argomenti di runtime aggiuntivi.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | Un [XmlReader](../../../system.xml/xmlreader/) contenente il documento di input. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Un [XsltArgumentList](../../xsltargumentlist/) contenente gli argomenti qualificati per namespace usati come input per la trasformazione. Questo valore può essere **nullptr**. |
| risultati | const SharedPtr\<IO::TextWriter\>\& | Il TextWriter su cui si desidera scrivere l'output. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


Esegue la trasformazione utilizzando il documento di input specificato dall'oggetto [XmlReader](../../../system.xml/xmlreader/) e produce i risultati in un [XmlWriter](../../../system.xml/xmlwriter/). Il [XsltArgumentList](../../xsltargumentlist/) fornisce argomenti di runtime aggiuntivi.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | Un [XmlReader](../../../system.xml/xmlreader/) contenente il documento di input. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Un [XsltArgumentList](../../xsltargumentlist/) contenente gli argomenti qualificati per namespace usati come input per la trasformazione. Questo valore può essere **nullptr**. |
| results | const SharedPtr\<XmlWriter\>\& | Il [XmlWriter](../../../system.xml/xmlwriter/) a cui desideri scrivere. Se il foglio di stile contiene un elemento **xsl:output**, dovresti creare il [XmlWriter](../../../system.xml/xmlwriter/) utilizzando l'oggetto [XmlWriterSettings](../../../system.xml/xmlwritersettings/) restituito dal valore [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). Questo garantisce che il [XmlWriter](../../../system.xml/xmlwriter/) abbia le impostazioni di output corrette. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) method


Esegue la trasformazione utilizzando il documento di input specificato dall'oggetto [XmlReader](../../../system.xml/xmlreader/) e produce i risultati in un [XmlWriter](../../../system.xml/xmlwriter/). Il [XsltArgumentList](../../xsltargumentlist/) fornisce argomenti di runtime aggiuntivi e il [XmlResolver](../../../system.xml/xmlresolver/) risolve la funzione XSLT **document()**.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results, const SharedPtr<XmlResolver> &documentResolver)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | Un [XmlReader](../../../system.xml/xmlreader/) contenente il documento di input. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Un [XsltArgumentList](../../xsltargumentlist/) contenente gli argomenti qualificati per namespace usati come input per la trasformazione. Questo valore può essere **nullptr**. |
| results | const SharedPtr\<XmlWriter\>\& | Il [XmlWriter](../../../system.xml/xmlwriter/) a cui desideri scrivere. Se il foglio di stile contiene un elemento **xsl:output**, dovresti creare il [XmlWriter](../../../system.xml/xmlwriter/) utilizzando l'oggetto [XmlWriterSettings](../../../system.xml/xmlwritersettings/) restituito dal valore [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). Questo garantisce che il [XmlWriter](../../../system.xml/xmlwriter/) abbia le impostazioni di output corrette. |
| documentResolver | const SharedPtr\<XmlResolver\>\& | Il [XmlResolver](../../../system.xml/xmlresolver/) utilizzato per risolvere la funzione XSLT **document()**. Se è **nullptr**, la funzione **document()** non viene risolta. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XmlWriter\>\&) method


Esegue la trasformazione utilizzando il documento di input specificato dall'URI e produce i risultati in un [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XmlWriter> &results)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| inputUri | const String\& | L'URI del documento di input. |
| results | const SharedPtr\<XmlWriter\>\& | Il [XmlWriter](../../../system.xml/xmlwriter/) a cui desideri scrivere. Se il foglio di stile contiene un elemento **xsl:output**, dovresti creare il [XmlWriter](../../../system.xml/xmlwriter/) utilizzando l'oggetto [XmlWriterSettings](../../../system.xml/xmlwritersettings/) restituito dal valore [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). Questo garantisce che il [XmlWriter](../../../system.xml/xmlwriter/) abbia le impostazioni di output corrette. |

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


Esegue la trasformazione utilizzando il documento di input specificato dall'URI e produce i risultati in uno stream. Il [XsltArgumentList](../../xsltargumentlist/) fornisce argomenti di runtime aggiuntivi.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| inputUri | const String\& | L'URI del documento di input. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Un [XsltArgumentList](../../xsltargumentlist/) contenente gli argomenti qualificati per namespace usati come input per la trasformazione. Questo valore può essere **nullptr**. |
| risultati | const SharedPtr\<IO::Stream\>\& | Il flusso su cui si desidera scrivere l'output. |

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


Esegue la trasformazione utilizzando il documento di input specificato dall'URI e scrive i risultati in un TextWriter.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| inputUri | const String\& | L'URI del documento di input. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Un [XsltArgumentList](../../xsltargumentlist/) contenente gli argomenti qualificati per namespace usati come input per la trasformazione. Questo valore può essere **nullptr**. |
| risultati | const SharedPtr\<IO::TextWriter\>\& | Il TextWriter su cui si desidera scrivere l'output. |

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


Esegue la trasformazione utilizzando il documento di input specificato dall'URI e produce i risultati in un [XmlWriter](../../../system.xml/xmlwriter/). Il [XsltArgumentList](../../xsltargumentlist/) fornisce argomenti di runtime aggiuntivi.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| inputUri | const String\& | L'URI del documento di input. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Un [XsltArgumentList](../../xsltargumentlist/) contenente gli argomenti qualificati per namespace usati come input per la trasformazione. Questo valore può essere **nullptr**. |
| results | const SharedPtr\<XmlWriter\>\& | Il [XmlWriter](../../../system.xml/xmlwriter/) a cui desideri scrivere. Se il foglio di stile contiene un elemento **xsl:output**, dovresti creare il [XmlWriter](../../../system.xml/xmlwriter/) utilizzando l'oggetto [XmlWriterSettings](../../../system.xml/xmlwritersettings/) restituito dal valore [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). Questo garantisce che il [XmlWriter](../../../system.xml/xmlwriter/) abbia le impostazioni di output corrette. |

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const String\&) method


Esegue la trasformazione utilizzando il documento di input specificato dall'URI e scrive i risultati in un file.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const String &resultsFile)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| inputUri | const String\& | L'URI del documento di input. |
| resultsFile | const String\& | L'URI del file di output. |

## Vedi anche

* Class [String](../../../system/string/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
