---
title: "Aspose::Page::EPS::XMP::XmpMetadata class"
linktitle: "XmpMetadata"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::EPS::XMP::XmpMetadata クラス。C++ で XMP メタデータストリームへのアクセスを提供します。"
type: docs
weight: 200
url: /ja/cpp/aspose.page.eps.xmp/xmpmetadata/
---
## XmpMetadata class


[XMP](../) メタデータストリームへのアクセスを提供します。

```cpp
class XmpMetadata : public System::Collections::Generic::IDictionary<System::String, System::SharedPtr<XmpValue>>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(const System::String\&, const System::SharedPtr\<XmpValue\>\&) override | メタデータに値を追加します。 |
| [Add](./add/)(const System::String\&, const System::SharedPtr\<System::Object\>\&) | メタデータに値を追加します。 |
| [Add](./add/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) override | 辞書にキーと値のペアを追加します。 |
| [AddArrayItem](./addarrayitem/)(System::String, System::SharedPtr\<XmpValue\>) | 配列に値を追加します。値は配列の末尾に追加されます。 |
| [AddArrayItem](./addarrayitem/)(System::String, int32_t, System::SharedPtr\<XmpValue\>) | 指定されたインデックスで配列に値を追加します。 |
| [AddNamedValue](./addnamedvalue/)(System::String, System::String, System::SharedPtr\<XmpValue\>) | 構造体に名前付きの値を追加します。 |
| [Clear](./clear/)() override | メタデータをクリアします。 |
| [Contains](./contains/)(const System::String\&) const | キーがメタデータに含まれているか確認します。 |
| [Contains](./contains/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) const override | 指定されたキーと値のペアが辞書に含まれているか確認します。 |
| [ContainsKey](./containskey/)(const System::String\&) const override | この辞書が指定されたキーを含むかどうかを判断します。 |
| [CopyTo](./copyto/)(System::ArrayPtr\<System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\>, int32_t) override | コレクションの要素を配列にコピーします。 |
| [get_Count](./get_count/)() const override | コレクション内の要素数を取得します。 |
| [get_IsFixedSize](./get_isfixedsize/)() const | コレクションが固定サイズかどうかを確認します。 |
| [get_IsReadOnly](./get_isreadonly/)() const override | コレクションが読み取り専用かどうかを確認します。 |
| [get_IsSynchronized](./get_issynchronized/)() | コレクションが同期化されているかどうかを確認します。 |
| [get_Keys](./get_keys/)() const override | メタデータキーのコレクションを取得します。 |
| [get_NamespaceManager](./get_namespacemanager/)() | 名前空間マネージャーを取得します。 |
| [get_SyncRoot](./get_syncroot/)() const | コレクションの同期オブジェクトを取得します。 |
| [get_Values](./get_values/)() const override | メタデータ内の値を取得します。 |
| [GetEnumerator](./getenumerator/)() override | 辞書の列挙子を返します。 |
| [GetNamespaceUriByPrefix](./getnamespaceuribyprefix/)(System::String) | プレフィックスから名前空間 URI を返します。 |
| [GetPrefixByNamespaceUri](./getprefixbynamespaceuri/)(System::String) | 名前空間 URI によるプレフィックスを返します。 |
| [idx_get](./idx_get/)(const System::String\&) const override | メタデータからデータを取得します。 |
| [idx_set](./idx_set/)(const System::String\&, System::SharedPtr\<XmpValue\>) override | メタデータからデータを設定します。 |
| [RegisterNamespaceUri](./registernamespaceuri/)(System::String, System::String) | 名前空間 URI を登録します。 |
| [RegisterNamespaceUri](./registernamespaceuri/)(System::String, System::String, System::String) | 名前空間 URI を登録します。 |
| [Remove](./remove/)(const System::String\&) override | メタデータからエントリを削除します。 |
| [Remove](./remove/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) override | コレクションからキー/値のペアを削除します。 |
| [SetArrayItem](./setarrayitem/)(System::String, int32_t, System::SharedPtr\<XmpValue\>) | 配列に値を設定します。以前の値は新しいものに置き換えられます。 |
| [SetNamedValue](./setnamedvalue/)(System::String, System::String, System::SharedPtr\<XmpValue\>) | 構造体に名前付き値を設定します。既に存在する場合、以前の名前付き値は新しいものに置き換えられます。 |
| [TryGetValue](./trygetvalue/)(const System::String\&, System::SharedPtr\<XmpValue\>\&) const override | 辞書内でキーを検索し、見つかった場合は値を取得します。 |
## 参照

* Class [IDictionary](../../system.collections.generic/idictionary/)
* Namespace [Aspose::Page::EPS::XMP](../)
* Library [Aspose.Page for C++](../../)
