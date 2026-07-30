---
title: "الفئة System::Xml::XmlConvert"
linktitle: "XmlConvert"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Xml::XmlConvert. تقوم بترميز وفك ترميز أسماء XML، وتوفر طرقًا لتحويل بين أنواع وقت التشغيل وأنواع لغة تعريف مخطط XML (XSD). عند تحويل أنواع البيانات، تكون القيم المرجعة مستقلة عن الإعدادات المحلية في C++."
type: docs
weight: 1200
url: /ar/cpp/system.xml/xmlconvert/
---
## XmlConvert class


يقوم بترميز وفك ترميز أسماء XML، ويوفر طرقًا لتحويل بين أنواع وقت التشغيل وأنواع لغة تعريف [Schema](../../system.xml.schema/) XML (XSD). عند تحويل أنواع البيانات، تكون القيم المرجعة مستقلة عن الإعدادات المحلية.

```cpp
class XmlConvert : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [DecodeName](./decodename/)(const String\&) | يفك ترميز اسم. تقوم هذه الطريقة بالعكس بالنسبة للطريقتين XmlConvert::EncodeName(String) و XmlConvert::EncodeLocalName(String). |
| static [EncodeLocalName](./encodelocalname/)(const String\&) | يحوّل الاسم إلى اسم محلي XML صالح. |
| static [EncodeName](./encodename/)(const String\&) | يحوّل الاسم إلى اسم XML صالح. |
| static [EncodeNmToken](./encodenmtoken/)(const String\&) | يتحقق من أن الاسم صالح وفقًا لمواصفة XML. |
| static [IsNCNameChar](./isncnamechar/)(char16_t) | يفحص ما إذا كان الحرف المُمرَّ هو نوع حرف غير نقطتين صالح. |
| static [IsPublicIdChar](./ispublicidchar/)(char16_t) | يرجع نسخة الحرف المُمرَّ إذا كان الحرف في الوسيط هو حرف معرف عام صالح، وإلا **nullptr**. |
| static [IsStartNCNameChar](./isstartncnamechar/)(char16_t) | يفحص ما إذا كان الحرف المُمرَّ هو نوع حرف بدء اسم صالح. |
| static [IsWhitespaceChar](./iswhitespacechar/)(char16_t) | يفحص ما إذا كان الحرف المُمرَّ هو حرف مسافة فارغة XML صالح. |
| static [IsXmlChar](./isxmlchar/)(char16_t) | يفحص ما إذا كان الحرف المُمرَّ هو حرف XML صالح. |
| static [IsXmlSurrogatePair](./isxmlsurrogatepair/)(char16_t, char16_t) | يفحص ما إذا كان زوج الحروف البديلة المُمرَّ هو حرف XML صالح. |
| static [ToBoolean](./toboolean/)(String) | يحوّل الـ[String](../../system/string/) إلى ما يعادل الـ[Boolean](../../system/boolean/). |
| static [ToByte](./tobyte/)(const String\&) | يحوّل الـ[String](../../system/string/) إلى ما يعادل الـ[Byte](../../system/byte/). |
| static [ToChar](./tochar/)(const String\&) | يحوّل الـ[String](../../system/string/) إلى ما يعادل الـ[Char](../../system/char/). |
| static [ToDateTime](./todatetime/)(const String\&) | يحوّل الـ[String](../../system/string/) إلى ما يعادل الـ[DateTime](../../system/datetime/). |
| static [ToDateTime](./todatetime/)(const String\&, const String\&) | يحوّل الـ[String](../../system/string/) إلى ما يعادل الـ[DateTime](../../system/datetime/). |
| static [ToDateTime](./todatetime/)(const String\&, const ArrayPtr\<String\>\&) | يحوّل الـ[String](../../system/string/) إلى ما يعادل الـ[DateTime](../../system/datetime/). |
| static [ToDateTime](./todatetime/)(const String\&, XmlDateTimeSerializationMode) | يحوّل الـ[String](../../system/string/) إلى [DateTime](../../system/datetime/) باستخدام وضع [XmlDateTimeSerializationMode](../xmldatetimeserializationmode/) المحدد. |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&) | يحوّل الـ[String](../../system/string/) المزوَّد إلى ما يعادل الـ[DateTimeOffset](../../system/datetimeoffset/). |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&, const String\&) | يحوّل الـ[String](../../system/string/) المزوَّد إلى ما يعادل الـ[DateTimeOffset](../../system/datetimeoffset/). |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&, const ArrayPtr\<String\>\&) | يحوّل الـ[String](../../system/string/) المزوَّد إلى ما يعادل الـ[DateTimeOffset](../../system/datetimeoffset/). |
| static [ToDecimal](./todecimal/)(const String\&) | يحوّل الـ[String](../../system/string/) إلى ما يعادل الـ[Decimal](../../system/decimal/). |
| static [ToDouble](./todouble/)(String) | يحوّل الـ[String](../../system/string/) إلى ما يعادل الـ[Double](../../system/double/). |
| static [ToGuid](./toguid/)(const String\&) | يحوّل الـ[String](../../system/string/) إلى ما يعادل الـ[Guid](../../system/guid/). |
| static [ToInt16](./toint16/)(const String\&) | يحوّل الـ[String](../../system/string/) إلى ما يعادل الـ[Int16](../../system/int16/). |
| static [ToInt32](./toint32/)(const String\&) | يحوّل الـ[String](../../system/string/) إلى ما يعادل الـ[Int32](../../system/int32/). |
| static [ToInt64](./toint64/)(const String\&) | يحوّل الـ [String](../../system/string/) إلى ما يعادل [Int64](../../system/int64/). |
| static [ToSByte](./tosbyte/)(const String\&) | يحوّل الـ [String](../../system/string/) إلى ما يعادل [SByte](../../system/sbyte/). |
| static [ToSingle](./tosingle/)(String) | يحوّل الـ [String](../../system/string/) إلى ما يعادل [Single](../../system/single/). |
| static [ToString](./tostring/)(bool) | يحوّل الـ [Boolean](../../system/boolean/) إلى [String](../../system/string/). |
| static [ToString](./tostring/)(char16_t) | يحوّل الـ [Char](../../system/char/) إلى [String](../../system/string/). |
| static [ToString](./tostring/)(Decimal) | يحوّل الـ [Decimal](../../system/decimal/) إلى [String](../../system/string/). |
| static [ToString](./tostring/)(int8_t) | يحوّل الـ [SByte](../../system/sbyte/) إلى [String](../../system/string/). |
| static [ToString](./tostring/)(int16_t) | يحوّل الـ [Int16](../../system/int16/) إلى [String](../../system/string/). |
| static [ToString](./tostring/)(int32_t) | يحوّل الـ [Int32](../../system/int32/) إلى [String](../../system/string/). |
| static [ToString](./tostring/)(int64_t) | يحوّل الـ [Int64](../../system/int64/) إلى [String](../../system/string/). |
| static [ToString](./tostring/)(uint8_t) | يحوّل الـ [Byte](../../system/byte/) إلى [String](../../system/string/). |
| static [ToString](./tostring/)(uint16_t) | يحوّل الـ [UInt16](../../system/uint16/) إلى [String](../../system/string/). |
| static [ToString](./tostring/)(uint32_t) | يحوّل الـ [UInt32](../../system/uint32/) إلى [String](../../system/string/). |
| static [ToString](./tostring/)(uint64_t) | يحوّل الـ [UInt64](../../system/uint64/) إلى [String](../../system/string/). |
| static [ToString](./tostring/)(float) | يحوّل الـ [Single](../../system/single/) إلى [String](../../system/string/). |
| static [ToString](./tostring/)(double) | يحوّل الـ [Double](../../system/double/) إلى [String](../../system/string/). |
| static [ToString](./tostring/)(TimeSpan) | يحوّل الـ [TimeSpan](../../system/timespan/) إلى [String](../../system/string/). |
| static [ToString](./tostring/)(DateTime) | يحوّل الـ [DateTime](../../system/datetime/) إلى [String](../../system/string/). |
| static [ToString](./tostring/)(DateTime, const String\&) | يحوّل الـ [DateTime](../../system/datetime/) إلى [String](../../system/string/). |
| static [ToString](./tostring/)(DateTime, XmlDateTimeSerializationMode) | يحوّل الـ [DateTime](../../system/datetime/) إلى [String](../../system/string/) باستخدام وضع [XmlDateTimeSerializationMode](../xmldatetimeserializationmode/) المحدد. |
| static [ToString](./tostring/)(DateTimeOffset) | يحوّل الـ [DateTimeOffset](../../system/datetimeoffset/) المزوّد إلى [String](../../system/string/). |
| static [ToString](./tostring/)(DateTimeOffset, const String\&) | يحوّل الـ [DateTimeOffset](../../system/datetimeoffset/) المزوّد إلى [String](../../system/string/) بالتنسيق المحدد. |
| static [ToString](./tostring/)(Guid) | يحوّل الـ [Guid](../../system/guid/) إلى [String](../../system/string/). |
| static [ToTimeSpan](./totimespan/)(const String\&) | يحوّل الـ [String](../../system/string/) إلى ما يعادل [TimeSpan](../../system/timespan/). |
| static [ToUInt16](./touint16/)(const String\&) | يحوّل الـ [String](../../system/string/) إلى ما يعادل [UInt16](../../system/uint16/). |
| static [ToUInt32](./touint32/)(const String\&) | يحوّل الـ [String](../../system/string/) إلى ما يعادل [UInt32](../../system/uint32/). |
| static [ToUInt64](./touint64/)(const String\&) | يحوِّل الـ[String](../../system/string/) إلى ما يعادل [UInt64](../../system/uint64/). |
| static [VerifyName](./verifyname/)(const String\&) | يتحقق من أن الاسم هو اسم صالح وفقًا لتوصية لغة الترميز الموسعة W3C. |
| static [VerifyNCName](./verifyncname/)(const String\&) | يتحقق من أن الاسم هو **NCName** صالح وفقًا لتوصية لغة الترميز الموسعة W3C. الـ**NCName** هو اسم لا يمكن أن يحتوي على نقطتين. |
| static [VerifyNMTOKEN](./verifynmtoken/)(const String\&) | يتحقق من أن السلسلة هي NMTOKEN صالح وفقًا لتوصية W3C XML [Schema](../../system.xml.schema/) الجزء 2: الأنواع. |
| static [VerifyPublicId](./verifypublicid/)(const String\&) | يعيد نسخة السلسلة المُمرَّرة إذا كانت جميع الأحرف في وسيط السلسلة صالحة كأحرف معرف عام. |
| static [VerifyTOKEN](./verifytoken/)(const String\&) | يتحقق من أن السلسلة هي رمز صالح وفقًا لتوصية W3C XML [Schema](../../system.xml.schema/) الجزء 2: الأنواع. |
| static [VerifyWhitespace](./verifywhitespace/)(const String\&) | يعيد نسخة السلسلة المُمرَّرة إذا كانت جميع الأحرف في وسيط السلسلة صالحة كأحرف مسافة بيضاء. |
| static [VerifyXmlChars](./verifyxmlchars/)(const String\&) | يعيد السلسلة المُمرَّرة إذا كانت جميع الأحرف وأحرف أزواج الاستبدال في وسيط السلسلة صالحة كأحرف XML، وإلا يتم رمي [XmlException](../xmlexception/) مع معلومات عن أول حرف غير صالح تم مواجهته. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
