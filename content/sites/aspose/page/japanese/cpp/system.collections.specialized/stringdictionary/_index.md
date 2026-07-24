---
title: "System::Collections::Specialized::StringDictionary クラス"
linktitle: "StringDictionary"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Specialized::StringDictionary クラス。文字列から文字列への辞書。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 500
url: /ja/cpp/system.collections.specialized/stringdictionary/
---
## StringDictionary class


[String](../../system/string/) to string dictionary. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class StringDictionary : public System::Collections::Generic::Dictionary<String, String>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [idx_get](./idx_get/)(const String\&) const override | 特定のキーに対応する値を取得します。 |
## 参照

* Class [Dictionary](../../system.collections.generic/dictionary/)
* Namespace [System::Collections::Specialized](../)
* Library [Aspose.Page for C++](../../)
