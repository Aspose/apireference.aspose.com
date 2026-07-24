---
title: "System::Collections::IEnumerator クラス"
linktitle: "IEnumerator"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::IEnumerator クラス。列挙子のインターフェイスで、いくつかの要素を反復処理するために使用できます。このクラスのオブジェクトは、System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に System::SmartPtr ポインタでラップし、そのポインタを関数への引数として使用してください。"
type: docs
weight: 600
url: /ja/cpp/system.collections/ienumerator/
---
## IEnumerator class


列挙子のインターフェイスで、いくつかの要素を反復処理するために使用できます。このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class IEnumerator : public virtual System::IDisposable,
                    public virtual System::Object
```


| パラメーター | 説明 |
| --- | --- |
| T | 要素型。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Current](./current/)() const | 現在の要素を取得します。 |
| virtual [get_Current](./get_current/)() const | 現在の要素を取得します。 |
| virtual [MoveNext](./movenext/)() | 列挙子を次の要素へ移動します。以前に要素が参照されていない場合、利用可能な最初の要素を参照に設定します。コンテナの末尾に達した場合は何もしません。 |
| virtual [Reset](./reset/)() | 列挙子を最初の要素の前の位置にリセットします。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [ValueType](./valuetype/) | RTTI 情報。 |

## 参照

* Class [IDisposable](../../system/idisposable/)
* Class [Object](../../system/object/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
