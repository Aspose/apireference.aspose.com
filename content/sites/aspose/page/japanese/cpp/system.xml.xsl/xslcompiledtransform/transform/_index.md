---
title: "System::Xml::Xsl::XslCompiledTransform::Transform method"
linktitle: "Transform"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Xsl::XslCompiledTransform::Transform メソッド。IXPathNavigable オブジェクトで指定された入力ドキュメントを使用して変換を実行し、結果を C++ の XmlWriter に出力します。"
type: docs
weight: 400
url: /ja/cpp/system.xml.xsl/xslcompiledtransform/transform/
---
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XmlWriter\>\&) method


IXPathNavigable オブジェクトで指定された入力ドキュメントを使用して変換を実行し、結果を [XmlWriter](../../../system.xml/xmlwriter/) に出力します。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XmlWriter> &results)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable インターフェイスを実装するオブジェクトです。これは、[XmlNode](../../../system.xml/xmlnode/)（通常は [XmlDocument](../../../system.xml/xmldocument/)）または変換対象のデータを含む XPathDocument のいずれかです。 |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) に出力したい先です。スタイルシートに **xsl:output** 要素が含まれる場合、[XslCompiledTransform::get_OutputSettings](../get_outputsettings/) の値から返される [XmlWriterSettings](../../../system.xml/xmlwritersettings/) オブジェクトを使用して [XmlWriter](../../../system.xml/xmlwriter/) を作成すべきです。これにより、[XmlWriter](../../../system.xml/xmlwriter/) が正しい出力設定を持つことが保証されます。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


IXPathNavigable オブジェクトで指定された入力ドキュメントを使用して変換を実行し、結果をストリームに出力します。[XsltArgumentList](../../xsltargumentlist/) は追加の実行時引数を提供します。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable インターフェイスを実装するオブジェクトです。これは、[XmlNode](../../../system.xml/xmlnode/)（通常は [XmlDocument](../../../system.xml/xmldocument/)）または変換対象のデータを含む XPathDocument のいずれかです。 |
| arguments | const SharedPtr\<XsltArgumentList\>\& | 変換の入力として使用される名前空間で修飾された引数を含む [XsltArgumentList](../../xsltargumentlist/) です。この値は **nullptr** になる可能性があります。 |
| 結果 | const SharedPtr\<IO::Stream\>\& | 出力したいストリームです。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


IXPathNavigable オブジェクトで指定された入力ドキュメントを使用して変換を実行し、結果を TextWriter に出力します。[XsltArgumentList](../../xsltargumentlist/) は追加の実行時引数を提供します。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable インターフェイスを実装するオブジェクトです。これは、[XmlNode](../../../system.xml/xmlnode/)（通常は [XmlDocument](../../../system.xml/xmldocument/)）または変換対象のデータを含む XPathDocument のいずれかです。 |
| arguments | const SharedPtr\<XsltArgumentList\>\& | 変換の入力として使用される名前空間で修飾された引数を含む [XsltArgumentList](../../xsltargumentlist/) です。この値は **nullptr** になる可能性があります。 |
| 結果 | const SharedPtr\<IO::TextWriter\>\& | 出力したい TextWriter です。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


IXPathNavigable オブジェクトで指定された入力ドキュメントを使用して変換を実行し、結果を [XmlWriter](../../../system.xml/xmlwriter/) に出力します。[XsltArgumentList](../../xsltargumentlist/) は追加の実行時引数を提供します。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable インターフェイスを実装するオブジェクトです。これは、[XmlNode](../../../system.xml/xmlnode/)（通常は [XmlDocument](../../../system.xml/xmldocument/)）または変換対象のデータを含む XPathDocument のいずれかです。 |
| arguments | const SharedPtr\<XsltArgumentList\>\& | 変換の入力として使用される名前空間で修飾された引数を含む [XsltArgumentList](../../xsltargumentlist/) です。この値は **nullptr** になる可能性があります。 |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) に出力したい先です。スタイルシートに **xsl:output** 要素が含まれる場合、[XslCompiledTransform::get_OutputSettings](../get_outputsettings/) の値から返される [XmlWriterSettings](../../../system.xml/xmlwritersettings/) オブジェクトを使用して [XmlWriter](../../../system.xml/xmlwriter/) を作成すべきです。これにより、[XmlWriter](../../../system.xml/xmlwriter/) が正しい出力設定を持つことが保証されます。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) method


