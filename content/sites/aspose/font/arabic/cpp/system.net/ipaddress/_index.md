---
title: "الفئة System::Net::IPAddress"
linktitle: "عنوان IP"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Net::IPAddress. تمثل عنوان IP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2400
url: /ar/cpp/system.net/ipaddress/
---
## IPAddress class


تمثل عنوان IP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class IPAddress : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | يقارن الكائنات باستخدام دلالات C# [Object.Equals](../../system/object/equals/). |
| [get_AddressFamily](./get_addressfamily/)() | يرجع عائلة العناوين. |
| [get_IsIPv4MappedToIPv6](./get_isipv4mappedtoipv6/)() | يعيد قيمة تشير إلى ما إذا كان العنوان عنوان IPv4 ومُحوّل إلى عنوان IPv6. |
| [get_IsIPv6LinkLocal](./get_isipv6linklocal/)() | يعيد قيمة تشير إلى ما إذا كان العنوان عنوان IPv6 محلي الارتباط. |
| [get_IsIPv6Multicast](./get_isipv6multicast/)() | يعيد قيمة تشير إلى ما إذا كان العنوان عنوان IPv6 متعدد البث عالمي. |
| [get_IsIPv6SiteLocal](./get_isipv6sitelocal/)() | يعيد قيمة تشير إلى ما إذا كان العنوان عنوان IPv6 محلي الموقع. |
| [get_IsIPv6Teredo](./get_isipv6teredo/)() | يعيد قيمة تشير إلى ما إذا كان العنوان عنوان IPv6 Teredo. |
| [get_ScopeId](./get_scopeid/)() | يحصل على معرف النطاق لعنوان IPv6. |
| [GetAddressBytes](./getaddressbytes/)() | يعيد مصفوفة بايت لعنوان IP. |
| [GetHashCode](./gethashcode/)() const override | نظير طريقة C# [Object.GetHashCode()](../../system/object/gethashcode/). يتيح تجزئة الكائنات المخصصة. |
| [GetImpl](./getimpl/)() const | يرجع مؤشرًا إلى التنفيذ. |
| static [HostToNetworkOrder](./hosttonetworkorder/)(int64_t) | يحوّل ترتيب البايتات للمضيف المحدد إلى ترتيب البايتات الشبكي المقابل. |
| static [HostToNetworkOrder](./hosttonetworkorder/)(int32_t) | يحوّل ترتيب البايتات للمضيف المحدد إلى ترتيب البايتات الشبكي المقابل. |
| static [HostToNetworkOrder](./hosttonetworkorder/)(int16_t) | يحوّل ترتيب البايتات للمضيف المحدد إلى ترتيب البايتات الشبكي المقابل. |
| [IPAddress](./ipaddress/)(int64_t) | ينشئ نسخة جديدة. |
| [IPAddress](./ipaddress/)(System::ArrayPtr\<uint8_t\>, int64_t) | ينشئ نسخة جديدة. |
| [IPAddress](./ipaddress/)(System::ArrayPtr\<uint8_t\>) | ينشئ نسخة جديدة. |
| [IPAddress](./ipaddress/)() | ينشئ نسخة جديدة. |
| static [IsLoopback](./isloopback/)(System::SharedPtr\<IPAddress\>) | يعيد قيمة تشير إلى ما إذا كان العنوان المحدد عنوان حلقة رجوع. |
| [MapToIPv4](./maptoipv4/)() | يحوّل العنوان إلى عنوان IPv4. |
| [MapToIPv6](./maptoipv6/)() | يقوم بربط العنوان بعنوان IPv6. |
| static [NetworkToHostOrder](./networktohostorder/)(int64_t) | يقوم بتحويل ترتيب البايتات الشبكي المحدد إلى ترتيب البايتات الخاص بالمضيف المقابل. |
| static [NetworkToHostOrder](./networktohostorder/)(int32_t) | يقوم بتحويل ترتيب البايتات الشبكي المحدد إلى ترتيب البايتات الخاص بالمضيف المقابل. |
| static [NetworkToHostOrder](./networktohostorder/)(int16_t) | يقوم بتحويل ترتيب البايتات الشبكي المحدد إلى ترتيب البايتات الخاص بالمضيف المقابل. |
| static [Parse](./parse/)(String) | يقوم بتحويل سلسلة مُمرَّرة إلى نسخة من الفئة [IPAddress](./). |
| [set_ScopeId](./set_scopeid/)(int64_t) | يضبط معرف النطاق لعنوان IPv6. |
| [SetImpl](./setimpl/)(ImplPtr) | يضبط مؤشرًا إلى التنفيذ. |
| [ToString](./tostring/)() const override | تماثل طريقة C# [Object.ToString()](../../system/object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<IPAddress\>\&) | يحاول تحويل سلسلة مُمرَّرة إلى نسخة من الفئة [IPAddress](./). |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Any](./any/) | معلومات RTTI. |
| static [Broadcast](./broadcast/) | عنوان البث IPv4. |
| static [IPv6Any](./ipv6any/) | عنوان IPv6 الذي يحدد ما إذا كان الخادم يجب أن يستمع إلى جميع واجهات الشبكة. |
| static [IPv6Loopback](./ipv6loopback/) | عنوان الحلقة الخلفية IPv6. |
| static [IPv6None](./ipv6none/) | عنوان IPv6 الذي يحدد ما إذا كان الخادم لا يجب أن يستمع إلى أي واجهة شبكة. |
| static [Loopback](./loopback/) | عنوان الحلقة الخلفية IPv4. |
| static [None](./none/) | عنوان IPv4 الذي يحدد ما إذا كان الخادم لا يجب أن يستمع إلى أي واجهة شبكة. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [ImplPtr](./implptr/) | مؤشر إلى نوع التنفيذ. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
