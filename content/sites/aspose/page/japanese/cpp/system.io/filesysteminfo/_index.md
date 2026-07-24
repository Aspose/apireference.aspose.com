---
title: "System::IO::FileSystemInfo クラス"
linktitle: "FileSystemInfo"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::FileSystemInfo クラス。FileInfo と DirectoryInfo の基底クラスです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数へ引数として渡す際に使用してください。"
type: docs
weight: 1600
url: /ja/cpp/system.io/filesysteminfo/
---
## FileSystemInfo class


[FileInfo](../fileinfo/) と [DirectoryInfo](../directoryinfo/) の基底クラスです。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class FileSystemInfo : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Delete](./delete/)() | 現在のオブジェクトが表すエンティティを削除します。 |
| virtual [Finalize](./finalize/)() | 何もしません。 |
| [get_Attributes](./get_attributes/)() | 現在のオブジェクトが表すエンティティの属性を返します。 |
| [get_CreationTime](./get_creationtime/)() | 現在のオブジェクトが表すエンティティの作成時刻（ローカル時間）を返します。 |
| [get_CreationTimeUtc](./get_creationtimeutc/)() | 現在のオブジェクトが表すエンティティの作成時刻（UTC 時間）を返します。 |
| virtual [get_Exists](./get_exists/)() | 現在のオブジェクトが表すパスで参照されるエンティティが存在するかどうかを判断します。 |
| [get_Extension](./get_extension/)() | 現在のオブジェクトが表すファイルの拡張子を返します。 |
| virtual [get_FullName](./get_fullname/)() | 現在のオブジェクトが表すエンティティのフルネーム（パスを含む）を返します。 |
| [get_LastAccessTime](./get_lastaccesstime/)() | 現在のオブジェクトが表すエンティティの最終アクセス時刻（ローカル時間）を返します。 |
| [get_LastAccessTimeUtc](./get_lastaccesstimeutc/)() | 現在のオブジェクトが表すエンティティの最終アクセス時刻（UTC）を返します。 |
| [get_LastWriteTime](./get_lastwritetime/)() | 現在のオブジェクトが表すエンティティの最終書き込み時刻（ローカル時間）を返します。 |
| [get_LastWriteTimeUtc](./get_lastwritetimeutc/)() | 現在のオブジェクトが表すエンティティの最終書き込み時刻（UTC）を返します。 |
| virtual [get_Name](./get_name/)() | 現在のオブジェクトが表すエンティティの名前を返します。 |
| [Refresh](./refresh/)() | 現在のオブジェクトの状態を更新します。 |
| [set_Attributes](./set_attributes/)(FileAttributes) | 現在のオブジェクトが表すエンティティに指定された属性を設定します。 |
| [set_CreationTime](./set_creationtime/)(DateTime) | 現在のオブジェクトが表すエンティティの作成時刻をローカル時間として設定します。 |
| [set_CreationTimeUtc](./set_creationtimeutc/)(DateTime) | 現在のオブジェクトが表すエンティティの作成時刻を UTC として設定します。 |
| [set_LastAccessTime](./set_lastaccesstime/)(DateTime) | 現在のオブジェクトが表すエンティティの最終アクセス時刻をローカル時間として設定します。 |
| [set_LastAccessTimeUtc](./set_lastaccesstimeutc/)(DateTime) | 現在のオブジェクトが表すエンティティの最終アクセス時刻を UTC として設定します。 |
| [set_LastWriteTime](./set_lastwritetime/)(DateTime) | 現在のオブジェクトが表すエンティティの最終書き込み時刻をローカル時間として設定します。 |
| [set_LastWriteTimeUtc](./set_lastwritetimeutc/)(DateTime) | 現在のオブジェクトが表すエンティティの最終書き込み時刻を UTC として設定します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
