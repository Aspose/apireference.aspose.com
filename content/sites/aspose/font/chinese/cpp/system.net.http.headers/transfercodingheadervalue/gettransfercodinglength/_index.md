---
title: "System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength 方法"
linktitle: "GetTransferCodingLength"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength 方法。将传入的字符串从指定索引转换为 C++ 中的 TransferCodingHeaderValue 类实例。"
type: docs
weight: 700
url: /zh/cpp/system.net.http.headers/transfercodingheadervalue/gettransfercodinglength/
---
## TransferCodingHeaderValue::GetTransferCodingLength method


将传入的字符串从指定索引转换为 [TransferCodingHeaderValue](../) 类的实例。

```cpp
static int32_t System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength(String input, int32_t startIndex, const HeaderFunc<System::SharedPtr<TransferCodingHeaderValue>> &transferCodingCreator, System::SharedPtr<TransferCodingHeaderValue> &parsedValue)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 输入 | String | 要解析的字符串。 |
| startIndex | int32_t | 用于解析的起始位置。 |
| parsedValue | const HeaderFunc\<System::SharedPtr\<TransferCodingHeaderValue\>\>\& | 已解析对象将被分配的实例。 |
| transferCodingCreator | System::SharedPtr\<TransferCodingHeaderValue\>\& | 用于创建 [TransferCodingHeaderValue](../) 类实例的委托。 |

### ReturnValue

返回已解析子字符串的长度，否则返回 0。

## 另见

* Class [String](../../../system/string/)
* Typedef [HeaderFunc](../../headerfunc/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TransferCodingHeaderValue](../)
* Class [TransferCodingHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Font for C++](../../../)
