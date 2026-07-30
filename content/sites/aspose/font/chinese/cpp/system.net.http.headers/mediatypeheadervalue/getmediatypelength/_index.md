---
title: "System::Net::Http::Headers::MediaTypeHeaderValue::GetMediaTypeLength 方法"
linktitle: "GetMediaTypeLength"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Http::Headers::MediaTypeHeaderValue::GetMediaTypeLength 方法。 将传入的字符串从指定索引转换为 C++ 中的 MediaTypeHeaderValue 类实例。"
type: docs
weight: 1000
url: /zh/cpp/system.net.http.headers/mediatypeheadervalue/getmediatypelength/
---
## MediaTypeHeaderValue::GetMediaTypeLength method


将传入的字符串从指定索引转换为 [MediaTypeHeaderValue](../) 类的实例。

```cpp
static int32_t System::Net::Http::Headers::MediaTypeHeaderValue::GetMediaTypeLength(String input, int32_t startIndex, HeaderFunc<System::SharedPtr<MediaTypeHeaderValue>> mediaTypeCreator, System::SharedPtr<MediaTypeHeaderValue> &parsedValue)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 输入 | String | 要解析的字符串。 |
| startIndex | int32_t | 用于解析的起始位置。 |
| mediaTypeCreator | HeaderFunc\<System::SharedPtr\<MediaTypeHeaderValue\>\> | 用于创建 [MediaTypeHeaderValue](../) 类实例的委托。 |
| parsedValue | System::SharedPtr\<MediaTypeHeaderValue\>\& | 已解析对象将被分配的实例。 |

### ReturnValue

返回已解析子字符串的长度，否则返回 0。

## 另见

* Class [String](../../../system/string/)
* Typedef [HeaderFunc](../../headerfunc/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [MediaTypeHeaderValue](../)
* Class [MediaTypeHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Font for C++](../../../)
