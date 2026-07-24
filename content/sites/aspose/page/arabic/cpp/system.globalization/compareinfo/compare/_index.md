---
title: "طريقة System::Globalization::CompareInfo::Compare"
linktitle: "Compare"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Globalization::CompareInfo::Compare. تقارن السلاسل. لا يتم دعم سوى وضعي Ordinal و OrdinalIgnoreCase في C++."
type: docs
weight: 200
url: /ar/cpp/system.globalization/compareinfo/compare/
---
## CompareInfo::Compare(const String\&, const String\&, CompareOptions) const method


يقارن السلاسل. يدعم فقط أوضاع Ordinal و OrdinalIgnoreCase.

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &a, const String &b, CompareOptions options) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| a | const String\& | سلسلة LHS. |
| b | const String\& | سلسلة RHS. |
| options | CompareOptions | نوع مقارنة [String](../../../system/string/). |

### ReturnValue

قيمة سلبية إذا كانت سلسلة LHS تسبق سلسلة RHS، صفر إذا كانت متطابقة، قيمة إيجابية وإلا.

## انظر أيضًا

* Class [String](../../../system/string/)
* Enum [CompareOptions](../../compareoptions/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
## CompareInfo::Compare(const String\&, const String\&) const method


يقارن السلاسل. غير مُنفَّذ.

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, const String &string2) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| string1 | const String\& | سلسلة LHS. |
| string2 | const String\& | سلسلة RHS. |

### ReturnValue

قيمة سلبية إذا كانت سلسلة LHS تسبق سلسلة RHS، صفر إذا كانت متطابقة، قيمة إيجابية وإلا.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
## CompareInfo::Compare(const String\&, int, const String\&, int) const method


يقارن الجزء النهائي من سلسلة واحدة مع الجزء النهائي من السلسلة الثانية. غير مُنفَّذ.

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, int offset1, const String &string2, int offset2) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| string1 | const String\& | السلسلة الأولى. |
| offset1 | int | فهرس البداية للأحرف في **string1**. |
| string2 | const String\& | السلسلة الثانية. |
| offset2 | int | فهرس البداية للأحرف في **string2**. |

### ReturnValue

قيمة سالبة إذا كان قسم السلسلة الأول يسبق قسم السلسلة الثاني، صفر إذا كانا متطابقين، قيمة موجبة خلاف ذلك.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
## CompareInfo::Compare(const String\&, int, const String\&, int, CompareOptions) const method


يقارن الجزء النهائي من سلسلة واحدة مع الجزء النهائي من السلسلة الثانية باستخدام طرق مقارنة السلاسل. غير مُنفَّذ.

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, int offset1, const String &string2, int offset2, CompareOptions options) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| string1 | const String\& | السلسلة الأولى. |
| offset1 | int | فهرس البداية للأحرف في **string1**. |
| string2 | const String\& | السلسلة الثانية. |
| offset2 | int | فهرس البداية للأحرف في **string2**. |
| options | CompareOptions | [String](../../../system/string/) خيارات المقارنة. |

### ReturnValue

قيمة سالبة إذا كان قسم السلسلة الأول يسبق قسم السلسلة الثاني، صفر إذا كانا متطابقين، قيمة موجبة خلاف ذلك.

## انظر أيضًا

* Class [String](../../../system/string/)
* Enum [CompareOptions](../../compareoptions/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
## CompareInfo::Compare(const String\&, int, int, const String\&, int, int) const method


يقارن جزءًا من سلسلة واحدة مع جزء من السلسلة الثانية. غير مُنفَّذ.

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, int offset1, int length1, const String &string2, int offset2, int length2) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| string1 | const String\& | السلسلة الأولى. |
| offset1 | int | فهرس البداية للأحرف في **string1**. |
| length1 | int | عدد الأحرف في **string1** للمقارنة. |
| string2 | const String\& | السلسلة الثانية. |
| offset2 | int | فهرس البداية للأحرف في **string2**. |
| length2 | int | عدد الأحرف في **string2** للمقارنة. |

### ReturnValue

قيمة سالبة إذا كان قسم السلسلة الأول يسبق قسم السلسلة الثاني، صفر إذا كانا متطابقين، قيمة موجبة خلاف ذلك.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
## CompareInfo::Compare(const String\&, int, int, const String\&, int, int, CompareOptions) const method


يقارن جزءًا من سلسلة واحدة مع جزء من السلسلة الثانية باستخدام طرق مقارنة السلاسل. غير مُنفَّذ.

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, int offset1, int length1, const String &string2, int offset2, int length2, CompareOptions options) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| string1 | const String\& | السلسلة الأولى. |
| offset1 | int | فهرس البداية للأحرف في **string1**. |
| length1 | int | عدد الأحرف في **string1** للمقارنة. |
| string2 | const String\& | السلسلة الثانية. |
| offset2 | int | فهرس البداية للأحرف في **string2**. |
| length2 | int | عدد الأحرف في **string2** للمقارنة. |
| options | CompareOptions | [String](../../../system/string/) خيارات المقارنة. |

### ReturnValue

قيمة سالبة إذا كان قسم السلسلة الأول يسبق قسم السلسلة الثاني، صفر إذا كانا متطابقين، قيمة موجبة خلاف ذلك.

## انظر أيضًا

* Class [String](../../../system/string/)
* Enum [CompareOptions](../../compareoptions/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
