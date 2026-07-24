---
title: "System::Xml::XmlDateTimeSerializationMode 열거형"
linktitle: "XmlDateTimeSerializationMode"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlDateTimeSerializationMode 열거형. 문자열과 DateTime을 C++에서 변환할 때 시간 값을 어떻게 처리할지 지정합니다."
type: docs
weight: 5800
url: /ko/cpp/system.xml/xmldatetimeserializationmode/
---
## XmlDateTimeSerializationMode enum


문자열과 [DateTime](../../system/datetime/)을 변환할 때 시간 값을 어떻게 처리할지 지정합니다.

```cpp
enum class XmlDateTimeSerializationMode
```

### 값

| 이름 | 값 | 설명 |
| --- | --- | --- |
| Local | 0 | 현지 시간으로 처리합니다. [DateTime](../../system/datetime/) 객체가 협정 세계시(UTC)를 나타내는 경우, 현지 시간으로 변환됩니다. |
| Utc | 1 | UTC로 처리합니다. [DateTime](../../system/datetime/) 객체가 현지 시간을 나타내는 경우, UTC로 변환됩니다. |
| Unspecified | 2 | [DateTime](../../system/datetime/)을 문자열로 변환하는 경우 현지 시간으로 처리합니다. 문자열을 [DateTime](../../system/datetime/)으로 변환하는 경우, 시간대가 지정되어 있으면 현지 시간으로 변환합니다. |
| RoundtripKind | 3 | 변환 시 시간대 정보는 보존되어야 합니다. |

## 또 보기

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
