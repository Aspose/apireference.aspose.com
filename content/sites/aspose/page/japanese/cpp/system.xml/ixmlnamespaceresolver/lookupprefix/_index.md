---
title: "System::Xml::IXmlNamespaceResolver::LookupPrefix メソッド"
linktitle: "LookupPrefix"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::IXmlNamespaceResolver::LookupPrefix メソッド。指定された名前空間 URI にマッピングされているプレフィックスを C++ で返します。"
type: docs
weight: 300
url: /ja/cpp/system.xml/ixmlnamespaceresolver/lookupprefix/
---
## IXmlNamespaceResolver::LookupPrefix method


指定された名前空間 URI にマッピングされたプレフィックスを返します。

```cpp
virtual String System::Xml::IXmlNamespaceResolver::LookupPrefix(const String &namespaceName)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| namespaceName | const String\& | 検索したいプレフィックスが属する名前空間 URI。 |

### ReturnValue

名前空間 URI にマッピングされているプレフィックス；名前空間 URI がプレフィックスにマッピングされていない場合は **nullptr**。

## 参照

* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
