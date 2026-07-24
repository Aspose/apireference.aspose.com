---
title: "System::Xml::XPath::XPathNavigator::LookupPrefix メソッド"
linktitle: "LookupPrefix"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::LookupPrefix メソッド。C++ で指定された名前空間 URI に対して宣言されたプレフィックスを返します。"
type: docs
weight: 4800
url: /ja/cpp/system.xml.xpath/xpathnavigator/lookupprefix/
---
## XPathNavigator::LookupPrefix method


指定された名前空間URIに対して宣言されたプレフィックスを返します。

```cpp
String System::Xml::XPath::XPathNavigator::LookupPrefix(const String &namespaceURI) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| namespaceURI | const String\& | プレフィックスを解決するための名前空間 URI です。 |

### ReturnValue

指定された名前空間 URI に割り当てられた名前空間プレフィックスを含む [String](../../../system/string/)。割り当てがない場合は [String::Empty](../../../system/string/empty/) が返されます。返される [String](../../../system/string/) はアトム化されています。

## 参照

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
