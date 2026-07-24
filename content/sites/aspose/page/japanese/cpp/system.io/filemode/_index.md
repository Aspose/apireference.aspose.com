---
title: "System::IO::FileMode 列挙型"
linktitle: "FileMode"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::FileMode 列挙型。C++ でファイルを開く方法を指定します。"
type: docs
weight: 3100
url: /ja/cpp/system.io/filemode/
---
## FileMode enum


ファイルの開き方を指定します。

```cpp
enum class FileMode
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| CreateNew | 1 | 新しいファイルを作成します。ファイルがすでに存在する場合、例外がスローされます。 |
| 作成 | 2 | 新しいファイルを作成します。ファイルがすでに存在する場合、上書きされます。 |
| Open | 3 | 既存のファイルを開きます。ファイルが存在しない場合、例外がスローされます。 |
| OpenOrCreate | 4 | 既存のファイルを開くか、存在しない場合は新しいファイルを作成します。 |
| 切り捨て | 5 | 既存のファイルを開き、空になるように切り詰めます。ファイルが存在しない場合、例外がスローされます。 |
| 追加 | 6 | 既存のファイルを開き、末尾までシークするか、存在しない場合は新しいファイルを作成します。 |

## 参照

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
