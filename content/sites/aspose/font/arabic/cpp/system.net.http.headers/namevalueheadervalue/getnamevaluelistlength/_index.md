---
title: "طريقة System::Net::Http::Headers::NameValueHeaderValue::GetNameValueListLength"
linktitle: "GetNameValueListLength"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Net::Http::Headers::NameValueHeaderValue::GetNameValueListLength. يحول سلسلة مُمرَّرة من الفهرس المحدد إلى مجموعة من نسخ فئة NameValueHeaderValue ويعيد طول الجزء الفرعي المُحلَّل في C++."
type: docs
weight: 1000
url: /ar/cpp/system.net.http.headers/namevalueheadervalue/getnamevaluelistlength/
---
## NameValueHeaderValue::GetNameValueListLength method


يقوم بتحويل سلسلة مُمرَّرة من الفهرس المحدد إلى مجموعة من كائنات فئة NameValueHeaderValue ويعيد طول الجزء الفرعي المُحلَّل.

```cpp
static int32_t System::Net::Http::Headers::NameValueHeaderValue::GetNameValueListLength(String input, int32_t startIndex, char16_t delimiter, System::SharedPtr<ObjectCollection<System::SharedPtr<NameValueHeaderValue>>> nameValueCollection)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الإدخال | String | سلسلة للتحليل. |
| startIndex | int32_t | موضع بدء للتحليل. |
| فاصل | char16_t | سلسلة تُستخدم لتحديد فواصل العناصر في السلسلة المحددة. |
| nameValueCollection | System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\> | معامل الإخراج حيث سيتم تعيين مجموعة مُحلَّلة. |

### ReturnValue

طول الجزء الفرعي المُحلَّل.

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ObjectCollection](../../objectcollection/)
* Class [NameValueHeaderValue](../)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Font for C++](../../../)
