---
title: "System::Xml::XmlWriter::Create メソッド"
linktitle: "作成"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlWriter::Create メソッド。指定されたストリームを使用して新しい XmlWriter インスタンスを作成します（C++）。"
type: docs
weight: 3700
url: /ja/cpp/system.xml/xmlwriter/create/
---
## XmlWriter::Create(const SharedPtr\<IO::Stream\>\&) method


指定されたストリームを使用して新しい[XmlWriter](../)インスタンスを作成します。

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::Stream> &output)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| output | const SharedPtr\<IO::Stream\>\& | 書き込み先のストリームです。[XmlWriter](../)はXML 1.0テキスト構文を書き込み、指定されたストリームに追加します。 |

### ReturnValue

[XmlWriter](../)オブジェクトです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlWriterSettings\>) method


ストリームと[XmlWriterSettings](../../xmlwritersettings/)オブジェクトを使用して新しい[XmlWriter](../)インスタンスを作成します。

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::Stream> &output, SharedPtr<XmlWriterSettings> settings)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| output | const SharedPtr\<IO::Stream\>\& | 書き込み先のストリームです。[XmlWriter](../)はXML 1.0テキスト構文を書き込み、指定されたストリームに追加します。 |
| settings | SharedPtr\<XmlWriterSettings\> | [XmlWriterSettings](../../xmlwritersettings/)オブジェクトは新しい[XmlWriter](../)インスタンスの構成に使用されます。これが**nullptr**の場合、デフォルト設定の[XmlWriterSettings](../../xmlwritersettings/)が使用されます。[XmlWriter](../)がXslCompiledTransform:Transform(String,SharedPtr<XmlWriter>)メソッドと共に使用される場合は、XslCompiledTransform::get_OutputSettingsの値を使用して、正しい設定を持つ[XmlWriterSettings](../../xmlwritersettings/)オブジェクトを取得すべきです。これにより、作成された[XmlWriter](../)オブジェクトが正しい出力設定を持つことが保証されます。 |

### ReturnValue

[XmlWriter](../)オブジェクトです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<IO::TextWriter\>\&) method


指定されたTextWriterを使用して新しい[XmlWriter](../)インスタンスを作成します。

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::TextWriter> &output)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| output | const SharedPtr\<IO::TextWriter\>\& | 書き込み先のTextWriterです。[XmlWriter](../)はXML 1.0テキスト構文を書き込み、指定されたTextWriterに追加します。 |

### ReturnValue

[XmlWriter](../)オブジェクトです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<IO::TextWriter\>\&, SharedPtr\<XmlWriterSettings\>) method


TextWriterと[XmlWriterSettings](../../xmlwritersettings/)オブジェクトを使用して新しい[XmlWriter](../)インスタンスを作成します。

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::TextWriter> &output, SharedPtr<XmlWriterSettings> settings)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| output | const SharedPtr\<IO::TextWriter\>\& | 書き込み先のTextWriterです。[XmlWriter](../)はXML 1.0テキスト構文を書き込み、指定されたTextWriterに追加します。 |
| settings | SharedPtr\<XmlWriterSettings\> | [XmlWriterSettings](../../xmlwritersettings/)オブジェクトは新しい[XmlWriter](../)インスタンスの構成に使用されます。これが**nullptr**の場合、デフォルト設定の[XmlWriterSettings](../../xmlwritersettings/)が使用されます。[XmlWriter](../)がXslCompiledTransform:Transform(String,SharedPtr<XmlWriter>)メソッドと共に使用される場合は、XslCompiledTransform::get_OutputSettingsの値を使用して、正しい設定を持つ[XmlWriterSettings](../../xmlwritersettings/)オブジェクトを取得すべきです。これにより、作成された[XmlWriter](../)オブジェクトが正しい出力設定を持つことが保証されます。 |

### ReturnValue

[XmlWriter](../)オブジェクトです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<Text::StringBuilder\>\&) method


指定された[Text::StringBuilder](../../../system.text/stringbuilder/)を使用して新しい[XmlWriter](../)インスタンスを作成します。

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<Text::StringBuilder> &output)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| output | const SharedPtr\<Text::StringBuilder\>\& | 書き込み先の[Text::StringBuilder](../../../system.text/stringbuilder/)です。[XmlWriter](../)が書き込む内容は[Text::StringBuilder](../../../system.text/stringbuilder/)に追加されます。 |

### ReturnValue

[XmlWriter](../)オブジェクトです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [StringBuilder](../../../system.text/stringbuilder/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<Text::StringBuilder\>\&, SharedPtr\<XmlWriterSettings\>) method


