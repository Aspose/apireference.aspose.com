---
title: "System::Xml::Xsl::XslTransform::Transform メソッド"
linktitle: "Transform"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Xsl::XslTransform::Transform メソッド。指定された args を使用して IXPathNavigable 内の XML データを変換し、結果を C++ の XmlReader に出力します。"
type: docs
weight: 400
url: /ja/cpp/system.xml.xsl/xsltransform/transform/
---
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&) method


指定された **args** を使用して IXPathNavigable の XML データを変換し、結果を [XmlReader](../../../system.xml/xmlreader/) に出力します。

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable インターフェイスを実装するオブジェクトです。これは、[XmlNode](../../../system.xml/xmlnode/)（通常は [XmlDocument](../../../system.xml/xmldocument/)）または変換対象のデータを含む XPathDocument のいずれかです。 |
| args | const SharedPtr\<XsltArgumentList\>\& | 変換の入力として使用される名前空間修飾引数を含む [XsltArgumentList](../../xsltargumentlist/)です。 |

### ReturnValue

変換結果を含む [XmlReader](../../../system.xml/xmlreader/)です。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


指定された **args** を使用して IXPathNavigable の XML データを変換し、結果を Stream に出力します。

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable インターフェイスを実装するオブジェクトです。これは、[XmlNode](../../../system.xml/xmlnode/)（通常は [XmlDocument](../../../system.xml/xmldocument/)）または変換対象のデータを含む XPathDocument のいずれかです。 |
| args | const SharedPtr\<XsltArgumentList\>\& | 変換の入力として使用される名前空間修飾引数を含む [XsltArgumentList](../../xsltargumentlist/)です。 |
| 出力 | const SharedPtr\<IO::Stream\>\& | 出力したいストリームです。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


指定された **args** を使用して IXPathNavigable の XML データを変換し、結果を Stream に出力します。

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable インターフェイスを実装するオブジェクトです。これは、[XmlNode](../../../system.xml/xmlnode/)（通常は [XmlDocument](../../../system.xml/xmldocument/)）または変換対象のデータを含む XPathDocument のいずれかです。 |
| args | const SharedPtr\<XsltArgumentList\>\& | 変換の入力として使用される名前空間修飾引数を含む [XsltArgumentList](../../xsltargumentlist/)です。 |
| 出力 | const SharedPtr\<IO::Stream\>\& | 出力したいストリームです。 |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | XSLT **document()** 関数を解決するために使用される [XmlResolver](../../../system.xml/xmlresolver/)。この値が **nullptr** の場合、**document()** 関数は解決されません。メソッド [XslTransform::Transform](./) が完了した後、[XmlResolver](../../../system.xml/xmlresolver/) はキャッシュされません。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


指定された **args** を使用して IXPathNavigable の XML データを変換し、結果を TextWriter に出力します。

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable インターフェイスを実装するオブジェクトです。これは、[XmlNode](../../../system.xml/xmlnode/)（通常は [XmlDocument](../../../system.xml/xmldocument/)）または変換対象のデータを含む XPathDocument のいずれかです。 |
| args | const SharedPtr\<XsltArgumentList\>\& | 変換の入力として使用される名前空間修飾引数を含む [XsltArgumentList](../../xsltargumentlist/)です。 |
| 出力 | const SharedPtr\<IO::TextWriter\>\& | 出力したい TextWriter です。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


指定された **args** を使用して IXPathNavigable の XML データを変換し、結果を TextWriter に出力します。

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable インターフェイスを実装するオブジェクトです。これは、[XmlNode](../../../system.xml/xmlnode/)（通常は [XmlDocument](../../../system.xml/xmldocument/)）または変換対象のデータを含む XPathDocument のいずれかです。 |
| args | const SharedPtr\<XsltArgumentList\>\& | 変換の入力として使用される名前空間修飾引数を含む [XsltArgumentList](../../xsltargumentlist/)です。 |
| 出力 | const SharedPtr\<IO::TextWriter\>\& | 出力したい TextWriter です。 |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | XSLT **document()** 関数を解決するために使用される [XmlResolver](../../../system.xml/xmlresolver/)。この値が **nullptr** の場合、**document()** 関数は解決されません。このメソッドが完了した後、[XmlResolver](../../../system.xml/xmlresolver/) はキャッシュされません。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


