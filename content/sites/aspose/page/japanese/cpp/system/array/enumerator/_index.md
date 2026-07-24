---
title: "System::Array::Enumerator クラス"
linktitle: "列挙子"
second_title: "C++ 用 Aspose.Page"
description: "System::Array::Enumerator クラス。Array オブジェクトの要素の列挙を可能にする IEnumerator インターフェイスを実装しています。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数としてこのポインタを使用してください。"
type: docs
weight: 6800
url: /ja/cpp/system/array/enumerator/
---
## Enumerator class


IEnumerator インターフェイスを実装し、[Array](../) オブジェクトの要素の列挙を可能にします。このクラスのオブジェクトは [System::MakeObject()](../../makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../smartptr/) ポインタでラップし、関数の引数としてこのポインタを使用してください。

```cpp
class Enumerator : public virtual System::Object,
                   public System::Collections::Generic::IEnumerator<T>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Enumerator](./enumerator/)(const SharedPtr\<Array\<T\>\>\&) | 指定された配列を表す新しい [Enumerator](./) オブジェクトを構築します。 |
| [get_Current](./get_current/)() const override | 現在の要素のコピーを返します。 |
| [MoveNext](./movenext/)() override | 現在の要素のインデックスが配列の最後の要素を指していないかチェックし、指していない場合はインデックスを進めます。 |
| [Reset](./reset/)() override | 現在の要素のインデックスをリセットします。 |
| virtual [~Enumerator](./~enumerator/)() | デストラクタ。 |
## 参照

* Class [Object](../../object/)
* Class [IEnumerator](../../../system.collections.generic/ienumerator/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
