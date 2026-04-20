---
title: "System::Globalization::CompareInfo::Compare method"
linktitle: "Compare"
second_title: "Aspose.Font لـ C++"
description: "System::Globalization::CompareInfo::Compare method. يقارن السلاسل. يتم دعم وضعَي Ordinal و OrdinalIgnoreCase فقط في C++."
type: docs
weight: 200
url: /ar/cpp/system.globalization/compareinfo/compare/
---
## CompareInfo::Compare(const String\&, const String\&, CompareOptions) const method


يقارن السلاسل. يدعم فقط وضعَي Ordinal و OrdinalIgnoreCase.

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &a, const String &b, CompareOptions options) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| أ | const String\& | سلسلة LHS. |
| b | const String\& | سلسلة RHS. |
| options | CompareOptions | [String](../../../system/string/) نوع المقارنة. |

### ReturnValue

قيمة سلبية إذا كانت سلسلة LHS تسبق سلسلة RHS، صفر إذا كانتا متطابقتين، قيمة إيجابية خلاف ذلك.

## انظر أيضًا

* Class [String](../../../system/string/)
* Enum [CompareOptions](../../compareoptions/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Font for C++](../../../)
## CompareInfo::Compare(const String\&, const String\&) const method


يقارن السلاسل. غير مُنفّذ.

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, const String &string2) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| string1 | const String\& | سلسلة LHS. |
| string2 | const String\& | سلسلة RHS. |

### ReturnValue

قيمة سلبية إذا كانت سلسلة LHS تسبق سلسلة RHS، صفر إذا كانتا متطابقتين، قيمة إيجابية خلاف ذلك.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Font for C++](../../../)
## CompareInfo::Compare(const String\&, int, const String\&, int) const method


يقارن الجزء النهائي من سلسلة مع الجزء النهائي من سلسلة أخرى. غير مُنفّذ.

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, int offset1, const String &string2, int offset2) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| string1 | const String\& | السلسلة الأولى. |
| offset1 | int | فهرس البداية للأحرف في **string1**. |
| string2 | const String\& | السلسلة الثانية. |
| offset2 | int | مؤشر البداية للأحرف في **string2**. |

### ReturnValue

قيمة سالبة إذا كان القسم الأول من السلسلة يسبق القسم الثاني، صفر إذا كانا متطابقين، قيمة موجبة خلاف ذلك.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Font for C++](../../../)
## CompareInfo::Compare(const String\&, int, const String\&, int, CompareOptions) const method


يقارن الجزء النهائي من سلسلة مع الجزء النهائي من سلسلة أخرى باستخدام طرق مقارنة السلاسل. غير مُنفّذ.

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, int offset1, const String &string2, int offset2, CompareOptions options) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| string1 | const String\& | السلسلة الأولى. |
| offset1 | int | فهرس البداية للأحرف في **string1**. |
| string2 | const String\& | السلسلة الثانية. |
| offset2 | int | مؤشر البداية للأحرف في **string2**. |
| options | CompareOptions | خيارات مقارنة [String](../../../system/string/). |

### ReturnValue

قيمة سالبة إذا كان القسم الأول من السلسلة يسبق القسم الثاني، صفر إذا كانا متطابقين، قيمة موجبة خلاف ذلك.

## انظر أيضًا

* Class [String](../../../system/string/)
* Enum [CompareOptions](../../compareoptions/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Font for C++](../../../)
## CompareInfo::Compare(const String\&, int, int, const String\&, int, int) const method


يقارن جزءًا من سلسلة مع جزء من سلسلة أخرى. غير مُنفّذ.

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, int offset1, int length1, const String &string2, int offset2, int length2) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| string1 | const String\& | السلسلة الأولى. |
| offset1 | int | فهرس البداية للأحرف في **string1**. |
| length1 | int | عدد الأحرف في **string1** للمقارنة. |
| string2 | const String\& | السلسلة الثانية. |
| offset2 | int | مؤشر البداية للأحرف في **string2**. |
| length2 | int | عدد الأحرف في **string2** للمقارنة. |

### ReturnValue

قيمة سالبة إذا كان القسم الأول من السلسلة يسبق القسم الثاني، صفر إذا كانا متطابقين، قيمة موجبة خلاف ذلك.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Font for C++](../../../)
## CompareInfo::Compare(const String\&, int, int, const String\&, int, int, CompareOptions) const method


يقارن جزءًا من سلسلة مع جزء من سلسلة أخرى باستخدام طرق مقارنة السلاسل. غير مُنفّذ.

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, int offset1, int length1, const String &string2, int offset2, int length2, CompareOptions options) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| string1 | const String\& | السلسلة الأولى. |
| offset1 | int | فهرس البداية للأحرف في **string1**. |
| length1 | int | عدد الأحرف في **string1** للمقارنة. |
| string2 | const String\& | السلسلة الثانية. |
| offset2 | int | مؤشر البداية للأحرف في **string2**. |
| length2 | int | عدد الأحرف في **string2** للمقارنة. |
| options | CompareOptions | خيارات مقارنة [String](../../../system/string/). |

### ReturnValue

قيمة سالبة إذا كان القسم الأول من السلسلة يسبق القسم الثاني، صفر إذا كانا متطابقين، قيمة موجبة خلاف ذلك.

## انظر أيضًا

* Class [String](../../../system/string/)
* Enum [CompareOptions](../../compareoptions/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Font for C++](../../../)
