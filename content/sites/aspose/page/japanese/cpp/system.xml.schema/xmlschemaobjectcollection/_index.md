---
title: "System::Xml::Schema::XmlSchemaObjectCollection クラス"
linktitle: "XmlSchemaObjectCollection"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaObjectCollection クラス。C++ における XmlSchemaObjects のコレクションです。"
type: docs
weight: 5100
url: /ja/cpp/system.xml.schema/xmlschemaobjectcollection/
---
## XmlSchemaObjectCollection class


XmlSchemaObjects のコレクションです。

```cpp
class XmlSchemaObjectCollection : public System::Collections::CollectionBase<SharedPtr<System::Xml::Schema::XmlSchemaObject>>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(const SharedPtr\<XmlSchemaObject\>\&) | [XmlSchemaObject](../xmlschemaobject/) を [XmlSchemaObjectCollection](./) に追加します。 |
| [Contains](./contains/)(const SharedPtr\<XmlSchemaObject\>\&) | 指定された [XmlSchemaObject](../xmlschemaobject/) が [XmlSchemaObjectCollection](./) に含まれているかどうかを示します。 |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchemaObject\>\>\&, int32_t) | コレクションからすべての XmlSchemaObjects を、指定されたインデックスから開始して、与えられた配列にコピーします。 |
| [GetEnumerator](./getenumerator/)() override | [XmlSchemaObjectCollection](./) に含まれる XmlSchemaObjects を反復処理するための列挙子を返します。 |
| virtual [idx_get](./idx_get/)(int32_t) | 指定されたインデックスにある [XmlSchemaObject](../xmlschemaobject/) を返します。 |
| virtual [idx_set](./idx_set/)(int32_t, SharedPtr\<XmlSchemaObject\>) | 指定されたインデックスにある [XmlSchemaObject](../xmlschemaobject/) を設定します。 |
| [IndexOf](./indexof/)(const SharedPtr\<XmlSchemaObject\>\&) | 指定された [XmlSchemaObject](../xmlschemaobject/) に対応するコレクションのインデックスを返します。 |
| [Insert](./insert/)(int32_t, const SharedPtr\<XmlSchemaObject\>\&) | [XmlSchemaObject](../xmlschemaobject/) を [XmlSchemaObjectCollection](./) に挿入します。 |
| [Remove](./remove/)(const SharedPtr\<XmlSchemaObject\>\&) | [XmlSchemaObject](../xmlschemaobject/) を [XmlSchemaObjectCollection](./) から削除します。 |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | n 番目のテンプレート引数を弱参照ポインタに設定します（共有ではなく）。コンテナ内のポインタを弱モードに切り替えることができます。 |
| [XmlSchemaObjectCollection](./xmlschemaobjectcollection/)() | 新しい [XmlSchemaObjectCollection](./) クラスのインスタンスを初期化します。 |
| [XmlSchemaObjectCollection](./xmlschemaobjectcollection/)(const SharedPtr\<XmlSchemaObject\>\&) | [XmlSchemaObject](../xmlschemaobject/) を受け取る新しい [XmlSchemaObjectCollection](./) クラスのインスタンスを初期化します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [CollectionBase](../../system.collections/collectionbase/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
