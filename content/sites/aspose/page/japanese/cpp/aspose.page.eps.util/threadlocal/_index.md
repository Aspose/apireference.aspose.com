---
title: "Aspose::Page::EPS::Util::ThreadLocal クラス"
linktitle: "ThreadLocal"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::EPS::Util::ThreadLocal クラス。.NET Framework 4.0 および 4.5''s System.Threading.ThreadLocal ラッパー型が提供する機能を複製するために使用されるクラスです。このクラスは、スレッドローカルであり、スレッド間で異なるインスタンスを参照するインスタンス型および静的型を実装しますが、実際のインスタンス型は C++ では同じである可能性があります。"
type: docs
weight: 100
url: /ja/cpp/aspose.page.eps.util/threadlocal/
---
## ThreadLocal class


.NET Framework 4.0 と 4.5 の System.Threading.ThreadLocal ラッパー型が提供する機能を複製するために使用されるクラスです。このクラスは、スレッドローカルであり、スレッド間で異なるインスタンスを参照するインスタンス型と静的型を実装しますが、クラスが集約する実際のインスタンス型は同じである可能性があります。

```cpp
template<typename T>class ThreadLocal : public System::IDisposable
```


| パラメーター | 説明 |
| --- | --- |
| T | スレッド選択ロジックでラップする変数型 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [Dispose](./dispose/)() override | 何もしません。 |
| [get_Value](./get_value/)() |  |
| [isValueCreated](./isvaluecreated/)() |  |
| [set_Value](./set_value/)(T) |  |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | n 番目のテンプレート引数を弱参照ポインタに設定します（共有ではなく）。コンテナ内のポインタを弱モードに切り替えることができます。 |
| [ThreadLocal](./threadlocal/)(Factory) |  |
| static [to_T](./to_t/)(System::SharedPtr\<ThreadLocal\<T\>\>) |  |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Factory](./factory/) |  |

## 参照

* Class [IDisposable](../../system/idisposable/)
* Namespace [Aspose::Page::EPS::Util](../)
* Library [Aspose.Page for C++](../../)
