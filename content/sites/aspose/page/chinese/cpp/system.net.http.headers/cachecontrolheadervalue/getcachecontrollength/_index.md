---
title: "System::Net::Http::Headers::CacheControlHeaderValue::GetCacheControlLength 方法"
linktitle: "GetCacheControlLength"
second_title: "Aspose.Page 适用于 C++"
description: "System::Net::Http::Headers::CacheControlHeaderValue::GetCacheControlLength 方法。将传入的字符串从指定索引转换为 CacheControlHeaderValue 类的实例（C++）。"
type: docs
weight: 3400
url: /zh/cpp/system.net.http.headers/cachecontrolheadervalue/getcachecontrollength/
---
## CacheControlHeaderValue::GetCacheControlLength method


将传入的字符串从指定索引转换为 [CacheControlHeaderValue](../) 类的实例。

```cpp
static int32_t System::Net::Http::Headers::CacheControlHeaderValue::GetCacheControlLength(String input, int32_t startIndex, System::SharedPtr<CacheControlHeaderValue> storeValue, System::SharedPtr<CacheControlHeaderValue> &parsedValue)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 输入 | 字符串 | 要解析的字符串。 |
| startIndex | int32_t | 用于解析的起始位置。 |
| storeValue | System::SharedPtr\<CacheControlHeaderValue\> | 必须添加到已解析对象的值。 |
| parsedValue | System::SharedPtr\<CacheControlHeaderValue\>\& | 将分配已解析对象的实例。 |

### ReturnValue

已解析子字符串的长度，否则为 0。

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [CacheControlHeaderValue](../)
* Class [CacheControlHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
