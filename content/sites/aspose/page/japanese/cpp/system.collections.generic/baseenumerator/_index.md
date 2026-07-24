---
title: "System::Collections::Generic::BaseEnumerator クラス"
linktitle: "BaseEnumerator"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::BaseEnumerator クラス。STL 形式の型を C# 形式で使用できるようにラップする Enumerator の定義です。シーケンシャルイテレータの存在以外、コンテナ構造については何も前提としません。begin() と end() 関数を使用します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使ってインスタンスを作成しないでください。そうするとランタイムエラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数としてこのポインタを使用してください。"
type: docs
weight: 600
url: /ja/cpp/system.collections.generic/baseenumerator/
---
## BaseEnumerator class


[Enumerator](../baseset/) definition to wrap STL-styled types for C#-styled usage. Makes no assertions on container structure except for existance of sequental iterator. Uses begin() and end() functions. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<typename Container,typename Element>class BaseEnumerator : public System::Collections::Generic::IEnumerator<Element>
```


| パラメーター | 説明 |
| --- | --- |
| コンテナ | STL 形式のコンテナ型です。 |
| Element | 要素型。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [BaseEnumerator](./baseenumerator/)(const Object::ptr\&, Container\&) | イテレータを初期化します。 |
| [IsValid](./isvalid/)() const | [MoveNext()](./movenext/) が呼び出されたか、終了に達していないかをチェックします。 |
| [MoveNext](./movenext/)() override | 列挙子スタイルのインクリメント。 |
| [Reset](./reset/)() override | 要素を再列挙できるように列挙子をリセットします。 |

## 参照

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
