---
title: "System::SmartPtrInfo class"
linktitle: "SmartPtrInfo"
second_title: "Aspose.Font لـ C++"
description: "System::SmartPtrInfo class. فئة خدمة لاختبار وتعديل محتويات SmartPtr''s دون معرفة النوع النهائي. تُستخدم لجمع القمامة واكتشاف مراجع الحلقة، إلخ. فكر فيها كـ ''pointer to pointer''. لا يمكننا استخدام النوع الأساسي لـ SmartPtr'' لأنه لا يوجد؛ بدلاً من ذلك، نستخدم فئة ''info'' هذه في C++."
type: docs
weight: 5600
url: /ar/cpp/system/smartptrinfo/
---
## SmartPtrInfo class


فئة خدمة لاختبار وتعديل محتويات [SmartPtr](../smartptr/)'s دون معرفة النوع النهائي. تُستخدم لجمع القمامة واكتشاف مراجع الحلقة، إلخ. فكر فيها كـ 'pointer to pointer'. لا يمكننا استخدام النوع الأساسي لـ [SmartPtr](../smartptr/)' لأنه لا يوجد؛ بدلاً من ذلك، نستخدم فئة 'info' هذه.

```cpp
class SmartPtrInfo
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [getInternalPtr](./getinternalptr/)() const | يحصل على الكائن الخام الذي يشير إليه المؤشر المرجعي. |
| [getObject](./getobject/)() const | يحصل على الكائن الذي يشير إليه المؤشر المرجعي. |
| [getOwned](./getowned/)() const | يحصل على مؤشر الكائن المملوك. |
| [operator bool](./operatorbool/)() const | يتحقق مما إذا كان كائن info يشير إلى مؤشر غير فارغ. |
| [operator!](./operator!/)() const | يتحقق مما إذا كان كائن info لا يشير إلى مؤشر غير فارغ. |
| [operator->](./operator-_/)() const | يسمح باستدعاء أساليب [Object](../object/) التي يشير إليها المؤشر المرجعي. |
| [operator<](./operator_/)(const SmartPtrInfo\&) const | يقارن قيم المؤشرات التي يشير إليها كائنان من نوع info باستخدام عملية أقل. |
| [SmartPtrInfo](./smartptrinfo/)() | ينشئ كائن [SmartPtrInfo](./) فارغ. |
| explicit [SmartPtrInfo](./smartptrinfo/)(const SmartPtr\<T\>\&) | ينشئ كائن [SmartPtrInfo](./) يحتوي على معلومات حول مؤشر ذكي محدد. |
## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
