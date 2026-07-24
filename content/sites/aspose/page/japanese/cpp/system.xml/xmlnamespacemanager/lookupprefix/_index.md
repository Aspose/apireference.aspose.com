---
title: "System::Xml::XmlNamespaceManager::LookupPrefix メソッド"
linktitle: "LookupPrefix"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlNamespaceManager::LookupPrefix メソッド。C++ で指定された名前空間 URI に対して宣言されたプレフィックスを検索します。"
type: docs
weight: 900
url: /ja/cpp/system.xml/xmlnamespacemanager/lookupprefix/
---
## XmlNamespaceManager::LookupPrefix method


指定された名前空間 URI に対して宣言されたプレフィックスを検索します。

```cpp
String System::Xml::XmlNamespaceManager::LookupPrefix(const String &uri) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| uri | const String\& | プレフィックスに対して解決する名前空間です。 |

### ReturnValue

一致するプレフィックス。マッピングされたプレフィックスがない場合、メソッドは [String::Empty](../../../system/string/empty/) を返します。null 値が提供された場合は **nullptr** が返されます。

## 参照

* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
