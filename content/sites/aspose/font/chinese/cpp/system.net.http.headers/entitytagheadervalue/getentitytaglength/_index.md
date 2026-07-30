---
title: "System::Net::Http::Headers::EntityTagHeaderValue::GetEntityTagLength 方法"
linktitle: "GetEntityTagLength"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Http::Headers::EntityTagHeaderValue::GetEntityTagLength 方法。将从指定索引开始的传入字符串转换为 C++ 中 EntityTagHeaderValue 类的实例。"
type: docs
weight: 800
url: /zh/cpp/system.net.http.headers/entitytagheadervalue/getentitytaglength/
---
## EntityTagHeaderValue::GetEntityTagLength method


将从指定索引开始的传入字符串转换为 [EntityTagHeaderValue](../) 类的实例。

```cpp
static int32_t System::Net::Http::Headers::EntityTagHeaderValue::GetEntityTagLength(String input, int32_t startIndex, System::SharedPtr<EntityTagHeaderValue> &parsedValue)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 输入 | String | 要解析的字符串。 |
| startIndex | int32_t | 用于解析的起始位置。 |
| parsedValue | System::SharedPtr\<EntityTagHeaderValue\>\& | 已解析对象将被分配的实例。 |

### ReturnValue

已解析子字符串的长度，否则为 0。

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EntityTagHeaderValue](../)
* Class [EntityTagHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Font for C++](../../../)
