---
title: "System::Xml::Schema::XmlSchemaCollectionEnumerator クラス"
linktitle: "XmlSchemaCollectionEnumerator"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaCollectionEnumerator クラス。コレクション上でのシンプルな反復をサポートします。このクラスは C++ では継承できません。"
type: docs
weight: 1600
url: /ja/cpp/system.xml.schema/xmlschemacollectionenumerator/
---
## XmlSchemaCollectionEnumerator class


コレクションに対するシンプルな反復をサポートします。このクラスは継承できません。

```cpp
class XmlSchemaCollectionEnumerator : public System::Collections::Generic::IEnumerator<SharedPtr<System::Xml::Schema::XmlSchema>>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | 現在のイテレータをクローンします。 |
| [Dispose](./dispose/)() override | 何もしません。 |
| [get_Current](./get_current/)() const override | コレクション内の現在の[XmlSchema](../xmlschema/)を返します。 |
| [MoveNext](./movenext/)() override | 列挙子をコレクション内の次のスキーマへ進めます。 |
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
