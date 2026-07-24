---
title: "System::Xml::Xsl::IXsltContextVariable::Evaluate メソッド"
linktitle: "Evaluate"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Xsl::IXsltContextVariable::Evaluate メソッド。実行時に変数を評価し、変数の値を表すオブジェクトを C++ で返します。"
type: docs
weight: 100
url: /ja/cpp/system.xml.xsl/ixsltcontextvariable/evaluate/
---
## IXsltContextVariable::Evaluate method


変数を実行時に評価し、変数の値を表すオブジェクトを返します。

```cpp
virtual SharedPtr<Object> System::Xml::Xsl::IXsltContextVariable::Evaluate(SharedPtr<XsltContext> xsltContext)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| xsltContext | SharedPtr\<XsltContext\> | 変数の実行コンテキストを表す [XsltContext](../../xsltcontext/) です。 |

### ReturnValue

変数の値を表す [Object](../../../system/object/) です。返され得る型には数値、文字列、[Boolean](../../../system/boolean/)、ドキュメントフラグメント、またはノードセットが含まれます。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XsltContext](../../xsltcontext/)
* Class [IXsltContextVariable](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
