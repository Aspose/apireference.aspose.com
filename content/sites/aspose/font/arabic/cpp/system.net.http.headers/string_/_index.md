---
title: "System::Net::Http::Headers::HttpHeaderValueCollection< System::String > class"
linktitle: "String >"
second_title: "Aspose.Font لـ C++"
description: "System::Net::Http::Headers::HttpHeaderValueCollection< System::String > class. التخصيص الجزئي لقالب HttpHeaderValueCollection لنوع String. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 900
url: /ar/cpp/system.net.http.headers/string_/
---
## String > class


التخصيص الجزئي لقالب [HttpHeaderValueCollection](../httpheadervaluecollection/) لنوع [String](../../system/string/). يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class String > : public System::Collections::Generic::ICollection<System::String>,
                 public System::Collections::Generic::ICollection<System::String>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(const String\&) override | يضيف عنصرًا إلى المجموعة. |
| [Clear](./clear/)() override | يحذف جميع العناصر من المجموعة. |
| [Contains](./contains/)(const String\&) const override | يتحقق مما إذا كان العنصر موجودًا في المجموعة. |
| [CopyTo](./copyto/)(System::ArrayPtr\<String\>, int32_t) override |  |
| [get_Count](./get_count/)() const override | يحصل على عدد العناصر في المجموعة. |
| [get_IsReadOnly](./get_isreadonly/)() |  |
| [get_IsSpecialValueSet](./get_isspecialvalueset/)() |  |
| [GetEnumerator](./getenumerator/)() override | يحصل على المُعدِّد. |
| [GetHeaderStringWithoutSpecial](./getheaderstringwithoutspecial/)() |  |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>) |  |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, Action\<System::SharedPtr\<HttpHeaderValueCollection\<String\>\>, String\>) |  |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, String) |  |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, String, Action\<System::SharedPtr\<HttpHeaderValueCollection\<String\>\>, String\>) |  |
| [ParseAdd](./parseadd/)(String) |  |
| [Remove](./remove/)(const String\&) override | يحذف العنصر من المجموعة. |
| [RemoveSpecialValue](./removespecialvalue/)() |  |
| [SetSpecialValue](./setspecialvalue/)() |  |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | عيّن معامل القالب الـ n'th إلى مؤشر ضعيف (بدلاً من المشترك). يسمح بتبديل المؤشرات في الحاويات إلى الوضع الضعيف. |
| [ToString](./tostring/)() const override | تماثل طريقة C# [Object.ToString()](../../system/object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
| [TryParseAdd](./tryparseadd/)(String) |  |
## انظر أيضًا

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
