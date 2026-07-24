---
title: "System::Net::Security namespace"
linktitle: "System::Net::Security"
second_title: "Aspose.Page لـ C++"
description: "كيفية استخدام مساحة الاسم System::Net::Security في C++."
type: docs
weight: 4700
url: /ar/cpp/system.net.security/
---



## الفئات

| فئة | الوصف |
| --- | --- |
| [AuthenticatedStream](./authenticatedstream/) | يحتوي على الأساليب لتمرير بيانات الاعتماد عبر تدفق. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [SslStream](./sslstream/) | تدفق يستخدم بروتوكول SSL لمصادقة الخادم واختياريًا العميل. |
## Enums

| تعداد | الوصف |
| --- | --- |
| [AuthenticationLevel](./authenticationlevel/) | علامات المصادقة الخاصة بـ WebRequest. |
| [EncryptionPolicy](./encryptionpolicy/) | يسرد سياسات التشفير. |
| [SslPolicyErrors](./sslpolicyerrors/) | يسرد أخطاء سياسات SSL. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [LocalCertificateSelectionCallback](./localcertificateselectioncallback/) | مُفوض مستخدم يُستخدم لاختيار شهادة SSL المحلية. |
| [RemoteCertificateValidationCallback](./remotecertificatevalidationcallback/) | مُفوض مستخدم يُستخدم للتحقق من شهادة SSL البعيدة. |
