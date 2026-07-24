---
title: "System::Xml::XmlNamespaceManager::LookupNamespace メソッド"
linktitle: "LookupNamespace"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlNamespaceManager::LookupNamespace メソッド。C++ で指定されたプレフィックスの名前空間 URI を返します。"
type: docs
weight: 800
url: /ja/cpp/system.xml/xmlnamespacemanager/lookupnamespace/
---
## XmlNamespaceManager::LookupNamespace method


指定されたプレフィックスの名前空間 URI を返します。

```cpp
String System::Xml::XmlNamespaceManager::LookupNamespace(const String &prefix) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| prefix | const String\& | 解決したい名前空間 URI を持つプレフィックスです。デフォルト名前空間に一致させるには、[String::Empty](../../../system/string/empty/) を渡してください。 |

### ReturnValue

マッピングされた名前空間がない場合は **nullptr**、それ以外は **prefix** の名前空間 URI です。返される文字列はアトム化されています。アトム化された文字列の詳細については、[XmlNameTable](../../xmlnametable/) クラスを参照してください。

## 参照

* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
