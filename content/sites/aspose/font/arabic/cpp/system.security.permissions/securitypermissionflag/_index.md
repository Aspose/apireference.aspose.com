---
title: "System::Security::Permissions::SecurityPermissionFlag enum"
linktitle: "SecurityPermissionFlag"
second_title: "Aspose.Font لـ C++"
description: "System::Security::Permissions::SecurityPermissionFlag enum. علامات إذن الأمان في C++."
type: docs
weight: 300
url: /ar/cpp/system.security.permissions/securitypermissionflag/
---
## SecurityPermissionFlag enum


علامات إذن الأمان.

```cpp
enum class SecurityPermissionFlag
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| بدون علامات | 0 | بدون وصول. |
| تأكيد | 1 | تأكد من أن الإذن مُعطى. |
| كود غير مُدار | 2 | استدعاء كود غير مُدار. |
| تخطي التحقق | 4 | تخطي التحقق من الشيفرة. |
| التنفيذ | 8 | تنفيذ الشيفرة. |
| ControlThread | 16 | إجراء عمليات على الخيوط. |
| ControlEvidence | 32 | التحكم أو تعديل دليل CLR. |
| ControlPolicy | 64 | عرض وتغيير السياسة. |
| SerializationFormatter | 128 | تسلسل. |
| ControlDomainPolicy | 256 | تعيين سياسة النطاق. |
| ControlPrincipal | 512 | التحكم في كائن المبدأ. |
| ControlAppDomain | 1024 | التحكم في نطاق التطبيق. |
| RemotingConfiguration | 2048 | تكوين التوزيع عن بُعد. |
| البنية التحتية | 4096 | التوصيل إلى بنية CLR التحتية. |
| BindingRedirects | 8192 | إجراء إعادة توجيه ربط صريحة. |
| AllFlags | 16383 | غير مقيد. |

## انظر أيضًا

* Namespace [System::Security::Permissions](../)
* Library [Aspose.Font for C++](../../)