IXPathNavigable オブジェクトで指定された入力ドキュメントを使用して変換を実行し、結果を [XmlWriter](../../../system.xml/xmlwriter/) に出力します。[XsltArgumentList](../../xsltargumentlist/) は追加の実行時引数を提供し、[XmlResolver](../../../system.xml/xmlresolver/) は XSLT の **document()** 関数を解決します。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results, const SharedPtr<XmlResolver> &documentResolver)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable オブジェクトで指定された変換対象のドキュメントです。 |
| arguments | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/) としての引数リスト。 |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) に出力したい先です。スタイルシートに **xsl:output** 要素が含まれる場合、[XslCompiledTransform::get_OutputSettings](../get_outputsettings/) の値から返される [XmlWriterSettings](../../../system.xml/xmlwritersettings/) オブジェクトを使用して [XmlWriter](../../../system.xml/xmlwriter/) を作成すべきです。これにより、[XmlWriter](../../../system.xml/xmlwriter/) が正しい出力設定を持つことが保証されます。 |
| documentResolver | const SharedPtr\<XmlResolver\>\& | XSLT **document()** 関数を解決するために使用される [XmlResolver](../../../system.xml/xmlresolver/)。この値が **nullptr** の場合、**document()** 関数は解決されません。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XmlWriter\>\&) method


[XmlReader](../../../system.xml/xmlreader/) オブジェクトで指定された入力ドキュメントを使用して変換を実行し、結果を [XmlWriter](../../../system.xml/xmlwriter/) に出力します。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XmlWriter> &results)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | 入力ドキュメントを含む [XmlReader](../../../system.xml/xmlreader/)。 |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) に出力したい先です。スタイルシートに **xsl:output** 要素が含まれる場合、[XslCompiledTransform::get_OutputSettings](../get_outputsettings/) の値から返される [XmlWriterSettings](../../../system.xml/xmlwritersettings/) オブジェクトを使用して [XmlWriter](../../../system.xml/xmlwriter/) を作成すべきです。これにより、[XmlWriter](../../../system.xml/xmlwriter/) が正しい出力設定を持つことが保証されます。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


[XmlReader](../../../system.xml/xmlreader/) オブジェクトで指定された入力ドキュメントを使用して変換を実行し、結果をストリームに出力します。[XsltArgumentList](../../xsltargumentlist/) は追加の実行時引数を提供します。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | 入力ドキュメントを含む [XmlReader](../../../system.xml/xmlreader/)。 |
| arguments | const SharedPtr\<XsltArgumentList\>\& | 変換の入力として使用される名前空間で修飾された引数を含む [XsltArgumentList](../../xsltargumentlist/) です。この値は **nullptr** になる可能性があります。 |
| 結果 | const SharedPtr\<IO::Stream\>\& | 出力したいストリームです。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


[XmlReader](../../../system.xml/xmlreader/) オブジェクトで指定された入力ドキュメントを使用して変換を実行し、結果を TextWriter に出力します。[XsltArgumentList](../../xsltargumentlist/) は追加の実行時引数を提供します。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | 入力ドキュメントを含む [XmlReader](../../../system.xml/xmlreader/)。 |
| arguments | const SharedPtr\<XsltArgumentList\>\& | 変換の入力として使用される名前空間で修飾された引数を含む [XsltArgumentList](../../xsltargumentlist/) です。この値は **nullptr** になる可能性があります。 |
| 結果 | const SharedPtr\<IO::TextWriter\>\& | 出力したい TextWriter です。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


[XmlReader](../../../system.xml/xmlreader/) オブジェクトで指定された入力ドキュメントを使用して変換を実行し、結果を [XmlWriter](../../../system.xml/xmlwriter/) に出力します。[XsltArgumentList](../../xsltargumentlist/) は追加の実行時引数を提供します。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | 入力ドキュメントを含む [XmlReader](../../../system.xml/xmlreader/)。 |
| arguments | const SharedPtr\<XsltArgumentList\>\& | 変換の入力として使用される名前空間で修飾された引数を含む [XsltArgumentList](../../xsltargumentlist/) です。この値は **nullptr** になる可能性があります。 |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) に出力したい先です。スタイルシートに **xsl:output** 要素が含まれる場合、[XslCompiledTransform::get_OutputSettings](../get_outputsettings/) の値から返される [XmlWriterSettings](../../../system.xml/xmlwritersettings/) オブジェクトを使用して [XmlWriter](../../../system.xml/xmlwriter/) を作成すべきです。これにより、[XmlWriter](../../../system.xml/xmlwriter/) が正しい出力設定を持つことが保証されます。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) method


