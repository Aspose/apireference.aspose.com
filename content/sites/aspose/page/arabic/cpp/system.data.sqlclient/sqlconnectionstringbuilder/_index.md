---
title: "فئة System::Data::SqlClient::SqlConnectionStringBuilder"
linktitle: "SqlConnectionStringBuilder"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Data::SqlClient::SqlConnectionStringBuilder. مُنشئ اتصال قائم على SQL. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 100
url: /ar/cpp/system.data.sqlclient/sqlconnectionstringbuilder/
---
## SqlConnectionStringBuilder class


منشئ اتصال قائم على SQL. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class SqlConnectionStringBuilder : public System::Data::Common::DbConnectionStringBuilder
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_DataSource](./get_datasource/)() const | يحصل على مصدر البيانات (مثل اسم المضيف والمنفذ). |
| [get_Encrypt](./get_encrypt/)() const | يتحقق مما إذا كان التشفير ممكّنًا على السطر. |
| [get_InitialCatalog](./get_initialcatalog/)() const | يحصل على اسم قاعدة البيانات المرتبطة بالاتصال. |
| [get_NetworkLibrary](./get_networklibrary/)() const | يحصل على اسم مكتبة الشبكة المستخدمة. |
| [get_Password](./get_password/)() const | يحصل على كلمة المرور المستخدمة للاتصال بقاعدة البيانات. |
| [get_TrustServerCertificate](./get_trustservercertificate/)() const | يتحقق مما إذا كان الاتصال محميًا باستخدام شهادة الثقة للخادم. |
| [get_UserID](./get_userid/)() const | يحصل على معرف المستخدم المستخدم للاتصال. |
| [idx_get](./idx_get/)(String) override | معلومات RTTI. |
| [idx_set](./idx_set/)(String, Object::ptr) override | يضبط كائنًا مفتاحيًا. |
| [set_DataSource](./set_datasource/)(const String\&) | يحصل على مصدر البيانات (مثل اسم المضيف والمنفذ). |
| [set_Encrypt](./set_encrypt/)(bool) | يقلب التشفير بين التشغيل والإيقاف. |
| [set_InitialCatalog](./set_initialcatalog/)(const String\&) | يضبط اسم قاعدة البيانات المرتبطة بالاتصال. |
| [set_NetworkLibrary](./set_networklibrary/)(const String\&) | يختار مكتبة الشبكة للاستخدام. |
| [set_Password](./set_password/)(const String\&) | يضبط كلمة المرور التي ستُستخدم للاتصال بقاعدة البيانات. |
| [set_TrustServerCertificate](./set_trustservercertificate/)(bool) | يحدد ما إذا كان الاتصال محميًا باستخدام شهادة خادم موثوقة. |
| [set_UserID](./set_userid/)(const String\&) | يضبط معرف المستخدم لاستخدامه في الاتصال. |
## انظر أيضًا

* Class [DbConnectionStringBuilder](../../system.data.common/dbconnectionstringbuilder/)
* Namespace [System::Data::SqlClient](../)
* Library [Aspose.Page for C++](../../)
