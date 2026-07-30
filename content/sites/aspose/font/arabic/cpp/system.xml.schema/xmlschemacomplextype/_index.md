---
title: "الفئة System::Xml::Schema::XmlSchemaComplexType"
linktitle: "XmlSchemaComplexType"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Xml::Schema::XmlSchemaComplexType. تمثل عنصر complexType من مخطط XML كما حددته منظمة الويب العالمية (W3C). تُعرّف هذه الفئة نوعًا مركبًا يحدد مجموعة السمات ومحتوى العنصر في C++."
type: docs
weight: 2100
url: /ar/cpp/system.xml.schema/xmlschemacomplextype/
---
## XmlSchemaComplexType class


تمثل عنصر **complexType** من XML [Schema](../) كما حددته منظمة الويب العالمية [Web](../../system.web/). تُعرّف هذه الفئة نوعًا مركبًا يحدد مجموعة السمات ومحتوى العنصر.

```cpp
class XmlSchemaComplexType : public System::Xml::Schema::XmlSchemaType
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | تُرجع القيمة للمكوّن [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) من النوع المركب. |
| [get_Attributes](./get_attributes/)() | تُرجع مجموعة السمات للنوع المركب. |
| [get_AttributeUses](./get_attributeuses/)() | تُرجع مجموعة جميع السمات المجمعة لهذا النوع المركب وأنواعه الأساسية. |
| [get_AttributeWildcard](./get_attributewildcard/)() | تُرجع قيمة ما بعد التجميع لـ **anyAttribute** لهذا النوع المركب وأنواعه الأساسية. |
| [get_Block](./get_block/)() | تُرجع السمة **block**. |
| [get_BlockResolved](./get_blockresolved/)() | يعيد القيمة بعد أن تم تجميع النوع إلى مجموعة معلومات ما بعد التحقق من صحة المخطط (infoset). تشير هذه القيمة إلى كيفية تطبيق النوع عندما يتم استخدام **xsi:type** في مستند الحالة. |
| [get_ContentModel](./get_contentmodel/)() | يعيد [XmlSchemaContentModel](../xmlschemacontentmodel/) ما بعد التجميع لهذا النوع المركب. |
| [get_ContentType](./get_contenttype/)() | يعيد نموذج المحتوى للنوع المركب الذي يحمل قيمة ما بعد التجميع. |
| [get_ContentTypeParticle](./get_contenttypeparticle/)() | يعيد الجسيم الذي يحمل قيمة ما بعد التجميع للجسيم [XmlSchemaComplexType::get_ContentType](./get_contenttype/). |
| [get_IsAbstract](./get_isabstract/)() | يعيد المعلومات التي تحدد ما إذا كان العنصر **complexType** يمكن استخدامه في مستند الحالة. |
| [get_IsMixed](./get_ismixed/)() override | يعيد المعلومات التي تحدد ما إذا كان النوع المركب يحتوي على نموذج محتوى مختلط (علامات داخل المحتوى). |
| [get_Particle](./get_particle/)() | يعيد نوع المُركّب كواحد من الفئات [XmlSchemaGroupRef](../xmlschemagroupref/)، [XmlSchemaChoice](../xmlschemachoice/)، [XmlSchemaAll](../xmlschemaall/)، أو [XmlSchemaSequence](../xmlschemasequence/). |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | يضبط القيمة لمكوّن [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) للنوع المركب. |
| [set_Block](./set_block/)(XmlSchemaDerivationMethod) | يضبط الخاصية **block**. |
| [set_ContentModel](./set_contentmodel/)(const SharedPtr\<XmlSchemaContentModel\>\&) | يضبط [XmlSchemaContentModel](../xmlschemacontentmodel/) ما بعد التجميع لهذا النوع المركب. |
| [set_IsAbstract](./set_isabstract/)(bool) | يضبط المعلومات التي تحدد ما إذا كان العنصر **complexType** يمكن استخدامه في مستند الحالة. |
| [set_IsMixed](./set_ismixed/)(bool) override | يضبط المعلومات التي تحدد ما إذا كان النوع المركب يحتوي على نموذج محتوى مختلط (علامات داخل المحتوى). |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | يضبط نوع المُركّب كواحد من الفئات [XmlSchemaGroupRef](../xmlschemagroupref/)، [XmlSchemaChoice](../xmlschemachoice/)، [XmlSchemaAll](../xmlschemaall/)، أو [XmlSchemaSequence](../xmlschemasequence/). |
| [XmlSchemaComplexType](./xmlschemacomplextype/)() | ينشئ مثيلًا جديدًا للفئة [XmlSchemaComplexType](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaType](../xmlschematype/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
