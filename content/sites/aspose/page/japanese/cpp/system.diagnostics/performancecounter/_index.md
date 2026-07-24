---
title: "System::Diagnostics::PerformanceCounter クラス"
linktitle: "PerformanceCounter"
second_title: "C++ 用 Aspose.Page"
description: "System::Diagnostics::PerformanceCounter クラス。PerformanceCounter を使用した翻訳コードをコンパイルできるようにするダミークラスです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使ってインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 200
url: /ja/cpp/system.diagnostics/performancecounter/
---
## PerformanceCounter class


PerformanceCounter を使用した翻訳コードをコンパイルできるようにするダミークラスです。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使ってインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class PerformanceCounter : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Close](./close/)() | すべてのパフォーマンスカウント操作を停止します。 |
| [NextValue](./nextvalue/)() | 次の測定値を取得します。 |
| [PerformanceCounter](./performancecounter/)() | パフォーマンスカウンタを作成します。 |
| [PerformanceCounter](./performancecounter/)(const String\&, const String\&) | 特定のカテゴリのパフォーマンスカウンタを作成します。 |
| [PerformanceCounter](./performancecounter/)(const String\&, const String\&, const String\&, const String\&) | 特定のカテゴリとインスタンス名のパフォーマンスカウンタを作成します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
