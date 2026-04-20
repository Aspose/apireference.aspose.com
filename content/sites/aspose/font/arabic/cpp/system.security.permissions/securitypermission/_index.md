---
title: "System::Security::Permissions::SecurityPermission class"
linktitle: "SecurityPermission"
second_title: "Aspose.Font لـ C++"
description: "System::Security::Permissions::SecurityPermission class. فئة تصف إذن الأمان. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 100
url: /ar/cpp/system.security.permissions/securitypermission/
---
## SecurityPermission class


فئة تصف إذن الأمان. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class SecurityPermission : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Flags](./get_flags/)() | معلومات RTTI. |
| [IsUnrestricted](./isunrestricted/)() | يتحقق مما إذا كان الإذن غير مقيد. |
| [SecurityPermission](./securitypermission/)(PermissionState) | المُنشئ. |
| [SecurityPermission](./securitypermission/)(SecurityPermissionFlag) | المُنشئ. |
| [set_Flags](./set_flags/)(SecurityPermissionFlag) | يضبط العلامات المرتبطة بالإذن. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Security::Permissions](../)
* Library [Aspose.Font for C++](../../)
