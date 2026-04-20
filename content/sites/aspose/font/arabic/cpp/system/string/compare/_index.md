---
title: "طريقة System::String::Compare"
linktitle: "Compare"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::String::Compare. المقارنة بأقل-مساوي-أكبر تقارن سلسلتين في C++."
type: docs
weight: 6200
url: /ar/cpp/system/string/compare/
---
## String::Compare(const String\&, const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) method


Less-equal-greater-يقارن سلسلتين.

```cpp
static int System::String::Compare(const String &strA, const String &strB, bool ignoreCase, const SharedPtr<System::Globalization::CultureInfo> &ci)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| strA | const String\& | السلسلة الأولى للمقارنة. |
| strB | const String\& | السلسلة الثانية للمقارنة. |
| ignoreCase | bool | يحدد ما إذا كان المقارنة غير حساسة لحالة الأحرف. |
| ci | const SharedPtr\<System::Globalization::CultureInfo\>\& | الثقافة المستخدمة للمقارنة. |

### ReturnValue

قيمة سالبة إذا كان الجزء الفرعي الأول أصغر من الثاني، صفر إذا كانا متطابقين، قيمة موجبة خلاف ذلك.

## انظر أيضًا

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Compare(const String\&, const String\&, bool) method


Less-equal-greater-يقارن سلسلتين.

```cpp
static int System::String::Compare(const String &strA, const String &strB, bool ignoreCase=false)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| strA | const String\& | السلسلة الأولى للمقارنة. |
| strB | const String\& | السلسلة الثانية للمقارنة. |
| ignoreCase | bool | يحدد ما إذا كان المقارنة غير حساسة لحالة الأحرف. |

### ReturnValue

قيمة سالبة إذا كان الجزء الفرعي الأول أصغر من الثاني، صفر إذا كانا متطابقين، قيمة موجبة خلاف ذلك.

## انظر أيضًا

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Compare(const String\&, const String\&, System::StringComparison) method


Less-equal-greater-يقارن سلسلتين.

```cpp
static int System::String::Compare(const String &strA, const String &strB, System::StringComparison comparison_type)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| strA | const String\& | السلسلة الأولى للمقارنة. |
| strB | const String\& | السلسلة الثانية للمقارنة. |
| comparison_type | System::StringComparison | وضع [Comparison](../../comparison/). |

### ReturnValue

قيمة سالبة إذا كان الجزء الفرعي الأول أصغر من الثاني، صفر إذا كانا متطابقين، قيمة موجبة خلاف ذلك.

## انظر أيضًا

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Compare(const String\&, int, const String\&, int, int, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) method


Less-equal-greater-يقارن سلسلتين فرعيتين.

```cpp
static int System::String::Compare(const String &strA, int indexA, const String &strB, int indexB, int length, bool ignoreCase, const SharedPtr<System::Globalization::CultureInfo> &ci)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| strA | const String\& | السلسلة الأولى للمقارنة. |
| indexA | int | بداية الجزء الفرعي الأول من السلسلة. |
| strB | const String\& | السلسلة الثانية للمقارنة. |
| indexB | int | بداية الجزء الفرعي الثاني من السلسلة. |
| الطول | int | عدد الأحرف للمقارنة. |
| ignoreCase | bool | يحدد ما إذا كان المقارنة غير حساسة لحالة الأحرف. |
| ci | const SharedPtr\<System::Globalization::CultureInfo\>\& | الثقافة المستخدمة للمقارنة. |

### ReturnValue

قيمة سالبة إذا كان الجزء الفرعي الأول أصغر من الثاني، صفر إذا كانا متطابقين، قيمة موجبة خلاف ذلك.

## انظر أيضًا

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Compare(const String\&, int, const String\&, int, int, bool) method


Less-equal-greater-يقارن سلسلتين فرعيتين.

```cpp
static int System::String::Compare(const String &strA, int indexA, const String &strB, int indexB, int length, bool ignoreCase=false)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| strA | const String\& | السلسلة الأولى للمقارنة. |
| indexA | int | بداية الجزء الفرعي الأول من السلسلة. |
| strB | const String\& | السلسلة الثانية للمقارنة. |
| indexB | int | بداية الجزء الفرعي الثاني من السلسلة. |
| الطول | int | عدد الأحرف للمقارنة. |
| ignoreCase | bool | يحدد ما إذا كان المقارنة غير حساسة لحالة الأحرف. |

### ReturnValue

قيمة سالبة إذا كان الجزء الفرعي الأول أصغر من الثاني، صفر إذا كانا متطابقين، قيمة موجبة خلاف ذلك.

## انظر أيضًا

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Compare(const String\&, int, const String\&, int, int, System::StringComparison) method


Less-equal-greater-يقارن سلسلتين.

```cpp
static int System::String::Compare(const String &strA, int indexA, const String &strB, int indexB, int length, System::StringComparison comparison_type)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| strA | const String\& | السلسلة الأولى للمقارنة. |
| indexA | int | بداية الجزء الفرعي الأول من السلسلة. |
| strB | const String\& | السلسلة الثانية للمقارنة. |
| indexB | int | بداية الجزء الفرعي الثاني من السلسلة. |
| الطول | int | عدد الأحرف للمقارنة. |
| comparison_type | System::StringComparison | وضع [Comparison](../../comparison/). |

### ReturnValue

قيمة سالبة إذا كان الجزء الفرعي الأول أصغر من الثاني، صفر إذا كانا متطابقين، قيمة موجبة خلاف ذلك.

## انظر أيضًا

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
