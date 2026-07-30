---
title: "منشئ System::String::String"
linktitle: "String"
second_title: "Aspose.Font لـ C++"
description: "منشئ System::String::String. منشئ افتراضي. ينشئ كائن سلسلة يُعتبر null في C++."
type: docs
weight: 100
url: /ar/cpp/system/string/string/
---
## String::String() constructor


منشئ افتراضي. ينشئ كائن سلسلة يُعتبر فارغًا.

```cpp
System::String::String()
```

## انظر أيضًا

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(codeporting_icu::UnicodeString\&&) constructor


منشئ نقل.

```cpp
System::String::String(codeporting_icu::UnicodeString &&str) noexcept
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| str | codeporting_icu::UnicodeString\&& | UnicodeString للتغليف في [String](../). |

## انظر أيضًا

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const ArrayPtr\<char16_t\>\&) constructor


يحوّل مصفوفة الأحرف بالكامل إلى سلسلة.

```cpp
System::String::String(const ArrayPtr<char16_t> &arr)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| arr | const ArrayPtr\<char16_t\>\& | [Array](../../array/) للتحويل إلى سلسلة. |

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const ArrayPtr\<char16_t\>\&, int, int) constructor


يحوّل نطاقًا فرعيًا من مصفوفة الأحرف إلى سلسلة. إذا كانت المعلمات خارج حدود المصفوفة، يتم إنشاء سلسلة فارغة.

```cpp
System::String::String(const ArrayPtr<char16_t> &arr, int offset, int len)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| arr | const ArrayPtr\<char16_t\>\& | مصفوفة أحرف. |
| إزاحة | int | فهرس بدء الجزء الفرعي. |
| len | int | طول الجزء الفرعي. |

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const char *, int) constructor


يبني سلسلة من مؤشر سلسلة أحرف وطول صريح.

```cpp
System::String::String(const char *str, int length)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| str | const char * | مؤشر [String](../) إلى بيانات UTF8، قد يكون حرفيًا أو مصفوفة. |
| الطول | int | طول السلسلة الصريح |

## انظر أيضًا

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const char16_t *, int) constructor


يبني سلسلة من مؤشر سلسلة أحرف وطول صريح.

```cpp
System::String::String(const char16_t *str, int length)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| str | const char16_t * | مؤشر [String](../)، قد يكون حرفيًا أو مصفوفة. |
| الطول | int | طول السلسلة الصريح |

## انظر أيضًا

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const char16_t *, int, int) constructor


يبني سلسلة من مؤشر سلسلة أحرف بدءًا من موضع معين باستخدام الطول.

```cpp
System::String::String(const char16_t *str, int start, int length)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| str | const char16_t * | مؤشر [String](../)، قد يكون حرفيًا أو مصفوفة. |
| start | int | الموضع الابتدائي. |
| length | int | طول [String](../). |

## انظر أيضًا

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const char16_t, int) constructor


منشئ تعبئة.

```cpp
System::String::String(const char16_t ch, int count)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| ch | const char16_t | حرف التعبئة. |
| count | int | الطول المستهدف. |

## انظر أيضًا

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const codeporting_icu::UnicodeString\&) constructor


يُغلف UnicodeString داخل [String](../).

```cpp
System::String::String(const codeporting_icu::UnicodeString &str)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| str | const codeporting_icu::UnicodeString\& | UnicodeString للتغليف في [String](../). |

## انظر أيضًا

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const std::string\&) constructor


ينشئ [String](../) من سلسلة std::string مقدمة بصيغة UTF-8.

```cpp
System::String::String(const std::string &utf8str)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| utf8str | const std::string\& | سلسلة std::string للتحويل إلى [String](../). |

## انظر أيضًا

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const std::u16string\&) constructor


ينشئ [String](../) من سلسلة utf16.

```cpp
System::String::String(const std::u16string &str)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| str | const std::u16string\& | سلسلة Utf16 للتحويل إلى [String](../). |

## انظر أيضًا

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const std::u32string\&) constructor


ينشئ [String](../) من سلسلة std::u32string.

```cpp
System::String::String(const std::u32string &u32str)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| u32str | const std::u32string\& | سلسلة std::u32string للتحويل إلى [String](../). |

## انظر أيضًا

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const std::wstring\&) constructor


ينشئ [String](../) من widestring.

```cpp
System::String::String(const std::wstring &str)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| str | const std::wstring\& | Widestring للتحويل إلى [String](../). |

## انظر أيضًا

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const String\&) constructor


منشئ النسخ.

