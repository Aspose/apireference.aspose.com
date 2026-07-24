---
title: "System::Xml::XmlDateTimeSerializationMode 枚举"
linktitle: "XmlDateTimeSerializationMode"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlDateTimeSerializationMode 枚举。指定在 C++ 中在字符串和 DateTime 之间转换时如何处理时间值。"
type: docs
weight: 5800
url: /zh/cpp/system.xml/xmldatetimeserializationmode/
---
## XmlDateTimeSerializationMode enum


指定在字符串和 [DateTime](../../system/datetime/) 之间转换时如何处理时间值。

```cpp
enum class XmlDateTimeSerializationMode
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| Local | 0 | 视为本地时间。如果 [DateTime](../../system/datetime/) 对象表示协调世界时 (UTC)，则将其转换为本地时间。 |
| Utc | 1 | 视为 UTC。如果 [DateTime](../../system/datetime/) 对象表示本地时间，则将其转换为 UTC。 |
| Unspecified | 2 | 如果将 [DateTime](../../system/datetime/) 转换为字符串，则视为本地时间。如果将字符串转换为 [DateTime](../../system/datetime/)，在指定时区时转换为本地时间。 |
| 往返类型 | 3 | 在转换时应保留时区信息。 |

## 另见

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
