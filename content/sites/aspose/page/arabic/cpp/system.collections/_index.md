---
title: "نطاق System::Collections"
linktitle: "System::Collections"
second_title: "Aspose.Page لـ C++"
description: "كيفية استخدام نطاق System::Collections في C++."
type: docs
weight: 2200
url: /ar/cpp/system.collections/
---



## الفئات

| فئة | الوصف |
| --- | --- |
| [BitArray](./bitarray/) | [Array](../system/array/) من البتات التي يمكن الوصول إليها عبر الفهرس. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [BitArrayPtr](./bitarrayptr/) | مؤشر إلى [BitArray](./bitarray/). هذا النوع هو مؤشر لإدارة حذف الكائنات الأخرى. يجب تخصيصه على المكدس وتمريره إلى الدوال إما بالقيمة أو بالمرجع الثابت. |
| [CollectionBase](./collectionbase/) | يوفر فئة أساسية مجردة لمجموعة ذات نوعية محددة. |
| [ICollection](./icollection/) | يعرّف واجهة مجموعة غير عامة. |
| [IEnumerable](./ienumerable/) | [IEnumerable](./ienumerable/) هي الواجهة الأساسية لجميع المجموعات غير العامة التي يمكن تعدادها. |
| [IEnumerator](./ienumerator/) | واجهة للعداد التي يمكن استخدامها للتنقل عبر بعض العناصر. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [IEnumeratorImplRefType](./ienumeratorimplreftype/) | غلاف ينشئ تنفيذًا غير عام لـ [IEnumerator](./ienumerator/) فوق المكرّر العام [IEnumeratorImplRefType](./ienumeratorimplreftype/) - غلاف لأنواع المرجع. |
| [IEnumeratorImplValueType](./ienumeratorimplvaluetype/) | غلاف ينشئ تنفيذًا غير عام لـ [IEnumerator](./ienumerator/) فوق المكرّر العام [IEnumeratorImplRefType](./ienumeratorimplreftype/) - غلاف لأنواع القيمة. |
| [IEqualityComparer](./iequalitycomparer/) |  |
| [IList](./ilist/) | [IList](./ilist/) يمثل مجموعة غير عامة من الكائنات يمكن الوصول إليها فرديًا عبر الفهرس. |
| [IListImplRefType](./ilistimplreftype/) | قالب يطبق واجهة [System::Collections::IList](./ilist/) على كائن [System::Collections::Generic::List](../system.collections.generic/list/) تنفيذ لأنواع المرجع. |
| [IListImplValueType](./ilistimplvaluetype/) | قالب يطبق واجهة [System::Collections::IList](./ilist/) على كائن [System::Collections::Generic::List](../system.collections.generic/list/) تنفيذ لأنواع القيمة. |
| [IListWrapper](./ilistwrapper/) | واجهة لدعم التحويل من مجموعة عامة إلى مجموعة غير عامة. |
| [Invalidatable](./invalidatable/) | فئة تجعل من الممكن تتبع حالة فروعها عبر كائنات [InvalidatableTracker](./invalidatabletracker/). |
| [InvalidatableTracker](./invalidatabletracker/) | فئة تنفذ متتبعات كائنات [Invalidatable](./invalidatable/). |
