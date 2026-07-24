---
title: "System::Reflection::FieldAttributes 列挙体"
linktitle: "FieldAttributes"
second_title: "C++ 用 Aspose.Page"
description: "System::Reflection::FieldAttributes 列挙型。C++ のリフレクトされたフィールド属性です。"
type: docs
weight: 1200
url: /ja/cpp/system.reflection/fieldattributes/
---
## FieldAttributes enum


リフレクトされたフィールド属性。

```cpp
enum class FieldAttributes
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| FieldAccessMask | 7 | メンバーアクセスマスク。このマスクを使用してアクセシビリティ情報を取得します。 |
| PrivateScope | 0 | 参照できないメンバー。 |
| Private | 1 | プライベートメンバー。 |
| FamANDAssem | 2 | プライベートおよびアセンブリスコープのメンバー。 |
| Assembly | 3 | アセンブリスコープのメンバー。 |
| Family | 4 | 型およびサブタイプからアクセス可能なメンバー。 |
| FamORAssem | 5 | 型、サブタイプ、およびアセンブリからアクセス可能なメンバー。 |
| Public | 6 | 誰でもアクセス可能なメンバー。 |
| Static | 16 | インスタンスメンバーとは対照的な静的メンバー。 |
| InitOnly | 32 | 初期化のみ可能で変更できない const メンバー。 |
| リテラル | 64 | コンパイル時定数メンバー。 |
| NotSerialized | 128 | シリアライズされないメンバー。 |
| SpecialName | 512 | 以下の名前のいずれかの特別なフィールドです。 |
| PinvokeImpl | 8192 | Interop によって転送された実装です。 |
| ReservedMask | 38144 | ランタイムでの使用のみを目的とした予約フラグです。 |
| RTSpecialName | 1024 | ランタイムは名前エンコーディングをチェックすべきです。 |
| HasFieldMarshal | 4096 | マーシャリング情報が存在します。 |
| HasDefault | 32768 | デフォルト値が存在します。 |
| HasFieldRVA | 256 | RVA が存在します。 |

## 参照

* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
