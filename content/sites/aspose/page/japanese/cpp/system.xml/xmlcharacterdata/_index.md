---
title: "System::Xml::XmlCharacterData クラス"
linktitle: "XmlCharacterData"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlCharacterData クラス。C++の複数のクラスで使用されるテキスト操作メソッドを提供します。"
type: docs
weight: 900
url: /ja/cpp/system.xml/xmlcharacterdata/
---
## XmlCharacterData class


複数のクラスで使用されるテキスト操作メソッドを提供します。

```cpp
class XmlCharacterData : public System::Xml::XmlLinkedNode
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [AppendData](./appenddata/)(String) | 指定された文字列をノードの文字データの末尾に追加します。 |
| virtual [DeleteData](./deletedata/)(int32_t, int32_t) | ノードから文字の範囲を削除します。 |
| virtual [get_Data](./get_data/)() | ノードのデータを返します。 |
| [get_InnerText](./get_innertext/)() override | ノードとそのすべての子ノードの連結された値を返します。 |
| virtual [get_Length](./get_length/)() | データの長さ（文字数）を返します。 |
| [get_Value](./get_value/)() override | ノードの値を返します。 |
| virtual [InsertData](./insertdata/)(int32_t, String) | 指定された文字オフセットに指定された文字列を挿入します。 |
| virtual [ReplaceData](./replacedata/)(int32_t, int32_t, String) | 指定されたオフセットから始まる指定された文字数を、指定された文字列に置き換えます。 |
| virtual [set_Data](./set_data/)(String) | ノードのデータを設定します。 |
| [set_InnerText](./set_innertext/)(String) override | ノードとそのすべての子ノードの連結された値を設定します。 |
| [set_Value](./set_value/)(String) override | ノードの値を設定します。 |
| virtual [Substring](./substring/)(int32_t, int32_t) | 指定された範囲から完全な文字列の部分文字列を取得します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 参照

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
