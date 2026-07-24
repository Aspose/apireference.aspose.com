---
title: "System::Xml::XPath::XPathNavigator::LookupNamespace メソッド"
linktitle: "LookupNamespace"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::LookupNamespace メソッド。C++ で指定されたプレフィックスに対する名前空間 URI を返します。"
type: docs
weight: 4700
url: /ja/cpp/system.xml.xpath/xpathnavigator/lookupnamespace/
---
## XPathNavigator::LookupNamespace method


指定されたプレフィックスの名前空間 URI を返します。

```cpp
String System::Xml::XPath::XPathNavigator::LookupNamespace(const String &prefix) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| prefix | const String\& | 解決したい名前空間 URI を持つプレフィックスです。デフォルト名前空間に一致させるには、[String::Empty](../../../system/string/empty/) を渡してください。 |

### ReturnValue

指定された名前空間プレフィックスに割り当てられた名前空間 URI を含む [String](../../../system/string/)；割り当てがない場合は **nullptr**。返される [String](../../../system/string/) はアトム化されています。

## 参照

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
