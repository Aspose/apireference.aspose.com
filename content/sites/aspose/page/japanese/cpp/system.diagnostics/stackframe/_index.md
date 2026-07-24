---
title: "System::Diagnostics::StackFrame クラス"
linktitle: "StackFrame"
second_title: "C++ 用 Aspose.Page"
description: "System::Diagnostics::StackFrame クラス。単一のスタックフレームに関する情報を取得します。MSVS のみです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうするとランタイムエラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数引数として使用してください。"
type: docs
weight: 500
url: /ja/cpp/system.diagnostics/stackframe/
---
## StackFrame class


単一のスタックフレームに関する情報を取得します。MSVS のみです。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうするとランタイムエラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として使用してください。

```cpp
class StackFrame : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [GetFileColumnNumber](./getfilecolumnnumber/)() | 列番号を取得します。 |
| virtual [GetFileLineNumber](./getfilelinenumber/)() | 行番号を取得します。 |
| virtual [GetFileName](./getfilename/)() | ファイル名を取得します。 |
| [GetMethod](./getmethod/)() | メソッド情報を取得します。 |
| [operator=](./operator=/)(const StackFrame\&) const | 変更できません。 |
| [StackFrame](./stackframe/)(int) | 現在のスタックオフセットにスタックフレームを作成します。 |
| [StackFrame](./stackframe/)(const StackFrame\&) | コピーはできません。 |
| virtual [~StackFrame](./~stackframe/)() | デストラクタ。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
