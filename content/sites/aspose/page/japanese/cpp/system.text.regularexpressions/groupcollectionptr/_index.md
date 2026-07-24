---
title: "System::Text::RegularExpressions::GroupCollectionPtr class"
linktitle: "GroupCollectionPtr"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::RegularExpressions::GroupCollectionPtr クラス。グループコレクションへのポインタです。この型は他のオブジェクトの削除を管理するポインタです。C++ ではスタック上に割り当て、値渡しまたは const 参照で関数に渡すべきです。"
type: docs
weight: 500
url: /ja/cpp/system.text.regularexpressions/groupcollectionptr/
---
## GroupCollectionPtr class


[Group](../group/) collection pointer. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
class GroupCollectionPtr : public System::SmartPtr<GroupCollection>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [GroupCollectionPtr](./groupcollectionptr/)() | ヌルポインタコンストラクタです。 |
| [GroupCollectionPtr](./groupcollectionptr/)(const SharedPtr\<GroupCollection\>\&) | 型変換コンストラクタです。 |
| [operator[]](./operator[]/)(size_t) const | [Group](../group/) アクセサです。 |
## 参照

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
