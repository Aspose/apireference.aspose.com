---
title: "طريقة System::Net::Http::Headers::RangeItemHeaderValue::GetRangeItemListLength"
linktitle: "GetRangeItemListLength"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Net::Http::Headers::RangeItemHeaderValue::GetRangeItemListLength. تحول سلسلة مُمرَّرة من الموضع المحدد إلى مجموعة من مثيلات فئة RangeItemHeaderValue في C++."
type: docs
weight: 800
url: /ar/cpp/system.net.http.headers/rangeitemheadervalue/getrangeitemlistlength/
---
## RangeItemHeaderValue::GetRangeItemListLength method


يحوّل السلسلة المُمرَّرة من الموضع المحدد إلى مجموعة من كائنات فئة RangeItemHeaderValue.

```cpp
static int32_t System::Net::Http::Headers::RangeItemHeaderValue::GetRangeItemListLength(String input, int32_t startIndex, System::SharedPtr<Collections::Generic::ICollection<System::SharedPtr<RangeItemHeaderValue>>> rangeCollection)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الإدخال | String | سلسلة للتحليل. |
| startIndex | int32_t | موضع بدء للتحليل. |
| rangeCollection | System::SharedPtr\<Collections::Generic::ICollection\<System::SharedPtr\<RangeItemHeaderValue\>\>\> | كائن سيتم تعيين مجموعة مُحلَّلة إليه. |

### ReturnValue

طول الجزء الفرعي المُحلَّل، وإلا 0.

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICollection](../../../system.collections.generic/icollection/)
* Class [RangeItemHeaderValue](../)
* Class [RangeItemHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Font for C++](../../../)
