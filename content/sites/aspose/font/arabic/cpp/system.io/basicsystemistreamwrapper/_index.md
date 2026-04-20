---
title: "الفئة System::IO::BasicSystemIStreamWrapper"
linktitle: "BasicSystemIStreamWrapper"
second_title: "Aspose.Font لـ C++"
description: "System::IO::BasicSystemIStreamWrapper class. تمثل غلافًا مشابهًا لـ std::istream يستخدم BasicSystemIOStreamBuf كذاكرة داخلية في C++."
type: docs
weight: 600
url: /ar/cpp/system.io/basicsystemistreamwrapper/
---
## BasicSystemIStreamWrapper class


تمثل غلافًا مشابهًا لـ std::istream يستخدم [BasicSystemIOStreamBuf](../basicsystemiostreambuf/) كذاكرة داخلية.

```cpp
template<typename Elem,typename Traits>class BasicSystemIStreamWrapper : public std::basic_istream<Elem, std::char_traits<Elem>>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemIStreamWrapper\&&) | يُستخدم في مُنشئ النقل ومُعامل الإسناد بالنقل لإعادة تعيين المؤشرات واستدعاء [swap()](./swap/). |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/)(SharedPtr\<Stream\>, SystemIOStreamWrappingMode) | ينشئ نسخة جديدة من [BasicSystemIStreamWrapper](./). |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/)(const BasicSystemIStreamWrapper\&) | منشئ النسخ. محذوف. |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/)(BasicSystemIStreamWrapper\&&) | منشئ نقل. |
| [operator=](./operator=/)(const BasicSystemIStreamWrapper\&) | عامل إسناد النسخ. محذوف. |
| [operator=](./operator=/)(BasicSystemIStreamWrapper\&&) | عامل إسناد النقل. |
| [swap](./swap/)(BasicSystemIStreamWrapper\&) | استدعاء لتبديل *this و **right** إذا لم يكونا متساويين. |
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
