---
title: "System::Xml::XmlTextReader::XmlTextReader コンストラクタ"
linktitle: "XmlTextReader"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlTextReader::XmlTextReader コンストラクタ。指定されたストリームで XmlTextReader クラスの新しいインスタンスを初期化します。C++ 用です。"
type: docs
weight: 100
url: /ja/cpp/system.xml/xmltextreader/xmltextreader/
---
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::Stream\>\&) constructor


指定されたストリームで [XmlTextReader](../) クラスの新しいインスタンスを初期化します。

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::Stream> &input)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const SharedPtr\<IO::Stream\>\& | XML データを読み取るストリームです。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


指定されたストリームと [XmlNameTable](../../xmlnametable/) を使用して [XmlTextReader](../) クラスの新しいインスタンスを初期化します。

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::Stream> &input, const SharedPtr<XmlNameTable> &nt)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const SharedPtr\<IO::Stream\>\& | XML データを読み取るストリームです。 |
| nt | const SharedPtr\<XmlNameTable\>\& | 使用する [XmlNameTable](../../xmlnametable/)。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


指定されたストリーム、[XmlNodeType](../../xmlnodetype/)、および [XmlParserContext](../../xmlparsercontext/) を使用して [XmlTextReader](../) クラスの新しいインスタンスを初期化します。

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::Stream> &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| xmlFragment | const SharedPtr\<IO::Stream\>\& | 解析する XML フラグメントを含むストリームです。 |
| fragType | XmlNodeType | XML フラグメントの [XmlNodeType](../../xmlnodetype/)。これによりフラグメントが含めることのできる内容も決まります。 |
| context | const SharedPtr\<XmlParserContext\>\& | **xmlFragment** を解析する [XmlParserContext](../../xmlparsercontext/)。これには使用する [XmlNameTable](../../xmlnametable/)、エンコーディング、名前空間スコープ、現在の **xml:lang**、および **xml:space** スコープが含まれます。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::TextReader\>\&) constructor


指定された TextReader で [XmlTextReader](../) クラスの新しいインスタンスを初期化します。

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::TextReader> &input)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const SharedPtr\<IO::TextReader\>\& | XML データを読み取る TextReader です。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


指定された TextReader と [XmlNameTable](../../xmlnametable/) を使用して [XmlTextReader](../) クラスの新しいインスタンスを初期化します。

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::TextReader> &input, const SharedPtr<XmlNameTable> &nt)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const SharedPtr\<IO::TextReader\>\& | XML データを読み取る TextReader です。 |
| nt | const SharedPtr\<XmlNameTable\>\& | 使用する [XmlNameTable](../../xmlnametable/)。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&) constructor


指定されたファイルで [XmlTextReader](../) クラスの新しいインスタンスを初期化します。

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| url | const String\& | XML データを含むファイルの URL。[XmlTextReader::get_BaseURI](../get_baseuri/) はこの値に設定されます。 |

## 参照

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::Stream\>\&) constructor


指定された URL とストリームで [XmlTextReader](../) クラスの新しいインスタンスを初期化します。

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::Stream> &input)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| url | const String\& | 外部リソースを解決するために使用する URL。 [XmlTextReader::get_BaseURI](../get_baseuri/) はこの値に設定されます。 |
| 入力 | const SharedPtr\<IO::Stream\>\& | XML データを読み取るストリームです。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


指定された URL、ストリーム、[XmlNameTable](../../xmlnametable/) を使用して、[XmlTextReader](../) クラスの新しいインスタンスを初期化します。

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::Stream> &input, const SharedPtr<XmlNameTable> &nt)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| url | const String\& | 外部リソースを解決するために使用する URL。 [XmlTextReader::get_BaseURI](../get_baseuri/) はこの値に設定されます。 **url** が **nullptr** の場合、**BaseURI** は [String::Empty](../../../system/string/empty/) に設定されます。 |
| 入力 | const SharedPtr\<IO::Stream\>\& | XML データを読み取るストリームです。 |
| nt | const SharedPtr\<XmlNameTable\>\& | 使用する [XmlNameTable](../../xmlnametable/)。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::TextReader\>\&) constructor


指定された URL と TextReader を使用して、[XmlTextReader](../) クラスの新しいインスタンスを初期化します。

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::TextReader> &input)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| url | const String\& | 外部リソースを解決するために使用する URL。 [XmlTextReader::get_BaseURI](../get_baseuri/) はこの値に設定されます。 |
| 入力 | const SharedPtr\<IO::TextReader\>\& | XML データを読み取る TextReader です。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


指定された URL、TextReader、[XmlNameTable](../../xmlnametable/) を使用して、[XmlTextReader](../) クラスの新しいインスタンスを初期化します。

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::TextReader> &input, const SharedPtr<XmlNameTable> &nt)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| url | const String\& | 外部リソースを解決するために使用する URL。 [XmlTextReader::get_BaseURI](../get_baseuri/) はこの値に設定されます。 **url** が **nullptr** の場合、**BaseURI** は [String::Empty](../../../system/string/empty/) に設定されます。 |
| 入力 | const SharedPtr\<IO::TextReader\>\& | XML データを読み取る TextReader です。 |
| nt | const SharedPtr\<XmlNameTable\>\& | 使用する [XmlNameTable](../../xmlnametable/)。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<XmlNameTable\>\&) constructor


指定されたファイルと [XmlNameTable](../../xmlnametable/) を使用して、[XmlTextReader](../) クラスの新しいインスタンスを初期化します。

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<XmlNameTable> &nt)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| url | const String\& | 読み取る XML データを含むファイルの URL。 |
| nt | const SharedPtr\<XmlNameTable\>\& | 使用する [XmlNameTable](../../xmlnametable/)。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


指定された文字列、[XmlNodeType](../../xmlnodetype/)、[XmlParserContext](../../xmlparsercontext/) を使用して、[XmlTextReader](../) クラスの新しいインスタンスを初期化します。

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| xmlFragment | const String\& | 解析する XML フラグメントを含む文字列。 |
| fragType | XmlNodeType | XML フラグメントの [XmlNodeType](../../xmlnodetype/)。これはフラグメント文字列に含めることができる内容も決定します。 |
| context | const SharedPtr\<XmlParserContext\>\& | **xmlFragment** を解析する [XmlParserContext](../../xmlparsercontext/)。これには使用する [XmlNameTable](../../xmlnametable/)、エンコーディング、名前空間スコープ、現在の **xml:lang**、および **xml:space** スコープが含まれます。 |

## 参照

* Class [String](../../../system/string/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
