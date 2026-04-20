---
title: "طريقة System::BitConverter::ToString"
linktitle: "ToString"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::BitConverter::ToString. تقوم بتحويل جميع قيم مصفوفة البايت المحددة إلى تمثيلها كسلسلة ست عشرية. حالة الأحرف المستخدمة في الترميز الست عشري والفاصل المُدرج بين كل زوج من البايتات المتجاورة يتم تحديدهما عبر المعاملات المقابلة في C++."
type: docs
weight: 1200
url: /ar/cpp/system/bitconverter/tostring/
---
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, bool, const String\&) method


يقوم بتحويل جميع قيم مصفوفة البايت المحددة إلى تمثيلها كسلسلة ست عشرية. حالة الأحرف المستخدمة في الترميز الست عشري والفاصل المُدرج بين كل زوج من البايتات المتجاورة محددان من خلال الوسائط المقابلة.

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, bool uppercase=true, const String &separator=u"-")
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | [Array](../../array/) التي تحتوي على بايتات للتحويل |
| أحرف كبيرة | bool | يحدد حالة الأحرف المستخدمة في تمثيل الست عشري الناتج |
| فاصل | const String\& | سلسلة تُستخدم كفاصل تُدرج بين كل زوج من البايتات المتجاورة في السلسلة الناتجة |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified byte array

## انظر أيضًا

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, int) method


يقوم بتحويل قيم مصفوفة البايت المحددة إلى تمثيلها كسلسلة ست عشرية بدءًا من الفهرس المحدد.

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, int startIndex)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | [Array](../../array/) التي تحتوي على بايتات للتحويل |
| startIndex | int | الفهرس في المصفوفة المحددة الذي يبدأ التحويل عنده |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified range of elements of the specified array

## انظر أيضًا

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, int, int) method


يقوم بتحويل نطاق من قيم مصفوفة البايت المحددة إلى تمثيلها كسلسلة ست عشرية.

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, int startIndex, int length)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | [Array](../../array/) التي تحتوي على بايتات للتحويل |
| startIndex | int | الفهرس في المصفوفة المحددة الذي يبدأ منه نطاق عناصر مصفوفة البايت للتحويل |
| الطول | int | طول النطاق لعناصر مصفوفة البايت التي سيتم تحويلها |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified range of elements of the specified array

## انظر أيضًا

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
