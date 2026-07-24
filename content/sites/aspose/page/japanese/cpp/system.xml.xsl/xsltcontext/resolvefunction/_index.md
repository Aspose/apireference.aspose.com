---
title: "System::Xml::Xsl::XsltContext::ResolveFunction メソッド"
linktitle: "ResolveFunction"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Xsl::XsltContext::ResolveFunction メソッド。派生クラスでオーバーライドされた場合、関数参照を解決し、その関数を表す IXsltContextFunction を返します。IXsltContextFunction は実行時に関数の戻り値を取得するために使用されます（C++）。"
type: docs
weight: 400
url: /ja/cpp/system.xml.xsl/xsltcontext/resolvefunction/
---
## XsltContext::ResolveFunction method


派生クラスでオーバーライドされた場合、関数参照を解決し、その関数を表す [IXsltContextFunction](../../ixsltcontextfunction/) を返します。[IXsltContextFunction](../../ixsltcontextfunction/) は実行時に関数の戻り値を取得するために使用されます。

```cpp
virtual SharedPtr<IXsltContextFunction> System::Xml::Xsl::XsltContext::ResolveFunction(String prefix, String name, ArrayPtr<System::Xml::XPath::XPathResultType> ArgTypes)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| prefix | String | [XPath](../../../system.xml.xpath/) 式に現れる関数のプレフィックスです。 |
| name | String | 関数の名前です。 |
| ArgTypes | ArrayPtr\<System::Xml::XPath::XPathResultType\> | 解決対象の関数の引数型の配列です。同名のメソッド（例えばオーバーロードされたメソッド）間で選択できるようにします。 |

### ReturnValue

関数を表す [IXsltContextFunction](../../ixsltcontextfunction/) です。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXsltContextFunction](../../ixsltcontextfunction/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [XPathResultType](../../../system.xml.xpath/xpathresulttype/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
