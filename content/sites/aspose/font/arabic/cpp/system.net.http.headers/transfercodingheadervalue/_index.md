---
title: "System::Net::Http::Headers::TransferCodingHeaderValue فئة"
linktitle: "TransferCodingHeaderValue"
second_title: "Aspose.Font لـ C++"
description: "System::Net::Http::Headers::TransferCodingHeaderValue فئة. تمثل قيمة رأس ''Accept-Encoding''. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2400
url: /ar/cpp/system.net.http.headers/transfercodingheadervalue/
---
## TransferCodingHeaderValue class


تمثل قيمة رأس 'Accept-Encoding'. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class TransferCodingHeaderValue : public virtual System::ICloneable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | يقارن الكائنات باستخدام دلالات C# [Object.Equals](../../system/object/equals/). |
| [get_Parameters](./get_parameters/)() | يرجع المعلمات. |
| [get_Value](./get_value/)() | معلومات RTTI. |
| [GetHashCode](./gethashcode/)() const override | نظير طريقة C# [Object.GetHashCode()](../../system/object/gethashcode/). يتيح تجزئة الكائنات المخصصة. |
| static [GetTransferCodingLength](./gettransfercodinglength/)(String, int32_t, const HeaderFunc\<System::SharedPtr\<TransferCodingHeaderValue\>\>\&, System::SharedPtr\<TransferCodingHeaderValue\>\&) | يقوم بتحويل سلسلة مُمرَّرة من الفهرس المحدد إلى مثيل من الفئة [TransferCodingHeaderValue](./). |
| static [Parse](./parse/)(String) | يقوم بتحويل سلسلة مُمرَّرة إلى مثيل من الفئة [TransferCodingHeaderValue](./). |
| [ToString](./tostring/)() const override | تماثل طريقة C# [Object.ToString()](../../system/object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
| [TransferCodingHeaderValue](./transfercodingheadervalue/)() | ينشئ نسخة جديدة. |
| [TransferCodingHeaderValue](./transfercodingheadervalue/)(String) | ينشئ نسخة جديدة. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<TransferCodingHeaderValue\>\&) | يحاول تحويل سلسلة مُمرَّرة إلى مثيل من الفئة [TransferCodingHeaderValue](./). |
## انظر أيضًا

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
