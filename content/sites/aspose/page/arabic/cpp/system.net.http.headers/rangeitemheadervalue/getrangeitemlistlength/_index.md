---
title: "System::Net::Http::Headers::RangeItemHeaderValue::GetRangeItemListLength طريقة"
linktitle: "GetRangeItemListLength"
second_title: "Aspose.Page لـ C++"
description: "System::Net::Http::Headers::RangeItemHeaderValue::GetRangeItemListLength طريقة. يحول سلسلة مُمرَّرة من الموضع المحدد إلى مجموعة من نسخ فئة RangeItemHeaderValue في C++."
type: docs
weight: 800
url: /ar/cpp/system.net.http.headers/rangeitemheadervalue/getrangeitemlistlength/
---
## RangeItemHeaderValue::GetRangeItemListLength method


يقوم بتحويل سلسلة مُمرَّرة من الموضع المحدد إلى مجموعة من نسخ الفئة RangeItemHeaderValue.

```cpp
static int32_t System::Net::Http::Headers::RangeItemHeaderValue::GetRangeItemListLength(String input, int32_t startIndex, System::SharedPtr<Collections::Generic::ICollection<System::SharedPtr<RangeItemHeaderValue>>> rangeCollection)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الإدخال | String | سلسلة للتحليل. |
| startIndex | int32_t | موضع بدء للتحليل. |
| rangeCollection | System::SharedPtr\<Collections::Generic::ICollection\<System::SharedPtr\<RangeItemHeaderValue\>\>\> | نسخة حيث سيتم تعيين مجموعة تم تحليلها. |

### ReturnValue

طول الجزء الفرعي المُحلَّل، وإلا 0.

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICollection](../../../system.collections.generic/icollection/)
* Class [RangeItemHeaderValue](../)
* Class [RangeItemHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
