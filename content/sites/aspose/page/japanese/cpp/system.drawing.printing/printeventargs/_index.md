---
title: "System::Drawing::Printing::PrintEventArgs class"
linktitle: "PrintEventArgs"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Printing::PrintEventArgs class。BeginPrint と EndPrint イベントのデータを提供します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new でインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数引数として渡してください。"
type: docs
weight: 800
url: /ja/cpp/system.drawing.printing/printeventargs/
---
## PrintEventArgs class


BeginPrint と EndPrint イベントのデータを提供します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new でインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡してください。

```cpp
class PrintEventArgs : public System::ComponentModel::CancelEventArgs
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_PrintAction](./get_printaction/)() | 現在のオブジェクトが表す印刷アクションを指定する値を返します。 |
| [PrintEventArgs](./printeventargs/)() | [PrintEventArgs](./) オブジェクトの新しいインスタンスを構築します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | \"empty\" の [EventArgs](../../system/eventargs/) 共有ポインタ（ヌルポインタ）を表す静的メンバーです。 |
## 参照

* Class [CancelEventArgs](../../system.componentmodel/canceleventargs/)
* Namespace [System::Drawing::Printing](../)
* Library [Aspose.Page for C++](../../)
