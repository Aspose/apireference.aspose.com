---
title: "طريقة System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength"
linktitle: "GetTransferCodingLength"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength. يحول سلسلة مُمرَّرة من الفهرس المحدد إلى نسخة من الفئة TransferCodingHeaderValue في C++."
type: docs
weight: 700
url: /ar/cpp/system.net.http.headers/transfercodingheadervalue/gettransfercodinglength/
---
## TransferCodingHeaderValue::GetTransferCodingLength method


يحول سلسلة مُمرَّرة من الفهرس المحدد إلى نسخة من الفئة [TransferCodingHeaderValue](../).

```cpp
static int32_t System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength(String input, int32_t startIndex, const HeaderFunc<System::SharedPtr<TransferCodingHeaderValue>> &transferCodingCreator, System::SharedPtr<TransferCodingHeaderValue> &parsedValue)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الإدخال | String | سلسلة للتحليل. |
| startIndex | int32_t | موضع بدء للتحليل. |
| parsedValue | const HeaderFunc\<System::SharedPtr\<TransferCodingHeaderValue\>\>\& | كائن حيث سيتم تعيين الكائن المُحلَّل. |
| transferCodingCreator | System::SharedPtr\<TransferCodingHeaderValue\>\& | المندوب الذي يُستخدم لإنشاء نسخ من الفئة [TransferCodingHeaderValue](../). |

### ReturnValue

يرجع طول الجزء الفرعي المُحلَّل، وإلا 0.

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [HeaderFunc](../../headerfunc/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TransferCodingHeaderValue](../)
* Class [TransferCodingHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
