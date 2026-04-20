---
title: "مساحة الأسماء System::Runtime::Serialization"
linktitle: "System::Runtime::Serialization"
second_title: "Aspose.Font لـ C++"
description: "كيفية استخدام مساحة الأسماء System::Runtime::Serialization في C++."
type: docs
weight: 5700
url: /ar/cpp/system.runtime.serialization/
---



## الفئات

| الفئة | الوصف |
| --- | --- |
| [FormatterConverter](./formatterconverter/) | يمثل تنفيذًا أساسيًا للواجهة [System::Runtime::Serialization::IFormatterConverter](./iformatterconverter/). |
| [IFormatterConverter](./iformatterconverter/) | يوفر الاتصال بين مثيل [System::Runtime::Serialization::SerializationInfo](./serializationinfo/) والفئة التي يقدمها المُنسق والمناسبة لتحليل البيانات داخل [System::Runtime::Serialization::SerializationInfo](./serializationinfo/). |
| [ISerializable](./iserializable/) | واجهة كائن يمكن تسلسله. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [SerializationInfo](./serializationinfo/) | يحفظ مجموعة من الحقول المسماة التي تمثل الكائن المتسلسل. غير مُنفّذ. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [StreamingContext](./streamingcontext/) | فئة وهمية لجعل الفئات المترجمة التي تستخدم StreamingContext تُجمّع. لا تدير مثيلات هذه الفئة عبر [SmartPtr](../system/smartptr/)، يجب تخصيصها على المكدس فقط. |
