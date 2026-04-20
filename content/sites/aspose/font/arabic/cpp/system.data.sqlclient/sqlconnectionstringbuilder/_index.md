---
title: "System::Data::SqlClient::SqlConnectionStringBuilder فئة"
linktitle: "SqlConnectionStringBuilder"
second_title: "Aspose.Font لـ C++"
description: "System::Data::SqlClient::SqlConnectionStringBuilder فئة. مُنشئ اتصال يعتمد على SQL. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيسبّب أخطاء تشغيلية و/أو أعطال تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 100
url: /ar/cpp/system.data.sqlclient/sqlconnectionstringbuilder/
---
## SqlConnectionStringBuilder class


مُنشئ اتصال يعتمد على SQL. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيسبّب أخطاء تشغيلية و/أو أعطال تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class SqlConnectionStringBuilder : public System::Data::Common::DbConnectionStringBuilder
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_DataSource](./get_datasource/)() const | يحصل على مصدر البيانات (مثال: اسم المضيف والمنفذ). |
| [get_Encrypt](./get_encrypt/)() const | يتحقق مما إذا كان التشفير مفعلاً على السطر. |
| [get_InitialCatalog](./get_initialcatalog/)() const | يحصل على اسم قاعدة البيانات المرتبطة بالاتصال. |
| [get_NetworkLibrary](./get_networklibrary/)() const | يحصل على اسم مكتبة الشبكة المستخدمة. |
| [get_Password](./get_password/)() const | يحصل على كلمة المرور المستخدمة للاتصال بقاعدة البيانات. |
| [get_TrustServerCertificate](./get_trustservercertificate/)() const | يتحقق مما إذا كان الاتصال محمياً باستخدام شهادة خادم موثوقة. |
| [get_UserID](./get_userid/)() const | يحصل على معرف المستخدم المستخدم للاتصال. |
| [idx_get](./idx_get/)(String) override | معلومات RTTI. |
| [idx_set](./idx_set/)(String, Object::ptr) override | يضبط الكائن المفتاحي. |
| [set_DataSource](./set_datasource/)(const String\&) | يحصل على مصدر البيانات (مثال: اسم المضيف والمنفذ). |
| [set_Encrypt](./set_encrypt/)(bool) | يقلب حالة التشفير بين تشغيل وإيقاف. |
| [set_InitialCatalog](./set_initialcatalog/)(const String\&) | يضبط اسم قاعدة البيانات المرتبطة بالاتصال. |
| [set_NetworkLibrary](./set_networklibrary/)(const String\&) | يختار مكتبة الشبكة للاستخدام. |
| [set_Password](./set_password/)(const String\&) | يضبط كلمة المرور التي ستُستخدم للاتصال بقاعدة البيانات. |
| [set_TrustServerCertificate](./set_trustservercertificate/)(bool) | يحدد ما إذا كان الاتصال محميًا باستخدام شهادة الخادم الموثوقة. |
| [set_UserID](./set_userid/)(const String\&) | يضبط معرف المستخدم للاستخدام في الاتصال. |
## انظر أيضًا

* Class [DbConnectionStringBuilder](../../system.data.common/dbconnectionstringbuilder/)
* Namespace [System::Data::SqlClient](../)
* Library [Aspose.Font for C++](../../)
