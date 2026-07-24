---
title: "System::Xml::Xsl::XsltContext::ResolveVariable メソッド"
linktitle: "ResolveVariable"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Xsl::XsltContext::ResolveVariable メソッド。派生クラスでオーバーライドされた場合、変数参照を解決し、C++ でその変数を表す IXsltContextVariable を返します。"
type: docs
weight: 500
url: /ja/cpp/system.xml.xsl/xsltcontext/resolvevariable/
---
## XsltContext::ResolveVariable method


派生クラスでオーバーライドされた場合、変数参照を解決し、変数を表す [IXsltContextVariable](../../ixsltcontextvariable/) を返します。

```cpp
virtual SharedPtr<IXsltContextVariable> System::Xml::Xsl::XsltContext::ResolveVariable(String prefix, String name)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| prefix | String | 変数が [XPath](../../../system.xml.xpath/) 式に現れるプレフィックス。 |
| name | String | 変数の名前。 |

### ReturnValue

実行時に変数を表す [IXsltContextVariable](../../ixsltcontextvariable/)。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXsltContextVariable](../../ixsltcontextvariable/)
* Class [String](../../../system/string/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
