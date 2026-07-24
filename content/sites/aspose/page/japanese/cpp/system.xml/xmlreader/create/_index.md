---
title: "System::Xml::XmlReader::Create メソッド"
linktitle: "作成"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlReader::Create メソッド。指定されたストリームとデフォルト設定を使用して C++ で新しい XmlReader インスタンスを作成します。"
type: docs
weight: 7700
url: /ja/cpp/system.xml/xmlreader/create/
---
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&) method


指定されたストリームとデフォルト設定を使用して新しい [XmlReader](../) インスタンスを作成します。

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | XML データを含むストリームです。[XmlReader](../) はストリームの最初のバイトをスキャンし、バイト順マークやその他のエンコーディングの兆候を探します。エンコーディングが判明すると、そのエンコーディングを使用してストリームの読み取りを続行し、入力を (Unicode) 文字のストリームとして解析し続けます。 |

### ReturnValue

ストリーム内の XML データを読み取るために使用されるオブジェクトです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlReaderSettings\>\&) method


指定されたストリームと設定で新しい [XmlReader](../) インスタンスを作成します。

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, const SharedPtr<XmlReaderSettings> &settings)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | XML データを含むストリームです。[XmlReader](../) はストリームの最初のバイトをスキャンし、バイト順マークやその他のエンコーディングの兆候を探します。エンコーディングが判明すると、そのエンコーディングを使用してストリームの読み取りを続行し、入力を (Unicode) 文字のストリームとして解析し続けます。 |
| settings | const SharedPtr\<XmlReaderSettings\>\& | 新しい [XmlReader](../) インスタンスの設定です。この値は **nullptr** にすることができます。 |

### ReturnValue

ストリーム内の XML データを読み取るために使用されるオブジェクトです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


指定されたストリーム、設定、および解析用のコンテキスト情報を使用して新しい [XmlReader](../) インスタンスを作成します。

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | XML データを含むストリームです。[XmlReader](../) はストリームの最初のバイトをスキャンし、バイト順マークやその他のエンコーディングの兆候を探します。エンコーディングが判明すると、そのエンコーディングを使用してストリームの読み取りを続行し、入力を (Unicode) 文字のストリームとして解析し続けます。 |
| settings | SharedPtr\<XmlReaderSettings\> | 新しい [XmlReader](../) インスタンスの設定です。この値は **nullptr** にすることができます。 |
| inputContext | const SharedPtr\<XmlParserContext\>\& | XML フラグメントを解析するために必要なコンテキスト情報です。コンテキスト情報には使用する [XmlNameTable](../../xmlnametable/) やエンコーディング、名前空間スコープ、現在の **xml:lang** と **xml:space** スコープ、ベース URI、文書型定義が含まれる場合があります。この値は **nullptr** にすることができます。 |

### ReturnValue

ストリーム内の XML データを読み取るために使用されるオブジェクトです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) method


指定されたストリーム、ベース URI、設定を使用して新しい [XmlReader](../) インスタンスを作成します。

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, SharedPtr<XmlReaderSettings> settings, const String &baseUri)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | XML データを含むストリームです。[XmlReader](../) はストリームの最初のバイトをスキャンし、バイト順マークやその他のエンコーディングの兆候を探します。エンコーディングが判明すると、そのエンコーディングを使用してストリームの読み取りを続行し、入力を (Unicode) 文字のストリームとして解析し続けます。 |
| settings | SharedPtr\<XmlReaderSettings\> | 新しい [XmlReader](../) インスタンスの設定です。この値は **nullptr** にすることができます。 |
| baseUri | const String\& | 読み取られるエンティティまたはドキュメントのベース URI です。この値は **nullptr** にすることができます。**[Security](../../../system.security/) Note** ベース URI は XML ドキュメントの相対 URI を解決するために使用されます。信頼できないソースからのベース URI は使用しないでください。 |

### ReturnValue

ストリーム内の XML データを読み取るために使用されるオブジェクトです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&) method


指定されたテキストリーダーを使用して、新しい [XmlReader](../) インスタンスを作成します。

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const SharedPtr\<IO::TextReader\>\& | XML データを読み取るテキストリーダーです。テキストリーダーは Unicode 文字のストリームを返すため、XML 宣言で指定されたエンコーディングは XML リーダーがデータストリームをデコードする際に使用されません。 |

### ReturnValue

ストリーム内の XML データを読み取るために使用されるオブジェクトです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlReaderSettings\>\&) method


指定されたテキストリーダーと設定を使用して、新しい [XmlReader](../) インスタンスを作成します。

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, const SharedPtr<XmlReaderSettings> &settings)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const SharedPtr\<IO::TextReader\>\& | XML データを読み取るテキストリーダーです。テキストリーダーは Unicode 文字のストリームを返すため、XML 宣言で指定されたエンコーディングは XML リーダーがデータストリームをデコードする際に使用されません。 |
| settings | const SharedPtr\<XmlReaderSettings\>\& | 新しい [XmlReader](../) の設定です。この値は **nullptr** にすることができます。 |

### ReturnValue

ストリーム内の XML データを読み取るために使用されるオブジェクトです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


