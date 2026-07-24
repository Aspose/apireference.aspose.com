---
title: "System::IO::FileOptions enum"
linktitle: "FileOptions"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::FileOptions enum。C++ で FileStream オブジェクトを作成するための高度なオプションを表します。"
type: docs
weight: 3200
url: /ja/cpp/system.io/fileoptions/
---
## FileOptions enum


[FileStream](../filestream/) オブジェクトを作成するための高度なオプションを表します。

```cpp
enum class FileOptions
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| None | 0 | 追加のオプションはありません。 |
| Encrypted | 16384 | ファイルは暗号化されています。実装されていません。 |
| DeleteOnClose | 67108864 | ファイルは使用されなくなったときに自動的に削除されるべきです。 |
| SequentialScan | 134217728 | ファイルは順次アクセスされるべきです。 |
| RandomAccess | 268435456 | ファイルはランダムにアクセスされます。 |
| Asynchronous | 1073741824 | ファイルは非同期 I/O 操作に使用できます。 |
| WriteThrough | n/a | すべての書き込みは中間キャッシュをバイパスして直接ディスクに行われるべきです。 |

## 参照

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