[XmlReader](../../../system.xml/xmlreader/) オブジェクトで指定された入力ドキュメントを使用して変換を実行し、結果を [XmlWriter](../../../system.xml/xmlwriter/) に出力します。[XsltArgumentList](../../xsltargumentlist/) は追加の実行時引数を提供し、[XmlResolver](../../../system.xml/xmlresolver/) は XSLT **document()** 関数を解決します。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results, const SharedPtr<XmlResolver> &documentResolver)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | 入力ドキュメントを含む [XmlReader](../../../system.xml/xmlreader/)。 |
| arguments | const SharedPtr\<XsltArgumentList\>\& | 変換の入力として使用される名前空間で修飾された引数を含む [XsltArgumentList](../../xsltargumentlist/) です。この値は **nullptr** になる可能性があります。 |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) に出力したい先です。スタイルシートに **xsl:output** 要素が含まれる場合、[XslCompiledTransform::get_OutputSettings](../get_outputsettings/) の値から返される [XmlWriterSettings](../../../system.xml/xmlwritersettings/) オブジェクトを使用して [XmlWriter](../../../system.xml/xmlwriter/) を作成すべきです。これにより、[XmlWriter](../../../system.xml/xmlwriter/) が正しい出力設定を持つことが保証されます。 |
| documentResolver | const SharedPtr\<XmlResolver\>\& | XSLT **document()** 関数を解決するために使用される [XmlResolver](../../../system.xml/xmlresolver/)。この値が **nullptr** の場合、**document()** 関数は解決されません。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XmlWriter\>\&) method


URI で指定された入力ドキュメントを使用して変換を実行し、結果を [XmlWriter](../../../system.xml/xmlwriter/) に出力します。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XmlWriter> &results)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| inputUri | const String\& | 入力ドキュメントの URI。 |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) に出力したい先です。スタイルシートに **xsl:output** 要素が含まれる場合、[XslCompiledTransform::get_OutputSettings](../get_outputsettings/) の値から返される [XmlWriterSettings](../../../system.xml/xmlwritersettings/) オブジェクトを使用して [XmlWriter](../../../system.xml/xmlwriter/) を作成すべきです。これにより、[XmlWriter](../../../system.xml/xmlwriter/) が正しい出力設定を持つことが保証されます。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


URI で指定された入力ドキュメントを使用して変換を実行し、結果をストリームに出力します。[XsltArgumentList](../../xsltargumentlist/) は追加の実行時引数を提供します。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| inputUri | const String\& | 入力ドキュメントの URI。 |
| arguments | const SharedPtr\<XsltArgumentList\>\& | 変換の入力として使用される名前空間で修飾された引数を含む [XsltArgumentList](../../xsltargumentlist/) です。この値は **nullptr** になる可能性があります。 |
| 結果 | const SharedPtr\<IO::Stream\>\& | 出力したいストリームです。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


URI で指定された入力ドキュメントを使用して変換を実行し、結果を TextWriter に出力します。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| inputUri | const String\& | 入力ドキュメントの URI。 |
| arguments | const SharedPtr\<XsltArgumentList\>\& | 変換の入力として使用される名前空間で修飾された引数を含む [XsltArgumentList](../../xsltargumentlist/) です。この値は **nullptr** になる可能性があります。 |
| 結果 | const SharedPtr\<IO::TextWriter\>\& | 出力したい TextWriter です。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


URI で指定された入力ドキュメントを使用して変換を実行し、結果を [XmlWriter](../../../system.xml/xmlwriter/) に出力します。[XsltArgumentList](../../xsltargumentlist/) は追加の実行時引数を提供します。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| inputUri | const String\& | 入力ドキュメントの URI。 |
| arguments | const SharedPtr\<XsltArgumentList\>\& | 変換の入力として使用される名前空間で修飾された引数を含む [XsltArgumentList](../../xsltargumentlist/) です。この値は **nullptr** になる可能性があります。 |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) に出力したい先です。スタイルシートに **xsl:output** 要素が含まれる場合、[XslCompiledTransform::get_OutputSettings](../get_outputsettings/) の値から返される [XmlWriterSettings](../../../system.xml/xmlwritersettings/) オブジェクトを使用して [XmlWriter](../../../system.xml/xmlwriter/) を作成すべきです。これにより、[XmlWriter](../../../system.xml/xmlwriter/) が正しい出力設定を持つことが保証されます。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const String\&) method


URI で指定された入力ドキュメントを使用して変換を実行し、結果をファイルに出力します。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const String &resultsFile)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| inputUri | const String\& | 入力ドキュメントの URI。 |
| resultsFile | const String\& | 出力ファイルの URI。 |

## 参照

* Class [String](../../../system/string/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
