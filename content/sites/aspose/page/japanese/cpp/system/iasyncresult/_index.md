---
title: "System::IAsyncResult クラス"
linktitle: "IAsyncResult"
second_title: "C++ 用 Aspose.Page"
description: "System::IAsyncResult クラス。非同期操作の状態を表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。この型のインスタンスをスタック上で作成したり operator new を使用して作成したりしないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡してください。"
type: docs
weight: 3100
url: /ja/cpp/system/iasyncresult/
---
## IAsyncResult class


非同期操作の状態を表します。このクラスのオブジェクトは [System::MakeObject()](../makeobject/) 関数を使用してのみ割り当てるべきです。この型のインスタンスをスタック上で作成したり operator new を使用して作成したりしないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../smartptr/) ポインタでラップし、そのポインタを関数の引数として渡してください。

```cpp
class IAsyncResult : public virtual System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [get_AsyncState](./get_asyncstate/)() | 非同期操作に関する情報を含むオブジェクトを返します。 |
| virtual [get_AsyncWaitHandle](./get_asyncwaithandle/)() | 非同期操作の完了を待機するために使用できる WaitHandle のインスタンスを返します。 |
| virtual [get_CompletedSynchronously](./get_completedsynchronously/)() | 非同期操作が同期的に完了したかどうかを示す値を返します。 |
| virtual [get_IsCompleted](./get_iscompleted/)() | 非同期操作が完了したかどうかを示す値を返します。 |
| virtual [~IAsyncResult](./~iasyncresult/)() | デストラクタ。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [smart_ptr](./smart_ptr/) | [IAsyncResult](./) への共有ポインタです。 |
## 参照

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
