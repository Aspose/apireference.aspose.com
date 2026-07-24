---
title: "نطاق System::Runtime::Serialization"
linktitle: "System::Runtime::Serialization"
second_title: "Aspose.Page لـ C++"
description: "كيفية استخدام نطاق System::Runtime::Serialization في C++."
type: docs
weight: 5300
url: /ar/cpp/system.runtime.serialization/
---



## الفئات

| فئة | الوصف |
| --- | --- |
| [FormatterConverter](./formatterconverter/) | يمثل تنفيذًا أساسيًا للواجهة [System::Runtime::Serialization::IFormatterConverter](./iformatterconverter/). |
| [IFormatterConverter](./iformatterconverter/) | يوفر الاتصال بين نسخة من [System::Runtime::Serialization::SerializationInfo](./serializationinfo/) والفئة التي يوفرها المُنسق والتي تكون الأنسب لتحليل البيانات داخل [System::Runtime::Serialization::SerializationInfo](./serializationinfo/). |
| [ISerializable](./iserializable/) | واجهة كائن يمكن تسلسله. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [SerializationInfo](./serializationinfo/) | يحتوي على مجموعة من الحقول المسماة التي تمثل كائنًا مُسلسلًا. غير مُنفّذ. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [StreamingContext](./streamingcontext/) | فئة وهمية لجعل الفئات المترجمة التي تستخدم StreamingContext تُترجم بنجاح. لا تدير نسخ هذه الفئة عبر [SmartPtr](../system/smartptr/)، يجب تخصيصها على المكدس فقط. |
