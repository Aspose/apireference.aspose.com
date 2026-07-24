---
title: "System::Reflection::BindingFlags 列挙体"
linktitle: "BindingFlags"
second_title: "C++ 用 Aspose.Page"
description: "System::Reflection::BindingFlags 列挙体。C++ におけるメンバーと型の検索モードおよびバインディングを定義します。"
type: docs
weight: 1100
url: /ja/cpp/system.reflection/bindingflags/
---
## BindingFlags enum


メンバーと型の検索モードおよびバインディングを定義します。

```cpp
enum class BindingFlags
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| Default | 0 | 特別なオプションはありません。 |
| IgnoreCase | 1 | 項目を検索する際に名前の大文字小文字を無視します。 |
| DeclaredOnly | 2 | 型で宣言されたメンバーのみを検索し、基底型のメンバーは対象にしません。 |
| Instance | 4 | インスタンス メンバーを検索します。 |
| Static | 8 | 静的メンバーを検索します。 |
| Public | 16 | public メンバーを検索します。 |
| NonPublic | 32 | 非 public メンバーを検索します。 |
| FlattenHierarchy | 64 | 基底型の public および protected 静的メンバーを検索します。 |
| InvokeMethod | 256 | メソッドを呼び出します。 |
| CreateInstance | 512 | リフレクトされた型のインスタンスを作成します。 |
| GetField | 1024 | フィールドの値を取得します。 |
| SetField | 2048 | フィールドの値を設定します。 |
| GetProperty | 4096 | プロパティの値を取得します。 |
| SetProperty | 8192 | プロパティの値を設定します。 |
| PutDispProperty | 16384 | COM プロパティを設定します。 |
| PutRefDispProperty | 32768 | COM 参照プロパティを設定します。 |
| ExactBinding | 65536 | 型バインディングは正確でなければならず、型の変更はできません。 |
| SuppressChangeType | 131072 | サポートされていません。 |
| OptionalParamBinding | 262144 | 引数の数に基づいてオーバーロードを選択します。 |
| IgnoreReturn | 16777216 | COM 相互運用の戻り値を無視します。 |

## 参照

* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
