---
title: "System::Xml::XmlAttributeCollection class"
linktitle: "XmlAttributeCollection"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlAttributeCollection クラスです。C++ で名前またはインデックスでアクセスできる属性のコレクションを表します。"
type: docs
weight: 700
url: /ja/cpp/system.xml/xmlattributecollection/
---
## XmlAttributeCollection class


名前またはインデックスでアクセスできる属性のコレクションを表します。

```cpp
class XmlAttributeCollection : public System::Xml::XmlNamedNodeMap
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Append](./append/)(const SharedPtr\<XmlAttribute\>\&) | 指定された属性をコレクションの最後のノードとして挿入します。 |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&, int32_t) | このコレクションからすべての [XmlAttribute](../xmlattribute/) オブジェクトを指定された配列にコピーします。 |
| [idx_get](./idx_get/)(int32_t) | 指定されたインデックスの属性を返します。 |
| [idx_get](./idx_get/)(const String\&) | 指定された名前の属性を返します。 |
| [idx_get](./idx_get/)(const String\&, const String\&) | 指定されたローカル名と名前空間の Uniform Resource Identifier (URI) を持つ属性を返します。 |
| [InsertAfter](./insertafter/)(const SharedPtr\<XmlAttribute\>\&, const SharedPtr\<XmlAttribute\>\&) | 指定された属性を、指定された参照属性の直後に挿入します。 |
| [InsertBefore](./insertbefore/)(const SharedPtr\<XmlAttribute\>\&, const SharedPtr\<XmlAttribute\>\&) | 指定された属性を、指定された参照属性の直前に挿入します。 |
| [Prepend](./prepend/)(const SharedPtr\<XmlAttribute\>\&) | 指定された属性をコレクションの最初のノードとして挿入します。 |
| [Remove](./remove/)(const SharedPtr\<XmlAttribute\>\&) | コレクションから指定された属性を削除します。 |
| [RemoveAll](./removeall/)() | コレクションからすべての属性を削除します。 |
| [RemoveAt](./removeat/)(int32_t) | コレクションから指定されたインデックスに対応する属性を削除します。 |
| [SetNamedItem](./setnameditem/)(SharedPtr\<XmlNode\>) override | [XmlNode](../xmlnode/) を、その [XmlNode::get_Name](../xmlnode/get_name/) の結果を使用して追加します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [XmlNamedNodeMap](../xmlnamednodemap/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
