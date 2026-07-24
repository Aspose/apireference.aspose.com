---
title: "System::IO::FileInfo クラス"
linktitle: "FileInfo"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::FileInfo クラス。パスで指定されたファイルと、そのパスが指すファイルを表し、操作するためのメソッドを提供します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡す際に使用してください。"
type: docs
weight: 1400
url: /ja/cpp/system.io/fileinfo/
---
## FileInfo class


パスで指定されたファイルと、そのパスが指すファイルを表し、操作するためのメソッドを提供します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数に引数として渡す際に使用してください。

```cpp
class FileInfo : public System::IO::FileSystemInfo
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [AppendText](./appendtext/)() | 現在のオブジェクトが表すファイルを UTF-8 エンコーディングでテキストを書き込むために開きます。'Append' モードで、共有は行いません。 |
| [CopyTo](./copyto/)(const String\&) | 現在のオブジェクトが表すファイルを指定された場所へコピーします。宛先ファイルが既に存在する場合、コピーは失敗します。 |
| [CopyTo](./copyto/)(const String\&, bool) | 現在のオブジェクトが表すファイルを指定された場所へコピーします。パラメータで既存の宛先ファイルを上書きするかどうかを指定します。 |
| [Create](./create/)() | 現在のオブジェクトが表すパスで指定された場所にファイルを作成し、読み書き用に開きます。トランケートモードで、共有は行いません。 |
| [CreateText](./createtext/)() | 現在のオブジェクトが表すパスで指定された場所にファイルを作成し、UTF-8 エンコーディングでテキストを書き込むために開きます。共有は行いません。 |
| [Decrypt](./decrypt/)() | 未実装です。 |
| [Delete](./delete/)() override | 現在のオブジェクトが表すファイルを削除します。 |
| [Encrypt](./encrypt/)() | 未実装です。 |
| [FileInfo](./fileinfo/)(const String\&) | [FileInfo](./) クラスの新しいインスタンスを構築し、指定されたファイルを表します。 |
| [get_Directory](./get_directory/)() | 現在のオブジェクトが表すファイルが所在するディレクトリを表す [DirectoryInfo](../directoryinfo/) オブジェクトを返します。 |
| [get_DirectoryName](./get_directoryname/)() | 現在のオブジェクトが表すファイルが所在するディレクトリのフルパス名を返します。 |
| [get_Exists](./get_exists/)() override | ファイルが存在するかどうかを示す値を返します。 |
| [get_IsReadOnly](./get_isreadonly/)() | ReadOnly 属性が設定されているかどうかを示す値を返します。 |
| [get_Length](./get_length/)() | ファイルのサイズ（バイト単位）を返します。 |
| [get_Name](./get_name/)() override | ファイル名を返します。 |
| [MoveTo](./moveto/)(const String\&) | 現在のオブジェクトが表すファイルを指定された場所へ移動します。 |
| [Open](./open/)(FileMode) | 現在のオブジェクトが表すファイルを、指定されたモードで読み書き用に、共有なしで開きます。 |
| [Open](./open/)(FileMode, FileAccess) | 現在のオブジェクトが表すファイルを、指定されたモードとアクセス種別で、共有なしで開きます。 |
| [Open](./open/)(FileMode, FileAccess, FileShare) | 現在のオブジェクトが表すファイルを、指定されたモード、アクセス種別、共有オプションで開きます。 |
| [OpenRead](./openread/)() | 現在のオブジェクトが表すファイルを、読み取り専用で、'Open' モードかつ読み取り共有で開きます。 |
| [OpenText](./opentext/)() | 現在のオブジェクトが表すパスで指定された場所にある既存のファイルを、UTF-8 エンコードでテキストを読み取るために、共有なしで開きます。 |
| [OpenWrite](./openwrite/)() | 現在のオブジェクトが表すファイルを、書き込み専用で、'OpenOrCreate' モードかつ共有なしで開きます。 |
| [Replace](./replace/)(const String\&, const String\&) | 現在の [FileInfo](./) オブジェクトが表すファイルで、指定された宛先ファイルの内容を置き換え、置き換えられたファイルのバックアップを作成します。 |
| [Replace](./replace/)(const String\&, const String\&, bool) | 現在の [FileInfo](./) オブジェクトが表すファイルで、指定された宛先ファイルの内容を置き換え、置き換えられたファイルのバックアップを作成します。 |
| [set_IsReadOnly](./set_isreadonly/)(bool) | ファイルの ReadOnly 属性を設定または解除します。 |
| [ToString](./tostring/)() const override | 現在のオブジェクトが表すパスを返します。 |
## 参照

* Class [FileSystemInfo](../filesysteminfo/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
