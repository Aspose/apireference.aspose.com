---
title: "System::SmartPtrInfo クラス"
linktitle: "SmartPtrInfo"
second_title: "C++ 用 Aspose.Page"
description: "System::SmartPtrInfo クラス。最終型を知らなくても SmartPtr'' の内容をテストおよび変更するためのサービスクラスです。ガベージコレクションやループ参照検出などに使用されます。''pointer to pointer'' と考えてください。SmartPtr'' の基底型は存在しないため使用できません。その代わりに C++ でこの ''info'' クラスを使用します。"
type: docs
weight: 5600
url: /ja/cpp/system/smartptrinfo/
---
## SmartPtrInfo class


[SmartPtr](../smartptr/) の内容を最終型を知らずにテストおよび変更するサービスクラスです。ガベージコレクションやループ参照検出などに使用されます。'pointer to pointer' と考えてください。[SmartPtr](../smartptr/) の基底型は存在しないため使用できません。その代わりにこの 'info' クラスを使用します。

```cpp
class SmartPtrInfo
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [getInternalPtr](./getinternalptr/)() const | 参照ポインタが指す生のオブジェクトを取得します。 |
| [getObject](./getobject/)() const | 参照ポインタが指すオブジェクトを取得します。 |
| [getOwned](./getowned/)() const | 所有ポインタが指すオブジェクトを取得します。 |
| [operator bool](./operatorbool/)() const | info オブジェクトが非 null ポインタを指しているか確認します。 |
| [operator!](./operator!/)() const | info オブジェクトが非 null ポインタを指していないか確認します。 |
| [operator->](./operator-_/)() const | 参照ポインタが指す [Object](../object/) のメソッドを呼び出すことができます。 |
| [operator<](./operator_/)(const SmartPtrInfo\&) const | 2つの info オブジェクトが参照するポインタの値を比較します。 |
| [SmartPtrInfo](./smartptrinfo/)() | 空の [SmartPtrInfo](./) オブジェクトを作成します。 |
| explicit [SmartPtrInfo](./smartptrinfo/)(const SmartPtr\<T\>\&) | 特定のスマートポインタに関する情報を含む [SmartPtrInfo](./) オブジェクトを作成します。 |
## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
