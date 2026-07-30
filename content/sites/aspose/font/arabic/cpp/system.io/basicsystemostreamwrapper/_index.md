---
title: "فئة System::IO::BasicSystemOStreamWrapper"
linktitle: "BasicSystemOStreamWrapper"
second_title: "Aspose.Font لـ C++"
description: "فئة System::IO::BasicSystemOStreamWrapper. تمثل غلافًا شبيهًا بـ std::ostream يستخدم BasicSystemIOStreamBuf كذاكرة داخلية في C++."
type: docs
weight: 700
url: /ar/cpp/system.io/basicsystemostreamwrapper/
---
## BasicSystemOStreamWrapper class


تمثل غلافًا شبيهًا بـ std::ostream يستخدم [BasicSystemIOStreamBuf](../basicsystemiostreambuf/) كذاكرة داخلية.

```cpp
template<typename Elem,typename Traits>class BasicSystemOStreamWrapper : public std::basic_ostream<Elem, std::char_traits<Elem>>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemOStreamWrapper\&&) | يُستخدم في مُنشئ النقل ومُعامل الإسناد بالنقل لإعادة تعيين المؤشرات واستدعاء [swap()](./swap/). |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/)(SharedPtr\<Stream\>, SystemIOStreamWrappingMode) | ينشئ مثيلًا جديدًا من [BasicSystemOStreamWrapper](./). |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/)(const BasicSystemOStreamWrapper\&) | منشئ النسخ. محذوف. |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/)(BasicSystemOStreamWrapper\&&) | منشئ نقل. |
| [operator=](./operator=/)(const BasicSystemOStreamWrapper\&) | عامل إسناد النسخ. محذوف. |
| [operator=](./operator=/)(BasicSystemOStreamWrapper\&&) | عامل إسناد النقل. |
| [swap](./swap/)(BasicSystemOStreamWrapper\&) | استدعاء لتبديل *this و **right** إذا لم يكونا متساويين. |
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
