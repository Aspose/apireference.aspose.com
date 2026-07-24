---
title: "System::Net::Http::Headers::MediaTypeHeaderValue::GetMediaTypeLength طريقة"
linktitle: "GetMediaTypeLength"
second_title: "Aspose.Page لـ C++"
description: "System::Net::Http::Headers::MediaTypeHeaderValue::GetMediaTypeLength طريقة. يحوّل سلسلة مُمرَّرة من الفهرس المحدد إلى مثيل من فئة MediaTypeHeaderValue في C++."
type: docs
weight: 1000
url: /ar/cpp/system.net.http.headers/mediatypeheadervalue/getmediatypelength/
---
## MediaTypeHeaderValue::GetMediaTypeLength method


يحوّل سلسلة مُمرَّرة من الفهرس المحدد إلى مثيل من فئة [MediaTypeHeaderValue](../).

```cpp
static int32_t System::Net::Http::Headers::MediaTypeHeaderValue::GetMediaTypeLength(String input, int32_t startIndex, HeaderFunc<System::SharedPtr<MediaTypeHeaderValue>> mediaTypeCreator, System::SharedPtr<MediaTypeHeaderValue> &parsedValue)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الإدخال | String | سلسلة للتحليل. |
| startIndex | int32_t | موضع بدء للتحليل. |
| mediaTypeCreator | HeaderFunc\<System::SharedPtr\<MediaTypeHeaderValue\>\> | المندوب الذي يُستخدم لإنشاء مثيلات من فئة [MediaTypeHeaderValue](../). |
| parsedValue | System::SharedPtr\<MediaTypeHeaderValue\>\& | كائن حيث سيتم تعيين الكائن المُحلَّل. |

### ReturnValue

يرجع طول الجزء الفرعي المُحلَّل، وإلا 0.

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [HeaderFunc](../../headerfunc/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [MediaTypeHeaderValue](../)
* Class [MediaTypeHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
