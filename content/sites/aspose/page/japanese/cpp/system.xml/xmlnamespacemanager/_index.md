---
title: "System::Xml::XmlNamespaceManager クラス"
linktitle: "XmlNamespaceManager"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlNamespaceManager クラス。名前空間をコレクションに解決、追加、削除し、C++ でこれらの名前空間のスコープ管理を提供します。"
type: docs
weight: 2300
url: /ja/cpp/system.xml/xmlnamespacemanager/
---
## XmlNamespaceManager class


コレクションに名前空間を解決、追加、削除し、これらの名前空間のスコープ管理を提供します。

```cpp
class XmlNamespaceManager : public System::Xml::IXmlNamespaceResolver,
                            public System::Collections::Generic::IEnumerable<String>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [AddNamespace](./addnamespace/)(String, String) | 指定された名前空間をコレクションに追加します。 |
| virtual [get_DefaultNamespace](./get_defaultnamespace/)() | デフォルト名前空間の名前空間 URI を返します。 |
| virtual [get_NameTable](./get_nametable/)() | このオブジェクトに関連付けられた [XmlNameTable](../xmlnametable/) を返します。 |
| [GetEnumerator](./getenumerator/)() override | [XmlNamespaceManager](./) の名前空間を反復処理するために使用する列挙子を返します。 |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | プレフィックスでキー付けされた名前空間名のコレクションを返します。これを使用して現在のスコープ内の名前空間を列挙できます。 |
| virtual [HasNamespace](./hasnamespace/)(String) | 指定されたプレフィックスが現在プッシュされたスコープに対して名前空間が定義されているかどうかを示す値を返します。 |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | 指定されたプレフィックスの名前空間 URI を返します。 |
| [LookupPrefix](./lookupprefix/)(const String\&) override | 指定された名前空間 URI に対して宣言されたプレフィックスを検索します。 |
| virtual [PopScope](./popscope/)() | スタックから名前空間スコープをポップします。 |
| virtual [PushScope](./pushscope/)() | スタックに名前空間スコープをプッシュします。 |
| virtual [RemoveNamespace](./removenamespace/)(String, String) | 指定されたプレフィックスに対する指定された名前空間を削除します。 |
| [XmlNamespaceManager](./xmlnamespacemanager/)(const SharedPtr\<XmlNameTable\>\&) | 指定された [XmlNameTable](../xmlnametable/) を使用して、[XmlNamespaceManager](./) クラスの新しいインスタンスを初期化します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
