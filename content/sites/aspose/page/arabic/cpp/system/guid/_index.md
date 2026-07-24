---
title: "System::Guid class"
linktitle: "Guid"
second_title: "Aspose.Page لـ C++"
description: "System::Guid class. تمثّل معرفًا فريدًا عالميًا. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبداً فئة System::SmartPtr لإدارة كائنات هذا النوع في C++."
type: docs
weight: 3000
url: /ar/cpp/system/guid/
---
## Guid class


تمثّل معرفًا فريدًا عالميًا. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبداً فئة [System::SmartPtr](../smartptr/) لإدارة كائنات هذا النوع.

```cpp
class Guid
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CompareTo](./compareto/)(const Guid\&) const | يُجري مقارنة حسابية بين GUIDs التي تمثّلها الكائنات الحالية والمحددة. |
| [Equals](./equals/)(const Guid\&) const | يحدد ما إذا كانت GUIDs الممثلة بواسطة الكائن الحالي والكائن المحدد متساوية. |
| [GetHashCode](./gethashcode/)() const | يعيد رمز تجزئة للكائن الحالي. |
| [Guid](./guid/)() | ينشئ كائنًا يمثل GUID مكوّنًا من جميع الأصفار. |
| [Guid](./guid/)(const ArrayPtr\<uint8_t\>\&) | ينشئ كائنًا يمثل GUID محددًا كمصفوفة من قيم أعداد صحيحة غير موقعة 8‑بت. |
| [Guid](./guid/)(const System::Details::ArrayView\<uint8_t\>\&) | ينشئ كائنًا يمثل GUID محددًا كعرض لمصفوفة من قيم أعداد صحيحة غير موقعة 8‑بت. |
| [Guid](./guid/)(const String\&) | ينشئ كائنًا يمثل GUID محددًا كسلسلة نصية. |
| [Guid](./guid/)(int32_t, int16_t, int16_t, const ArrayPtr\<uint8_t\>\&) | ينشئ نسخة من فئة [Guid](./) باستخدام مكونات GUID المحددة. |
| [Guid](./guid/)(int32_t, int16_t, int16_t, const System::Details::ArrayView\<uint8_t\>\&) | ينشئ نسخة من فئة [Guid](./) باستخدام مكونات GUID المحددة. |
| [Guid](./guid/)(int32_t, int16_t, int16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) | ينشئ نسخة من فئة [Guid](./) باستخدام الأعداد الصحيحة غير الموقعة والبايتات المحددة. |
| [Guid](./guid/)(uint32_t, uint16_t, uint16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) | ينشئ نسخة من فئة [Guid](./) باستخدام الأعداد الصحيحة غير الموقعة والبايتات المحددة. |
| [Guid](./guid/)(const Guid\&) | ينشئ كائنًا يمثل نفس GUID مثل الكائن المحدد. |
| static [NewGuid](./newguid/)() | ينشئ GUID جديدًا ويعيد كائنًا من نوع [Guid](./) يمثلّه. |
| [operator!=](./operator!=/)(const Guid\&) const | يحدد ما إذا كانت GUIDs الممثلة بواسطة الكائن الحالي والكائن المحدد غير متساوية. |
| [operator=](./operator=/)(const Guid\&) | يُعيّن للكائن الحالي قيمة GUID الممثلة بواسطة الكائن [Guid](./) المحدد. |
| [operator==](./operator==/)(const Guid\&) const | يحدد ما إذا كانت GUIDs الممثلة بواسطة الكائن الحالي والكائن المحدد متساوية. |
| static [Parse](./parse/)(const String\&) | يحوّل تمثيل السلسلة النصية المحددة لـ GUID إلى كائن [Guid](./) مكافئ. |
| [ToByteArray](./tobytearray/)() const | يحوّل GUID الممثلة بواسطة الكائن الحالي إلى مصفوفة من البايتات. |
| [ToString](./tostring/)() const | يحوّل GUID الممثلة بواسطة الكائن الحالي إلى تمثيلها النصي. |
| [ToString](./tostring/)(const String\&) const | يحوّل GUID الممثلة بواسطة الكائن الحالي إلى تمثيلها النصي باستخدام تنسيق السلسلة المحدد. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const | يحوّل GUID الممثلة بواسطة الكائن الحالي إلى تمثيلها النصي باستخدام تنسيق السلسلة المحدد والثقافة. |
| static [TryParse](./tryparse/)(const String\&, Guid\&) | يحاول تحويل السلسلة المحددة إلى كائن [Guid](./). |
| [~Guid](./~guid/)() | المدمر. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Empty](./empty/) | يمثل GUID قيمته 0. |
## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
