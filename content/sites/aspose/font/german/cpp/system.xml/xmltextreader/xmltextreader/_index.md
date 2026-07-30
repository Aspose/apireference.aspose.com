---
title: "System::Xml::XmlTextReader::XmlTextReader Konstruktor"
linktitle: "XmlTextReader"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlTextReader::XmlTextReader Konstruktor. Initialisiert eine neue Instanz der XmlTextReader-Klasse mit dem angegebenen Stream in C++."
type: docs
weight: 100
url: /de/cpp/system.xml/xmltextreader/xmltextreader/
---
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::Stream\>\&) constructor


Initialisiert eine neue Instanz der [XmlTextReader](../)-Klasse mit dem angegebenen Stream.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::Stream> &input)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const SharedPtr\<IO::Stream\>\& | Der Stream, der die zu lesenden XML-Daten enthält. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


Initialisiert eine neue Instanz der [XmlTextReader](../)-Klasse mit dem angegebenen Stream und der [XmlNameTable](../../xmlnametable/).

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::Stream> &input, const SharedPtr<XmlNameTable> &nt)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const SharedPtr\<IO::Stream\>\& | Der Stream, der die zu lesenden XML-Daten enthält. |
| nt | const SharedPtr\<XmlNameTable\>\& | Die zu verwendende [XmlNameTable](../../xmlnametable/). |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


Initialisiert eine neue Instanz der [XmlTextReader](../)-Klasse mit dem angegebenen Stream, dem [XmlNodeType](../../xmlnodetype/) und dem [XmlParserContext](../../xmlparsercontext/).

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::Stream> &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| xmlFragment | const SharedPtr\<IO::Stream\>\& | Der Stream, der das zu parsende XML-Fragment enthält. |
| fragType | XmlNodeType | Der [XmlNodeType](../../xmlnodetype/) des XML-Fragments. Dieser bestimmt auch, was das Fragment enthalten kann. |
| context | const SharedPtr\<XmlParserContext\>\& | Der [XmlParserContext](../../xmlparsercontext/), in dem das **xmlFragment** geparst werden soll. Dieser beinhaltet die zu verwendende [XmlNameTable](../../xmlnametable/), die Kodierung, den Namensraumbereich, das aktuelle **xml:lang** und den **xml:space**-Bereich. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::TextReader\>\&) constructor


Initialisiert eine neue Instanz der [XmlTextReader](../)-Klasse mit dem angegebenen TextReader.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::TextReader> &input)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const SharedPtr\<IO::TextReader\>\& | Der TextReader, der die zu lesenden XML-Daten enthält. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


Initialisiert eine neue Instanz der Klasse [XmlTextReader](../) mit dem angegebenen TextReader und [XmlNameTable](../../xmlnametable/).

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::TextReader> &input, const SharedPtr<XmlNameTable> &nt)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const SharedPtr\<IO::TextReader\>\& | Der TextReader, der die zu lesenden XML-Daten enthält. |
| nt | const SharedPtr\<XmlNameTable\>\& | Die zu verwendende [XmlNameTable](../../xmlnametable/). |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&) constructor


Initialisiert eine neue Instanz der Klasse [XmlTextReader](../) mit der angegebenen Datei.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| url | const String\& | Die URL für die Datei, die die XML-Daten enthält. Die [XmlTextReader::get_BaseURI](../get_baseuri/) wird auf diesen Wert gesetzt. |

## Siehe auch

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::Stream\>\&) constructor


Initialisiert eine neue Instanz der Klasse [XmlTextReader](../) mit der angegebenen URL und dem Stream.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::Stream> &input)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| url | const String\& | Die URL, die zum Auflösen externer Ressourcen verwendet wird. Die [XmlTextReader::get_BaseURI](../get_baseuri/) wird auf diesen Wert gesetzt. |
| Eingabe | const SharedPtr\<IO::Stream\>\& | Der Stream, der die zu lesenden XML-Daten enthält. |

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


Initialisiert eine neue Instanz der Klasse [XmlTextReader](../) mit der angegebenen URL, dem Stream und [XmlNameTable](../../xmlnametable/).

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::Stream> &input, const SharedPtr<XmlNameTable> &nt)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| url | const String\& | Die URL, die zum Auflösen externer Ressourcen verwendet wird. Die [XmlTextReader::get_BaseURI](../get_baseuri/) wird auf diesen Wert gesetzt. Wenn **url** **nullptr** ist, wird **BaseURI** auf [String::Empty](../../../system/string/empty/) gesetzt. |
| Eingabe | const SharedPtr\<IO::Stream\>\& | Der Stream, der die zu lesenden XML-Daten enthält. |
| nt | const SharedPtr\<XmlNameTable\>\& | Die zu verwendende [XmlNameTable](../../xmlnametable/). |

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::TextReader\>\&) constructor


Initialisiert eine neue Instanz der Klasse [XmlTextReader](../) mit der angegebenen URL und dem TextReader.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::TextReader> &input)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| url | const String\& | Die URL, die zum Auflösen externer Ressourcen verwendet wird. Die [XmlTextReader::get_BaseURI](../get_baseuri/) wird auf diesen Wert gesetzt. |
| Eingabe | const SharedPtr\<IO::TextReader\>\& | Der TextReader, der die zu lesenden XML-Daten enthält. |

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


Initialisiert eine neue Instanz der Klasse [XmlTextReader](../) mit der angegebenen URL, dem TextReader und [XmlNameTable](../../xmlnametable/).

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::TextReader> &input, const SharedPtr<XmlNameTable> &nt)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| url | const String\& | Die URL, die zum Auflösen externer Ressourcen verwendet wird. Die [XmlTextReader::get_BaseURI](../get_baseuri/) wird auf diesen Wert gesetzt. Wenn **url** **nullptr** ist, wird **BaseURI** auf [String::Empty](../../../system/string/empty/) gesetzt. |
| Eingabe | const SharedPtr\<IO::TextReader\>\& | Der TextReader, der die zu lesenden XML-Daten enthält. |
| nt | const SharedPtr\<XmlNameTable\>\& | Die zu verwendende [XmlNameTable](../../xmlnametable/). |

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<XmlNameTable\>\&) constructor


Initialisiert eine neue Instanz der Klasse [XmlTextReader](../) mit der angegebenen Datei und [XmlNameTable](../../xmlnametable/).

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<XmlNameTable> &nt)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| url | const String\& | Die URL für die Datei, die die zu lesenden XML-Daten enthält. |
| nt | const SharedPtr\<XmlNameTable\>\& | Die zu verwendende [XmlNameTable](../../xmlnametable/). |

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


Initialisiert eine neue Instanz der Klasse [XmlTextReader](../) mit dem angegebenen String, [XmlNodeType](../../xmlnodetype/) und [XmlParserContext](../../xmlparsercontext/).

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| xmlFragment | const String\& | Der String, der das zu parsende XML-Fragment enthält. |
| fragType | XmlNodeType | Der [XmlNodeType](../../xmlnodetype/) des XML-Fragments. Dies bestimmt auch, was der Fragment-String enthalten kann. |
| context | const SharedPtr\<XmlParserContext\>\& | Der [XmlParserContext](../../xmlparsercontext/), in dem das **xmlFragment** geparst werden soll. Dieser beinhaltet die zu verwendende [XmlNameTable](../../xmlnametable/), die Kodierung, den Namensraumbereich, das aktuelle **xml:lang** und den **xml:space**-Bereich. |

## Siehe auch

* Class [String](../../../system/string/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
