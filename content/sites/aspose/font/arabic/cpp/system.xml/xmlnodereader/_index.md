---
title: "فئة System::Xml::XmlNodeReader"
linktitle: "XmlNodeReader"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Xml::XmlNodeReader. تمثل قارئًا يوفر وصولًا سريعًا غير مخزن إلى البيانات XML في XmlNode في C++."
type: docs
weight: 2800
url: /ar/cpp/system.xml/xmlnodereader/
---
## XmlNodeReader class


يمثل قارئًا يوفر وصولًا سريعًا غير مخزن إلى بيانات XML في [XmlNode](../xmlnode/).

```cpp
class XmlNodeReader : public System::Xml::XmlReader,
                      public System::Xml::IXmlNamespaceResolver
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Close](./close/)() override | يغيّر [XmlNodeReader::get_ReadState](./get_readstate/) إلى [ReadState::Closed](../readstate/). |
| [get_AttributeCount](./get_attributecount/)() override | يعيد عدد السمات في العقدة الحالية. |
| [get_BaseURI](./get_baseuri/)() override | يعيد عنوان URI الأساسي للعقدة الحالية. |
| [get_CanReadBinaryContent](./get_canreadbinarycontent/)() override | يعيد قيمة تشير إلى ما إذا كان [XmlNodeReader](./) يدعم طرق قراءة المحتوى الثنائي. |
| [get_CanResolveEntity](./get_canresolveentity/)() override | يعيد قيمة تشير إلى ما إذا كان هذا القارئ يستطيع تحليل الكيانات وحلها. |
| [get_Depth](./get_depth/)() override | يعيد عمق العقدة الحالية في مستند XML. |
| [get_EOF](./get_eof/)() override | يعيد قيمة تشير إلى ما إذا كان القارئ في نهاية الدفق. |
| [get_HasAttributes](./get_hasattributes/)() override | يعيد قيمة تشير إلى ما إذا كانت العقدة الحالية تحتوي على أي سمات. |
| [get_HasValue](./get_hasvalue/)() override | يعيد قيمة تشير إلى ما إذا كانت العقدة الحالية يمكن أن تحتوي على قيمة [XmlNodeReader::get_Value](./get_value/). |
| [get_IsDefault](./get_isdefault/)() override | يعيد قيمة تشير إلى ما إذا كانت العقدة الحالية سمة تم إنشاؤها من القيمة الافتراضية المعرفة في تعريف نوع المستند (DTD) أو المخطط. |
| [get_IsEmptyElement](./get_isemptyelement/)() override | يعيد قيمة تشير إلى ما إذا كانت العقدة الحالية عنصرًا فارغًا (على سبيل المثال، **<MyElement/>**). |
| [get_LocalName](./get_localname/)() override | يعيد الاسم المحلي للعقدة الحالية. |
| [get_Name](./get_name/)() override | يعيد الاسم المؤهل للعقدة الحالية. |
| [get_NamespaceURI](./get_namespaceuri/)() override | يعيد عنوان URI للمساحة الاسمية (كما هو معرف في مواصفة مساحة الأسماء W3C) للعقدة التي يقع عليها القارئ. |
| [get_NameTable](./get_nametable/)() override | يعيد [XmlNameTable](../xmlnametable/) المرتبط بهذا التنفيذ. |
| [get_NodeType](./get_nodetype/)() override | يعيد نوع العقدة الحالية. |
| [get_Prefix](./get_prefix/)() override | يعيد بادئة مساحة الاسم المرتبطة بالعقدة الحالية. |
| [get_ReadState](./get_readstate/)() override | يعيد حالة القارئ. |
| [get_SchemaInfo](./get_schemainfo/)() override | يعيد معلومات المخطط التي تم تعيينها للعقدة الحالية. |
| [get_Value](./get_value/)() override | يعيد القيمة النصية للعقدة الحالية. |
| [get_XmlLang](./get_xmllang/)() override | يعيد نطاق **xml:lang** الحالي. |
| [get_XmlSpace](./get_xmlspace/)() override | يعيد نطاق **xml:space** الحالي. |
| [GetAttribute](./getattribute/)(String) override | يعيد قيمة السمة ذات الاسم المحدد. |
| [GetAttribute](./getattribute/)(String, String) override | يعيد قيمة السمة ذات الاسم المحلي المحدد ومسار URI مساحة الاسم. |
| [GetAttribute](./getattribute/)(int32_t) override | يعيد قيمة السمة ذات الفهرس المحدد. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | يحلّ صفة مساحة الاسم في نطاق العنصر الحالي. |
| [MoveToAttribute](./movetoattribute/)(String) override | ينتقل إلى السمة ذات الاسم المحدد. |
| [MoveToAttribute](./movetoattribute/)(String, String) override | ينتقل إلى السمة ذات الاسم المحلي المحدد ومسار URI مساحة الاسم. |
| [MoveToAttribute](./movetoattribute/)(int32_t) override | ينتقل إلى السمة ذات الفهرس المحدد. |
| [MoveToElement](./movetoelement/)() override | ينتقل إلى العنصر الذي يحتوي على عقدة السمة الحالية. |
| [MoveToFirstAttribute](./movetofirstattribute/)() override | ينتقل إلى السمة الأولى. |
| [MoveToNextAttribute](./movetonextattribute/)() override | ينتقل إلى السمة التالية. |
| [Read](./read/)() override | يقرأ العقدة التالية من التدفق. |
| [ReadAttributeValue](./readattributevalue/)() override | يقوم بتحليل قيمة السمة إلى واحد أو أكثر من العقد **[Text](../../system.text/)**، **EntityReference** أو **EndEntity**. |
| [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | يقرأ المحتوى ويعيد بايتات ثنائية مفككة من Base64. |
| [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | يقرأ المحتوى ويعيد بايتات ثنائية مفككة من BinHex. |
| [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | يقرأ العنصر ويفكّ تشفير محتوى Base64. |
| [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | يقرأ العنصر ويفكّ تشفير محتوى BinHex. |
| [ReadString](./readstring/)() override | يقرأ محتويات عنصر أو عقدة نصية كسلسلة. |
| [ResolveEntity](./resolveentity/)() override | يحلّ مرجع الكيان لعقد **EntityReference**. |
| [Skip](./skip/)() override | يتخطى أبناء العقدة الحالية. |
| [XmlNodeReader](./xmlnodereader/)(const SharedPtr\<XmlNode\>\&) | ينشئ مثيلاً من الفئة [XmlNodeReader](./) باستخدام [XmlNode](../xmlnode/) المحدد. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlReader](../xmlreader/)
* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
