---
title: "System::Xml::Schema::XmlSchemaComplexType فئة"
linktitle: "XmlSchemaComplexType"
second_title: "Aspose.Page لـ C++"
description: "فئة XmlSchemaComplexType. تمثّل عنصر **complexType** من XML Schema كما هو محدد من قبل اتحاد الويب العالمي (W3C). تُعرّف هذه الفئة نوعًا مركبًا يحدد مجموعة السمات ومحتوى عنصر في C++."
type: docs
weight: 2100
url: /ar/cpp/system.xml.schema/xmlschemacomplextype/
---
## XmlSchemaComplexType class


يمثّل عنصر **complexType** من XML [Schema](../) كما هو محدد من قبل اتحاد [Web](../../system.web/) العالمي (W3C). تُعرّف هذه الفئة نوعًا مركبًا يحدد مجموعة السمات ومحتوى عنصر.

```cpp
class XmlSchemaComplexType : public System::Xml::Schema::XmlSchemaType
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | يعيد القيمة للمكوّن [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) من النوع المركب. |
| [get_Attributes](./get_attributes/)() | يعيد مجموعة السمات للنوع المركب. |
| [get_AttributeUses](./get_attributeuses/)() | يعيد مجموعة جميع السمات المتوافقة لهذا النوع المركب وأنواعه الأساسية. |
| [get_AttributeWildcard](./get_attributewildcard/)() | يعيد القيمة بعد التجميع لـ **anyAttribute** لهذا النوع المركب وأنواعه الأساسية. |
| [get_Block](./get_block/)() | يعيد السمة **block**. |
| [get_BlockResolved](./get_blockresolved/)() | يعيد القيمة بعد أن يتم تجميع النوع إلى مجموعة معلومات ما بعد التحقق من المخطط (infoset). تشير هذه القيمة إلى كيفية تطبيق النوع عندما يُستخدم **xsi:type** في مستند الحالة. |
| [get_ContentModel](./get_contentmodel/)() | يعيد [XmlSchemaContentModel](../xmlschemacontentmodel/) ما بعد التجميع لهذا النوع المركب. |
| [get_ContentType](./get_contenttype/)() | يعيد نموذج المحتوى للنوع المركب الذي يحمل القيمة بعد التجميع. |
| [get_ContentTypeParticle](./get_contenttypeparticle/)() | يعيد الجسيم الذي يحمل القيمة بعد التجميع لجسيم [XmlSchemaComplexType::get_ContentType](./get_contenttype/). |
| [get_IsAbstract](./get_isabstract/)() | يعيد المعلومات التي تحدد ما إذا كان عنصر **complexType** يمكن استخدامه في مستند الحالة. |
| [get_IsMixed](./get_ismixed/)() override | يعيد المعلومات التي تحدد ما إذا كان النوع المركب يمتلك نموذج محتوى مختلط (علامات داخل المحتوى). |
| [get_Particle](./get_particle/)() | يعيد نوع المُركّب كواحد من الفئات [XmlSchemaGroupRef](../xmlschemagroupref/)، [XmlSchemaChoice](../xmlschemachoice/)، [XmlSchemaAll](../xmlschemaall/)، أو [XmlSchemaSequence](../xmlschemasequence/). |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | يضبط القيمة للمكوّن [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) من النوع المركب. |
| [set_Block](./set_block/)(XmlSchemaDerivationMethod) | يضبط السمة **block**. |
| [set_ContentModel](./set_contentmodel/)(const SharedPtr\<XmlSchemaContentModel\>\&) | يضبط [XmlSchemaContentModel](../xmlschemacontentmodel/) ما بعد التجميع لهذا النوع المركب. |
| [set_IsAbstract](./set_isabstract/)(bool) | يضبط المعلومات التي تحدد ما إذا كان عنصر **complexType** يمكن استخدامه في مستند الحالة. |
| [set_IsMixed](./set_ismixed/)(bool) override | يضبط المعلومات التي تحدد ما إذا كان النوع المركب يمتلك نموذج محتوى مختلط (علامات داخل المحتوى). |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | يضبط نوع المُركّب كواحد من الفئات [XmlSchemaGroupRef](../xmlschemagroupref/)، [XmlSchemaChoice](../xmlschemachoice/)، [XmlSchemaAll](../xmlschemaall/)، أو [XmlSchemaSequence](../xmlschemasequence/). |
| [XmlSchemaComplexType](./xmlschemacomplextype/)() | يُنشئ مثالًا جديدًا من الفئة [XmlSchemaComplexType](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaType](../xmlschematype/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
