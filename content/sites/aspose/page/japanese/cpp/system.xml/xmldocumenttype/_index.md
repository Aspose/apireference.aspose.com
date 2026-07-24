---
title: "System::Xml::XmlDocumentType クラス"
linktitle: "XmlDocumentType"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlDocumentType クラス。C++ における文書型宣言を表します。"
type: docs
weight: 1600
url: /ja/cpp/system.xml/xmldocumenttype/
---
## XmlDocumentType class


文書型宣言を表します。

```cpp
class XmlDocumentType : public System::Xml::XmlLinkedNode
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | このノードの複製を作成します。 |
| [get_Entities](./get_entities/)() | 文書型宣言で宣言された [XmlEntity](../xmlentity/) ノードのコレクションを返します。 |
| [get_InternalSubset](./get_internalsubset/)() | DOCTYPE 宣言の文書型定義 (DTD) 内部サブセットの値を返します。 |
| [get_IsReadOnly](./get_isreadonly/)() override | ノードが読み取り専用かどうかを示す値を返します。 |
| [get_LocalName](./get_localname/)() override | ノードのローカル名を返します。 |
| [get_Name](./get_name/)() override | ノードの修飾名を返します。 |
| [get_NodeType](./get_nodetype/)() override | 現在のノードの型を返します。 |
| [get_Notations](./get_notations/)() | 文書型宣言に存在する [XmlNotation](../xmlnotation/) ノードのコレクションを返します。 |
| [get_PublicId](./get_publicid/)() | DOCTYPE 宣言の公開識別子の値を返します。 |
| [get_SystemId](./get_systemid/)() | DOCTYPE 宣言のシステム識別子の値を返します。 |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | ノードのすべての子を指定された [XmlWriter](../xmlwriter/) に保存します。[XmlDocumentType](./) ノードに対しては、このメソッドは効果がありません。 |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | ノードを指定された [XmlWriter](../xmlwriter/) に保存します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
