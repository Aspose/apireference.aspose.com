---
title: "System::IO::File::Create メソッド"
linktitle: "作成"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::File::Create メソッド。新しいファイルを作成（既存の場合は上書き）し、指定されたバッファサイズとオプションを使用して読み取りおよび書き込みアクセス用に開きます（C++）。"
type: docs
weight: 500
url: /ja/cpp/system.io/file/create/
---
## File::Create method


新しいファイル（または既存ファイルを上書き）を作成し、指定されたバッファサイズとオプションで読み書きアクセス用に開きます。

```cpp
static FileStreamPtr System::IO::File::Create(const String &path, int32_t bufferSize=DefaultBufferSize, FileOptions options=FileOptions::None)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| パス | const String\& | 作成または上書きするファイルのパス |
| bufferSize | int32_t | ファイルの読み取りおよび書き込み時にバッファされるバイト数 |
| options | FileOptions | ファイルの作成または上書き方法を指定します |

### ReturnValue

指定されたファイルに関連付けられた [FileStream](../../filestream/) オブジェクトへの共有ポインタ

## 参照

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileOptions](../../fileoptions/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