```cpp
System::String::String(const String &str)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| str | const String\& | [String](../) للنسخ. |

## انظر أيضًا

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const T\&, typename std::enable_if\<IsStringPointer\<T, char\>::value\>::type *) constructor


يبني سلسلة بناءً على مؤشر سلسلة أحرف. يتعامل مع السلسلة المشار إليها كمنتهية بـ null بتشفير UTF8، ويحسب طول السلسلة الهدف بناءً على حرف null.

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<IsStringPointer<T, char>::value>::type *=nullptr)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | const T\& | مؤشر سلسلة الأحرف. |

## انظر أيضًا

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const T\&, typename std::enable_if\<IsStringPointer\<T, char16_t\>::value\>::type *) constructor


يبني سلسلة بناءً على مؤشر سلسلة أحرف. يتعامل مع السلسلة المشار إليها كمنتهية بـ null، ويحسب طول السلسلة الهدف بناءً على حرف null.

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<IsStringPointer<T, char16_t>::value>::type *=nullptr)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | const T\& | مؤشر سلسلة الأحرف. |

## انظر أيضًا

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const T\&, typename std::enable_if\<IsStringPointer\<T, wchar_t\>::value\>::type *) constructor


يبني سلسلة بناءً على مؤشر سلسلة أحرف واسعة. يتعامل مع السلسلة المشار إليها كمنتهية بـ null، ويحسب طول السلسلة الهدف بناءً على حرف null. التحويل من wchar_t يستغرق وقتًا على بعض المنصات، لذا لا يُسمح بالتحويلات الضمنية.

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<IsStringPointer<T, wchar_t>::value>::type *=nullptr)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | const T\& | مؤشر سلسلة الأحرف. |

## انظر أيضًا

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const T\&, typename std::enable_if\<std::is_same\<T, std::nullptr_t\>::value\>::type *) constructor


منشئ nullptr. مُعلن كقالب لحل الأولويات مع منشئات القالب الأخرى.

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<std::is_same<T, std::nullptr_t>::value>::type *=nullptr)
```


| معامل | الوصف |
| --- | --- |
| T | يجب أن يكون nullptr_t |

| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | const T\& | nullptr |

## انظر أيضًا

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const wchar_t *, int) constructor


يبني سلسلة من مؤشر سلسلة أحرف واسعة وطول صريح. التحويل من wchar_t يستغرق وقتًا على بعض المنصات، لذا لا يُسمح بالتحويلات الضمنية.

```cpp
System::String::String(const wchar_t *str, int length)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| str | const wchar_t * | مؤشر [String](../)، قد يكون حرفيًا أو مصفوفة. |
| الطول | int | طول السلسلة الصريح |

## انظر أيضًا

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(const wchar_t, int) constructor


منشئ تعبئة. التحويل من wchar_t يستغرق وقتًا على بعض المنصات، لذا لا يُسمح بالتحويلات الضمنية.

```cpp
System::String::String(const wchar_t ch, int count=1)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| ch | const wchar_t | حرف التعبئة. |
| count | int | الطول المستهدف. |

## انظر أيضًا

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(String\&&) constructor


منشئ نقل.

```cpp
System::String::String(String &&str) noexcept
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| str | String\&& | [String](../) لنقل البيانات منه. |

## انظر أيضًا

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(T\&, typename std::enable_if\<IsStringLiteral\<T, char\>::value\>::type *) constructor


يبني سلسلة بناءً على ثابت نصي. يعتبر الثابت سلسلة منتهية بـ null بتشفير UTF8، ويحسب طول السلسلة الهدف بناءً على حجم الثابت.

```cpp
template<typename T> System::String::String(T &value, typename std::enable_if<IsStringLiteral<T, char>::value>::type *=nullptr)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| value | T\& | مؤشر حرفي [String](../). |

## انظر أيضًا

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(T\&, typename std::enable_if\<IsStringLiteral\<T, char16_t\>::value\>::type *) constructor


يبني سلسلة بناءً على ثابت نصي. يعتبر الثابت سلسلة منتهية بـ null، ويحسب طول السلسلة الهدف بناءً على حجم الثابت.

```cpp
template<typename T> System::String::String(T &value, typename std::enable_if<IsStringLiteral<T, char16_t>::value>::type *=nullptr)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| value | T\& | مؤشر حرفي [String](../). |

## انظر أيضًا

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::String(T\&, typename std::enable_if\<IsStringLiteral\<T, wchar_t\>::value\>::type *) constructor


يبني سلسلة بناءً على ثابت نص واسع. يعتبر الثابت سلسلة منتهية بـ null، ويحسب طول السلسلة الهدف بناءً على حجم الثابت. التحويل من wchar_t يستغرق وقتًا على بعض المنصات، لذا لا يُسمح بالتحويلات الضمنية.

```cpp
template<typename T> System::String::String(T &value, typename std::enable_if<IsStringLiteral<T, wchar_t>::value>::type *=nullptr)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| value | T\& | مؤشر حرفي [String](../). |

## انظر أيضًا

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
