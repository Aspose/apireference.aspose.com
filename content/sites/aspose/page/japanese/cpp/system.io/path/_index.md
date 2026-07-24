---
title: "System::IO::Path クラス"
linktitle: "パス"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::Path クラス。パスを操作するためのメソッドを提供します。これはインスタンスサービスを持たない静的型です。C++ ではいかなる手段でもインスタンスを作成すべきではありません。"
type: docs
weight: 1900
url: /ja/cpp/system.io/path/
---
## Path class


パスを操作するためのメソッドを提供します。これはインスタンスサービスを持たない静的型です。いかなる手段でもインスタンスを作成してはいけません。

```cpp
class Path
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [ChangeExtension](./changeextension/)(const String\&, const String\&) | 指定されたファイルパスの拡張子を変更します。 |
| static [CheckPath](./checkpath/)(const String\&, const String\&, bool) | 指定されたパスに無効な文字が含まれていないか確認することで、パスが有効かどうかを判定します。パスに無効な文字が含まれている場合は例外がスローされます。 |
| static [Combine](./combine/)(const ArrayPtr\<String\>\&) | 必要に応じてディレクトリ区切り文字を各セグメント間に挿入し、指定されたパスセグメントを単一のパスに結合します。 |
| static [Combine](./combine/)(const String\&, const String\&) | 必要に応じてディレクトリ区切り文字を2つのセグメント間に挿入し、指定された2つのパスセグメントを単一のパスに結合します。 |
| static [Combine](./combine/)(const String\&, const String\&, const String\&) | 必要に応じてディレクトリ区切り文字を各セグメント間に挿入し、指定された3つのパスセグメントを単一のパスに結合します。 |
| static [Combine](./combine/)(const String\&, const String\&, const String\&, const String\&) | 必要に応じてディレクトリ区切り文字を各セグメント間に挿入し、指定された4つのパスセグメントを単一のパスに結合します。 |
| static [GetDirectoryName](./getdirectoryname/)(const String\&) | 指定されたパスが参照するディレクトリの名前を返します。 |
| static [GetExtension](./getextension/)(const String\&) | 指定されたパスが参照するファイルの拡張子を返します。 |
| static [GetFileName](./getfilename/)(const String\&) | 指定されたパスが参照するファイルの名前を返します。 |
| static [GetFileNameWithoutExtension](./getfilenamewithoutextension/)(const String\&) | 指定されたパスが参照するファイルの拡張子なしの名前を返します。 |
| static [GetFullPath](./getfullpath/)(const String\&) | 指定されたパスを絶対パスに変換します。 |
| static [GetInvalidFileNameChars](./getinvalidfilenamechars/)() | ファイル名に使用できない文字を含む配列を返します。 |
| static [GetInvalidPathChars](./getinvalidpathchars/)() | パス名で使用できない文字を含む配列を返します。 |
| static [GetPathRoot](./getpathroot/)(const String\&) | 指定されたパスのルートディレクトリを返します。 |
| static [GetRandomFileName](./getrandomfilename/)() | ランダムに生成されたファイル名を返します。 |
| static [GetTempFileName_](./gettempfilename_/)() | 一意の名前で新しいファイルを作成し、その完全なパスを返します。 |
| static [GetTempFileNameSafe](./gettempfilenamesafe/)() | 一意の名前で新しいファイルを作成し、その完全なパスを返します。これは [GetTempFileName_()](./gettempfilename_/) メソッドの同義語です。 |
| static [GetTempPath](./gettemppath/)() | 現在のユーザーの一時ディレクトリのパスを返します。 |
| static [HasExtension](./hasextension/)(const String\&) | 指定されたパスが拡張子付きのファイルを参照しているかどうかを判定します。 |
| static [IsPathRooted](./ispathrooted/)(const String\&) | 指定されたパスにルートが含まれているかどうかを判定します。 |
| static [NormalizePath](./normalizepath/)(const String\&) | 指定されたパスを正規化します。 |
| static [ToBoost](./toboost/)(const String\&) | 指定されたパスを表す boost::filesystem::path クラスのインスタンスを返します。 |
| static [ToString](./tostring/)(const boost::filesystem::path\&) | 指定された Boost の path オブジェクトの文字列表現を返します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [AltDirectorySeparatorChar](./altdirectoryseparatorchar/) | パス内のディレクトリ階層を区切るために使用される代替文字です。 |
| static [DirectorySeparatorChar](./directoryseparatorchar/) | パス内のディレクトリ階層を区切るために使用される文字です。 |
| static [PathSeparator](./pathseparator/) | 環境変数内のパス文字列を区切るために使用される区切り文字です。 |
| static [VolumeSeparatorChar](./volumeseparatorchar/) | ボリューム区切り文字です。 |
## 備考



```cpp
#include "system/io/path.h"
#include <iostream>

int main()
{
  using namespace System::IO;

  // ランダムなファイル名を生成します。
  auto filename = Path::GetRandomFileName();

  // ファイル名に関する情報を出力します。
  std::cout <<
    "Filename: " << Path::GetFileName(filename) << std::endl <<
    "Filename w/o an extension: " << Path::GetFileNameWithoutExtension(filename) << std::endl <<
    "Extension: " << Path::GetExtension(filename) << std::endl;

  return 0;
}
/*
This code example produces the following output:
Filename: qhuzkyqv.y6p
Filename w/o an extension: qhuzkyqv
Extension: .y6p
*/
```

## 参照

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
