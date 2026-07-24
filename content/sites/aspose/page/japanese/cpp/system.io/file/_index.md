---
title: "System::IO::File クラス"
linktitle: "File"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::File クラス。ファイル操作のためのメソッドを提供します。インスタンスサービスを持たない静的型です。C++ ではいかなる手段でもインスタンスを作成すべきではありません。"
type: docs
weight: 1300
url: /ja/cpp/system.io/file/
---
## File class


ファイルを操作するメソッドを提供します。これはインスタンスサービスを持たない静的型です。いかなる方法でもインスタンスを作成すべきではありません。

```cpp
class File
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [AppendAllLines](./appendalllines/)(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) | 指定された文字列コレクションから文字列を取り出し、指定されたエンコーディングで各文字列を新しい行として指定されたファイルに追加します。指定されたファイルが存在しない場合は作成されます。すべての文字列を書き込んだ後、ファイルは閉じられます。 |
| static [AppendAllText](./appendalltext/)(const String\&, const String\&, const EncodingPtr\&) | 指定されたエンコーディングで指定された文字列を指定されたファイルに追加します。 |
| static [AppendText](./appendtext/)(const String\&) | UTF-8 エンコーディングで指定されたファイルにテキストを追加する [StreamWriter](../streamwriter/) オブジェクトを作成します。指定されたファイルが存在しない場合は作成されます。 |
| static [Copy](./copy/)(const String\&, const String\&, bool) | 指定されたファイルを指定された場所へコピーします。宛先ファイルが既に存在する場合、上書きするかどうかを示すパラメータがあります。 |
| static [Create](./create/)(const String\&, int32_t, FileOptions) | 新しいファイル（または既存ファイルを上書き）を作成し、指定されたバッファサイズとオプションで読み書きアクセス用に開きます。 |
| static [CreateText](./createtext/)(const String\&) | UTF-8 エンコードされたテキストを書き込むために、新規または既存のファイルを作成または開きます。 |
| static [Decrypt](./decrypt/)(const String\&) | 未実装です。 |
| static [Delete](./delete/)(const String\&) | 指定されたファイルまたはディレクトリを削除します。 |
| static [Encrypt](./encrypt/)(const String\&) | 未実装です。 |
| static [Exists](./exists/)(const String\&) | 指定されたパスが既存のファイルを指しているかどうかを判定します。 |
| static [GetAttributes](./getattributes/)(const String\&) | 指定されたエンティティの属性を返します。 |
| static [GetCreationTime](./getcreationtime/)(const String\&) | 指定されたエンティティの作成時刻をローカル時間で返します。 |
| static [GetCreationTimeUtc](./getcreationtimeutc/)(const String\&) | 指定されたエンティティの作成時刻を UTC 時間で返します。 |
| static [GetLastAccessTime](./getlastaccesstime/)(const String\&) | 指定されたエンティティの最終アクセス時刻をローカル時間で返します。 |
| static [GetLastAccessTimeUtc](./getlastaccesstimeutc/)(const String\&) | 指定されたエンティティの最終アクセス時刻を UTC 時間で返します。 |
| static [GetLastWriteTime](./getlastwritetime/)(const String\&) | 指定されたエンティティの最終書き込み時刻をローカル時間で返します。 |
| static [GetLastWriteTimeUtc](./getlastwritetimeutc/)(const String\&) | 指定されたエンティティの最終書き込み時刻を UTC 時間で返します。 |
| static [Move](./move/)(const String\&, const String\&) | 指定されたファイルを新しい場所へ移動します。 |
| static [Open](./open/)(const String\&, FileMode) | 指定されたモードで指定されたファイルを読み書き用に開き、共有しません。 |
| static [Open](./open/)(const String\&, FileMode, FileAccess, FileShare) | 指定されたモードで、指定されたアクセス種別と共有オプションを使用して指定されたファイルを開きます。 |
| static [OpenRead](./openread/)(const String\&) | 読み取り専用で、'Open' モードかつ読み取りの共有アクセスで指定されたファイルを開きます。 |
| static [OpenText](./opentext/)(const String\&, const EncodingPtr\&) | UTF-8 エンコーディングを使用し、共有せずに、指定された既存ファイルをテキスト読み取り用に開きます。 |
| static [OpenWrite](./openwrite/)(const String\&) | 書き込み専用で、'OpenOrCreate' モードかつ共有しないで指定されたファイルを開きます。 |
| static [ReadAllBytes](./readallbytes/)(const String\&) | 指定されたバイナリファイルの内容をバイト配列に読み取ります。 |
| static [ReadAllLines](./readalllines/)(const String\&, const EncodingPtr\&) | 指定された文字エンコーディングを使用し、指定されたテキストファイルの内容を行ごとに文字列配列に読み取ります。 |
| static [ReadAllText](./readalltext/)(const String\&, const EncodingPtr\&) | 指定された文字エンコーディングを使用し、指定されたテキストファイルの内容を単一の [String](../../system/string/) オブジェクトに読み取ります。 |
| static [ReadLines](./readlines/)(const String\&, const EncodingPtr\&) | 指定された文字エンコーディングを使用し、指定されたテキストファイルの内容を行ごとに読み取り、各行を表す文字列の列挙可能なコレクションを返します。 |
| static [Replace](./replace/)(const String\&, const String\&, const String\&, bool) | あるファイルの内容を別のファイルで置き換え、置き換えられたファイルのバックアップを作成します。 |
| static [SetAttributes](./setattributes/)(const String\&, FileAttributes) | 指定されたファイルに指定された属性を設定します。 |
| static [SetCreationTime](./setcreationtime/)(const String\&, DateTime) | 未実装です。 |
| static [SetCreationTimeUtc](./setcreationtimeutc/)(const String\&, DateTime) | 未実装です。 |
| static [SetLastAccessTime](./setlastaccesstime/)(const String\&, DateTime) | 未実装です。 |
| static [SetLastAccessTimeUtc](./setlastaccesstimeutc/)(const String\&, DateTime) | 未実装です。 |
| static [SetLastWriteTime](./setlastwritetime/)(const String\&, DateTime) | 指定されたエンティティの最終書き込み時刻をローカル時間に設定します。 |
| static [SetLastWriteTimeUtc](./setlastwritetimeutc/)(const String\&, DateTime) | 指定されたエンティティの最終書き込み時刻を UTC 時間に設定します。 |
| static [WriteAllBytes](./writeallbytes/)(const String\&, const ArrayPtr\<uint8_t\>\&) | 指定されたバイナリファイルを上書きし、指定されたバイトを書き込みます。 |
| static [WriteAllLines](./writealllines/)(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) | 指定されたエンコーディングを使用して、新しいテキストファイルを作成するか既存のファイルを上書きし、指定された列挙可能な文字列コレクションのすべての文字列を各行に1つずつ書き込みます。 |
| static [WriteAllLines](./writealllines/)(const String\&, const ArrayPtr\<String\>\&, const EncodingPtr\&) | 指定されたエンコーディングを使用して、新しいテキストファイルを作成するか既存のファイルを上書きし、指定された文字列配列のすべての文字列を各行に1つずつ書き込みます。 |
| static [WriteAllText](./writealltext/)(const String\&, const String\&, const EncodingPtr\&) | 指定されたエンコーディングを使用して、新しいテキストファイルを作成するか既存のファイルを上書きし、指定された文字列の内容を書き込みます。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [DefaultBufferSize](./defaultbuffersize/) | ファイルの読み取りおよび書き込み時にバッファリングされるバイト数のデフォルト値。 |
## 参照

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
