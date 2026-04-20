---
title: "Aspose::Font::TtfTables::TtfNameTable::AddMultiLanguageNames طريقة"
linktitle: "AddMultiLanguageNames"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::TtfTables::TtfNameTable::AddMultiLanguageNames طريقة. تستخرج جميع السلاسل متعددة اللغات من الكائن mlNames الممرَّر وتُنشئ هيكل NameRecord المقابل لكل سلسلة مستخرجة باستخدام المعاملات الممرَّرة platformId و platformSpecificId و nameId. يتم استخراج قيمة الحقل languageID من الكائن mlNames. يُضاف السجل الذي تم إنشاؤه حديثًا إلى الجدول. إذا تم العثور على سجل يتطابق مع السجل الذي تم إنشاؤه حديثًا بحسب الحقول platformID و platformSpecificID و nameID و langugeId، فلن يُضاف السجل الجديد وسيتم تحديث بيانات السلسلة فقط للسجل الموجود في C++."
type: docs
weight: 200
url: /ar/cpp/aspose.font.ttftables/ttfnametable/addmultilanguagenames/
---
## TtfNameTable::AddMultiLanguageNames method


يستخرج جميع السلاسل متعددة اللغات من الكائن *mlNames* الممرَّر ويُنشئ هيكل [NameRecord](../namerecord/) المقابل لكل سلسلة مستخرجة باستخدام المعاملات الممرَّرة *platformId* و *platformSpecificId* و *nameId*. يتم استخراج قيمة الحقل languageID من الكائن *mlNames*. يُضاف السجل الذي تم إنشاؤه حديثًا إلى الجدول. إذا تم العثور على سجل يتطابق مع السجل الذي تم إنشاؤه حديثًا بحسب الحقول platformID و platformSpecificID و nameID و, langugeId، فلن يُضاف السجل الجديد وسيتم تحديث بيانات السلسلة فقط للسجل الموجود.

```cpp
void Aspose::Font::TtfTables::TtfNameTable::AddMultiLanguageNames(System::SharedPtr<MultiLanguageString> mlNames, TtfNameTable::PlatformId platformId, uint16_t platformSpecificId, TtfNameTable::NameId nameId)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| mlNames | System::SharedPtr\<MultiLanguageString\> | سلسلة متعددة اللغات |
| platformId | TtfNameTable::PlatformId | معرف المنصة |
| platformSpecificId | uint16_t | معرّف الترميز الخاص بالمنصة |
| nameId | TtfNameTable::NameId | معرّف الاسم، فئة السلسلة المنطقية، المحدد بواسطة تعداد [NameId](../nameid/). |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [MultiLanguageString](../../../aspose.font/multilanguagestring/)
* Enum [PlatformId](../platformid/)
* Enum [NameId](../nameid/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
