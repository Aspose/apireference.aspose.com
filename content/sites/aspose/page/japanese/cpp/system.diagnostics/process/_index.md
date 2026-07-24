---
title: "System::Diagnostics::Process クラス"
linktitle: "Process"
second_title: "C++ 用 Aspose.Page"
description: "System::Diagnostics::Process クラス。プロセス情報と操作をカプセル化します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数としてこのポインタを使用してください。"
type: docs
weight: 300
url: /ja/cpp/system.diagnostics/process/
---
## Process class


プロセス情報と操作をカプセル化します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数の引数としてこのポインタを使用してください。

```cpp
class Process : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_EnableRaisingEvents](./get_enableraisingevents/)() const | プロセスが終了したときにイベント Exited を発生させるかどうかを取得します。 |
| [get_ExitCode](./get_exitcode/)() const | プロセスの終了コードを取得します。 |
| [get_PrivateMemorySize64](./get_privatememorysize64/)() const | プロセスのプライベートメモリセットサイズを取得します。 |
| [get_ProcessName](./get_processname/)() const | プロセス名を取得します。 |
| [get_StandardError](./get_standarderror/)() const | プロセスのエラー出力を読み取るリーダーを提供します。未実装です。 |
| [get_StandardOutput](./get_standardoutput/)() const | プロセスの標準出力を読み取るリーダーを提供します。未実装です。 |
| [get_StartInfo](./get_startinfo/)() const | プロセスの開始情報を取得します。 |
| [get_WorkingSet64](./get_workingset64/)() const | プロセスのメモリ作業セットサイズを取得します。 |
| static [GetCurrentProcess](./getcurrentprocess/)() | 現在のプロセスに関する情報を取得します。 [Windows](../../system.windows/) のみ。 |
| [GetOutputText](./getoutputtext/)() const | プロセスの出力テキストを取得します。 |
| [set_EnableRaisingEvents](./set_enableraisingevents/)(bool) | プロセスが終了したときにイベント Exited を発生させるかどうかを設定します。 |
| [Start](./start/)() | 事前定義されたパラメータでプロセスを開始します。 |
| static [Start](./start/)(const String\&, const String\&) | 指定されたパスと引数でプロセスを開始します。 |
| static [Start](./start/)(const SharedPtr\<ProcessStartInfo\>\&) | 指定されたパスと引数でプロセスを開始します。 |
| [WaitForExit](./waitforexit/)(int) | プロセスの終了を待機します。未実装です。 |
| [WaitForExit](./waitforexit/)() | プロセスの終了を待機し、完了するまで戻りません。 |
| virtual [~Process](./~process/)() | デストラクタ。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
