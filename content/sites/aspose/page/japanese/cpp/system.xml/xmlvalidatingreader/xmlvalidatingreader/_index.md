---
title: "System::Xml::XmlValidatingReader::XmlValidatingReader コンストラクタ"
linktitle: "XmlValidatingReader"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlValidatingReader::XmlValidatingReader コンストラクタ。指定された値で XmlValidatingReader クラスの新しいインスタンスを初期化します（C++）。"
type: docs
weight: 100
url: /ja/cpp/system.xml/xmlvalidatingreader/xmlvalidatingreader/
---
## XmlValidatingReader::XmlValidatingReader(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


指定された値で [XmlValidatingReader](../) クラスの新しいインスタンスを初期化します。

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const SharedPtr<IO::Stream> &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| xmlFragment | const SharedPtr\<IO::Stream\>\& | 解析する XML フラグメントを含むストリームです。 |
| fragType | XmlNodeType | XML フラグメントの [XmlNodeType](../../xmlnodetype/)。これによりフラグメントが含むことのできる内容が決まります（以下の表を参照）。 |
| context | const SharedPtr\<XmlParserContext\>\& | XML フラグメントが解析される [XmlParserContext](../../xmlparsercontext/)。これには使用する [XmlNameTable](../../xmlnametable/) やエンコーディング、名前空間スコープ、現在の **xml:lang**、**xml:space** スコープが含まれます。 |
## 備考



以下の表は **fragType** の有効な値と、リーダーが各種ノードタイプをどのように解析するかを示しています。 |||
|-|-|
| XmlNodeType | フラグメントに含められるもの |
| Element | 有効な要素コンテンツ全般（例として、要素、コメント、処理命令、CDATA、テキスト、エンティティ参照の任意の組み合わせ）。 |
| Attribute | 属性の値（引用符内の部分）。 |
| Document | XML ドキュメント全体の内容；これにより文書レベルの規則が適用されます。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlValidatingReader::XmlValidatingReader(const SharedPtr\<XmlReader\>\&) constructor


指定された [XmlReader](../../xmlreader/) から返されるコンテンツを検証する [XmlValidatingReader](../) クラスの新しいインスタンスを初期化します。

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const SharedPtr<XmlReader> &reader)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| reader | const SharedPtr\<XmlReader\>\& | 検証中に読み取るための [XmlReader](../../xmlreader/)。現在の実装は [XmlTextReader](../../xmltextreader/) のみをサポートしています。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../xmlreader/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlValidatingReader::XmlValidatingReader(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


指定された値で [XmlValidatingReader](../) クラスの新しいインスタンスを初期化します。

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const String &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| xmlFragment | const String\& | 解析する XML フラグメントを含む文字列。 |
| fragType | XmlNodeType | XML フラグメントの [XmlNodeType](../../xmlnodetype/)。これにより、フラグメント文字列に含められる内容も決まります（以下の表を参照）。 |
| context | const SharedPtr\<XmlParserContext\>\& | XML フラグメントを解析するための [XmlParserContext](../../xmlparsercontext/)。これには使用する [NameTable](../../nametable/)、エンコーディング、名前空間スコープ、現在の **xml:lang**、および **xml:space** スコープが含まれます。 |
## 備考



以下の表は **fragType** の有効な値と、リーダーが各種ノードタイプをどのように解析するかを示しています。 |||
|-|-|
| XmlNodeType | フラグメントに含められるもの |
| Element | 有効な要素コンテンツ全般（例として、要素、コメント、処理命令、CDATA、テキスト、エンティティ参照の任意の組み合わせ）。 |
| Attribute | 属性の値（引用符内の部分）。 |
| Document | XML ドキュメント全体の内容；これにより文書レベルの規則が適用されます。 |

## 参照

* Class [String](../../../system/string/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
