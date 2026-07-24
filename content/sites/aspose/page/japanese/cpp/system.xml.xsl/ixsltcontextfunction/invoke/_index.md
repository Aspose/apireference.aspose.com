---
title: "System::Xml::Xsl::IXsltContextFunction::Invoke メソッド"
linktitle: "Invoke"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Xsl::IXsltContextFunction::Invoke メソッド。C++ で指定されたコンテキストと引数を使用して関数を呼び出すためのメソッドを提供します。"
type: docs
weight: 500
url: /ja/cpp/system.xml.xsl/ixsltcontextfunction/invoke/
---
## IXsltContextFunction::Invoke method


指定されたコンテキストで、与えられた引数を使用して関数を呼び出すメソッドを提供します。

```cpp
virtual SharedPtr<Object> System::Xml::Xsl::IXsltContextFunction::Invoke(SharedPtr<XsltContext> xsltContext, ArrayPtr<SharedPtr<Object>> args, SharedPtr<System::Xml::XPath::XPathNavigator> docContext)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| xsltContext | SharedPtr\<XsltContext\> | 関数呼び出しのための XSLT コンテキスト。 |
| args | ArrayPtr\<SharedPtr\<Object\>\> | 関数呼び出しの引数。各引数は配列内の要素です。 |
| docContext | SharedPtr\<System::Xml::XPath::XPathNavigator\> | 関数呼び出しのコンテキストノード。 |

### ReturnValue

関数の戻り値を表す [Object](../../../system/object/)。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XsltContext](../../xsltcontext/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [IXsltContextFunction](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
