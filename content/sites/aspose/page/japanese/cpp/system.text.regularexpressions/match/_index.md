---
title: "System::Text::RegularExpressions::Match クラス"
linktitle: "Match"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::RegularExpressions::Match クラス。文字列に対する正規表現の単一マッチ。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。実行時エラーやアサーション失敗の原因になります。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 600
url: /ja/cpp/system.text.regularexpressions/match/
---
## Match class


[Single](../../system/single/) match of regexp over string. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Match : public System::Text::RegularExpressions::Group
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [AddCapture](./addcapture/)(const CapturePtr\&) | マッチにキャプチャを追加します。 |
| [AddGroup](./addgroup/)(const GroupPtr\&) | マッチにグループを追加します。 |
| static [get_Empty](./get_empty/)() | 空のマッチアクセサ。 |
| [get_Groups](./get_groups/)() | グループリストを取得します。 |
| [Match](./match/)(const UStringPtr\&, int, int) | コンストラクタ。 |
| [NextMatch](./nextmatch/)() | マッチの反復処理。 |
| virtual [Result](./result/)(const String\&) | サブマッチ参照をその値に置き換えて文字列をフォーマットします。 |
| [SetMappedIndexes](./setmappedindexes/)(const std::vector\<int\>\&) |  |
## 参照

* Class [Group](../group/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
