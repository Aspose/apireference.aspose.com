---
title: "System::Xml::XmlNodeList クラス"
linktitle: "XmlNodeList"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlNodeList クラス。C++ におけるノードの順序付けされたコレクションを表します。"
type: docs
weight: 2700
url: /ja/cpp/system.xml/xmlnodelist/
---
## XmlNodeList class


ノードの順序付けされたコレクションを表します。

```cpp
class XmlNodeList : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XmlNode>>,
                    public System::IDisposable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [get_Count](./get_count/)() | [XmlNodeList](./) のノード数を返します。 |
| virtual [GetEnumerator](./getenumerator/)() | [XmlNodeList](./) のノードコレクションの反復処理をサポートします。 |
| virtual [idx_get](./idx_get/)(int32_t) | 指定されたインデックスのノードを返します。 |
| virtual [Item](./item/)(int32_t) | 指定されたインデックスのノードを取得します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 参照

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
