---
title: "الفئة System::Xml::XmlNamespaceManager"
linktitle: "XmlNamespaceManager"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Xml::XmlNamespaceManager. تحلّ، وتضيف، وتزيل مساحات الأسماء إلى مجموعة وتوفر إدارة النطاق لهذه المساحات في C++."
type: docs
weight: 2300
url: /ar/cpp/system.xml/xmlnamespacemanager/
---
## XmlNamespaceManager class


يحلّ، يضيف، ويزيل مساحات الأسماء إلى مجموعة ويوفر إدارة النطاق لهذه المساحات.

```cpp
class XmlNamespaceManager : public System::Xml::IXmlNamespaceResolver,
                            public System::Collections::Generic::IEnumerable<String>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [AddNamespace](./addnamespace/)(String, String) | يضيف مساحة الاسم المحددة إلى المجموعة. |
| virtual [get_DefaultNamespace](./get_defaultnamespace/)() | يعيد URI مساحة الاسم للمساحة الافتراضية. |
| virtual [get_NameTable](./get_nametable/)() | يعيد الـ[XmlNameTable](../xmlnametable/) المرتبط بهذا الكائن. |
| [GetEnumerator](./getenumerator/)() override | يعيد عدادًا لاستخدامه في التكرار عبر مساحات الأسماء في الـ[XmlNamespaceManager](./). |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | يعيد مجموعة من أسماء مساحات الأسماء مفهرسة بالبادئة يمكن استخدامها لتعداد مساحات الأسماء الحالية في النطاق. |
| virtual [HasNamespace](./hasnamespace/)(String) | يعيد قيمة تشير إلى ما إذا كان البادئة المقدمة لديها مساحة اسم معرفة للنطاق الحالي المدفوع. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | يعيد URI مساحة الاسم للبادئة المحددة. |
| [LookupPrefix](./lookupprefix/)(const String\&) override | يبحث عن البادئة المعلنة لمساحة الاسم URI المعطاة. |
| virtual [PopScope](./popscope/)() | يزيل نطاق مساحة الاسم من المكدس. |
| virtual [PushScope](./pushscope/)() | يدفع نطاق مساحة الاسم إلى المكدس. |
| virtual [RemoveNamespace](./removenamespace/)(String, String) | يزيل مساحة الاسم المحددة للمقدمة المحددة. |
| [XmlNamespaceManager](./xmlnamespacemanager/)(const SharedPtr\<XmlNameTable\>\&) | يُنشئ مثيلًا جديدًا من الفئة [XmlNamespaceManager](./) مع [XmlNameTable](../xmlnametable/) المحدد. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
