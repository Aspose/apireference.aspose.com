---
title: "System::Xml::XPath::XPathNodeType 列挙型"
linktitle: "XPathNodeType"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XPath::XPathNodeType 列挙型。C++ の XPathNavigator クラスから返される可能性のある XPath ノードタイプを定義します。"
type: docs
weight: 1100
url: /ja/cpp/system.xml.xpath/xpathnodetype/
---
## XPathNodeType enum


[XPath](../) ノードタイプを定義し、[XPathNavigator](../xpathnavigator/) クラスから返されることができます。

```cpp
enum class XPathNodeType
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| ルート | 0 | XML ドキュメントまたはノードツリーのルートノードです。 |
| Element | 1 | 要素、たとえば **<element>**。 |
| Attribute | 2 | 属性、たとえば **id='123'**。 |
| 名前空間 | 3 | 名前空間、たとえば **xmlns=\"namespace\"**。 |
| Text | 4 | ノードのテキスト内容。Document [Object](../../system/object/) Model (DOM) の [Text](../../system.text/) および CDATA ノードタイプに相当します。少なくとも1文字を含みます。 |
| SignificantWhitespace | 5 | 空白文字を含み、**xml:space** が **preserve** に設定されたノード。 |
| Whitespace | 6 | 空白文字のみを含み、重要な空白がないノード。空白文字は **'\\x20'**, **'\\x0d'**, **'\\x0a'**, **'\\x09'** です。 |
| ProcessingInstruction | 7 | 処理指示、たとえば **<?pi test?>**。これは XML 宣言を含みません。XML 宣言は [XPathNavigator](../xpathnavigator/) クラスからは見えません。 |
| Comment | 8 | コメント、たとえば ****。 |
| All | 9 | 任意の [XPathNodeType](./) ノードタイプ。 |

## 参照

* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