[Text::StringBuilder](../../../system.text/stringbuilder/)と[XmlWriterSettings](../../xmlwritersettings/)オブジェクトを使用して新しい[XmlWriter](../)インスタンスを作成します。

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<Text::StringBuilder> &output, SharedPtr<XmlWriterSettings> settings)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| output | const SharedPtr\<Text::StringBuilder\>\& | 書き込み先の[Text::StringBuilder](../../../system.text/stringbuilder/)です。[XmlWriter](../)が書き込む内容は[Text::StringBuilder](../../../system.text/stringbuilder/)に追加されます。 |
| settings | SharedPtr\<XmlWriterSettings\> | [XmlWriterSettings](../../xmlwritersettings/)オブジェクトは新しい[XmlWriter](../)インスタンスの構成に使用されます。これが**nullptr**の場合、デフォルト設定の[XmlWriterSettings](../../xmlwritersettings/)が使用されます。[XmlWriter](../)がXslCompiledTransform:Transform(String,SharedPtr<XmlWriter>)メソッドと共に使用される場合は、XslCompiledTransform::get_OutputSettingsの値を使用して、正しい設定を持つ[XmlWriterSettings](../../xmlwritersettings/)オブジェクトを取得すべきです。これにより、作成された[XmlWriter](../)オブジェクトが正しい出力設定を持つことが保証されます。 |

### ReturnValue

[XmlWriter](../)オブジェクトです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [StringBuilder](../../../system.text/stringbuilder/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<XmlWriter\>\&) method


指定された[XmlWriter](../)オブジェクトを使用して新しい[XmlWriter](../)インスタンスを作成します。

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<XmlWriter> &output)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| output | const SharedPtr\<XmlWriter\>\& | 基礎となるライターとして使用したい[XmlWriter](../)オブジェクトです。 |

### ReturnValue

指定された[XmlWriter](../)オブジェクトをラップした[XmlWriter](../)オブジェクトです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<XmlWriter\>\&, SharedPtr\<XmlWriterSettings\>) method


指定された[XmlWriter](../)と[XmlWriterSettings](../../xmlwritersettings/)オブジェクトを使用して新しい[XmlWriter](../)インスタンスを作成します。

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<XmlWriter> &output, SharedPtr<XmlWriterSettings> settings)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| output | const SharedPtr\<XmlWriter\>\& | 基礎となるライターとして使用したい[XmlWriter](../)オブジェクトです。 |
| settings | SharedPtr\<XmlWriterSettings\> | [XmlWriterSettings](../../xmlwritersettings/)オブジェクトは新しい[XmlWriter](../)インスタンスの構成に使用されます。これが**nullptr**の場合、デフォルト設定の[XmlWriterSettings](../../xmlwritersettings/)が使用されます。[XmlWriter](../)がXslCompiledTransform:Transform(String,SharedPtr<XmlWriter>)メソッドと共に使用される場合は、XslCompiledTransform::get_OutputSettingsの値を使用して、正しい設定を持つ[XmlWriterSettings](../../xmlwritersettings/)オブジェクトを取得すべきです。これにより、作成された[XmlWriter](../)オブジェクトが正しい出力設定を持つことが保証されます。 |

### ReturnValue

指定された[XmlWriter](../)オブジェクトをラップした[XmlWriter](../)オブジェクトです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const String\&) method


指定されたファイル名を使用して新しい[XmlWriter](../)インスタンスを作成します。

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const String &outputFileName)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| outputFileName | const String\& | 書き込み先のファイルです。[XmlWriter](../)は指定されたパスにファイルを作成し、XML 1.0テキスト構文で書き込みます。**outputFileName**はファイルシステムのパスである必要があります。 |

### ReturnValue

[XmlWriter](../)オブジェクトです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const String\&, SharedPtr\<XmlWriterSettings\>) method


ファイル名と[XmlWriterSettings](../../xmlwritersettings/)オブジェクトを使用して新しい[XmlWriter](../)インスタンスを作成します。

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const String &outputFileName, SharedPtr<XmlWriterSettings> settings)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| outputFileName | const String\& | 書き込み先のファイルです。[XmlWriter](../)は指定されたパスにファイルを作成し、XML 1.0テキスト構文で書き込みます。**outputFileName**はファイルシステムのパスである必要があります。 |
| settings | SharedPtr\<XmlWriterSettings\> | [XmlWriterSettings](../../xmlwritersettings/)オブジェクトは新しい[XmlWriter](../)インスタンスの構成に使用されます。これが**nullptr**の場合、デフォルト設定の[XmlWriterSettings](../../xmlwritersettings/)が使用されます。[XmlWriter](../)がXslCompiledTransform:Transform(String,SharedPtr<XmlWriter>)メソッドと共に使用される場合は、XslCompiledTransform::get_OutputSettingsの値を使用して、正しい設定を持つ[XmlWriterSettings](../../xmlwritersettings/)オブジェクトを取得すべきです。これにより、作成された[XmlWriter](../)オブジェクトが正しい出力設定を持つことが保証されます。 |

### ReturnValue

[XmlWriter](../)オブジェクトです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [String](../../../system/string/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
