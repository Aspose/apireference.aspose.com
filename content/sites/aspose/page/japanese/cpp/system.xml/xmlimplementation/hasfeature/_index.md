---
title: "System::Xml::XmlImplementation::HasFeature メソッド"
linktitle: "HasFeature"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlImplementation::HasFeature メソッド。C++ で Document Object Model (DOM) 実装が特定の機能を実装しているかテストします。"
type: docs
weight: 300
url: /ja/cpp/system.xml/xmlimplementation/hasfeature/
---
## XmlImplementation::HasFeature method


Document [Object](../../../system/object/) Model (DOM) 実装が特定の機能を実装しているかテストします。

```cpp
bool System::Xml::XmlImplementation::HasFeature(const String &strFeature, const String &strVersion)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| strFeature | const String\& | テストする機能のパッケージ名。この名前は大文字小文字を区別しません。 |
| strVersion | const String\& | これはテスト用のパッケージ名のバージョン番号です。バージョンが指定されていない場合（**nullptr**）、機能の任意のバージョンをサポートするとメソッドは**true**を返します。 |

### ReturnValue

**true** if the feature is implemented in the specified version; otherwise, **false**.
## 備考



以下の表は**HasFeature**が**true**を返す組み合わせを示しています。 |||
|-|-|
| strFeature | strVersion |
| XML | 1.0 |
| XML | 2.0 |

## 参照

* Class [String](../../../system/string/)
* Class [XmlImplementation](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
