---
title: "طريقة System::Text::UTF7Encoding::GetChars"
linktitle: "GetChars"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Text::UTF7Encoding::GetChars. احصل على الأحرف الناتجة عن فك تشفير مخزن بايتات في C++."
type: docs
weight: 700
url: /ar/cpp/system.text/utf7encoding/getchars/
---
## UTF7Encoding::GetChars(ArrayPtr\<uint8_t\>) method


احصل على الأحرف الناتجة عن فك ترميز مخزن البايتات.

```cpp
virtual ArrayPtr<char_t> System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) لقراءة البايتات من. |

### ReturnValue

[Buffer](../../../system/buffer/) of decoded characters.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## UTF7Encoding::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) method


احصل على الأحرف الناتجة عن فك ترميز مخزن البايتات.

```cpp
int System::Text::UTF7Encoding::GetChars(ArrayPtr<uint8_t> bytes, int byte_index, int byte_count, ArrayPtr<char_t> chars, int char_index) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) لقراءة البايتات من. |
| byte_index | int | إزاحة مخزن الإدخال. |
| byte_count | int | حجم المخزن المؤقت للإدخال. |
| chars | ArrayPtr\<char_t\> | [Buffer](../../../system/buffer/) لوضع الأحرف فيه. |
| char_index | int | إزاحة المخزن المؤقت للإخراج. |

### ReturnValue

عدد الأحرف المكتوبة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## UTF7Encoding::GetChars(ArrayPtr\<uint8_t\>, int, int) method


احصل على الأحرف الناتجة عن فك ترميز مخزن البايتات.

```cpp
virtual ArrayPtr<char_t> System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes, int index, int count)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) لقراءة البايتات من. |
| الفهرس | int | إزاحة مخزن الإدخال. |
| count | int | حجم المخزن المؤقت للإدخال. |

### ReturnValue

[Buffer](../../../system/buffer/) of decoded characters.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## UTF7Encoding::GetChars(const uint8_t *, int, char_t *, int) method


احصل على الأحرف الناتجة عن فك ترميز مخزن البايتات.

```cpp
int System::Text::UTF7Encoding::GetChars(const uint8_t *bytes, int byte_count, char_t *chars, int char_count) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| bytes | const uint8_t * | [Buffer](../../../system/buffer/) لقراءة البايتات من. |
| byte_count | int | حجم المخزن المؤقت للإدخال. |
| chars | char_t * | [Buffer](../../../system/buffer/) لوضع الأحرف فيه. |
| char_count | int | حجم مخزن الإخراج. |

### ReturnValue

عدد الأحرف المكتوبة.

## انظر أيضًا

* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
