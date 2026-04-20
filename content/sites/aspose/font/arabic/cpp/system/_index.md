---
title: "مساحة الأسماء System"
linktitle: "System"
second_title: "Aspose.Font لـ C++"
description: "كيفية استخدام مساحة الأسماء System في C++."
type: docs
weight: 2500
url: /ar/cpp/system/
---



## الفئات

| الفئة | الوصف |
| --- | --- |
| [Activator](./activator/) | يحتوي على طرق لإنشاء أنواع الكائنات. |
| [Array](./array/) | فئة تمثل بنية بيانات المصفوفة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالتين [System::MakeArray()](./makearray/) و[System::MakeObject()](./makeobject/). لا تقم بإنشاء مثيل لهذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](./smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [ArraySegment](./arraysegment/) | يمثل جزءًا من المصفوفة أحادية البعد. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبدًا فئة [System::SmartPtr](./smartptr/) لإدارة كائنات هذا النوع. |
| [Attribute](./attribute/) | فئة أساسية للسمات المخصصة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](./makeobject/). لا تقم بإنشاء مثيل لهذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](./smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [BitConverter](./bitconverter/) | يحتوي على طرق تقوم بتحويل تسلسل البايتات إلى نوع قيمة والعكس. هذا نوع ثابت لا يقدم خدمات مثيلات. يجب ألا تنشئ أي مثيلات له بأي وسيلة. |
| [Boolean](./boolean/) | فئة تحتفظ بالأعضاء الثابتة لنوع [System.Boolean](./boolean/) .[Net](../system.net/). |
| [BoxedEnum](./boxedenum/) | يمثل قيمة تعداد مغلفة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](./makeobject/). لا تقم بإنشاء مثيل لهذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](./smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [BoxedValue](./boxedvalue/) | يمثل قيمة مغلفة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](./makeobject/). لا تقم بإنشاء مثيل لهذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](./smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [BoxedValueBase](./boxedvaluebase/) | فئة أساسية تُعرّف واجهة وتنفّذ بعض الأساليب الأساسية للفئة المشتقة التي تمثل قيمة مغلفة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](./makeobject/). لا تقم بإنشاء مثيل لهذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](./smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [Buffer](./buffer/) | يحتوي على طرق تُعالج مصفوفات البايت الخام. هذا نوع ثابت لا يقدم خدمات مثيلات. يجب ألا تنشئ أي مثيلات له بأي وسيلة. |
| [Byte](./byte/) | يحتوي على طرق للعمل مع عدد صحيح غير موقع 8‑بت. |
| [Char](./char/) | يوفر طرقًا لمعالجة الأحرف الممثلة كوحدات شفرة UTF-16. هذا نوع ثابت لا يقدم خدمات مثيلات. يجب ألا تنشئ أي مثيلات له بأي وسيلة. |
| [Comparison](./comparison/) | يمثل مؤشرًا إلى الطريقة التي تقارن كائنين من نفس النوع. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبدًا فئة [System::SmartPtr](./smartptr/) لإدارة كائنات هذا النوع. |
| [Console](./console/) | يوفر طرقًا لإخراج البيانات إلى تدفق الإخراج القياسي. هذا نوع ثابت لا يقدم خدمات مثيلات. يجب ألا تنشئ أي مثيلات له بأي وسيلة. |
| [ConsoleOutput](./consoleoutput/) | يمثل تدفق الإخراج القياسي. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](./makeobject/). لا تقم بإنشاء مثيل لهذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](./smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [DateTime](./datetime/) | يمثل قيمة تاريخ ووقت محددة على استمرارية الزمن. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبدًا فئة [System::SmartPtr](./smartptr/) لإدارة كائنات هذا النوع. |
| [DateTimeOffset](./datetimeoffset/) | يحتوي على التاريخ والوقت بالنسبة إلى التوقيت العالمي المنسق. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](./makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](./smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [DBNull](./dbnull/) | يمثل قيمة غير موجودة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](./makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](./smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [Decimal](./decimal/) | يمثل عددًا عشريًا. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبداً فئة [System::SmartPtr](./smartptr/) لإدارة كائنات هذا النوع. |
| [DefaultBoxedValue](./defaultboxedvalue/) | تنفيذ فئة [BoxedValue](./boxedvalue/). يسمح بتعريف تخصيصات BoxingValue دون تكرار الشيفرة المشتركة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](./makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](./smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [Delegate< ReturnType(ArgumentTypes...)>](./delegate_returntype(argumenttypes...)_/) | يمثل مؤشرًا إلى دالة أو طريقة أو كائن دالة. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبداً فئة [System::SmartPtr](./smartptr/) لإدارة كائنات هذا النوع. |
| [DynamicWeakPtr](./dynamicweakptr/) | فئة مؤشر ذكي تتعقب أوضاع المؤشرات للمعاملات القالبية للكائن المخزن وتحدّثها بعد كل إسناد. هذا النوع هو مؤشر لإدارة حذف كائن آخر. يجب تخصيصه على المكدس وتمريره إلى الدوال إما بالقيمة أو بالمرجع الثابت. |
| [EnumValues](./enumvalues/) | يوفر معلومات ميتا حول ثوابت التعداد لنوع التعداد **E**. |
| [EnumValuesBase](./enumvaluesbase/) | فئة أساسية لفئة تمثل معلومات ميتا لنوع التعداد. |
| [EventArgs](./eventargs/) | الفئة الأساسية للفئات التي تمثل سياقًا يُمرّر إلى المشتركين في الحدث عندما يتم تشغيل الحدث. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](./makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](./smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [ExceptionWrapper](./exceptionwrapper/) | قالب يمثل غلافًا للاستثناءات المشتقة من فئة [Exception](./exception/). |
| [FlagsAttribute](./flagsattribute/) | يشير إلى أن التعداد يمكن معالجته كحقل بت؛ أي مجموعة من. |
| [Func](./func/) | مفوض دالة. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبداً فئة [System::SmartPtr](./smartptr/) لإدارة كائنات هذا النوع. |
| [GC](./gc/) | يمثل جمع نفايات محاكى يعمل كقالب لا يقوم بأي شيء فعليًا. هذا نوع ثابت بدون خدمات مثيل. يجب ألا تنشئ أمثلة له بأي وسيلة. |
| [Guid](./guid/) | يمثل معرفًا فريدًا عالميًا. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبداً فئة [System::SmartPtr](./smartptr/) لإدارة كائنات هذا النوع. |
| [IAsyncResult](./iasyncresult/) | يمثل حالة العملية غير المتزامنة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](./makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](./smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [ICloneable](./icloneable/) | يعرف طريقة تمكّن من استنساخ الكائن - إنشاء نسخة من كائن. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](./makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](./smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [IComparable](./icomparable/) | يعرف طريقة تقارن كائنين. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](./makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](./smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [IConvertible](./iconvertible/) | يعرف طرقًا تحول قيمة النوع المرجعي أو القيمي المنفذ إلى نوع وقت تشغيل لغة مشتركة يمتلك قيمة مكافئة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](./makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](./smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [ICustomFormatter](./icustomformatter/) | يعرف طريقة تقوم بتنسيق مخصص لتمثيل النص لقيمة يمثلها الكائن المحدد. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](./makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](./smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [IDisposable](./idisposable/) | يعرف طريقة تُحرّر الموارد التي يمتلكها الكائن الحالي. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](./makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](./smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [IEquatable](./iequatable/) | يعرف طريقة تحدد مساواة كائنين. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](./makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](./smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [IFormatProvider](./iformatprovider/) | يعرف طريقة توفر معلومات التنسيق. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](./makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](./smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [IFormattable](./iformattable/) | يعرف طريقة تنسق قيمة الكائن الحالي باستخدام سلسلة التنسيق المحددة ومزود التنسيق. |
| [Int16](./int16/) | يحتوي على طرق للعمل مع عدد صحيح 16-بت. |
| [Int32](./int32/) | يحتوي على طرق للعمل مع عدد صحيح 32-بت. |
| [Int64](./int64/) | يحتوي على طرق للعمل مع عدد صحيح 64‑بت. |
| [LockContext](./lockcontext/) | كائن الحراسة الذي ينفّذ بيان lock() في C#. |
| [MarshalByRefObject](./marshalbyrefobject/) | يوفر الوصول إلى الكائنات عبر حدود نطاق التطبيق في التطبيقات التي تدعم الإرسال عن بُعد. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](./makeobject/). لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](./smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [MulticastDelegate< ReturnType(ArgumentTypes...)>](./multicastdelegate_returntype(argumenttypes...)_/) | يمثل مجموعة من المفوضين. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبداً فئة [System::SmartPtr](./smartptr/) لإدارة كائنات هذا النوع. |
| [Nullable](./nullable/) | إعلان مسبق. |
| [NullableUtils](./nullableutils/) | يمثل الفئة الثابتة C# [System.Nullable](./nullable/) (بدون معاملات نوع). لا يمكن استخدام الاسم الأصلي بسبب عدم القدرة على تحميل قوالب الفئات في C++. يدعم نوع قيمة يمكن تعيينه إلى null. لا يمكن وراثة هذه الفئة. |
| [Object](./object/) | الفئة الأساسية التي تمكّن من استخدام الطرق المتاحة لفئة [System.Object](./object/) في C#. يجب أن ترث جميع الفئات غير البسيطة المستخدمة في البيئة المترجمة منها. |
| [ObjectExt](./objectext/) | يوفر طرقاً ثابتة تحاكي طرق C# [Object](./object/) المستدعاة للأنواع غير الكائنية في C++ (السلاسل، الأعداد، إلخ). هذا نوع ثابت لا يحتوي على خدمات مثيل. لا يجب أبداً إنشاء أمثلة منه بأي وسيلة. |
| [ObjectType](./objecttype/) | يوفر طرقاً ثابتة تنفّذ getters لأنواع الكائنات. هذا نوع ثابت لا يحتوي على خدمات مثيل. لا يجب أبداً إنشاء أمثلة منه بأي وسيلة. |
| [OperatingSystem](./operatingsystem/) | يمثل نظام تشغيل معين ويقدم معلومات عنه. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](./makeobject/). لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](./smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [Random](./random/) | يمثل مولد أعداد عشوائية شبه عشوائية. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](./makeobject/). لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](./smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [ReadOnlySpan](./readonlyspan/) | إعلان مسبق للاستخدام داخل فئة [Span](./span/). |
| [ScopedCulture](./scopedculture/) | يمثل ثقافة تُستخدم ضمن النطاق. |
| [SmartPtr](./smartptr/) | فئة مؤشر لتغليف الأنواع التي تُخصَّص على الكومة. استخدمها لإدارة الذاكرة للفئات التي ترث من [Object](./object/). يتبع هذا النوع من المؤشرات دلالات المؤشر المتسلل. يُخزن عداد المرجع إما داخل [Object](./object/) نفسه أو في هيكل عداد مرتبط بشدة بمثيل [Object](./object/). على أي حال، جميع مثيلات [SmartPtr](./smartptr/) تُكوّن مجموعة ملكية واحدة بغض النظر عن طريقة إنشائها، وهذا يختلف عن سلوك فئة std::shared_ptr. تحويل مؤشر خام إلى [SmartPtr](./smartptr/) آمن بشرط وجود مثيلات أخرى من [SmartPtr](./smartptr/) تحتفظ بمراجع مشتركة إلى نفس الكائن. يمكن أن تكون مثيلة فئة [SmartPtr](./smartptr/) في إحدى حالتين: مؤشر مشترك ومؤشر ضعيف. للحفاظ على بقاء الكائن، يجب أن يكون عدد المراجع المشتركة له إيجابياً. يمكن استخدام كل من المؤشرات الضعيفة والمشتركة للوصول إلى الكائن المشار إليه (لإستدعاء الطرق، قراءة أو كتابة الحقول، إلخ)، لكن المؤشرات الضعيفة لا تشارك في عدّ مراجع المؤشر المشترك. يتم حذف [Object](./object/) عندما يتم تدمير آخر مؤشر 'مشترك' من نوع [SmartPtr](./smartptr/) يشير إليه. لذا، تأكد من عدم حدوث ذلك عندما لا توجد مؤشرات [SmartPtr](./smartptr/) مشتركة أخرى للكائن، مثل أثناء إنشاء الكائن أو تدميره. استخدم كائنات الحراسة System::Object::ThisProtector (في كود C++) أو السمة CppCTORSelfReference أو CppSelfReference (في كود C# المترجم) لإصلاح هذه المشكلة. بالمثل، تأكد من كسر حلقات الإشارة باستخدام فئة المؤشر [System::WeakPtr](./weakptr/) أو وضع المؤشر [System::SmartPtrMode::Weak](./smartptrmode/) (في كود C++) أو السمة CppWeakPtr (في كود C# المترجم). إذا كان هناك كائنان أو أكثر يشيران إلى بعضهما باستخدام مؤشرات 'مشتركة'، فلن يتم حذفها أبداً. إذا كان يجب تبديل نوع المؤشر (ضعيف أو مشترك) أثناء التشغيل، استخدم الطريقة [System::SmartPtr<T>::set_Mode()](./smartptr/set_mode/) أو الفئة [System::DynamicWeakPtr](./dynamicweakptr/). لا تحتوي فئة [SmartPtr](./smartptr/) على أي طرق افتراضية. يجب أن ترثها فقط إذا كنت تنشئ استراتيجية إدارة ذاكرة خاصة بك. هذا النوع هو مؤشر لإدارة حذف كائن آخر. يجب تخصيصه على المكدس وتمريره إلى الدوال إما بالقيمة أو بالمرجع الثابت. |
| [SmartPtrInfo](./smartptrinfo/) | فئة خدمة لاختبار وتعديل محتويات [SmartPtr](./smartptr/) دون معرفة النوع النهائي. تُستخدم لجمع القمامة واكتشاف حلقات الإشارة، إلخ. فكر فيها كـ 'مؤشر إلى مؤشر'. لا يمكننا استخدام النوع الأساسي لـ [SmartPtr](./smartptr/) لأنه لا يمتلك أي نوع؛ بدلاً من ذلك نستخدم هذه الفئة 'المعلومات'. |
| [Span](./span/) | يمثل منطقة متصلة من الذاكرة العشوائية مشابهة لـ std::span في C++20. |
| [String](./string/) | فئة [String](./string/) المستخدمة عبر المكتبة. هي بديل لـ C# [System.String](./string/) عند ترجمة الشيفرة. لأسباب تحسين الأداء، لا تُعتبر فئة فرعية من [Object](./object/). يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبداً فئة [System::SmartPtr](./smartptr/) لإدارة كائنات هذا النوع. |
| [StringComparer](./stringcomparer/) | يقارن السلاسل باستخدام أوضاع مقارنة مختلفة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](./makeobject/). لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](./smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [StringHashCompiletime](./stringhashcompiletime/) | فئة مساعدة تُولّد قيمة تجزئة من سلسلة c-string. |
| [TimeSpan](./timespan/) | يمثل فترة زمنية. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبداً فئة [System::SmartPtr](./smartptr/) لإدارة كائنات هذا النوع. |
| [TimeZone](./timezone/) | يمثل منطقة زمنية. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](./makeobject/). لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](./smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [TimeZoneInfo](./timezoneinfo/) | يمثل معلومات تصف منطقة زمنية معينة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](./makeobject/). لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](./smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [Tuple](./tuple/) | فئة تمثل بنية بيانات tuple. الحد الأقصى لعدد العناصر هو 8. |
| [TupleFactory](./tuplefactory/) | يوفر طرقاً ثابتة لإنشاء كائنات tuple. |
| [TypeInfo](./typeinfo/) | يمثل نوعًا معينًا ويقدم معلومات عنه. |
| [Uri](./uri/) | معرف الموارد الموحد. يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](./makeobject/). لا تقم أبداً بإنشاء مثيل من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](./smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [UriBuilder](./uribuilder/) | يوفر طرقًا لإنشاء وتعديل معرفات الموارد العالمية (URIs). يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](./makeobject/). لا تقم أبداً بإنشاء مثيل من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](./smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [UriParser](./uriparser/) | يُستخدم لتحليل مخطط URI جديد. يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](./makeobject/). لا تقم أبداً بإنشاء مثيل من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](./smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [UriShim](./urishim/) | فئة خدمة. |
| [ValueTuple](./valuetuple/) | فئة تمثل بنية بيانات [ValueTuple](./valuetuple/). |
| [ValueType](./valuetype/) | الفئة الأساسية لأنواع القيم التي ترث من [Object](./object/) مع تقصير الوراثة لأسباب تتعلق بالأداء. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبداً فئة [System::SmartPtr](./smartptr/) لإدارة كائنات هذا النوع. |
| [Version](./version/) | يمثل رقم نسخة. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبداً فئة [System::SmartPtr](./smartptr/) لإدارة كائنات هذا النوع. |
| [Void](./void/) |  |
| [WeakPtr](./weakptr/) | فئة فرعية من [System::SmartPtr](./smartptr/) تقوم بتعيين نفسها إلى الوضع الضعيف عند الإنشاء. يرجى ملاحظة أن هذه الفئة لا تضمن بقاء مثيلها في الوضع الضعيف دائمًا لأن الدالة [set_Mode()](./smartptr/set_mode/) لا تزال متاحة. هذا النوع هو مؤشر لإدارة حذف كائنات أخرى. يجب تخصيصه على المكدس وتمريره إلى الدوال إما بالقيمة أو بالمرجع الثابت. |
| [WeakReference](./weakreference/) | يمثل إشارة ضعيفة، تُشير إلى كائن مع السماح بحذف ذلك الكائن. |
| [WeakReference< T >](./weakreference_t_/) | يمثل إشارة ضعيفة، تُشير إلى كائن مع السماح بحذف ذلك الكائن. |
| [WeakReference<>](./weakreference__/) | يمثل إشارة ضعيفة، تُشير إلى كائن مع السماح بحذف ذلك الكائن. |
## Enums

| تعداد | الوصف |
| --- | --- |
| [Base64FormattingOptions](./base64formattingoptions/) | تعداد يحتوي على قيم تمثل صيغًا مختلفة للبيانات المشفرة بقاعدة 64. |
| [DateTimeKind](./datetimekind/) | قيم التعداد التي تمثل أنواع التاريخ والوقت. |
| [DayOfWeek](./dayofweek/) | تعداد يمثل يوماً من أيام الأسبوع. |
| [EnvironmentVariableTarget](./environmentvariabletarget/) | يحدد موقع متغير البيئة. |
| [MidpointRounding](./midpointrounding/) | يحدد سلوك دوال التقريب. |
| [PlatformID](./platformid/) | يمثل منصة نظام تشغيل. |
| [SmartPtrMode](./smartptrmode/) | نوع مؤشر [SmartPtr](./smartptr/): ضعيف أو مشترك. يحدد ما إذا كان يتم عد المؤشر عند اتخاذ قرار حذف الكائن أم لا. |
| [StringComparison](./stringcomparison/) | يحدد نمط مقارنة السلاسل. |
| [StringSplitOptions](./stringsplitoptions/) | يحدد سلوك تقسيم السلاسل. |
| [TypeCode](./typecode/) | يمثل نوع كائن. |
| [UriComponents](./uricomponents/) | يمثل مكونات URI. |
| [UriFormat](./uriformat/) | يحدد طريقة هروب URI. |
| [UriHostNameType](./urihostnametype/) | يمثل نوع اسم المضيف. |
| [UriKind](./urikind/) | يمثل أنواع URIs. |
| [UriPartial](./uripartial/) | يمثل أجزاء URI لطريقة [Uri.GetLeftPart](./uri/getleftpart/). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Action](./action/) | نوع تفويض يشير إلى طرق لا تُعيد قيمة. |
| [AggregateException](./aggregateexception/) |  |
| [ArrayPtr](./arrayptr/) | اسم مستعار لنوع 'مؤشر إلى مصفوفة'. |
| [AsyncCallback](./asynccallback/) | نوع تفويض يمثل طريقة تُستدعى عندما تكتمل العملية غير المتزامنة. |
| [BadImageFormatException](./badimageformatexception/) | الاستثناء الذي يُرمى عندما تكون صورة ملف مكتبة الارتباط الديناميكي (DLL) أو برنامج تنفيذي غير صالحة. لا تقم أبداً بلف مثيلات فئة [BadImageFormatException](./badimageformatexception/) داخل [System::SmartPtr](./smartptr/). |
| [ByteArrayPtr](./bytearrayptr/) | اسم مستعار لكائن مؤشر ذكي يشير إلى مصفوفة من أعداد صحيحة غير موقعة 8‑بت. |
| [Converter](./converter/) | يمثل مؤشرًا إلى الكيان القابل للاستدعاء الذي يقبل معاملًا واحدًا من النوع **TInput** ويعيد قيمة من النوع **TOutput**. |
| [DecoderFallbackBufferPtr](./decoderfallbackbufferptr/) | اسم مستعار لمؤشر ذكي يشير إلى نسخة من فئة [System::Text::DecoderFallbackBuffer](../system.text/decoderfallbackbuffer/). |
| [DecoderFallbackPtr](./decoderfallbackptr/) | اسم مستعار لمؤشر ذكي يشير إلى نسخة من فئة [System::Text::DecoderFallback](../system.text/decoderfallback/). |
| [DecoderPtr](./decoderptr/) | اسم مستعار لمؤشر ذكي يشير إلى نسخة من فئة [System::Text::Decoder](../system.text/decoder/). |
| [DecoderReplacementFallbackPtr](./decoderreplacementfallbackptr/) | اسم مستعار لمؤشر ذكي يشير إلى نسخة من فئة [System::Text::DecoderReplacementFallback](../system.text/decoderreplacementfallback/). |
| [DirectoryInfoPtr](./directoryinfoptr/) | اسم مستعار لمؤشر ذكي يشير إلى نسخة من فئة [System::IO::DirectoryInfo](../system.io/directoryinfo/). |
| [EncoderFallbackBufferPtr](./encoderfallbackbufferptr/) | اسم مستعار لمؤشر ذكي يشير إلى نسخة من فئة [System::Text::EncoderFallbackBuffer](../system.text/encoderfallbackbuffer/). |
| [EncoderFallbackPtr](./encoderfallbackptr/) | اسم مستعار لمؤشر ذكي يشير إلى نسخة من فئة [System::Text::EncoderFallback](../system.text/encoderfallback/). |
| [EncoderPtr](./encoderptr/) | اسم مستعار لمؤشر ذكي يشير إلى نسخة من فئة [System::Text::Encoder](../system.text/encoder/). |
| [EncoderReplacementFallbackBufferPtr](./encoderreplacementfallbackbufferptr/) | اسم مستعار لمؤشر ذكي يشير إلى نسخة من فئة [System::Text::EncoderReplacementFallbackBuffer](../system.text/encoderreplacementfallbackbuffer/). |
| [EncoderReplacementFallbackPtr](./encoderreplacementfallbackptr/) | اسم مستعار لمؤشر ذكي يشير إلى نسخة من فئة [System::Text::EncoderReplacementFallback](../system.text/encoderreplacementfallback/). |
| [EncodingInfoPtr](./encodinginfoptr/) | اسم مستعار لمؤشر ذكي يشير إلى نسخة من فئة [System::Text::EncodingInfo](../system.text/encodinginfo/). |
| [EncodingPtr](./encodingptr/) | اسم مستعار لمؤشر ذكي يشير إلى نسخة من فئة [System::Text::Encoding](../system.text/encoding/). |
| [Event](./event/) | يمثل حدثًا - آلية يتم من خلالها إبلاغ المشتركين بحدوث شيء يهمهم عبر استدعاء تفويض. |
| [EventArgsPtr](./eventargsptr/) | مؤشر مشترك إلى نسخة من فئة [EventArgs](./eventargs/). |
| [EventHandler](./eventhandler/) | يمثل طريقة تتفاعل مع حدث وتعالجه. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبدًا فئة [System::SmartPtr](./smartptr/) لإدارة كائنات من هذا النوع. |
| [Exception](./exception/) | اسم مستعار يُستخدم بدلاً من Details::Exception. |
| [ExceptionPtr](./exceptionptr/) | اسم نوع يُستخدم بواسطة أغلفة الاستثناءات. |
| [FileInfoPtr](./fileinfoptr/) | اسم مستعار لمؤشر ذكي يشير إلى نسخة من فئة [System::IO::FileInfo](../system.io/fileinfo/). |
| [FileStreamPtr](./filestreamptr/) | اسم مستعار لمؤشر ذكي يشير إلى نسخة من فئة [System::IO::FileStream](../system.io/filestream/). |
| [FileSystemInfoPtr](./filesysteminfoptr/) | اسم مستعار لمؤشر ذكي يشير إلى نسخة من فئة [System::IO::FileSystemInfo](../system.io/filesysteminfo/). |
| [FunctionPtr](./functionptr/) | اسم مستعار لنوع الدالة مع اتفاقية الاستدعاء الافتراضية. |
| [IAsyncResultPtr](./iasyncresultptr/) | مؤشر مشترك إلى [IAsyncResult](./iasyncresult/). |
| [IFormatProviderPtr](./iformatproviderptr/) | اسم مستعار لمؤشر ذكي يشير إلى نسخة من الفئة [System::IFormatProvider](./iformatprovider/). |
| [MakeConstRef_t](./makeconstref_t/) | نوع مساعد لـ [MakeConstRef](./makeconstref/) المعدل. |
| [MemoryStreamPtr](./memorystreamptr/) | اسم مستعار لمؤشر ذكي يشير إلى نسخة من الفئة [System::IO::MemoryStream](../system.io/memorystream/). |
| [Predicate](./predicate/) | يمثل مؤشرًا إلى دالة شرطية - كيانًا قابلًا للاستدعاء يقبل وسيطًا واحدًا ويعيد قيمة منطقية. |
| [RTaskPtr](./rtaskptr/) | اسم مستعار لمؤشر ذكي يشير إلى نسخة من الفئة [System::Threading::Tasks::ResultTask](../system.threading.tasks/resulttask/). |
| [SharedPtr](./sharedptr/) | اسم مستعار لمؤشر ذكي يُستخدم على نطاق واسع في المكتبة. |
| [StreamPtr](./streamptr/) | اسم مستعار لمؤشر ذكي يشير إلى نسخة من الفئة [System::IO::Stream](../system.io/stream/). |
| [StreamReaderPtr](./streamreaderptr/) | اسم مستعار لمؤشر ذكي يشير إلى نسخة من الفئة [System::IO::StreamReader](../system.io/streamreader/). |
| [StreamWriterPtr](./streamwriterptr/) | اسم مستعار لمؤشر ذكي يشير إلى نسخة من الفئة [System::IO::StreamWriter](../system.io/streamwriter/). |
| [StringComparerPtr](./stringcomparerptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من الفئة [StringComparer](./stringcomparer/). |
| [TaskPtr](./taskptr/) | اسم مستعار لمؤشر ذكي يشير إلى نسخة من الفئة [System::Threading::Tasks::Task](../system.threading.tasks/task/). |
| [TimeZoneInfoPtr](./timezoneinfoptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من الفئة [TimeZoneInfo](./timezoneinfo/). |
| [TimeZonePtr](./timezoneptr/) | مؤشر مشترك إلى نسخة من الفئة [TimeZone](./timezone/). |
## Functions

| دالة | الوصف |
| --- | --- |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Build | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| BuildArray | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| BuildObject | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Cast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastEnumerableTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastEnumerableTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CheckedCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Compare | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Compare | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| const_pointer_cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| تحويل ثابت | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| الافتراضي | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| الافتراضي | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| تجاهل | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| نفذ محاولة أخيرًا | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| نفذ محاولة أخيرًا | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| نفذ محاولة أخيرًا | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| تحويل مؤشر ديناميكي | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| تحويل ديناميكي | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| تحويل ديناميكي | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| تحويل ديناميكي | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| تحويل ديناميكي | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| تحويل ديناميكي | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| تحويل ديناميكي | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| تحويل ديناميكي | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| تحويل ديناميكي بدون استثناء | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| تحويل ديناميكي بدون استثناء | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| تحويل ديناميكي بدون استثناء | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| تحويل مصفوفة ديناميكي | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| الحصول على اسم التعداد | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| الحصول على اسم التعداد | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| يساوي | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| يساوي< double, double > | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| يساوي< float, float > | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| تحويل صريح | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| تحويل صريح | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| تحويل صريح | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| تحويل صريح | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| تحويل صريح | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| تحويل صريح | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| تحويل صريح | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| تحويل صريح | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| تحويل صريح | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| تحويل صريح | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| تحويل صريح | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| تحويل صريح | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| تحويل صريح | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| تحويل صريح | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| تحويل صريح | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| تحويل صريح | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| تحويل صريح | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| تحويل صريح | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| تحويل صريح | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| فرض تحويل ثابت | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| لكل عضو اسم قيمة عامة | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| أكبر أو يساوي | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| احصل على | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| احصل على | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| احصل على | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| احصل على | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| احصل على المؤشر | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| احصل على رمز التجزئة | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| احصل على رمز التجزئة | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| احصل على رمز التجزئة | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| احصل على رمز التجزئة | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| احصل على رمز التجزئة | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| أكبر من | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| تهيئة الكائن | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| هو | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| هو | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| هو | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| اختبار مع معلمات | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| اختبار vp | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| هل تم تعريف معلومات التعداد | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| هل تم تعريف معلومات التعداد | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IsInfinity | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IsNaN | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IsNegativeInfinity | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IsPositiveInfinity | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IsTuple | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IterateOver | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IterateOver | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IterateOver | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IterateOver | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IterateOver | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IterateOver | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IterateOver | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| LEqual | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Less | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeArray | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeArray | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeArray | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeAsync | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeAsync | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeObject | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeObject | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeScopeGuard | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeSharedPtr | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeSharedPtr | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeTuple | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeValueAsync | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeValueAsync | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeYieldEnumerable | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeYieldEnumerator | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MemberwiseClone | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ObjectType::GetType< System::DateTime > | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ObjectType::GetType< System::String > | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator* | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator+ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator+ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator+ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator+ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator+ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator+ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator- | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator- | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator- | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator- | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator/ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Ref | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Ref | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Ref | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| SafeInvoke | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Set | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_decrement_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_decrement_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_decrement_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_increment_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_increment_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_post_decrement_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_post_decrement_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_post_decrement_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_post_increment_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_post_increment_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_post_increment_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| static_pointer_cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCastArray | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCastArray | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| TieTuple | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| With | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| With | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
