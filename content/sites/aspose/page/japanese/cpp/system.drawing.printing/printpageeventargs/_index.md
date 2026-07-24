---
title: "System::Drawing::Printing::PrintPageEventArgs クラス"
linktitle: "PrintPageEventArgs"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Printing::PrintPageEventArgs クラス。PrintPage イベントのデータを提供します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。実行時エラーやアサーション失敗の原因になります。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡す際に使用してください。"
type: docs
weight: 900
url: /ja/cpp/system.drawing.printing/printpageeventargs/
---
## PrintPageEventArgs class


PrintPage イベントのデータを提供します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。実行時エラーやアサーション失敗の原因になります。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡す際に使用してください。

```cpp
class PrintPageEventArgs : public System::EventArgs
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Graphics](./get_graphics/)() | 未実装です。 |
| [get_HasMorePages](./get_hasmorepages/)() | 未実装です。 |
| [get_PageSettings](./get_pagesettings/)() | 未実装です。 |
| [PrintPageEventArgs](./printpageeventargs/)(const SharedPtr\<Graphics\>\&, const SharedPtr\<Rectangle\>\&, const SharedPtr\<Rectangle\>\&, const SharedPtr\<PageSettings\>\&) | [PrintPageEventArgs](./) クラスの新しいインスタンスを構築します。 |
| [set_HasMorePages](./set_hasmorepages/)(bool) | 未実装です。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | \"empty\" の [EventArgs](../../system/eventargs/) 共有ポインタ（ヌルポインタ）を表す静的メンバーです。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 参照

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Drawing::Printing](../)
* Library [Aspose.Page for C++](../../)
