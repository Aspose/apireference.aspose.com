---
title: "System::Text::RegularExpressions::CaptureCollection class"
linktitle: "CaptureCollection"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::RegularExpressions::CaptureCollection クラス。単一のキャプチャグループによって取得されたキャプチャの一覧です。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数に引数として渡す際にそのポインタを使用してください。"
type: docs
weight: 200
url: /ja/cpp/system.text.regularexpressions/capturecollection/
---
## CaptureCollection class


単一のキャプチャグループによって取得されたキャプチャの一覧です。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class CaptureCollection : public System::Collections::Generic::List<CapturePtr>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(const CapturePtr\&) override | コレクションの修正を無効にします。 |
| [AddCapture](./addcapture/)(const CapturePtr\&) | コレクションにキャプチャを追加するサービスメソッドです。 |
| [Clear](./clear/)() override | コレクションのクリーニングを無効にします。 |
| [get_Count](./get_count/)() const override | キャプチャ数を取得します。 |
| [get_IsReadOnly](./get_isreadonly/)() const override | コレクションを読み取り専用としてマークします。 |
| [get_IsSynchronized](./get_issynchronized/)() const | コレクションを非同期化されていない状態としてマークします。 |
| [idx_get](./idx_get/)(int) const override | [Capture](../capture/) アクセサー。 |
| [operator[]](./operator[]/)(int) | [Capture](../capture/) アクセサー。 |
| [operator[]](./operator[]/)(int) const | [Capture](../capture/) アクセサー。 |
| [Remove](./remove/)(const CapturePtr\&) override | コレクションの修正を無効にします。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Base](./base/) | [Base](./base/) 型。 |
## 参照

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
