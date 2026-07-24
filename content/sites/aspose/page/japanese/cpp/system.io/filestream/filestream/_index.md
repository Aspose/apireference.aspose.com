---
title: "System::IO::FileStream::FileStream コンストラクタ"
linktitle: "FileStream"
second_title: "C++ 用 Aspose.Page"
description: "C++ で System::IO::FileStream クラスの FileStream コンストラクタを使用する方法。"
type: docs
weight: 100
url: /ja/cpp/system.io/filestream/filestream/
---
## FileStream::FileStream(const FileStream\&) constructor




```cpp
System::IO::FileStream::FileStream(const FileStream &)=delete
```

## 参照

* Class [FileStream](../)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileStream::FileStream(const String\&, FileMode) constructor


[FileStream](../) クラスの新しいインスタンスを作成し、指定されたパラメータで初期化します。

```cpp
System::IO::FileStream::FileStream(const String &path, FileMode mode)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| パス | const String\& | 開くファイルのパス。 |
| mode | FileMode | ファイルを開くモードを指定します。 |

## 参照

* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileStream::FileStream(const String\&, FileMode, FileAccess, FileShare, int32_t, bool) constructor


[FileStream](../) クラスの新しいインスタンスを作成し、指定されたパラメータで初期化します。

```cpp
System::IO::FileStream::FileStream(const String &path, FileMode mode, FileAccess access, FileShare share, int32_t buffer_size, bool useAsync)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| パス | const String\& | 開くファイルのパス。 |
| mode | FileMode | ファイルを開くモードを指定します。 |
| アクセス | FileAccess | 要求されたアクセス種別。 |
| share | FileShare | 他の[FileStream](../)オブジェクトが開かれたファイルに対して持つアクセスの種類。 |
| buffer_size | int32_t | 読み取りおよび書き込み操作中にバッファリングされるバイト数。 |
| useAsync | bool | 非同期 I/O または同期 I/O のどちらを使用するかを指定します。 |
## 備考



基盤となるオペレーティングシステムが非同期 I/O をサポートしていない可能性があります。

## 参照

* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileStream::FileStream(const String\&, FileMode, FileAccess, FileShare, int32_t, FileOptions) constructor


[FileStream](../) クラスの新しいインスタンスを作成し、指定されたパラメータで初期化します。

```cpp
System::IO::FileStream::FileStream(const String &path, FileMode mode, FileAccess access, FileShare share=FileShare::Read, int32_t buffer_size=DefaultBufferSize, FileOptions options=FileOptions::SequentialScan)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| パス | const String\& | 開くファイルのパス。 |
| mode | FileMode | ファイルを開くモードを指定します。 |
| アクセス | FileAccess | 要求されたアクセス種別。 |
| share | FileShare | 他の[FileStream](../)オブジェクトが開かれたファイルに対して持つアクセスの種類。 |
| buffer_size | int32_t | 読み取りおよび書き込み操作中にバッファリングされるバイト数。 |
| options | FileOptions | 追加オプション。 |

## 参照

* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Enum [FileOptions](../../fileoptions/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
