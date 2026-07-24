---
title: "System::IO::STDIOStreamWrapperBase クラス"
linktitle: "STDIOStreamWrapperBase"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::STDIOStreamWrapperBase クラス。System.IO.Stream のようなラッパーの基底クラスを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数へ引数として渡す際に使用してください。"
type: docs
weight: 2000
url: /ja/cpp/system.io/stdiostreamwrapperbase/
---
## STDIOStreamWrapperBase class


 [System.IO.Stream](../stream/) のようなラッパーの基底クラスを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
template<typename T,typename>class STDIOStreamWrapperBase : public System::IO::Stream
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_CanRead](./get_canread/)() const override | ストリームが読み取りをサポートしているかどうかを判断します。 |
| [get_CanSeek](./get_canseek/)() const override | ストリームがシークをサポートしているかどうかを判断します。 |
| [get_CanWrite](./get_canwrite/)() const override | ストリームが書き込みをサポートしているかどうかを判断します。 |
| [get_Length](./get_length/)() const override | ストリームの長さを返します。 |
| [get_Position](./get_position/)() const override | ストリームの現在位置を返します。 |
| [operator=](./operator=/)(const STDIOStreamWrapperBase\&) | コピー代入演算子。削除されています。 |
| [Seek](./seek/)(int64_t, SeekOrigin) override | 現在のオブジェクトが表すストリームの位置を設定します。 |
| [set_Position](./set_position/)(int64_t) override | ストリームの位置を設定します。 |
| [STDIOStreamWrapperBase](./stdiostreamwrapperbase/)(const STDIOStreamWrapperBase\&) | コピーコンストラクタ。削除されています。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [Null](../stream/null/) | 基盤となるストレージを持たないストリームです。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [BaseType](./basetype/) |  |
| [char_type](./char_type/) | RTTI 情報。 |
| [int_type](./int_type/) |  |
| [off_type](./off_type/) |  |
| [pos_type](./pos_type/) |  |
| [ThisType](./thistype/) |  |
| [ThisTypeBaseTypesInfo](./thistypebasetypesinfo/) |  |
| [traits_type](./traits_type/) |  |
## 参照

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
