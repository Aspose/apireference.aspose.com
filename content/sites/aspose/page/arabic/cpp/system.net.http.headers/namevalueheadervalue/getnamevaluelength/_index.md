---
title: "System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength طريقة"
linktitle: "GetNameValueLength"
second_title: "Aspose.Page لـ C++"
description: "System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength طريقة. يحول سلسلة مُمرَّرة من الفهرس المحدد إلى كائن من فئة NameValueHeaderValue في C++."
type: docs
weight: 900
url: /ar/cpp/system.net.http.headers/namevalueheadervalue/getnamevaluelength/
---
## NameValueHeaderValue::GetNameValueLength(String, int32_t, HeaderFunc\<System::SharedPtr\<NameValueHeaderValue\>\>, System::SharedPtr\<NameValueHeaderValue\>\&) method


يقوم بتحويل سلسلة مُمرَّرة من الفهرس المحدد إلى نسخة من الفئة [NameValueHeaderValue](../).

```cpp
static int32_t System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength(String input, int32_t startIndex, HeaderFunc<System::SharedPtr<NameValueHeaderValue>> nameValueCreator, System::SharedPtr<NameValueHeaderValue> &parsedValue)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الإدخال | String | سلسلة للتحليل. |
| startIndex | int32_t | موضع بدء للتحليل. |
| nameValueCreator | HeaderFunc\<System::SharedPtr\<NameValueHeaderValue\>\> | دالة تُستخدم لإنشاء نسخ جديدة من الفئة [NameValueHeaderValue](../). |
| parsedValue | System::SharedPtr\<NameValueHeaderValue\>\& | كائن حيث سيتم تعيين الكائن المُحلَّل. |

### ReturnValue

يرجع طول الجزء الفرعي المُحلَّل، وإلا 0.

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [HeaderFunc](../../headerfunc/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NameValueHeaderValue](../)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
## NameValueHeaderValue::GetNameValueLength(String, int32_t, System::SharedPtr\<NameValueHeaderValue\>\&) method


يقوم بتحويل سلسلة مُمرَّرة من الفهرس المحدد إلى نسخة من الفئة [NameValueHeaderValue](../).

```cpp
static int32_t System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength(String input, int32_t startIndex, System::SharedPtr<NameValueHeaderValue> &parsedValue)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الإدخال | String | سلسلة للتحليل. |
| startIndex | int32_t | موضع بدء للتحليل. |
| parsedValue | System::SharedPtr\<NameValueHeaderValue\>\& | كائن حيث سيتم تعيين الكائن المُحلَّل. |

### ReturnValue

يرجع طول الجزء الفرعي المُحلَّل، وإلا 0.

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NameValueHeaderValue](../)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
