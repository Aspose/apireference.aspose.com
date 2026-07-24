---
title: "Costruttore System::Xml::XmlTextReader::XmlTextReader"
linktitle: "XmlTextReader"
second_title: "Aspose.Page per C++"
description: "Costruttore System::Xml::XmlTextReader::XmlTextReader. Inizializza una nuova istanza della classe XmlTextReader con lo stream specificato in C++."
type: docs
weight: 100
url: /it/cpp/system.xml/xmltextreader/xmltextreader/
---
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::Stream\>\&) constructor


Inizializza una nuova istanza della classe [XmlTextReader](../) con lo stream specificato.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::Stream> &input)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | Lo stream contenente i dati XML da leggere. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


Inizializza una nuova istanza della classe [XmlTextReader](../) con lo stream specificato e [XmlNameTable](../../xmlnametable/).

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::Stream> &input, const SharedPtr<XmlNameTable> &nt)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | Lo stream contenente i dati XML da leggere. |
| nt | const SharedPtr\<XmlNameTable\>\& | [XmlNameTable](../../xmlnametable/) da utilizzare. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


Inizializza una nuova istanza della classe [XmlTextReader](../) con lo stream specificato, [XmlNodeType](../../xmlnodetype/) e [XmlParserContext](../../xmlparsercontext/).

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::Stream> &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| xmlFragment | const SharedPtr\<IO::Stream\>\& | Lo stream contenente il frammento XML da analizzare. |
| fragType | XmlNodeType | [XmlNodeType](../../xmlnodetype/) del frammento XML. Questo determina anche cosa può contenere il frammento. |
| context | const SharedPtr\<XmlParserContext\>\& | [XmlParserContext](../../xmlparsercontext/) in cui il **xmlFragment** deve essere analizzato. Include il [XmlNameTable](../../xmlnametable/) da utilizzare, la codifica, l'ambito dei namespace, l'attuale **xml:lang** e l'ambito **xml:space**. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::TextReader\>\&) constructor


Inizializza una nuova istanza della classe [XmlTextReader](../) con il TextReader specificato.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::TextReader> &input)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<IO::TextReader\>\& | Il TextReader contenente i dati XML da leggere. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


Inizializza una nuova istanza della classe [XmlTextReader](../) con il TextReader specificato e [XmlNameTable](../../xmlnametable/).

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::TextReader> &input, const SharedPtr<XmlNameTable> &nt)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const SharedPtr\<IO::TextReader\>\& | Il TextReader contenente i dati XML da leggere. |
| nt | const SharedPtr\<XmlNameTable\>\& | [XmlNameTable](../../xmlnametable/) da utilizzare. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&) constructor


Inizializza una nuova istanza della classe [XmlTextReader](../) con il file specificato.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| url | const String\& | L'URL del file contenente i dati XML. Il valore di [XmlTextReader::get_BaseURI](../get_baseuri/) è impostato a questo valore. |

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::Stream\>\&) constructor


Inizializza una nuova istanza della classe [XmlTextReader](../) con l'URL e lo stream specificati.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::Stream> &input)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| url | const String\& | L'URL da utilizzare per risolvere risorse esterne. Il [XmlTextReader::get_BaseURI](../get_baseuri/) è impostato su questo valore. |
| input | const SharedPtr\<IO::Stream\>\& | Lo stream contenente i dati XML da leggere. |

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


Inizializza una nuova istanza della classe [XmlTextReader](../) con l'URL, lo stream e il [XmlNameTable](../../xmlnametable/) specificati.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::Stream> &input, const SharedPtr<XmlNameTable> &nt)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| url | const String\& | L'URL da utilizzare per risolvere risorse esterne. Il [XmlTextReader::get_BaseURI](../get_baseuri/) è impostato su questo valore. Se **url** è **nullptr**, **BaseURI** è impostato su [String::Empty](../../../system/string/empty/). |
| input | const SharedPtr\<IO::Stream\>\& | Lo stream contenente i dati XML da leggere. |
| nt | const SharedPtr\<XmlNameTable\>\& | [XmlNameTable](../../xmlnametable/) da utilizzare. |

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::TextReader\>\&) constructor


Inizializza una nuova istanza della classe [XmlTextReader](../) con l'URL e il TextReader specificati.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::TextReader> &input)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| url | const String\& | L'URL da utilizzare per risolvere risorse esterne. Il [XmlTextReader::get_BaseURI](../get_baseuri/) è impostato su questo valore. |
| input | const SharedPtr\<IO::TextReader\>\& | Il TextReader contenente i dati XML da leggere. |

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


Inizializza una nuova istanza della classe [XmlTextReader](../) con l'URL, il TextReader e il [XmlNameTable](../../xmlnametable/) specificati.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::TextReader> &input, const SharedPtr<XmlNameTable> &nt)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| url | const String\& | L'URL da utilizzare per risolvere risorse esterne. Il [XmlTextReader::get_BaseURI](../get_baseuri/) è impostato su questo valore. Se **url** è **nullptr**, **BaseURI** è impostato su [String::Empty](../../../system/string/empty/). |
| input | const SharedPtr\<IO::TextReader\>\& | Il TextReader contenente i dati XML da leggere. |
| nt | const SharedPtr\<XmlNameTable\>\& | [XmlNameTable](../../xmlnametable/) da utilizzare. |

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<XmlNameTable\>\&) constructor


Inizializza una nuova istanza della classe [XmlTextReader](../) con il file e il [XmlNameTable](../../xmlnametable/) specificati.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<XmlNameTable> &nt)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| url | const String\& | L'URL del file contenente i dati XML da leggere. |
| nt | const SharedPtr\<XmlNameTable\>\& | [XmlNameTable](../../xmlnametable/) da utilizzare. |

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


Inizializza una nuova istanza della classe [XmlTextReader](../) con la stringa, il [XmlNodeType](../../xmlnodetype/) e il [XmlParserContext](../../xmlparsercontext/) specificati.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| xmlFragment | const String\& | La stringa contenente il frammento XML da analizzare. |
| fragType | XmlNodeType | Il [XmlNodeType](../../xmlnodetype/) del frammento XML. Questo determina anche ciò che la stringa del frammento può contenere. |
| context | const SharedPtr\<XmlParserContext\>\& | [XmlParserContext](../../xmlparsercontext/) in cui il **xmlFragment** deve essere analizzato. Include il [XmlNameTable](../../xmlnametable/) da utilizzare, la codifica, l'ambito dei namespace, l'attuale **xml:lang** e l'ambito **xml:space**. |

## Vedi anche

* Class [String](../../../system/string/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
