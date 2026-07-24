---
title: "System::Text::RegularExpressions::Group class"
linktitle: "Group"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::RegularExpressions::Group class. 単一のキャプチャグループによるマッチングの結果です。 このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。 スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうすると実行時エラーやアサーション失敗が発生します。 常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数に引数として渡す際にそのポインタを使用してください。"
type: docs
weight: 300
url: /ja/cpp/system.text.regularexpressions/group/
---
## Group class


単一のキャプチャグループによるマッチングの結果です。 このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。 スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうすると実行時エラーやアサーション失敗が発生します。 常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数に引数として渡す際にそのポインタを使用してください。

```cpp
class Group : public System::Text::RegularExpressions::Capture
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [AddCapture](./addcapture/)(const CapturePtr\&) | キャプチャをグループに追加します。 |
| [get_Captures](./get_captures/)() | 利用可能なキャプチャを取得します。 |
| [get_Success](./get_success/)() | このグループのキャプチャが成功したかどうかを確認します。 |
| [Group](./group/)(const UStringPtr\&, int, int) | コンストラクタ。 |
| [Group](./group/)() | 空のグループのコンストラクタです。 |
## 参照

* Class [Capture](../capture/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
