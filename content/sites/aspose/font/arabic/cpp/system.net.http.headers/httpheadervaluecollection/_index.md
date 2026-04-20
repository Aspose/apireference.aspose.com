---
title: "System::Net::Http::Headers::HttpHeaderValueCollection class"
linktitle: "HttpHeaderValueCollection"
second_title: "Aspose.Font لـ C++"
description: "System::Net::Http::Headers::HttpHeaderValueCollection class. يمثل مجموعة قيم رؤوس HTTP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 800
url: /ar/cpp/system.net.http.headers/httpheadervaluecollection/
---
## HttpHeaderValueCollection class


يمثل مجموعة قيم رؤوس HTTP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
template<typename T>class HttpHeaderValueCollection : public System::Collections::Generic::ICollection<T>
```


| معامل | الوصف |
| --- | --- |
| ال | نوع قيم رؤوس HTTP الممثلة في المجموعة. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(const T\&) override | يضيف عنصرًا إلى المجموعة. |
| [Clear](./clear/)() override | يحذف جميع العناصر من المجموعة. |
| [Contains](./contains/)(const T\&) const override | يتحقق مما إذا كان العنصر موجودًا في المجموعة. |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int32_t) override | ينسخ جميع عناصر المجموعة إلى عناصر مصفوفة موجودة. |
| [get_Count](./get_count/)() const override | معلومات RTTI. |
| [get_IsReadOnly](./get_isreadonly/)() | يحصل على قيمة تشير إلى ما إذا كانت المجموعة الحالية للقراءة فقط. |
| [get_IsSpecialValueSet](./get_isspecialvalueset/)() | يحصل على قيمة تشير إلى ما إذا كانت المجموعة الحالية تحتوي على "قيمة خاصة". |
| [GetEnumerator](./getenumerator/)() override | يحصل على المُعدِّد. |
| [GetHeaderStringWithoutSpecial](./getheaderstringwithoutspecial/)() | يرجع تمثيلًا نصيًا للمجموعة الحالية بدون "قيمة خاصة". |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>) | ينشئ نسخة جديدة. |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, Action\<System::SharedPtr\<HttpHeaderValueCollection\<T\>\>, T\>) | ينشئ نسخة جديدة. |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, T) | ينشئ نسخة جديدة. |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, T, Action\<System::SharedPtr\<HttpHeaderValueCollection\<T\>\>, T\>) | ينشئ نسخة جديدة. |
| [ParseAdd](./parseadd/)(String) | يقوم بتحليل تمثيل نصي للعنوان ويضيفه إلى المجموعة الحالية. |
| [Remove](./remove/)(const T\&) override | يحذف العنصر من المجموعة. |
| [RemoveSpecialValue](./removespecialvalue/)() | يزيل "قيمة خاصة". |
| [SetSpecialValue](./setspecialvalue/)() | يضبط "قيمة خاصة". |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | عيّن معامل القالب الـ n'th إلى مؤشر ضعيف (بدلاً من المشترك). يسمح بتبديل المؤشرات في الحاويات إلى الوضع الضعيف. |
| [ToString](./tostring/)() const override | تماثل طريقة C# [Object.ToString()](../../system/object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
| [TryParseAdd](./tryparseadd/)(String) | يحاول تحليل تمثيل نصي للعنوان وإضافته إلى المجموعة الحالية. |

## انظر أيضًا

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
