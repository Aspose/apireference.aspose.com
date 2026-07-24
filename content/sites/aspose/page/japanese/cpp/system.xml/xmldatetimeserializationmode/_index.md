---
title: "System::Xml::XmlDateTimeSerializationMode 列挙型"
linktitle: "XmlDateTimeSerializationMode"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlDateTimeSerializationMode 列挙体。文字列と DateTime を相互変換する際の時間値の扱い方を指定します（C++）。"
type: docs
weight: 5800
url: /ja/cpp/system.xml/xmldatetimeserializationmode/
---
## XmlDateTimeSerializationMode enum


文字列と [DateTime](../../system/datetime/) を相互変換する際の時間値の扱い方を指定します。

```cpp
enum class XmlDateTimeSerializationMode
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| Local | 0 | ローカル時間として扱います。もし [DateTime](../../system/datetime/) オブジェクトが協定世界時 (UTC) を表す場合、ローカル時間に変換されます。 |
| Utc | 1 | UTC として扱います。もし [DateTime](../../system/datetime/) オブジェクトがローカル時間を表す場合、UTC に変換されます。 |
| Unspecified | 2 | [DateTime](../../system/datetime/) が文字列に変換される場合はローカル時間として扱います。文字列が [DateTime](../../system/datetime/) に変換される場合、タイムゾーンが指定されていればローカル時間に変換します。 |
| RoundtripKind | 3 | 変換時にタイムゾーン情報は保持されるべきです。 |

## 参照

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
