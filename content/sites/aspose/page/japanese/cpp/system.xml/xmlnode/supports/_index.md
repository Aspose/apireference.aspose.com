---
title: "System::Xml::XmlNode::Supports メソッド"
linktitle: "Supports"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlNode::Supports メソッド。C++ で DOM 実装が特定の機能を実装しているかどうかをテストします。"
type: docs
weight: 4400
url: /ja/cpp/system.xml/xmlnode/supports/
---
## XmlNode::Supports method


DOM 実装が特定の機能を実装しているかテストします。

```cpp
virtual bool System::Xml::XmlNode::Supports(String feature, String version)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 機能 | String | テストする機能のパッケージ名。この名前は大文字小文字を区別しません。 |
| バージョン | String | テストするパッケージ名のバージョン番号です。バージョンが指定されていない（null）の場合、任意のバージョンの機能をサポートしているとみなされ、メソッドは true を返します。 |

### ReturnValue

**true** if the feature is implemented in the specified version; otherwise, **false**.
## 備考



以下の表は **true** を返す組み合わせを示しています。 |||
|-|-|
| 機能 | バージョン |
| XML | 1.0 |
| XML | 2.0 |

## 参照

* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
