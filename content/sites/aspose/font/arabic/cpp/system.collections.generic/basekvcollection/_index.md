---
title: "System::Collections::Generic::BaseKVCollection فئة"
linktitle: "BaseKVCollection"
second_title: "Aspose.Font لـ C++"
description: "System::Collections::Generic::BaseKVCollection فئة. يحتوي على شفرة مشتركة لمجموعات المفاتيح أو القيم. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 700
url: /ar/cpp/system.collections.generic/basekvcollection/
---
## BaseKVCollection class


يحتوي على شفرة مشتركة لمجموعات المفاتيح أو القيم. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
template<typename Dict,typename KV>class BaseKVCollection : public System::Collections::Generic::IKVCollection<KV>
```


| معامل | الوصف |
| --- | --- |
| Dict | [Dictionary](../dictionary/) نوع. |
| KV | نوع المفتاح أو القيمة، حسب ما تُستخدم الواجهة له. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [BaseKVCollection](./basekvcollection/)(const typename Dict::Ptr\&) | ينشئ مجموعة. |
| [CopyTo](./copyto/)(ArrayPtr\<KV\>, int) override | ينسخ البيانات إلى عناصر المصفوفة الموجودة. |
| [get_Count](./get_count/)() const override | يحصل على عدد العناصر. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | يُمكّن التجميع، لكنه لا يقوم بأي شيء فعليًا لأن هذه البنية لا تملك بيانات. |

## انظر أيضًا

* Class [IKVCollection](../ikvcollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
