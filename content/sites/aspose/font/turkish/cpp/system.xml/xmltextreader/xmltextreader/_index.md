---
title: "System::Xml::XmlTextReader::XmlTextReader yapıcı"
linktitle: "XmlTextReader"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlTextReader::XmlTextReader yapıcı. Belirtilen akışla C++'da XmlTextReader sınıfının yeni bir örneğini başlatır."
type: docs
weight: 100
url: /tr/cpp/system.xml/xmltextreader/xmltextreader/
---
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::Stream\>\&) constructor


Belirtilen akışla [XmlTextReader](../) sınıfının yeni bir örneğini başlatır.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::Stream> &input)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| girdi | const SharedPtr\<IO::Stream\>\& | Okunacak XML verilerini içeren akış. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


Belirtilen akış ve [XmlNameTable](../../xmlnametable/) ile [XmlTextReader](../) sınıfının yeni bir örneğini başlatır.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::Stream> &input, const SharedPtr<XmlNameTable> &nt)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| girdi | const SharedPtr\<IO::Stream\>\& | Okunacak XML verilerini içeren akış. |
| nt | const SharedPtr\<XmlNameTable\>\& | Kullanılacak [XmlNameTable](../../xmlnametable/). |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


Belirtilen akış, [XmlNodeType](../../xmlnodetype/) ve [XmlParserContext](../../xmlparsercontext/) ile [XmlTextReader](../) sınıfının yeni bir örneğini başlatır.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::Stream> &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| xmlFragment | const SharedPtr\<IO::Stream\>\& | Ayrıştırılacak XML parçacığını içeren akış. |
| fragType | XmlNodeType | XML parçacığının [XmlNodeType](../../xmlnodetype/) değeri. Bu aynı zamanda parçacığın ne içerebileceğini belirler. |
| context | const SharedPtr\<XmlParserContext\>\& | [XmlParserContext](../../xmlparsercontext/) içinde **xmlFragment**'in ayrıştırılacağı ortam. Bu, kullanılacak [XmlNameTable](../../xmlnametable/), kodlama, ad alanı kapsamı, geçerli **xml:lang** ve **xml:space** kapsamını içerir. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::TextReader\>\&) constructor


Belirtilen TextReader ile [XmlTextReader](../) sınıfının yeni bir örneğini başlatır.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::TextReader> &input)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| girdi | const SharedPtr\<IO::TextReader\>\& | Okunacak XML verilerini içeren TextReader. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


Belirtilen TextReader ve [XmlNameTable](../../xmlnametable/) kullanarak yeni bir [XmlTextReader](../) sınıfı örneği başlatır.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::TextReader> &input, const SharedPtr<XmlNameTable> &nt)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| girdi | const SharedPtr\<IO::TextReader\>\& | Okunacak XML verilerini içeren TextReader. |
| nt | const SharedPtr\<XmlNameTable\>\& | Kullanılacak [XmlNameTable](../../xmlnametable/). |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&) constructor


Belirtilen dosya ile yeni bir [XmlTextReader](../) sınıfı örneği başlatır.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| url | const String\& | XML verilerini içeren dosyanın URL'si. [XmlTextReader::get_BaseURI](../get_baseuri/) bu değere ayarlanır. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::Stream\>\&) constructor


Belirtilen URL ve akış (stream) ile yeni bir [XmlTextReader](../) sınıfı örneği başlatır.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::Stream> &input)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| url | const String\& | Harici kaynakları çözümlemek için kullanılacak URL. [XmlTextReader::get_BaseURI](../get_baseuri/) bu değere ayarlanır. |
| girdi | const SharedPtr\<IO::Stream\>\& | Okunacak XML verilerini içeren akış. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


Belirtilen URL, akış (stream) ve [XmlNameTable](../../xmlnametable/) ile yeni bir [XmlTextReader](../) sınıfı örneği başlatır.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::Stream> &input, const SharedPtr<XmlNameTable> &nt)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| url | const String\& | Harici kaynakları çözümlemek için kullanılacak URL. [XmlTextReader::get_BaseURI](../get_baseuri/) bu değere ayarlanır. Eğer **url** **nullptr** ise, **BaseURI** [String::Empty](../../../system/string/empty/) olarak ayarlanır. |
| girdi | const SharedPtr\<IO::Stream\>\& | Okunacak XML verilerini içeren akış. |
| nt | const SharedPtr\<XmlNameTable\>\& | Kullanılacak [XmlNameTable](../../xmlnametable/). |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::TextReader\>\&) constructor


Belirtilen URL ve TextReader ile yeni bir [XmlTextReader](../) sınıfı örneği başlatır.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::TextReader> &input)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| url | const String\& | Harici kaynakları çözümlemek için kullanılacak URL. [XmlTextReader::get_BaseURI](../get_baseuri/) bu değere ayarlanır. |
| girdi | const SharedPtr\<IO::TextReader\>\& | Okunacak XML verilerini içeren TextReader. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


Belirtilen URL, TextReader ve [XmlNameTable](../../xmlnametable/) ile yeni bir [XmlTextReader](../) sınıfı örneği başlatır.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::TextReader> &input, const SharedPtr<XmlNameTable> &nt)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| url | const String\& | Harici kaynakları çözümlemek için kullanılacak URL. [XmlTextReader::get_BaseURI](../get_baseuri/) bu değere ayarlanır. Eğer **url** **nullptr** ise, **BaseURI** [String::Empty](../../../system/string/empty/) olarak ayarlanır. |
| girdi | const SharedPtr\<IO::TextReader\>\& | Okunacak XML verilerini içeren TextReader. |
| nt | const SharedPtr\<XmlNameTable\>\& | Kullanılacak [XmlNameTable](../../xmlnametable/). |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<XmlNameTable\>\&) constructor


Belirtilen dosya ve [XmlNameTable](../../xmlnametable/) ile yeni bir [XmlTextReader](../) sınıfı örneği başlatır.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<XmlNameTable> &nt)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| url | const String\& | Okunacak XML verilerini içeren dosyanın URL'si. |
| nt | const SharedPtr\<XmlNameTable\>\& | Kullanılacak [XmlNameTable](../../xmlnametable/). |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


Belirtilen string, [XmlNodeType](../../xmlnodetype/) ve [XmlParserContext](../../xmlparsercontext/) ile yeni bir [XmlTextReader](../) sınıfı örneği başlatır.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| xmlFragment | const String\& | Ayrıştırılacak XML parçacığını içeren string. |
| fragType | XmlNodeType | XML parçacığının [XmlNodeType](../../xmlnodetype/). Bu aynı zamanda parçacık stringinin ne içerebileceğini belirler. |
| context | const SharedPtr\<XmlParserContext\>\& | [XmlParserContext](../../xmlparsercontext/) içinde **xmlFragment**'in ayrıştırılacağı ortam. Bu, kullanılacak [XmlNameTable](../../xmlnametable/), kodlama, ad alanı kapsamı, geçerli **xml:lang** ve **xml:space** kapsamını içerir. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
