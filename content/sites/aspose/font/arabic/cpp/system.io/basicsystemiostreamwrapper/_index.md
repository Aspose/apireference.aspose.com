---
title: "الفئة System::IO::BasicSystemIOStreamWrapper"
linktitle: "BasicSystemIOStreamWrapper"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::IO::BasicSystemIOStreamWrapper. تمثل غلافًا مشابهًا لـ std::iostream يستخدم BasicSystemIOStreamBuf كذاكرة داخلية في C++."
type: docs
weight: 500
url: /ar/cpp/system.io/basicsystemiostreamwrapper/
---
## BasicSystemIOStreamWrapper class


تمثل غلافًا مشابهًا لـ std::iostream يستخدم [BasicSystemIOStreamBuf](../basicsystemiostreambuf/) كذاكرة داخلية.

```cpp
template<typename Elem,typename Traits>class BasicSystemIOStreamWrapper : public std::basic_iostream<Elem, std::char_traits<Elem>>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemIOStreamWrapper\&&) | يُستخدم في مُنشئ النقل ومُعامل الإسناد بالنقل لإعادة تعيين المؤشرات واستدعاء [swap()](./swap/). |
| [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/)(SharedPtr\<Stream\>, SystemIOStreamWrappingMode) | ينشئ نسخة جديدة من [BasicSystemIOStreamWrapper](./). |
| [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/)(const BasicSystemIOStreamWrapper\&) | منشئ النسخ. محذوف. |
| [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/)(BasicSystemIOStreamWrapper\&&) | منشئ نقل. |
| [operator=](./operator=/)(const BasicSystemIOStreamWrapper\&) | عامل إسناد النسخ. محذوف. |
| [operator=](./operator=/)(BasicSystemIOStreamWrapper\&&) | عامل إسناد النقل. |
| [swap](./swap/)(BasicSystemIOStreamWrapper\&) | استدعاء لتبديل *this و **right** إذا لم يكونا متساويين. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [char_type](./char_type/) |  |
| [Mybase](./mybase/) |  |
| [Mysb](./mysb/) |  |
| [traits_type](./traits_type/) |  |
## انظر أيضًا

* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
