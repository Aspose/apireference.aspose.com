---
title: "System::Security::Cryptography::AsnEncodedData فئة"
linktitle: "AsnEncodedData"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Security::Cryptography::AsnEncodedData. بيانات مُشفّرة بتنسيق ASN.1. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 100
url: /ar/cpp/system.security.cryptography/asnencodeddata/
---
## AsnEncodedData class


بيانات مُشفّرة بتنسيق ASN.1. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class AsnEncodedData : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [AsnEncodedData](./asnencodeddata/)(const SharedPtr\<AsnEncodedData\>\&) | معلومات RTTI. |
| [AsnEncodedData](./asnencodeddata/)(const ByteArrayPtr\&) | منشئ. |
| [AsnEncodedData](./asnencodeddata/)(const SharedPtr\<Oid\>\&, const ByteArrayPtr\&) | منشئ. |
| [AsnEncodedData](./asnencodeddata/)(const String\&, const ByteArrayPtr\&) | منشئ. |
| virtual [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) | ينسخ البيانات من كائن مختلف. |
| virtual [Format](./format/)(bool) const | يقوم بتنسيق البيانات بصيغة قابلة للقراءة من قبل الإنسان. |
| [get_Oid](./get_oid/)() const | يحصل على معرف الكائن للبيانات المشفرة. |
| [get_RawData](./get_rawdata/)() const | يحصل على البيانات المشفرة الخام. |
| [set_Oid](./set_oid/)(const SharedPtr\<Oid\>\&) | يضبط معرف الكائن للبيانات المشفرة. |
| [set_RawData](./set_rawdata/)(const ByteArrayPtr\&) | يضبط البيانات المشفرة الخام. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
