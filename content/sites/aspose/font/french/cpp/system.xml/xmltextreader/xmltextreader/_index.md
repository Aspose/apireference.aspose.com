---
title: "constructeur System::Xml::XmlTextReader::XmlTextReader"
linktitle: "XmlTextReader"
second_title: "Aspose.Font pour C++"
description: "constructeur System::Xml::XmlTextReader::XmlTextReader. Initialise une nouvelle instance de la classe XmlTextReader avec le flux spécifié en C++."
type: docs
weight: 100
url: /fr/cpp/system.xml/xmltextreader/xmltextreader/
---
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::Stream\>\&) constructor


Initialise une nouvelle instance de la classe [XmlTextReader](../) avec le flux spécifié.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::Stream> &input)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | Le flux contenant les données XML à lire. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


Initialise une nouvelle instance de la classe [XmlTextReader](../) avec le flux spécifié et le [XmlNameTable](../../xmlnametable/).

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::Stream> &input, const SharedPtr<XmlNameTable> &nt)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | Le flux contenant les données XML à lire. |
| nt | const SharedPtr\<XmlNameTable\>\& | Le [XmlNameTable](../../xmlnametable/) à utiliser. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


Initialise une nouvelle instance de la classe [XmlTextReader](../) avec le flux spécifié, le [XmlNodeType](../../xmlnodetype/) et le [XmlParserContext](../../xmlparsercontext/).

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::Stream> &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| xmlFragment | const SharedPtr\<IO::Stream\>\& | Le flux contenant le fragment XML à analyser. |
| fragType | XmlNodeType | Le [XmlNodeType](../../xmlnodetype/) du fragment XML. Cela détermine également ce que le fragment peut contenir. |
| context | const SharedPtr\<XmlParserContext\>\& | Le [XmlParserContext](../../xmlparsercontext/) dans lequel le **xmlFragment** doit être analysé. Cela inclut le [XmlNameTable](../../xmlnametable/) à utiliser, l'encodage, la portée des espaces de noms, le **xml:lang** actuel et la portée **xml:space**. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::TextReader\>\&) constructor


Initialise une nouvelle instance de la classe [XmlTextReader](../) avec le TextReader spécifié.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::TextReader> &input)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<IO::TextReader\>\& | Le TextReader contenant les données XML à lire. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


Initialise une nouvelle instance de la classe [XmlTextReader](../) avec le TextReader spécifié et le [XmlNameTable](../../xmlnametable/).

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::TextReader> &input, const SharedPtr<XmlNameTable> &nt)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<IO::TextReader\>\& | Le TextReader contenant les données XML à lire. |
| nt | const SharedPtr\<XmlNameTable\>\& | Le [XmlNameTable](../../xmlnametable/) à utiliser. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&) constructor


Initialise une nouvelle instance de la classe [XmlTextReader](../) avec le fichier spécifié.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| url | const String\& | L'URL du fichier contenant les données XML. Le [XmlTextReader::get_BaseURI](../get_baseuri/) est défini sur cette valeur. |

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::Stream\>\&) constructor


Initialise une nouvelle instance de la classe [XmlTextReader](../) avec l'URL et le flux spécifiés.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::Stream> &input)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| url | const String\& | L'URL à utiliser pour résoudre les ressources externes. Le [XmlTextReader::get_BaseURI](../get_baseuri/) est défini sur cette valeur. |
| input | const SharedPtr\<IO::Stream\>\& | Le flux contenant les données XML à lire. |

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


Initialise une nouvelle instance de la classe [XmlTextReader](../) avec l'URL, le flux et le [XmlNameTable](../../xmlnametable/) spécifiés.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::Stream> &input, const SharedPtr<XmlNameTable> &nt)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| url | const String\& | L'URL à utiliser pour résoudre les ressources externes. Le [XmlTextReader::get_BaseURI](../get_baseuri/) est défini sur cette valeur. Si **url** est **nullptr**, **BaseURI** est défini sur [String::Empty](../../../system/string/empty/). |
| input | const SharedPtr\<IO::Stream\>\& | Le flux contenant les données XML à lire. |
| nt | const SharedPtr\<XmlNameTable\>\& | Le [XmlNameTable](../../xmlnametable/) à utiliser. |

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::TextReader\>\&) constructor


Initialise une nouvelle instance de la classe [XmlTextReader](../) avec l'URL et le TextReader spécifiés.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::TextReader> &input)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| url | const String\& | L'URL à utiliser pour résoudre les ressources externes. Le [XmlTextReader::get_BaseURI](../get_baseuri/) est défini sur cette valeur. |
| input | const SharedPtr\<IO::TextReader\>\& | Le TextReader contenant les données XML à lire. |

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


Initialise une nouvelle instance de la classe [XmlTextReader](../) avec l'URL, le TextReader et le [XmlNameTable](../../xmlnametable/) spécifiés.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::TextReader> &input, const SharedPtr<XmlNameTable> &nt)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| url | const String\& | L'URL à utiliser pour résoudre les ressources externes. Le [XmlTextReader::get_BaseURI](../get_baseuri/) est défini sur cette valeur. Si **url** est **nullptr**, **BaseURI** est défini sur [String::Empty](../../../system/string/empty/). |
| input | const SharedPtr\<IO::TextReader\>\& | Le TextReader contenant les données XML à lire. |
| nt | const SharedPtr\<XmlNameTable\>\& | Le [XmlNameTable](../../xmlnametable/) à utiliser. |

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<XmlNameTable\>\&) constructor


Initialise une nouvelle instance de la classe [XmlTextReader](../) avec le fichier et le [XmlNameTable](../../xmlnametable/) spécifiés.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<XmlNameTable> &nt)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| url | const String\& | L'URL du fichier contenant les données XML à lire. |
| nt | const SharedPtr\<XmlNameTable\>\& | Le [XmlNameTable](../../xmlnametable/) à utiliser. |

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


Initialise une nouvelle instance de la classe [XmlTextReader](../) avec la chaîne spécifiée, le [XmlNodeType](../../xmlnodetype/) et le [XmlParserContext](../../xmlparsercontext/) spécifiés.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| xmlFragment | const String\& | La chaîne contenant le fragment XML à analyser. |
| fragType | XmlNodeType | Le [XmlNodeType](../../xmlnodetype/) du fragment XML. Cela détermine également ce que la chaîne du fragment peut contenir. |
| context | const SharedPtr\<XmlParserContext\>\& | Le [XmlParserContext](../../xmlparsercontext/) dans lequel le **xmlFragment** doit être analysé. Cela inclut le [XmlNameTable](../../xmlnametable/) à utiliser, l'encodage, la portée des espaces de noms, le **xml:lang** actuel et la portée **xml:space**. |

## Voir aussi

* Class [String](../../../system/string/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
