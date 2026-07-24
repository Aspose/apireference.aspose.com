---
title: "System::Security::SecureString クラス"
linktitle: "SecureString"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::SecureString クラス。SecureString は、機密として保持すべきテキストを表します。このクラスは内部データを暗号化しません。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使ってインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 100
url: /ja/cpp/system.security/securestring/
---
## SecureString class


SecureString は、機密として保持すべきテキストを表します。このクラスは内部データを暗号化しません。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使ってインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class SecureString : public System::IDisposable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [AppendChar](./appendchar/)(char16_t) | 文字列の末尾に文字を追加します。 |
| [Clear](./clear/)() | 現在の SecureString からすべての文字を削除します。 |
| [Copy](./copy/)() const | この SecureString の複製を作成します。 |
| [Dispose](./dispose/)() override | 現在のオブジェクトが使用しているすべてのリソースを解放します。 |
| [get_Length](./get_length/)() const | このセキュア文字列の文字数を取得します。 |
| [InsertAt](./insertat/)(int32_t, char16_t) | 指定されたインデックスに文字を挿入します。 |
| [IsReadOnly](./isreadonly/)() const | このオブジェクトが読み取り専用としてマークされているかどうかを示すフラグを取得します。 |
| [MakeReadOnly](./makereadonly/)() | このセキュア文字列を読み取り専用にします。 |
| [operator=](./operator=/)(const SecureString\&) |  |
| [RemoveAt](./removeat/)(int32_t) | 指定された位置の文字を削除します。 |
| [SecureString](./securestring/)() | RTTI 情報。 |
| [SecureString](./securestring/)(const char16_t *, int32_t) | コンストラクタ。 |
| [SecureString](./securestring/)(const SecureString\&) |  |
| [SetAt](./setat/)(int32_t, char16_t) | 指定された位置の既存の文字を置き換えます。 |
| [ToUnsecureString](./tounsecurestring/)() const | このセキュア文字列の内容を非セキュアな [String](../../system/string/) オブジェクトにコピーします。注意して使用してください。 |
| [~SecureString](./~securestring/)() | デストラクタ。 |
## 参照

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security](../)
* Library [Aspose.Page for C++](../../)