指定された **args** を使用して IXPathNavigable の XML データを変換し、結果を [XmlReader](../../../system.xml/xmlreader/) に出力します。

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable インターフェイスを実装するオブジェクトです。これは、[XmlNode](../../../system.xml/xmlnode/)（通常は [XmlDocument](../../../system.xml/xmldocument/)）または変換対象のデータを含む XPathDocument のいずれかです。 |
| args | const SharedPtr\<XsltArgumentList\>\& | 変換の入力として使用される名前空間修飾引数を含む [XsltArgumentList](../../xsltargumentlist/)です。 |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | XSLT **document()** 関数を解決するために使用される [XmlResolver](../../../system.xml/xmlresolver/)。この値が **nullptr** の場合、**document()** 関数は解決されません。このメソッドが完了した後、[XmlResolver](../../../system.xml/xmlresolver/) はキャッシュされません。 |

### ReturnValue

変換結果を含む [XmlReader](../../../system.xml/xmlreader/)です。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


指定された **args** を使用して IXPathNavigable 内の XML データを変換し、結果を [XmlWriter](../../../system.xml/xmlwriter/) に出力します。

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable インターフェイスを実装するオブジェクトです。これは、[XmlNode](../../../system.xml/xmlnode/)（通常は [XmlDocument](../../../system.xml/xmldocument/)）または変換対象のデータを含む XPathDocument のいずれかです。 |
| args | const SharedPtr\<XsltArgumentList\>\& | 変換の入力として使用される名前空間修飾引数を含む [XsltArgumentList](../../xsltargumentlist/)です。 |
| output | const SharedPtr\<XmlWriter\>\& | 出力したい [XmlWriter](../../../system.xml/xmlwriter/) です。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


指定された **args** を使用して IXPathNavigable 内の XML データを変換し、結果を [XmlWriter](../../../system.xml/xmlwriter/) に出力します。

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable インターフェイスを実装するオブジェクトです。これは、[XmlNode](../../../system.xml/xmlnode/)（通常は [XmlDocument](../../../system.xml/xmldocument/)）または変換対象のデータを含む XPathDocument のいずれかです。 |
| args | const SharedPtr\<XsltArgumentList\>\& | 変換の入力として使用される名前空間修飾引数を含む [XsltArgumentList](../../xsltargumentlist/)です。 |
| output | const SharedPtr\<XmlWriter\>\& | 出力したい [XmlWriter](../../../system.xml/xmlwriter/) です。 |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | XSLT **document()** 関数を解決するために使用される [XmlResolver](../../../system.xml/xmlresolver/)。この値が **nullptr** の場合、**document()** 関数は解決されません。このメソッドが完了した後、[XmlResolver](../../../system.xml/xmlresolver/) はキャッシュされません。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&) method


指定された **args** を使用して XPathNavigator 内の XML データを変換し、結果を [XmlReader](../../../system.xml/xmlreader/) に出力します。

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | 変換対象のデータを含む XPathNavigator です。 |
| args | const SharedPtr\<XsltArgumentList\>\& | 変換の入力として使用される名前空間修飾引数を含む [XsltArgumentList](../../xsltargumentlist/)です。 |

### ReturnValue

変換結果を含む [XmlReader](../../../system.xml/xmlreader/)です。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


指定された **args** を使用して XPathNavigator の XML データを変換し、結果を Stream に出力します。

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | 変換対象のデータを含む XPathNavigator です。 |
| args | const SharedPtr\<XsltArgumentList\>\& | 変換の入力として使用される名前空間修飾引数を含む [XsltArgumentList](../../xsltargumentlist/)です。 |
| 出力 | const SharedPtr\<IO::Stream\>\& | 出力したいストリームです。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


指定された **args** を使用して XPathNavigator の XML データを変換し、結果を Stream に出力します。

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | 変換対象のデータを含む XPathNavigator です。 |
| args | const SharedPtr\<XsltArgumentList\>\& | 変換の入力として使用される名前空間修飾引数を含む [XsltArgumentList](../../xsltargumentlist/)です。 |
| 出力 | const SharedPtr\<IO::Stream\>\& | 出力したいストリームです。 |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | XSLT **document()** 関数を解決するために使用される [XmlResolver](../../../system.xml/xmlresolver/)。この値が **nullptr** の場合、**document()** 関数は解決されません。このメソッドが完了した後、[XmlResolver](../../../system.xml/xmlresolver/) はキャッシュされません。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


