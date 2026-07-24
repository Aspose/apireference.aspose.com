---
title: "System::Xml::XmlTextReader::XmlTextReader constructor"
linktitle: "XmlTextReader"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlTextReader::XmlTextReader constructor. Initialiseert een nieuw exemplaar van de XmlTextReader-klasse met de opgegeven stream in C++."
type: docs
weight: 100
url: /nl/cpp/system.xml/xmltextreader/xmltextreader/
---
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::Stream\>\&) constructor


Initialiseert een nieuw exemplaar van de [XmlTextReader](../) klasse met de opgegeven stream.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::Stream> &input)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| invoer | const SharedPtr\<IO::Stream\>\& | De stream die de XML-gegevens bevat die gelezen moeten worden. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


Initialiseert een nieuw exemplaar van de [XmlTextReader](../) klasse met de opgegeven stream en [XmlNameTable](../../xmlnametable/).

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::Stream> &input, const SharedPtr<XmlNameTable> &nt)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| invoer | const SharedPtr\<IO::Stream\>\& | De stream die de XML-gegevens bevat die gelezen moeten worden. |
| nt | const SharedPtr\<XmlNameTable\>\& | De [XmlNameTable](../../xmlnametable/) die gebruikt moet worden. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


Initialiseert een nieuw exemplaar van de [XmlTextReader](../) klasse met de opgegeven stream, [XmlNodeType](../../xmlnodetype/), en [XmlParserContext](../../xmlparsercontext/).

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::Stream> &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| xmlFragment | const SharedPtr\<IO::Stream\>\& | De stream die het XML-fragment bevat dat moet worden geparseerd. |
| fragType | XmlNodeType | De [XmlNodeType](../../xmlnodetype/) van het XML-fragment. Dit bepaalt ook wat het fragment kan bevatten. |
| context | const SharedPtr\<XmlParserContext\>\& | De [XmlParserContext](../../xmlparsercontext/) waarin de **xmlFragment** moet worden geparseerd. Dit omvat de [XmlNameTable](../../xmlnametable/) die gebruikt moet worden, codering, namespace-bereik, de huidige **xml:lang**, en de **xml:space** scope. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::TextReader\>\&) constructor


Initialiseert een nieuw exemplaar van de [XmlTextReader](../) klasse met de opgegeven TextReader.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::TextReader> &input)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| invoer | const SharedPtr\<IO::TextReader\>\& | De TextReader die de XML-gegevens bevat die gelezen moeten worden. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


Initialiseert een nieuw exemplaar van de [XmlTextReader](../) klasse met de opgegeven TextReader en [XmlNameTable](../../xmlnametable/).

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::TextReader> &input, const SharedPtr<XmlNameTable> &nt)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| invoer | const SharedPtr\<IO::TextReader\>\& | De TextReader die de XML-gegevens bevat die gelezen moeten worden. |
| nt | const SharedPtr\<XmlNameTable\>\& | De [XmlNameTable](../../xmlnametable/) die gebruikt moet worden. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&) constructor


Initialiseert een nieuw exemplaar van de [XmlTextReader](../) klasse met het opgegeven bestand.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| url | const String\& | De URL voor het bestand dat de XML-gegevens bevat. De [XmlTextReader::get_BaseURI](../get_baseuri/) wordt op deze waarde ingesteld. |

## Zie ook

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::Stream\>\&) constructor


Initialiseert een nieuw exemplaar van de [XmlTextReader](../) klasse met de opgegeven URL en stream.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::Stream> &input)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| url | const String\& | De URL die gebruikt moet worden voor het oplossen van externe bronnen. De [XmlTextReader::get_BaseURI](../get_baseuri/) is ingesteld op deze waarde. |
| invoer | const SharedPtr\<IO::Stream\>\& | De stream die de XML-gegevens bevat die gelezen moeten worden. |

## Zie ook

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


Initialiseert een nieuw exemplaar van de [XmlTextReader](../) klasse met de opgegeven URL, stream en [XmlNameTable](../../xmlnametable/).

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::Stream> &input, const SharedPtr<XmlNameTable> &nt)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| url | const String\& | De URL die gebruikt moet worden voor het oplossen van externe bronnen. De [XmlTextReader::get_BaseURI](../get_baseuri/) is ingesteld op deze waarde. Als **url** **nullptr** is, wordt **BaseURI** ingesteld op [String::Empty](../../../system/string/empty/). |
| invoer | const SharedPtr\<IO::Stream\>\& | De stream die de XML-gegevens bevat die gelezen moeten worden. |
| nt | const SharedPtr\<XmlNameTable\>\& | De [XmlNameTable](../../xmlnametable/) die gebruikt moet worden. |

## Zie ook

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::TextReader\>\&) constructor


Initialiseert een nieuw exemplaar van de [XmlTextReader](../) klasse met de opgegeven URL en TextReader.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::TextReader> &input)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| url | const String\& | De URL die gebruikt moet worden voor het oplossen van externe bronnen. De [XmlTextReader::get_BaseURI](../get_baseuri/) is ingesteld op deze waarde. |
| invoer | const SharedPtr\<IO::TextReader\>\& | De TextReader die de XML-gegevens bevat die gelezen moeten worden. |

## Zie ook

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


Initialiseert een nieuw exemplaar van de [XmlTextReader](../) klasse met de opgegeven URL, TextReader en [XmlNameTable](../../xmlnametable/).

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::TextReader> &input, const SharedPtr<XmlNameTable> &nt)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| url | const String\& | De URL die gebruikt moet worden voor het oplossen van externe bronnen. De [XmlTextReader::get_BaseURI](../get_baseuri/) is ingesteld op deze waarde. Als **url** **nullptr** is, wordt **BaseURI** ingesteld op [String::Empty](../../../system/string/empty/). |
| invoer | const SharedPtr\<IO::TextReader\>\& | De TextReader die de XML-gegevens bevat die gelezen moeten worden. |
| nt | const SharedPtr\<XmlNameTable\>\& | De [XmlNameTable](../../xmlnametable/) die gebruikt moet worden. |

## Zie ook

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<XmlNameTable\>\&) constructor


Initialiseert een nieuw exemplaar van de [XmlTextReader](../) klasse met het opgegeven bestand en [XmlNameTable](../../xmlnametable/).

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<XmlNameTable> &nt)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| url | const String\& | De URL voor het bestand dat de XML-gegevens bevat die gelezen moeten worden. |
| nt | const SharedPtr\<XmlNameTable\>\& | De [XmlNameTable](../../xmlnametable/) die gebruikt moet worden. |

## Zie ook

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


Initialiseert een nieuw exemplaar van de [XmlTextReader](../) klasse met de opgegeven string, [XmlNodeType](../../xmlnodetype/), en [XmlParserContext](../../xmlparsercontext/).

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| xmlFragment | const String\& | De string die het XML-fragment bevat om te parseren. |
| fragType | XmlNodeType | Het [XmlNodeType](../../xmlnodetype/) van het XML-fragment. Dit bepaalt ook wat de fragmentstring kan bevatten. |
| context | const SharedPtr\<XmlParserContext\>\& | De [XmlParserContext](../../xmlparsercontext/) waarin de **xmlFragment** moet worden geparseerd. Dit omvat de [XmlNameTable](../../xmlnametable/) die gebruikt moet worden, codering, namespace-bereik, de huidige **xml:lang**, en de **xml:space** scope. |

## Zie ook

* Class [String](../../../system/string/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
