---
title: "طريقة System::BitConverter::ToString"
linktitle: "ToString"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::BitConverter::ToString. تحول جميع قيم مصفوفة البايتات المحددة إلى تمثيلها كسلسلة ست عشرية. حالة الأحرف المستخدمة في التمثيل الست عشري والفاصل المُدرج بين كل زوج من البايتات المتجاورة يتم تحديدهما عبر الوسائط المقابلة في C++."
type: docs
weight: 1200
url: /ar/cpp/system/bitconverter/tostring/
---
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, bool, const String\&) method


يقوم بتحويل جميع قيم مصفوفة البايت المحددة إلى تمثيلها كسلسلة ست عشرية. حالة الأحرف المستخدمة في التمثيل الست عشري والفاصل المُدرج بين كل زوج من البايتات المتجاورة تُحددان عبر الوسائط المقابلة.

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, bool uppercase=true, const String &separator=u"-")
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | [Array](../../array/) التي تحتوي على بايتات للتحويل |
| أحرف كبيرة | bool | يحدد حالة الأحرف المستخدمة في التمثيل الست عشري الناتج |
| فاصل | const String\& | سلسلة تُستخدم كفاصل يُدرج بين كل زوج من البايتات المتجاورة في السلسلة الناتجة |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified byte array

## انظر أيضًا

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, int) method


يقوم بتحويل قيم مصفوفة البايت المحددة إلى تمثيلها كسلسلة ست عشرية بدءًا من الفهرس المحدد.

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, int startIndex)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | [Array](../../array/) التي تحتوي على بايتات للتحويل |
| startIndex | int | الفهرس في المصفوفة المحددة الذي يبدأ منه التحويل |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified range of elements of the specified array

## انظر أيضًا

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, int, int) method


يقوم بتحويل نطاق من قيم مصفوفة البايت المحددة إلى تمثيلها كسلسلة ست عشرية.

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, int startIndex, int length)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | [Array](../../array/) التي تحتوي على بايتات للتحويل |
| startIndex | int | الفهرس في المصفوفة المحددة الذي يبدأ منه نطاق عناصر مصفوفة البايتات للتحويل |
| الطول | int | طول النطاق لعناصر مصفوفة البايتات التي سيتم تحويلها |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified range of elements of the specified array

## انظر أيضًا

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
