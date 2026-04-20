---
title: "System::IO::BasicSystemIOStreamBuf class"
linktitle: "BasicSystemIOStreamBuf"
second_title: "Aspose.Font لـ C++"
description: "System::IO::BasicSystemIOStreamBuf class. يمثل مخزنًا يلف تدفقات شبيهة بـ System::IO::Stream-like ويسمح باستخدامها كمخزن داخلي لتدفقات شبيهة بـ std::iostream في C++."
type: docs
weight: 400
url: /ar/cpp/system.io/basicsystemiostreambuf/
---
## BasicSystemIOStreamBuf class


يمثل مخزنًا يلف تدفقات شبيهة بـ [System::IO::Stream](../stream/)-like ويسمح باستخدامها كمخزن داخلي لتدفقات شبيهة بـ std::iostream.

```cpp
template<typename Elem,typename Traits>class BasicSystemIOStreamBuf : public std::basic_streambuf<Elem, std::char_traits<Elem>>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemIOStreamBuf\&&) | يُستخدم في مُنشئ النقل ومُعامل الإسناد بالنقل لإعادة تعيين المؤشرات واستدعاء [swap()](./swap/). |
| explicit [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)() | ينشئ نسخة جديدة من [BasicSystemIOStreamBuf](./). |
| explicit [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)(const SharedPtr\<Stream\>\&, SystemIOStreamWrappingMode, const std::locale\&) | ينشئ نسخة جديدة من [BasicSystemIOStreamBuf](./). |
| [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)(const BasicSystemIOStreamBuf\&) | منشئ النسخ. محذوف. |
| [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)(BasicSystemIOStreamBuf\&&) | منشئ نقل. |
| [operator=](./operator=/)(const BasicSystemIOStreamBuf\&) | عامل إسناد النسخ. محذوف. |
| [operator=](./operator=/)(BasicSystemIOStreamBuf\&&) | عامل إسناد النقل. |
| [swap](./swap/)(BasicSystemIOStreamBuf\&) | استدعاء swap *this و right إذا لم يكونا متساويين. |
| [~BasicSystemIOStreamBuf](./~basicsystemiostreambuf/)() override | المدمر. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [char_type](./char_type/) |  |
| [int_type](./int_type/) |  |
| [Mysb](./mysb/) |  |
| [off_type](./off_type/) |  |
| [pos_type](./pos_type/) |  |
| [traits_type](./traits_type/) |  |
## انظر أيضًا

* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
