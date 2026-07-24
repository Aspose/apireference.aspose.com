---
title: "System::Net::CookieComparer クラス"
linktitle: "CookieComparer"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::CookieComparer クラス。Cookie クラスのインスタンスを比較するために使用されます。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数としてこのポインタを使用してください。"
type: docs
weight: 300
url: /ja/cpp/system.net/cookiecomparer/
---
## CookieComparer class


Used to compare the [Cookie](../cookie/) class instances. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class CookieComparer : public System::Collections::Generic::IComparer<System::SharedPtr<System::Net::Cookie>>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Compare](./compare/)(args_type, args_type) const override | 指定されたオブジェクトを比較します。 |
| static [get_Instance](./get_instance/)() | RTTI 情報。 |
## 参照

* Class [IComparer](../../system.collections.generic/icomparer/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
