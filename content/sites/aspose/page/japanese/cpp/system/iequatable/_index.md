---
title: "System::IEquatable クラス"
linktitle: "IEquatable"
second_title: "C++ 用 Aspose.Page"
description: "System::IEquatable クラス。二つのオブジェクトの等価性を判定するメソッドを定義します。このクラスのオブジェクトは、System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。このクラスは常に System::SmartPtr ポインタでラップし、そのポインタを C++ の関数への引数として使用してください。"
type: docs
weight: 3700
url: /ja/cpp/system/iequatable/
---
## IEquatable class


二つのオブジェクトの等価性を判定するメソッドを定義します。このクラスのオブジェクトは、[System::MakeObject()](../makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
template<typename T>class IEquatable : public virtual System::Object
```


| パラメーター | 説明 |
| --- | --- |
| T | 比較対象オブジェクトの型 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Equals](./equals/)(T) | 現在のオブジェクトと指定されたオブジェクトが等しいかどうかを判定します。 |

## 参照

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
