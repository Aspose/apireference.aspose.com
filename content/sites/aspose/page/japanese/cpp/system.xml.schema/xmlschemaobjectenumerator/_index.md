---
title: "System::Xml::Schema::XmlSchemaObjectEnumerator クラス"
linktitle: "XmlSchemaObjectEnumerator"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaObjectEnumerator クラス。C++ における XmlSchemaObjectCollection の列挙子を表します。"
type: docs
weight: 5200
url: /ja/cpp/system.xml.schema/xmlschemaobjectenumerator/
---
## XmlSchemaObjectEnumerator class


[XmlSchemaObjectCollection](../xmlschemaobjectcollection/) の列挙子を表します。

```cpp
class XmlSchemaObjectEnumerator : public System::Collections::Generic::IEnumerator<SharedPtr<System::Xml::Schema::XmlSchemaObject>>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | 現在のイテレータをクローンします。 |
| [Dispose](./dispose/)() override | 何もしません。 |
| [get_Current](./get_current/)() const override | コレクション内の現在の [XmlSchemaObject](../xmlschemaobject/) を返します。 |
| [MoveNext](./movenext/)() override | コレクション内の次の項目に移動します。 |
| [Reset](./reset/)() override | 列挙子をコレクションの先頭にリセットします。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [IEnumerator](../../system.collections.generic/ienumerator/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
