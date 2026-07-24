---
title: "System::IO::STDIOStreamPositionPreference 列挙型"
linktitle: "STDIOStreamPositionPreference"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::STDIOStreamPositionPreference 列挙型。C++ でラッパー作成時に std::basic_iostream とその派生クラスが読み取り位置と書き込み位置が異なる場合、ストリーム内で共通の読み取りおよび書き込み位置として好ましい位置を決定します。"
type: docs
weight: 3600
url: /ja/cpp/system.io/stdiostreampositionpreference/
---
## STDIOStreamPositionPreference enum


ラッパー作成時に std::basic_iostream およびその派生クラスが異なる読み取り位置と書き込み位置を持つ場合に、共通の読み書き位置として好ましいストリーム上の位置を決定します。

```cpp
enum class STDIOStreamPositionPreference
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| ゼロ | 0 | ゼロ位置が読み取りおよび書き込み位置として設定されます。 |
| ReadPosition | 1 | gptr 位置が読み取りおよび書き込み位置として設定されます。 |
| WritePosition | 2 | pptr 位置が読み取りおよび書き込み位置として設定されます。 |

## 参照

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
