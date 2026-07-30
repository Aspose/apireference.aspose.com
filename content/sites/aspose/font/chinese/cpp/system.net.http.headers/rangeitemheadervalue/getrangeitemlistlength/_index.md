---
title: "System::Net::Http::Headers::RangeItemHeaderValue::GetRangeItemListLength 方法"
linktitle: "GetRangeItemListLength"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Http::Headers::RangeItemHeaderValue::GetRangeItemListLength 方法。将传入的字符串从指定位置转换为 C++ 中 RangeItemHeaderValue 类实例的集合。"
type: docs
weight: 800
url: /zh/cpp/system.net.http.headers/rangeitemheadervalue/getrangeitemlistlength/
---
## RangeItemHeaderValue::GetRangeItemListLength method


将传入的字符串从指定位置转换为 RangeItemHeaderValue 类实例的集合。

```cpp
static int32_t System::Net::Http::Headers::RangeItemHeaderValue::GetRangeItemListLength(String input, int32_t startIndex, System::SharedPtr<Collections::Generic::ICollection<System::SharedPtr<RangeItemHeaderValue>>> rangeCollection)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 输入 | String | 要解析的字符串。 |
| startIndex | int32_t | 用于解析的起始位置。 |
| rangeCollection | System::SharedPtr\<Collections::Generic::ICollection\<System::SharedPtr\<RangeItemHeaderValue\>\>\> | 用于分配已解析集合的实例。 |

### ReturnValue

已解析子字符串的长度，否则为 0。

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICollection](../../../system.collections.generic/icollection/)
* Class [RangeItemHeaderValue](../)
* Class [RangeItemHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Font for C++](../../../)
