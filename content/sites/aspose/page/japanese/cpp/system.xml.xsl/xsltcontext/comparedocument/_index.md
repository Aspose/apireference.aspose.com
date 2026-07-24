---
title: "System::Xml::Xsl::XsltContext::CompareDocument メソッド"
linktitle: "CompareDocument"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Xsl::XsltContext::CompareDocument メソッド。派生クラスでオーバーライドされた場合、C++ の XSLT プロセッサ（つまり XslTransform クラス）によってドキュメントが読み込まれた順序に基づいて、2 つのドキュメントの基本 Uniform Resource Identifiers（URI）を比較します。"
type: docs
weight: 100
url: /ja/cpp/system.xml.xsl/xsltcontext/comparedocument/
---
## XsltContext::CompareDocument method


派生クラスでオーバーライドされた場合、XSLT プロセッサ（つまり [XslTransform](../../xsltransform/) クラス）によってドキュメントが読み込まれた順序に基づいて、2 つのドキュメントの基本 Uniform Resource Identifiers（URI）を比較します。

```cpp
virtual int32_t System::Xml::Xsl::XsltContext::CompareDocument(String baseUri, String nextbaseUri)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| baseUri | String | 比較対象となる最初のドキュメントの基本 URI。 |
| nextbaseUri | String | 比較対象となる2番目のドキュメントの基本 URI。 |

### ReturnValue

2 つの基本 URI の相対順序を示す整数値：**baseUri** が **nextbaseUri** の前にある場合は -1、2 つの基本 URI が同一の場合は 0、**baseUri** が **nextbaseUri** の後にある場合は 1。

## 参照

* Class [String](../../../system/string/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
