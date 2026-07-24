---
title: "System::Collections::Generic::ReverseEnumerator クラス"
linktitle: "ReverseEnumerator"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::ReverseEnumerator クラス。コンテナを逆方向に反復処理する列挙子です。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数への引数として使用してください。"
type: docs
weight: 3800
url: /ja/cpp/system.collections.generic/reverseenumerator/
---
## ReverseEnumerator class


[Enumerator](../baseset/) that reverse-iterates through container. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<typename Container,typename Element>class ReverseEnumerator : public System::Collections::Generic::IEnumerator<typename Container::value_type>
```


| パラメーター | 説明 |
| --- | --- |
| コンテナ | 反復処理するためのコンテナ。 |
| Element | 要素型。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Current](./get_current/)() const override | 現在の要素を取得します。 |
| [IsValid](./isvalid/)() const | [MoveNext()](./movenext/) が呼び出されたか、終了に達していないかをチェックします。 |
| [MoveNext](./movenext/)() override | 列挙子スタイルのインクリメント。 |
| [Reset](./reset/)() override | 要素を再列挙できるように列挙子をリセットします。 |
| [ReverseEnumerator](./reverseenumerator/)(const Object::ptr\&, Container\&) | イテレータを初期化します。 |
| virtual [~ReverseEnumerator](./~reverseenumerator/)() | デストラクタ。 |

## 参照

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