指定された **args** を使用して XPathNavigator の XML データを変換し、結果を TextWriter に出力します。

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | 変換対象のデータを含む XPathNavigator です。 |
| args | const SharedPtr\<XsltArgumentList\>\& | 変換の入力として使用される名前空間修飾引数を含む [XsltArgumentList](../../xsltargumentlist/)です。 |
| 出力 | const SharedPtr\<IO::TextWriter\>\& | 出力したい TextWriter です。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


指定された **args** を使用して XPathNavigator の XML データを変換し、結果を TextWriter に出力します。

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | 変換対象のデータを含む XPathNavigator です。 |
| args | const SharedPtr\<XsltArgumentList\>\& | 変換の入力として使用される名前空間修飾引数を含む [XsltArgumentList](../../xsltargumentlist/)です。 |
| 出力 | const SharedPtr\<IO::TextWriter\>\& | 出力したい TextWriter です。 |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | XSLT **document()** 関数を解決するために使用される [XmlResolver](../../../system.xml/xmlresolver/)。この値が **nullptr** の場合、**document()** 関数は解決されません。このメソッドが完了した後、[XmlResolver](../../../system.xml/xmlresolver/) はキャッシュされません。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


指定された **args** を使用して XPathNavigator 内の XML データを変換し、結果を [XmlReader](../../../system.xml/xmlreader/) に出力します。

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | 変換対象のデータを含む XPathNavigator です。 |
| args | const SharedPtr\<XsltArgumentList\>\& | 変換の入力として使用される名前空間修飾引数を含む [XsltArgumentList](../../xsltargumentlist/)です。 |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | XSLT **document()** 関数を解決するために使用される [XmlResolver](../../../system.xml/xmlresolver/)。この値が **nullptr** の場合、**document()** 関数は解決されません。このメソッドが完了した後、[XmlResolver](../../../system.xml/xmlresolver/) はキャッシュされません。 |

### ReturnValue

変換結果を含む [XmlReader](../../../system.xml/xmlreader/)です。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


指定された args を使用して XPathNavigator 内の XML データを変換し、結果を [XmlWriter](../../../system.xml/xmlwriter/) に出力します。

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | 変換対象のデータを含む XPathNavigator です。 |
| args | const SharedPtr\<XsltArgumentList\>\& | 変換の入力として使用される名前空間修飾引数を含む [XsltArgumentList](../../xsltargumentlist/)です。 |
| output | const SharedPtr\<XmlWriter\>\& | 出力したい [XmlWriter](../../../system.xml/xmlwriter/) です。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


指定された args を使用して XPathNavigator 内の XML データを変換し、結果を [XmlWriter](../../../system.xml/xmlwriter/) に出力します。

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 入力 | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | 変換対象のデータを含む XPathNavigator です。 |
| args | const SharedPtr\<XsltArgumentList\>\& | 変換の入力として使用される名前空間修飾引数を含む [XsltArgumentList](../../xsltargumentlist/)です。 |
| output | const SharedPtr\<XmlWriter\>\& | 出力したい [XmlWriter](../../../system.xml/xmlwriter/) です。 |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | XSLT **document()** 関数を解決するために使用される [XmlResolver](../../../system.xml/xmlresolver/)。この値が **nullptr** の場合、**document()** 関数は解決されません。このメソッドが完了した後、[XmlResolver](../../../system.xml/xmlresolver/) はキャッシュされません。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const String\&, const String\&) method


入力ファイルの XML データを変換し、結果を出力ファイルに書き込みます。

```cpp
void System::Xml::Xsl::XslTransform::Transform(const String &inputfile, const String &outputfile)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| inputfile | const String\& | 変換対象のソースドキュメントの URLです。 |
| outputfile | const String\& | 出力ファイルの URLです。 |

## 参照

* Class [String](../../../system/string/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const String\&, const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


入力ファイルの XML データを変換し、結果を出力ファイルに書き込みます。

```cpp
void System::Xml::Xsl::XslTransform::Transform(const String &inputfile, const String &outputfile, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| inputfile | const String\& | 変換対象のソースドキュメントの URLです。 |
| outputfile | const String\& | 出力ファイルの URLです。 |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | XSLT **document()** 関数を解決するために使用される [XmlResolver](../../../system.xml/xmlresolver/)。この値が **nullptr** の場合、**document()** 関数は解決されません。メソッド [XslTransform::Transform](./) が完了した後、[XmlResolver](../../../system.xml/xmlresolver/) はキャッシュされません。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
