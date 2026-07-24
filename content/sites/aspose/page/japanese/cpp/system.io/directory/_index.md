---
title: "System::IO::Directory クラス"
linktitle: "Directory"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::Directory クラス。ディレクトリを操作するためのメソッドを含みます。これはインスタンスサービスを持たない静的型です。C++ ではいかなる手段でもインスタンスを作成してはいけません。"
type: docs
weight: 1100
url: /ja/cpp/system.io/directory/
---
## Directory class


ディレクトリを操作するメソッドを含みます。これはインスタンスサービスを持たない静的型です。いかなる方法でもインスタンスを作成すべきではありません。

```cpp
class Directory
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [CreateDirectory_](./createdirectory_/)(const String\&) | 指定されたパスに存在しない場合、すべてのディレクトリを作成します。 |
| static [Delete](./delete/)(const String\&, bool) | 指定されたファイルまたはディレクトリを削除します。例外はスローされません。 |
| static [EnumerateDirectories](./enumeratedirectories/)(const String\&, const String\&, SearchOption) | 指定されたディレクトリ、またはそのディレクトリをルートとする全ディレクトリツリー内で、指定された検索条件を満たすディレクトリを検索します。 |
| static [EnumerateFiles](./enumeratefiles/)(const String\&, const String\&, SearchOption) | 指定されたディレクトリ、またはそのディレクトリをルートとする全ディレクトリツリー内で、指定された検索条件を満たすファイルを検索します。 |
| static [EnumerateFileSystemEntries](./enumeratefilesystementries/)(const String\&, const String\&, SearchOption) | 指定されたディレクトリ、またはそのディレクトリをルートとする全ディレクトリツリー内で、指定された検索条件を満たすファイルおよびディレクトリを検索します。 |
| static [Exists](./exists/)(const String\&) | 指定されたパスが既存のディレクトリを指すかどうかを判定します。 |
| static [GetCreationTime](./getcreationtime/)(const String\&) | 指定されたエンティティの作成時刻をローカル時間で返します。 |
| static [GetCreationTimeUtc](./getcreationtimeutc/)(const String\&) | 指定されたエンティティの作成時刻を UTC 時間で返します。 |
| static [GetCurrentDirectory](./getcurrentdirectory/)() | 現在のディレクトリのフルネーム（パスを含む）を返します。 |
| static [GetDirectories](./getdirectories/)(const String\&, const String\&, SearchOption) | 指定されたディレクトリ、またはそのディレクトリをルートとする全ディレクトリツリー内で、指定された検索条件を満たすディレクトリを検索します。 |
| static [GetDirectoryRoot](./getdirectoryroot/)(const String\&) | 指定されたパスのルートディレクトリを返します。 |
| static [GetFiles](./getfiles/)(const String\&, const String\&, SearchOption) | 指定されたディレクトリ、またはそのディレクトリをルートとする全ディレクトリツリー内で、指定された検索条件を満たすファイルを検索します。 |
| static [GetFileSystemEntries](./getfilesystementries/)(const String\&, const String\&, SearchOption) | 指定されたディレクトリ、またはそのディレクトリをルートとする全ディレクトリツリー内で、指定された検索条件を満たすファイルおよびディレクトリを検索します。 |
| static [GetLastAccessTime](./getlastaccesstime/)(const String\&) | 指定されたエンティティの最終アクセス時刻をローカル時間で返します。 |
| static [GetLastAccessTimeUtc](./getlastaccesstimeutc/)(const String\&) | 指定されたエンティティの最終アクセス時刻を UTC 時間で返します。 |
| static [GetLastWriteTime](./getlastwritetime/)(const String\&) | 指定されたエンティティの最終書き込み時刻をローカル時間で返します。 |
| static [GetLastWriteTimeUtc](./getlastwritetimeutc/)(const String\&) | 指定されたエンティティの最終書き込み時刻を UTC 時間で返します。 |
| static [GetLogicalDrives](./getlogicaldrives/)() | 未実装です。 |
| static [GetParent](./getparent/)(const String\&) | 指定されたエンティティの親ディレクトリを表す [DirectoryInfo](../directoryinfo/) オブジェクトへの共有ポインタを返します。 |
| static [Move](./move/)(const String\&, const String\&) | 指定されたエンティティを新しい場所へ移動します。移動対象がディレクトリの場合、その内容すべてとともに移動されます。 |
| static [SetCreationTime](./setcreationtime/)(const String\&, DateTime) | 指定されたエンティティの作成時刻をローカル時間として設定します。 |
| static [SetCreationTimeUtc](./setcreationtimeutc/)(const String\&, DateTime) | 指定されたエンティティの作成時刻を UTC 時間として設定します。 |
| static [SetCurrentDirectory](./setcurrentdirectory/)(const String\&) | 現在のディレクトリを設定します。 |
| static [SetLastAccessTime](./setlastaccesstime/)(const String\&, DateTime) | 指定されたエンティティの最終アクセス時刻をローカル時間として設定します。 |
| static [SetLastAccessTimeUtc](./setlastaccesstimeutc/)(const String\&, DateTime) | 指定されたエンティティの最終アクセス時刻を UTC 時間として設定します。 |
| static [SetLastWriteTime](./setlastwritetime/)(const String\&, DateTime) | 指定されたエンティティの最終書き込み時刻をローカル時間に設定します。 |
| static [SetLastWriteTimeUtc](./setlastwritetimeutc/)(const String\&, DateTime) | 指定されたエンティティの最終書き込み時刻を UTC 時間に設定します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [StringEnumerablePtr](./stringenumerableptr/) | [String](../../system/string/) オブジェクトの集合を列挙する IEnumerable オブジェクトへの共有ポインタのエイリアスです。 |
## 備考



```cpp
#include "system/io/directory.h"
#include "system/io/path.h"
#include "system/string.h"
#include <iostream>

void PrintMessage(const System::String &path)
{
  std::cout << "Directory '" << path << (System::IO::Directory::Exists(path) ? "' exists." : "' doesn't exist.") << std::endl;
}

int main()
{
  // ディレクトリへのパスを含む文字列を作成します。
  System::String discPath(u"C:\\");
  System::String directoryPath(u"C:\\Some directory");
  auto tempPath = System::IO::Path::GetTempPath();

  // ディレクトリが存在するか確認します。
  PrintMessage(discPath);
  PrintMessage(directoryPath);
  PrintMessage(tempPath);

  // 一時ディレクトリ情報を出力します。
  std::cout <<
    "Creation Time: " << System::IO::Directory::GetCreationTime(tempPath) << std::endl <<
    "Last Access Time: " << System::IO::Directory::GetLastAccessTime(tempPath) << std::endl <<
    "Last Write Time: " << System::IO::Directory::GetLastWriteTime(tempPath) << std::endl;

  return 0;
}
/*
This code example produces the following output:
Directory 'C:\' exists.
Directory 'C:\Some directory' doesn't exist.
Directory 'C:\Users\lanor\AppData\Local\Temp\' exists.
Creation Time: 27.08.2021 14:21:42
Last Access Time: 07.10.2021 12:16:41
Last Write Time: 07.10.2021 12:16:41
*/
```

## 参照

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
