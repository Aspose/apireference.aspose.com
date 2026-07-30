---
title: "فئة System::Runtime::InteropServices::Marshal"
linktitle: "Marshal"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Runtime::InteropServices::Marshal. توفر تنفيذًا للمارشالينغ. للتوافق مع الكود المترجم فقط، حيث لا يتم دعم أي كود مُدار على جانب C++. هذا نوع ثابت بدون خدمات مثيل. يجب ألا تقوم بإنشاء مثيلات منه بأي وسيلة في C++."
type: docs
weight: 100
url: /ar/cpp/system.runtime.interopservices/marshal/
---
## Marshal class


يوفر تنفيذًا للترحيل. للتوافق مع الكود المترجم فقط، حيث لا يتم دعم أي كود مُدار على جانب C++. هذا نوع ثابت لا يحتوي على خدمات مثيل. يجب ألا تقوم بإنشاء مثيلات له بأي وسيلة.

```cpp
class Marshal
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [AllocHGlobal](./allochglobal/)(int32_t) | يخصص ذاكرة غير مُدارة. |
| static [AllocHGlobal](./allochglobal/)(IntPtr) | يخصص ذاكرة غير مُدارة. |
| static [Copy](./copy/)(const IntPtr, container\&&, int, int) | ينفّذ semantics للوظيفة العامة الثابتة void Copy(IntPtr source, byte[] destination, int startIndex, int length). |
| static [Copy](./copy/)(const void *, container\&&, int, int) | ينفّذ semantics للوظيفة العامة الثابتة void Copy(IntPtr source, byte[] destination, int startIndex, int length). |
| static [Copy](./copy/)(const container\&, int, void *, int) | ينفّذ الوظيفة العامة الثابتة void Copy(char[] source, int startIndex, IntPtr destination, int length). |
| static [Copy](./copy/)(const container\&, int, IntPtr, int) | ينفّذ الوظيفة العامة الثابتة void Copy(char[] source, int startIndex, IntPtr destination, int length). |
| static [FreeHGlobal](./freehglobal/)(IntPtr) | يحرّر الذاكرة غير المُدارة. |
| static [GetHRForException](./gethrforexception/)(const System::Exception\&) | يحصل على HResult من الاستثناء. |
| static [PtrToStringAnsi](./ptrtostringansi/)(IntPtr) | ينشئ [String](../../system/string/) مُدارًا من سلسلة UTF8 غير مُدارة منتهية بصفر. |
| static [PtrToStringAnsi](./ptrtostringansi/)(IntPtr, int) | ينشئ [String](../../system/string/) مُدارًا من سلسلة UTF8 غير مُدارة. |
| static [PtrToStringAuto](./ptrtostringauto/)(IntPtr) | ينشئ [String](../../system/string/) مُدارًا من سلسلة غير مُدارة منتهية بصفر. |
| static [PtrToStringAuto](./ptrtostringauto/)(IntPtr, int) | ينشئ [String](../../system/string/) مُدارًا من سلسلة غير مُدارة. |
| static [PtrToStringUni](./ptrtostringuni/)(IntPtr) | ينشئ [String](../../system/string/) مُدارًا من سلسلة Unicode غير مُدارة منتهية بصفر. |
| static [PtrToStringUni](./ptrtostringuni/)(IntPtr, int) | ينشئ [String](../../system/string/) مُدارًا من سلسلة Unicode غير مُدارة. |
| static [PtrToStringUTF8](./ptrtostringutf8/)(IntPtr) | ينشئ [String](../../system/string/) مُدارًا من سلسلة UTF8 غير مُدارة منتهية بصفر. |
| static [PtrToStringUTF8](./ptrtostringutf8/)(IntPtr, int) | ينشئ [String](../../system/string/) مُدارًا من سلسلة UTF8 غير مُدارة. |
| static [ReadByte](./readbyte/)(IntPtr, int) | يقرأ بايت من الذاكرة. |
| static [ReadInt16](./readint16/)(IntPtr, int) | يقرأ قيمة قصيرة (short) من الذاكرة. |
| static [ReadInt32](./readint32/)(IntPtr, int) | يقرأ عدد صحيح (int) من الذاكرة. |
| static [SecureStringToGlobalAllocAnsi](./securestringtoglobalallocansi/)(const SharedPtr\<Security::SecureString\>\&) | ينسخ محتويات السلسلة الآمنة المحددة إلى الذاكرة غير المُدارة، مع التحويل إلى تنسيق ANSI. |
| static [SecureStringToGlobalAllocUnicode](./securestringtoglobalallocunicode/)(const SharedPtr\<Security::SecureString\>\&) | ينسخ محتويات السلسلة الآمنة المحددة إلى الذاكرة غير المُدارة. |
| static [StringToHGlobalAnsi](./stringtohglobalansi/)(const String\&) | ينسخ محتويات سلسلة محددة إلى الذاكرة غير المُدارة. |
| static [StringToHGlobalAuto](./stringtohglobalauto/)(const String\&) | ينسخ محتويات سلسلة محددة إلى الذاكرة غير المُدارة، مع التحويل إلى تنسيق ANSI إذا لزم الأمر. |
| static [StringToHGlobalUni](./stringtohglobaluni/)(const String\&) | ينسخ محتويات سلسلة محددة إلى الذاكرة غير المُدارة. |
| static [WriteByte](./writebyte/)(IntPtr, int, uint8_t) | يكتب بايت إلى الذاكرة. |
| static [WriteByte](./writebyte/)(IntPtr, uint8_t) | يكتب بايت إلى الذاكرة. |
| static [WriteInt16](./writeint16/)(IntPtr, int, int16_t) | يكتب قيمة قصيرة (short) إلى الذاكرة. |
| static [WriteInt32](./writeint32/)(IntPtr, int, int32_t) | يكتب عددًا صحيحًا (int) إلى الذاكرة. |
| static [WriteInt64](./writeint64/)(IntPtr, int, int64_t) | يكتب قيمة طويلة إلى الذاكرة. |
| static [ZeroFreeGlobalAllocAnsi](./zerofreeglobalallocansi/)(IntPtr) | يفرغ مؤشر السلسلة غير المدار الذي تم تخصيصه باستخدام طريقة SecureStringToGlobalAllocAnsi. |
| static [ZeroFreeGlobalAllocUnicode](./zerofreeglobalallocunicode/)(IntPtr) | يفرغ مؤشر السلسلة غير المدار الذي تم تخصيصه باستخدام طريقة SecureStringToGlobalAllocUnicode. |
## انظر أيضًا

* Namespace [System::Runtime::InteropServices](../)
* Library [Aspose.Font for C++](../../)
