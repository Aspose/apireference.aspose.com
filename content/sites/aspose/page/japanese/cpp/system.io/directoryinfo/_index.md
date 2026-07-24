---
title: "System::IO::DirectoryInfo クラス"
linktitle: "DirectoryInfo"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::DirectoryInfo クラス。ファイルシステムのパス、つまりこのパスが指すディレクトリを表し、ディレクトリを操作するインスタンスメソッドを提供します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡す際に使用してください。"
type: docs
weight: 1200
url: /ja/cpp/system.io/directoryinfo/
---
## DirectoryInfo class


ファイルシステムのパス、すなわちこのパスが指すディレクトリを表し、ディレクトリを操作するインスタンスメソッドを提供します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数に引数として渡す際に使用してください。

```cpp
class DirectoryInfo : public System::IO::FileSystemInfo
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Create](./create/)() | 現在のオブジェクトが表すパスにディレクトリを作成します。 |
| [CreateSubdirectory](./createsubdirectory/)(const String\&) | 指定されたパスにサブディレクトリを作成します。 |
| [Delete](./delete/)() override | 現在のオブジェクトが表すパスが指すディレクトリが空の場合、ディレクトリを削除します。 |
| [Delete](./delete/)(bool) | 現在のオブジェクトが表すパスが指すディレクトリを削除します。パラメータで、ディレクトリが空でない場合にその内容を再帰的に削除するかどうかを指定します。 |
| [DirectoryInfo](./directoryinfo/)(const String\&) | 指定されたパス上に [DirectoryInfo](./) クラスのインスタンスを構築します。 |
| [EnumerateDirectories](./enumeratedirectories/)() | 現在のオブジェクトが表すディレクトリ内にあるすべてのディレクトリを含む列挙可能なコレクションを返します。 |
| [EnumerateDirectories](./enumeratedirectories/)(const String\&) | 現在のオブジェクトが表すディレクトリ内で、指定された検索条件を満たすディレクトリを検索します。 |
| [EnumerateDirectories](./enumeratedirectories/)(const String\&, SearchOption) | 現在のオブジェクトが表すディレクトリ、またはそのディレクトリをルートとするディレクトリツリー全体で、指定された検索条件を満たすディレクトリを検索します。 |
| [EnumerateFiles](./enumeratefiles/)() | 現在のオブジェクトが表すディレクトリ内にあるすべてのファイルを含む列挙可能なコレクションを返します。 |
| [EnumerateFiles](./enumeratefiles/)(const String\&) | 現在のオブジェクトが表すディレクトリ内で、指定された検索条件を満たすファイルを検索します。 |
| [EnumerateFiles](./enumeratefiles/)(const String\&, SearchOption) | 現在のオブジェクトが表すディレクトリ、またはそのディレクトリをルートとするディレクトリツリー全体の中で、指定された検索条件を満たすファイルを検索します。 |
| [EnumerateFileSystemInfos](./enumeratefilesysteminfos/)() | 現在のオブジェクトが表すディレクトリ内にあるすべてのファイルとディレクトリを含む列挙可能なコレクションを返します。 |
| [EnumerateFileSystemInfos](./enumeratefilesysteminfos/)(const String\&) | 現在のオブジェクトが表すディレクトリ内で、指定された検索条件を満たすファイルとディレクトリを検索します。 |
| [EnumerateFileSystemInfos](./enumeratefilesysteminfos/)(const String\&, SearchOption) | 現在のオブジェクトが表すディレクトリ、またはそのディレクトリをルートとするディレクトリツリー全体の中で、指定された検索条件を満たすファイルとディレクトリを検索します。 |
| [get_Exists](./get_exists/)() override | 現在のオブジェクトが表すパスが既存のディレクトリを指しているかどうかを判定します。 |
| [get_Name](./get_name/)() override | 現在のオブジェクトが表すパスが指すエンティティの名前を返します。 |
| [get_Parent](./get_parent/)() | 現在のオブジェクトが表すディレクトリの親ディレクトリを指すパスを表す [DirectoryInfo](./) オブジェクトへの共有ポインタを返します。 |
| [get_Root](./get_root/)() | 現在のオブジェクトが表すディレクトリのルートディレクトリを指すパスを表す [DirectoryInfo](./) オブジェクトへの共有ポインタを返します。 |
| [GetDirectories](./getdirectories/)() | 現在のオブジェクトが表すディレクトリ内にあるすべてのディレクトリを表す [DirectoryInfo](./) オブジェクトへの共有ポインタを含む配列を返します。 |
| [GetDirectories](./getdirectories/)(const String\&) | 現在のオブジェクトが表すディレクトリ内で、指定された検索条件を満たすディレクトリを検索します。 |
| [GetDirectories](./getdirectories/)(const String\&, SearchOption) | 現在のオブジェクトが表すディレクトリ、またはそのディレクトリをルートとするディレクトリツリー全体で、指定された検索条件を満たすディレクトリを検索します。 |
| [GetFiles](./getfiles/)() | 現在のオブジェクトが表すディレクトリ内にあるすべてのディレクトリを表す [FileInfo](../fileinfo/) オブジェクトへの共有ポインタを含む配列を返します。 |
| [GetFiles](./getfiles/)(const String\&) | 現在のオブジェクトが表すディレクトリ内で、指定された検索条件を満たすファイルを検索します。 |
| [GetFiles](./getfiles/)(const String\&, SearchOption) | 現在のオブジェクトが表すディレクトリ、またはそのディレクトリをルートとするディレクトリツリー全体の中で、指定された検索条件を満たすファイルを検索します。 |
| [GetFileSystemInfos](./getfilesysteminfos/)() | 現在のオブジェクトが表すディレクトリ内にあるすべてのファイルとディレクトリを表す [FileSystemInfo](../filesysteminfo/) オブジェクトへの共有ポインタを含む配列を返します。 |
| [GetFileSystemInfos](./getfilesysteminfos/)(const String\&) | 現在のオブジェクトが表すディレクトリ内で、指定された検索条件を満たすファイルとディレクトリを検索します。 |
| [GetFileSystemInfos](./getfilesysteminfos/)(const String\&, SearchOption) | 現在のオブジェクトが表すディレクトリ、またはそのディレクトリをルートとするディレクトリツリー全体の中で、指定された検索条件を満たすファイルとディレクトリを検索します。 |
| [MoveTo](./moveto/)(const String\&) | 現在のオブジェクトが表すディレクトリとその内容すべてを指定された場所へ移動します。 |
| [ToString](./tostring/)() const override | 現在のオブジェクトが表すパスを含む文字列を返します。 |
## 参照

* Class [FileSystemInfo](../filesysteminfo/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
