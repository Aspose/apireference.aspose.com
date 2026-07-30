---
title: "طريقة System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength"
linktitle: "GetNameValueLength"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength. تحول سلسلة مُمرَّرة من الفهرس المحدد إلى كائن من فئة NameValueHeaderValue في C++."
type: docs
weight: 900
url: /ar/cpp/system.net.http.headers/namevalueheadervalue/getnamevaluelength/
---
## NameValueHeaderValue::GetNameValueLength(String, int32_t, HeaderFunc\<System::SharedPtr\<NameValueHeaderValue\>\>, System::SharedPtr\<NameValueHeaderValue\>\&) method


تحول سلسلة مُمرَّرة من الفهرس المحدد إلى كائن من فئة [NameValueHeaderValue](../).

```cpp
static int32_t System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength(String input, int32_t startIndex, HeaderFunc<System::SharedPtr<NameValueHeaderValue>> nameValueCreator, System::SharedPtr<NameValueHeaderValue> &parsedValue)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الإدخال | String | سلسلة للتحليل. |
| startIndex | int32_t | موضع بدء للتحليل. |
| nameValueCreator | HeaderFunc\<System::SharedPtr\<NameValueHeaderValue\>\> | دالة تُستخدم لإنشاء كائنات جديدة من فئة [NameValueHeaderValue](../). |
| parsedValue | System::SharedPtr\<NameValueHeaderValue\>\& | نسخة حيث سيتم تعيين كائن مُحلَّل. |

### ReturnValue

يعيد طول الجزء الفرعي المُحلل، وإلا 0.

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [HeaderFunc](../../headerfunc/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NameValueHeaderValue](../)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Font for C++](../../../)
## NameValueHeaderValue::GetNameValueLength(String, int32_t, System::SharedPtr\<NameValueHeaderValue\>\&) method


تحول سلسلة مُمرَّرة من الفهرس المحدد إلى كائن من فئة [NameValueHeaderValue](../).

```cpp
static int32_t System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength(String input, int32_t startIndex, System::SharedPtr<NameValueHeaderValue> &parsedValue)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الإدخال | String | سلسلة للتحليل. |
| startIndex | int32_t | موضع بدء للتحليل. |
| parsedValue | System::SharedPtr\<NameValueHeaderValue\>\& | نسخة حيث سيتم تعيين كائن مُحلَّل. |

### ReturnValue

يعيد طول الجزء الفرعي المُحلل، وإلا 0.

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NameValueHeaderValue](../)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Font for C++](../../../)
