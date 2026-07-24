---
title: "System::IO::File::Copy メソッド"
linktitle: "Copy"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::File::Copy メソッド。指定されたファイルを指定された場所にコピーします。宛先ファイルが既に存在する場合、上書きするかどうかをパラメーターで指定できます（C++）。"
type: docs
weight: 400
url: /ja/cpp/system.io/file/copy/
---
## File::Copy method


指定されたファイルを指定された場所へコピーします。宛先ファイルが既に存在する場合、上書きするかどうかを示すパラメータがあります。

```cpp
static void System::IO::File::Copy(const String &sourceFileName, const String &destFileName, bool overwrite=false)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| sourceFileName | const String\& | コピーするファイルのパス |
| destFileName | const String\& | コピー先ファイルの新しい場所のパス |
| 上書き | bool | 既存の宛先ファイルを上書きすべき場合は true、宛先ファイルが既に存在する場合にコピーを失敗させるべき場合は false |

## 参照

* Class [String](../../../system/string/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
