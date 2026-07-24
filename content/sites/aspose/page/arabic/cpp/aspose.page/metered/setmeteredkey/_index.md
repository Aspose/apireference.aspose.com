---
title: "Aspose::Page::Metered::SetMeteredKey طريقة"
linktitle: "SetMeteredKey"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::Metered::SetMeteredKey طريقة. يحدد المفتاح العام والخاص للترخيص القائم على الاستهلاك. إذا قمت بشراء ترخيص مستهلك، عند بدء التطبيق، يجب استدعاء هذه API، عادةً يكون ذلك كافيًا. ومع ذلك، إذا فشل دائمًا رفع بيانات الاستهلاك وتجاوز 24 ساعة، سيتم ضبط الترخيص إلى حالة التقييم؛ لتجنب ذلك، يجب عليك فحص حالة الترخيص بانتظام، إذا كانت حالة التقييم، استدعِ هذه API مرة أخرى في C++."
type: docs
weight: 200
url: /ar/cpp/aspose.page/metered/setmeteredkey/
---
## Metered::SetMeteredKey method


يحدد المفتاح العام والخاص المقاس. إذا قمت بشراء ترخيص مقاس، عند بدء التطبيق يجب استدعاء هذه API، عادةً يكون ذلك كافيًا. ومع ذلك، إذا فشل دائمًا تحميل بيانات الاستهلاك وتجاوز 24 ساعة، سيتم ضبط الترخيص إلى حالة التقييم؛ لتجنب هذه الحالة، يجب عليك فحص حالة الترخيص بانتظام، إذا كانت حالة التقييم، استدعِ هذه API مرة أخرى.

```cpp
void Aspose::Page::Metered::SetMeteredKey(System::String publicKey, System::String privateKey)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| publicKey | System::String | مفتاح عام |
| privateKey | System::String | مفتاح خاص |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [Metered](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
