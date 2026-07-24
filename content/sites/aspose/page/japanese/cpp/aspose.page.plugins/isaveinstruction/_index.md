---
title: "Aspose::Page::Plugins::ISaveInstruction クラス"
linktitle: "ISaveInstruction"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::Plugins::ISaveInstruction クラス。具体的なプラグインオプションが C++ で実装すべき共通メンバーを定義する、一般的な保存指示インターフェイスです。"
type: docs
weight: 1000
url: /ja/cpp/aspose.page.plugins/isaveinstruction/
---
## ISaveInstruction class


具体的なプラグインオプションが実装すべき共通メンバーを定義する汎用保存指示インターフェイスです。

```cpp
class ISaveInstruction : public virtual System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [AddSaveDataSource](./addsavedatasource/)(System::SharedPtr\<IDataSource\>) | 新しい結果保存対象を追加します。 |
| virtual [get_SaveTargetsCollection](./get_savetargetscollection/)() | 操作結果を保存するために追加された対象（ファイルまたはストリーム データ ソース）のコレクションを取得します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
