---
title: "System::Xml::XmlTextWriter::XmlTextWriter コンストラクタ"
linktitle: "XmlTextWriter"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlTextWriter::XmlTextWriter コンストラクタ。指定されたストリームとエンコーディングを使用して C++ で XmlTextWriter クラスのインスタンスを作成します。"
type: docs
weight: 100
url: /ja/cpp/system.xml/xmltextwriter/xmltextwriter/
---
## XmlTextWriter::XmlTextWriter(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Text::Encoding\>\&) constructor


指定されたストリームとエンコーディングを使用して、[XmlTextWriter](../) クラスのインスタンスを作成します。

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const SharedPtr<IO::Stream> &w, const SharedPtr<Text::Encoding> &encoding)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| w | const SharedPtr\<IO::Stream\>\& | 書き込み先のストリームです。 |
| エンコーディング | const SharedPtr\<Text::Encoding\>\& | 生成するエンコーディングです。エンコーディングが **nullptr** の場合、ストリームを UTF-8 で書き出し、**ProcessingInstruction** のエンコーディング属性を省略します。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextWriter::XmlTextWriter(const SharedPtr\<IO::TextWriter\>\&) constructor


指定された TextWriter を使用して、[XmlTextWriter](../) クラスのインスタンスを作成します。

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const SharedPtr<IO::TextWriter> &w)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| w | const SharedPtr\<IO::TextWriter\>\& | 書き込み先の TextWriter です。TextWriter はすでに正しいエンコーディングに設定されていると想定されます。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextWriter::XmlTextWriter(const String\&, const SharedPtr\<Text::Encoding\>\&) constructor


指定されたファイルを使用して、[XmlTextWriter](../) クラスのインスタンスを作成します。

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const String &filename, const SharedPtr<Text::Encoding> &encoding)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| filename | const String\& | 書き込み先のファイル名です。ファイルが存在する場合、内容を切り詰めて新しい内容で上書きします。 |
| エンコーディング | const SharedPtr\<Text::Encoding\>\& | 生成するエンコーディングです。エンコーディングが **nullptr** の場合、ファイルを UTF-8 で書き出し、**ProcessingInstruction** のエンコーディング属性を省略します。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
