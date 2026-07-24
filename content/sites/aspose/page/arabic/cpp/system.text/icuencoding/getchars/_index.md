---
title: "طريقة System::Text::ICUEncoding::GetChars"
linktitle: "GetChars"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Text::ICUEncoding::GetChars. احصل على الأحرف الناتجة عن فك ترميز مخزن بايتات في C++."
type: docs
weight: 500
url: /ar/cpp/system.text/icuencoding/getchars/
---
## ICUEncoding::GetChars(ArrayPtr\<uint8_t\>) method


احصل على الأحرف الناتجة عن فك ترميز مخزن البايتات.

```cpp
virtual ArrayPtr<char_t> System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) لقراءة البايتات منه. |

### ReturnValue

[Buffer](../../../system/buffer/) of decoded characters.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoding::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) method


احصل على الأحرف الناتجة عن فك ترميز مخزن البايتات.

```cpp
virtual int System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes, int byte_index, int byte_count, ArrayPtr<char_t> chars, int char_index)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) لقراءة البايتات منه. |
| byte_index | int | إزاحة مخزن الإدخال. |
| byte_count | int | حجم المخزن المؤقت للإدخال. |
| chars | ArrayPtr\<char_t\> | [Buffer](../../../system/buffer/) لوضع الأحرف فيه. |
| char_index | int | إزاحة مخزن الإخراج. |

### ReturnValue

عدد الأحرف المكتوبة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoding::GetChars(ArrayPtr\<uint8_t\>, int, int) method


احصل على الأحرف الناتجة عن فك ترميز مخزن البايتات.

```cpp
virtual ArrayPtr<char_t> System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes, int index, int count)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) لقراءة البايتات منه. |
| الفهرس | int | إزاحة مخزن الإدخال. |
| count | int | حجم المخزن المؤقت للإدخال. |

### ReturnValue

[Buffer](../../../system/buffer/) of decoded characters.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoding::GetChars(const uint8_t *, int, char_t *, int) method


احصل على الأحرف الناتجة عن فك ترميز مخزن البايتات.

```cpp
int System::Text::ICUEncoding::GetChars(const uint8_t *bytes, int byte_count, char_t *chars, int char_count) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| bytes | const uint8_t * | [Buffer](../../../system/buffer/) لقراءة البايتات منه. |
| byte_count | int | حجم المخزن المؤقت للإدخال. |
| chars | char_t * | [Buffer](../../../system/buffer/) لوضع الأحرف فيه. |
| char_count | int | حجم مخزن الإخراج. |

### ReturnValue

عدد الأحرف المكتوبة.

## انظر أيضًا

* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