指定されたテキストリーダー、設定、および解析用のコンテキスト情報を使用して、新しい [XmlReader](../) インスタンスを作成します。

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const SharedPtr\<IO::TextReader\>\& | XML データを読み取るテキストリーダーです。テキストリーダーは Unicode 文字のストリームを返すため、XML 宣言で指定されたエンコーディングは XML リーダーがデータストリームをデコードする際に使用されません。 |
| settings | SharedPtr\<XmlReaderSettings\> | 新しい [XmlReader](../) インスタンスの設定です。この値は **nullptr** にすることができます。 |
| inputContext | const SharedPtr\<XmlParserContext\>\& | XML フラグメントを解析するために必要なコンテキスト情報です。コンテキスト情報には使用する [XmlNameTable](../../xmlnametable/) やエンコーディング、名前空間スコープ、現在の **xml:lang** と **xml:space** スコープ、ベース URI、文書型定義が含まれる場合があります。この値は **nullptr** にすることができます。 |

### ReturnValue

ストリーム内の XML データを読み取るために使用されるオブジェクトです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) method


指定されたテキストリーダー、設定、およびベース URI を使用して、新しい [XmlReader](../) インスタンスを作成します。

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, SharedPtr<XmlReaderSettings> settings, const String &baseUri)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| input | const SharedPtr\<IO::TextReader\>\& | XML データを読み取るテキストリーダーです。テキストリーダーは Unicode 文字のストリームを返すため、XML 宣言で指定されたエンコーディングは [XmlReader](../) がデータストリームをデコードする際に使用されません。 |
| settings | SharedPtr\<XmlReaderSettings\> | 新しい [XmlReader](../) インスタンスの設定です。この値は **nullptr** にすることができます。 |
| baseUri | const String\& | 読み取られるエンティティまたはドキュメントのベース URI です。この値は **nullptr** にすることができます。**[Security](../../../system.security/) Note** ベース URI は XML ドキュメントの相対 URI を解決するために使用されます。信頼できないソースからのベース URI は使用しないでください。 |

### ReturnValue

ストリーム内の XML データを読み取るために使用されるオブジェクトです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlReaderSettings\>) method


指定された XML リーダーと設定を使用して、新しい [XmlReader](../) インスタンスを作成します。

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<XmlReader> &reader, SharedPtr<XmlReaderSettings> settings)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| リーダー | const SharedPtr\<XmlReader\>\& | 基礎となる XML リーダーとして使用したいオブジェクトです。 |
| settings | SharedPtr\<XmlReaderSettings\> | 新しい [XmlReader](../) インスタンスの設定です。[XmlReaderSettings](../../xmlreadersettings/) オブジェクトのコンフォーマンスレベルは、基礎となるリーダーのコンフォーマンスレベルと一致するか、[ConformanceLevel::Auto](../../conformancelevel/) に設定されている必要があります。 |

### ReturnValue

指定された [XmlReader](../) オブジェクトをラップするオブジェクトです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const String\&) method


指定された URI を使用して、新しい [XmlReader](../) インスタンスを作成します。

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| inputUri | const String\& | XML データを含むファイルの URI です。[XmlUrlResolver](../../xmlurlresolver/) クラスは、パスを正規化されたデータ表現に変換するために使用されます。 |

### ReturnValue

ストリーム内の XML データを読み取るために使用されるオブジェクトです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const String\&, const SharedPtr\<XmlReaderSettings\>\&) method


指定された URI と設定を使用して、新しい [XmlReader](../) インスタンスを作成します。

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri, const SharedPtr<XmlReaderSettings> &settings)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| inputUri | const String\& | XML データを含むファイルの URI です。[XmlReaderSettings](../../xmlreadersettings/) オブジェクト上の [XmlResolver](../../xmlresolver/) オブジェクトが、パスを正規化されたデータ表現に変換するために使用されます。XmlReaderSettings::get_XmlResolver の値が **nullptr** の場合、新しい [XmlUrlResolver](../../xmlurlresolver/) オブジェクトが使用されます。 |
| settings | const SharedPtr\<XmlReaderSettings\>\& | 新しい [XmlReader](../) インスタンスの設定です。この値は **nullptr** にすることができます。 |

### ReturnValue

ストリーム内の XML データを読み取るために使用されるオブジェクトです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const String\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


指定された URI、設定、および解析用のコンテキスト情報を使用して、新しい [XmlReader](../) インスタンスを作成します。

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| inputUri | const String\& | XML データを含むファイルの URI です。[XmlReaderSettings](../../xmlreadersettings/) オブジェクト上の [XmlResolver](../../xmlresolver/) オブジェクトが、パスを正規化されたデータ表現に変換するために使用されます。XmlReaderSettings::get_XmlResolver の値が **nullptr** の場合、新しい [XmlUrlResolver](../../xmlurlresolver/) オブジェクトが使用されます。 |
| settings | SharedPtr\<XmlReaderSettings\> | 新しい [XmlReader](../) インスタンスの設定です。この値は **nullptr** にすることができます。 |
| inputContext | const SharedPtr\<XmlParserContext\>\& | XML フラグメントを解析するために必要なコンテキスト情報です。コンテキスト情報には使用する [XmlNameTable](../../xmlnametable/) やエンコーディング、名前空間スコープ、現在の **xml:lang** と **xml:space** スコープ、ベース URI、文書型定義が含まれる場合があります。この値は **nullptr** にすることができます。 |

### ReturnValue

ストリーム内の XML データを読み取るために使用されるオブジェクトです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
