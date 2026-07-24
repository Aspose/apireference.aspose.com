---
title: "System::Diagnostics::ProcessStartInfo クラス"
linktitle: "ProcessStartInfo"
second_title: "C++ 用 Aspose.Page"
description: "System::Diagnostics::ProcessStartInfo クラス。プロセス開始パラメータを記述します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 400
url: /ja/cpp/system.diagnostics/processstartinfo/
---
## ProcessStartInfo class


プロセス開始パラメータを記述します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class ProcessStartInfo : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Arguments](./get_arguments/)() const | プロセス引数を取得します。 |
| [get_CreateNoWindow](./get_createnowindow/)() const | NoWindow プロパティを取得します。 |
| [get_EnvironmentVariables](./get_environmentvariables/)() const | プロセスの環境変数を取得します。 |
| [get_FileName](./get_filename/)() const | プロセスのファイル名を取得します。 |
| [get_RedirectStandardError](./get_redirectstandarderror/)() const | RedirectStandardError プロパティを取得します。 |
| [get_RedirectStandardInput](./get_redirectstandardinput/)() const | RedirectStandardInput プロパティを取得します。 |
| [get_RedirectStandardOutput](./get_redirectstandardoutput/)() const | RedirectStandardOutput プロパティを取得します。 |
| [get_UseShellExecute](./get_useshellexecute/)() const | UseShellExecute プロパティを取得します。 |
| [get_WindowStyle](./get_windowstyle/)() const | ウィンドウスタイルを取得します。 |
| [get_WorkingDirectory](./get_workingdirectory/)() const | プロセスの作業ディレクトリを取得します。 |
| [ProcessStartInfo](./processstartinfo/)() | 空の開始情報オブジェクトを作成します。 |
| [ProcessStartInfo](./processstartinfo/)(const String\&) | 開始情報オブジェクトを作成します。 |
| [ProcessStartInfo](./processstartinfo/)(const String\&, const String\&) | 開始情報オブジェクトを作成します。 |
| [set_Arguments](./set_arguments/)(const String\&) | プロセス引数を設定します。 |
| [set_CreateNoWindow](./set_createnowindow/)(bool) | NoWindow プロパティを設定します。 |
| [set_FileName](./set_filename/)(const String\&) | プロセスのファイル名を設定します。 |
| [set_RedirectStandardError](./set_redirectstandarderror/)(bool) | RedirectStandardError プロパティを設定します。 |
| [set_RedirectStandardInput](./set_redirectstandardinput/)(bool) | RedirectStandardInput プロパティを設定します。 |
| [set_RedirectStandardOutput](./set_redirectstandardoutput/)(bool) | RedirectStandardOutput プロパティを設定します。 |
| [set_UseShellExecute](./set_useshellexecute/)(bool) | UseShellExecute プロパティを設定します。 |
| [set_WindowStyle](./set_windowstyle/)(ProcessWindowStyle) | ウィンドウスタイルを設定します。 |
| [set_WorkingDirectory](./set_workingdirectory/)(const String\&) | プロセスの作業ディレクトリを設定します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
